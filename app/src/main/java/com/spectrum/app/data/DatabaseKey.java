package com.spectrum.app.data;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DatabaseKey.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/spectrum/app/data/DatabaseKey;", "", "<init>", "()V", "KEYSTORE", "", "KEY_ALIAS", "WRAPPED_FILE", "PASSPHRASE_BYTES", "", "GCM_IV_BYTES", "GCM_TAG_BITS", "FORMAT_VERSION", "", "getOrCreatePassphrase", "", "context", "Landroid/content/Context;", "create", "file", "Ljava/io/File;", "keystoreKey", "Ljavax/crypto/SecretKey;", "wrap", "plaintext", "unwrap", "blob", "TRANSFORMATION", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DatabaseKey {
    public static final int $stable = 0;
    private static final byte FORMAT_VERSION = 1;
    private static final int GCM_IV_BYTES = 12;
    private static final int GCM_TAG_BITS = 128;
    public static final DatabaseKey INSTANCE = new DatabaseKey();
    private static final String KEYSTORE = "AndroidKeyStore";
    private static final String KEY_ALIAS = "spectrum_db_key";
    private static final int PASSPHRASE_BYTES = 32;
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";
    private static final String WRAPPED_FILE = "db_key.bin";

    private DatabaseKey() {
    }

    public final synchronized byte[] getOrCreatePassphrase(Context context) {
        File file;
        Intrinsics.checkNotNullParameter(context, "context");
        file = new File(context.getFilesDir(), WRAPPED_FILE);
        return file.exists() ? unwrap(FilesKt.readBytes(file)) : create(file);
    }

    private final byte[] create(File file) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] passphrase = new byte[32];
        new SecureRandom().nextBytes(passphrase);
        byte[] it = wrap(passphrase);
        FilesKt.writeBytes(file, it);
        return passphrase;
    }

    private final SecretKey keystoreKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore ks = KeyStore.getInstance(KEYSTORE);
        ks.load(null);
        KeyStore.Entry entry = ks.getEntry(KEY_ALIAS, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry == null) {
            KeyGenerator generator = KeyGenerator.getInstance("AES", KEYSTORE);
            KeyGenParameterSpec.Builder $this$keystoreKey_u24lambda_u243 = new KeyGenParameterSpec.Builder(KEY_ALIAS, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
            if (Build.VERSION.SDK_INT >= 28) {
                $this$keystoreKey_u24lambda_u243.setUnlockedDeviceRequired(true);
            }
            KeyGenParameterSpec spec = $this$keystoreKey_u24lambda_u243.build();
            Intrinsics.checkNotNullExpressionValue(spec, "build(...)");
            generator.init(spec);
            SecretKey secretKeyGenerateKey = generator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
            return secretKeyGenerateKey;
        }
        KeyStore.SecretKeyEntry it = secretKeyEntry;
        SecretKey secretKey = it.getSecretKey();
        Intrinsics.checkNotNullExpressionValue(secretKey, "getSecretKey(...)");
        return secretKey;
    }

    private final byte[] wrap(byte[] plaintext) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, keystoreKey());
        byte[] iv = cipher.getIV();
        byte[] ciphertext = cipher.doFinal(plaintext);
        byte[] $this$wrap_u24lambda_u244 = new byte[iv.length + 1 + ciphertext.length];
        $this$wrap_u24lambda_u244[0] = FORMAT_VERSION;
        System.arraycopy(iv, 0, $this$wrap_u24lambda_u244, 1, iv.length);
        System.arraycopy(ciphertext, 0, $this$wrap_u24lambda_u244, iv.length + 1, ciphertext.length);
        return $this$wrap_u24lambda_u244;
    }

    private final byte[] unwrap(byte[] blob) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        boolean z = false;
        if (!(blob.length == 0) && blob[0] == 1) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("formato de chave inválido".toString());
        }
        byte[] iv = ArraysKt.copyOfRange(blob, 1, 13);
        byte[] ciphertext = ArraysKt.copyOfRange(blob, 13, blob.length);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, keystoreKey(), new GCMParameterSpec(128, iv));
        byte[] bArrDoFinal = cipher.doFinal(ciphertext);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }
}

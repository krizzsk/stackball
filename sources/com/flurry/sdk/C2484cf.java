package com.flurry.sdk;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;

/* renamed from: com.flurry.sdk.cf */
public class C2484cf {

    /* renamed from: a */
    private static final String f5810a = C2484cf.class.getSimpleName();

    /* renamed from: b */
    private KeyStore f5811b;

    public C2484cf() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.f5811b = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
                if (!this.f5811b.containsAlias("fl.install.id.sec.key")) {
                    KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance2.init(new KeyGenParameterSpec.Builder("fl.install.id.sec.key", 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS7Padding"}).setRandomizedEncryptionRequired(false).setDigests(new String[]{"SHA-256", "SHA-512"}).build());
                    instance2.generateKey();
                }
            } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
                String str = f5810a;
                C2530db.m5475a(5, str, "Error while generating Key" + e.getMessage(), e);
            }
        }
    }

    /* renamed from: a */
    public final Key mo17671a() {
        KeyStore keyStore;
        if (Build.VERSION.SDK_INT < 23 || (keyStore = this.f5811b) == null) {
            return null;
        }
        try {
            return keyStore.getKey("fl.install.id.sec.key", (char[]) null);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException unused) {
            C2530db.m5474a(6, f5810a, "Error in getting key.");
            return null;
        }
    }
}

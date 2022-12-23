package com.flurry.sdk;

import android.os.Build;
import android.text.TextUtils;
import com.flurry.sdk.C2478cd;
import com.flurry.sdk.C2506cs;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.flurry.sdk.ce */
public class C2482ce {

    /* renamed from: a */
    private static final String f5803a = C2482ce.class.getSimpleName();

    /* renamed from: b */
    private C2484cf f5804b;

    /* renamed from: c */
    private int f5805c;

    /* renamed from: d */
    private byte[] f5806d;

    /* renamed from: e */
    private final C2506cs<byte[]> f5807e;

    /* renamed from: f */
    private C2508ct<C2478cd> f5808f;

    public C2482ce() {
        this.f5804b = null;
        this.f5805c = 0;
        this.f5806d = null;
        this.f5808f = null;
        this.f5808f = new C2508ct<>(m5348b(), "installationNum", 1, new C2592dz<C2478cd>() {
            /* renamed from: a */
            public final C2587dw<C2478cd> mo17575a(int i) {
                return new C2478cd.C2479a();
            }
        });
        this.f5807e = new C2506cs<>(new C2581ds());
        this.f5804b = new C2484cf();
        byte[] a = m5347a(m5349c());
        if (a != null && Build.VERSION.SDK_INT >= 23) {
            C2617el.m5691b(m5348b());
            m5346a(a, C2506cs.C2507a.CRYPTO_ALGO_PADDING_7);
        }
        mo17670a();
    }

    /* renamed from: a */
    public final synchronized byte[] mo17670a() {
        byte[] bArr;
        C2506cs.C2507a aVar;
        bArr = this.f5806d;
        if (bArr == null) {
            if (Build.VERSION.SDK_INT < 23) {
                aVar = C2506cs.C2507a.CRYPTO_ALGO_PADDING_5;
            } else {
                aVar = C2506cs.C2507a.CRYPTO_ALGO_PADDING_7;
            }
            byte[] a = m5347a(m5351e());
            if (a == null) {
                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.ENGLISH);
                byte[] bArr2 = null;
                if (!TextUtils.isEmpty(lowerCase)) {
                    String replaceAll = lowerCase.replaceAll("[^a-f0-9]+", "");
                    if (replaceAll.length() % 2 != 0) {
                        C2530db.m5474a(4, f5803a, "Input string must contain an even number of characters ".concat(String.valueOf(replaceAll)));
                    } else {
                        bArr2 = C2619em.m5707e(replaceAll);
                    }
                }
                m5346a(bArr2, aVar);
                bArr = bArr2;
            } else {
                bArr = a;
            }
            this.f5806d = bArr;
        }
        return bArr;
    }

    /* renamed from: a */
    private boolean m5346a(byte[] bArr, C2506cs.C2507a aVar) {
        C2478cd cdVar;
        try {
            C2617el.m5691b(m5348b());
            byte[] d = m5350d();
            byte[] a = this.f5807e.mo17715a(bArr, m5351e(), new IvParameterSpec(d), aVar);
            if (a != null) {
                cdVar = new C2478cd(a, d, true, aVar.ordinal());
            } else {
                cdVar = new C2478cd(bArr, new byte[0], false, aVar.ordinal());
            }
            this.f5808f.mo17717a(cdVar);
            return true;
        } catch (IOException e) {
            String str = f5803a;
            C2530db.m5475a(5, str, "Error while generating UUID" + e.getMessage(), e);
            return false;
        }
    }

    /* renamed from: a */
    private byte[] m5347a(Key key) {
        try {
            C2478cd a = this.f5808f.mo17716a();
            if (a == null) {
                return null;
            }
            if (!a.f5797a) {
                return a.f5799c;
            }
            byte[] bArr = a.f5798b;
            byte[] bArr2 = a.f5799c;
            C2506cs.C2507a a2 = C2506cs.C2507a.m5412a(a.f5800d);
            if (bArr == null || bArr2 == null) {
                return null;
            }
            return this.f5807e.mo17714a(bArr2, key, new IvParameterSpec(bArr), a2);
        } catch (IOException unused) {
            C2530db.m5474a(5, f5803a, "Error while reading Android Install Id. Deleting file.");
            return null;
        }
    }

    /* renamed from: b */
    private static File m5348b() {
        return new File(C2617el.m5687a().getPath() + File.separator + "installationNum");
    }

    /* renamed from: c */
    private static SecretKey m5349c() {
        String str = C2494ck.m5371a().f5833b;
        String a = C2615ej.m5682a(C2494ck.m5371a().f5832a);
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithSHA256And256BitAES-CBC-BC").generateSecret(new PBEKeySpec(str.toCharArray(), ByteBuffer.allocate(8).putLong(!TextUtils.isEmpty(a) ? C2619em.m5709g(a) : Long.MIN_VALUE).array(), 1000, 256)).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            C2530db.m5475a(4, f5803a, "Error in generate secret key", e);
            return null;
        }
    }

    /* renamed from: e */
    private Key m5351e() {
        if (Build.VERSION.SDK_INT < 23) {
            return m5349c();
        }
        return this.f5804b.mo17671a();
    }

    /* renamed from: d */
    private static byte[] m5350d() {
        try {
            byte[] bArr = new byte[16];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            C2530db.m5475a(4, f5803a, "Error in generating iv", e);
            return null;
        }
    }
}

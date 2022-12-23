package com.inmobi.media;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.MessageDigest;

/* renamed from: com.inmobi.media.ht */
/* compiled from: UidHelper */
public class C5359ht {

    /* renamed from: a */
    private static final String f12277a = C5359ht.class.getSimpleName();

    /* renamed from: b */
    private static C5358hs f12278b;

    /* renamed from: com.inmobi.media.ht$a */
    /* compiled from: UidHelper */
    static class C5360a {

        /* renamed from: a */
        static final C5359ht f12279a = new C5359ht((byte) 0);
    }

    /* synthetic */ C5359ht(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5359ht m12386a() {
        return C5360a.f12279a;
    }

    private C5359ht() {
    }

    /* renamed from: c */
    public void mo40719c() {
        try {
            C5358hs e = mo40720e();
            if (e != null) {
                String b = e.mo40717b();
                if (b != null) {
                    C5327gw.m12263a((byte) 2, f12277a, "Publisher device Id is ".concat(String.valueOf(b)));
                    return;
                }
                return;
            }
            String d = m12388d();
            String str = f12277a;
            C5327gw.m12263a((byte) 2, str, "Publisher device Id is " + m12387a(d, "SHA-1"));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static String m12387a(String str, String str2) {
        if (str == null) {
            return "TEST_EMULATOR";
        }
        try {
            if ("".equals(str.trim())) {
                return "TEST_EMULATOR";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    static String m12388d() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return "";
        }
        try {
            String string = Settings.Secure.getString(c.getContentResolver(), "android_id");
            return string == null ? Settings.System.getString(c.getContentResolver(), "android_id") : string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public C5358hs mo40720e() {
        return f12278b;
    }

    /* renamed from: g */
    private static boolean m12389g() {
        try {
            AdvertisingIdClient.class.getName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: f */
    public Boolean mo40721f() {
        C5358hs e = m12386a().mo40720e();
        if (e == null) {
            return null;
        }
        return e.mo40716a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(2:3|(1:5))|6|7|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40718b() {
        /*
            r3 = this;
            android.content.Context r0 = com.inmobi.media.C5314go.m12203c()     // Catch:{ Exception -> 0x002b }
            if (r0 == 0) goto L_0x002b
            com.inmobi.media.hs r1 = new com.inmobi.media.hs     // Catch:{ Exception -> 0x002b }
            r1.<init>()     // Catch:{ Exception -> 0x002b }
            f12278b = r1     // Catch:{ Exception -> 0x002b }
            boolean r1 = m12389g()     // Catch:{ Exception -> 0x002b }
            if (r1 == 0) goto L_0x002b
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ Exception -> 0x002b }
            com.inmobi.media.hs r1 = f12278b     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = r0.getId()     // Catch:{ Exception -> 0x002b }
            r1.f12275a = r2     // Catch:{ Exception -> 0x002b }
            com.inmobi.media.hs r1 = f12278b     // Catch:{ Exception -> 0x002b }
            boolean r0 = r0.isLimitAdTrackingEnabled()     // Catch:{ Exception -> 0x002b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x002b }
            r1.f12276b = r0     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            r3.mo40719c()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5359ht.mo40718b():void");
    }
}

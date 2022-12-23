package com.inmobi.media;

import android.util.Base64;

/* renamed from: com.inmobi.media.ck */
/* compiled from: BidManager */
public final class C5074ck {

    /* renamed from: c */
    private static final String f11612c = C5074ck.class.getSimpleName();

    /* renamed from: a */
    public byte[] f11613a = C5339hc.m12316a(16);

    /* renamed from: b */
    public final byte[] f11614b = C5339hc.m12315a();

    /* renamed from: d */
    private final byte[] f11615d = C5339hc.m12316a(8);

    /* renamed from: a */
    public final String mo40329a(String str, String str2) {
        try {
            byte[] a = C5339hc.m12317a(this.f11614b);
            return new String(Base64.encode(C5339hc.m12318a(C5339hc.m12319a(C5339hc.m12319a(a, C5339hc.m12317a(this.f11615d)), C5339hc.m12317a(this.f11613a)), str2, str), 8));
        } catch (Exception unused) {
            return null;
        }
    }
}

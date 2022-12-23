package com.ogury.p245ed.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ogury.ed.internal.ej */
public enum C8193ej {
    INTERSTITIAL("interstitial", IronSourceConstants.INTERSTITIAL_AD_UNIT),
    OPTIN_VIDEO("optin_video", "Optin Video"),
    OVERLAY_THUMBNAIL("overlay_thumbnail", "Thumbnail"),
    SMALL_BANNER("banner_320x50", "Small Banner (320x50)"),
    MEDIUM_RECTANGLE("medium_rectangle", "MPU (300x250)");
    

    /* renamed from: a */
    public static final C8194a f21217a = null;

    /* renamed from: g */
    private final String f21224g;

    /* renamed from: h */
    private final String f21225h;

    private C8193ej(String str, String str2) {
        this.f21224g = str;
        this.f21225h = str2;
    }

    /* renamed from: a */
    public final String mo53403a() {
        return this.f21224g;
    }

    /* renamed from: b */
    public final String mo53404b() {
        return this.f21225h;
    }

    static {
        f21217a = new C8194a((byte) 0);
    }

    /* renamed from: c */
    public final boolean mo53405c() {
        return this == INTERSTITIAL || this == OPTIN_VIDEO;
    }

    /* renamed from: d */
    public final boolean mo53406d() {
        return this == OVERLAY_THUMBNAIL;
    }

    /* renamed from: e */
    public final boolean mo53407e() {
        return this == SMALL_BANNER || this == MEDIUM_RECTANGLE;
    }

    /* renamed from: com.ogury.ed.internal.ej$a */
    public static final class C8194a {
        public /* synthetic */ C8194a(byte b) {
            this();
        }

        private C8194a() {
        }

        /* renamed from: a */
        public static String m22912a(String str) {
            C8467mq.m23881b(str, "adUnitType");
            C8193ej[] values = C8193ej.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C8193ej ejVar = values[i];
                i++;
                if (C8467mq.m23880a((Object) ejVar.mo53403a(), (Object) str)) {
                    return ejVar.mo53404b();
                }
            }
            return str;
        }
    }
}

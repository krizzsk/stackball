package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.xe */
public final class C15164xe {

    /* renamed from: b */
    public static final C15166b f42524b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Comparator<String> f42525c = new C15165a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<String, C15164xe> f42526d = new LinkedHashMap();

    /* renamed from: e */
    public static final C15164xe f42527e;

    /* renamed from: f */
    public static final C15164xe f42528f;

    /* renamed from: g */
    public static final C15164xe f42529g;

    /* renamed from: h */
    public static final C15164xe f42530h;

    /* renamed from: i */
    public static final C15164xe f42531i;

    /* renamed from: j */
    public static final C15164xe f42532j;

    /* renamed from: k */
    public static final C15164xe f42533k;

    /* renamed from: l */
    public static final C15164xe f42534l;

    /* renamed from: m */
    public static final C15164xe f42535m;

    /* renamed from: n */
    public static final C15164xe f42536n;

    /* renamed from: o */
    public static final C15164xe f42537o;

    /* renamed from: p */
    public static final C15164xe f42538p;

    /* renamed from: q */
    public static final C15164xe f42539q;

    /* renamed from: r */
    public static final C15164xe f42540r;

    /* renamed from: s */
    public static final C15164xe f42541s;

    /* renamed from: t */
    public static final C15164xe f42542t;

    /* renamed from: a */
    private final String f42543a;

    /* renamed from: com.yandex.mobile.ads.impl.xe$a */
    public static final class C15165a implements Comparator<String> {
        C15165a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r0 = "a"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "b"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.length()
                int r1 = r6.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L_0x001b:
                if (r1 >= r0) goto L_0x0031
                char r2 = r5.charAt(r1)
                char r3 = r6.charAt(r1)
                if (r2 == r3) goto L_0x002e
                int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r2, (int) r3)
                if (r5 >= 0) goto L_0x003f
                goto L_0x003d
            L_0x002e:
                int r1 = r1 + 1
                goto L_0x001b
            L_0x0031:
                int r5 = r5.length()
                int r6 = r6.length()
                if (r5 == r6) goto L_0x0041
                if (r5 >= r6) goto L_0x003f
            L_0x003d:
                r5 = -1
                goto L_0x0042
            L_0x003f:
                r5 = 1
                goto L_0x0042
            L_0x0041:
                r5 = 0
            L_0x0042:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15164xe.C15165a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    static {
        C15166b bVar = new C15166b((DefaultConstructorMarker) null);
        f42524b = bVar;
        C15166b.m44028a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        C15166b.m44028a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        C15166b.m44028a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        C15166b.m44028a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        C15166b.m44028a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        C15166b.m44028a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        C15166b.m44028a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f42527e = C15166b.m44028a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        C15166b.m44028a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        C15166b.m44028a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        C15166b.m44028a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        C15166b.m44028a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        C15166b.m44028a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        C15166b.m44028a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        C15166b.m44028a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        C15166b.m44028a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        C15166b.m44028a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        C15166b.m44028a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        C15166b.m44028a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        C15166b.m44028a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        C15166b.m44028a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        C15166b.m44028a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        C15166b.m44028a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        C15166b.m44028a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C15166b.m44028a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        C15166b.m44028a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        C15166b.m44028a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        C15166b.m44028a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        C15166b.m44028a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f42528f = C15166b.m44028a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        C15166b.m44028a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f42529g = C15166b.m44028a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        C15166b.m44028a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        C15166b.m44028a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        C15166b.m44028a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        C15166b.m44028a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        C15166b.m44028a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        C15166b.m44028a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        C15166b.m44028a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        C15166b.m44028a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        C15166b.m44028a(bVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        C15166b.m44028a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        C15166b.m44028a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
        C15166b.m44028a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        C15166b.m44028a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        f42530h = C15166b.m44028a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f42531i = C15166b.m44028a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        C15166b.m44028a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        C15166b.m44028a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        C15166b.m44028a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        C15166b.m44028a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        C15166b.m44028a(bVar, "TLS_FALLBACK_SCSV", 22016);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f42532j = C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f42533k = C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        C15166b.m44028a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        C15166b.m44028a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        C15166b.m44028a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        C15166b.m44028a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        C15166b.m44028a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f42534l = C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f42535m = C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        C15166b.m44028a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f42536n = C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f42537o = C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        C15166b.m44028a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        C15166b.m44028a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        C15166b.m44028a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f42538p = C15166b.m44028a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f42539q = C15166b.m44028a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        C15166b.m44028a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        C15166b.m44028a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f42540r = C15166b.m44028a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        f42541s = C15166b.m44028a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        f42542t = C15166b.m44028a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        C15166b.m44028a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        C15166b.m44028a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private C15164xe(String str) {
        this.f42543a = str;
    }

    public /* synthetic */ C15164xe(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: c */
    public final String mo70890c() {
        return this.f42543a;
    }

    public String toString() {
        return this.f42543a;
    }

    /* renamed from: com.yandex.mobile.ads.impl.xe$b */
    public static final class C15166b {
        private C15166b() {
        }

        public /* synthetic */ C15166b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final synchronized C15164xe mo70893a(String str) {
            C15164xe xeVar;
            String str2;
            Intrinsics.checkNotNullParameter(str, "javaName");
            xeVar = (C15164xe) C15164xe.f42526d.get(str);
            if (xeVar == null) {
                Map a = C15164xe.f42526d;
                if (StringsKt.startsWith$default(str, "TLS_", false, 2, (Object) null)) {
                    if (str != null) {
                        String substring = str.substring(4);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        str2 = Intrinsics.stringPlus("SSL_", substring);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (!StringsKt.startsWith$default(str, "SSL_", false, 2, (Object) null)) {
                    str2 = str;
                } else if (str != null) {
                    String substring2 = str.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                    str2 = Intrinsics.stringPlus("TLS_", substring2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                xeVar = (C15164xe) a.get(str2);
                if (xeVar == null) {
                    xeVar = new C15164xe(str, (DefaultConstructorMarker) null);
                }
                C15164xe.f42526d.put(str, xeVar);
            }
            return xeVar;
        }

        /* renamed from: a */
        public static final C15164xe m44028a(C15166b bVar, String str, int i) {
            C15164xe xeVar = new C15164xe(str, (DefaultConstructorMarker) null);
            C15164xe.f42526d.put(str, xeVar);
            return xeVar;
        }
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15501j;
import com.yandex.mobile.ads.nativeads.C15550v;

/* renamed from: com.yandex.mobile.ads.impl.k */
class C13663k {

    /* renamed from: a */
    private final C14645t1 f35886a;

    /* renamed from: b */
    private final AdResponse f35887b;

    /* renamed from: c */
    private final k41 f35888c;

    /* renamed from: d */
    private final fx0 f35889d;

    /* renamed from: e */
    private final C15501j f35890e;

    /* renamed from: f */
    private final C15550v f35891f;

    /* renamed from: g */
    private final h41.C13275a f35892g;

    C13663k(C14645t1 t1Var, AdResponse adResponse, k41 k41, fx0 fx0, C15550v vVar, C15501j jVar, h41.C13275a aVar) {
        this.f35886a = t1Var;
        this.f35887b = adResponse;
        this.f35888c = k41;
        this.f35889d = fx0;
        this.f35891f = vVar;
        this.f35890e = jVar;
        this.f35892g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.C13462j mo68111a(android.content.Context r10, com.yandex.mobile.ads.impl.C13370i r11) {
        /*
            r9 = this;
            java.lang.String r11 = r11.mo67705a()
            com.yandex.mobile.ads.impl.fx0 r0 = r9.f35889d
            com.yandex.mobile.ads.impl.k41 r1 = r9.f35888c
            com.yandex.mobile.ads.impl.ex0 r0 = r0.mo67096a(r1)
            r11.getClass()
            int r1 = r11.hashCode()
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1895850168: goto L_0x0053;
                case -1422015845: goto L_0x0048;
                case -342500282: goto L_0x003d;
                case -191501435: goto L_0x0032;
                case 94756344: goto L_0x0027;
                case 629233382: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x005e
        L_0x001c:
            java.lang.String r1 = "deeplink"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0025
            goto L_0x005e
        L_0x0025:
            r11 = 5
            goto L_0x005f
        L_0x0027:
            java.lang.String r1 = "close"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0030
            goto L_0x005e
        L_0x0030:
            r11 = 4
            goto L_0x005f
        L_0x0032:
            java.lang.String r1 = "feedback"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x003b
            goto L_0x005e
        L_0x003b:
            r11 = 3
            goto L_0x005f
        L_0x003d:
            java.lang.String r1 = "shortcut"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0046
            goto L_0x005e
        L_0x0046:
            r11 = 2
            goto L_0x005f
        L_0x0048:
            java.lang.String r1 = "adtune"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0051
            goto L_0x005e
        L_0x0051:
            r11 = 1
            goto L_0x005f
        L_0x0053:
            java.lang.String r1 = "social_action"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r11 = 0
            goto L_0x005f
        L_0x005e:
            r11 = -1
        L_0x005f:
            if (r11 == 0) goto L_0x00c0
            if (r11 == r6) goto L_0x00aa
            if (r11 == r5) goto L_0x009b
            if (r11 == r4) goto L_0x0087
            if (r11 == r3) goto L_0x007d
            if (r11 == r2) goto L_0x006e
            r10 = 0
            goto L_0x00e8
        L_0x006e:
            com.yandex.mobile.ads.impl.uj r10 = new com.yandex.mobile.ads.impl.uj
            com.yandex.mobile.ads.impl.k41 r11 = r9.f35888c
            com.yandex.mobile.ads.nativeads.j r1 = r9.f35890e
            r10.<init>(r11, r0, r1)
            com.yandex.mobile.ads.impl.sj r11 = new com.yandex.mobile.ads.impl.sj
            r11.<init>(r10)
            goto L_0x0099
        L_0x007d:
            com.yandex.mobile.ads.impl.lf r10 = new com.yandex.mobile.ads.impl.lf
            com.yandex.mobile.ads.impl.k41 r11 = r9.f35888c
            com.yandex.mobile.ads.nativeads.j r0 = r9.f35890e
            r10.<init>(r11, r0)
            goto L_0x00e8
        L_0x0087:
            com.yandex.mobile.ads.impl.q60 r10 = new com.yandex.mobile.ads.impl.q60
            com.yandex.mobile.ads.impl.t1 r11 = r9.f35886a
            com.yandex.mobile.ads.impl.k41 r0 = r9.f35888c
            com.yandex.mobile.ads.nativeads.v r1 = r9.f35891f
            com.yandex.mobile.ads.nativeads.j r2 = r9.f35890e
            r10.<init>(r11, r0, r1, r2)
            com.yandex.mobile.ads.impl.j60 r11 = new com.yandex.mobile.ads.impl.j60
            r11.<init>(r10)
        L_0x0099:
            r10 = r11
            goto L_0x00e8
        L_0x009b:
            com.yandex.mobile.ads.impl.j81 r11 = new com.yandex.mobile.ads.impl.j81
            com.yandex.mobile.ads.impl.k41 r0 = r9.f35888c
            com.yandex.mobile.ads.nativeads.v r1 = r9.f35891f
            r11.<init>(r10, r0, r1)
            com.yandex.mobile.ads.impl.g81 r10 = new com.yandex.mobile.ads.impl.g81
            r10.<init>(r11)
            goto L_0x00e8
        L_0x00aa:
            com.yandex.mobile.ads.impl.g6 r11 = new com.yandex.mobile.ads.impl.g6
            com.yandex.mobile.ads.nativeads.j r1 = r9.f35890e
            r11.<init>(r1, r0)
            com.yandex.mobile.ads.impl.a5 r0 = new com.yandex.mobile.ads.impl.a5
            com.yandex.mobile.ads.impl.t1 r1 = r9.f35886a
            r0.<init>(r10, r1)
            com.yandex.mobile.ads.impl.z5 r10 = new com.yandex.mobile.ads.impl.z5
            com.yandex.mobile.ads.impl.k41 r1 = r9.f35888c
            r10.<init>(r11, r0, r1)
            goto L_0x00e8
        L_0x00c0:
            com.yandex.mobile.ads.impl.l81 r11 = new com.yandex.mobile.ads.impl.l81
            com.yandex.mobile.ads.impl.t1 r0 = r9.f35886a
            com.yandex.mobile.ads.base.AdResponse r1 = r9.f35887b
            com.yandex.mobile.ads.impl.h41$a r2 = r9.f35892g
            r11.<init>(r10, r0, r1, r2)
            com.yandex.mobile.ads.impl.yq0 r5 = new com.yandex.mobile.ads.impl.yq0
            com.yandex.mobile.ads.impl.t1 r0 = r9.f35886a
            com.yandex.mobile.ads.base.AdResponse r1 = r9.f35887b
            r5.<init>(r10, r0, r1)
            com.yandex.mobile.ads.impl.na1 r10 = new com.yandex.mobile.ads.impl.na1
            com.yandex.mobile.ads.impl.t1 r4 = r9.f35886a
            com.yandex.mobile.ads.nativeads.j r6 = r9.f35890e
            com.yandex.mobile.ads.nativeads.v r7 = r9.f35891f
            com.yandex.mobile.ads.impl.fx0 r8 = r9.f35889d
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            com.yandex.mobile.ads.impl.fa1 r0 = new com.yandex.mobile.ads.impl.fa1
            r0.<init>(r11, r10)
            r10 = r0
        L_0x00e8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13663k.mo68111a(android.content.Context, com.yandex.mobile.ads.impl.i):com.yandex.mobile.ads.impl.j");
    }
}

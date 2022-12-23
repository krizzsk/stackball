package com.flurry.sdk;

import com.flurry.sdk.C2612eh;

/* renamed from: com.flurry.sdk.bk */
public class C2410bk extends C2558do implements C2612eh.C2613a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f5575e = C2410bk.class.getSimpleName();

    /* renamed from: f */
    private String f5576f;

    /* renamed from: g */
    private boolean f5577g;

    public C2410bk() {
        this((byte) 0);
    }

    private C2410bk(byte b) {
        super("Analytics", C2410bk.class.getSimpleName());
        this.f6022b = "AnalyticsData_";
        C2611eg a = C2611eg.m5674a();
        this.f5577g = ((Boolean) a.mo17819a("UseHttps")).booleanValue();
        a.mo17820a("UseHttps", (C2612eh.C2613a) this);
        String str = f5575e;
        C2530db.m5474a(4, str, "initSettings, UseHttps = " + this.f5577g);
        String str2 = (String) a.mo17819a("ReportUrl");
        a.mo17820a("ReportUrl", (C2612eh.C2613a) this);
        m5191a(str2);
        C2530db.m5474a(4, f5575e, "initSettings, ReportUrl = ".concat(String.valueOf(str2)));
        mo17774b();
    }

    /* renamed from: a */
    private void m5191a(String str) {
        if (str != null && !str.endsWith(".do")) {
            C2530db.m5474a(5, f5575e, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        this.f5576f = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17569a(java.lang.String r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -239660092(0xfffffffff1b713c4, float:-1.8131089E30)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1650629499(0x62629b7b, float:1.0450419E21)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "ReportUrl"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "UseHttps"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            r0 = 4
            if (r4 == 0) goto L_0x0048
            if (r4 == r2) goto L_0x0033
            r4 = 6
            java.lang.String r5 = f5575e
            java.lang.String r0 = "onSettingUpdate internal error!"
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r5, (java.lang.String) r0)
            return
        L_0x0033:
            java.lang.String r5 = (java.lang.String) r5
            r3.m5191a((java.lang.String) r5)
            java.lang.String r4 = f5575e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "onSettingUpdate, ReportUrl = "
            java.lang.String r5 = r1.concat(r5)
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r4, (java.lang.String) r5)
            return
        L_0x0048:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r3.f5577g = r4
            java.lang.String r4 = f5575e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "onSettingUpdate, UseHttps = "
            r5.<init>(r1)
            boolean r1 = r3.f5577g
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r4, (java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2410bk.mo17569a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo17624a(String str, String str2, final int i) {
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                if (i == 200) {
                    C2669x.m5819a();
                    C2426bo b = C2669x.m5822b();
                    if (b != null) {
                        b.f5655j = true;
                    }
                }
            }
        });
        super.mo17624a(str, str2, i);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [byte[], RequestObjectType] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17625a(byte[] r7, final java.lang.String r8, final java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f5576f
            if (r0 == 0) goto L_0x0005
            goto L_0x000e
        L_0x0005:
            boolean r0 = r6.f5577g
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "https://data.flurry.com/aap.do"
            goto L_0x000e
        L_0x000c:
            java.lang.String r0 = "http://data.flurry.com/aap.do"
        L_0x000e:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.Long.toString(r1)
            r2 = 4
            java.lang.String r3 = f5575e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "FlurryDataSender: id = "
            r4.<init>(r5)
            r4.append(r8)
            java.lang.String r5 = " to "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " at "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r3, (java.lang.String) r4)
            com.flurry.sdk.di r2 = new com.flurry.sdk.di
            r2.<init>()
            r2.f5970g = r0
            r0 = 100000(0x186a0, float:1.4013E-40)
            r2.f6169u = r0
            com.flurry.sdk.dk$a r0 = com.flurry.sdk.C2542dk.C2545a.kPost
            r2.f5971h = r0
            java.lang.String r0 = "Content-Type"
            java.lang.String r3 = "application/octet-stream"
            r2.mo17759a(r0, r3)
            java.lang.String r0 = "X-Flurry-Sdk-Clock"
            r2.mo17759a(r0, r1)
            com.flurry.sdk.ds r0 = new com.flurry.sdk.ds
            r0.<init>()
            r2.f5955c = r0
            r2.f5954b = r7
            com.flurry.sdk.bk$1 r7 = new com.flurry.sdk.bk$1
            r7.<init>(r8, r9)
            r2.f5953a = r7
            com.flurry.sdk.cg r7 = com.flurry.sdk.C2485cg.m5355a()
            r7.mo17728a((java.lang.Object) r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2410bk.mo17625a(byte[], java.lang.String, java.lang.String):void");
    }
}

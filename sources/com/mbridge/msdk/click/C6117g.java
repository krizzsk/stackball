package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.C6108e;
import com.mbridge.msdk.click.C6110f;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import com.mbridge.msdk.foundation.same.p170e.C6228b;
import com.mbridge.msdk.foundation.tools.C6364t;
import java.util.concurrent.Semaphore;

/* renamed from: com.mbridge.msdk.click.g */
/* compiled from: WebViewSpiderLoader */
public final class C6117g extends C6106c implements C6225a.C6227b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6107d f15107a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CommonJumpLoader.JumpLoaderResult f15108b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f15109c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f15110d;

    /* renamed from: e */
    private Context f15111e;

    /* renamed from: f */
    private C6228b f15112f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6108e.C6109a f15113g;

    /* renamed from: h */
    private Handler f15114h = new Handler(Looper.getMainLooper());

    public C6117g(Context context) {
        this.f15111e = context;
        this.f15112f = new C6228b(context, 2);
    }

    /* renamed from: a */
    public final void mo42874a(String str, C6107d dVar, boolean z, String str2, String str3, CampaignEx campaignEx, boolean z2, boolean z3) {
        this.f15107a = dVar;
        this.f15110d = z;
        this.f15112f.mo43808a(new C6119a(this.f15111e, str, str2, str3, campaignEx, z2, z3), this);
    }

    /* renamed from: a */
    public final void mo42810a() {
        this.f15109c = false;
    }

    /* renamed from: com.mbridge.msdk.click.g$a */
    /* compiled from: WebViewSpiderLoader */
    private class C6119a extends C6225a {

        /* renamed from: e */
        private final Semaphore f15117e = new Semaphore(0);

        /* renamed from: f */
        private final Context f15118f;

        /* renamed from: g */
        private String f15119g;

        /* renamed from: h */
        private String f15120h;

        /* renamed from: i */
        private String f15121i;

        /* renamed from: j */
        private CampaignEx f15122j;

        /* renamed from: k */
        private boolean f15123k;

        /* renamed from: l */
        private boolean f15124l;

        /* renamed from: m */
        private C6110f.C6116a f15125m = new C6110f.C6116a() {
            /* renamed from: c */
            public final boolean mo42872c(String str) {
                return false;
            }

            /* renamed from: a */
            public final boolean mo42870a(String str) {
                boolean a = C6119a.this.m15283a(str);
                if (a) {
                    m15287a();
                }
                return a;
            }

            /* renamed from: b */
            public final boolean mo42871b(String str) {
                boolean a = C6119a.this.m15283a(str);
                if (a) {
                    m15287a();
                }
                return a;
            }

            /* renamed from: a */
            public final void mo42869a(String str, boolean z, String str2) {
                boolean unused = C6119a.this.m15283a(str);
                C6117g.this.f15108b.setContent(str2);
                m15287a();
            }

            /* renamed from: a */
            private void m15287a() {
                synchronized (C6117g.this) {
                    C6117g.this.f15108b.setSuccess(true);
                    C6119a.this.f15117e.release();
                }
            }

            /* renamed from: a */
            public final void mo42868a(int i, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    C6117g.this.f15108b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    C6117g.this.f15108b.setContent(str3);
                }
                boolean unused = C6119a.this.m15283a(str);
                m15287a();
            }
        };

        /* renamed from: b */
        public final void mo42877b() {
        }

        public C6119a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z, boolean z2) {
            this.f15118f = context;
            this.f15119g = str;
            this.f15120h = str2;
            this.f15121i = str3;
            this.f15122j = campaignEx;
            this.f15123k = z;
            this.f15124l = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0196 A[EDGE_INSN: B:77:0x0196->B:74:0x0196 ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult m15280a(java.lang.String r11, boolean r12, boolean r13, com.mbridge.msdk.foundation.entity.CampaignEx r14) {
            /*
                r10 = this;
                java.lang.String r0 = ""
                com.mbridge.msdk.click.g r1 = com.mbridge.msdk.click.C6117g.this
                boolean r1 = r1.f15110d
                if (r1 == 0) goto L_0x0025
                android.content.Context r1 = r10.f15118f
                java.lang.String r1 = com.mbridge.msdk.p158b.C6072a.m14999a(r1, r11)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L_0x0025
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r11)
                r2.append(r1)
                java.lang.String r11 = r2.toString()
            L_0x0025:
                com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r1 = new com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult
                r1.<init>()
                com.mbridge.msdk.click.e r2 = new com.mbridge.msdk.click.e
                r2.<init>()
                boolean r3 = r10.m15284b(r11)     // Catch:{ Exception -> 0x0046 }
                if (r3 != 0) goto L_0x0044
                java.net.URI r3 = java.net.URI.create(r11)     // Catch:{ Exception -> 0x0046 }
                java.lang.String r4 = r3.getScheme()     // Catch:{ Exception -> 0x0046 }
                java.lang.String r0 = r3.getHost()     // Catch:{ Exception -> 0x0042 }
                goto L_0x004b
            L_0x0042:
                r3 = move-exception
                goto L_0x0048
            L_0x0044:
                r3 = r0
                goto L_0x004d
            L_0x0046:
                r3 = move-exception
                r4 = r0
            L_0x0048:
                r3.printStackTrace()
            L_0x004b:
                r3 = r0
                r0 = r4
            L_0x004d:
                r4 = 0
                r5 = 0
            L_0x004f:
                r6 = 10
                if (r5 >= r6) goto L_0x0196
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                boolean r6 = r6.f15109c
                r7 = 0
                if (r6 != 0) goto L_0x005d
                return r7
            L_0x005d:
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r8 = r2.mo42851a(r11, r12, r13, r14)
                com.mbridge.msdk.click.C6108e.C6109a unused = r6.f15113g = r8
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r6 = r6.f15113g
                if (r6 != 0) goto L_0x0076
                r1.setUrl(r11)
                r1.setSuccess(r4)
                goto L_0x0196
            L_0x0076:
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r6 = r6.f15113g
                java.lang.String r6 = r6.f15076h
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                r8 = 1
                if (r6 != 0) goto L_0x00a8
                r1.setUrl(r11)
                com.mbridge.msdk.click.g r11 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r11 = r11.f15113g
                java.lang.String r11 = r11.f15076h
                r1.setExceptionMsg(r11)
                r1.setType(r8)
                com.mbridge.msdk.click.g r11 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r11 = r11.f15113g
                java.lang.String r11 = r11.mo42852a()
                r1.setHeader(r11)
                r1.setSuccess(r4)
                goto L_0x0196
            L_0x00a8:
                r1.setSuccess(r8)
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r6 = r6.f15113g
                int r6 = r6.f15074f
                r9 = 301(0x12d, float:4.22E-43)
                if (r6 == r9) goto L_0x00c2
                r9 = 302(0x12e, float:4.23E-43)
                if (r6 == r9) goto L_0x00c2
                r9 = 307(0x133, float:4.3E-43)
                if (r6 != r9) goto L_0x00c0
                goto L_0x00c2
            L_0x00c0:
                r6 = 0
                goto L_0x00c3
            L_0x00c2:
                r6 = 1
            L_0x00c3:
                if (r6 == 0) goto L_0x016d
                r1.setIs302Jump(r8)
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r6 = r6.f15113g
                java.lang.String r6 = r6.f15069a
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x00de
                r1.setjumpDone(r8)
                r1.setUrl(r11)
                goto L_0x0196
            L_0x00de:
                com.mbridge.msdk.click.g r11 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r11 = r11.f15113g
                java.lang.String r11 = r11.f15069a
                boolean r6 = r10.m15284b(r11)
                if (r6 == 0) goto L_0x0122
                java.lang.String r6 = "/"
                boolean r6 = r11.startsWith(r6)
                if (r6 == 0) goto L_0x011a
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                if (r6 != 0) goto L_0x011a
                boolean r6 = android.text.TextUtils.isEmpty(r3)
                if (r6 != 0) goto L_0x011a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                java.lang.String r0 = "://"
                r6.append(r0)
                r6.append(r3)
                r6.append(r11)
                java.lang.String r11 = r6.toString()
                r0 = r7
                r3 = r0
                goto L_0x0139
            L_0x011a:
                r1.setjumpDone(r8)
                r1.setUrl(r11)
                goto L_0x0196
            L_0x0122:
                boolean r6 = r10.m15284b(r11)
                if (r6 != 0) goto L_0x0139
                java.net.URI r6 = java.net.URI.create(r11)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r0 = r6.getScheme()     // Catch:{ Exception -> 0x0135 }
                java.lang.String r3 = r6.getHost()     // Catch:{ Exception -> 0x0135 }
                goto L_0x0139
            L_0x0135:
                r6 = move-exception
                r6.printStackTrace()
            L_0x0139:
                boolean r6 = com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16180a((java.lang.String) r11)
                if (r6 == 0) goto L_0x0146
                r1.setjumpDone(r8)
                r1.setUrl(r11)
                goto L_0x0196
            L_0x0146:
                com.mbridge.msdk.click.g r6 = com.mbridge.msdk.click.C6117g.this
                boolean r6 = r6.f15110d
                if (r6 == 0) goto L_0x0169
                android.content.Context r6 = r10.f15118f
                java.lang.String r6 = com.mbridge.msdk.p158b.C6072a.m14999a(r6, r11)
                boolean r7 = android.text.TextUtils.isEmpty(r6)
                if (r7 != 0) goto L_0x0169
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r11)
                r7.append(r6)
                java.lang.String r11 = r7.toString()
            L_0x0169:
                int r5 = r5 + 1
                goto L_0x004f
            L_0x016d:
                com.mbridge.msdk.click.g r12 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r12 = r12.f15113g
                int r12 = r12.f15074f
                r13 = 200(0xc8, float:2.8E-43)
                if (r12 != r13) goto L_0x017b
                r12 = 1
                goto L_0x017c
            L_0x017b:
                r12 = 0
            L_0x017c:
                if (r12 == 0) goto L_0x0190
                r1.setjumpDone(r8)
                r1.setUrl(r11)
                com.mbridge.msdk.click.g r11 = com.mbridge.msdk.click.C6117g.this
                com.mbridge.msdk.click.e$a r11 = r11.f15113g
                java.lang.String r11 = r11.f15075g
                r1.setContent(r11)
                goto L_0x0196
            L_0x0190:
                r1.setjumpDone(r4)
                r1.setUrl(r11)
            L_0x0196:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6117g.C6119a.m15280a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m15283a(String str) {
            CampaignEx campaignEx = this.f15122j;
            if (campaignEx != null) {
                campaignEx.getLinkType();
            }
            if (C6364t.C6365a.m16180a(str)) {
                C6117g.this.f15108b.setCode(1);
                C6117g.this.f15108b.setUrl(str);
                C6117g.this.f15108b.setjumpDone(true);
                return true;
            }
            C6117g.this.f15108b.setCode(2);
            C6117g.this.f15108b.setUrl(str);
            return false;
        }

        /* renamed from: b */
        private boolean m15284b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* renamed from: a */
        public final void mo42876a() {
            if (C6117g.this.f15107a != null) {
                C6117g.this.f15107a.mo42844a((Object) null);
            }
            CommonJumpLoader.JumpLoaderResult unused = C6117g.this.f15108b = new CommonJumpLoader.JumpLoaderResult();
            C6117g.this.f15108b.setUrl(this.f15119g);
            CommonJumpLoader.JumpLoaderResult unused2 = C6117g.this.f15108b = m15280a(this.f15119g, this.f15123k, this.f15124l, this.f15122j);
            if (!TextUtils.isEmpty(C6117g.this.f15108b.getExceptionMsg())) {
                C6117g.this.f15108b.setSuccess(true);
            }
            if (C6117g.this.f15109c && C6117g.this.f15108b.isSuccess()) {
                if (C6117g.this.f15113g != null) {
                    C6117g.this.f15108b.setStatusCode(C6117g.this.f15113g.f15074f);
                }
                if (C6364t.C6365a.m16180a(C6117g.this.f15108b.getUrl()) || 200 != C6117g.this.f15113g.f15074f || TextUtils.isEmpty(C6117g.this.f15108b.getContent()) || C6117g.this.f15108b.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                    if (C6117g.this.f15113g != null) {
                        C6117g.this.f15108b.setType(1);
                        C6117g.this.f15108b.setExceptionMsg(C6117g.this.f15113g.f15076h);
                        C6117g.this.f15108b.setStatusCode(C6117g.this.f15113g.f15074f);
                        C6117g.this.f15108b.setHeader(C6117g.this.f15113g.mo42852a());
                        C6117g.this.f15108b.setContent(C6117g.this.f15113g.f15075g);
                    }
                    m15283a(C6117g.this.f15108b.getUrl());
                    return;
                }
                C6117g.this.f15108b.setType(2);
                if (!TextUtils.isEmpty(C6117g.this.f15108b.getContent())) {
                    new C6110f().mo42855a(this.f15120h, this.f15121i, this.f15118f, C6117g.this.f15108b.getUrl(), C6117g.this.f15108b.getContent(), this.f15125m);
                } else {
                    try {
                        new C6110f().mo42854a(this.f15120h, this.f15121i, this.f15118f, C6117g.this.f15108b.getUrl(), this.f15125m);
                    } catch (Exception unused3) {
                    }
                }
                this.f15117e.acquireUninterruptibly();
            }
        }
    }

    /* renamed from: a */
    public final void mo42873a(C6225a.C6226a aVar) {
        if (aVar == C6225a.C6226a.FINISH && this.f15109c) {
            this.f15114h.post(new Runnable() {
                public final void run() {
                    if (C6117g.this.f15107a == null) {
                        return;
                    }
                    if (C6117g.this.f15108b.isSuccess()) {
                        C6117g.this.f15107a.mo42846b(C6117g.this.f15108b);
                    } else {
                        C6117g.this.f15107a.mo42845a(C6117g.this.f15108b, C6117g.this.f15108b.getMsg());
                    }
                }
            });
        }
    }
}

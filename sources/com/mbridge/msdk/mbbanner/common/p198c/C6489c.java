package com.mbridge.msdk.mbbanner.common.p198c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbanner.common.bridge.C6480a;
import com.mbridge.msdk.mbbanner.common.p196a.C6464a;
import com.mbridge.msdk.mbbanner.common.p197b.C6468a;
import com.mbridge.msdk.mbbanner.common.p197b.C6470c;
import com.mbridge.msdk.mbbanner.common.p197b.C6474g;
import com.mbridge.msdk.mbbanner.common.p199d.C6501a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.communication.C6546b;
import com.mbridge.msdk.mbsignalcommon.mraid.C6549a;
import com.mbridge.msdk.mbsignalcommon.mraid.C6552c;
import com.mbridge.msdk.mbsignalcommon.p206b.C6532b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6560d;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.download.C7200h;
import java.io.File;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.c */
/* compiled from: BannerShowManager */
public final class C6489c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f16190b = "BannerShowManager";

    /* renamed from: A */
    private View.OnClickListener f16191A = new View.OnClickListener() {
        public final void onClick(View view) {
            if (C6489c.this.f16208p) {
                C6489c.m16686b(C6489c.this);
            }
        }
    };

    /* renamed from: B */
    private C6468a f16192B = new C6468a() {
        /* renamed from: a */
        public final void mo44293a(int i) {
            if (i == 2) {
                C6489c.m16690c(C6489c.this);
            } else {
                C6489c.this.m16696f();
            }
        }

        /* renamed from: a */
        public final void mo44295a(String str) {
            C6489c.m16686b(C6489c.this);
        }

        /* renamed from: a */
        public final void mo44292a() {
            C6489c.m16686b(C6489c.this);
        }

        /* renamed from: b */
        public final void mo44298b(int i) {
            if (i == 1) {
                C6489c.this.m16692d();
                C6489c.this.m16679a("", 1);
                return;
            }
            C6489c.this.m16688c();
        }

        /* renamed from: a */
        public final void mo44294a(CampaignEx campaignEx) {
            C6489c.this.mo44331a(campaignEx);
        }

        /* renamed from: a */
        public final void mo44296a(boolean z) {
            if (C6489c.this.f16195c != null) {
                boolean unused = C6489c.this.f16207o = z;
                if (z) {
                    C6489c.this.f16195c.mo44264c();
                } else {
                    C6489c.this.f16195c.mo44265d();
                }
            }
        }

        /* renamed from: a */
        public final void mo44297a(boolean z, String str) {
            try {
                if (C6489c.this.f16195c == null) {
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    C6489c.this.f16195c.mo44259a();
                    C6489c.this.f16195c.mo44263b();
                    return;
                }
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(C6489c.this.f16197e));
                parseCampaignWithBackData.setClickURL(str);
                if (z) {
                    String i = C6489c.this.f16209q;
                    if (parseCampaignWithBackData != null) {
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                new C6308c(C6122a.m15302b().mo42895d()).mo43935b(parseCampaignWithBackData.getRequestId(), parseCampaignWithBackData.getRequestIdNotice(), parseCampaignWithBackData.getId(), i, str, parseCampaignWithBackData.isBidCampaign());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                C6489c.this.mo44331a(parseCampaignWithBackData);
            } catch (Exception e2) {
                C6361q.m16158d(C6489c.f16190b, e2.getMessage());
            }
        }
    };

    /* renamed from: C */
    private C6532b f16193C = new C6532b() {
        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            boolean unused = C6489c.this.f16204l = true;
            C6361q.m16158d("BannerCallJS", "fireOnSignalCommunication");
            C6563g.m16891a().mo44521a(webView);
            boolean unused2 = C6489c.this.f16206n = true;
            if (C6489c.this.f16197e != null && !C6489c.this.f16197e.isHasMBTplMark()) {
                C6489c.this.m16692d();
                C6489c.this.m16679a("", 1);
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            C6489c.this.m16678a(str);
            C6489c.this.m16679a(str, 2);
        }
    };

    /* renamed from: a */
    C6097a f16194a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6470c f16195c;

    /* renamed from: d */
    private boolean f16196d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CampaignEx f16197e;

    /* renamed from: f */
    private MBBannerView f16198f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f16199g;

    /* renamed from: h */
    private MBBannerWebView f16200h;

    /* renamed from: i */
    private ImageView f16201i;

    /* renamed from: j */
    private boolean f16202j;

    /* renamed from: k */
    private boolean f16203k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f16204l;

    /* renamed from: m */
    private boolean f16205m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f16206n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f16207o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f16208p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f16209q;

    /* renamed from: r */
    private String f16210r;

    /* renamed from: s */
    private List<CampaignEx> f16211s;

    /* renamed from: t */
    private int f16212t;

    /* renamed from: u */
    private long f16213u = MBInterstitialActivity.WEB_LOAD_TIME;

    /* renamed from: v */
    private C6480a f16214v;

    /* renamed from: w */
    private Handler f16215w = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    };

    /* renamed from: x */
    private C6225a f16216x = new C6225a() {
        /* renamed from: b */
        public final void mo42877b() {
        }

        /* renamed from: a */
        public final void mo42876a() {
            C6489c.this.m16678a("banner render failed because render is timeout");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f16217y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f16218z;

    public C6489c(MBBannerView mBBannerView, C6470c cVar, String str, String str2, boolean z, C6086d dVar) {
        this.f16196d = z;
        this.f16198f = mBBannerView;
        this.f16209q = str2;
        this.f16210r = str;
        this.f16195c = new C6474g(cVar, dVar);
    }

    /* renamed from: a */
    public final void mo44334a(boolean z, int i) {
        this.f16212t = i;
        if (i == 0) {
            C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), this.f16209q);
            if (e != null) {
                z = e.mo42775c() == 1;
            } else {
                return;
            }
        }
        this.f16196d = z;
    }

    /* renamed from: a */
    public final void mo44333a(boolean z) {
        this.f16196d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16688c() {
        if (this.f16198f != null) {
            MBBannerWebView mBBannerWebView = this.f16200h;
            if (!(mBBannerWebView == null || mBBannerWebView.getParent() == null)) {
                this.f16198f.removeView(this.f16200h);
            }
            if (this.f16199g == null) {
                ImageView imageView = new ImageView(C6122a.m15302b().mo42895d());
                this.f16199g = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        float unused = C6489c.this.f16217y = motionEvent.getRawX();
                        float unused2 = C6489c.this.f16218z = motionEvent.getRawY();
                        String b = C6489c.f16190b;
                        C6361q.m16158d(b, C6489c.this.f16217y + "  " + C6489c.this.f16218z);
                        return false;
                    }
                });
                this.f16199g.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C6489c.this.mo44331a(BannerUtils.managerCampaignEX(C6546b.m16828a(C6489c.this.f16217y, C6489c.this.f16218z), C6489c.this.f16197e));
                    }
                });
            }
            String imageUrl = this.f16197e.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                C6216b.m15729a(C6122a.m15302b().mo42895d()).mo43786a(imageUrl, (C6219c) new C6219c() {
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (C6489c.this.f16199g != null) {
                            C6489c.this.f16199g.setImageBitmap(bitmap);
                        }
                        boolean unused = C6489c.this.f16204l = true;
                        C6489c.m16704m(C6489c.this);
                        C6489c.this.m16696f();
                        C6489c.this.m16692d();
                    }

                    public final void onFailedLoad(String str, String str2) {
                        C6489c.this.m16678a("banner show failed because banner default view is exception");
                    }
                });
            } else {
                m16678a("banner show failed because campain is exception");
            }
        } else {
            m16678a("banner show failed because banner view is exception");
        }
    }

    /* renamed from: b */
    private String m16684b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        String b = C7200h.m18303a().mo49224b(campaignEx.getBannerUrl());
        if (TextUtils.isEmpty(b)) {
            b = campaignEx.getBannerHtml();
            if (campaignEx.isActiveOm()) {
                try {
                    File file = new File(b);
                    if (file.exists()) {
                        return C6355o.m16137a(file);
                    }
                    return "";
                } catch (Exception unused) {
                    File file2 = new File(b);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        return "file:////" + b;
                    }
                }
            } else {
                File file3 = new File(b);
                if (file3.exists() && file3.isFile() && file3.canRead()) {
                    return "file:////" + b;
                }
            }
        }
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16678a(String str) {
        if (this.f16197e != null && !m16695e()) {
            this.f16215w.removeCallbacks(this.f16216x);
            C6470c cVar = this.f16195c;
            if (cVar != null) {
                cVar.mo44261a(str);
            }
            C6323d.m16044b(C6122a.m15302b().mo42895d(), this.f16197e, this.f16209q, str);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02d2  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16692d() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "true"
            boolean r0 = r1.f16204l
            r3 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = r1.f16205m
            if (r0 != 0) goto L_0x0047
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f16195c
            if (r0 == 0) goto L_0x0047
            r1.f16205m = r3
            android.os.Handler r0 = r1.f16215w
            com.mbridge.msdk.foundation.same.e.a r4 = r1.f16216x
            r0.removeCallbacks(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f16197e
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isCallbacked()
            if (r0 != 0) goto L_0x0047
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f16197e
            r0.setCallbacked(r3)
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f16195c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r1.f16211s
            r0.mo44262a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r4)
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r0 = r0.mo42895d()
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.f16197e
            int r4 = r4.getMaitve()
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r1.f16197e
            java.lang.String r5 = r5.getMaitve_src()
            com.mbridge.msdk.click.C6103b.m15225a((android.content.Context) r0, (int) r4, (java.lang.String) r5)
        L_0x0047:
            boolean r0 = r1.f16204l
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r1.f16202j
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r1.f16203k
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r1.f16205m
            if (r0 == 0) goto L_0x02d8
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f16197e
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r24.m16695e()
            if (r0 != 0) goto L_0x02d8
            com.mbridge.msdk.out.MBBannerView r0 = r1.f16198f
            r4 = 0
            if (r0 != 0) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            boolean r0 = com.mbridge.msdk.foundation.tools.C6371z.m16240a(r0)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r1.f16207o
            if (r0 != 0) goto L_0x0073
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 != 0) goto L_0x0084
            com.mbridge.msdk.out.MBBannerView r0 = r1.f16198f
            if (r0 == 0) goto L_0x0084
            com.mbridge.msdk.mbbanner.common.c.c$10 r8 = new com.mbridge.msdk.mbbanner.common.c.c$10
            r8.<init>()
            r0.postDelayed(r8, r6)
        L_0x0084:
            boolean r0 = r1.f16206n
            if (r0 == 0) goto L_0x01cd
            if (r5 == 0) goto L_0x01cd
            r8 = 2
            int[] r9 = new int[r8]
            com.mbridge.msdk.out.MBBannerView r0 = r1.f16198f
            r0.getLocationInWindow(r9)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r1.f16200h
            r10 = r9[r4]
            float r10 = (float) r10
            r11 = r9[r3]
            float r11 = (float) r11
            java.lang.String r12 = "BannerCallJS"
            java.lang.String r13 = "fireOnBannerWebViewShow"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r12, r13)
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x00da }
            r14.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r15 = "startX"
            double r6 = (double) r10     // Catch:{ all -> 0x00da }
            r14.put(r15, r6)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "startY"
            double r10 = (double) r11     // Catch:{ all -> 0x00da }
            r14.put(r6, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "scale"
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x00da }
            android.content.Context r7 = r7.mo42895d()     // Catch:{ all -> 0x00da }
            float r7 = com.mbridge.msdk.foundation.tools.C6366u.m16215d((android.content.Context) r7)     // Catch:{ all -> 0x00da }
            double r10 = (double) r7     // Catch:{ all -> 0x00da }
            r14.put(r6, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x00da }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)     // Catch:{ all -> 0x00da }
            com.mbridge.msdk.mbsignalcommon.windvane.g r7 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ all -> 0x00da }
            java.lang.String r10 = "webviewshow"
            r7.mo44522a((android.webkit.WebView) r0, (java.lang.String) r10, (java.lang.String) r6)     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r12, r13, r0)
        L_0x00de:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r1.f16200h
            r6 = r9[r4]
            r7 = r9[r3]
            com.mbridge.msdk.out.MBBannerView r9 = r1.f16198f
            int r9 = r9.getWidth()
            com.mbridge.msdk.out.MBBannerView r10 = r1.f16198f
            int r10 = r10.getHeight()
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c1 }
            android.content.Context r11 = r11.mo42895d()     // Catch:{ all -> 0x01c1 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x01c1 }
            android.content.res.Configuration r11 = r11.getConfiguration()     // Catch:{ all -> 0x01c1 }
            int r11 = r11.orientation     // Catch:{ all -> 0x01c1 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x01c1 }
            r13.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r14 = "orientation"
            if (r11 != r8) goto L_0x010e
            java.lang.String r8 = "landscape"
            goto L_0x0115
        L_0x010e:
            if (r11 != r3) goto L_0x0113
            java.lang.String r8 = "portrait"
            goto L_0x0115
        L_0x0113:
            java.lang.String r8 = "undefined"
        L_0x0115:
            r13.put(r14, r8)     // Catch:{ all -> 0x01c1 }
            java.lang.String r8 = "locked"
            r13.put(r8, r2)     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c1 }
            android.content.Context r8 = r8.mo42895d()     // Catch:{ all -> 0x01c1 }
            int r8 = com.mbridge.msdk.foundation.tools.C6349m.m16111h(r8)     // Catch:{ all -> 0x01c1 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c1 }
            android.content.Context r11 = r11.mo42895d()     // Catch:{ all -> 0x01c1 }
            int r11 = com.mbridge.msdk.foundation.tools.C6349m.m16112i(r11)     // Catch:{ all -> 0x01c1 }
            float r11 = (float) r11     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r14 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c1 }
            android.content.Context r14 = r14.mo42895d()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r14 = com.mbridge.msdk.foundation.tools.C6349m.m16115j(r14)     // Catch:{ all -> 0x01c1 }
            java.lang.String r15 = "width"
            java.lang.Object r15 = r14.get(r15)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x01c1 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x01c1 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x01c1 }
            r14.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r4 = "placementType"
            r23 = r5
            java.lang.String r5 = "inline"
            r14.put(r4, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "state"
            java.lang.String r5 = "default"
            r14.put(r4, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "viewable"
            r14.put(r4, r2)     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "currentAppOrientation"
            r14.put(r2, r13)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r16 = com.mbridge.msdk.mbsignalcommon.mraid.C6549a.m16848a()     // Catch:{ all -> 0x01bf }
            float r2 = (float) r6     // Catch:{ all -> 0x01bf }
            float r4 = (float) r7     // Catch:{ all -> 0x01bf }
            float r5 = (float) r9     // Catch:{ all -> 0x01bf }
            float r6 = (float) r10     // Catch:{ all -> 0x01bf }
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.mo44473a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r16 = com.mbridge.msdk.mbsignalcommon.mraid.C6549a.m16848a()     // Catch:{ all -> 0x01bf }
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.mo44478b(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C6549a.m16848a()     // Catch:{ all -> 0x01bf }
            r2.mo44477b(r0, r8, r11)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C6549a.m16848a()     // Catch:{ all -> 0x01bf }
            float r4 = (float) r15     // Catch:{ all -> 0x01bf }
            float r3 = (float) r3     // Catch:{ all -> 0x01bf }
            r2.mo44480c(r0, r4, r3)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C6549a.m16848a()     // Catch:{ all -> 0x01bf }
            r2.mo44476a((android.webkit.WebView) r0, (java.util.Map<java.lang.String, java.lang.Object>) r14)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C6549a.m16848a()     // Catch:{ all -> 0x01bf }
            r2.mo44470a(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01c9
        L_0x01bf:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c1:
            r0 = move-exception
            r23 = r5
        L_0x01c4:
            java.lang.String r2 = "transInfoForMraid"
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r12, r2, r0)
        L_0x01c9:
            r2 = 0
            r1.f16206n = r2
            goto L_0x01cf
        L_0x01cd:
            r23 = r5
        L_0x01cf:
            if (r23 == 0) goto L_0x02d2
            android.widget.ImageView r0 = r1.f16199g
            java.lang.String r2 = "banner"
            if (r0 == 0) goto L_0x0219
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0219
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f16197e
            if (r0 == 0) goto L_0x02ad
            if (r0 == 0) goto L_0x020a
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r3.mo42895d()
            java.lang.String r4 = r1.f16209q
            r1.m16689c(r0, r3, r4)
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r3.mo42895d()
            java.lang.String r4 = r1.f16209q
            r1.m16685b(r0, r3, r4)
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r3.mo42895d()
            java.lang.String r4 = r1.f16209q
            r1.m16675a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.content.Context) r3, (java.lang.String) r4)
        L_0x020a:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f16197e
            r3 = 1
            r0.setReport(r3)
            java.lang.String r0 = r1.f16209q
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r1.f16197e
            com.mbridge.msdk.foundation.same.p166a.C6208d.m15706b(r0, r3, r2)
            goto L_0x02ad
        L_0x0219:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f16211s
            if (r0 == 0) goto L_0x02ad
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02ad
            r0 = 0
            r4 = 0
            r22 = 0
        L_0x0227:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f16211s
            int r3 = r3.size()
            if (r4 >= r3) goto L_0x0281
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f16211s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r3 = r3.isHasMBTplMark()
            if (r3 != 0) goto L_0x027e
            if (r4 == 0) goto L_0x024d
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f16211s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r3 = r3.isReport()
            if (r3 != 0) goto L_0x027e
        L_0x024d:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f16211s
            java.lang.Object r0 = r0.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r3.mo42895d()
            java.lang.String r5 = r1.f16209q
            r1.m16689c(r0, r3, r5)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f16211s
            java.lang.Object r0 = r0.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            r3 = 1
            r0.setReport(r3)
            java.lang.String r0 = r1.f16209q
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f16211s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            com.mbridge.msdk.foundation.same.p166a.C6208d.m15706b(r0, r3, r2)
            r0 = r4
            r22 = 1
        L_0x027e:
            int r4 = r4 + 1
            goto L_0x0227
        L_0x0281:
            if (r22 == 0) goto L_0x02ad
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f16211s
            java.lang.Object r2 = r2.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r3.mo42895d()
            java.lang.String r4 = r1.f16209q
            r1.m16685b(r2, r3, r4)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f16211s
            java.lang.Object r0 = r2.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r2 = r2.mo42895d()
            java.lang.String r3 = r1.f16209q
            r1.m16675a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.content.Context) r2, (java.lang.String) r3)
        L_0x02ad:
            r2 = 1
            r1.f16208p = r2
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f16195c
            if (r0 == 0) goto L_0x02b9
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r1.f16197e
            r0.mo44260a((com.mbridge.msdk.foundation.entity.CampaignEx) r3)
        L_0x02b9:
            android.os.Handler r0 = r1.f16215w
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.sendEmptyMessageDelayed(r2, r3)
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r0 = r0.mo42895d()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f16197e
            java.lang.String r3 = r1.f16209q
            java.lang.String r4 = ""
            com.mbridge.msdk.foundation.same.report.C6323d.m16032a((android.content.Context) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r3, (java.lang.String) r4)
            goto L_0x02d8
        L_0x02d2:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f16197e
            r2 = 0
            r0.setReport(r2)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p198c.C6489c.m16692d():void");
    }

    /* renamed from: e */
    private synchronized boolean m16695e() {
        boolean isReport;
        isReport = this.f16197e.isReport();
        if (!isReport) {
            this.f16197e.setReport(true);
        }
        return isReport;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m16696f() {
        ImageView imageView;
        if (this.f16196d && (imageView = this.f16201i) != null) {
            if (imageView.getVisibility() != 0) {
                this.f16201i.setVisibility(0);
                this.f16201i.setOnClickListener(this.f16191A);
            }
            if (this.f16201i.getParent() == null && this.f16198f != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C6366u.m16203b(C6122a.m15302b().mo42895d(), 12.0f), C6366u.m16203b(C6122a.m15302b().mo42895d(), 12.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                this.f16198f.addView(this.f16201i, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo44329a() {
        if (this.f16195c != null) {
            this.f16195c = null;
        }
        MBBannerWebView mBBannerWebView = this.f16200h;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener((C6560d) null);
        }
        if (this.f16193C != null) {
            this.f16193C = null;
        }
        ImageView imageView = this.f16201i;
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView2 = this.f16199g;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener) null);
        }
        MBBannerView mBBannerView = this.f16198f;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f16200h;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        C6480a aVar = this.f16214v;
        if (aVar != null) {
            aVar.mo44305a();
        }
        if (this.f16192B != null) {
            this.f16192B = null;
        }
    }

    /* renamed from: b */
    public final void mo44335b(boolean z) {
        this.f16202j = z;
        m16692d();
        if (!z) {
            CampaignEx campaignEx = this.f16197e;
            String str = this.f16209q;
            if (campaignEx != null) {
                String a = C6552c.m16863a(campaignEx.getId());
                if (!TextUtils.isEmpty(a)) {
                    new C6308c(C6122a.m15302b().mo42895d()).mo43934a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a, campaignEx.isBidCampaign());
                    C6552c.m16864b(campaignEx.getId());
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo44336c(boolean z) {
        this.f16203k = z;
        m16692d();
    }

    /* renamed from: a */
    private void m16675a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        C6097a.m15185a(context, campaignEx, str, a, false, true);
                    }
                }
            } catch (Throwable th) {
                C6361q.m16158d(f16190b, th.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m16685b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    C6097a.m15185a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true);
                }
            } catch (Throwable th) {
                C6361q.m16158d(f16190b, th.getMessage());
            }
        }
    }

    /* renamed from: c */
    private void m16689c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C6152j.m15441a((C6146e) C6148f.m15420a(context)).mo43016b(campaignEx.getId());
                    } catch (Exception e) {
                        C6361q.m16158d(C6489c.f16190b, e.getMessage());
                    }
                }
            }).start();
            C6097a.m15185a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true);
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43680k() != null) {
            C6097a.m15186a(context, campaignEx, str, campaignEx.getNativeVideoTracking().mo43680k(), false, false);
        }
    }

    /* renamed from: a */
    public final void mo44331a(CampaignEx campaignEx) {
        if (this.f16208p) {
            if (this.f16194a == null) {
                this.f16194a = new C6097a(C6122a.m15302b().mo42895d(), this.f16209q);
            }
            this.f16194a.mo42841a((NativeListener.NativeTrackingListener) new NativeListener.TrackingExListener() {
                public final void onDismissLoading(Campaign campaign) {
                }

                public final void onDownloadFinish(Campaign campaign) {
                }

                public final void onDownloadProgress(int i) {
                }

                public final void onDownloadStart(Campaign campaign) {
                }

                public final void onFinishRedirection(Campaign campaign, String str) {
                }

                public final boolean onInterceptDefaultLoadingDialog() {
                    return false;
                }

                public final void onRedirectionFailed(Campaign campaign, String str) {
                }

                public final void onShowLoading(Campaign campaign) {
                }

                public final void onStartRedirection(Campaign campaign, String str) {
                }

                public final void onLeaveApp() {
                    if (C6489c.this.f16195c != null) {
                        C6489c.this.f16195c.mo44263b();
                    }
                }
            });
            campaignEx.setCampaignUnitId(this.f16209q);
            this.f16194a.mo42838a(campaignEx);
            if (!this.f16197e.isReportClick()) {
                this.f16197e.setReportClick(true);
                Context d = C6122a.m15302b().mo42895d();
                if (!(campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo43672g() == null)) {
                    C6097a.m15186a(d, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43672g(), false, false);
                }
            }
            C6470c cVar = this.f16195c;
            if (cVar != null) {
                cVar.mo44259a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16679a(String str, int i) {
        if (this.f16197e != null) {
            C6501a.m16724a(C6464a.m16573a().mo44276c(this.f16197e.getId()).mo44274b(this.f16209q).mo44278e(this.f16197e.getRequestId()).mo44277d(this.f16197e.getRequestIdNotice()).mo44280g(str).mo44271a(i).mo44273a(this.f16197e.isBidCampaign()), this.f16209q);
        }
    }

    /* renamed from: a */
    public final void mo44330a(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            MBBannerWebView mBBannerWebView = this.f16200h;
            C6361q.m16158d("BannerCallJS", "fireOnBannerViewSizeChange");
            try {
                C6549a.m16848a().mo44472a((WebView) mBBannerWebView, (float) i, (float) i2);
            } catch (Throwable th) {
                C6361q.m16155a("BannerCallJS", "fireOnBannerViewSizeChange", th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44332a(com.mbridge.msdk.foundation.entity.CampaignUnit r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x001a
            java.util.ArrayList r10 = r10.getAds()
            r9.f16211s = r10
            if (r10 == 0) goto L_0x001a
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x001a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r10 = r9.f16211s
            java.lang.Object r10 = r10.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            r9.f16197e = r10
            if (r10 != 0) goto L_0x0025
            java.lang.String r10 = "banner show failed because campain is exception"
            r9.m16678a((java.lang.String) r10)
            return
        L_0x0025:
            android.os.Handler r10 = r9.f16215w
            com.mbridge.msdk.foundation.same.e.a r1 = r9.f16216x
            r10.removeCallbacks(r1)
            boolean r10 = r9.f16196d
            r1 = 8
            if (r10 == 0) goto L_0x0064
            android.widget.ImageView r10 = r9.f16201i
            if (r10 != 0) goto L_0x0064
            android.widget.ImageView r10 = new android.widget.ImageView
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r2 = r2.mo42895d()
            r10.<init>(r2)
            r9.f16201i = r10
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r2 = r2.mo42895d()
            java.lang.String r3 = "mbridge_banner_close"
            java.lang.String r4 = "drawable"
            int r2 = com.mbridge.msdk.foundation.tools.C6347k.m16084a(r2, r3, r4)
            r10.setBackgroundResource(r2)
            android.widget.ImageView r10 = r9.f16201i
            r10.setVisibility(r1)
            android.widget.ImageView r10 = r9.f16201i
            java.lang.String r2 = "closeButton"
            r10.setContentDescription(r2)
        L_0x0064:
            r9.f16204l = r0
            r9.f16205m = r0
            r9.f16208p = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f16197e
            java.lang.String r10 = r10.getBannerHtml()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0082
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f16197e
            java.lang.String r10 = r10.getBannerUrl()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x00e2
        L_0x0082:
            com.mbridge.msdk.mbbanner.common.a.a r10 = com.mbridge.msdk.mbbanner.common.p196a.C6464a.m16573a()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f16197e
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.mbbanner.common.a.a r10 = r10.mo44276c(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f16197e
            java.lang.String r2 = r2.getRequestId()
            com.mbridge.msdk.mbbanner.common.a.a r10 = r10.mo44278e(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f16197e
            java.lang.String r2 = r2.getRequestIdNotice()
            com.mbridge.msdk.mbbanner.common.a.a r10 = r10.mo44277d(r2)
            java.lang.String r2 = r9.f16209q
            com.mbridge.msdk.mbbanner.common.a.a r10 = r10.mo44274b(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f16197e
            boolean r2 = r2.isBidCampaign()
            com.mbridge.msdk.mbbanner.common.a.a r10 = r10.mo44273a((boolean) r2)
            java.lang.String r2 = r9.f16209q
            if (r10 == 0) goto L_0x00e2
            java.lang.String r3 = "2000067"
            r10.mo44272a((java.lang.String) r3)
            com.mbridge.msdk.foundation.same.report.a r3 = com.mbridge.msdk.foundation.same.report.C6301a.m15945a()
            boolean r3 = r3.mo43913c()
            if (r3 == 0) goto L_0x00d3
            com.mbridge.msdk.foundation.same.report.a r2 = com.mbridge.msdk.foundation.same.report.C6301a.m15945a()
            java.lang.String r10 = r10.mo44275b()
            r2.mo43911a((java.lang.String) r10)
            goto L_0x00e2
        L_0x00d3:
            java.lang.String r10 = r10.mo44275b()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r3.mo42895d()
            com.mbridge.msdk.foundation.same.report.C6305b.m15967a((java.lang.String) r10, (android.content.Context) r3, (java.lang.String) r2)
        L_0x00e2:
            android.os.Handler r10 = r9.f16215w
            com.mbridge.msdk.foundation.same.e.a r2 = r9.f16216x
            long r3 = r9.f16213u
            r10.postDelayed(r2, r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f16197e
            java.lang.String r4 = r9.m16684b((com.mbridge.msdk.foundation.entity.CampaignEx) r10)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            r8 = 2
            if (r10 != 0) goto L_0x01aa
            com.mbridge.msdk.out.MBBannerView r10 = r9.f16198f
            if (r10 == 0) goto L_0x019f
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            if (r10 != 0) goto L_0x0128
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = new com.mbridge.msdk.mbbanner.view.MBBannerWebView
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r2 = r2.mo42895d()
            r10.<init>(r2)
            r9.f16200h = r10
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r10.setLayoutParams(r2)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            com.mbridge.msdk.mbbanner.view.a r2 = new com.mbridge.msdk.mbbanner.view.a
            java.lang.String r3 = r9.f16209q
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r9.f16211s
            com.mbridge.msdk.mbbanner.common.b.a r6 = r9.f16192B
            r2.<init>(r3, r5, r6)
            r10.setWebViewClient(r2)
        L_0x0128:
            android.widget.ImageView r10 = r9.f16199g
            if (r10 == 0) goto L_0x012f
            r10.setVisibility(r1)
        L_0x012f:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            int r10 = r10.getVisibility()
            if (r10 == 0) goto L_0x013c
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            r10.setVisibility(r0)
        L_0x013c:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            android.view.ViewParent r10 = r10.getParent()
            if (r10 != 0) goto L_0x014b
            com.mbridge.msdk.out.MBBannerView r10 = r9.f16198f
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r9.f16200h
            r10.addView(r0)
        L_0x014b:
            r9.m16696f()
            com.mbridge.msdk.mbbanner.common.bridge.a r10 = new com.mbridge.msdk.mbbanner.common.bridge.a
            com.mbridge.msdk.out.MBBannerView r0 = r9.f16198f
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = r9.f16210r
            java.lang.String r2 = r9.f16209q
            r10.<init>(r0, r1, r2)
            r9.f16214v = r10
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r9.f16211s
            r10.mo44309a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r0)
            com.mbridge.msdk.mbbanner.common.bridge.a r10 = r9.f16214v
            com.mbridge.msdk.mbbanner.common.b.a r0 = r9.f16192B
            r10.mo44307a((com.mbridge.msdk.mbbanner.common.p197b.C6468a) r0)
            com.mbridge.msdk.mbbanner.common.bridge.a r10 = r9.f16214v
            int r0 = r9.f16212t
            r10.mo44306a((int) r0)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            com.mbridge.msdk.mbsignalcommon.b.b r0 = r9.f16193C
            r10.setWebViewListener(r0)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = r9.f16214v
            r10.setObject(r0)
            java.lang.String r10 = "file"
            boolean r10 = r4.startsWith(r10)
            if (r10 != 0) goto L_0x0199
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r9.f16200h
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f16197e
            java.lang.String r3 = r10.getBannerUrl()
            r7 = 0
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            goto L_0x01a9
        L_0x0199:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r10 = r9.f16200h
            r10.loadUrl(r4)
            goto L_0x01a9
        L_0x019f:
            java.lang.String r10 = "banner render failed because banner view is null"
            r9.m16679a((java.lang.String) r10, (int) r8)
            java.lang.String r10 = "banner show failed because banner view is exception"
            r9.m16678a((java.lang.String) r10)
        L_0x01a9:
            r0 = 1
        L_0x01aa:
            if (r0 != 0) goto L_0x01cc
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f16197e
            java.lang.String r10 = r10.getBannerHtml()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x01c4
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f16197e
            java.lang.String r10 = r10.getBannerUrl()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x01c9
        L_0x01c4:
            java.lang.String r10 = "banner render failed because res load failed"
            r9.m16679a((java.lang.String) r10, (int) r8)
        L_0x01c9:
            r9.m16688c()
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p198c.C6489c.mo44332a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    /* renamed from: b */
    static /* synthetic */ void m16686b(C6489c cVar) {
        MBBannerWebView mBBannerWebView = cVar.f16200h;
        if (!(mBBannerWebView == null || mBBannerWebView.getParent() == null)) {
            cVar.f16198f.removeView(cVar.f16200h);
        }
        ImageView imageView = cVar.f16199g;
        if (!(imageView == null || imageView.getParent() == null)) {
            cVar.f16199g.setVisibility(8);
            cVar.f16198f.removeView(cVar.f16199g);
        }
        ImageView imageView2 = cVar.f16201i;
        if (!(imageView2 == null || imageView2.getParent() == null)) {
            cVar.f16198f.removeView(cVar.f16201i);
            cVar.f16201i.setVisibility(8);
        }
        C6464a c = C6464a.m16573a().mo44274b(cVar.f16209q).mo44278e(cVar.f16197e.getRequestId()).mo44277d(cVar.f16197e.getRequestIdNotice()).mo44276c(cVar.f16197e.getId());
        C6464a a = c.mo44279f(cVar.f16197e.getCreativeId() + "").mo44273a(cVar.f16197e.isBidCampaign());
        String str = cVar.f16209q;
        if (a != null) {
            a.mo44272a("2000069");
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(a.mo44275b());
            } else {
                C6305b.m15967a(a.mo44275b(), C6122a.m15302b().mo42895d(), str);
            }
        }
        BannerUtils.inserCloseId(cVar.f16209q, cVar.f16211s);
        C6470c cVar2 = cVar.f16195c;
        if (cVar2 != null) {
            cVar2.mo44266e();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m16690c(C6489c cVar) {
        ImageView imageView;
        if (cVar.f16196d && (imageView = cVar.f16201i) != null && imageView.getVisibility() == 0) {
            cVar.f16201i.setVisibility(8);
            cVar.f16201i.setOnClickListener((View.OnClickListener) null);
            if (cVar.f16198f != null && cVar.f16201i.getParent() != null) {
                cVar.f16198f.removeView(cVar.f16201i);
            }
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m16704m(C6489c cVar) {
        if (cVar.f16199g != null) {
            MBBannerWebView mBBannerWebView = cVar.f16200h;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (cVar.f16199g.getVisibility() != 0) {
                cVar.f16199g.setVisibility(0);
            }
            if (cVar.f16198f != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f16199g.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f16199g.getParent() == null) {
                    cVar.f16198f.addView(cVar.f16199g, layoutParams);
                }
            }
        }
    }
}

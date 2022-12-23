package com.mbridge.msdk.interactiveads.p184a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6194d;
import com.mbridge.msdk.foundation.entity.C6196f;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6150h;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity;
import com.mbridge.msdk.interactiveads.p185b.C6407a;
import com.mbridge.msdk.interactiveads.p186c.C6408a;
import com.mbridge.msdk.interactiveads.p187d.C6410a;
import com.mbridge.msdk.interactiveads.p187d.C6411b;
import com.mbridge.msdk.interactiveads.p187d.C6413d;
import com.mbridge.msdk.interactiveads.p188e.C6414a;
import com.mbridge.msdk.interactiveads.p188e.C6415b;
import com.mbridge.msdk.interactiveads.p189f.C6417a;
import com.mbridge.msdk.interactiveads.signalcommon.C6422a;
import com.mbridge.msdk.mbsignalcommon.p206b.C6532b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7191g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.mbridge.msdk.interactiveads.a.a */
/* compiled from: InteractiveAdsAdapter */
public final class C6386a {

    /* renamed from: a */
    public static List<CampaignEx> f15850a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f15851b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f15852c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f15853d;

    /* renamed from: e */
    private int f15854e;

    /* renamed from: f */
    private C6410a f15855f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6411b f15856g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f15857h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f15858i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f15859j = 0;

    /* renamed from: k */
    private CountDownTimer f15860k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f15861l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f15862m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f15863n = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i != 3) {
                    if (i != 4) {
                        int i2 = 0;
                        if (i == 5) {
                            try {
                                C6414a aVar = new C6414a(C6386a.this.f15851b);
                                HashMap hashMap = (HashMap) message.obj;
                                final C6413d dVar = (C6413d) hashMap.get("loadmore");
                                C6287d dVar2 = (C6287d) hashMap.get("param");
                                if (dVar == null) {
                                    C6397c.m16305a(C6386a.this.f15851b);
                                    String b = C6121a.m15293a().mo42882b(C6407a.f15942a);
                                    if (b != null && !b.equals("")) {
                                        i2 = Integer.parseInt(C6121a.m15293a().mo42882b(C6407a.f15942a));
                                    }
                                    C6121a.m15293a().mo42880a(C6407a.f15942a, String.valueOf(i2 + 1));
                                }
                                final String str = (String) hashMap.get(ViewHierarchyConstants.TAG_KEY);
                                C63891 r3 = new C6415b() {
                                    /* renamed from: a */
                                    public final void mo44014a(CampaignUnit campaignUnit) {
                                        try {
                                            if (dVar == null) {
                                                C6397c.m16305a(C6386a.this.f15851b);
                                                String b = C6121a.m15293a().mo42882b(C6407a.f15943b);
                                                C6121a.m15293a().mo42880a(C6407a.f15943b, String.valueOf(((b == null || b.equals("")) ? 0 : Integer.parseInt(C6121a.m15293a().mo42882b(C6407a.f15943b))) + 1));
                                            }
                                            if (!C6386a.this.f15861l) {
                                                C6386a.this.mo43999a(campaignUnit, str, dVar);
                                            }
                                            boolean unused = C6386a.this.f15858i = false;
                                            C6407a.f15944c = false;
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }

                                    /* renamed from: a */
                                    public final void mo44013a(int i, String str) {
                                        try {
                                            if (dVar == null && !C6386a.this.f15861l && str.equals("onelevel")) {
                                                C6386a.this.f15856g.mo44083d(str);
                                                C6417a.m16394a(C6386a.this.f15851b, str, C6386a.this.f15852c, (CampaignEx) null);
                                            }
                                            C6386a.m16275g(C6386a.this);
                                            boolean unused = C6386a.this.f15858i = false;
                                            C6407a.f15944c = false;
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                };
                                r3.f15543d = C6386a.this.f15852c;
                                r3.f15544e = C6386a.this.f15853d;
                                r3.f15545f = 288;
                                if (C6280d.m15868c().mo43860b()) {
                                    aVar.mo43866b(1, C6280d.m15868c().f15572h, dVar2, r3);
                                } else {
                                    aVar.mo43864a(1, C6280d.m15868c().f15570f, dVar2, r3);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (i == 6) {
                            try {
                                Object[] objArr = (Object[]) message.obj;
                                C6386a.m16262a(C6386a.this, (List) objArr[0], (String) objArr[1]);
                                C6386a.m16260a(C6386a.this, (CampaignUnit) objArr[2]);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else if (i == 9) {
                            try {
                                int i3 = message.what;
                                Object[] objArr2 = (Object[]) message.obj;
                                List list = (List) objArr2[0];
                                String str2 = (String) objArr2[1];
                                String str3 = (String) objArr2[2];
                                C6086d dVar3 = (C6086d) objArr2[3];
                                boolean booleanValue = ((Boolean) objArr2[4]).booleanValue();
                                if (list != null && !TextUtils.isEmpty(str2)) {
                                    C6386a.this.mo44005a(list, str2, true, booleanValue);
                                }
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        } else if (i == 16) {
                            try {
                                int i4 = message.what;
                                Object[] objArr3 = (Object[]) message.obj;
                                List list2 = (List) objArr3[0];
                                String str4 = (String) objArr3[1];
                                String str5 = (String) objArr3[2];
                                C6086d dVar4 = (C6086d) objArr3[3];
                                boolean booleanValue2 = ((Boolean) objArr3[4]).booleanValue();
                                if (list2 != null && !TextUtils.isEmpty(str4)) {
                                    C6386a.this.mo44005a(list2, str4, false, booleanValue2);
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                    } else {
                        C6417a.m16394a(C6386a.this.f15851b, "failed", C6386a.this.f15852c, (CampaignEx) null);
                        C6386a.this.f15856g.mo44083d("no data");
                    }
                } else if (C6386a.this.f15856g != null && C6386a.f15850a != null) {
                    String str6 = (String) message.obj;
                    if (!str6.equals("loadmore") && !str6.equals("twolevel")) {
                        C6386a.this.f15856g.mo44074a(C6386a.f15850a);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public final void mo44000a(C6410a aVar) {
        this.f15855f = aVar;
    }

    /* renamed from: a */
    public final void mo44001a(C6411b bVar) {
        this.f15856g = bVar;
    }

    /* renamed from: a */
    public final boolean mo44006a() {
        return this.f15857h;
    }

    public C6386a(Context context, String str, String str2) {
        this.f15851b = context;
        this.f15852c = str;
        this.f15853d = str2;
        this.f15857h = false;
    }

    /* renamed from: b */
    public final String mo44007b() {
        return this.f15852c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (android.text.TextUtils.isEmpty(com.mbridge.msdk.videocommon.download.C7191g.m18286a().mo49220b(r8.getKeyIaUrl())) != false) goto L_0x0087;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44008c() {
        /*
            r13 = this;
            boolean r0 = r13.f15858i
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.mbridge.msdk.interactiveads.d.b r0 = r13.f15856g
            java.lang.String r2 = "current data is loading"
            r0.mo44083d(r2)
            android.content.Context r0 = r13.f15851b
            java.lang.String r3 = r13.f15852c
            com.mbridge.msdk.interactiveads.p189f.C6417a.m16394a(r0, r2, r3, r1)
            return
        L_0x0014:
            r0 = 1
            com.mbridge.msdk.interactiveads.p185b.C6407a.f15944c = r0
            r13.f15858i = r0
            r2 = 0
            r13.f15861l = r2
            r13.f15862m = r2
            android.os.CountDownTimer r3 = r13.f15860k
            if (r3 != 0) goto L_0x0035
            com.mbridge.msdk.interactiveads.a.a$1 r3 = new com.mbridge.msdk.interactiveads.a.a$1
            r6 = 60000(0xea60, double:2.9644E-319)
            r8 = 10000(0x2710, double:4.9407E-320)
            r4 = r3
            r5 = r13
            r4.<init>(r6, r8)
            android.os.CountDownTimer r3 = r3.start()
            r13.f15860k = r3
            goto L_0x003d
        L_0x0035:
            r3.cancel()
            android.os.CountDownTimer r3 = r13.f15860k
            r3.start()
        L_0x003d:
            android.content.Context r3 = r13.f15851b
            com.mbridge.msdk.foundation.db.f r3 = com.mbridge.msdk.foundation.p164db.C6148f.m15420a((android.content.Context) r3)
            com.mbridge.msdk.foundation.db.d r3 = com.mbridge.msdk.foundation.p164db.C6143d.m15367a((com.mbridge.msdk.foundation.p164db.C6146e) r3)
            android.content.Context r4 = r13.f15851b
            com.mbridge.msdk.interactiveads.a.b r4 = com.mbridge.msdk.interactiveads.p184a.C6396b.m16300a((android.content.Context) r4)
            java.lang.String r5 = r13.f15852c
            java.util.List r7 = r4.mo44026b(r5)
            java.lang.String r4 = "twolevel"
            java.lang.String r5 = "onelevel"
            if (r7 == 0) goto L_0x0139
            int r6 = r7.size()
            if (r6 <= 0) goto L_0x0139
            java.util.Iterator r6 = r7.iterator()
        L_0x0063:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r6.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = (com.mbridge.msdk.foundation.entity.CampaignEx) r8
            int r9 = r8.getIsDownLoadZip()
            if (r9 != r0) goto L_0x0063
            com.mbridge.msdk.videocommon.download.g r6 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()
            java.lang.String r8 = r8.getKeyIaUrl()
            java.lang.String r6 = r6.mo49220b((java.lang.String) r8)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x00e2
            android.content.Context r0 = r13.f15851b
            com.mbridge.msdk.interactiveads.a.b r0 = com.mbridge.msdk.interactiveads.p184a.C6396b.m16300a((android.content.Context) r0)
            java.lang.String r6 = r13.f15852c
            java.util.List r0 = r0.mo44024a((java.lang.String) r6)
            if (r0 == 0) goto L_0x00ad
            int r6 = r0.size()
            if (r6 <= 0) goto L_0x00ad
            java.lang.String r6 = r13.f15852c
            java.lang.Object r0 = r0.get(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            int r0 = r0.getKeyIaRst()
            r3.mo42961a((java.lang.String) r6, (int) r0)
        L_0x00ad:
            java.util.Iterator r0 = r7.iterator()
        L_0x00b1:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r6 = r0.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6
            r6.setInteractiveCache(r5)
            goto L_0x00b1
        L_0x00c1:
            java.lang.String r0 = r13.f15852c
            r3.mo42985c((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (java.lang.String) r0)
            com.mbridge.msdk.interactiveads.d.b r0 = r13.f15856g
            r0.mo44074a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7)
            r13.mo44002a((java.lang.String) r4, (com.mbridge.msdk.interactiveads.p187d.C6413d) r1)
            java.lang.Object r0 = r7.get(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r8 = r0.getKeyIaUrl()
            java.lang.String r9 = r13.f15852c
            r10 = 0
            r11 = 0
            r6 = r13
            r6.mo44004a(r7, r8, r9, r10, r11)
            goto L_0x0186
        L_0x00e2:
            java.lang.String r0 = r13.f15852c
            r3.mo42984c((java.lang.String) r0, (java.lang.String) r4)
            android.content.Context r0 = r13.f15851b
            com.mbridge.msdk.interactiveads.a.b r0 = com.mbridge.msdk.interactiveads.p184a.C6396b.m16300a((android.content.Context) r0)
            java.lang.String r6 = r13.f15852c
            java.util.List r8 = r0.mo44024a((java.lang.String) r6)
            if (r8 == 0) goto L_0x0135
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0135
            android.content.Context r0 = r13.f15851b
            com.mbridge.msdk.interactiveads.a.b r0 = com.mbridge.msdk.interactiveads.p184a.C6396b.m16300a((android.content.Context) r0)
            boolean r0 = r0.mo44025a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r8)
            if (r0 == 0) goto L_0x0122
            com.mbridge.msdk.interactiveads.d.b r0 = r13.f15856g
            r0.mo44074a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r8)
            r13.mo44002a((java.lang.String) r4, (com.mbridge.msdk.interactiveads.p187d.C6413d) r1)
            java.lang.Object r0 = r8.get(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r9 = r0.getKeyIaUrl()
            java.lang.String r10 = r13.f15852c
            r11 = 0
            r12 = 0
            r7 = r13
            r7.mo44004a(r8, r9, r10, r11, r12)
            goto L_0x0186
        L_0x0122:
            r13.mo44002a((java.lang.String) r5, (com.mbridge.msdk.interactiveads.p187d.C6413d) r1)
            java.lang.String r0 = r13.f15852c
            java.lang.Object r1 = r8.get(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1
            int r1 = r1.getKeyIaRst()
            r3.mo42961a((java.lang.String) r0, (int) r1)
            goto L_0x0186
        L_0x0135:
            r13.mo44002a((java.lang.String) r5, (com.mbridge.msdk.interactiveads.p187d.C6413d) r1)
            goto L_0x0186
        L_0x0139:
            android.content.Context r0 = r13.f15851b
            com.mbridge.msdk.interactiveads.a.b r0 = com.mbridge.msdk.interactiveads.p184a.C6396b.m16300a((android.content.Context) r0)
            java.lang.String r6 = r13.f15852c
            java.util.List r8 = r0.mo44024a((java.lang.String) r6)
            if (r8 == 0) goto L_0x0183
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0183
            android.content.Context r0 = r13.f15851b
            com.mbridge.msdk.interactiveads.a.b r0 = com.mbridge.msdk.interactiveads.p184a.C6396b.m16300a((android.content.Context) r0)
            boolean r0 = r0.mo44025a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r8)
            if (r0 == 0) goto L_0x0174
            com.mbridge.msdk.interactiveads.d.b r0 = r13.f15856g
            r0.mo44074a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r8)
            r13.mo44002a((java.lang.String) r4, (com.mbridge.msdk.interactiveads.p187d.C6413d) r1)
            java.lang.Object r0 = r8.get(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r9 = r0.getKeyIaUrl()
            java.lang.String r10 = r13.f15852c
            r11 = 0
            r12 = 0
            r7 = r13
            r7.mo44004a(r8, r9, r10, r11, r12)
            goto L_0x0186
        L_0x0174:
            java.lang.String r0 = r13.f15852c
            java.lang.Object r2 = r8.get(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            int r2 = r2.getKeyIaRst()
            r3.mo42961a((java.lang.String) r0, (int) r2)
        L_0x0183:
            r13.mo44002a((java.lang.String) r5, (com.mbridge.msdk.interactiveads.p187d.C6413d) r1)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interactiveads.p184a.C6386a.mo44008c():void");
    }

    /* renamed from: a */
    public final synchronized void mo44005a(List<CampaignEx> list, String str, boolean z, boolean z2) {
        List<CampaignEx> list2 = list;
        synchronized (this) {
            try {
                C7165a.C7166a aVar = new C7165a.C7166a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C6122a.m15302b().mo42895d());
                aVar.mo49055a(windVaneWebView);
                C6422a aVar2 = new C6422a((Activity) null, list2);
                aVar2.mo44122a(this.f15852c);
                aVar2.mo44125b(this.f15853d);
                aVar2.mo44121a(C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), this.f15852c));
                C6407a.f15945d = true;
                windVaneWebView.setWebViewListener(new C6395d(aVar, list2.get(0), this, this.f15856g, this.f15855f, z, z2));
                windVaneWebView.setObject(aVar2);
                windVaneWebView.loadUrl(str + "&native_adtype=" + list2.get(0).getAdType());
            } catch (Exception e) {
                if (list2 != null) {
                    if (list.size() > 0) {
                        mo43998a(list2.get(0), 1, e.getMessage());
                    }
                }
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interactiveads.a.a$d */
    /* compiled from: InteractiveAdsAdapter */
    public class C6395d extends C6532b {

        /* renamed from: a */
        C6411b f15891a;

        /* renamed from: b */
        C6410a f15892b;

        /* renamed from: c */
        boolean f15893c;

        /* renamed from: d */
        long f15894d = 0;

        /* renamed from: f */
        private C6386a f15896f;

        /* renamed from: g */
        private C7165a.C7166a f15897g;

        /* renamed from: h */
        private CampaignEx f15898h;

        /* renamed from: i */
        private boolean f15899i;

        /* renamed from: j */
        private boolean f15900j;

        /* renamed from: k */
        private boolean f15901k;

        public C6395d(C7165a.C7166a aVar, CampaignEx campaignEx, C6386a aVar2, C6411b bVar, C6410a aVar3, boolean z, boolean z2) {
            this.f15897g = aVar;
            if (aVar2 != null) {
                this.f15896f = aVar2;
            }
            this.f15898h = campaignEx;
            this.f15891a = bVar;
            this.f15892b = aVar3;
            this.f15901k = z;
            this.f15893c = z2;
            this.f15894d = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo44020a(WebView webView, int i) {
            C6407a.f15945d = false;
            if (!this.f15900j) {
                C7165a.C7166a aVar = this.f15897g;
                if (aVar != null) {
                    aVar.mo49057a(true);
                }
                this.f15900j = true;
            }
        }

        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            Context d;
            super.mo44023a(webView, str);
            try {
                C6407a.f15945d = false;
                if (!this.f15899i) {
                    boolean unused = C6386a.this.f15862m = true;
                    C6563g.m16891a().mo44521a(webView);
                    this.f15899i = true;
                    if (this.f15897g != null) {
                        this.f15897g.mo49057a(true);
                    }
                    C7165a.m18057a(288);
                    C7165a.m18062b(288, this.f15898h.getKeyIaUrl(), this.f15897g);
                    if (this.f15901k && (d = C6122a.m15302b().mo42895d()) != null && this.f15898h != null && !TextUtils.isEmpty(this.f15898h.getKeyIaUrl())) {
                        C6143d.m15367a((C6146e) C6148f.m15420a(d)).mo42987d(this.f15898h.getKeyIaUrl());
                    }
                    if (C6408a.f15950f) {
                        if (this.f15892b == null) {
                            InteractiveShowActivity interactiveShowActivity = (InteractiveShowActivity) C6407a.f15947f.get(InteractiveShowActivity.TAG);
                            if (interactiveShowActivity != null && !C6386a.this.f15861l) {
                                interactiveShowActivity.interactiveAdsMateriaShowSuccessful(this.f15898h, this.f15893c);
                                m16295a(1);
                            }
                        } else if (!C6386a.this.f15861l) {
                            this.f15892b.interactiveAdsMateriaShowSuccessful(this.f15898h, this.f15893c);
                            m16295a(1);
                        }
                    } else if (this.f15898h.getInteractiveCache().equals("onelevel") && this.f15891a != null && !C6386a.this.f15861l) {
                        C6386a.m16275g(C6386a.this);
                        this.f15891a.mo44073a(this.f15898h);
                        C6417a.m16391a(C6386a.this.f15851b, this.f15898h, C6386a.this.f15852c);
                        m16295a(1);
                    }
                }
            } catch (Exception e) {
                C6386a.this.mo43998a(this.f15898h, 1, e.getMessage());
                C6361q.m16154a("WindVaneWebView", e.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            super.mo44021a(webView, i, str, str2);
            try {
                C6386a aVar = C6386a.this;
                CampaignEx campaignEx = this.f15898h;
                aVar.mo43998a(campaignEx, 1, "webview loadUrl onReceivedError errorCode " + str);
                if (this.f15896f != null) {
                    synchronized (this.f15896f) {
                        this.f15896f = null;
                        if (!TextUtils.isEmpty(this.f15898h.getInteractiveCache()) && !this.f15898h.getInteractiveCache().equals("twolevel")) {
                            this.f15891a.mo44083d(str);
                            C6417a.m16394a(C6386a.this.f15851b, str, C6386a.this.f15852c, this.f15898h);
                            m16295a(3);
                        }
                    }
                }
            } catch (Throwable th) {
                C6386a.this.mo43998a(this.f15898h, 1, th.getMessage());
                C6361q.m16155a("WindVaneWebView", th.getMessage(), th);
            }
        }

        /* renamed from: a */
        public final void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.mo44022a(webView, sslErrorHandler, sslError);
            C6386a aVar = C6386a.this;
            CampaignEx campaignEx = this.f15898h;
            aVar.mo43998a(campaignEx, 1, "webview loadUrl SslError " + sslError);
        }

        /* renamed from: a */
        private void m16295a(int i) {
            if (this.f15898h != null) {
                C6203m mVar = new C6203m();
                mVar.mo43741k(this.f15898h.getRequestId());
                mVar.mo43743l(this.f15898h.getRequestIdNotice());
                mVar.mo43747n(this.f15898h.getId());
                mVar.mo43724c(i);
                mVar.mo43753q(String.valueOf(System.currentTimeMillis() - this.f15894d));
                mVar.mo43731f(this.f15898h.getKeyIaUrl());
                String str = (!C6369x.m16236b(this.f15898h.getKeyIaUrl()) || !this.f15898h.getKeyIaUrl().contains(".zip")) ? "2" : "1";
                mVar.mo43751p("");
                mVar.mo43733g(str);
                mVar.mo43735h(String.valueOf(this.f15898h.getAdType()));
                mVar.mo43719a(String.valueOf(this.f15898h.getKeyIaRst()));
                mVar.mo43735h("4");
                mVar.mo43718a(this.f15898h.isMraid() ? C6203m.f15357a : C6203m.f15358b);
                C6305b.m15969b(mVar, C6386a.this.f15852c);
            }
        }
    }

    /* renamed from: a */
    public final void mo44002a(final String str, final C6413d dVar) {
        try {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    C6287d d = C6386a.this.mo44009d();
                    if (d != null) {
                        String e2 = C6366u.m16219e(C6386a.this.f15852c);
                        if (!TextUtils.isEmpty(e2)) {
                            d.mo43870a("j", e2);
                        }
                    }
                    Message obtain = Message.obtain();
                    HashMap hashMap = new HashMap();
                    hashMap.put("param", d);
                    hashMap.put(ViewHierarchyConstants.TAG_KEY, str);
                    hashMap.put("loadmore", dVar);
                    obtain.obj = hashMap;
                    obtain.what = 5;
                    C6386a.this.f15863n.sendMessage(obtain);
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m16271e() {
        Handler handler = this.f15863n;
        if (handler != null) {
            handler.sendEmptyMessage(4);
        }
    }

    /* renamed from: a */
    public final void mo43999a(final CampaignUnit campaignUnit, final String str, C6413d dVar) {
        final List<CampaignEx> a = m16259a(campaignUnit);
        f15850a = a;
        if (!(a == null || a.size() <= 0 || dVar == null)) {
            dVar.mo44088a(f15850a);
        }
        if (a == null || a.size() <= 0) {
            if (str.equals("onelevel")) {
                m16271e();
            }
        } else if (!TextUtils.isEmpty(a.get(0).getKeyIaUrl())) {
            if (this.f15863n != null) {
                Message obtain = Message.obtain();
                obtain.what = 3;
                obtain.obj = str;
                this.f15863n.sendMessage(obtain);
            }
            if (campaignUnit != null) {
                String sessionId = campaignUnit.getSessionId();
                if (C6369x.m16236b(sessionId)) {
                    C6361q.m16156b("InteractiveAdsAdapter", "onload sessionId:" + sessionId);
                    C6408a.f15949c = sessionId;
                }
                if (campaignUnit.getIa_rst() == 1 && a != null) {
                    try {
                        if (a.size() > 0) {
                            this.f15854e += a.size();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C6086d a2 = C6397c.m16305a(this.f15851b).mo44027a();
                if (a2 != null && this.f15854e > a2.mo42797w()) {
                    this.f15854e = 0;
                }
                C6408a.m16347a(this.f15852c, this.f15854e);
            }
            if (dVar == null) {
                new Thread(new Runnable() {
                    public final void run() {
                        List list = a;
                        if (list != null && list.size() > 0) {
                            C6386a aVar = C6386a.this;
                            aVar.mo44003a(aVar.f15852c, (List<CampaignEx>) a, str);
                            Message obtain = Message.obtain();
                            obtain.obj = new Object[]{a, str, campaignUnit};
                            obtain.what = 6;
                            C6386a.this.f15863n.sendMessage(obtain);
                        }
                        C6152j.m15441a((C6146e) C6148f.m15420a(C6386a.this.f15851b)).mo43015b();
                        CampaignUnit campaignUnit = campaignUnit;
                        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                            C6386a.m16261a(C6386a.this, (List) campaignUnit.getAds());
                        }
                    }
                }).start();
            }
        } else if (str.equals("onelevel")) {
            m16271e();
        }
    }

    /* renamed from: com.mbridge.msdk.interactiveads.a.a$c */
    /* compiled from: InteractiveAdsAdapter */
    private final class C6394c implements C7191g.C7199d {

        /* renamed from: a */
        Context f15885a;

        /* renamed from: b */
        String f15886b;

        /* renamed from: d */
        private List<CampaignEx> f15888d;

        /* renamed from: e */
        private String f15889e;

        /* renamed from: f */
        private C6086d f15890f;

        public C6394c(List<CampaignEx> list, Context context, String str, C6086d dVar, String str2) {
            this.f15889e = str;
            this.f15888d = list;
            this.f15890f = dVar;
            this.f15885a = context;
            this.f15886b = str2;
        }

        /* renamed from: a */
        public final void mo44018a(String str) {
            C6143d.m15367a((C6146e) C6148f.m15420a(this.f15885a)).mo42987d(this.f15888d.get(0).getKeyIaUrl());
            if (this.f15886b.equals("onelevel")) {
                C6386a.this.mo44004a(this.f15888d, str, this.f15889e, this.f15890f, false);
                C6386a.this.f15856g.mo44070a(1);
            }
            boolean unused = C6386a.this.f15857h = false;
            CampaignEx campaignEx = this.f15888d.get(0);
            long currentTimeMillis = System.currentTimeMillis() - C6386a.this.f15859j;
            if (campaignEx != null) {
                new C6393b(campaignEx, currentTimeMillis, true, this.f15885a, "").start();
            }
        }

        /* renamed from: a */
        public final void mo44019a(String str, String str2) {
            if (this.f15886b.equals("onelevel")) {
                C6386a.this.f15856g.mo44081c(str);
                C6386a.this.f15856g.mo44070a(0);
                C6417a.m16394a(C6386a.this.f15851b, "errorMsg", C6386a.this.f15852c, this.f15888d.get(0));
            }
            boolean unused = C6386a.this.f15857h = false;
            CampaignEx campaignEx = this.f15888d.get(0);
            long currentTimeMillis = System.currentTimeMillis() - C6386a.this.f15859j;
            if (campaignEx != null) {
                new C6393b(campaignEx, currentTimeMillis, false, this.f15885a, str).start();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interactiveads.a.a$b */
    /* compiled from: InteractiveAdsAdapter */
    class C6393b extends Thread {

        /* renamed from: b */
        private CampaignEx f15880b;

        /* renamed from: c */
        private long f15881c;

        /* renamed from: d */
        private boolean f15882d;

        /* renamed from: e */
        private Context f15883e;

        /* renamed from: f */
        private String f15884f;

        public C6393b(CampaignEx campaignEx, long j, boolean z, Context context, String str) {
            this.f15880b = campaignEx;
            this.f15881c = j;
            this.f15882d = z;
            this.f15883e = context;
            this.f15884f = str;
        }

        public final void run() {
            String str;
            super.run();
            CampaignEx campaignEx = this.f15880b;
            if (campaignEx != null) {
                try {
                    if (campaignEx.getCampaignUnitId() == null) {
                        str = C6386a.this.f15852c;
                    } else {
                        str = this.f15880b.getCampaignUnitId();
                    }
                    C6203m mVar = new C6203m("2000043", this.f15882d ? 1 : 3, String.valueOf(this.f15881c), this.f15880b.getendcard_url(), this.f15880b.getId(), str, this.f15882d ? "" : this.f15884f, String.valueOf(this.f15880b.getKeyIaRst()));
                    mVar.mo43747n(this.f15880b.getId());
                    mVar.mo43741k(this.f15880b.getRequestId());
                    mVar.mo43743l(this.f15880b.getRequestIdNotice());
                    mVar.mo43735h("4");
                    mVar.mo43719a(String.valueOf(this.f15880b.getKeyIaRst()));
                    mVar.mo43731f(this.f15880b.getKeyIaUrl());
                    mVar.mo43721b(C6349m.m16123n(this.f15883e));
                    C6305b.m15965a(mVar, C6386a.this.f15852c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo44004a(List<CampaignEx> list, String str, String str2, C6086d dVar, boolean z) {
        int i;
        try {
            if (!TextUtils.isEmpty(str)) {
                Object[] objArr = new Object[5];
                if (str.contains("zip")) {
                    str = C7191g.m18286a().mo49220b(str);
                    i = 16;
                } else {
                    i = 9;
                }
                Message obtain = Message.obtain();
                obtain.what = i;
                objArr[0] = list;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = dVar;
                objArr[4] = Boolean.valueOf(z);
                obtain.obj = objArr;
                this.f15863n.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.interactiveads.a.a$a */
    /* compiled from: InteractiveAdsAdapter */
    private static final class C6392a implements C6219c {

        /* renamed from: a */
        private C6386a f15876a;

        /* renamed from: b */
        private CampaignUnit f15877b;

        /* renamed from: c */
        private String f15878c;

        public final void onFailedLoad(String str, String str2) {
        }

        public final void onSuccessLoad(Bitmap bitmap, String str) {
        }

        public C6392a(C6386a aVar, CampaignUnit campaignUnit, String str) {
            if (aVar != null) {
                this.f15876a = aVar;
            }
            this.f15877b = campaignUnit;
            this.f15878c = str;
        }
    }

    /* renamed from: a */
    public final void mo43998a(CampaignEx campaignEx, int i, String str) {
        if (campaignEx != null && campaignEx.getKeyIaRst() == 1) {
            C6305b.m15970c(new C6203m("2000062", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), this.f15852c, C6349m.m16123n(C6122a.m15302b().mo42895d()), i, str), this.f15851b, this.f15852c);
        }
    }

    /* renamed from: a */
    public final void mo44003a(String str, List<CampaignEx> list, String str2) {
        C6143d a;
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                for (CampaignEx next : list) {
                    if (str2.equals("twolevel")) {
                        next.setInteractiveCache("twolevel");
                    } else if (str2.equals("onelevel")) {
                        next.setInteractiveCache("onelevel");
                    }
                    if (next != null) {
                        try {
                            if (!TextUtils.isEmpty(str) && (a = C6143d.m15367a((C6146e) C6148f.m15420a(this.f15851b))) != null) {
                                a.mo42975b(next, str, 0);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    C6150h.m15433a((C6146e) C6148f.m15420a(this.f15851b)).mo43009a(new C6194d(Long.parseLong(next.getId()), System.currentTimeMillis(), next.getKeyIaRst(), 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m16259a(CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    for (int i = 0; i < ads.size(); i++) {
                        CampaignEx campaignEx = ads.get(i);
                        if (!(campaignEx == null || campaignEx.getOfferType() == 99)) {
                            if (C6366u.m16209b(campaignEx)) {
                                campaignEx.setRtinsType(C6366u.m16214c(this.f15851b, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (campaignEx.getWtick() != 1 && C6366u.m16214c(this.f15851b, campaignEx.getPackageName())) {
                                if (!C6366u.m16209b(campaignEx)) {
                                    C6366u.m16197a(this.f15852c, campaignEx, C6204a.f15411u);
                                }
                            }
                            campaignEx.setKeyIaIcon(campaignUnit.getIa_icon());
                            campaignEx.setKeyIaUrl(campaignUnit.getIa_url());
                            campaignEx.setKeyIaRst(campaignUnit.getIa_rst());
                            campaignEx.setKeyIaOri(campaignUnit.getIa_ori());
                            campaignEx.setAdType(campaignUnit.getAdType());
                            arrayList.add(campaignEx);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private int m16273f() {
        try {
            int a = C6369x.m16236b(this.f15852c) ? C6408a.m16345a(this.f15852c) : 0;
            if (C6397c.m16305a(this.f15851b).mo44027a() == null) {
                return 0;
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: d */
    public final C6287d mo44009d() {
        int i;
        String e = C6122a.m15302b().mo42896e();
        String md5 = SameMD5.getMD5(C6122a.m15302b().mo42896e() + C6122a.m15302b().mo42897f());
        C6287d dVar = new C6287d();
        C6275b.m15859a(dVar, "app_id", e);
        C6275b.m15859a(dVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f15852c);
        if (!TextUtils.isEmpty(this.f15853d)) {
            C6275b.m15859a(dVar, MBridgeConstans.PLACEMENT_ID, this.f15853d);
        }
        C6275b.m15859a(dVar, "sign", md5);
        C6275b.m15859a(dVar, "ad_num", "1");
        C6275b.m15859a(dVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        C6275b.m15859a(dVar, "ad_type", String.valueOf(288));
        C6275b.m15859a(dVar, C6287d.f15599b, C6208d.m15701a(this.f15852c, "interactive"));
        C6275b.m15859a(dVar, C6287d.f15600c, C6397c.m16305a(this.f15851b).mo44030b());
        C6275b.m15859a(dVar, "keyword", "");
        C6275b.m15859a(dVar, "offset", String.valueOf(m16273f()));
        C6275b.m15859a(dVar, "only_impression", "1");
        C6275b.m15859a(dVar, "orientation", String.valueOf(C6349m.m16102d(this.f15851b)));
        C6275b.m15859a(dVar, "ping_mode", "1");
        C6275b.m15859a(dVar, "tnum", "1");
        C6275b.m15859a(dVar, "ia_c_ads", C6397c.m16305a(this.f15851b).mo44031b(this.f15852c, 1));
        List<CampaignEx> a = C6397c.m16305a(this.f15851b).mo44028a(this.f15852c, 1);
        int i2 = 0;
        if (a != null) {
            i = a.get(0).getKeyIaRst();
        } else {
            i = 0;
        }
        C6275b.m15859a(dVar, "ia_c_rst", String.valueOf(i));
        C6275b.m15859a(dVar, "ia_dp_rst", C6397c.m16305a(this.f15851b).mo44032c());
        C6397c.m16305a(this.f15851b);
        String b = C6121a.m15293a().mo42882b(C6407a.f15942a);
        C6275b.m15859a(dVar, "ia_req_a", String.valueOf((b == null || b.equals("")) ? 0 : Integer.parseInt(C6121a.m15293a().mo42882b(C6407a.f15942a))));
        C6397c.m16305a(this.f15851b);
        String b2 = C6121a.m15293a().mo42882b(C6407a.f15943b);
        C6275b.m15859a(dVar, "ia_req_b", String.valueOf((b2 == null || b2.equals("")) ? 0 : Integer.parseInt(C6121a.m15293a().mo42882b(C6407a.f15943b))));
        if (C6397c.m16305a(this.f15851b).mo44033d()) {
            i2 = 2;
        }
        C6275b.m15859a(dVar, "ia_rst", String.valueOf(i2));
        C6275b.m15859a(dVar, "ia_lm", String.valueOf(C6397c.m16305a(this.f15851b).mo44033d() ? 1 : 0));
        return dVar;
    }

    /* renamed from: g */
    static /* synthetic */ void m16275g(C6386a aVar) {
        CountDownTimer countDownTimer = aVar.f15860k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            aVar.f15860k = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16262a(C6386a aVar, List list, String str) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            String keyIaUrl = campaignEx.getKeyIaUrl();
            if (TextUtils.isEmpty(keyIaUrl)) {
                return;
            }
            if (!keyIaUrl.contains(".zip") || !keyIaUrl.contains("md5filename")) {
                if (str.equals("onelevel")) {
                    aVar.mo44005a(list, keyIaUrl, true, false);
                    aVar.f15856g.mo44070a(1);
                } else {
                    C6143d.m15367a((C6146e) C6148f.m15420a(aVar.f15851b)).mo42987d(campaignEx.getKeyIaUrl());
                }
                aVar.f15857h = false;
                return;
            }
            C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), aVar.f15852c);
            if (str.equals("onelevel")) {
                aVar.f15857h = true;
            }
            aVar.f15859j = System.currentTimeMillis();
            C7191g.m18286a().mo49221b(keyIaUrl, new C6394c(list, aVar.f15851b, aVar.f15852c, e, str));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16260a(C6386a aVar, CampaignUnit campaignUnit) {
        if (campaignUnit != null && !TextUtils.isEmpty(campaignUnit.getIa_icon())) {
            C6216b.m15729a(C6122a.m15302b().mo42895d()).mo43786a(campaignUnit.getIa_icon(), (C6219c) new C6392a(aVar, campaignUnit, aVar.f15852c));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16261a(C6386a aVar, List list) {
        if (aVar.f15851b != null && list != null && list.size() != 0) {
            C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(aVar.f15851b));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo43013a(campaignEx.getId()))) {
                    C6196f fVar = new C6196f();
                    fVar.mo43631a(campaignEx.getId());
                    fVar.mo43629a(campaignEx.getFca());
                    fVar.mo43633b(campaignEx.getFcb());
                    fVar.mo43637d(0);
                    fVar.mo43635c(0);
                    fVar.mo43630a(System.currentTimeMillis());
                    a.mo43012a(fVar);
                }
            }
        }
    }
}

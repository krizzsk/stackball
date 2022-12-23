package com.mbridge.msdk.interstitial.p192c;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitial.p190a.C6429a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6083c;
import com.mbridge.msdk.p158b.C6086d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.interstitial.c.a */
/* compiled from: InterstitialController */
public final class C6434a {

    /* renamed from: a */
    public static String f16016a;

    /* renamed from: c */
    public static Map<String, Integer> f16017c = new HashMap();

    /* renamed from: d */
    public static Map<String, Integer> f16018d = new HashMap();

    /* renamed from: e */
    public static Map<String, C6438c> f16019e = new HashMap();

    /* renamed from: b */
    public boolean f16020b = false;

    /* renamed from: f */
    private String f16021f = "InterstitialController";

    /* renamed from: g */
    private Context f16022g;

    /* renamed from: h */
    private String f16023h;

    /* renamed from: i */
    private String f16024i;

    /* renamed from: j */
    private String f16025j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MBridgeIds f16026k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f16027l;

    /* renamed from: m */
    private C6086d f16028m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public InterstitialListener f16029n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f16030o = "";

    /* renamed from: p */
    private String f16031p = "";

    /* renamed from: q */
    private boolean f16032q = false;

    /* renamed from: a */
    public static void m16456a(String str, int i) {
        try {
            if (f16017c != null && !TextUtils.isEmpty(str)) {
                f16017c.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m16451a(String str) {
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || f16017c == null || !f16017c.containsKey(str) || (num = f16017c.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo44155a(InterstitialListener interstitialListener) {
        this.f16029n = interstitialListener;
    }

    public C6434a() {
        try {
            this.f16027l = new Handler(Looper.getMainLooper()) {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r6) {
                    /*
                        r5 = this;
                        if (r6 != 0) goto L_0x0003
                        return
                    L_0x0003:
                        int r0 = r6.what
                        r1 = 1
                        if (r0 == r1) goto L_0x00ce
                        r2 = 2
                        java.lang.String r3 = "can't show because unknow error"
                        java.lang.String r4 = ""
                        if (r0 == r2) goto L_0x009f
                        r2 = 3
                        if (r0 == r2) goto L_0x0083
                        r1 = 4
                        if (r0 == r1) goto L_0x0054
                        r6 = 6
                        if (r0 == r6) goto L_0x003b
                        r6 = 7
                        if (r0 == r6) goto L_0x001d
                        goto L_0x00e5
                    L_0x001d:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        r0 = 0
                        r6.f16020b = r0
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f16026k
                        r6.onInterstitialClosed(r0)
                        goto L_0x00e5
                    L_0x003b:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f16026k
                        r6.onInterstitialAdClick(r0)
                        goto L_0x00e5
                    L_0x0054:
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r0 = r0.f16029n
                        if (r0 == 0) goto L_0x00e5
                        java.lang.Object r0 = r6.obj
                        if (r0 == 0) goto L_0x006b
                        java.lang.Object r0 = r6.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x006b
                        java.lang.Object r6 = r6.obj
                        r4 = r6
                        java.lang.String r4 = (java.lang.String) r4
                    L_0x006b:
                        boolean r6 = android.text.TextUtils.isEmpty(r4)
                        if (r6 == 0) goto L_0x0072
                        goto L_0x0073
                    L_0x0072:
                        r3 = r4
                    L_0x0073:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f16026k
                        r6.onInterstitialShowFail(r0, r3)
                        goto L_0x00e5
                    L_0x0083:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        r6.f16020b = r1
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f16026k
                        r6.onInterstitialShowSuccess(r0)
                        goto L_0x00e5
                    L_0x009f:
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r0 = r0.f16029n
                        if (r0 == 0) goto L_0x00e5
                        java.lang.Object r0 = r6.obj
                        if (r0 == 0) goto L_0x00b6
                        java.lang.Object r0 = r6.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x00b6
                        java.lang.Object r6 = r6.obj
                        r4 = r6
                        java.lang.String r4 = (java.lang.String) r4
                    L_0x00b6:
                        boolean r6 = android.text.TextUtils.isEmpty(r4)
                        if (r6 == 0) goto L_0x00bd
                        goto L_0x00be
                    L_0x00bd:
                        r3 = r4
                    L_0x00be:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f16026k
                        r6.onInterstitialLoadFail(r0, r3)
                        goto L_0x00e5
                    L_0x00ce:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f16029n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p192c.C6434a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f16026k
                        r6.onInterstitialLoadSuccess(r0)
                    L_0x00e5:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interstitial.p192c.C6434a.C64351.handleMessage(android.os.Message):void");
                }
            };
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo44156a(Context context, Map<String, Object> map) {
        try {
            this.f16032q = false;
            if (!(map == null || context == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID))) {
                if (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) {
                    if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                        this.f16025j = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                    }
                    this.f16023h = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    this.f16022g = context;
                    if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                        this.f16024i = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    }
                    this.f16026k = new MBridgeIds(this.f16024i, this.f16023h);
                    this.f16032q = true;
                    return this.f16032q;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            this.f16032q = false;
        }
    }

    /* renamed from: a */
    public final void mo44154a() {
        try {
            if (this.f16022g == null) {
                m16460b("context is null");
            } else if (TextUtils.isEmpty(this.f16023h)) {
                m16460b("unitid is null");
            } else if (!this.f16032q) {
                m16460b("init error");
            } else {
                m16465d();
                try {
                    if (this.f16028m != null) {
                        int r = this.f16028m.mo42791r();
                        int w = this.f16028m.mo42797w();
                        if (r <= 0) {
                            r = 1;
                        }
                        if (w <= 0) {
                            w = 1;
                        }
                        int i = w * r;
                        if (f16018d != null && !TextUtils.isEmpty(this.f16023h)) {
                            f16018d.put(this.f16023h, Integer.valueOf(i));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                m16457a(false);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m16460b("can't show because unknow error");
        }
    }

    /* renamed from: b */
    public final String mo44157b() {
        if (this.f16020b) {
            return this.f16031p;
        }
        return this.f16030o;
    }

    /* renamed from: c */
    public final void mo44158c() {
        try {
            if (this.f16022g == null) {
                m16464c("context is null");
            } else if (TextUtils.isEmpty(this.f16023h)) {
                m16464c("unitid is null");
            } else if (!this.f16032q) {
                m16464c("init error");
            } else {
                m16465d();
                m16461b(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m16464c("can't show because unknow error");
        }
    }

    /* renamed from: d */
    private void m16465d() {
        try {
            m16467e();
            C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), this.f16023h);
            this.f16028m = e;
            if (e == null) {
                this.f16028m = C6086d.m15136f(this.f16023h);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m16457a(boolean z) {
        try {
            C6429a aVar = new C6429a(this.f16022g, this.f16023h, this.f16024i, this.f16025j, z);
            C6437b bVar = new C6437b(aVar);
            aVar.mo44142a(new C6436a(aVar, bVar));
            if (this.f16027l != null) {
                this.f16027l.postDelayed(bVar, 30000);
            }
            aVar.mo44143b();
        } catch (Exception e) {
            e.printStackTrace();
            if (!z) {
                m16460b("can't show because unknow error");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16461b(boolean z) {
        try {
            CampaignEx a = new C6429a(this.f16022g, this.f16023h, this.f16024i, this.f16025j, true).mo44141a();
            if (a != null) {
                m16453a(a);
            } else if (z) {
                m16457a(true);
            } else {
                m16464c("no ads available can show");
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f16029n != null) {
                m16464c("can't show because unknow error");
            }
        }
    }

    /* renamed from: a */
    private void m16453a(CampaignEx campaignEx) {
        C6438c cVar = new C6438c();
        if (f16019e != null && !TextUtils.isEmpty(this.f16023h)) {
            f16019e.put(this.f16023h, cVar);
        }
        Intent intent = new Intent(this.f16022g, MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f16023h)) {
            intent.putExtra("unitId", this.f16023h);
        }
        if (campaignEx != null) {
            this.f16031p = campaignEx.getRequestId();
            intent.putExtra("campaign", campaignEx);
        }
        Context context = this.f16022g;
        if (context != null) {
            context.startActivity(intent);
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$b */
    /* compiled from: InterstitialController */
    public class C6437b implements Runnable {

        /* renamed from: b */
        private C6429a f16038b;

        public C6437b(C6429a aVar) {
            this.f16038b = aVar;
        }

        public final void run() {
            try {
                if (this.f16038b != null) {
                    if (this.f16038b.mo44144c()) {
                        C6434a.this.m16464c("load timeout");
                    } else if (C6434a.this.f16029n != null) {
                        C6434a.this.m16460b("load timeout");
                    }
                    this.f16038b.mo44142a((C6436a) null);
                    this.f16038b = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$a */
    /* compiled from: InterstitialController */
    public class C6436a {

        /* renamed from: b */
        private C6429a f16035b;

        /* renamed from: c */
        private C6437b f16036c;

        public C6436a(C6429a aVar, C6437b bVar) {
            this.f16035b = aVar;
            this.f16036c = bVar;
        }

        /* renamed from: a */
        public final void mo44160a(boolean z, String str) {
            try {
                String unused = C6434a.this.f16030o = str;
                if (this.f16036c != null) {
                    if (C6434a.this.f16027l != null) {
                        C6434a.this.f16027l.removeCallbacks(this.f16036c);
                    }
                    if (z) {
                        C6434a.this.m16461b(false);
                    } else if (C6434a.this.f16029n != null) {
                        C6434a.m16466d(C6434a.this);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo44161b(boolean z, String str) {
            try {
                if (this.f16035b != null) {
                    this.f16035b.mo44142a((C6436a) null);
                    this.f16035b = null;
                }
                if (this.f16036c != null) {
                    if (C6434a.this.f16027l != null) {
                        C6434a.this.f16027l.removeCallbacks(this.f16036c);
                    }
                    if (z) {
                        if (C6434a.this.f16029n != null) {
                            C6434a.this.m16464c(str);
                        }
                    } else if (C6434a.this.f16029n != null) {
                        C6434a.this.m16460b(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$c */
    /* compiled from: InterstitialController */
    public class C6438c {
        public C6438c() {
        }

        /* renamed from: a */
        public final void mo44164a(String str) {
            try {
                C6434a.this.m16464c(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public final void mo44163a() {
            try {
                C6434a.m16468e(C6434a.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo44165b() {
            try {
                if (C6434a.this.f16027l != null) {
                    C6434a.this.f16027l.sendEmptyMessage(7);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public final void mo44166c() {
            try {
                if (C6434a.this.f16027l != null) {
                    C6434a.this.f16027l.sendEmptyMessage(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16460b(String str) {
        try {
            if (this.f16027l != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 2;
                this.f16027l.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16464c(String str) {
        try {
            if (this.f16027l != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.f16027l.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m16467e() {
        try {
            new C6083c().mo42767a(this.f16022g, (String) null, (String) null, this.f16023h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m16466d(C6434a aVar) {
        Handler handler = aVar.f16027l;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m16468e(C6434a aVar) {
        Handler handler = aVar.f16027l;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }
}

package com.mbridge.msdk.mbbanner.p195a;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.tools.C6371z;
import com.mbridge.msdk.mbbanner.common.p196a.C6465b;
import com.mbridge.msdk.mbbanner.common.p197b.C6469b;
import com.mbridge.msdk.mbbanner.common.p197b.C6470c;
import com.mbridge.msdk.mbbanner.common.p198c.C6482a;
import com.mbridge.msdk.mbbanner.common.p198c.C6489c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6083c;
import com.mbridge.msdk.p158b.C6086d;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.a.a */
/* compiled from: BannerController */
public final class C6461a {

    /* renamed from: a */
    private static String f16079a = "BannerController";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f16080b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f16081c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MBridgeIds f16082d;

    /* renamed from: e */
    private boolean f16083e;

    /* renamed from: f */
    private int f16084f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MBBannerView f16085g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f16086h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f16087i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f16088j;

    /* renamed from: k */
    private int f16089k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public BannerAdListener f16090l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public CampaignUnit f16091m;

    /* renamed from: n */
    private C6489c f16092n;

    /* renamed from: o */
    private C6086d f16093o;

    /* renamed from: p */
    private C6083c f16094p;

    /* renamed from: q */
    private boolean f16095q;

    /* renamed from: r */
    private boolean f16096r;

    /* renamed from: s */
    private boolean f16097s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f16098t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f16099u;

    /* renamed from: v */
    private C6470c f16100v = new C6470c() {
        /* renamed from: a */
        public final void mo44262a(List<CampaignEx> list) {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onLoadSuccessed(C6461a.this.f16082d);
            }
        }

        /* renamed from: a */
        public final void mo44260a(CampaignEx campaignEx) {
            C6461a.this.mo44255c();
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onLogImpression(C6461a.this.f16082d);
            }
        }

        /* renamed from: a */
        public final void mo44261a(String str) {
            C6461a.this.m16533b(str);
        }

        /* renamed from: a */
        public final void mo44259a() {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onClick(C6461a.this.f16082d);
            }
        }

        /* renamed from: b */
        public final void mo44263b() {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onLeaveApp(C6461a.this.f16082d);
            }
        }

        /* renamed from: c */
        public final void mo44264c() {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.showFullScreen(C6461a.this.f16082d);
                boolean unused = C6461a.this.f16099u = true;
                C6482a.m16648a().mo44317a(2, C6461a.this.f16081c, C6461a.this.f16080b, (C6465b) null, (C6469b) null);
            }
        }

        /* renamed from: d */
        public final void mo44265d() {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.closeFullScreen(C6461a.this.f16082d);
                boolean unused = C6461a.this.f16099u = false;
                C6482a a = C6482a.m16648a();
                String c = C6461a.this.f16081c;
                String d = C6461a.this.f16080b;
                a.mo44317a(3, c, d, new C6465b(C6461a.this.f16087i + "x" + C6461a.this.f16086h, C6461a.this.f16088j * 1000), C6461a.this.f16101w);
            }
        }

        /* renamed from: e */
        public final void mo44266e() {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onCloseBanner(C6461a.this.f16082d);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C6469b f16101w = new C6469b() {
        /* renamed from: a */
        public final void mo44267a(String str, CampaignUnit campaignUnit, boolean z) {
            CampaignUnit unused = C6461a.this.f16091m = campaignUnit;
        }

        /* renamed from: a */
        public final void mo44268a(String str, String str2, boolean z) {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onLoadFailed(C6461a.this.f16082d, str2);
            }
            C6461a.this.mo44255c();
            C6323d.m16038a(C6122a.m15302b().mo42895d(), str2, C6461a.this.f16080b, z);
        }

        /* renamed from: a */
        public final void mo44269a(String str, boolean z) {
            if (C6461a.this.f16091m != null) {
                C6323d.m16039a(C6122a.m15302b().mo42895d(), (List<CampaignEx>) C6461a.this.f16091m.getAds(), C6461a.this.f16080b, z);
            }
            if (C6461a.this.f16085g != null) {
                boolean unused = C6461a.this.f16098t = true;
                C6461a.this.m16541g();
            }
        }

        /* renamed from: b */
        public final void mo44270b(String str, boolean z) {
            if (C6461a.this.f16090l != null) {
                C6461a.this.f16090l.onLoadFailed(C6461a.this.f16082d, "banner res load failed");
            }
            C6461a.this.mo44255c();
            C6323d.m16038a(C6122a.m15302b().mo42895d(), "banner res load failed", C6461a.this.f16080b, z);
        }
    };

    /* renamed from: b */
    private int m16531b(int i) {
        if (i <= 0) {
            return i;
        }
        if (i < 10) {
            return 10;
        }
        if (i > 180) {
            return 180;
        }
        return i;
    }

    /* renamed from: a */
    public final String mo44246a() {
        CampaignUnit campaignUnit = this.f16091m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f16091m.getRequestId();
    }

    public C6461a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f16085g = mBBannerView;
        if (bannerSize != null) {
            this.f16086h = bannerSize.getHeight();
            this.f16087i = bannerSize.getWidth();
        }
        this.f16080b = str2;
        this.f16081c = str;
        this.f16082d = new MBridgeIds(str, str2);
        String e = C6122a.m15302b().mo42896e();
        String f = C6122a.m15302b().mo42897f();
        if (this.f16094p == null) {
            this.f16094p = new C6083c();
        }
        this.f16094p.mo42767a(C6122a.m15302b().mo42895d(), e, f, this.f16080b);
        m16539f();
    }

    /* renamed from: a */
    public final void mo44250a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f16086h = bannerSize.getHeight();
            this.f16087i = bannerSize.getWidth();
        }
    }

    /* renamed from: a */
    public final void mo44247a(int i) {
        int b = m16531b(i);
        this.f16089k = b;
        this.f16088j = b;
    }

    /* renamed from: a */
    public final void mo44252a(boolean z) {
        this.f16083e = z;
        this.f16084f = z ? 1 : 2;
    }

    /* renamed from: f */
    private void m16539f() {
        C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), this.f16080b);
        this.f16093o = e;
        if (e == null) {
            this.f16093o = C6086d.m15134d(this.f16080b);
        }
        if (this.f16089k == -1) {
            this.f16088j = m16531b(this.f16093o.mo42773b());
        }
        if (this.f16084f == 0) {
            boolean z = true;
            if (this.f16093o.mo42775c() != 1) {
                z = false;
            }
            this.f16083e = z;
            C6489c cVar = this.f16092n;
            if (cVar != null) {
                cVar.mo44333a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo44251a(String str) {
        if (this.f16086h < 1 || this.f16087i < 1) {
            BannerAdListener bannerAdListener = this.f16090l;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.f16082d, "banner load failed because params are exception");
                return;
            }
            return;
        }
        C6465b bVar = new C6465b(this.f16087i + "x" + this.f16086h, this.f16088j * 1000);
        bVar.mo44282a(str);
        bVar.mo44284b(this.f16081c);
        C6482a.m16648a().mo44319a(this.f16081c, this.f16080b, bVar, this.f16101w);
        C6482a.m16648a().mo44317a(1, this.f16081c, this.f16080b, bVar, this.f16101w);
    }

    /* renamed from: a */
    public final void mo44249a(BannerAdListener bannerAdListener) {
        this.f16090l = bannerAdListener;
    }

    /* renamed from: b */
    public final void mo44253b() {
        this.f16097s = true;
        if (this.f16090l != null) {
            this.f16090l = null;
        }
        if (this.f16101w != null) {
            this.f16101w = null;
        }
        if (this.f16100v != null) {
            this.f16100v = null;
        }
        if (this.f16085g != null) {
            this.f16085g = null;
        }
        C6482a.m16648a().mo44317a(4, this.f16081c, this.f16080b, (C6465b) null, (C6469b) null);
        C6482a.m16648a().mo44318a(this.f16080b);
        C6482a.m16648a().mo44320b();
        C6489c cVar = this.f16092n;
        if (cVar != null) {
            cVar.mo44329a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m16541g() {
        if (!this.f16097s && this.f16098t) {
            if (this.f16091m != null) {
                if (this.f16092n == null) {
                    this.f16092n = new C6489c(this.f16085g, this.f16100v, this.f16081c, this.f16080b, this.f16083e, this.f16093o);
                }
                this.f16092n.mo44335b(this.f16095q);
                this.f16092n.mo44336c(this.f16096r);
                this.f16092n.mo44334a(this.f16083e, this.f16084f);
                this.f16092n.mo44332a(this.f16091m);
            } else {
                m16533b("banner show failed because campain is exception");
            }
            this.f16098t = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16533b(String str) {
        BannerAdListener bannerAdListener = this.f16090l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f16082d, str);
        }
        mo44255c();
    }

    /* renamed from: c */
    public final void mo44255c() {
        if (!this.f16097s) {
            m16543h();
            m16539f();
            C6465b bVar = new C6465b(this.f16087i + "x" + this.f16086h, this.f16088j * 1000);
            bVar.mo44284b(this.f16081c);
            C6482a.m16648a().mo44321b(this.f16081c, this.f16080b, bVar, this.f16101w);
        }
    }

    /* renamed from: b */
    public final void mo44254b(boolean z) {
        this.f16095q = z;
        m16545i();
        m16541g();
    }

    /* renamed from: c */
    public final void mo44256c(boolean z) {
        this.f16096r = z;
        m16545i();
    }

    /* renamed from: h */
    private void m16543h() {
        MBBannerView mBBannerView = this.f16085g;
        if (mBBannerView != null) {
            if (!this.f16095q || !this.f16096r || this.f16099u || C6371z.m16240a(mBBannerView)) {
                C6482a.m16648a().mo44317a(2, this.f16081c, this.f16080b, (C6465b) null, (C6469b) null);
            } else {
                C6482a a = C6482a.m16648a();
                String str = this.f16081c;
                String str2 = this.f16080b;
                a.mo44317a(3, str, str2, new C6465b(this.f16087i + "x" + this.f16086h, this.f16088j * 1000), this.f16101w);
            }
            if (!this.f16095q) {
                C6482a.m16648a().mo44317a(4, this.f16081c, this.f16080b, (C6465b) null, (C6469b) null);
                C6482a.m16648a().mo44318a(this.f16080b);
            }
        }
    }

    /* renamed from: i */
    private void m16545i() {
        m16543h();
        C6489c cVar = this.f16092n;
        if (cVar != null) {
            cVar.mo44335b(this.f16095q);
            this.f16092n.mo44336c(this.f16096r);
        }
    }

    /* renamed from: a */
    public final void mo44248a(int i, int i2, int i3, int i4) {
        C6489c cVar = this.f16092n;
        if (cVar != null) {
            cVar.mo44330a(i, i2, i3, i4);
        }
    }

    /* renamed from: d */
    public final void mo44257d() {
        C6482a a = C6482a.m16648a();
        String str = this.f16081c;
        String str2 = this.f16080b;
        a.mo44317a(4, str, str2, new C6465b(this.f16087i + "x" + this.f16086h, this.f16088j * 1000), this.f16101w);
    }

    /* renamed from: e */
    public final void mo44258e() {
        C6482a a = C6482a.m16648a();
        String str = this.f16081c;
        String str2 = this.f16080b;
        a.mo44317a(3, str, str2, new C6465b(this.f16087i + "x" + this.f16086h, this.f16088j * 1000), this.f16101w);
    }
}

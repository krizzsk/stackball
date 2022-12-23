package com.fyber.inneractive.sdk.p050i;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.mraidkit.C2674R;
import com.fyber.inneractive.sdk.config.C2801o;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2837h;
import com.fyber.inneractive.sdk.p037d.C2853m;
import com.fyber.inneractive.sdk.p045e.C2899b;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3019f;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.p084ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3630ak;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3681t;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.fyber.inneractive.sdk.i.d */
public final class C2997d extends C2837h<C2853m, InneractiveAdViewEventsListener> implements C2899b, C3681t.C3684b {

    /* renamed from: h */
    InneractiveAdViewUnitController f7293h;

    /* renamed from: i */
    IAmraidWebViewController f7294i;

    /* renamed from: j */
    C3039d.C3051c f7295j;

    /* renamed from: k */
    boolean f7296k = false;

    /* renamed from: l */
    ViewGroup f7297l;

    /* renamed from: m */
    FrameLayout f7298m;

    /* renamed from: n */
    private long f7299n = 0;

    /* renamed from: o */
    private long f7300o = 0;

    /* renamed from: p */
    private Runnable f7301p;

    /* renamed from: q */
    private int f7302q = 0;

    /* renamed from: r */
    private long f7303r = 0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7304s = false;

    /* renamed from: t */
    private boolean f7305t = true;

    /* renamed from: u */
    private boolean f7306u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C2992b f7307v;

    /* renamed from: d */
    public final void mo18237d() {
    }

    /* renamed from: f */
    public final void mo18239f() {
    }

    /* renamed from: com.fyber.inneractive.sdk.i.d$b */
    public enum C3002b {
        BANNER_WIDTH(320),
        BANNER_HEIGHT(50),
        BANNER_TABLET_HEIGHT(90),
        BANNER_TABLET_WIDTH(728),
        RECTANGLE_HEIGHT(250),
        RECTANGLE_WIDTH(ErrorCode.GENERAL_WRAPPER_ERROR);
        

        /* renamed from: g */
        final int f7319g;

        private C3002b(int i) {
            this.f7319g = i;
        }
    }

    /* renamed from: a */
    public final boolean mo18234a(C2836g gVar) {
        return gVar instanceof C2853m;
    }

    /* JADX WARNING: type inference failed for: r11v15, types: [com.fyber.inneractive.sdk.j.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18232a(android.view.ViewGroup r11) {
        /*
            r10 = this;
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r10.f6748a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r10)
            r11[r2] = r0
            java.lang.String r0 = "%sYou must set the spot to render before calling renderAd"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r11)
            return
        L_0x0014:
            r10.f7296k = r2
            r10.f6753f = r2
            java.lang.String r0 = "InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s"
            if (r11 == 0) goto L_0x0029
            r10.f7297l = r11
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r11 = r10.f6748a
            com.fyber.inneractive.sdk.external.InneractiveUnitController r11 = r11.getSelectedUnitController()
            com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController r11 = (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) r11
            r10.f7293h = r11
            goto L_0x0058
        L_0x0029:
            boolean r11 = r10.f7306u
            if (r11 != 0) goto L_0x0058
            r10.m6736a()
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r11 = r10.f6748a
            com.fyber.inneractive.sdk.d.g r11 = r11.getAdContent()
            boolean r11 = r11 instanceof com.fyber.inneractive.sdk.p037d.C2853m
            if (r11 == 0) goto L_0x004a
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r11 = r10.f6748a
            com.fyber.inneractive.sdk.d.g r11 = r11.getAdContent()
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            r10.f6749b = r11
            r10.f6752e = r2
            super.mo18144f_()
            goto L_0x0058
        L_0x004a:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r1 = r10.f6748a
            com.fyber.inneractive.sdk.d.g r1 = r1.getAdContent()
            r11[r2] = r1
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r11)
            return
        L_0x0058:
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            r3 = 0
            if (r11 == 0) goto L_0x0064
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r11 = r11.f6798a
            goto L_0x0065
        L_0x0064:
            r11 = r3
        L_0x0065:
            r10.f7294i = r11
            if (r11 == 0) goto L_0x01d8
            com.fyber.inneractive.sdk.m.d$c r11 = r10.f7295j
            if (r11 != 0) goto L_0x0074
            com.fyber.inneractive.sdk.i.d$2 r11 = new com.fyber.inneractive.sdk.i.d$2
            r11.<init>()
            r10.f7295j = r11
        L_0x0074:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r11 = r10.f7294i
            com.fyber.inneractive.sdk.m.d$c r0 = r10.f7295j
            r11.setListener(r0)
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.config.u r11 = r11.mo18131h()
            r0 = -2
            r4 = 0
            if (r11 == 0) goto L_0x00e5
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.config.u r11 = r11.mo18131h()
            com.fyber.inneractive.sdk.config.o r11 = r11.mo18071h()
            if (r11 == 0) goto L_0x00e5
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.config.u r11 = r11.mo18131h()
            com.fyber.inneractive.sdk.config.o r11 = r11.mo18071h()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r11 = r11.mo18057a()
            if (r11 == 0) goto L_0x00e5
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.config.u r11 = r11.mo18131h()
            com.fyber.inneractive.sdk.config.o r11 = r11.mo18071h()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r11 = r11.mo18057a()
            boolean r11 = r11.isFullscreenUnit()
            if (r11 == 0) goto L_0x00e5
            com.fyber.inneractive.sdk.i.d$a r11 = new com.fyber.inneractive.sdk.i.d$a
            android.view.ViewGroup r5 = r10.f7297l
            android.content.Context r5 = r5.getContext()
            r6 = 1069547520(0x3fc00000, float:1.5)
            r11.<init>(r5, r6)
            r10.f7298m = r11
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r10.f7294i
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r6.<init>(r7, r7)
            r5.mo18542a((android.view.ViewGroup) r11, (android.view.ViewGroup.LayoutParams) r6)
            android.view.ViewGroup r11 = r10.f7297l
            android.widget.FrameLayout r5 = r10.f7298m
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r0, r0)
            r11.addView(r5, r6)
            goto L_0x0176
        L_0x00e5:
            com.fyber.inneractive.sdk.i.d$a r11 = new com.fyber.inneractive.sdk.i.d$a
            android.view.ViewGroup r5 = r10.f7297l
            android.content.Context r5 = r5.getContext()
            r11.<init>(r5, r4)
            r10.f7298m = r11
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.j.e r11 = r11.mo18129f()
            com.fyber.inneractive.sdk.j.f r11 = (com.fyber.inneractive.sdk.p051j.C3019f) r11
            int r11 = r11.f7404g
            com.fyber.inneractive.sdk.d.g r5 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r5 = (com.fyber.inneractive.sdk.p037d.C2853m) r5
            com.fyber.inneractive.sdk.j.e r5 = r5.mo18129f()
            com.fyber.inneractive.sdk.j.f r5 = (com.fyber.inneractive.sdk.p051j.C3019f) r5
            int r5 = r5.f7405h
            com.fyber.inneractive.sdk.d.g r6 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r6 = (com.fyber.inneractive.sdk.p037d.C2853m) r6
            com.fyber.inneractive.sdk.config.u r6 = r6.mo18131h()
            com.fyber.inneractive.sdk.util.ak r11 = m6734a(r11, r5, r6)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r10.f7294i
            int r6 = r11.f9896a
            int r7 = r11.f9897b
            r5.setAdDefaultSize(r6, r7)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r10.f7294i
            com.fyber.inneractive.sdk.m.c r5 = r5.mo18556e()
            if (r5 != 0) goto L_0x0147
            android.app.Application r6 = com.fyber.inneractive.sdk.util.C3657l.m9125p()
            if (r6 == 0) goto L_0x0147
            boolean r0 = r10.f7306u
            if (r0 != 0) goto L_0x0143
            r10.f7306u = r1
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r10.f7294i
            android.app.Application r5 = com.fyber.inneractive.sdk.util.C3657l.m9125p()
            boolean r0 = r0.mo18546a((android.content.Context) r5)
            if (r0 != 0) goto L_0x0176
            r10.m6740a((com.fyber.inneractive.sdk.util.C3630ak) r11)
            goto L_0x0176
        L_0x0143:
            r10.m6740a((com.fyber.inneractive.sdk.util.C3630ak) r11)
            goto L_0x0176
        L_0x0147:
            if (r5 == 0) goto L_0x014e
            android.view.ViewParent r6 = r5.getParent()
            goto L_0x014f
        L_0x014e:
            r6 = r3
        L_0x014f:
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0158
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.removeView(r5)
        L_0x0158:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r10.f7294i
            android.widget.FrameLayout r6 = r10.f7298m
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r8 = r11.f9896a
            int r11 = r11.f9897b
            r9 = 17
            r7.<init>(r8, r11, r9)
            r5.mo18542a((android.view.ViewGroup) r6, (android.view.ViewGroup.LayoutParams) r7)
            android.view.ViewGroup r11 = r10.f7297l
            android.widget.FrameLayout r5 = r10.f7298m
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r0, r0)
            r11.addView(r5, r6)
        L_0x0176:
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            if (r11 == 0) goto L_0x0185
            com.fyber.inneractive.sdk.d.g r11 = r10.f6749b
            com.fyber.inneractive.sdk.d.m r11 = (com.fyber.inneractive.sdk.p037d.C2853m) r11
            com.fyber.inneractive.sdk.j.e r11 = r11.mo18129f()
            r3 = r11
            com.fyber.inneractive.sdk.j.f r3 = (com.fyber.inneractive.sdk.p051j.C3019f) r3
        L_0x0185:
            if (r3 == 0) goto L_0x01e1
            com.fyber.inneractive.sdk.i.b r11 = new com.fyber.inneractive.sdk.i.b
            android.widget.FrameLayout r0 = r10.f7298m
            com.fyber.inneractive.sdk.i.d$1 r5 = new com.fyber.inneractive.sdk.i.d$1
            r5.<init>()
            r11.<init>(r3, r0, r5)
            r10.f7307v = r11
            r11.f7286h = r2
            r11.f7282d = r1
            r11.f7283e = r4
            com.fyber.inneractive.sdk.j.e r0 = r11.f7280b
            int r0 = r0.f7421x
            if (r0 <= 0) goto L_0x01ad
            com.fyber.inneractive.sdk.j.e r0 = r11.f7280b
            int r0 = r0.f7421x
            r3 = 100
            int r0 = java.lang.Math.min(r0, r3)
            r11.f7282d = r0
        L_0x01ad:
            com.fyber.inneractive.sdk.j.e r0 = r11.f7280b
            float r0 = r0.f7422y
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01bd
            com.fyber.inneractive.sdk.j.e r0 = r11.f7280b
            float r0 = r0.f7422y
            r11.f7283e = r0
        L_0x01bd:
            float r0 = r11.f7283e
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01e1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "IAVisibilityTracker: startTrackingVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r0)
            r11.f7281c = r4
            long r2 = java.lang.System.currentTimeMillis()
            r11.f7284f = r2
            r11.f7285g = r1
            r11.mo18455d()
            goto L_0x01e1
        L_0x01d8:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.d.g r1 = r10.f6749b
            r11[r2] = r1
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r11)
        L_0x01e1:
            com.fyber.inneractive.sdk.util.t r11 = com.fyber.inneractive.sdk.util.C3681t.C3683a.f9976a
            java.util.List<com.fyber.inneractive.sdk.util.t$b> r0 = r11.f9971a
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x01f2
            java.util.List<com.fyber.inneractive.sdk.util.t$b> r11 = r11.f9971a
            r11.add(r10)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p050i.C2997d.mo18232a(android.view.ViewGroup):void");
    }

    public final void destroy() {
        m6754j();
        m6736a();
        this.f7295j = null;
        C3681t.C3683a.f9976a.f9971a.remove(this);
        if (this.f7301p != null) {
            C3662m.m9137a().removeCallbacks(this.f7301p);
        }
        super.destroy();
    }

    /* renamed from: a */
    private void m6736a() {
        C2992b bVar = this.f7307v;
        if (bVar != null) {
            bVar.mo18452a();
        }
        if (this.f7294i != null) {
            m6754j();
            if (this.f6749b != null) {
                ((C2853m) this.f6749b).mo18127b();
            }
            this.f7294i = null;
            this.f6749b = null;
            ViewGroup viewGroup = this.f7297l;
            if (viewGroup != null) {
                viewGroup.removeView(this.f7298m);
            }
        }
        this.f7304s = false;
    }

    /* renamed from: b */
    private int m6741b() {
        C2801o h;
        int intValue;
        int i = this.f7302q;
        if (i == -1) {
            IAlog.m9034b("%sreturning disable value for banner refresh", IAlog.m9029a((Object) this));
            return 0;
        }
        if (i > 0) {
            IAlog.m9034b("%sreturning overriden refresh interval = %d", IAlog.m9029a((Object) this), Integer.valueOf(this.f7302q));
            intValue = this.f7302q;
        } else {
            C2809u h2 = this.f6748a.getAdContent().mo18131h();
            if (!(h2 == null || (h = h2.mo18071h()) == null)) {
                Integer b = h.mo18059b();
                IAlog.m9034b("%sreturning refreshConfig = %d", IAlog.m9029a((Object) this), b);
                if (b != null) {
                    intValue = b.intValue();
                }
            }
            IAlog.m9034b("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.m9029a((Object) this));
            return 0;
        }
        return intValue * 1000;
    }

    /* renamed from: a */
    private void m6737a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        long j2;
        if (TextUtils.isEmpty(this.f6748a.getMediationNameString()) && j != 0 && !(this.f6748a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) && this.f7302q != -1 && (iAmraidWebViewController = this.f7294i) != null && iAmraidWebViewController.mo18556e() != null) {
            if (!this.f7294i.mo18556e().getIsVisible()) {
                IAlog.m9034b("%sstartRefreshTimer called but ad is not visible", IAlog.m9029a((Object) this));
                return;
            }
            this.f7300o = System.currentTimeMillis();
            if (z) {
                j2 = this.f7299n;
            } else {
                j2 = j;
            }
            this.f7299n = j2;
            IAlog.m9034b("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.m9029a((Object) this), Long.valueOf(j), Long.valueOf(this.f7299n));
            if (j > 1) {
                if (this.f7301p != null) {
                    C3662m.m9137a().removeCallbacks(this.f7301p);
                }
                m6754j();
                this.f7301p = new Runnable() {
                    public final void run() {
                        C2997d.this.m6752i();
                    }
                };
                C3662m.m9137a().postDelayed(this.f7301p, j);
                return;
            }
            m6752i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m6752i() {
        IAmraidWebViewController iAmraidWebViewController = this.f7294i;
        if (iAmraidWebViewController != null && iAmraidWebViewController.mo18556e() != null) {
            IAlog.m9034b("%srefreshing ad", IAlog.m9029a((Object) this));
            if (!this.f7294i.mo18611q() || this.f7294i.mo18612r()) {
                this.f7300o = 0;
                this.f7293h.refreshAd();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6744b(boolean z) {
        if (this.f7301p != null) {
            this.f7305t = z;
            m6754j();
            this.f7303r = this.f7299n - (System.currentTimeMillis() - this.f7300o);
            IAlog.m9034b("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.m9029a((Object) this), Long.valueOf(this.f7303r), Long.valueOf(this.f7299n));
        }
    }

    /* renamed from: j */
    private void m6754j() {
        if (this.f7301p != null) {
            IAlog.m9034b("%scancelling refreen runnable", IAlog.m9029a((Object) this));
            C3662m.m9137a().removeCallbacks(this.f7301p);
            this.f7301p = null;
        }
    }

    /* renamed from: a */
    public static C3630ak m6734a(int i, int i2, C2809u uVar) {
        int i3;
        int i4;
        IAlog.m9034b("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0) {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (!(uVar == null || uVar.mo18071h() == null)) {
                unitDisplayType = uVar.mo18071h().mo18057a();
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                i4 = C3657l.m9105a((float) C3002b.RECTANGLE_WIDTH.f7319g);
                i3 = C3657l.m9105a((float) C3002b.RECTANGLE_HEIGHT.f7319g);
            } else if (C3656k.m9102n()) {
                i4 = C3657l.m9105a((float) C3002b.BANNER_TABLET_WIDTH.f7319g);
                i3 = C3657l.m9105a((float) C3002b.BANNER_TABLET_HEIGHT.f7319g);
            } else {
                i4 = C3657l.m9105a((float) C3002b.BANNER_WIDTH.f7319g);
                i3 = C3657l.m9105a((float) C3002b.BANNER_HEIGHT.f7319g);
            }
        } else {
            i4 = C3657l.m9105a((float) i);
            i3 = C3657l.m9105a((float) i2);
        }
        IAlog.m9033a("View layout params: final scaled width and height: %d, %d", Integer.valueOf(i4), Integer.valueOf(i3));
        return new C3630ak(i4, i3);
    }

    /* renamed from: a */
    public final boolean mo18233a(View view) {
        return view.equals(this.f7297l);
    }

    /* renamed from: e */
    public final void mo18238e() {
        C2992b bVar = this.f7307v;
        if (bVar != null) {
            bVar.mo18452a();
        }
        FrameLayout frameLayout = this.f7298m;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f7297l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f7297l = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m6756k() {
        IAmraidWebViewController iAmraidWebViewController = this.f7294i;
        if (iAmraidWebViewController != null && iAmraidWebViewController.mo18556e() != null && this.f7294i.mo18556e().getIsVisible() && this.f7300o != 0 && !this.f7294i.mo18611q() && !this.f7294i.mo18612r()) {
            if (!this.f7305t) {
                if (this.f7299n < System.currentTimeMillis() - this.f7300o) {
                    this.f7303r = 1;
                } else {
                    this.f7303r = this.f7299n - (System.currentTimeMillis() - this.f7300o);
                }
            }
            IAlog.m9034b("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.m9029a((Object) this), Long.valueOf(this.f7303r));
            m6737a(this.f7303r, false);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.i.d$a */
    private static class C3001a extends FrameLayout {

        /* renamed from: a */
        private final float f7311a;

        public C3001a(Context context, float f) {
            super(context);
            this.f7311a = f;
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > 0)) {
                int size = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                float f = this.f7311a;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            } else {
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            super.onMeasure(i3, i2);
        }
    }

    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f7294i;
        if (iAmraidWebViewController != null) {
            return !iAmraidWebViewController.mo18611q() && !this.f7294i.mo18612r();
        }
        return true;
    }

    /* renamed from: g */
    public final int mo18240g() {
        return this.f7294i.mo18620x();
    }

    /* renamed from: h */
    public final int mo18241h() {
        return this.f7294i.mo18621y();
    }

    /* renamed from: a */
    public final void mo18231a(int i) {
        this.f7302q = i;
    }

    /* renamed from: r */
    public final int mo18151r() {
        IAmraidWebViewController iAmraidWebViewController = this.f7294i;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.mo18556e() == null || !this.f7294i.mo18611q()) {
            return C3657l.m9106a(this.f7294i.mo18620x());
        }
        return C3657l.m9106a(this.f7294i.mo18556e().getWidth());
    }

    /* renamed from: s */
    public final int mo18152s() {
        IAmraidWebViewController iAmraidWebViewController = this.f7294i;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.mo18556e() == null || !this.f7294i.mo18611q()) {
            return C3657l.m9106a(this.f7294i.mo18621y());
        }
        return C3657l.m9106a(this.f7294i.mo18556e().getHeight());
    }

    /* renamed from: a */
    private void m6740a(C3630ak akVar) {
        FrameLayout frameLayout = new FrameLayout(this.f7297l.getContext());
        frameLayout.setBackgroundResource(C2674R.color.blank_background);
        this.f7297l.removeAllViews();
        this.f7297l.addView(frameLayout, new FrameLayout.LayoutParams(akVar.f9896a, akVar.f9897b, 17));
    }

    /* renamed from: c */
    public final void mo18236c() {
        IAlog.m9034b("%sgot onAdRefreshFailed", IAlog.m9029a((Object) this));
        IAmraidWebViewController iAmraidWebViewController = this.f7294i;
        if (iAmraidWebViewController != null && iAmraidWebViewController.mo18556e() != null) {
            if (!this.f7294i.mo18556e().getIsVisible() || C3681t.C3683a.f9976a.f9972b || this.f7294i.mo18611q() || this.f7294i.mo18612r()) {
                IAlog.m9034b("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.m9029a((Object) this));
                this.f7303r = 1;
                return;
            }
            IAlog.m9034b("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.m9029a((Object) this));
            long b = (long) m6741b();
            this.f7299n = b;
            if (b != 0) {
                m6737a((long) TapjoyConstants.TIMER_INCREMENT, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo18459a(boolean z) {
        IAlog.m9034b("%sgot onLockScreenStateChanged with: %s", IAlog.m9029a((Object) this), Boolean.valueOf(z));
        if (z) {
            m6744b(false);
            C2992b bVar = this.f7307v;
            if (bVar != null) {
                bVar.mo18453b();
                return;
            }
            return;
        }
        m6756k();
        C2992b bVar2 = this.f7307v;
        if (bVar2 != null) {
            bVar2.mo18454c();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6738a(C2997d dVar) {
        String str;
        try {
            if (dVar.f6749b != null && ((C2853m) dVar.f6749b).mo18129f() != null && (str = ((C3019f) ((C2853m) dVar.f6749b).mo18129f()).f7423z) != null && str.trim().length() > 0) {
                IAlog.m9033a("%sfiring banner mrc visibility impression!", IAlog.m9029a((Object) dVar));
                IAlog.m9030a(IAlog.f9871b, "MRC_VISIBILITY_IMPRESSION", new Object[0]);
                dVar.mo18141b(str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: F */
    static /* synthetic */ void m6725F(C2997d dVar) {
        IAlog.m9034b("%sonShownForTheFirstTime called", IAlog.m9029a((Object) dVar));
        C3019f fVar = dVar.f6749b != null ? (C3019f) ((C2853m) dVar.f6749b).mo18129f() : null;
        if (fVar != null) {
            IAmraidWebViewController iAmraidWebViewController = dVar.f7294i;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.mo19531b();
            }
            dVar.mo18138a((C3018e) fVar);
        }
        long b = (long) dVar.m6741b();
        dVar.f7299n = b;
        if (b != 0) {
            dVar.m6737a(b, true);
        }
        if (!(dVar.f6749b == null || ((C2853m) dVar.f6749b).mo18131h() == null || ((C2853m) dVar.f6749b).mo18131h().mo18071h() == null)) {
            m6230a(C2688a.f6336a, ((C2853m) dVar.f6749b).mo18131h().mo18071h().mo18057a() == UnitDisplayType.MRECT ? C2689b.RECTANGLE_DISPLAY : C2689b.BANNER_DISPLAY);
        }
        dVar.mo18147m();
    }
}

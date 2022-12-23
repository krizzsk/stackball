package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.C15243ye;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.l71;

/* renamed from: com.yandex.mobile.ads.banner.g */
public abstract class C12080g extends RelativeLayout {

    /* renamed from: a */
    private final C12072b f29059a;

    /* renamed from: b */
    private final C12081h f29060b;

    public C12080g(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m31234a(int i) {
        if (!C13278h5.m36802a((C15243ye) this.f29059a)) {
            this.f29060b.mo64399a(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12072b mo64345a(Context context, C12077d dVar, C15230y2 y2Var);

    public void destroy() {
        if (!C13278h5.m36802a((C15243ye) this.f29059a)) {
            this.f29059a.mo64370z();
        }
    }

    public VideoController getVideoController() {
        return this.f29059a.mo64354B();
    }

    public void loadAd(AdRequest adRequest) {
        this.f29059a.mo64584b(adRequest);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        this.f29060b.mo64402b(getContext());
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!C13278h5.m36802a((C15243ye) this.f29059a)) {
            setVisibility(this.f29059a.mo64369y() ? 0 : 8);
        }
        configuration.toString();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        this.f29060b.mo64400a(getContext());
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d71 a = l71.m38631c().mo68362a(getContext());
        if (a != null && a.mo66477y()) {
            if (this == view && !C13278h5.m36802a((C15243ye) this.f29059a)) {
                this.f29060b.mo64399a(i);
            }
        } else if (!C13278h5.m36802a((C15243ye) this.f29059a)) {
            this.f29060b.mo64399a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getVisibility();
        m31234a((i == 0 && getVisibility() == 0) ? 0 : 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if ((!(-1 == r9.mo64495e() && -2 == r9.mo64490c()) && com.yandex.mobile.ads.base.SizeInfo.C12090b.FIXED == r9.mo64493d()) != false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdSize(com.yandex.mobile.ads.banner.AdSize r9) {
        /*
            r8 = this;
            com.yandex.mobile.ads.banner.b r0 = r8.f29059a
            android.content.Context r0 = r0.mo64596h()
            boolean r0 = com.yandex.mobile.ads.impl.z81.m44504a(r0)
            if (r0 != 0) goto L_0x0090
            com.yandex.mobile.ads.base.SizeInfo$b r1 = com.yandex.mobile.ads.base.SizeInfo.C12090b.STICKY
            com.yandex.mobile.ads.base.SizeInfo r2 = r9.mo64390a()
            com.yandex.mobile.ads.base.SizeInfo$b r2 = r2.mo64493d()
            if (r1 != r2) goto L_0x0090
            int r9 = r9.getWidth()
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            com.yandex.mobile.ads.banner.b r2 = r8.f29059a     // Catch:{ Exception -> 0x0038 }
            android.content.Context r2 = r2.mo64596h()     // Catch:{ Exception -> 0x0038 }
            int r2 = com.yandex.mobile.ads.impl.lo1.m38869b((android.content.Context) r2)     // Catch:{ Exception -> 0x0038 }
            double r2 = (double) r2     // Catch:{ Exception -> 0x0038 }
            r4 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r2 = r2 * r4
            double r2 = java.lang.Math.min(r0, r2)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r2 = r0
        L_0x0039:
            r4 = 655(0x28f, float:9.18E-43)
            if (r9 <= r4) goto L_0x004c
            double r4 = (double) r9
            r6 = 4649614771539148800(0x4086c00000000000, double:728.0)
            double r4 = r4 / r6
            double r4 = r4 * r0
            long r0 = java.lang.Math.round(r4)
        L_0x004a:
            int r1 = (int) r0
            goto L_0x007b
        L_0x004c:
            r0 = 632(0x278, float:8.86E-43)
            if (r9 <= r0) goto L_0x0053
            r1 = 81
            goto L_0x007b
        L_0x0053:
            r0 = 526(0x20e, float:7.37E-43)
            if (r9 <= r0) goto L_0x0067
            double r0 = (double) r9
            r4 = 4646940759260397568(0x407d400000000000, double:468.0)
            double r0 = r0 / r4
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = r0 * r4
            long r0 = java.lang.Math.round(r0)
            goto L_0x004a
        L_0x0067:
            r0 = 432(0x1b0, float:6.05E-43)
            if (r9 <= r0) goto L_0x006e
            r1 = 68
            goto L_0x007b
        L_0x006e:
            double r0 = (double) r9
            r4 = 4644337115725824000(0x4074000000000000, double:320.0)
            double r0 = r0 / r4
            r4 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r0 = r0 * r4
            long r0 = java.lang.Math.round(r0)
            goto L_0x004a
        L_0x007b:
            int r0 = (int) r2
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 50
            int r0 = java.lang.Math.max(r0, r1)
            com.yandex.mobile.ads.banner.AdSize r1 = new com.yandex.mobile.ads.banner.AdSize
            r1.<init>(r9, r0)
            com.yandex.mobile.ads.base.SizeInfo r9 = r1.mo64390a()
            goto L_0x00da
        L_0x0090:
            com.yandex.mobile.ads.base.SizeInfo r9 = r9.mo64390a()
            java.lang.String r1 = "<this>"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00be
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            int r0 = r9.mo64495e()
            r4 = -1
            if (r4 != r0) goto L_0x00ad
            int r0 = r9.mo64490c()
            r4 = -2
            if (r4 != r0) goto L_0x00ad
            r0 = 1
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r0 != 0) goto L_0x00ba
            com.yandex.mobile.ads.base.SizeInfo$b r0 = com.yandex.mobile.ads.base.SizeInfo.C12090b.FIXED
            com.yandex.mobile.ads.base.SizeInfo$b r4 = r9.mo64493d()
            if (r0 != r4) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r0 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            if (r2 == 0) goto L_0x00da
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            com.yandex.mobile.ads.base.SizeInfo$b r0 = r9.mo64493d()
            com.yandex.mobile.ads.base.SizeInfo$b r1 = com.yandex.mobile.ads.base.SizeInfo.C12090b.FLEXIBLE
            if (r0 == r1) goto L_0x00da
            com.yandex.mobile.ads.base.SizeInfo r0 = new com.yandex.mobile.ads.base.SizeInfo
            int r2 = r9.mo64495e()
            int r9 = r9.mo64490c()
            r0.<init>(r2, r9, r1)
            r9 = r0
        L_0x00da:
            com.yandex.mobile.ads.banner.b r0 = r8.f29059a
            r0.mo64576a((com.yandex.mobile.ads.base.SizeInfo) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.banner.C12080g.setAdSize(com.yandex.mobile.ads.banner.AdSize):void");
    }

    public void setAdUnitId(String str) {
        this.f29059a.mo64587b(str);
    }

    public void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        this.f29059a.mo64357a(bannerAdEventListener);
    }

    /* access modifiers changed from: package-private */
    public void setShouldOpenLinksInApp(boolean z) {
        this.f29059a.mo64588b(z);
    }

    public C12080g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12080g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15230y2 y2Var = new C15230y2();
        C12077d dVar = new C12077d(context, y2Var);
        C12072b a = mo64345a(context, dVar, y2Var);
        this.f29059a = a;
        dVar.mo64379a(a.mo64592d());
        C12081h a2 = m31233a();
        this.f29060b = a2;
        a2.mo64401a(context, this);
    }

    /* renamed from: a */
    private C12081h m31233a() {
        C12072b bVar = this.f29059a;
        if (isInEditMode()) {
            return new C12083j();
        }
        return new C12082i(bVar);
    }
}

package com.applovin.impl.adview.p009a.p010a;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1101l;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1355g;

/* renamed from: com.applovin.impl.adview.a.a.a */
abstract class C1041a {

    /* renamed from: a */
    final C1469j f1826a;

    /* renamed from: b */
    final AppLovinFullscreenActivity f1827b;

    /* renamed from: c */
    final C1355g f1828c;

    /* renamed from: d */
    final ViewGroup f1829d;

    /* renamed from: e */
    final FrameLayout.LayoutParams f1830e = new FrameLayout.LayoutParams(-1, -1, 17);

    C1041a(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, C1469j jVar) {
        this.f1828c = gVar;
        this.f1826a = jVar;
        this.f1827b = appLovinFullscreenActivity;
        FrameLayout frameLayout = new FrameLayout(appLovinFullscreenActivity);
        this.f1829d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f1829d.setLayoutParams(this.f1830e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11811a(C1355g.C1359c cVar, int i, C1101l lVar) {
        lVar.mo11978a(cVar.f2782a, cVar.f2786e, cVar.f2785d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lVar.getLayoutParams());
        layoutParams.setMargins(cVar.f2784c, cVar.f2783b, cVar.f2784c, 0);
        layoutParams.gravity = i;
        this.f1829d.addView(lVar, layoutParams);
    }
}

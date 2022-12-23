package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.mediation.p020b.C1224b;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.w */
public class C1568w {

    /* renamed from: a */
    private final C1469j f3819a;

    /* renamed from: b */
    private final C1505q f3820b;

    /* renamed from: c */
    private final MaxAdView f3821c;

    public C1568w(MaxAdView maxAdView, C1469j jVar) {
        this.f3819a = jVar;
        this.f3820b = jVar.mo13139v();
        this.f3821c = maxAdView;
    }

    /* renamed from: a */
    public long mo13385a(C1224b bVar) {
        long j;
        this.f3820b.mo13277b("ViewabilityTracker", "Checking visibility...");
        if (!this.f3821c.isShown()) {
            this.f3820b.mo13281e("ViewabilityTracker", "View is hidden");
            j = 2;
        } else {
            j = 0;
        }
        if (this.f3821c.getAlpha() < bVar.mo12305r()) {
            this.f3820b.mo13281e("ViewabilityTracker", "View is transparent");
            j |= 4;
        }
        Animation animation = this.f3821c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            this.f3820b.mo13281e("ViewabilityTracker", "View is animating");
            j |= 8;
        }
        if (this.f3821c.getParent() == null) {
            this.f3820b.mo13281e("ViewabilityTracker", "No parent view found");
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f3821c.getContext(), this.f3821c.getWidth());
        if (pxToDp < bVar.mo12303p()) {
            C1505q qVar = this.f3820b;
            qVar.mo13281e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f3821c.getContext(), this.f3821c.getHeight());
        if (pxToDp2 < bVar.mo12304q()) {
            C1505q qVar2 = this.f3820b;
            qVar2.mo13281e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            j |= 64;
        }
        Point a = C1519g.m3428a(this.f3821c.getContext());
        Rect rect = new Rect(0, 0, a.x, a.y);
        int[] iArr = {-1, -1};
        this.f3821c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f3821c.getWidth(), iArr[1] + this.f3821c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            C1505q qVar3 = this.f3820b;
            qVar3.mo13281e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            j |= 128;
        }
        Activity a2 = this.f3819a.mo13086Z().mo12601a();
        if (a2 != null && !C1557r.m3609a((View) this.f3821c, a2)) {
            this.f3820b.mo13281e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            j |= 256;
        }
        C1505q qVar4 = this.f3820b;
        qVar4.mo13277b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        return j;
    }
}

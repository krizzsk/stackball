package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.applovin.impl.mediation.p020b.C1224b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.x */
public class C1569x {

    /* renamed from: a */
    private final C1469j f3822a;

    /* renamed from: b */
    private final Object f3823b = new Object();

    /* renamed from: c */
    private final Rect f3824c = new Rect();

    /* renamed from: d */
    private final Handler f3825d;

    /* renamed from: e */
    private final Runnable f3826e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f3827f;

    /* renamed from: g */
    private WeakReference<ViewTreeObserver> f3828g = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public WeakReference<View> f3829h = new WeakReference<>((Object) null);

    /* renamed from: i */
    private int f3830i;

    /* renamed from: j */
    private long f3831j;

    /* renamed from: k */
    private long f3832k = Long.MIN_VALUE;

    /* renamed from: com.applovin.impl.sdk.x$a */
    public interface C1572a {
        void onLogVisibilityImpression();
    }

    public C1569x(MaxAdView maxAdView, C1469j jVar, C1572a aVar) {
        this.f3822a = jVar;
        this.f3825d = new Handler(Looper.getMainLooper());
        final WeakReference weakReference = new WeakReference(maxAdView);
        final WeakReference weakReference2 = new WeakReference(aVar);
        this.f3826e = new Runnable() {
            public void run() {
                MaxAdView maxAdView = (MaxAdView) weakReference.get();
                View view = (View) C1569x.this.f3829h.get();
                if (maxAdView != null && view != null) {
                    if (C1569x.this.m3674b(maxAdView, view)) {
                        C1569x.this.mo13386a();
                        C1572a aVar = (C1572a) weakReference2.get();
                        if (aVar != null) {
                            aVar.onLogVisibilityImpression();
                            return;
                        }
                        return;
                    }
                    C1569x.this.m3672b();
                }
            }
        };
        this.f3827f = new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                C1569x.this.m3672b();
                C1569x.this.m3675c();
                return true;
            }
        };
    }

    /* renamed from: a */
    private void m3669a(Context context, View view) {
        View a = C1557r.m3582a(context, view);
        if (a == null) {
            this.f3822a.mo13139v().mo13277b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
            return;
        }
        ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f3822a.mo13139v().mo13280d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            return;
        }
        this.f3828g = new WeakReference<>(viewTreeObserver);
        viewTreeObserver.addOnPreDrawListener(this.f3827f);
    }

    /* renamed from: a */
    private boolean m3670a(View view, View view2) {
        return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.f3824c) && ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f3824c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f3824c.height()))) >= ((long) this.f3830i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3672b() {
        this.f3825d.postDelayed(this.f3826e, ((Long) this.f3822a.mo13088a(C1369c.f2998cj)).longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3674b(View view, View view2) {
        if (!m3670a(view, view2)) {
            return false;
        }
        if (this.f3832k == Long.MIN_VALUE) {
            this.f3832k = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f3832k >= this.f3831j;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3675c() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f3828g.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f3827f);
        }
        this.f3828g.clear();
    }

    /* renamed from: a */
    public void mo13386a() {
        synchronized (this.f3823b) {
            this.f3825d.removeMessages(0);
            m3675c();
            this.f3832k = Long.MIN_VALUE;
            this.f3829h.clear();
        }
    }

    /* renamed from: a */
    public void mo13387a(Context context, C1224b bVar) {
        synchronized (this.f3823b) {
            mo13386a();
            this.f3829h = new WeakReference<>(bVar.mo12301n());
            this.f3830i = bVar.mo12306s();
            this.f3831j = bVar.mo12308u();
            m3669a(context, (View) this.f3829h.get());
        }
    }
}

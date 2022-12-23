package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.C5120dk;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.de */
/* compiled from: DecorViewVisibilityTracker */
final class C5105de extends C5120dk {

    /* renamed from: a */
    private static final String f11699a = C5105de.class.getSimpleName();

    /* renamed from: d */
    private ViewTreeObserver.OnPreDrawListener f11700d;

    /* renamed from: e */
    private final WeakReference<View> f11701e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40377a() {
        return 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40378b() {
    }

    C5105de(C5120dk.C5121a aVar, Activity activity) {
        super(aVar);
        View decorView = activity.getWindow().getDecorView();
        this.f11701e = new WeakReference<>(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            C51061 r2 = new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C5105de.this.mo40404h();
                    return true;
                }
            };
            this.f11700d = r2;
            viewTreeObserver.addOnPreDrawListener(r2);
        }
    }

    /* renamed from: i */
    private void m11618i() {
        View view = (View) this.f11701e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f11700d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo40381e() {
        m11618i();
        super.mo40381e();
    }

    /* renamed from: c */
    public final void mo40379c() {
        if (!this.f11741b) {
            m11618i();
            super.mo40379c();
        }
    }

    /* renamed from: d */
    public final void mo40380d() {
        if (this.f11741b) {
            View view = (View) this.f11701e.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f11700d);
                }
            }
            super.mo40380d();
        }
    }
}

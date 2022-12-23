package com.yandex.mobile.ads.mediation.banner;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.mediation.banner.f */
class C15428f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f43584a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WeakReference<ViewGroup> f43585b;

    /* renamed from: com.yandex.mobile.ads.mediation.banner.f$a */
    class C15429a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f43586b;

        /* renamed from: c */
        final /* synthetic */ C15430b f43587c;

        C15429a(View view, C15430b bVar) {
            this.f43586b = view;
            this.f43587c = bVar;
        }

        public void run() {
            ViewGroup viewGroup = (ViewGroup) C15428f.this.f43585b.get();
            if (viewGroup != null && viewGroup.indexOfChild(this.f43586b) == -1) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                viewGroup.addView(this.f43586b, layoutParams);
                viewGroup.setVisibility(0);
                this.f43586b.setVisibility(0);
            }
            C15428f fVar = C15428f.this;
            View view = this.f43586b;
            C15430b bVar = this.f43587c;
            fVar.getClass();
            view.getViewTreeObserver().addOnPreDrawListener(new C15431g(fVar, view, bVar));
        }
    }

    /* renamed from: com.yandex.mobile.ads.mediation.banner.f$b */
    interface C15430b {
    }

    C15428f(ViewGroup viewGroup) {
        this.f43585b = new WeakReference<>(viewGroup);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71374a(View view, C15430b bVar) {
        this.f43584a.post(new C15429a(view, bVar));
    }

    /* renamed from: a */
    static void m44944a(C15428f fVar, boolean z) {
        int childCount;
        ViewGroup viewGroup = (ViewGroup) fVar.f43585b.get();
        if (viewGroup != null && viewGroup.getChildCount() > 0 && (childCount = viewGroup.getChildCount() - (z ^ true ? 1 : 0)) > 0) {
            viewGroup.removeViews(0, childCount);
        }
    }
}

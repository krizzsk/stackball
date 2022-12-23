package com.yandex.mobile.ads.mediation.banner;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.banner.C12072b;
import com.yandex.mobile.ads.mediation.banner.C15421a;
import com.yandex.mobile.ads.mediation.banner.C15428f;

/* renamed from: com.yandex.mobile.ads.mediation.banner.g */
class C15431g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f43589a;

    /* renamed from: b */
    final /* synthetic */ C15428f.C15430b f43590b;

    /* renamed from: c */
    final /* synthetic */ C15428f f43591c;

    /* renamed from: com.yandex.mobile.ads.mediation.banner.g$a */
    class C15432a implements Runnable {
        C15432a() {
        }

        public void run() {
            C15428f.m44944a(C15431g.this.f43591c, false);
        }
    }

    C15431g(C15428f fVar, View view, C15428f.C15430b bVar) {
        this.f43591c = fVar;
        this.f43589a = view;
        this.f43590b = bVar;
    }

    public boolean onPreDraw() {
        if (!this.f43589a.isShown()) {
            return true;
        }
        this.f43589a.getViewTreeObserver().removeOnPreDrawListener(this);
        C15421a.C15423b bVar = (C15421a.C15423b) this.f43590b;
        C12072b bVar2 = (C12072b) C15421a.this.f43575a.get();
        if (bVar2 != null) {
            C15421a.this.f43577c.mo69223f(bVar2.mo64596h());
        }
        if (C15421a.this.f43577c.mo69218c()) {
            C15421a.this.m44934a();
        }
        this.f43591c.f43584a.postDelayed(new C15432a(), 50);
        return true;
    }
}

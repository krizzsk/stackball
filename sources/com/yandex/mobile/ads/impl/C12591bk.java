package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.bk */
public class C12591bk implements C14381qf {

    /* renamed from: a */
    private final View f31344a;

    /* renamed from: b */
    private final C14096nf f31345b;

    /* renamed from: c */
    private final wy0 f31346c = new wy0(true);

    /* renamed from: d */
    private final long f31347d;

    /* renamed from: com.yandex.mobile.ads.impl.bk$a */
    private static class C12592a implements xy0 {

        /* renamed from: a */
        private final WeakReference<View> f31348a;

        /* renamed from: b */
        private final C14096nf f31349b;

        C12592a(View view, C14096nf nfVar) {
            this.f31348a = new WeakReference<>(view);
            this.f31349b = nfVar;
        }

        /* renamed from: a */
        public void mo65511a() {
            View view = (View) this.f31348a.get();
            if (view != null) {
                this.f31349b.mo66914b(view);
            }
        }
    }

    public C12591bk(View view, C14096nf nfVar, long j) {
        this.f31344a = view;
        this.f31347d = j;
        this.f31345b = nfVar;
        nfVar.mo66913a(view);
    }

    /* renamed from: a */
    public void mo66083a() {
        this.f31346c.mo70774d();
    }

    /* renamed from: a */
    public void mo66084a(boolean z) {
    }

    /* renamed from: b */
    public void mo66085b() {
        this.f31346c.mo70773b();
    }

    /* renamed from: d */
    public void mo66086d() {
        this.f31346c.mo70771a(this.f31347d, new C12592a(this.f31344a, this.f31345b));
    }

    /* renamed from: e */
    public View mo66087e() {
        return this.f31344a;
    }

    public void invalidate() {
        this.f31346c.mo70770a();
    }
}

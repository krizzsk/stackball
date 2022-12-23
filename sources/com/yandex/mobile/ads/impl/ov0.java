package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.ov0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ov0 implements ViewTreeObserver.OnDrawListener {

    /* renamed from: e */
    public static final C14225a f38388e = new C14225a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final View f38389a;

    /* renamed from: b */
    private final C14227b f38390b;

    /* renamed from: c */
    private final Handler f38391c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f38392d;

    /* renamed from: com.yandex.mobile.ads.impl.ov0$a */
    public static final class C14225a {

        /* renamed from: com.yandex.mobile.ads.impl.ov0$a$a */
        public static final class C14226a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f38393a;

            /* renamed from: b */
            final /* synthetic */ C14227b f38394b;

            C14226a(View view, C14227b bVar) {
                this.f38393a = view;
                this.f38394b = bVar;
            }

            public void onViewAttachedToWindow(View view) {
                View view2 = this.f38393a;
                view2.getViewTreeObserver().addOnDrawListener(new ov0(view2, this.f38394b));
                this.f38393a.removeOnAttachStateChangeListener(this);
            }

            public void onViewDetachedFromWindow(View view) {
            }
        }

        private C14225a() {
        }

        public /* synthetic */ C14225a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo69273a(View view, C14227b bVar) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            Intrinsics.checkNotNullParameter(bVar, "nextDrawCallback");
            if (!view.getViewTreeObserver().isAlive() || !view.isAttachedToWindow()) {
                view.addOnAttachStateChangeListener(new C14226a(view, bVar));
            } else {
                view.getViewTreeObserver().addOnDrawListener(new ov0(view, bVar));
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ov0$b */
    public interface C14227b {
        /* renamed from: a */
        void mo69058a();

        /* renamed from: b */
        void mo69059b();
    }

    public ov0(View view, C14227b bVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bVar, "nextDrawCallback");
        this.f38389a = view;
        this.f38390b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m40595a(ov0 ov0) {
        Intrinsics.checkNotNullParameter(ov0, "this$0");
        if (ov0.f38389a.getViewTreeObserver().isAlive()) {
            ov0.f38389a.getViewTreeObserver().removeOnDrawListener(ov0);
        }
    }

    public void onDraw() {
        if (!this.f38392d) {
            this.f38392d = true;
            this.f38390b.mo69059b();
            this.f38391c.postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    ov0.C14227b.this.mo69058a();
                }
            });
            this.f38391c.post(new Runnable() {
                public final void run() {
                    ov0.m40595a(ov0.this);
                }
            });
        }
    }
}

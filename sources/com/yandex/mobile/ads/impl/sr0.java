package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.Rating;

public final class sr0 {

    /* renamed from: c */
    private static final Object f40112c = new Object();

    /* renamed from: d */
    private static volatile sr0 f40113d;

    /* renamed from: a */
    private final Handler f40114a = new Handler();

    /* renamed from: b */
    private boolean f40115b;

    private sr0() {
    }

    /* renamed from: a */
    public static sr0 m42127a() {
        if (f40113d == null) {
            synchronized (f40112c) {
                if (f40113d == null) {
                    f40113d = new sr0();
                }
            }
        }
        return f40113d;
    }

    /* renamed from: b */
    public void mo70046b(View view, MotionEvent motionEvent) {
        if ((view instanceof TextView) || (view instanceof Rating)) {
            m42129a(view, motionEvent);
        }
    }

    /* renamed from: a */
    private void m42129a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f40115b) {
                view.setAlpha(view.getAlpha() / 2.0f);
                this.f40115b = true;
            }
            this.f40114a.postDelayed(new Runnable(view) {
                public final /* synthetic */ View f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    sr0.this.m42128a(this.f$1);
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m42128a(View view) {
        if (this.f40115b) {
            view.setAlpha(view.getAlpha() * 2.0f);
            this.f40115b = false;
        }
    }
}

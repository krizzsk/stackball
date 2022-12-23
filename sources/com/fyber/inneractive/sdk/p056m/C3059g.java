package com.fyber.inneractive.sdk.p056m;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.fyber.inneractive.sdk.m.g */
final class C3059g implements View.OnTouchListener {

    /* renamed from: a */
    private final C3060a f7551a;

    /* renamed from: b */
    private float f7552b;

    /* renamed from: c */
    private float f7553c;

    /* renamed from: d */
    private float f7554d;

    /* renamed from: com.fyber.inneractive.sdk.m.g$a */
    interface C3060a {
        /* renamed from: g */
        void mo18558g();

        /* renamed from: h */
        void mo18559h();

        /* renamed from: i */
        void mo18560i();
    }

    C3059g(C3060a aVar, Context context) {
        this.f7551a = aVar;
        this.f7554d = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f7551a == null) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7551a.mo18559h();
            this.f7552b = motionEvent.getX();
            this.f7553c = motionEvent.getY();
            return false;
        } else if (motionEvent.getActionMasked() == 3) {
            this.f7551a.mo18560i();
            this.f7553c = -1.0f;
            this.f7552b = -1.0f;
            return false;
        } else if (motionEvent.getActionMasked() != 1) {
            return false;
        } else {
            float f = this.f7552b;
            if (f < 0.0f || this.f7553c < 0.0f) {
                return false;
            }
            float round = (float) Math.round(Math.abs(this.f7553c - motionEvent.getY()));
            float f2 = this.f7554d;
            if (((float) Math.round(Math.abs(f - motionEvent.getX()))) < f2 && round < f2) {
                this.f7551a.mo18558g();
            }
            this.f7552b = -1.0f;
            this.f7553c = -1.0f;
            return false;
        }
    }
}

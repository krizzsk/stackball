package com.ogury.p245ed.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ogury.ed.internal.cb */
public final class C8093cb {

    /* renamed from: a */
    private final View f21013a;

    public C8093cb(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            this.f21013a = ((ViewGroup) decorView).getChildAt(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final int mo53262a() {
        return this.f21013a.getMeasuredWidth();
    }

    /* renamed from: b */
    public final int mo53263b() {
        return this.f21013a.getMeasuredHeight();
    }
}

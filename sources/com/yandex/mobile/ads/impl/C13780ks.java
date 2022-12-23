package com.yandex.mobile.ads.impl;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.mobile.ads.impl.ks */
public final class C13780ks extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private Function0<Unit> f36404a;

    /* renamed from: b */
    private Function0<Unit> f36405b;

    /* renamed from: a */
    public final Function0<Unit> mo68261a() {
        return this.f36405b;
    }

    /* renamed from: b */
    public final void mo68263b(Function0<Unit> function0) {
        this.f36404a = function0;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        Function0<Unit> function0 = this.f36405b;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (this.f36405b == null || (function0 = this.f36404a) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (this.f36405b != null || (function0 = this.f36404a) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    /* renamed from: a */
    public final void mo68262a(Function0<Unit> function0) {
        this.f36405b = function0;
    }
}

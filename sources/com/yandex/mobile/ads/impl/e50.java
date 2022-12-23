package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.qo1;
import com.yandex.mobile.ads.impl.qo1.C14402a;
import java.lang.ref.WeakReference;

public class e50<T extends View & qo1.C14402a> {

    /* renamed from: a */
    private final T f32905a;

    /* renamed from: b */
    private final Handler f32906b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final c50 f32907c;

    /* renamed from: d */
    private final bx0 f32908d;

    /* renamed from: e */
    private Runnable f32909e;

    /* renamed from: com.yandex.mobile.ads.impl.e50$a */
    static class C12955a<T extends View & qo1.C14402a> implements Runnable {

        /* renamed from: b */
        private final WeakReference<bx0> f32910b;

        /* renamed from: c */
        private final WeakReference<T> f32911c;

        /* renamed from: d */
        private final Handler f32912d;

        /* renamed from: e */
        private final c50 f32913e;

        C12955a(T t, bx0 bx0, Handler handler, c50 c50) {
            this.f32911c = new WeakReference<>(t);
            this.f32910b = new WeakReference<>(bx0);
            this.f32912d = handler;
            this.f32913e = c50;
        }

        public void run() {
            View view = (View) this.f32911c.get();
            bx0 bx0 = (bx0) this.f32910b.get();
            if (view != null && bx0 != null) {
                bx0.mo65832a(this.f32913e.mo66204a(view));
                this.f32912d.postDelayed(this, 200);
            }
        }
    }

    public e50(T t, c50 c50, bx0 bx0) {
        this.f32905a = t;
        this.f32907c = c50;
        this.f32908d = bx0;
    }

    /* renamed from: a */
    public void mo66765a() {
        if (this.f32909e == null) {
            C12955a aVar = new C12955a(this.f32905a, this.f32908d, this.f32906b, this.f32907c);
            this.f32909e = aVar;
            this.f32906b.post(aVar);
        }
    }

    /* renamed from: b */
    public void mo66766b() {
        this.f32906b.removeCallbacksAndMessages((Object) null);
        this.f32909e = null;
    }
}

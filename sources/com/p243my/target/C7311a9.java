package com.p243my.target;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.a9 */
public class C7311a9 {

    /* renamed from: a */
    public final C7343c3 f18328a;

    /* renamed from: b */
    public final C7313b f18329b = new C7313b();

    /* renamed from: c */
    public final C7710v8 f18330c;

    /* renamed from: d */
    public final boolean f18331d;

    /* renamed from: e */
    public final float f18332e;

    /* renamed from: f */
    public final long f18333f;

    /* renamed from: g */
    public boolean f18334g;

    /* renamed from: h */
    public boolean f18335h;

    /* renamed from: i */
    public long f18336i = 0;

    /* renamed from: j */
    public C7314c f18337j;

    /* renamed from: k */
    public WeakReference<View> f18338k;

    /* renamed from: l */
    public boolean f18339l = false;

    /* renamed from: m */
    public boolean f18340m;

    /* renamed from: com.my.target.a9$b */
    public class C7313b implements Runnable {
        public C7313b() {
        }

        public void run() {
            C7311a9.this.mo49618a();
        }
    }

    /* renamed from: com.my.target.a9$c */
    public static abstract class C7314c {
        /* renamed from: a */
        public void mo49625a() {
        }

        /* renamed from: a */
        public void mo49626a(boolean z) {
        }
    }

    public C7311a9(C7746y1 y1Var, C7343c3 c3Var, boolean z) {
        float b = y1Var.mo51861b();
        this.f18332e = y1Var.mo51863c() * 100.0f;
        this.f18333f = (long) (y1Var.mo51859a() * 1000.0f);
        this.f18328a = c3Var;
        this.f18331d = z;
        this.f18330c = b == 1.0f ? C7710v8.f19526a : C7710v8.m20686a((int) (b * 1000.0f));
    }

    /* renamed from: a */
    public static double m18721a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || view.getAlpha() < 0.5f) {
            return 0.0d;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0.0d;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return ((double) (rect.width() * rect.height())) / (((double) (width * height)) / 100.0d);
        }
        return 0.0d;
    }

    /* renamed from: a */
    public static C7311a9 m18722a(C7746y1 y1Var, C7343c3 c3Var) {
        return new C7311a9(y1Var, c3Var, true);
    }

    /* renamed from: a */
    public static C7311a9 m18723a(C7746y1 y1Var, C7343c3 c3Var, boolean z) {
        return new C7311a9(y1Var, c3Var, z);
    }

    /* renamed from: a */
    public void mo49618a() {
        WeakReference<View> weakReference = this.f18338k;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            C7374e0.m18989a("ViewabilityTracker: tracking view disappeared");
            mo49622b();
            return;
        }
        mo49621a(m18721a(view) >= ((double) this.f18332e));
        if (!this.f18334g) {
            if (!this.f18339l) {
                this.f18336i = 0;
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f18336i == 0) {
                this.f18336i = currentTimeMillis;
            }
            if (currentTimeMillis - this.f18336i >= this.f18333f) {
                if (this.f18331d) {
                    mo49622b();
                }
                this.f18334g = true;
                mo49619a(view.getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo49619a(Context context) {
        C7741x8.m20827c((List<C7328b3>) this.f18328a.mo49800a("show"), context);
        C7314c cVar = this.f18337j;
        if (cVar != null) {
            cVar.mo49625a();
        }
    }

    /* renamed from: a */
    public void mo49620a(C7314c cVar) {
        this.f18337j = cVar;
    }

    /* renamed from: a */
    public final void mo49621a(boolean z) {
        if (this.f18339l != z) {
            this.f18339l = z;
            C7314c cVar = this.f18337j;
            if (cVar != null) {
                cVar.mo49626a(z);
            }
        }
    }

    /* renamed from: b */
    public void mo49622b() {
        this.f18339l = false;
        this.f18340m = false;
        this.f18330c.mo51750b(this.f18329b);
        this.f18338k = null;
    }

    /* renamed from: b */
    public void mo49623b(View view) {
        if (this.f18340m) {
            return;
        }
        if (!this.f18334g || !this.f18331d) {
            this.f18340m = true;
            this.f18336i = 0;
            this.f18338k = new WeakReference<>(view);
            if (!this.f18335h) {
                C7741x8.m20827c((List<C7328b3>) this.f18328a.mo49800a("render"), view.getContext());
                this.f18335h = true;
            }
            mo49618a();
            if (!this.f18334g || !this.f18331d) {
                this.f18330c.mo51748a((Runnable) this.f18329b);
            }
        }
    }
}

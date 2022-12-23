package com.p243my.target;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.a0 */
public class C7299a0 {

    /* renamed from: a */
    public final ArrayList<C7730x1> f18299a = new ArrayList<>();

    /* renamed from: b */
    public WeakReference<View> f18300b;

    /* renamed from: c */
    public float f18301c = -1.0f;

    /* renamed from: d */
    public long f18302d;

    public C7299a0(C7343c3 c3Var) {
        Iterator<C7747y2> it = c3Var.mo49799a().iterator();
        while (it.hasNext()) {
            C7747y2 next = it.next();
            if (next instanceof C7730x1) {
                this.f18299a.add((C7730x1) next);
            }
        }
    }

    /* renamed from: a */
    public static C7299a0 m18676a(C7343c3 c3Var) {
        return new C7299a0(c3Var);
    }

    /* renamed from: a */
    public final void mo49529a() {
        Iterator<C7730x1> it = this.f18299a.iterator();
        while (it.hasNext()) {
            it.next().mo51865a(-1.0f);
        }
    }

    /* renamed from: a */
    public final void mo49530a(double d, int i, Context context) {
        float f;
        ArrayList arrayList = new ArrayList();
        Iterator<C7730x1> it = this.f18299a.iterator();
        while (it.hasNext()) {
            C7730x1 next = it.next();
            int f2 = next.mo51820f();
            int e = next.mo51819e();
            if (!(f2 <= i && (e == 0 || e >= i)) || ((double) next.f18445d) > d) {
                f = -1.0f;
            } else {
                if (next.mo51866d() >= 0.0f) {
                    float f3 = (float) i;
                    if (f3 > next.mo51866d()) {
                        if (f3 - next.mo51866d() >= next.f19664e) {
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                }
                f = (float) i;
            }
            next.mo51865a(f);
        }
        if (!arrayList.isEmpty()) {
            C7741x8.m20827c((List<C7328b3>) arrayList, context);
        }
    }

    /* renamed from: a */
    public void mo49531a(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.f18300b) == null) {
            this.f18300b = new WeakReference<>(view);
        } else {
            weakReference.clear();
        }
    }

    /* renamed from: a */
    public final boolean mo49532a(int i) {
        float f = (float) i;
        float f2 = this.f18301c;
        if (f < f2) {
            return false;
        }
        return this.f18302d <= 0 || (((long) (f - f2)) * 1000) - (System.currentTimeMillis() - this.f18302d) <= 1000;
    }

    /* renamed from: b */
    public final void mo49533b(double d, int i, Context context) {
        if (!this.f18299a.isEmpty()) {
            if (context == null) {
                Iterator<C7730x1> it = this.f18299a.iterator();
                while (it.hasNext()) {
                    it.next().mo51865a(-1.0f);
                }
                return;
            }
            mo49530a(d, i, context);
        }
    }

    /* renamed from: b */
    public void mo49534b(int i) {
        View view;
        float f = (float) i;
        if (f != this.f18301c) {
            if (!mo49532a(i)) {
                mo49529a();
            }
            Context context = null;
            double d = 0.0d;
            WeakReference<View> weakReference = this.f18300b;
            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                d = C7311a9.m18721a(view);
                context = view.getContext();
            }
            mo49533b(d, i, context);
            this.f18301c = f;
            this.f18302d = System.currentTimeMillis();
        }
    }
}

package com.p243my.target;

import android.content.Context;
import android.widget.FrameLayout;
import com.p243my.target.C7409g0;
import com.p243my.target.C7596p1;
import com.p243my.target.C7651s5;
import com.p243my.target.C7702v5;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.h0 */
public final class C7432h0 implements C7651s5.C7652a, C7702v5.C7703a {

    /* renamed from: a */
    public final List<C7596p1.C7597a> f18671a;

    /* renamed from: b */
    public C7409g0.C7411b f18672b;

    /* renamed from: c */
    public WeakReference<C7651s5> f18673c;

    public C7432h0(List<C7596p1.C7597a> list) {
        this.f18671a = list;
    }

    /* renamed from: a */
    public static C7432h0 m19222a(List<C7596p1.C7597a> list) {
        return new C7432h0(list);
    }

    /* renamed from: a */
    public void mo50259a() {
        mo50264b();
    }

    /* renamed from: a */
    public void mo50260a(Context context) {
        try {
            C7651s5 a = C7651s5.m20348a(this, context);
            this.f18673c = new WeakReference<>(a);
            a.show();
        } catch (Throwable th) {
            th.printStackTrace();
            C7374e0.m18990b("Unable to start adchoices dialog");
            mo50267q();
        }
    }

    /* renamed from: a */
    public void mo50261a(C7409g0.C7411b bVar) {
        this.f18672b = bVar;
    }

    /* renamed from: a */
    public void mo50262a(C7596p1.C7597a aVar, Context context) {
        C7409g0.C7411b bVar;
        String str = aVar.f19167b;
        if (!(str == null || str.length() == 0)) {
            C7741x8.m20826c(str, context);
        }
        String str2 = aVar.f19168c;
        if (!(str2 == null || str2.length() == 0)) {
            C7534l8.m19712a(str2, context);
        }
        if (aVar.f19169d && (bVar = this.f18672b) != null) {
            bVar.mo49488a(context);
        }
        mo50264b();
    }

    /* renamed from: a */
    public void mo50263a(C7651s5 s5Var, FrameLayout frameLayout) {
        C7702v5 v5Var = new C7702v5(frameLayout.getContext());
        frameLayout.addView(v5Var, -1, -1);
        v5Var.mo51732a(this.f18671a, (C7702v5.C7703a) this);
        v5Var.mo51731a();
    }

    /* renamed from: b */
    public final void mo50264b() {
        C7651s5 s5Var;
        WeakReference<C7651s5> weakReference = this.f18673c;
        if (weakReference != null && (s5Var = (C7651s5) weakReference.get()) != null) {
            s5Var.dismiss();
        }
    }

    /* renamed from: b */
    public void mo50265b(boolean z) {
    }

    /* renamed from: c */
    public boolean mo50266c() {
        WeakReference<C7651s5> weakReference = this.f18673c;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: q */
    public void mo50267q() {
        WeakReference<C7651s5> weakReference = this.f18673c;
        if (weakReference != null) {
            weakReference.clear();
            this.f18673c = null;
        }
    }
}

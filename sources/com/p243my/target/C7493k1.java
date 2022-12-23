package com.p243my.target;

import android.app.Activity;
import com.p243my.target.C7320b0;
import com.p243my.target.C7524l3;
import com.p243my.target.C7644s0;
import com.p243my.target.ads.MyTargetView;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.k1 */
public class C7493k1 {

    /* renamed from: a */
    public final MyTargetView f18852a;

    /* renamed from: b */
    public final C7298a f18853b;

    /* renamed from: c */
    public final C7495b f18854c;

    /* renamed from: d */
    public final C7496c f18855d;

    /* renamed from: e */
    public final C7524l3.C7525a f18856e;

    /* renamed from: f */
    public C7644s0 f18857f;

    /* renamed from: g */
    public boolean f18858g = true;

    /* renamed from: h */
    public boolean f18859h;

    /* renamed from: i */
    public int f18860i = -1;

    /* renamed from: j */
    public long f18861j;

    /* renamed from: k */
    public long f18862k;

    /* renamed from: com.my.target.k1$a */
    public static class C7494a implements C7644s0.C7645a {

        /* renamed from: a */
        public final C7493k1 f18863a;

        public C7494a(C7493k1 k1Var) {
            this.f18863a = k1Var;
        }

        /* renamed from: a */
        public void mo50634a() {
            this.f18863a.mo50622e();
        }

        /* renamed from: b */
        public void mo50635b() {
            this.f18863a.mo50624g();
        }

        /* renamed from: c */
        public void mo50636c() {
            this.f18863a.mo50623f();
        }

        /* renamed from: d */
        public void mo50637d() {
            this.f18863a.mo50626i();
        }

        public void onClick() {
            this.f18863a.mo50621d();
        }

        public void onLoad() {
            this.f18863a.mo50625h();
        }

        public void onNoAd(String str) {
            this.f18863a.mo50615a(str);
        }
    }

    /* renamed from: com.my.target.k1$b */
    public static class C7495b {

        /* renamed from: a */
        public boolean f18864a;

        /* renamed from: b */
        public boolean f18865b;

        /* renamed from: c */
        public boolean f18866c;

        /* renamed from: d */
        public boolean f18867d;

        /* renamed from: e */
        public boolean f18868e;

        /* renamed from: f */
        public boolean f18869f;

        /* renamed from: g */
        public boolean f18870g;

        /* renamed from: a */
        public void mo50641a(boolean z) {
            this.f18867d = z;
        }

        /* renamed from: a */
        public boolean mo50642a() {
            return !this.f18865b && this.f18864a && (this.f18870g || !this.f18868e);
        }

        /* renamed from: b */
        public void mo50643b(boolean z) {
            this.f18869f = z;
        }

        /* renamed from: b */
        public boolean mo50644b() {
            return this.f18866c && this.f18864a && (this.f18870g || this.f18868e) && !this.f18869f && this.f18865b;
        }

        /* renamed from: c */
        public void mo50645c(boolean z) {
            this.f18870g = z;
        }

        /* renamed from: c */
        public boolean mo50646c() {
            return this.f18867d && this.f18866c && (this.f18870g || this.f18868e) && !this.f18864a;
        }

        /* renamed from: d */
        public void mo50647d(boolean z) {
            this.f18868e = z;
        }

        /* renamed from: d */
        public boolean mo50648d() {
            return this.f18864a;
        }

        /* renamed from: e */
        public void mo50649e(boolean z) {
            this.f18866c = z;
        }

        /* renamed from: e */
        public boolean mo50650e() {
            return this.f18865b;
        }

        /* renamed from: f */
        public void mo50651f() {
            this.f18869f = false;
            this.f18866c = false;
        }

        /* renamed from: f */
        public void mo50652f(boolean z) {
            this.f18865b = z;
        }

        /* renamed from: g */
        public void mo50653g(boolean z) {
            this.f18864a = z;
            this.f18865b = false;
        }
    }

    /* renamed from: com.my.target.k1$c */
    public static class C7496c implements Runnable {

        /* renamed from: a */
        public final WeakReference<C7493k1> f18871a;

        public C7496c(C7493k1 k1Var) {
            this.f18871a = new WeakReference<>(k1Var);
        }

        public void run() {
            C7493k1 k1Var = (C7493k1) this.f18871a.get();
            if (k1Var != null) {
                k1Var.mo50628k();
            }
        }
    }

    public C7493k1(MyTargetView myTargetView, C7298a aVar, C7524l3.C7525a aVar2) {
        C7495b bVar = new C7495b();
        this.f18854c = bVar;
        this.f18852a = myTargetView;
        this.f18853b = aVar;
        this.f18856e = aVar2;
        this.f18855d = new C7496c(this);
        if (!(myTargetView.getContext() instanceof Activity)) {
            C7374e0.m18989a("MyTargetView was created with non-activity focus, so system cannot automatically handle lifecycle");
            bVar.mo50645c(true);
            return;
        }
        bVar.mo50645c(false);
    }

    /* renamed from: a */
    public static C7493k1 m19529a(MyTargetView myTargetView, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7493k1(myTargetView, aVar, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19531a(C7731x2 x2Var, String str) {
        if (x2Var != null) {
            mo50618b(x2Var);
            return;
        }
        C7374e0.m18989a("No new ad");
        mo50631n();
    }

    /* renamed from: a */
    public void mo50612a() {
        if (this.f18854c.mo50648d()) {
            mo50633p();
        }
        this.f18854c.mo50651f();
        mo50629l();
    }

    /* renamed from: a */
    public void mo50613a(MyTargetView.AdSize adSize) {
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.mo50046a(adSize);
        }
    }

    /* renamed from: a */
    public final void mo50614a(C7731x2 x2Var) {
        boolean z = true;
        this.f18859h = x2Var.mo51824d() && this.f18853b.isRefreshAd() && !this.f18853b.getFormat().equals("standard_300x250");
        C7523l2 c = x2Var.mo51823c();
        if (c == null) {
            C7541m2 b = x2Var.mo51418b();
            if (b == null) {
                MyTargetView.MyTargetViewListener listener = this.f18852a.getListener();
                if (listener != null) {
                    listener.onNoAd("no ad", this.f18852a);
                    return;
                }
                return;
            }
            this.f18857f = C7375e1.m18992a(this.f18852a, b, this.f18853b, this.f18856e);
            if (this.f18859h) {
                int a = b.mo50845a() * 1000;
                this.f18860i = a;
                if (a <= 0) {
                    z = false;
                }
                this.f18859h = z;
                return;
            }
            return;
        }
        this.f18857f = C7473j1.m19467a(this.f18852a, c, this.f18856e);
        this.f18860i = c.getTimeout() * 1000;
    }

    /* renamed from: a */
    public void mo50615a(String str) {
        if (this.f18858g) {
            this.f18854c.mo50649e(false);
            MyTargetView.MyTargetViewListener listener = this.f18852a.getListener();
            if (listener != null) {
                listener.onNoAd(str, this.f18852a);
            }
            this.f18858g = false;
            return;
        }
        mo50629l();
        mo50631n();
    }

    /* renamed from: a */
    public void mo50616a(boolean z) {
        this.f18854c.mo50641a(z);
        this.f18854c.mo50647d(this.f18852a.hasWindowFocus());
        if (this.f18854c.mo50646c()) {
            mo50632o();
        } else if (!z && this.f18854c.mo50648d()) {
            mo50633p();
        }
    }

    /* renamed from: b */
    public String mo50617b() {
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            return s0Var.mo50574c();
        }
        return null;
    }

    /* renamed from: b */
    public void mo50618b(C7731x2 x2Var) {
        if (this.f18854c.mo50648d()) {
            mo50633p();
        }
        mo50629l();
        mo50614a(x2Var);
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.mo50048a((C7644s0.C7645a) new C7494a(this));
            this.f18861j = System.currentTimeMillis() + ((long) this.f18860i);
            this.f18862k = 0;
            if (this.f18859h && this.f18854c.mo50650e()) {
                this.f18862k = (long) this.f18860i;
            }
            this.f18857f.mo50053i();
        }
    }

    /* renamed from: b */
    public void mo50619b(boolean z) {
        this.f18854c.mo50647d(z);
        if (this.f18854c.mo50646c()) {
            mo50632o();
        } else if (this.f18854c.mo50644b()) {
            mo50630m();
        } else if (this.f18854c.mo50642a()) {
            mo50627j();
        }
    }

    /* renamed from: c */
    public float mo50620c() {
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            return s0Var.mo50575d();
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void mo50621d() {
        MyTargetView.MyTargetViewListener listener = this.f18852a.getListener();
        if (listener != null) {
            listener.onClick(this.f18852a);
        }
    }

    /* renamed from: e */
    public void mo50622e() {
        this.f18854c.mo50643b(false);
        if (this.f18854c.mo50644b()) {
            mo50630m();
        }
    }

    /* renamed from: f */
    public void mo50623f() {
        mo50629l();
    }

    /* renamed from: g */
    public void mo50624g() {
        if (this.f18854c.mo50642a()) {
            mo50627j();
        }
        this.f18854c.mo50643b(true);
    }

    /* renamed from: h */
    public void mo50625h() {
        if (this.f18858g) {
            this.f18854c.mo50649e(true);
            MyTargetView.MyTargetViewListener listener = this.f18852a.getListener();
            if (listener != null) {
                listener.onLoad(this.f18852a);
            }
            this.f18858g = false;
        }
        if (this.f18854c.mo50646c()) {
            mo50632o();
        }
    }

    /* renamed from: i */
    public final void mo50626i() {
        MyTargetView.MyTargetViewListener listener = this.f18852a.getListener();
        if (listener != null) {
            listener.onShow(this.f18852a);
        }
    }

    /* renamed from: j */
    public void mo50627j() {
        this.f18852a.removeCallbacks(this.f18855d);
        if (this.f18859h) {
            this.f18862k = this.f18861j - System.currentTimeMillis();
        }
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.mo50049b();
        }
        this.f18854c.mo50652f(true);
    }

    /* renamed from: k */
    public void mo50628k() {
        C7374e0.m18989a("load new standard ad");
        C7320b0.m18752a(this.f18853b, this.f18856e).mo49685a(new C7320b0.C7322b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                C7493k1.this.m19531a((C7731x2) q2Var, str);
            }
        }).mo49692b(this.f18856e.mo50803a(), this.f18852a.getContext());
    }

    /* renamed from: l */
    public void mo50629l() {
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.destroy();
            this.f18857f.mo50048a((C7644s0.C7645a) null);
            this.f18857f = null;
        }
        this.f18852a.removeAllViews();
    }

    /* renamed from: m */
    public void mo50630m() {
        if (this.f18862k > 0 && this.f18859h) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f18862k;
            this.f18861j = currentTimeMillis + j;
            this.f18852a.postDelayed(this.f18855d, j);
            this.f18862k = 0;
        }
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.mo50044a();
        }
        this.f18854c.mo50652f(false);
    }

    /* renamed from: n */
    public void mo50631n() {
        if (this.f18859h && this.f18860i > 0) {
            this.f18852a.removeCallbacks(this.f18855d);
            this.f18852a.postDelayed(this.f18855d, (long) this.f18860i);
        }
    }

    /* renamed from: o */
    public void mo50632o() {
        int i = this.f18860i;
        if (i > 0 && this.f18859h) {
            this.f18852a.postDelayed(this.f18855d, (long) i);
        }
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.mo50052f();
        }
        this.f18854c.mo50653g(true);
    }

    /* renamed from: p */
    public void mo50633p() {
        this.f18854c.mo50653g(false);
        this.f18852a.removeCallbacks(this.f18855d);
        C7644s0 s0Var = this.f18857f;
        if (s0Var != null) {
            s0Var.mo50051e();
        }
    }
}

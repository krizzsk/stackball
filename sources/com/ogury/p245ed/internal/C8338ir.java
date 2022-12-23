package com.ogury.p245ed.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ir */
public final class C8338ir {

    /* renamed from: a */
    private final C8335io f21536a;

    /* renamed from: b */
    private final List<C8337iq> f21537b;

    /* renamed from: c */
    private final C8331il f21538c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f21539d;

    /* renamed from: e */
    private int f21540e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f21541f;

    /* renamed from: g */
    private Handler f21542g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8334in f21543h;

    /* renamed from: i */
    private C8323if f21544i;

    private C8338ir(C8335io ioVar) {
        C8467mq.m23881b(ioVar, "loadStrategyFactory");
        this.f21536a = ioVar;
        this.f21537b = new LinkedList();
        this.f21538c = m23549c();
        this.f21542g = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ C8338ir() {
        this(new C8335io());
    }

    /* renamed from: a */
    public final C8323if mo53752a() {
        return this.f21544i;
    }

    /* renamed from: a */
    public final void mo53753a(C8323if ifVar) {
        this.f21544i = ifVar;
    }

    /* renamed from: com.ogury.ed.internal.ir$a */
    public static final class C8339a implements C8331il {

        /* renamed from: a */
        final /* synthetic */ C8338ir f21545a;

        C8339a(C8338ir irVar) {
            this.f21545a = irVar;
        }

        /* renamed from: a */
        public final void mo53750a(C8185eb ebVar) {
            C8467mq.m23881b(ebVar, "ad");
            C8323if a = this.f21545a.mo53752a();
            if (a != null) {
                a.mo53735a(ebVar);
            }
            C8338ir irVar = this.f21545a;
            irVar.f21539d = irVar.f21539d + 1;
            C8334in b = this.f21545a.f21543h;
            if (b != null) {
                b.mo53742a();
            }
            this.f21545a.m23551d();
        }

        /* renamed from: a */
        public final void mo53749a() {
            C8338ir irVar = this.f21545a;
            irVar.f21539d = irVar.f21539d + 1;
            C8334in b = this.f21545a.f21543h;
            if (b != null) {
                b.mo53742a();
            }
            if (this.f21545a.m23553e() && !this.f21545a.f21541f) {
                this.f21545a.m23557g();
            }
        }

        /* renamed from: b */
        public final void mo53751b() {
            this.f21545a.m23559h();
        }
    }

    /* renamed from: c */
    private final C8331il m23549c() {
        return new C8339a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m23551d() {
        if (m23556f()) {
            m23559h();
        } else if (m23553e()) {
            m23557g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m23553e() {
        return this.f21539d == this.f21537b.size();
    }

    /* renamed from: f */
    private final boolean m23556f() {
        return this.f21540e == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m23557g() {
        this.f21537b.clear();
        m23561i();
        C8323if ifVar = this.f21544i;
        if (ifVar != null) {
            ifVar.mo53734a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m23559h() {
        m23561i();
        this.f21541f = true;
        C8323if ifVar = this.f21544i;
        if (ifVar != null) {
            ifVar.mo53736b();
        }
    }

    /* renamed from: a */
    public final void mo53755a(C8337iq iqVar) {
        C8467mq.m23881b(iqVar, "command");
        this.f21537b.add(iqVar);
    }

    /* renamed from: a */
    public final void mo53754a(C8326ii iiVar, long j, int i) {
        C8467mq.m23881b(iiVar, "chromeVersionHelper");
        this.f21540e = i;
        C8334in a = C8335io.m23538a(this.f21538c, iiVar);
        this.f21543h = a;
        if (a != null) {
            a.mo53743a(this.f21537b);
        }
        m23546a(j);
    }

    /* renamed from: i */
    private final void m23561i() {
        this.f21542g.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    private final void m23546a(long j) {
        C8467mq.m23873a("load timeout ", (Object) Long.valueOf(j));
        this.f21542g.postDelayed(new Runnable() {
            public final void run() {
                C8338ir.m23560h(C8338ir.this);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m23560h(C8338ir irVar) {
        C8467mq.m23881b(irVar, "this$0");
        irVar.m23562j();
    }

    /* renamed from: j */
    private final void m23562j() {
        if (m23564l()) {
            m23563k();
            m23557g();
            return;
        }
        m23565m();
        C8323if ifVar = this.f21544i;
        if (ifVar != null) {
            ifVar.mo53736b();
        }
    }

    /* renamed from: k */
    private final void m23563k() {
        for (C8337iq next : this.f21537b) {
            if (next instanceof C8332im) {
                next.mo53746b();
            }
        }
    }

    /* renamed from: l */
    private final boolean m23564l() {
        for (C8337iq next : this.f21537b) {
            if (!next.mo53745a() && !(next instanceof C8332im)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private final void m23565m() {
        for (C8337iq b : this.f21537b) {
            b.mo53746b();
        }
    }

    /* renamed from: b */
    public final void mo53756b() {
        m23561i();
        m23565m();
        this.f21537b.clear();
        this.f21539d = 0;
        this.f21541f = false;
    }
}

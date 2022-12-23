package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C11962y;
import com.yandex.metrica.impl.p265ob.C11997z;

/* renamed from: com.yandex.metrica.impl.ob.I2 */
public class C10353I2 {

    /* renamed from: a */
    private final C10868W0 f24860a;

    /* renamed from: b */
    private final C11962y f24861b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11694qm<C11729s1> f24862c;

    /* renamed from: d */
    private final C11962y.C11964b f24863d;

    /* renamed from: e */
    private final C11962y.C11964b f24864e;

    /* renamed from: f */
    private final C11997z f24865f;

    /* renamed from: g */
    private final C11924x f24866g;

    /* renamed from: com.yandex.metrica.impl.ob.I2$a */
    class C10354a implements C11962y.C11964b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$a$a */
        class C10355a implements C10943Y1<C11729s1> {

            /* renamed from: a */
            final /* synthetic */ Activity f24868a;

            C10355a(Activity activity) {
                this.f24868a = activity;
            }

            /* renamed from: b */
            public void mo61124b(Object obj) {
                C10353I2.m26497a(C10353I2.this, this.f24868a, (C11729s1) obj);
            }
        }

        C10354a() {
        }

        /* renamed from: a */
        public void mo61122a(Activity activity, C11962y.C11963a aVar) {
            C10353I2.this.f24862c.mo63557a(new C10355a(activity));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.I2$b */
    class C10356b implements C11962y.C11964b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$b$a */
        class C10357a implements C10943Y1<C11729s1> {

            /* renamed from: a */
            final /* synthetic */ Activity f24871a;

            C10357a(Activity activity) {
                this.f24871a = activity;
            }

            /* renamed from: b */
            public void mo61124b(Object obj) {
                C10353I2.m26498b(C10353I2.this, this.f24871a, (C11729s1) obj);
            }
        }

        C10356b() {
        }

        /* renamed from: a */
        public void mo61122a(Activity activity, C11962y.C11963a aVar) {
            C10353I2.this.f24862c.mo63557a(new C10357a(activity));
        }
    }

    public C10353I2(C11962y yVar, C11769sn snVar, C11924x xVar) {
        this(C10611Oh.m27142a(), yVar, xVar, new C11694qm(snVar), new C11997z());
    }

    /* renamed from: b */
    public void mo61477b(Activity activity, C10794U0 u0) {
        if (activity != null) {
            this.f24866g.mo64049a(activity);
        }
        if (this.f24865f.mo64179a(activity, C11997z.C11998a.RESUMED)) {
            u0.mo61670a(activity);
        }
    }

    /* renamed from: a */
    public C11962y.C11965c mo61474a(boolean z) {
        this.f24861b.mo64107a(this.f24863d, C11962y.C11963a.RESUMED);
        this.f24861b.mo64107a(this.f24864e, C11962y.C11963a.PAUSED);
        C11962y.C11965c a = this.f24861b.mo64104a();
        if (a == C11962y.C11965c.WATCHING) {
            this.f24860a.reportEvent(z ? "session_auto_tracking_listener_registered_auto" : "session_auto_tracking_listener_registered_manual");
        }
        return a;
    }

    C10353I2(C10868W0 w0, C11962y yVar, C11924x xVar, C11694qm<C11729s1> qmVar, C11997z zVar) {
        this.f24861b = yVar;
        this.f24860a = w0;
        this.f24866g = xVar;
        this.f24862c = qmVar;
        this.f24865f = zVar;
        this.f24863d = new C10354a();
        this.f24864e = new C10356b();
    }

    /* renamed from: b */
    static void m26498b(C10353I2 i2, Activity activity, C10794U0 u0) {
        if (i2.f24865f.mo64179a(activity, C11997z.C11998a.PAUSED)) {
            ((C11729s1) u0).mo61679b(activity);
        }
    }

    /* renamed from: a */
    public void mo61475a(Activity activity, C10794U0 u0) {
        if (activity != null) {
            this.f24866g.mo64049a(activity);
        }
        if (this.f24865f.mo64179a(activity, C11997z.C11998a.PAUSED)) {
            u0.mo61679b(activity);
        }
    }

    /* renamed from: a */
    public void mo61476a(C11729s1 s1Var) {
        this.f24862c.mo63558a(s1Var);
    }

    /* renamed from: a */
    static void m26497a(C10353I2 i2, Activity activity, C10794U0 u0) {
        if (i2.f24865f.mo64179a(activity, C11997z.C11998a.RESUMED)) {
            ((C11729s1) u0).mo61670a(activity);
        }
    }
}

package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10089A;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.e4 */
public class C11174e4 {

    /* renamed from: a */
    private final C11229f4 f26764a;

    /* renamed from: b */
    private final C11631pe f26765b;

    /* renamed from: c */
    private List<C11184j> f26766c;

    /* renamed from: com.yandex.metrica.impl.ob.e4$b */
    public static class C11176b {

        /* renamed from: a */
        private final C11229f4 f26767a;

        public C11176b(C11229f4 f4Var) {
            this.f26767a = f4Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11174e4 mo62807a(C11631pe peVar) {
            return new C11174e4(this.f26767a, peVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$c */
    static class C11177c extends C11184j {

        /* renamed from: b */
        private final C11789te f26768b;

        /* renamed from: c */
        private final C10306G9 f26769c;

        C11177c(C11229f4 f4Var) {
            super(f4Var);
            this.f26768b = new C11789te(f4Var.mo62874g(), f4Var.mo62872e().toString());
            this.f26769c = f4Var.mo62873f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            C11974y6 y6Var = new C11974y6(this.f26769c, "background");
            if (!y6Var.mo64134h()) {
                long c = this.f26768b.mo63730c(-1);
                if (c != -1) {
                    y6Var.mo64128d(c);
                }
                long a = this.f26768b.mo63725a(Long.MIN_VALUE);
                if (a != Long.MIN_VALUE) {
                    y6Var.mo64121a(a);
                }
                long b = this.f26768b.mo63728b(0);
                if (b != 0) {
                    y6Var.mo64126c(b);
                }
                long d = this.f26768b.mo63731d(0);
                if (d != 0) {
                    y6Var.mo64130e(d);
                }
                y6Var.mo64125b();
            }
            C11974y6 y6Var2 = new C11974y6(this.f26769c, "foreground");
            if (!y6Var2.mo64134h()) {
                long g = this.f26768b.mo63735g(-1);
                if (-1 != g) {
                    y6Var2.mo64128d(g);
                }
                boolean booleanValue = this.f26768b.mo63727a(true).booleanValue();
                if (booleanValue) {
                    y6Var2.mo64122a(booleanValue);
                }
                long e = this.f26768b.mo63732e(Long.MIN_VALUE);
                if (e != Long.MIN_VALUE) {
                    y6Var2.mo64121a(e);
                }
                long f = this.f26768b.mo63733f(0);
                if (f != 0) {
                    y6Var2.mo64126c(f);
                }
                long h = this.f26768b.mo63737h(0);
                if (h != 0) {
                    y6Var2.mo64130e(h);
                }
                y6Var2.mo64125b();
            }
            C10089A.C10090a f2 = this.f26768b.mo63734f();
            if (f2 != null) {
                this.f26769c.mo61357a(f2);
            }
            String b2 = this.f26768b.mo63729b((String) null);
            if (!TextUtils.isEmpty(b2) && TextUtils.isEmpty(this.f26769c.mo61376m())) {
                this.f26769c.mo61371i(b2);
            }
            long i = this.f26768b.mo63739i(Long.MIN_VALUE);
            if (i != Long.MIN_VALUE && this.f26769c.mo61359b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f26769c.mo61360c(i);
            }
            this.f26768b.mo63738h();
            this.f26769c.mo61454c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return this.f26768b.mo63736g();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$d */
    static class C11178d extends C11185k {
        C11178d(C11229f4 f4Var, C11631pe peVar) {
            super(f4Var, peVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            mo62811d().mo63484a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return mo62810a() instanceof C11586o4;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$e */
    static class C11179e extends C11184j {

        /* renamed from: b */
        private final C11682qe f26770b;

        /* renamed from: c */
        private final C10217E9 f26771c;

        C11179e(C11229f4 f4Var, C11682qe qeVar) {
            super(f4Var);
            this.f26770b = qeVar;
            this.f26771c = f4Var.mo62882o();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            if ("DONE".equals(this.f26770b.mo63537c((String) null))) {
                this.f26771c.mo61230i();
            }
            if ("DONE".equals(this.f26770b.mo63539d((String) null))) {
                this.f26771c.mo61231j();
            }
            this.f26770b.mo63542h();
            this.f26770b.mo63541g();
            this.f26770b.mo63543i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return "DONE".equals(this.f26770b.mo63537c((String) null)) || "DONE".equals(this.f26770b.mo63539d((String) null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$f */
    static class C11180f extends C11185k {
        C11180f(C11229f4 f4Var, C11631pe peVar) {
            super(f4Var, peVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            C11631pe d = mo62811d();
            if (mo62810a() instanceof C11586o4) {
                d.mo63486b();
            } else {
                d.mo63487c();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return mo62810a().mo62882o().mo61226f((String) null) == null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$g */
    static class C11181g extends C11184j {

        /* renamed from: b */
        private final C10364I9 f26772b;

        C11181g(C11229f4 f4Var, C10364I9 i9) {
            super(f4Var);
            this.f26772b = i9;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            if (this.f26772b.mo61446a(new C11984ye("REFERRER_HANDLED", (String) null).mo64145a(), false)) {
                mo62810a().mo62873f().mo61379p();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$h */
    static class C11182h extends C11184j {
        @Deprecated

        /* renamed from: c */
        static final C11984ye f26773c = new C11984ye("SESSION_SLEEP_START", (String) null);
        @Deprecated

        /* renamed from: d */
        static final C11984ye f26774d = new C11984ye("SESSION_ID", (String) null);
        @Deprecated

        /* renamed from: e */
        static final C11984ye f26775e = new C11984ye("SESSION_COUNTER_ID", (String) null);
        @Deprecated

        /* renamed from: f */
        static final C11984ye f26776f = new C11984ye("SESSION_INIT_TIME", (String) null);
        @Deprecated

        /* renamed from: g */
        static final C11984ye f26777g = new C11984ye("SESSION_IS_ALIVE_REPORT_NEEDED", (String) null);
        @Deprecated

        /* renamed from: h */
        static final C11984ye f26778h = new C11984ye("BG_SESSION_ID", (String) null);
        @Deprecated

        /* renamed from: i */
        static final C11984ye f26779i = new C11984ye("BG_SESSION_SLEEP_START", (String) null);
        @Deprecated

        /* renamed from: j */
        static final C11984ye f26780j = new C11984ye("BG_SESSION_COUNTER_ID", (String) null);
        @Deprecated

        /* renamed from: k */
        static final C11984ye f26781k = new C11984ye("BG_SESSION_INIT_TIME", (String) null);
        @Deprecated

        /* renamed from: l */
        static final C11984ye f26782l = new C11984ye("BG_SESSION_IS_ALIVE_REPORT_NEEDED", (String) null);

        /* renamed from: b */
        private final C10306G9 f26783b;

        C11182h(C11229f4 f4Var) {
            super(f4Var);
            this.f26783b = f4Var.mo62873f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            C10306G9 g9 = this.f26783b;
            C11984ye yeVar = f26779i;
            long a = g9.mo61443a(yeVar.mo64145a(), -2147483648L);
            if (a != -2147483648L) {
                C11974y6 y6Var = new C11974y6(this.f26783b, "background");
                if (!y6Var.mo64134h()) {
                    if (a != 0) {
                        y6Var.mo64130e(a);
                    }
                    long a2 = this.f26783b.mo61443a(f26778h.mo64145a(), -1);
                    if (a2 != -1) {
                        y6Var.mo64128d(a2);
                    }
                    boolean a3 = this.f26783b.mo61446a(f26782l.mo64145a(), true);
                    if (a3) {
                        y6Var.mo64122a(a3);
                    }
                    long a4 = this.f26783b.mo61443a(f26781k.mo64145a(), Long.MIN_VALUE);
                    if (a4 != Long.MIN_VALUE) {
                        y6Var.mo64121a(a4);
                    }
                    long a5 = this.f26783b.mo61443a(f26780j.mo64145a(), 0);
                    if (a5 != 0) {
                        y6Var.mo64126c(a5);
                    }
                    y6Var.mo64125b();
                }
            }
            C10306G9 g92 = this.f26783b;
            C11984ye yeVar2 = f26773c;
            long a6 = g92.mo61443a(yeVar2.mo64145a(), -2147483648L);
            if (a6 != -2147483648L) {
                C11974y6 y6Var2 = new C11974y6(this.f26783b, "foreground");
                if (!y6Var2.mo64134h()) {
                    if (a6 != 0) {
                        y6Var2.mo64130e(a6);
                    }
                    long a7 = this.f26783b.mo61443a(f26774d.mo64145a(), -1);
                    if (-1 != a7) {
                        y6Var2.mo64128d(a7);
                    }
                    boolean a8 = this.f26783b.mo61446a(f26777g.mo64145a(), true);
                    if (a8) {
                        y6Var2.mo64122a(a8);
                    }
                    long a9 = this.f26783b.mo61443a(f26776f.mo64145a(), Long.MIN_VALUE);
                    if (a9 != Long.MIN_VALUE) {
                        y6Var2.mo64121a(a9);
                    }
                    long a10 = this.f26783b.mo61443a(f26775e.mo64145a(), 0);
                    if (a10 != 0) {
                        y6Var2.mo64126c(a10);
                    }
                    y6Var2.mo64125b();
                }
            }
            this.f26783b.mo61457e(yeVar2.mo64145a());
            this.f26783b.mo61457e(f26774d.mo64145a());
            this.f26783b.mo61457e(f26775e.mo64145a());
            this.f26783b.mo61457e(f26776f.mo64145a());
            this.f26783b.mo61457e(f26777g.mo64145a());
            this.f26783b.mo61457e(f26778h.mo64145a());
            this.f26783b.mo61457e(yeVar.mo64145a());
            this.f26783b.mo61457e(f26780j.mo64145a());
            this.f26783b.mo61457e(f26781k.mo64145a());
            this.f26783b.mo61457e(f26782l.mo64145a());
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$i */
    static class C11183i extends C11184j {

        /* renamed from: b */
        private final C10217E9 f26784b;

        /* renamed from: c */
        private final C10306G9 f26785c;

        /* renamed from: d */
        private final C10363I8 f26786d;

        /* renamed from: e */
        private final String f26787e = new C11984ye("LAST_REQUEST_ID").mo64145a();

        /* renamed from: f */
        private final String f26788f = new C11984ye("NEXT_EVENT_GLOBAL_NUMBER").mo64145a();

        /* renamed from: g */
        private final String f26789g = new C11984ye("CURRENT_SESSION_ID").mo64145a();

        /* renamed from: h */
        private final String f26790h = new C11984ye("ATTRIBUTION_ID").mo64145a();

        /* renamed from: i */
        private final String f26791i = new C11984ye("OPEN_ID").mo64145a();

        C11183i(C11229f4 f4Var) {
            super(f4Var);
            this.f26784b = f4Var.mo62882o();
            this.f26785c = f4Var.mo62873f();
            this.f26786d = f4Var.mo62889w();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            JSONObject jSONObject = new JSONObject();
            for (String next : this.f26785c.mo61456d()) {
                if (next.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(next.substring(21))), this.f26785c.mo61442a(next, 0));
                        this.f26785c.mo61457e(next);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f26786d.mo61482a(this.f26784b.mo61225e(), this.f26784b.mo61227f(), this.f26785c.mo61452b(this.f26787e) ? Integer.valueOf(this.f26785c.mo61442a(this.f26787e, -1)) : null, this.f26785c.mo61452b(this.f26788f) ? Integer.valueOf(this.f26785c.mo61442a(this.f26788f, 0)) : null, this.f26785c.mo61452b(this.f26789g) ? Long.valueOf(this.f26785c.mo61443a(this.f26789g, -1)) : null, this.f26785c.mo61382s(), jSONObject, this.f26785c.mo61452b(this.f26791i) ? Integer.valueOf(this.f26785c.mo61442a(this.f26791i, 1)) : null, this.f26785c.mo61452b(this.f26790h) ? Integer.valueOf(this.f26785c.mo61442a(this.f26790h, 1)) : null, this.f26785c.mo61372i());
            this.f26784b.mo61228g().mo61229h().mo61454c();
            this.f26785c.mo61381r().mo61380q().mo61457e(this.f26787e).mo61457e(this.f26788f).mo61457e(this.f26789g).mo61457e(this.f26790h).mo61457e(this.f26791i).mo61454c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$j */
    static abstract class C11184j {

        /* renamed from: a */
        private final C11229f4 f26792a;

        C11184j(C11229f4 f4Var) {
            this.f26792a = f4Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11229f4 mo62810a() {
            return this.f26792a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo62808b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract boolean mo62809c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$k */
    private static abstract class C11185k extends C11184j {

        /* renamed from: b */
        private C11631pe f26793b;

        C11185k(C11229f4 f4Var, C11631pe peVar) {
            super(f4Var);
            this.f26793b = peVar;
        }

        /* renamed from: d */
        public C11631pe mo62811d() {
            return this.f26793b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$l */
    static class C11186l extends C11184j {

        /* renamed from: b */
        private final C10217E9 f26794b;

        C11186l(C11229f4 f4Var) {
            super(f4Var);
            this.f26794b = f4Var.mo62882o();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo62808b() {
            this.f26794b.mo61457e(new C11984ye("first_event_description_key", (String) null).mo64145a()).mo61454c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo62809c() {
            return true;
        }
    }

    /* renamed from: b */
    private void m28815b() {
        LinkedList linkedList = new LinkedList();
        this.f26766c = linkedList;
        linkedList.add(new C11178d(this.f26764a, this.f26765b));
        this.f26766c.add(new C11180f(this.f26764a, this.f26765b));
        List<C11184j> list = this.f26766c;
        C11229f4 f4Var = this.f26764a;
        list.add(new C11179e(f4Var, f4Var.mo62881n()));
        this.f26766c.add(new C11177c(this.f26764a));
        this.f26766c.add(new C11182h(this.f26764a));
        List<C11184j> list2 = this.f26766c;
        C11229f4 f4Var2 = this.f26764a;
        list2.add(new C11181g(f4Var2, f4Var2.mo62886t()));
        this.f26766c.add(new C11186l(this.f26764a));
        this.f26766c.add(new C11183i(this.f26764a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62806a() {
        if (!C11631pe.f27919b.values().contains(this.f26764a.mo62872e().mo62715a())) {
            for (C11184j next : this.f26766c) {
                if (next.mo62809c()) {
                    next.mo62808b();
                }
            }
        }
    }

    private C11174e4(C11229f4 f4Var, C11631pe peVar) {
        this.f26764a = f4Var;
        this.f26765b = peVar;
        m28815b();
    }
}

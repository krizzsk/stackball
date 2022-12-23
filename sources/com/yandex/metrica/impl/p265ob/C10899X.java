package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.p265ob.C10653Q1;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.X */
public class C10899X extends C10653Q1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10248F9 f26208a;

    /* renamed from: com.yandex.metrica.impl.ob.X$a */
    class C10900a extends SparseArray<C10653Q1.C10654a> {
        C10900a() {
            put(47, new C10902c(C10899X.this.f26208a));
            put(66, new C10903d(C10899X.this, C10899X.this.f26208a));
            put(89, new C10901b(C10899X.this.f26208a));
            put(99, new C10904e(C10899X.this.f26208a));
            put(105, new C10905f(C10899X.this.f26208a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$d */
    private class C10903d implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10248F9 f26212a;

        public C10903d(C10899X x, C10248F9 f9) {
            this.f26212a = f9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f26212a.mo61457e(new C11984ye("COOKIE_BROWSERS", (String) null).mo64145a());
            this.f26212a.mo61457e(new C11984ye("BIND_ID_URL", (String) null).mo64145a());
            C10823V0.m27964a(context, "b_meta.dat");
            C10823V0.m27964a(context, "browsers.dat");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$e */
    static class C10904e implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10248F9 f26213a;

        C10904e(C10248F9 f9) {
            this.f26213a = f9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f26213a.mo61457e(new C11984ye("DEVICE_ID_POSSIBLE", (String) null).mo64145a()).mo61454c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$f */
    static class C10905f implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10248F9 f26214a;

        C10905f(C10248F9 f9) {
            this.f26214a = f9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f26214a.mo61457e(new C11984ye("STARTUP_REQUEST_TIME", (String) null).mo64145a()).mo61454c();
        }
    }

    public C10899X(Context context) {
        this(new C10248F9(C10663Qa.m27298a(context).mo61961d()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SparseArray<C10653Q1.C10654a> mo61343a() {
        return new C10900a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61342a(C11816ue ueVar) {
        return (int) this.f26208a.mo61270b(-1);
    }

    C10899X(C10248F9 f9) {
        this.f26208a = f9;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61344a(C11816ue ueVar, int i) {
        this.f26208a.mo61280e((long) i);
        ueVar.mo63790g().mo63599b();
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$b */
    static class C10901b implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10248F9 f26210a;

        C10901b(C10248F9 f9) {
            this.f26210a = f9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            String k = this.f26210a.mo61301k((String) null);
            String m = this.f26210a.mo61305m((String) null);
            String l = this.f26210a.mo61303l((String) null);
            String f = this.f26210a.mo61286f((String) null);
            String g = this.f26210a.mo61289g((String) null);
            String i = this.f26210a.mo61296i((String) null);
            this.f26210a.mo61281e(m28166a(k));
            this.f26210a.mo61294i(m28166a(m));
            this.f26210a.mo61278d(m28166a(l));
            this.f26210a.mo61265a(m28166a(f));
            this.f26210a.mo61271b(m28166a(g));
            this.f26210a.mo61292h(m28166a(i));
        }

        /* renamed from: a */
        private C11258g1 m28166a(String str) {
            boolean isEmpty = TextUtils.isEmpty(str);
            return new C11258g1(str, isEmpty ? C11171e1.UNKNOWN : C11171e1.f26755b, isEmpty ? "no identifier saved in previous version" : null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$c */
    static class C10902c implements C10653Q1.C10654a {

        /* renamed from: a */
        private C10248F9 f26211a;

        public C10902c(C10248F9 f9) {
            this.f26211a = f9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C11748se seVar = new C11748se(context);
            if (C10796U2.m27897b((Map) seVar.mo63638g())) {
                return;
            }
            if (this.f26211a.mo61305m((String) null) == null || this.f26211a.mo61301k((String) null) == null) {
                String e = seVar.mo63635e((String) null);
                if (m28168a(e, this.f26211a.mo61301k((String) null))) {
                    this.f26211a.mo61314r(e);
                }
                String f = seVar.mo63637f((String) null);
                if (m28168a(f, this.f26211a.mo61305m((String) null))) {
                    this.f26211a.mo61316s(f);
                }
                String b = seVar.mo63632b((String) null);
                if (m28168a(b, this.f26211a.mo61286f((String) null))) {
                    this.f26211a.mo61306n(b);
                }
                String c = seVar.mo63633c((String) null);
                if (m28168a(c, this.f26211a.mo61289g((String) null))) {
                    this.f26211a.mo61308o(c);
                }
                String d = seVar.mo63634d((String) null);
                if (m28168a(d, this.f26211a.mo61296i((String) null))) {
                    this.f26211a.mo61311p(d);
                }
                long a = seVar.mo63631a(-1);
                if (a != -1 && this.f26211a.mo61277d(-1) == -1) {
                    this.f26211a.mo61291h(a);
                }
                this.f26211a.mo61454c();
                seVar.mo63636f().mo63599b();
            }
        }

        /* renamed from: a */
        private boolean m28168a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}

package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.i0 */
class C0727i0 {

    /* renamed from: c */
    private static final String f1088c = "version";

    /* renamed from: d */
    private static final String f1089d = "streams";

    /* renamed from: a */
    private final int f1090a;

    /* renamed from: b */
    private final List<C0728a> f1091b = new ArrayList();

    /* renamed from: com.adcolony.sdk.i0$a */
    static class C0728a {

        /* renamed from: j */
        private static final String f1092j = "stream";

        /* renamed from: k */
        private static final String f1093k = "table_name";

        /* renamed from: l */
        private static final String f1094l = "max_rows";

        /* renamed from: m */
        private static final String f1095m = "event_types";

        /* renamed from: n */
        private static final String f1096n = "request_types";

        /* renamed from: o */
        private static final String f1097o = "columns";

        /* renamed from: p */
        private static final String f1098p = "indexes";

        /* renamed from: q */
        private static final String f1099q = "ttl";

        /* renamed from: r */
        private static final String f1100r = "queries";

        /* renamed from: s */
        private static final int f1101s = 10000;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f1102a;

        /* renamed from: b */
        private final String f1103b;

        /* renamed from: c */
        private final int f1104c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String[] f1105d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String[] f1106e;

        /* renamed from: f */
        private final List<C0729b> f1107f = new ArrayList();

        /* renamed from: g */
        private final List<C0731c> f1108g = new ArrayList();

        /* renamed from: h */
        private final C0732d f1109h;

        /* renamed from: i */
        private final Map<String, String> f1110i;

        C0728a(C0897z0 z0Var) throws JSONException {
            this.f1102a = z0Var.mo10078g(f1092j);
            this.f1103b = z0Var.mo10078g(f1093k);
            this.f1104c = z0Var.mo10054a(f1094l, 10000);
            C0895y0 n = z0Var.mo10085n(f1095m);
            this.f1105d = n != null ? C0894y.m1150a(n) : new String[0];
            C0895y0 n2 = z0Var.mo10085n(f1096n);
            this.f1106e = n2 != null ? C0894y.m1150a(n2) : new String[0];
            for (C0897z0 bVar : C0894y.m1159b(z0Var.mo10073d(f1097o))) {
                this.f1107f.add(new C0729b(bVar));
            }
            for (C0897z0 cVar : C0894y.m1159b(z0Var.mo10073d(f1098p))) {
                this.f1108g.add(new C0731c(cVar, this.f1103b));
            }
            C0897z0 p = z0Var.mo10087p(f1099q);
            this.f1109h = p != null ? new C0732d(p) : null;
            this.f1110i = z0Var.mo10086o(f1100r).mo10076e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo9650d() {
            return this.f1104c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo9651e() {
            return this.f1102a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, String> mo9652f() {
            return this.f1110i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String[] mo9653g() {
            return this.f1106e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public String mo9654h() {
            return this.f1103b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0732d mo9655i() {
            return this.f1109h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C0729b> mo9647a() {
            return this.f1107f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String[] mo9648b() {
            return this.f1105d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public List<C0731c> mo9649c() {
            return this.f1108g;
        }
    }

    /* renamed from: com.adcolony.sdk.i0$b */
    static class C0729b {

        /* renamed from: d */
        private static final String f1111d = "name";

        /* renamed from: e */
        private static final String f1112e = "type";

        /* renamed from: f */
        private static final String f1113f = "default";

        /* renamed from: a */
        private final String f1114a;

        /* renamed from: b */
        private final String f1115b;

        /* renamed from: c */
        private final Object f1116c;

        /* renamed from: com.adcolony.sdk.i0$b$a */
        static class C0730a {

            /* renamed from: a */
            static final String f1117a = "TEXT";

            /* renamed from: b */
            static final String f1118b = "INTEGER";

            /* renamed from: c */
            static final String f1119c = "REAL";

            C0730a() {
            }
        }

        C0729b(C0897z0 z0Var) throws JSONException {
            this.f1114a = z0Var.mo10078g("name");
            this.f1115b = z0Var.mo10078g("type");
            this.f1116c = z0Var.mo10089r("default");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo9656a() {
            return this.f1116c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo9657b() {
            return this.f1114a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo9658c() {
            return this.f1115b;
        }
    }

    /* renamed from: com.adcolony.sdk.i0$c */
    static class C0731c {

        /* renamed from: c */
        private static final String f1120c = "name";

        /* renamed from: d */
        private static final String f1121d = "columns";

        /* renamed from: a */
        private final String f1122a;

        /* renamed from: b */
        private final String[] f1123b;

        C0731c(C0897z0 z0Var, String str) throws JSONException {
            this.f1122a = str + "_" + z0Var.mo10078g("name");
            this.f1123b = C0894y.m1150a(z0Var.mo10073d(f1121d));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String[] mo9659a() {
            return this.f1123b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo9660b() {
            return this.f1122a;
        }
    }

    /* renamed from: com.adcolony.sdk.i0$d */
    static class C0732d {

        /* renamed from: c */
        private static final String f1124c = "seconds";

        /* renamed from: d */
        private static final String f1125d = "column";

        /* renamed from: a */
        private final long f1126a;

        /* renamed from: b */
        private final String f1127b;

        C0732d(C0897z0 z0Var) throws JSONException {
            this.f1126a = z0Var.mo10077f(f1124c);
            this.f1127b = z0Var.mo10078g(f1125d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9661a() {
            return this.f1127b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo9662b() {
            return this.f1126a;
        }
    }

    C0727i0(C0897z0 z0Var) throws JSONException {
        this.f1090a = z0Var.mo10071c("version");
        for (C0897z0 aVar : C0894y.m1159b(z0Var.mo10073d(f1089d))) {
            this.f1091b.add(new C0728a(aVar));
        }
    }

    /* renamed from: a */
    static C0727i0 m507a(C0897z0 z0Var) {
        try {
            return new C0727i0(z0Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9645b() {
        return this.f1090a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0728a> mo9644a() {
        return this.f1091b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0728a mo9646b(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C0728a next : this.f1091b) {
            int i = 0;
            for (String equals : next.f1105d) {
                if (str.equals(equals)) {
                    return next;
                }
            }
            String[] b = next.f1106e;
            int length = b.length;
            while (true) {
                if (i < length) {
                    if (str.equals(b[i])) {
                        return next;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0728a mo9643a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C0728a next : this.f1091b) {
            if (str.equals(next.f1102a)) {
                return next;
            }
        }
        return null;
    }
}

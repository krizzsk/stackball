package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.y */
class C0894y {
    C0894y() {
    }

    /* renamed from: a */
    static C0897z0 m1140a(String str, String str2) {
        String str3;
        try {
            return new C0897z0(str);
        } catch (JSONException e) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e.toString();
            }
            new C0580a0.C0581a().mo9419a(str3).mo9421a(C0580a0.f192j);
            return new C0897z0();
        }
    }

    /* renamed from: b */
    static C0897z0 m1151b() {
        return new C0897z0();
    }

    /* renamed from: c */
    static Object m1162c(C0895y0 y0Var, int i) {
        Object n = y0Var.mo10046n(i);
        return n == null ? Boolean.FALSE : n;
    }

    /* renamed from: d */
    static String m1164d(C0895y0 y0Var, int i) {
        return y0Var.mo10047o(i);
    }

    /* renamed from: e */
    static long m1165e(C0897z0 z0Var, String str) {
        return z0Var.mo10088q(str);
    }

    /* renamed from: f */
    static C0897z0 m1167f(C0897z0 z0Var, String str) {
        return z0Var.mo10086o(str);
    }

    /* renamed from: g */
    static Object m1168g(C0897z0 z0Var, String str) {
        Object r = z0Var.mo10089r(str);
        return r == null ? Boolean.FALSE : r;
    }

    /* renamed from: h */
    static String m1169h(C0897z0 z0Var, String str) {
        return z0Var.mo10090s(str);
    }

    /* renamed from: i */
    static boolean m1170i(C0897z0 z0Var, String str) {
        try {
            C0578a.m143c().mo9614r().mo9896a(str, z0Var.toString(), false);
            return true;
        } catch (IOException e) {
            new C0580a0.C0581a().mo9419a("IOException in ADCJSON's saveObject: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: b */
    static C0897z0 m1153b(String str) {
        return m1140a(str, (String) null);
    }

    /* renamed from: d */
    static int m1163d(C0897z0 z0Var, String str) {
        return z0Var.mo10083l(str);
    }

    /* renamed from: e */
    static void m1166e(C0895y0 y0Var, int i) {
        y0Var.mo10049q(i);
    }

    /* renamed from: b */
    static boolean m1155b(C0897z0 z0Var, String str) {
        return z0Var.mo10079h(str);
    }

    /* renamed from: b */
    static C0897z0 m1152b(C0895y0 y0Var, int i) {
        return y0Var.mo10041i(i);
    }

    /* renamed from: c */
    static double m1160c(C0897z0 z0Var, String str) {
        return z0Var.mo10053a(str, 0.0d);
    }

    /* renamed from: b */
    static boolean m1156b(C0897z0 z0Var, String str, int i) {
        try {
            z0Var.mo10065b(str, i);
            return true;
        } catch (JSONException e) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putInteger(): ").mo9419a(e.toString());
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + i).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: c */
    static C0897z0 m1161c(String str) {
        try {
            String sb = C0578a.m143c().mo9614r().mo9895a(str, false).toString();
            return m1140a(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            new C0580a0.C0581a().mo9419a("IOException in ADCJSON's loadObject: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return m1151b();
        }
    }

    /* renamed from: a */
    static C0895y0 m1134a() {
        return new C0895y0();
    }

    /* renamed from: a */
    static C0895y0 m1137a(String str) {
        try {
            return new C0895y0(str);
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return new C0895y0();
        }
    }

    /* renamed from: b */
    static boolean m1157b(C0897z0 z0Var, String str, long j) {
        try {
            z0Var.mo10066b(str, j);
            return true;
        } catch (JSONException e) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putLong(): ").mo9419a(e.toString());
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + j).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static C0897z0 m1139a(C0895y0 y0Var, int i) {
        try {
            return y0Var.mo10033c(i);
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return new C0897z0();
        }
    }

    /* renamed from: b */
    static boolean m1158b(C0897z0 z0Var, String str, boolean z) {
        try {
            z0Var.mo10068b(str, z);
            return true;
        } catch (JSONException e) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putBoolean(): ").mo9419a(e.toString());
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + z).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static int m1132a(C0897z0 z0Var, String str, int i) {
        return z0Var.mo10054a(str, i);
    }

    /* renamed from: a */
    static long m1133a(C0897z0 z0Var, String str, long j) {
        return z0Var.mo10055a(str, j);
    }

    /* renamed from: a */
    static boolean m1149a(C0897z0 z0Var, String str, boolean z) {
        return z0Var.mo10063a(str, z);
    }

    /* renamed from: a */
    static C0895y0 m1136a(C0897z0 z0Var, String str) {
        return z0Var.mo10084m(str);
    }

    /* renamed from: a */
    static boolean m1148a(C0897z0 z0Var, String str, String str2) {
        try {
            z0Var.mo10067b(str, str2);
            return true;
        } catch (JSONException e) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putString(): ").mo9419a(e.toString());
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + str2).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: b */
    static void m1154b(C0895y0 y0Var, String str) {
        y0Var.mo10030b(str);
    }

    /* renamed from: b */
    static C0897z0[] m1159b(C0895y0 y0Var) {
        return y0Var.mo10035d();
    }

    /* renamed from: a */
    static boolean m1146a(C0897z0 z0Var, String str, C0895y0 y0Var) {
        try {
            z0Var.mo10056a(str, y0Var);
            return true;
        } catch (JSONException e) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putArray(): ").mo9419a(e.toString());
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + y0Var).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m1147a(C0897z0 z0Var, String str, C0897z0 z0Var2) {
        try {
            z0Var.mo10057a(str, z0Var2);
            return true;
        } catch (JSONException e) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putObject(): ").mo9419a(e.toString());
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + z0Var2).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m1145a(C0897z0 z0Var, String str, double d) {
        try {
            z0Var.mo10064b(str, d);
            return true;
        } catch (JSONException unused) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("JSON error in ADCJSON putDouble(): ");
            C0580a0.C0581a a2 = a.mo9419a(" with key: " + str);
            a2.mo9419a(" and value: " + d).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static void m1143a(C0895y0 y0Var, boolean z) {
        y0Var.mo10019a(z);
    }

    /* renamed from: a */
    static void m1142a(C0895y0 y0Var, C0897z0 z0Var) {
        y0Var.mo10017a(z0Var);
    }

    /* renamed from: a */
    static String[] m1150a(C0895y0 y0Var) {
        return y0Var.mo10037e();
    }

    /* renamed from: a */
    static C0895y0 m1138a(String[] strArr) {
        C0895y0 a = m1134a();
        for (String b : strArr) {
            m1154b(a, b);
        }
        return a;
    }

    /* renamed from: a */
    static boolean m1144a(C0895y0 y0Var, String str) {
        return y0Var.mo10023a(str);
    }

    /* renamed from: a */
    static C0895y0 m1135a(C0895y0 y0Var, String[] strArr, boolean z) {
        for (String str : strArr) {
            if (!z || !m1144a(y0Var, str)) {
                m1154b(y0Var, str);
            }
        }
        return y0Var;
    }

    /* renamed from: a */
    static C0897z0 m1141a(C0897z0... z0VarArr) {
        C0897z0 z0Var = new C0897z0();
        for (C0897z0 a : z0VarArr) {
            z0Var.mo10060a(a);
        }
        return z0Var;
    }
}

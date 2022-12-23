package com.yandex.metrica.impl.p265ob;

import com.facebook.internal.security.CertificateUtil;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p7 */
public class C11624p7 {

    /* renamed from: a */
    public final C11555n7 f27898a;

    /* renamed from: b */
    public final C11189e7 f27899b;

    /* renamed from: c */
    public final List<C11484l7> f27900c;

    /* renamed from: d */
    public final String f27901d;

    /* renamed from: e */
    public final String f27902e;

    /* renamed from: f */
    public final Map<String, String> f27903f;

    /* renamed from: g */
    public final String f27904g;

    /* renamed from: h */
    public final Boolean f27905h;

    public C11624p7(C11555n7 n7Var, C11189e7 e7Var, List<C11484l7> list, String str, String str2, Map<String, String> map, String str3, Boolean bool) {
        this.f27898a = n7Var;
        this.f27899b = e7Var;
        this.f27900c = list;
        this.f27901d = str;
        this.f27902e = str2;
        this.f27903f = map;
        this.f27904g = str3;
        this.f27905h = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C11555n7 n7Var = this.f27898a;
        if (n7Var != null) {
            for (C11484l7 next : n7Var.mo63368d()) {
                sb.append("at " + next.mo63272a() + "." + next.mo63276e() + "(" + next.mo63274c() + CertificateUtil.DELIMITER + next.mo63275d() + CertificateUtil.DELIMITER + next.mo63273b() + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f27898a + "\n" + sb.toString() + '}';
    }
}

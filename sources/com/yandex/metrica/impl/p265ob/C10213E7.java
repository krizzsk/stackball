package com.yandex.metrica.impl.p265ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.E7 */
public class C10213E7 implements C11194ea<C11555n7, C10671Qf> {

    /* renamed from: a */
    private final C10128B7 f24547a;

    public C10213E7() {
        this(new C10128B7());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10671Qf qf = (C10671Qf) obj;
        throw new UnsupportedOperationException();
    }

    C10213E7(C10128B7 b7) {
        this.f24547a = b7;
    }

    /* renamed from: a */
    public C10671Qf mo61050b(C11555n7 n7Var) {
        C10671Qf qf = new C10671Qf();
        String b = n7Var.mo63366b();
        String str = "";
        if (b == null) {
            b = str;
        }
        qf.f25485b = b;
        String c = n7Var.mo63367c();
        if (c != null) {
            str = c;
        }
        qf.f25486c = str;
        qf.f25487d = this.f24547a.mo61101b(n7Var.mo63368d());
        if (n7Var.mo63365a() != null) {
            qf.f25488e = mo61050b(n7Var.mo63365a());
        }
        List<C11555n7> e = n7Var.mo63369e();
        int i = 0;
        if (e == null) {
            qf.f25489f = new C10671Qf[0];
        } else {
            qf.f25489f = new C10671Qf[e.size()];
            for (C11555n7 a : e) {
                qf.f25489f[i] = mo61050b(a);
                i++;
            }
        }
        return qf;
    }
}

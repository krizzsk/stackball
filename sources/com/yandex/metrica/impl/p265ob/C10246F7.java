package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.F7 */
public class C10246F7 implements C11194ea<C11624p7, C10460Lf> {

    /* renamed from: a */
    private final C10213E7 f24647a;

    /* renamed from: b */
    private final C11708r7 f24648b;

    /* renamed from: c */
    private final C11781t7 f24649c;

    /* renamed from: d */
    private final C10128B7 f24650d;

    /* renamed from: e */
    private final C11975y7 f24651e;

    /* renamed from: f */
    private final C12018z7 f24652f;

    public C10246F7() {
        this(new C10213E7(), new C11708r7(new C10182D7()), new C11781t7(), new C10128B7(), new C11975y7(), new C12018z7());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10460Lf lf = (C10460Lf) obj;
        throw new UnsupportedOperationException();
    }

    C10246F7(C10213E7 e7, C11708r7 r7Var, C11781t7 t7Var, C10128B7 b7, C11975y7 y7Var, C12018z7 z7Var) {
        this.f24648b = r7Var;
        this.f24647a = e7;
        this.f24649c = t7Var;
        this.f24650d = b7;
        this.f24651e = y7Var;
        this.f24652f = z7Var;
    }

    /* renamed from: a */
    public C10460Lf mo61050b(C11624p7 p7Var) {
        C10460Lf lf = new C10460Lf();
        C11555n7 n7Var = p7Var.f27898a;
        if (n7Var != null) {
            lf.f25116b = this.f24647a.mo61050b(n7Var);
        }
        C11189e7 e7Var = p7Var.f27899b;
        if (e7Var != null) {
            lf.f25117c = this.f24648b.mo61050b(e7Var);
        }
        List<C11484l7> list = p7Var.f27900c;
        if (list != null) {
            lf.f25120f = this.f24650d.mo61101b(list);
        }
        String str = p7Var.f27904g;
        if (str != null) {
            lf.f25118d = str;
        }
        lf.f25119e = this.f24649c.mo62559a(p7Var.f27905h);
        if (!TextUtils.isEmpty(p7Var.f27901d)) {
            lf.f25123i = this.f24651e.mo61050b(p7Var.f27901d);
        }
        if (!TextUtils.isEmpty(p7Var.f27902e)) {
            lf.f25124j = p7Var.f27902e.getBytes();
        }
        if (!C10796U2.m27897b((Map) p7Var.f27903f)) {
            lf.f25125k = this.f24652f.mo61050b(p7Var.f27903f);
        }
        return lf;
    }
}

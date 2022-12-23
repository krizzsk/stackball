package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.A7 */
public class C10100A7 implements C11194ea<C11372j7, C10522Mf> {

    /* renamed from: a */
    private final C10213E7 f24306a;

    /* renamed from: b */
    private final C11708r7 f24307b;

    /* renamed from: c */
    private final C11781t7 f24308c;

    /* renamed from: d */
    private final C10128B7 f24309d;

    /* renamed from: e */
    private final C11975y7 f24310e;

    /* renamed from: f */
    private final C12018z7 f24311f;

    public C10100A7() {
        this(new C10213E7(), new C11708r7(new C10182D7()), new C11781t7(), new C10128B7(), new C11975y7(), new C12018z7());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10522Mf mf = (C10522Mf) obj;
        throw new UnsupportedOperationException();
    }

    C10100A7(C10213E7 e7, C11708r7 r7Var, C11781t7 t7Var, C10128B7 b7, C11975y7 y7Var, C12018z7 z7Var) {
        this.f24306a = e7;
        this.f24307b = r7Var;
        this.f24308c = t7Var;
        this.f24309d = b7;
        this.f24310e = y7Var;
        this.f24311f = z7Var;
    }

    /* renamed from: a */
    public C10522Mf mo61050b(C11372j7 j7Var) {
        C10522Mf mf = new C10522Mf();
        String str = j7Var.f27176a;
        String str2 = mf.f25215g;
        if (str == null) {
            str = str2;
        }
        mf.f25215g = str;
        C11624p7 p7Var = j7Var.f27177b;
        if (p7Var != null) {
            C11555n7 n7Var = p7Var.f27898a;
            if (n7Var != null) {
                mf.f25210b = this.f24306a.mo61050b(n7Var);
            }
            C11189e7 e7Var = p7Var.f27899b;
            if (e7Var != null) {
                mf.f25211c = this.f24307b.mo61050b(e7Var);
            }
            List<C11484l7> list = p7Var.f27900c;
            if (list != null) {
                mf.f25214f = this.f24309d.mo61101b(list);
            }
            String str3 = p7Var.f27904g;
            String str4 = mf.f25212d;
            if (str3 == null) {
                str3 = str4;
            }
            mf.f25212d = str3;
            mf.f25213e = this.f24308c.mo62559a(p7Var.f27905h);
            if (!TextUtils.isEmpty(p7Var.f27901d)) {
                mf.f25218j = this.f24310e.mo61050b(p7Var.f27901d);
            }
            if (!TextUtils.isEmpty(p7Var.f27902e)) {
                mf.f25219k = p7Var.f27902e.getBytes();
            }
            if (!C10796U2.m27897b((Map) p7Var.f27903f)) {
                mf.f25220l = this.f24311f.mo61050b(p7Var.f27903f);
            }
        }
        return mf;
    }
}

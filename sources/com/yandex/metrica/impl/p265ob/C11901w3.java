package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.impl.p265ob.C10501Ma;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.w3 */
public class C11901w3 implements C11800u {

    /* renamed from: a */
    private final C10662Q9<C11702r3> f28627a;

    /* renamed from: b */
    private C11702r3 f28628b;

    public C11901w3(Context context) {
        this(C10501Ma.C10503b.m26925a(C11702r3.class).mo61785a(context));
    }

    /* renamed from: a */
    public void mo64008a(List<C10068a> list, boolean z) {
        for (C10068a next : list) {
        }
        C11702r3 r3Var = new C11702r3(list, z);
        this.f28628b = r3Var;
        this.f28627a.mo61952a(r3Var);
    }

    /* renamed from: b */
    public boolean mo64009b() {
        return this.f28628b.f28046b;
    }

    C11901w3(C10662Q9<C11702r3> q9) {
        this.f28627a = q9;
        this.f28628b = (C11702r3) q9.mo61953b();
    }

    /* renamed from: a */
    public List<C10068a> mo64007a() {
        return this.f28628b.f28045a;
    }
}

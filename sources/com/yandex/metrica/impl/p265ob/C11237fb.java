package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10501Ma;

/* renamed from: com.yandex.metrica.impl.ob.fb */
public class C11237fb {

    /* renamed from: a */
    private final C10662Q9<C10622P3> f26900a;

    /* renamed from: b */
    private final C10662Q9<C10135Be> f26901b;

    /* renamed from: c */
    private final C10987Za<C10135Be> f26902c;

    /* renamed from: d */
    private final C10987Za<C10622P3> f26903d;

    public C11237fb(Context context) {
        this(context, C10501Ma.C10503b.m26925a(C10622P3.class).mo61785a(context), C10501Ma.C10503b.m26925a(C10135Be.class).mo61785a(context), new C11031ab());
    }

    /* renamed from: a */
    public void mo62896a(C10675Qi qi) {
        this.f26902c.mo62572a(this.f26901b.mo61953b(), qi.mo62021m());
        this.f26903d.mo62572a(this.f26900a.mo61953b(), qi.mo62021m());
    }

    C11237fb(Context context, C10662Q9<C10622P3> q9, C10662Q9<C10135Be> q92, C11031ab abVar) {
        this.f26900a = q9;
        this.f26901b = q92;
        this.f26902c = abVar.mo62643c(context, C10470Lm.m26853c());
        this.f26903d = abVar.mo62642b(context, C10470Lm.m26853c());
    }
}

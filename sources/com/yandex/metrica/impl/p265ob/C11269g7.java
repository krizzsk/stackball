package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.C10079f;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.g7 */
public abstract class C11269g7 implements C11337i7 {

    /* renamed from: a */
    private final C11270a f26957a;

    /* renamed from: b */
    private final C10079f f26958b;

    /* renamed from: c */
    private final C10415K0 f26959c;

    /* renamed from: com.yandex.metrica.impl.ob.g7$a */
    public interface C11270a {
        /* renamed from: a */
        boolean mo62927a(Throwable th);
    }

    C11269g7(C11270a aVar, C10079f fVar, C10415K0 k0) {
        this.f26957a = aVar;
        this.f26958b = fVar;
        this.f26959c = k0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo62951a(C11624p7 p7Var);

    /* renamed from: a */
    public void mo62952a(Throwable th, C11189e7 e7Var) {
        if (this.f26957a.mo62927a(th)) {
            C10079f fVar = this.f26958b;
            if (fVar == null || th == null || (th = fVar.mo61021a(th)) != null) {
                mo62951a(C11675q7.m30082a(th, e7Var, (List<StackTraceElement>) null, this.f26959c.mo61640a(), this.f26959c.mo61641b()));
            }
        }
    }
}

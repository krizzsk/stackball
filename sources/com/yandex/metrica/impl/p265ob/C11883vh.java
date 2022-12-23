package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.rtm.wrapper.C12054e;

/* renamed from: com.yandex.metrica.impl.ob.vh */
public class C11883vh implements C11337i7 {

    /* renamed from: a */
    private final C12054e f28561a;

    public C11883vh(C12054e eVar) {
        this.f28561a = eVar;
    }

    /* renamed from: a */
    public void mo62952a(Throwable th, C11189e7 e7Var) {
        String str;
        C12054e eVar = this.f28561a;
        if (th == null) {
            str = "";
        } else {
            str = th.getClass().getName();
        }
        eVar.reportException(str, th);
    }
}

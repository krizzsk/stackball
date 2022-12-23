package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.H4 */
public class C10328H4 implements C10764T, C10210E4 {

    /* renamed from: a */
    private C10978Z3 f24809a;

    /* renamed from: b */
    private final ResultReceiver f24810b;

    public C10328H4(Context context, C10978Z3 z3, C10910X3 x3) {
        this.f24809a = z3;
        this.f24810b = x3.f26221c;
        z3.mo62563a(this);
    }

    /* renamed from: a */
    public void mo61043a(C11411k0 k0Var, C10910X3 x3) {
        this.f24809a.mo62564a(x3.f26220b);
        this.f24809a.mo62567a(k0Var, this);
    }

    /* renamed from: b */
    public C10978Z3 mo61416b() {
        return this.f24809a;
    }

    /* renamed from: a */
    public void mo61415a(C10793U u) {
        ResultReceiver resultReceiver = this.f24810b;
        int i = C11541n0.f27743b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            u.mo62313c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    /* renamed from: a */
    public void mo61042a() {
        this.f24809a.mo62569b(this);
    }
}

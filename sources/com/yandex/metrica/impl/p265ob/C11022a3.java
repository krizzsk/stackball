package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.a3 */
class C11022a3 implements C10791Tm<Context, Intent, Void> {

    /* renamed from: a */
    final /* synthetic */ C11125d0 f26503a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f26504b;

    /* renamed from: c */
    final /* synthetic */ C11065b3 f26505c;

    C11022a3(C11065b3 b3Var, C11125d0 d0Var, CountDownLatch countDownLatch) {
        this.f26505c = b3Var;
        this.f26503a = d0Var;
        this.f26504b = countDownLatch;
    }

    /* renamed from: a */
    public Object mo61165a(Object obj, Object obj2) {
        Context context = (Context) obj;
        Intent intent = (Intent) obj2;
        this.f26503a.mo62738a(this.f26505c.m28566c());
        this.f26504b.countDown();
        this.f26505c.f26580k.mo62740b(this);
        return null;
    }
}

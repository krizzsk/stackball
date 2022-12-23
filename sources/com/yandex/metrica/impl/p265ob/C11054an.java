package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.an */
public class C11054an {

    /* renamed from: a */
    private final ReentrantLock f26543a;

    /* renamed from: b */
    private final C11093bn f26544b;

    public C11054an(Context context, String str) {
        this(new ReentrantLock(), new C11093bn(context, str));
    }

    /* renamed from: a */
    public void mo62656a() throws Throwable {
        this.f26543a.lock();
        this.f26544b.mo62712a();
    }

    /* renamed from: b */
    public void mo62657b() {
        this.f26544b.mo62713b();
        this.f26543a.unlock();
    }

    /* renamed from: c */
    public void mo62658c() {
        this.f26544b.mo62714c();
        this.f26543a.unlock();
    }

    C11054an(ReentrantLock reentrantLock, C11093bn bnVar) {
        this.f26543a = reentrantLock;
        this.f26544b = bnVar;
    }
}

package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Jm */
public abstract class C10411Jm<T> implements Callable<T> {
    /* renamed from: a */
    public abstract T mo61634a() throws Exception;

    public T call() {
        try {
            return mo61634a();
        } catch (Throwable unused) {
            return null;
        }
    }
}

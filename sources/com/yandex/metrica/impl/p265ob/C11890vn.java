package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.vn */
public class C11890vn extends Thread implements C11798tn {

    /* renamed from: a */
    private volatile boolean f28608a = true;

    public C11890vn() {
    }

    /* renamed from: c */
    public synchronized boolean mo63616c() {
        return this.f28608a;
    }

    /* renamed from: d */
    public synchronized void mo63993d() {
        this.f28608a = false;
        interrupt();
    }

    public C11890vn(Runnable runnable, String str) {
        super(runnable, str);
    }

    public C11890vn(String str) {
        super(str);
    }
}

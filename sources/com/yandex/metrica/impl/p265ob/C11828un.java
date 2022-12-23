package com.yandex.metrica.impl.p265ob;

import android.os.HandlerThread;

/* renamed from: com.yandex.metrica.impl.ob.un */
public class C11828un extends HandlerThread implements C11798tn {

    /* renamed from: a */
    private volatile boolean f28442a = true;

    public C11828un(String str) {
        super(str);
    }

    /* renamed from: c */
    public synchronized boolean mo63616c() {
        return this.f28442a;
    }
}

package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;

/* renamed from: com.applovin.impl.sdk.d.ad */
public class C1399ad extends C1392a {

    /* renamed from: a */
    private final Runnable f3289a;

    public C1399ad(C1469j jVar, Runnable runnable) {
        this(jVar, false, runnable);
    }

    public C1399ad(C1469j jVar, boolean z, Runnable runnable) {
        super("TaskRunnable", jVar, z);
        this.f3289a = runnable;
    }

    public void run() {
        this.f3289a.run();
    }
}

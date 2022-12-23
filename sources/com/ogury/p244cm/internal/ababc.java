package com.ogury.p244cm.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ogury.cm.internal.ababc */
public final class ababc implements abacc {

    /* renamed from: a */
    private final ExecutorService f20399a = Executors.newFixedThreadPool(3);

    /* renamed from: a */
    public final void mo52670a(bbaaa<babcc> bbaaa) {
        bbabc.m22051b(bbaaa, "action");
        this.f20399a.execute(new abaca(bbaaa));
    }
}

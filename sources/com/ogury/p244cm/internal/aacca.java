package com.ogury.p244cm.internal;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aacca */
public abstract class aacca {

    /* renamed from: a */
    private final aacbc f20370a;

    public aacca(aacbc aacbc) {
        bbabc.m22051b(aacbc, "requestScheduler");
        this.f20370a = aacbc;
    }

    /* renamed from: a */
    public final aacbc mo52656a() {
        return this.f20370a;
    }

    /* renamed from: a */
    public abstract void mo52657a(Context context, acabc acabc, CountDownLatch countDownLatch);
}

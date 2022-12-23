package com.p243my.target.common;

import com.p243my.target.C7298a;
import com.p243my.target.C7524l3;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.common.BaseAd */
public abstract class BaseAd {
    public final C7298a adConfig;
    private final AtomicBoolean isLoaded = new AtomicBoolean();
    public final C7524l3.C7525a metricFactory;

    public BaseAd(int i, String str) {
        this.adConfig = C7298a.newConfig(i, str);
        this.metricFactory = C7524l3.m19687a(i);
    }

    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public boolean isLoadCalled() {
        return !this.isLoaded.compareAndSet(false, true);
    }
}

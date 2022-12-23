package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.InitializationListener;
import java.util.Objects;

public class me0 {

    /* renamed from: a */
    private final fo0 f37352a;

    /* renamed from: b */
    private final InitializationListener f37353b;

    public me0(fo0 fo0, InitializationListener initializationListener) {
        this.f37352a = fo0;
        this.f37353b = initializationListener;
    }

    /* renamed from: a */
    public void mo68672a() {
        fo0 fo0 = this.f37352a;
        InitializationListener initializationListener = this.f37353b;
        Objects.requireNonNull(initializationListener);
        fo0.mo67053b(new Runnable() {
            public final void run() {
                InitializationListener.this.onInitializationCompleted();
            }
        });
    }
}

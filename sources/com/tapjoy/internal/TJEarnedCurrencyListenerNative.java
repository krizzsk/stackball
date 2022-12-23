package com.tapjoy.internal;

import com.tapjoy.TJEarnedCurrencyListener;

public class TJEarnedCurrencyListenerNative implements TJEarnedCurrencyListener {

    /* renamed from: a */
    private final long f22291a;

    private static native void onEarnedCurrencyNative(long j, String str, int i);

    private TJEarnedCurrencyListenerNative(long j) {
        if (j != 0) {
            this.f22291a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onEarnedCurrency(String str, int i) {
        onEarnedCurrencyNative(this.f22291a, str, i);
    }

    static Object create(long j) {
        return new TJEarnedCurrencyListenerNative(j);
    }
}

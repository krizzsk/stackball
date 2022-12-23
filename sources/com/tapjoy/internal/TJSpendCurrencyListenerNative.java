package com.tapjoy.internal;

import com.tapjoy.TJSpendCurrencyListener;

public class TJSpendCurrencyListenerNative implements TJSpendCurrencyListener {

    /* renamed from: a */
    private final long f22294a;

    private static native void onSpendCurrencyResponseFailureNative(long j, String str);

    private static native void onSpendCurrencyResponseNative(long j, String str, int i);

    private TJSpendCurrencyListenerNative(long j) {
        if (j != 0) {
            this.f22294a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onSpendCurrencyResponse(String str, int i) {
        onSpendCurrencyResponseNative(this.f22294a, str, i);
    }

    public void onSpendCurrencyResponseFailure(String str) {
        onSpendCurrencyResponseFailureNative(this.f22294a, str);
    }

    static Object create(long j) {
        return new TJSpendCurrencyListenerNative(j);
    }
}

package com.tapjoy.internal;

import com.tapjoy.TJConnectListener;

public class TJConnectListenerNative implements TJConnectListener {

    /* renamed from: a */
    private final long f22290a;

    private static native void onConnectFailureNative(long j);

    private static native void onConnectSuccessNative(long j);

    private TJConnectListenerNative(long j) {
        if (j != 0) {
            this.f22290a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onConnectSuccess() {
        onConnectSuccessNative(this.f22290a);
    }

    public void onConnectFailure() {
        onConnectFailureNative(this.f22290a);
    }

    static Object create(long j) {
        return new TJConnectListenerNative(j);
    }
}

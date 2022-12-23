package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.im */
public abstract class C9422im implements Runnable {

    /* renamed from: a */
    private final long f23408a = 300;

    /* renamed from: a */
    public abstract boolean mo58233a();

    public void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f23408a;
        while (!mo58233a() && elapsedRealtime - SystemClock.elapsedRealtime() > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}

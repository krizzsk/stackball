package com.smaato.sdk.core.appbgdetection;

import android.os.Handler;
import android.os.SystemClock;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

public class PausableAction implements Runnable {
    final Handler handler;
    public final String name;
    final PauseUnpauseListener pauseUnpauseListener;
    long pausedAt = 0;
    long remainingDelay;
    private final Runnable runnable;
    long startedAt;

    PausableAction(String str, Handler handler2, Runnable runnable2, long j, PauseUnpauseListener pauseUnpauseListener2) {
        this.name = (String) Objects.requireNonNull(str);
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.runnable = (Runnable) Objects.requireNonNull(runnable2);
        if (j > 0) {
            this.remainingDelay = j;
            this.pauseUnpauseListener = pauseUnpauseListener2;
            this.startedAt = SystemClock.uptimeMillis();
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + getClass().getSimpleName() + "::new");
    }

    public void run() {
        Threads.ensureHandlerThread(this.handler);
        this.runnable.run();
    }

    /* access modifiers changed from: package-private */
    public final boolean isPaused() {
        Threads.ensureHandlerThread(this.handler);
        return this.pausedAt > 0;
    }
}

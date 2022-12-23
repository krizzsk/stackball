package com.smaato.sdk.core.appbgdetection;

import android.os.Handler;
import android.os.SystemClock;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

public class AppBackgroundAwareHandler {
    private PausableAction action;
    private final AppBackgroundDetector appBackgroundDetector;
    private final AppBackgroundDetector.Listener appBackgroundDetectorListener = new AppBackgroundDetector.Listener() {
        public /* synthetic */ void lambda$onAppEnteredInBackground$0$AppBackgroundAwareHandler$1() {
            AppBackgroundAwareHandler.access$200(AppBackgroundAwareHandler.this);
        }

        public void onAppEnteredInBackground() {
            Threads.ensureInvokedOnHandlerThread(AppBackgroundAwareHandler.this.handler, new Runnable() {
                public final void run() {
                    AppBackgroundAwareHandler.C86221.this.lambda$onAppEnteredInBackground$0$AppBackgroundAwareHandler$1();
                }
            });
        }

        public /* synthetic */ void lambda$onAppEnteredInForeground$1$AppBackgroundAwareHandler$1() {
            AppBackgroundAwareHandler.access$100(AppBackgroundAwareHandler.this);
        }

        public void onAppEnteredInForeground() {
            Threads.ensureInvokedOnHandlerThread(AppBackgroundAwareHandler.this.handler, new Runnable() {
                public final void run() {
                    AppBackgroundAwareHandler.C86221.this.lambda$onAppEnteredInForeground$1$AppBackgroundAwareHandler$1();
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public final Handler handler;
    private Logger logger;

    public AppBackgroundAwareHandler(Logger logger2, Handler handler2, AppBackgroundDetector appBackgroundDetector2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
    }

    public void postDelayed(String str, Runnable runnable, long j, PauseUnpauseListener pauseUnpauseListener) {
        Objects.requireNonNull(str);
        if (j > 0) {
            Objects.requireNonNull(runnable);
            Threads.ensureInvokedOnHandlerThread(this.handler, new Runnable(str, runnable, j, pauseUnpauseListener) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Runnable f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ PauseUnpauseListener f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r6;
                }

                public final void run() {
                    AppBackgroundAwareHandler.this.lambda$postDelayed$0$AppBackgroundAwareHandler(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + getClass().getSimpleName() + "::postDelayed");
    }

    public void stop() {
        Threads.ensureInvokedOnHandlerThread(this.handler, new Runnable() {
            public final void run() {
                AppBackgroundAwareHandler.this.lambda$stop$1$AppBackgroundAwareHandler();
            }
        });
    }

    public /* synthetic */ void lambda$startAction$2$AppBackgroundAwareHandler(Runnable runnable) {
        this.action = null;
        this.appBackgroundDetector.deleteListener(this.appBackgroundDetectorListener);
        runnable.run();
    }

    public /* synthetic */ void lambda$stop$1$AppBackgroundAwareHandler() {
        Threads.ensureHandlerThread(this.handler);
        if (this.action != null) {
            this.appBackgroundDetector.deleteListener(this.appBackgroundDetectorListener);
            this.handler.removeCallbacks(this.action);
            this.action = null;
        }
    }

    public /* synthetic */ void lambda$postDelayed$0$AppBackgroundAwareHandler(String str, Runnable runnable, long j, PauseUnpauseListener pauseUnpauseListener) {
        Threads.ensureHandlerThread(this.handler);
        PausableAction pausableAction = this.action;
        if (pausableAction != null) {
            this.handler.removeCallbacks(pausableAction);
            this.appBackgroundDetector.deleteListener(this.appBackgroundDetectorListener);
            this.action = null;
        }
        PausableAction pausableAction2 = new PausableAction(str, this.handler, new Runnable(runnable) {
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppBackgroundAwareHandler.this.lambda$startAction$2$AppBackgroundAwareHandler(this.f$1);
            }
        }, j, pauseUnpauseListener);
        this.action = pausableAction2;
        this.handler.postDelayed(pausableAction2, j);
        this.appBackgroundDetector.addListener(this.appBackgroundDetectorListener, true);
    }

    static /* synthetic */ void access$100(AppBackgroundAwareHandler appBackgroundAwareHandler) {
        Threads.ensureHandlerThread(appBackgroundAwareHandler.handler);
        PausableAction pausableAction = appBackgroundAwareHandler.action;
        if (pausableAction != null && pausableAction.isPaused()) {
            PausableAction pausableAction2 = appBackgroundAwareHandler.action;
            Threads.ensureHandlerThread(pausableAction2.handler);
            if (pausableAction2.isPaused()) {
                pausableAction2.pausedAt = 0;
                pausableAction2.startedAt = SystemClock.uptimeMillis();
                if (pausableAction2.pauseUnpauseListener != null) {
                    pausableAction2.pauseUnpauseListener.onBeforeActionUnpaused();
                }
                pausableAction2.handler.postDelayed(pausableAction2, pausableAction2.remainingDelay);
                appBackgroundAwareHandler.logger.info(LogDomain.CORE, "resumed %s", appBackgroundAwareHandler.action.name);
                return;
            }
            throw new RuntimeException("unexpected unpause call - action has not been paused");
        }
    }

    static /* synthetic */ void access$200(AppBackgroundAwareHandler appBackgroundAwareHandler) {
        Threads.ensureHandlerThread(appBackgroundAwareHandler.handler);
        PausableAction pausableAction = appBackgroundAwareHandler.action;
        if (pausableAction != null && !pausableAction.isPaused()) {
            PausableAction pausableAction2 = appBackgroundAwareHandler.action;
            Threads.ensureHandlerThread(pausableAction2.handler);
            if (!pausableAction2.isPaused()) {
                pausableAction2.handler.removeCallbacks(pausableAction2);
                pausableAction2.pausedAt = SystemClock.uptimeMillis();
                pausableAction2.remainingDelay -= pausableAction2.pausedAt - pausableAction2.startedAt;
                if (pausableAction2.pauseUnpauseListener != null) {
                    pausableAction2.pauseUnpauseListener.onActionPaused();
                }
                appBackgroundAwareHandler.logger.info(LogDomain.CORE, "paused %s", appBackgroundAwareHandler.action.name);
                return;
            }
            throw new RuntimeException("unexpected pause call - action has been already paused");
        }
    }
}

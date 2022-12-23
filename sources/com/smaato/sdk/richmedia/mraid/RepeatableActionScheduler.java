package com.smaato.sdk.richmedia.mraid;

import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.PauseUnpauseListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.RepeatableActionScheduler;
import java.util.concurrent.atomic.AtomicReference;

public final class RepeatableActionScheduler {
    private final Runnable actionDecorator = new Runnable() {
        public final void run() {
            Objects.onNotNull(RepeatableActionScheduler.this.actionRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    RepeatableActionScheduler.C89051.this.lambda$run$0$RepeatableActionScheduler$1((Runnable) obj);
                }
            });
        }

        public /* synthetic */ void lambda$run$0$RepeatableActionScheduler$1(Runnable runnable) {
            runnable.run();
            RepeatableActionScheduler.this.schedule();
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<Runnable> actionRef = new AtomicReference<>();
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private final long delayMillis;
    private final Logger logger;

    RepeatableActionScheduler(Logger logger2, AppBackgroundAwareHandler appBackgroundAwareHandler2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler2);
        this.delayMillis = 200;
    }

    /* access modifiers changed from: private */
    public void schedule() {
        this.appBackgroundAwareHandler.postDelayed("Repeatable action timer", this.actionDecorator, this.delayMillis, (PauseUnpauseListener) null);
    }

    public final void stop() {
        this.appBackgroundAwareHandler.stop();
        this.actionRef.set((Object) null);
    }

    public final void start(Runnable runnable) {
        if (!(this.actionRef.get() != null)) {
            if (runnable == null) {
                this.logger.info(LogDomain.MRAID, "No action to schedule", new Object[0]);
                return;
            }
            this.actionRef.set(runnable);
            schedule();
        }
    }
}

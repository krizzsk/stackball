package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;

public final class ProcessLifecycleOwner {
    private static final ProcessLifecycleOwner instance = new ProcessLifecycleOwner();
    private final Runnable delayedPauseRunnable = new Runnable() {
        public final void run() {
            ProcessLifecycleOwner.this.lambda$new$0$ProcessLifecycleOwner();
        }
    };
    private Handler handler;
    private Listener listener;
    private boolean pauseSent = true;
    private int resumedCounter = 0;
    private boolean shouldTriggerFirstActivityStarted;
    private int startedCounter = 0;
    private boolean stopSent = true;

    public interface Listener {
        void onFirstActivityStarted();

        void onLastActivityStopped();
    }

    private ProcessLifecycleOwner() {
    }

    public static ProcessLifecycleOwner get() {
        return instance;
    }

    static void init(Context context, Handler handler2) {
        ProcessLifecycleOwner processLifecycleOwner = instance;
        processLifecycleOwner.handler = handler2;
        if (context.getApplicationContext() instanceof Application) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksAdapter() {
                public void onActivityStarted(Activity activity) {
                    ProcessLifecycleOwner.access$000(ProcessLifecycleOwner.this);
                }

                public void onActivityResumed(Activity activity) {
                    ProcessLifecycleOwner.access$100(ProcessLifecycleOwner.this);
                }

                public void onActivityPaused(Activity activity) {
                    ProcessLifecycleOwner.access$200(ProcessLifecycleOwner.this);
                }

                public void onActivityStopped(Activity activity) {
                    ProcessLifecycleOwner.access$300(ProcessLifecycleOwner.this);
                }
            });
        }
    }

    public final void setListener(Listener listener2) {
        this.listener = listener2;
        if (this.shouldTriggerFirstActivityStarted) {
            listener2.onFirstActivityStarted();
        }
    }

    public /* synthetic */ void lambda$activityResumed$1$ProcessLifecycleOwner(Handler handler2) {
        handler2.removeCallbacks(this.delayedPauseRunnable);
    }

    public /* synthetic */ void lambda$activityPaused$2$ProcessLifecycleOwner(Handler handler2) {
        handler2.postDelayed(this.delayedPauseRunnable, 700);
    }

    private void dispatchStopIfNeeded() {
        if (this.startedCounter == 0 && this.pauseSent) {
            Objects.onNotNull(this.listener, $$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g.INSTANCE);
            this.stopSent = true;
        }
    }

    public /* synthetic */ void lambda$new$0$ProcessLifecycleOwner() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
        }
        dispatchStopIfNeeded();
    }

    static /* synthetic */ void access$000(ProcessLifecycleOwner processLifecycleOwner) {
        int i = processLifecycleOwner.startedCounter + 1;
        processLifecycleOwner.startedCounter = i;
        if (i == 1 && processLifecycleOwner.stopSent) {
            Objects.onNotNull(processLifecycleOwner.listener, $$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8KI.INSTANCE);
            processLifecycleOwner.shouldTriggerFirstActivityStarted = true;
            processLifecycleOwner.stopSent = false;
        }
    }

    static /* synthetic */ void access$100(ProcessLifecycleOwner processLifecycleOwner) {
        int i = processLifecycleOwner.resumedCounter + 1;
        processLifecycleOwner.resumedCounter = i;
        if (i != 1) {
            return;
        }
        if (processLifecycleOwner.pauseSent) {
            processLifecycleOwner.pauseSent = false;
        } else {
            Objects.onNotNull(processLifecycleOwner.handler, new Consumer() {
                public final void accept(Object obj) {
                    ProcessLifecycleOwner.this.lambda$activityResumed$1$ProcessLifecycleOwner((Handler) obj);
                }
            });
        }
    }

    static /* synthetic */ void access$200(ProcessLifecycleOwner processLifecycleOwner) {
        int i = processLifecycleOwner.resumedCounter - 1;
        processLifecycleOwner.resumedCounter = i;
        if (i == 0) {
            Objects.onNotNull(processLifecycleOwner.handler, new Consumer() {
                public final void accept(Object obj) {
                    ProcessLifecycleOwner.this.lambda$activityPaused$2$ProcessLifecycleOwner((Handler) obj);
                }
            });
        }
    }

    static /* synthetic */ void access$300(ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.startedCounter--;
        processLifecycleOwner.dispatchStopIfNeeded();
    }
}

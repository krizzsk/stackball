package com.facebook.internal;

import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: WorkQueue.kt */
final class WorkQueue$execute$1 implements Runnable {
    final /* synthetic */ WorkQueue.WorkNode $node;
    final /* synthetic */ WorkQueue this$0;

    WorkQueue$execute$1(WorkQueue workQueue, WorkQueue.WorkNode workNode) {
        this.this$0 = workQueue;
        this.$node = workNode;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.$node.getCallback().run();
                this.this$0.finishItemAndStartNew(this.$node);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}

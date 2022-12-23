package com.facebook;

import com.facebook.GraphRequestBatch;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ProgressOutputStream.kt */
final class ProgressOutputStream$reportBatchProgress$1 implements Runnable {
    final /* synthetic */ GraphRequestBatch.Callback $callback;
    final /* synthetic */ ProgressOutputStream this$0;

    ProgressOutputStream$reportBatchProgress$1(ProgressOutputStream progressOutputStream, GraphRequestBatch.Callback callback) {
        this.this$0 = progressOutputStream;
        this.$callback = callback;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                ((GraphRequestBatch.OnProgressCallback) this.$callback).onBatchProgress(this.this$0.requests, this.this$0.getBatchProgress(), this.this$0.getMaxProgress());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}

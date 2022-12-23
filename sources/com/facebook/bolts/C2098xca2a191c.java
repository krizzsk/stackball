package com.facebook.bolts;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo72093d2 = {"<anonymous>", "", "run", "com/facebook/bolts/CancellationTokenSource$cancelAfter$2$1"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.bolts.CancellationTokenSource$cancelAfter$$inlined$synchronized$lambda$1 */
/* compiled from: CancellationTokenSource.kt */
final class C2098xca2a191c implements Runnable {
    final /* synthetic */ long $delay$inlined;
    final /* synthetic */ TimeUnit $timeUnit$inlined;
    final /* synthetic */ CancellationTokenSource this$0;

    C2098xca2a191c(CancellationTokenSource cancellationTokenSource, long j, TimeUnit timeUnit) {
        this.this$0 = cancellationTokenSource;
        this.$delay$inlined = j;
        this.$timeUnit$inlined = timeUnit;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.facebook.bolts.CancellationTokenSource r0 = r3.this$0     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = r0.lock     // Catch:{ all -> 0x0022 }
            monitor-enter(r0)     // Catch:{ all -> 0x0022 }
            com.facebook.bolts.CancellationTokenSource r1 = r3.this$0     // Catch:{ all -> 0x001f }
            r2 = 0
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2     // Catch:{ all -> 0x001f }
            r1.scheduledCancellation = r2     // Catch:{ all -> 0x001f }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            com.facebook.bolts.CancellationTokenSource r0 = r3.this$0     // Catch:{ all -> 0x0022 }
            r0.cancel()     // Catch:{ all -> 0x0022 }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bolts.C2098xca2a191c.run():void");
    }
}

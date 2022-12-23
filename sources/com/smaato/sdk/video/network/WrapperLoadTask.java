package com.smaato.sdk.video.network;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.network.execution.NetworkTask;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.concurrent.ExecutorService;

final class WrapperLoadTask extends NetworkTask<BodyEncodingPair> {
    WrapperLoadTask(NetworkActions networkActions, NetworkRequest networkRequest, VastParsingConsumerFactory vastParsingConsumerFactory, ExecutorService executorService, SomaApiContext somaApiContext, Task.Listener<ParseResult<VastTree>, NetworkClient.Error> listener) {
        super(executorService, new Function(networkRequest, somaApiContext, vastParsingConsumerFactory, listener) {
            public final /* synthetic */ NetworkRequest f$1;
            public final /* synthetic */ SomaApiContext f$2;
            public final /* synthetic */ VastParsingConsumerFactory f$3;
            public final /* synthetic */ Task.Listener f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final Object apply(Object obj) {
                return WrapperLoadTask.createRunnable((NetworkTask) obj, NetworkActions.this, this.f$1, this.f$2, $$Lambda$WrapperLoadTask$TJv84rnYSWlR4iGHvPufW_NTGwA.INSTANCE, this.f$3.newVastResponseConsumer((NetworkTask) obj, this.f$4));
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ com.smaato.sdk.core.network.execution.TaskStepResult lambda$null$0(java.net.HttpURLConnection r3) throws java.io.IOException {
        /*
            int r0 = r3.getResponseCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0031
            java.io.InputStream r0 = r3.getInputStream()
            com.smaato.sdk.video.network.BodyEncodingPair r1 = new com.smaato.sdk.video.network.BodyEncodingPair     // Catch:{ all -> 0x0023 }
            byte[] r2 = getResponseBody(r0)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = r3.getContentEncoding()     // Catch:{ all -> 0x0023 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0023 }
            com.smaato.sdk.core.network.execution.TaskStepResult r3 = com.smaato.sdk.core.network.execution.TaskStepResult.success(r1)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0022
            r0.close()
        L_0x0022:
            return r3
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x0030:
            throw r1
        L_0x0031:
            java.io.IOException r3 = new java.io.IOException
            r3.<init>()
            com.smaato.sdk.core.network.execution.TaskStepResult r3 = com.smaato.sdk.core.network.execution.TaskStepResult.error(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.network.WrapperLoadTask.lambda$null$0(java.net.HttpURLConnection):com.smaato.sdk.core.network.execution.TaskStepResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0039, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003c, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] getResponseBody(java.io.InputStream r4) throws java.io.IOException {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0031 }
            r4.<init>()     // Catch:{ all -> 0x0031 }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0025 }
        L_0x000e:
            int r2 = r0.read(r1)     // Catch:{ all -> 0x0025 }
            r3 = -1
            if (r2 == r3) goto L_0x001a
            r3 = 0
            r4.write(r1, r3, r2)     // Catch:{ all -> 0x0025 }
            goto L_0x000e
        L_0x001a:
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x0025 }
            r4.close()     // Catch:{ all -> 0x0031 }
            r0.close()
            return r1
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch:{ all -> 0x0031 }
        L_0x0030:
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r4.addSuppressed(r0)
        L_0x003c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.network.WrapperLoadTask.getResponseBody(java.io.InputStream):byte[]");
    }
}

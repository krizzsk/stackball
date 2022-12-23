package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.NetworkResponse;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Function;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;

public final class HttpTask<Err> extends NetworkTask<NetworkResponse> {
    private HttpTask(ExecutorService executorService, Function<NetworkTask<NetworkResponse>, Runnable> function) {
        super(executorService, function);
    }

    static <Err> HttpTask<Err> create(Logger logger, NetworkActions networkActions, ExecutorService executorService, NetworkRequest networkRequest, ErrorMapper<Err> errorMapper, Task.Listener<NetworkResponse, Err> listener, SomaApiContext somaApiContext) {
        Objects.requireNonNull(logger, "Parameter logger cannot be null for HttpTask::create");
        Objects.requireNonNull(networkActions, "Parameter networkActions cannot be null for HttpTask::create");
        Objects.requireNonNull(executorService, "Parameter executorService cannot be null for HttpTask::create");
        Objects.requireNonNull(networkRequest, "Parameter networkRequest cannot be null for HttpTask::create");
        Objects.requireNonNull(errorMapper, "Parameter errorMapper cannot be null for HttpTask::create");
        Objects.requireNonNull(listener, "Parameter listener cannot be null for HttpTask::create");
        return new HttpTask<>(executorService, new Function(networkRequest, somaApiContext, logger, errorMapper, listener) {
            public final /* synthetic */ NetworkRequest f$1;
            public final /* synthetic */ SomaApiContext f$2;
            public final /* synthetic */ Logger f$3;
            public final /* synthetic */ ErrorMapper f$4;
            public final /* synthetic */ Task.Listener f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final Object apply(Object obj) {
                return HttpTask.createRunnable((NetworkTask) obj, NetworkActions.this, this.f$1, this.f$2, new IoFunction() {
                    public final Object apply(Object obj) {
                        return HttpTask.handleResponse(Logger.this, (HttpURLConnection) obj);
                    }
                }, HttpTask.standardResultHandler(this.f$3, this.f$4, (NetworkTask) obj, this.f$5));
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r8.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0089, code lost:
        r8.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008c, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <Err> com.smaato.sdk.core.network.execution.TaskStepResult<com.smaato.sdk.core.network.NetworkResponse, Err> handleResponse(com.smaato.sdk.core.log.Logger r8, java.net.HttpURLConnection r9) throws java.io.IOException {
        /*
            int r0 = r9.getResponseCode()
            r1 = 1
            r2 = 0
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x0010
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 >= r3) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            if (r3 == 0) goto L_0x001a
            java.io.InputStream r3 = r9.getInputStream()
            goto L_0x001e
        L_0x001a:
            java.io.InputStream r3 = r9.getErrorStream()
        L_0x001e:
            r4.<init>(r3)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0081 }
            r3.<init>()     // Catch:{ all -> 0x0081 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0075 }
        L_0x002a:
            int r6 = r4.read(r5)     // Catch:{ all -> 0x0075 }
            r7 = -1
            if (r6 == r7) goto L_0x004a
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0075 }
            boolean r7 = r7.isInterrupted()     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0046
            com.smaato.sdk.core.network.execution.TaskStepResult r8 = com.smaato.sdk.core.network.execution.TaskStepResult.cancelled()     // Catch:{ all -> 0x0075 }
            r3.close()     // Catch:{ all -> 0x0081 }
            r4.close()
            return r8
        L_0x0046:
            r3.write(r5, r2, r6)     // Catch:{ all -> 0x0075 }
            goto L_0x002a
        L_0x004a:
            byte[] r5 = r3.toByteArray()     // Catch:{ all -> 0x0075 }
            r3.close()     // Catch:{ all -> 0x0081 }
            r4.close()
            com.smaato.sdk.core.network.NetworkHttpResponse r3 = new com.smaato.sdk.core.network.NetworkHttpResponse
            java.util.Map r4 = r9.getHeaderFields()
            java.net.URL r9 = r9.getURL()
            java.lang.String r9 = r9.toString()
            r3.<init>(r0, r4, r5, r9)
            com.smaato.sdk.core.log.LogDomain r9 = com.smaato.sdk.core.log.LogDomain.NETWORK
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r3
            java.lang.String r1 = "NetworkResponse: %s"
            r8.debug(r9, r1, r0)
            com.smaato.sdk.core.network.execution.TaskStepResult r8 = com.smaato.sdk.core.network.execution.TaskStepResult.success(r3)
            return r8
        L_0x0075:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r9 = move-exception
            r3.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch:{ all -> 0x0081 }
        L_0x0080:
            throw r9     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r9 = move-exception
            r4.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            r8.addSuppressed(r0)
        L_0x008c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.network.execution.HttpTask.handleResponse(com.smaato.sdk.core.log.Logger, java.net.HttpURLConnection):com.smaato.sdk.core.network.execution.TaskStepResult");
    }
}

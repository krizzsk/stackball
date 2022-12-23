package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.IoFunction;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.network.execution.NetworkTask;
import com.smaato.sdk.core.network.execution.TaskStepResult;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Function;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;

class ResourceLoadingTask<OutputResourceType> extends NetworkTask<OutputResourceType> {
    ResourceLoadingTask(Logger logger, NetworkActions networkActions, NetworkRequest networkRequest, SomaApiContext somaApiContext, ErrorMapper<NetworkLayerException> errorMapper, ExecutorService executorService, NetworkResourceStreamPreparationStrategy networkResourceStreamPreparationStrategy, IoFunction<InputStream, TaskStepResult<OutputResourceType, Exception>> ioFunction, Task.Listener<OutputResourceType, NetworkLayerException> listener) {
        super((ExecutorService) Objects.requireNonNull(executorService), new Function(networkRequest, somaApiContext, networkResourceStreamPreparationStrategy, ioFunction, logger, errorMapper, listener) {
            public final /* synthetic */ NetworkRequest f$1;
            public final /* synthetic */ SomaApiContext f$2;
            public final /* synthetic */ NetworkResourceStreamPreparationStrategy f$3;
            public final /* synthetic */ IoFunction f$4;
            public final /* synthetic */ Logger f$5;
            public final /* synthetic */ ErrorMapper f$6;
            public final /* synthetic */ Task.Listener f$7;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
            }

            public final Object apply(Object obj) {
                return ResourceLoadingTask.createRunnable((NetworkTask) Objects.requireNonNull((NetworkTask) obj), (NetworkActions) Objects.requireNonNull(NetworkActions.this), (NetworkRequest) Objects.requireNonNull(this.f$1), (SomaApiContext) Objects.requireNonNull(this.f$2), new IoFunction(this.f$4) {
                    public final /* synthetic */ IoFunction f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final Object apply(Object obj) {
                        return ResourceLoadingTask.lambda$null$0(NetworkResourceStreamPreparationStrategy.this, this.f$1, (HttpURLConnection) obj);
                    }
                }, ResourceLoadingTask.standardResultHandler((Logger) Objects.requireNonNull(this.f$5), (ErrorMapper) Objects.requireNonNull(this.f$6), (NetworkTask) obj, (Task.Listener) Objects.requireNonNull(this.f$7)));
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r2 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r3.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ com.smaato.sdk.core.network.execution.TaskStepResult lambda$null$0(com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy r2, com.smaato.sdk.core.network.execution.IoFunction r3, java.net.HttpURLConnection r4) throws java.io.IOException {
        /*
            int r0 = r4.getResponseCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0032
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy r2 = (com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy) r2
            java.io.InputStream r2 = r2.prepare(r4)
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0024 }
            com.smaato.sdk.core.network.execution.IoFunction r3 = (com.smaato.sdk.core.network.execution.IoFunction) r3     // Catch:{ all -> 0x0024 }
            java.lang.Object r3 = r3.apply(r2)     // Catch:{ all -> 0x0024 }
            com.smaato.sdk.core.network.execution.TaskStepResult r3 = (com.smaato.sdk.core.network.execution.TaskStepResult) r3     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            r2.close()
        L_0x0023:
            return r3
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r4 = move-exception
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r2 = move-exception
            r3.addSuppressed(r2)
        L_0x0031:
            throw r4
        L_0x0032:
            java.io.IOException r2 = new java.io.IOException
            r2.<init>()
            com.smaato.sdk.core.network.execution.TaskStepResult r2 = com.smaato.sdk.core.network.execution.TaskStepResult.error(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.resourceloader.ResourceLoadingTask.lambda$null$0(com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy, com.smaato.sdk.core.network.execution.IoFunction, java.net.HttpURLConnection):com.smaato.sdk.core.network.execution.TaskStepResult");
    }
}

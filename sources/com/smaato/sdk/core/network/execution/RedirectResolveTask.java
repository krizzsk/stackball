package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkHttpRequest;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.execution.ClickThroughUrlRedirectResolver;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.Supplier;
import java.util.concurrent.ExecutorService;

public final class RedirectResolveTask extends NetworkTask<String> {
    private RedirectResolveTask(ExecutorService executorService, Function<NetworkTask<String>, Runnable> function) {
        super(executorService, function);
    }

    public static RedirectResolveTask create(Logger logger, ExecutorService executorService, String str, Task.Listener<String, Exception> listener, NetworkActions networkActions, ErrorMapper<Exception> errorMapper, ClickThroughUrlRedirectResolver clickThroughUrlRedirectResolver, SomaApiContext somaApiContext) {
        ExecutorService executorService2 = executorService;
        return new RedirectResolveTask(executorService, new Function(clickThroughUrlRedirectResolver, str, ClickThroughUrlRedirectResolver.ConnectionConfig.fromRequest(new NetworkHttpRequest.Builder().setMethod(NetworkRequest.Method.GET).setUrl(str).build()), somaApiContext, logger, errorMapper, listener) {
            public final /* synthetic */ ClickThroughUrlRedirectResolver f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ ClickThroughUrlRedirectResolver.ConnectionConfig f$3;
            public final /* synthetic */ SomaApiContext f$4;
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
                return RedirectResolveTask.createRunnable((NetworkTask) obj, new Supplier(this.f$1, this.f$2, this.f$3, this.f$4) {
                    public final /* synthetic */ ClickThroughUrlRedirectResolver f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ ClickThroughUrlRedirectResolver.ConnectionConfig f$3;
                    public final /* synthetic */ SomaApiContext f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final Object get() {
                        return RedirectResolveTask.lambda$null$1(NetworkActions.this, this.f$1, this.f$2, this.f$3, this.f$4);
                    }
                }, RedirectResolveTask.standardResultHandler(this.f$5, this.f$6, (NetworkTask) obj, this.f$7));
            }
        });
    }

    static /* synthetic */ TaskStepResult lambda$null$1(NetworkActions networkActions, ClickThroughUrlRedirectResolver clickThroughUrlRedirectResolver, String str, ClickThroughUrlRedirectResolver.ConnectionConfig connectionConfig, SomaApiContext somaApiContext) {
        return (TaskStepResult) networkActions.wrapIo(new IoFunction(str, connectionConfig, somaApiContext) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ ClickThroughUrlRedirectResolver.ConnectionConfig f$2;
            public final /* synthetic */ SomaApiContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object apply(Object obj) {
                return ClickThroughUrlRedirectResolver.this.resolve(this.f$1, this.f$2, this.f$3);
            }
        }).apply(Whatever.INSTANCE);
    }
}

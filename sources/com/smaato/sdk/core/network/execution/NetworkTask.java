package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.exception.TaskCancelledException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.Supplier;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public class NetworkTask<Response> implements Task {
    private final Function<NetworkTask<Response>, Runnable> execution;
    private final ExecutorService executorService;
    private Future future;
    private volatile int state = 0;

    protected NetworkTask(ExecutorService executorService2, Function<NetworkTask<Response>, Runnable> function) {
        this.executorService = executorService2;
        this.execution = function;
    }

    public synchronized void start() {
        if (this.state == 0) {
            this.state = 1;
            this.future = this.executorService.submit(this.execution.apply(this));
        }
    }

    public synchronized void cancel() {
        if (this.state == 1) {
            this.state = 3;
            Objects.onNotNull(this.future, $$Lambda$NetworkTask$vdSwBaGZJKC6VlAg8CpBZ8aPcgQ.INSTANCE);
        }
    }

    public static <Success> Runnable createRunnable(NetworkTask<Success> networkTask, NetworkActions networkActions, NetworkRequest networkRequest, SomaApiContext somaApiContext, IoFunction<HttpURLConnection, TaskStepResult<Success, Exception>> ioFunction, Consumer<TaskStepResult<Success, Exception>> consumer) {
        return createRunnable(networkTask, new Supplier(networkRequest, somaApiContext, ioFunction) {
            public final /* synthetic */ NetworkRequest f$1;
            public final /* synthetic */ SomaApiContext f$2;
            public final /* synthetic */ IoFunction f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object get() {
                return NetworkTask.getSuccessErrTaskStepResult(NetworkActions.this, this.f$1, this.f$2, this.f$3);
            }
        }, consumer);
    }

    /* access modifiers changed from: protected */
    public static <Success> Runnable createRunnable(NetworkTask<Success> networkTask, Supplier<TaskStepResult<Success, Exception>> supplier, Consumer<TaskStepResult<Success, Exception>> consumer) {
        return new Runnable(networkTask, consumer) {
            public final /* synthetic */ NetworkTask f$1;
            public final /* synthetic */ Consumer f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                NetworkTask.lambda$createRunnable$2(Supplier.this, this.f$1, this.f$2);
            }
        };
    }

    static /* synthetic */ void lambda$createRunnable$2(Supplier supplier, NetworkTask networkTask, Consumer consumer) {
        TaskStepResult taskStepResult = (TaskStepResult) supplier.get();
        if (networkTask.state == 1) {
            networkTask.state = 2;
        }
        consumer.accept(taskStepResult);
    }

    /* access modifiers changed from: private */
    public static <Success> TaskStepResult<Success, Exception> getSuccessErrTaskStepResult(NetworkActions networkActions, NetworkRequest networkRequest, SomaApiContext somaApiContext, IoFunction<HttpURLConnection, TaskStepResult<Success, Exception>> ioFunction) {
        AtomicReference atomicReference = new AtomicReference();
        try {
            TaskStepResult<HttpURLConnection, Exception> executeConnection = networkActions.executeConnection(networkRequest.getUrl(), networkRequest.getQueryItems(), networkRequest, somaApiContext, 16);
            atomicReference.getClass();
            $$Lambda$P7ISafwMIGpYaOcf79OGH0DK84 r9 = new Consumer(atomicReference) {
                public final /* synthetic */ AtomicReference f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.set((HttpURLConnection) obj);
                }
            };
            if (executeConnection.success != null) {
                r9.accept(executeConnection.success);
            }
            return executeConnection.andThen(networkActions.wrapIo(ioFunction));
        } catch (Exception e) {
            return TaskStepResult.error(e);
        } finally {
            HttpUrlConnections.ensureConnectionResourcesReleased((AtomicReference<HttpURLConnection>) atomicReference);
        }
    }

    public static <S, E> Consumer<TaskStepResult<S, Exception>> standardResultHandler(Logger logger, ErrorMapper<E> errorMapper, Task task, Task.Listener<S, E> listener) {
        return new Consumer(task, errorMapper, logger) {
            public final /* synthetic */ Task f$1;
            public final /* synthetic */ ErrorMapper f$2;
            public final /* synthetic */ Logger f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                NetworkTask.lambda$standardResultHandler$3(Task.Listener.this, this.f$1, this.f$2, this.f$3, (TaskStepResult) obj);
            }
        };
    }

    static /* synthetic */ void lambda$standardResultHandler$3(Task.Listener listener, Task task, ErrorMapper errorMapper, Logger logger, TaskStepResult taskStepResult) {
        if (taskStepResult.success != null) {
            listener.onSuccess(task, taskStepResult.success);
        } else if (taskStepResult.isCancelled) {
            listener.onFailure(task, errorMapper.map(new TaskCancelledException()));
        } else if (taskStepResult.error != null) {
            listener.onFailure(task, errorMapper.map((Exception) taskStepResult.error));
        } else {
            logger.error(LogDomain.NETWORK, "Network Task finished in unexpected state: %s", taskStepResult);
            listener.onFailure(task, errorMapper.map(new Exception("Generic")));
        }
    }
}

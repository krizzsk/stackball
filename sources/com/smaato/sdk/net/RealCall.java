package com.smaato.sdk.net;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

final class RealCall implements Call, Callable<Response> {
    private volatile Future<?> future;
    private final HttpClient httpClient;
    private final Request request;

    RealCall(HttpClient httpClient2, Request request2) {
        this.httpClient = httpClient2;
        this.request = request2;
    }

    public final Request request() {
        return this.request;
    }

    public final Response execute() throws IOException {
        if (this.future == null) {
            synchronized (this) {
                if (this.future == null) {
                    this.future = this.httpClient.executor().submit(this);
                    try {
                        Response response = (Response) this.future.get();
                        return response;
                    } catch (Exception e) {
                        throw findExceptionRoot(e);
                    }
                }
            }
        }
        throw new IllegalStateException("Already executed");
    }

    public final void enqueue(Callback callback) {
        if (callback != null) {
            if (this.future == null) {
                synchronized (this) {
                    if (this.future == null) {
                        this.future = this.httpClient.executor().submit(new Runnable(callback) {
                            public final /* synthetic */ Callback f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                RealCall.this.lambda$enqueue$0$RealCall(this.f$1);
                            }
                        });
                        return;
                    }
                }
            }
            throw new IllegalStateException("Already enqueued");
        }
        throw new NullPointerException("'callback' specified as non-null is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001a, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$enqueue$0$RealCall(com.smaato.sdk.net.Callback r4) {
        /*
            r3 = this;
            com.smaato.sdk.net.Response r0 = r3.call()     // Catch:{ Exception -> 0x001b }
            r4.onResponse(r3, r0)     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000c
            r0.close()     // Catch:{ Exception -> 0x001b }
        L_0x000c:
            return
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            if (r0 == 0) goto L_0x001a
            r0.close()     // Catch:{ all -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x001b }
        L_0x001a:
            throw r2     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            r0 = move-exception
            java.io.IOException r0 = findExceptionRoot(r0)
            r4.onFailure(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.net.RealCall.lambda$enqueue$0$RealCall(com.smaato.sdk.net.Callback):void");
    }

    public final void cancel() {
        if (this.future != null && !this.future.isCancelled()) {
            this.future.cancel(true);
        }
    }

    /* access modifiers changed from: private */
    public Response call() throws Exception {
        ArrayList arrayList = new ArrayList(this.httpClient.interceptors());
        arrayList.add(HttpCaller.INSTANCE);
        return RealChain.builder().readTimeoutMillis(this.httpClient.readTimeoutMillis()).connectTimeoutMillis(this.httpClient.connectTimeoutMillis()).interceptors(arrayList).request(this.request).call(this).build().proceed(this.request);
    }

    private static IOException findExceptionRoot(Throwable th) {
        while (th != null) {
            if (th instanceof IOException) {
                return (IOException) th;
            }
            th = th.getCause();
        }
        return new IOException(th.getCause());
    }
}

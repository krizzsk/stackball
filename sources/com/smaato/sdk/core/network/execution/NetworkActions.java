package com.smaato.sdk.core.network.execution;

import com.google.common.net.HttpHeaders;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationException;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationOnRedirectException;
import com.smaato.sdk.core.network.exception.NetworkNotAvailableException;
import com.smaato.sdk.core.network.exception.NoRedirectLocationException;
import com.smaato.sdk.core.network.exception.TooManyRedirectsException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class NetworkActions {
    protected static final int CHUNK_SIZE_4KB = 4096;
    private final HttpsOnlyPolicy httpsOnlyPolicy;
    private final Logger logger;
    private final NetworkStateMonitor networkStateMonitor;
    private final UrlCreator urlCreator;

    public NetworkActions(Logger logger2, UrlCreator urlCreator2, NetworkStateMonitor networkStateMonitor2, HttpsOnlyPolicy httpsOnlyPolicy2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for NetworkActions::new");
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator2, "Parameter urlCreator cannot be null for NetworkActions::new");
        this.networkStateMonitor = (NetworkStateMonitor) Objects.requireNonNull(networkStateMonitor2, "Parameter networkStateMonitor cannot be null for NetworkActions::new");
        this.httpsOnlyPolicy = (HttpsOnlyPolicy) Objects.requireNonNull(httpsOnlyPolicy2, "Parameter httpsOnlyPolicy cannot be null for NetworkActions::new");
    }

    public final TaskStepResult<HttpURLConnection, Exception> executeConnection(String str, Map<String, String> map, final NetworkRequest networkRequest, final SomaApiContext somaApiContext, int i) {
        if (i <= 0) {
            this.logger.error(LogDomain.NETWORK, "Redirect limit reached", new Object[0]);
            return TaskStepResult.error(new TooManyRedirectsException("Redirect limit reached. Last url: ".concat(String.valueOf(str))));
        }
        return executeConnection(str, map, networkRequest, somaApiContext, i, new RedirectConnection() {
            /* renamed from: go */
            public TaskStepResult<HttpURLConnection, Exception> mo55129go(String str, int i) {
                return NetworkActions.this.executeConnection(str, Collections.emptyMap(), networkRequest, somaApiContext, i, this);
            }
        });
    }

    /* access modifiers changed from: private */
    public TaskStepResult<HttpURLConnection, Exception> executeConnection(String str, Map<String, String> map, NetworkRequest networkRequest, SomaApiContext somaApiContext, int i, RedirectConnection redirectConnection) {
        AtomicReference atomicReference = new AtomicReference();
        SomaApiContext somaApiContext2 = somaApiContext;
        return executeRequest(somaApiContext, str, map, networkRequest.getMethod().getMethodName(), networkRequest.getConnectTimeout(), networkRequest.getReadTimeout(), networkRequest.getHeaders(), networkRequest.getBody()).andThen(handleRedirect(somaApiContext, new RedirectConnection(atomicReference, redirectConnection) {
            public final /* synthetic */ AtomicReference f$0;
            public final /* synthetic */ RedirectConnection f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            /* renamed from: go */
            public final TaskStepResult mo55129go(String str, int i) {
                return HttpUrlConnections.ensureConnectionResourcesReleased((AtomicReference<HttpURLConnection>) this.f$0);
            }
        }, i)).doOnError(new Consumer(atomicReference) {
            public final /* synthetic */ AtomicReference f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                HttpUrlConnections.ensureConnectionResourcesReleased((AtomicReference<HttpURLConnection>) this.f$0);
            }
        });
    }

    public final TaskStepResult<HttpURLConnection, Exception> executeRequest(SomaApiContext somaApiContext, String str, Map<String, String> map, String str2, int i, int i2, Map<String, List<String>> map2, byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference();
        String createUrl = this.urlCreator.createUrl(str, map);
        this.logger.debug(LogDomain.NETWORK, "Url: %s", createUrl);
        return TaskStepResult.success(createUrl).andThen(new Function(somaApiContext) {
            public final /* synthetic */ SomaApiContext f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return NetworkActions.this.lambda$executeRequest$2$NetworkActions(this.f$1, (String) obj);
            }
        }).andThen(wrapIo(new IoFunction(atomicReference) {
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return NetworkActions.this.lambda$executeRequest$3$NetworkActions(this.f$1, (String) obj);
            }
        })).andThen(new Function(str2, i, i2, map2) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ Map f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final Object apply(Object obj) {
                return NetworkActions.this.lambda$prepareConnection$5$NetworkActions(this.f$1, this.f$2, this.f$3, this.f$4, (HttpURLConnection) obj);
            }
        }).andThen(wrapIo(new IoFunction(bArr) {
            public final /* synthetic */ byte[] f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return NetworkActions.lambda$performRequest$6(this.f$0, (HttpURLConnection) obj);
            }
        })).doOnError(new Consumer(atomicReference) {
            public final /* synthetic */ AtomicReference f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                HttpUrlConnections.ensureConnectionResourcesReleased((AtomicReference<HttpURLConnection>) this.f$0);
            }
        });
    }

    public /* synthetic */ TaskStepResult lambda$executeRequest$3$NetworkActions(AtomicReference atomicReference, String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection(str);
        atomicReference.set(httpURLConnection);
        return TaskStepResult.success(httpURLConnection);
    }

    public final URLConnection openConnection(String str) throws IOException {
        return new URL(str).openConnection();
    }

    public /* synthetic */ TaskStepResult lambda$prepareConnection$5$NetworkActions(String str, int i, int i2, Map map, HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            for (Map.Entry entry : map.entrySet()) {
                for (String addRequestProperty : (List) entry.getValue()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), addRequestProperty);
                }
            }
            return TaskStepResult.success(httpURLConnection);
        } catch (ProtocolException e) {
            this.logger.error(LogDomain.NETWORK, e, "You cannot do %s via http/https", str);
            return TaskStepResult.error(e);
        } catch (SecurityException e2) {
            this.logger.error(LogDomain.NETWORK, e2, "Security violation during method connection setup", new Object[0]);
            return TaskStepResult.error(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r5 = com.smaato.sdk.core.network.execution.TaskStepResult.cancelled();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r4 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r4.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r4 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0069, code lost:
        if (r4 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0076, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007f, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ com.smaato.sdk.core.network.execution.TaskStepResult lambda$performRequest$6(byte[] r4, java.net.HttpURLConnection r5) throws java.io.IOException {
        /*
            java.lang.String r0 = r5.getRequestMethod()
            com.smaato.sdk.core.network.NetworkRequest$Method r1 = com.smaato.sdk.core.network.NetworkRequest.Method.GET
            java.lang.String r1 = r1.getMethodName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0018
            r5.connect()
            com.smaato.sdk.core.network.execution.TaskStepResult r4 = com.smaato.sdk.core.network.execution.TaskStepResult.success(r5)
            return r4
        L_0x0018:
            com.smaato.sdk.core.network.NetworkRequest$Method r1 = com.smaato.sdk.core.network.NetworkRequest.Method.POST
            java.lang.String r1 = r1.getMethodName()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            if (r4 == 0) goto L_0x0080
            r0 = 1
            r5.setDoOutput(r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r4)
            java.io.OutputStream r4 = r5.getOutputStream()     // Catch:{ all -> 0x0074 }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0066 }
        L_0x0037:
            int r2 = r0.read(r1)     // Catch:{ all -> 0x0066 }
            r3 = -1
            if (r2 == r3) goto L_0x005a
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0066 }
            boolean r3 = r3.isInterrupted()     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0055
            com.smaato.sdk.core.network.execution.TaskStepResult r5 = com.smaato.sdk.core.network.execution.TaskStepResult.cancelled()     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0051
            r4.close()     // Catch:{ all -> 0x0074 }
        L_0x0051:
            r0.close()
            return r5
        L_0x0055:
            r3 = 0
            r4.write(r1, r3, r2)     // Catch:{ all -> 0x0066 }
            goto L_0x0037
        L_0x005a:
            r4.flush()     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch:{ all -> 0x0074 }
        L_0x0062:
            r0.close()
            goto L_0x0083
        L_0x0066:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            if (r4 == 0) goto L_0x0073
            r4.close()     // Catch:{ all -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch:{ all -> 0x0074 }
        L_0x0073:
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r5 = move-exception
            r0.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            r4.addSuppressed(r0)
        L_0x007f:
            throw r5
        L_0x0080:
            r5.connect()
        L_0x0083:
            com.smaato.sdk.core.network.execution.TaskStepResult r4 = com.smaato.sdk.core.network.execution.TaskStepResult.success(r5)
            return r4
        L_0x0088:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Only GET and POST requests for now"
            r4.<init>(r5)
            com.smaato.sdk.core.network.execution.TaskStepResult r4 = com.smaato.sdk.core.network.execution.TaskStepResult.error(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.network.execution.NetworkActions.lambda$performRequest$6(byte[], java.net.HttpURLConnection):com.smaato.sdk.core.network.execution.TaskStepResult");
    }

    private Function<HttpURLConnection, TaskStepResult<HttpURLConnection, Exception>> handleRedirect(SomaApiContext somaApiContext, RedirectConnection redirectConnection, int i) {
        return wrapIo(new IoFunction(somaApiContext, redirectConnection, i) {
            public final /* synthetic */ SomaApiContext f$1;
            public final /* synthetic */ RedirectConnection f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object apply(Object obj) {
                return NetworkActions.this.lambda$handleRedirect$7$NetworkActions(this.f$1, this.f$2, this.f$3, (HttpURLConnection) obj);
            }
        });
    }

    public /* synthetic */ TaskStepResult lambda$handleRedirect$7$NetworkActions(SomaApiContext somaApiContext, RedirectConnection redirectConnection, int i, HttpURLConnection httpURLConnection) throws IOException {
        if (!isRedirect(httpURLConnection)) {
            return TaskStepResult.success(httpURLConnection);
        }
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
        if (headerField == null) {
            NoRedirectLocationException noRedirectLocationException = new NoRedirectLocationException();
            this.logger.error(LogDomain.NETWORK, noRedirectLocationException, "No redirect location found in response", new Object[0]);
            return TaskStepResult.error(noRedirectLocationException);
        }
        String url = httpURLConnection.getURL().toString();
        if (this.httpsOnlyPolicy.validateUrl(somaApiContext, headerField)) {
            this.logger.debug(LogDomain.NETWORK, "Handle redirect from: %s to: %s", url, headerField);
            return redirectConnection.mo55129go(headerField, i - 1);
        }
        HttpsOnlyPolicyViolationOnRedirectException httpsOnlyPolicyViolationOnRedirectException = new HttpsOnlyPolicyViolationOnRedirectException(url, headerField);
        this.logger.error(LogDomain.NETWORK, httpsOnlyPolicyViolationOnRedirectException, "Not allowed to redirect from `%s` to `%s`", url, headerField);
        return TaskStepResult.error(httpsOnlyPolicyViolationOnRedirectException);
    }

    public final boolean isRedirect(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        this.logger.debug(LogDomain.NETWORK, "Response code: %d", Integer.valueOf(responseCode));
        return responseCode == 302 || responseCode == 301 || responseCode == 303 || responseCode == 307 || responseCode == 308;
    }

    public final <Input, Output> Function<Input, TaskStepResult<Output, Exception>> wrapIo(IoFunction<Input, TaskStepResult<Output, Exception>> ioFunction) {
        return new Function(ioFunction) {
            public final /* synthetic */ IoFunction f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return NetworkActions.this.lambda$wrapIo$8$NetworkActions(this.f$1, obj);
            }
        };
    }

    public /* synthetic */ TaskStepResult lambda$wrapIo$8$NetworkActions(IoFunction ioFunction, Object obj) {
        try {
            return (TaskStepResult) ioFunction.apply(obj);
        } catch (SocketException | SocketTimeoutException | UnknownHostException e) {
            return handleIoError(obj, e);
        } catch (InterruptedIOException e2) {
            this.logger.error(LogDomain.NETWORK, e2, "Task was cancelled", new Object[0]);
            return TaskStepResult.cancelled();
        } catch (IOException e3) {
            return handleIoError(obj, e3);
        } catch (Exception e4) {
            this.logger.error(LogDomain.NETWORK, e4, "Unexpected error type happened", new Object[0]);
            return TaskStepResult.error(e4);
        }
    }

    private <Input, Output> TaskStepResult<Output, Exception> handleIoError(Input input, IOException iOException) {
        if (!this.networkStateMonitor.isOnline()) {
            this.logger.error(LogDomain.NETWORK, iOException, "No Internet connection", new Object[0]);
            return TaskStepResult.error(new NetworkNotAvailableException(iOException));
        }
        this.logger.error(LogDomain.NETWORK, iOException, "Failed to perform operation for %s", input);
        return TaskStepResult.error(iOException);
    }

    public /* synthetic */ TaskStepResult lambda$executeRequest$2$NetworkActions(SomaApiContext somaApiContext, String str) {
        if (str == null) {
            return TaskStepResult.error(new NullPointerException("Passed url cannot be null"));
        }
        if (this.httpsOnlyPolicy.validateUrl(somaApiContext, str)) {
            return TaskStepResult.success(str);
        }
        HttpsOnlyPolicyViolationException httpsOnlyPolicyViolationException = new HttpsOnlyPolicyViolationException(str);
        this.logger.error(LogDomain.NETWORK, httpsOnlyPolicyViolationException, "Not allowed to follow to `%s`", str);
        return TaskStepResult.error(httpsOnlyPolicyViolationException);
    }
}

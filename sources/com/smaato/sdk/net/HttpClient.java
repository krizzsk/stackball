package com.smaato.sdk.net;

import com.smaato.sdk.net.Call;
import com.smaato.sdk.util.SdkThreadFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class HttpClient implements Call.Factory {
    /* access modifiers changed from: package-private */
    public abstract long connectTimeoutMillis();

    /* access modifiers changed from: package-private */
    public abstract ExecutorService executor();

    /* access modifiers changed from: package-private */
    public abstract List<Interceptor> interceptors();

    /* access modifiers changed from: package-private */
    public abstract long readTimeoutMillis();

    public static Builder builder() {
        Builder builder = new Builder(Collections.emptyList());
        int max = Math.max(2, Runtime.getRuntime().availableProcessors());
        return builder.executor(new ThreadPoolExecutor(max, Math.max(2, Runtime.getRuntime().availableProcessors()), 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new SdkThreadFactory("http", 1))).connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS);
    }

    public Call newCall(Request request) {
        if (request != null) {
            return new RealCall(this, request);
        }
        throw new NullPointerException("'request' specified as non-null is null");
    }

    public Builder buildUpon() {
        return new Builder(interceptors()).executor(executor()).connectTimeout(connectTimeoutMillis(), TimeUnit.MILLISECONDS).readTimeout(connectTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    public static class Builder {
        private long connectTimeout;
        private ExecutorService executor;
        private final List<Interceptor> interceptors;
        private long readTimeout;

        Builder(List<Interceptor> list) {
            ArrayList arrayList = new ArrayList();
            this.interceptors = arrayList;
            arrayList.addAll(list);
        }

        public Builder executor(ExecutorService executorService) {
            if (executorService != null) {
                this.executor = executorService;
                return this;
            }
            throw new NullPointerException("'executor' specified as non-null is null");
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.interceptors.add(interceptor);
                return this;
            }
            throw new NullPointerException("'interceptor' specified as non-null is null");
        }

        public Builder connectTimeout(long j, TimeUnit timeUnit) {
            this.connectTimeout = timeUnit.toMillis(j);
            return this;
        }

        public Builder readTimeout(long j, TimeUnit timeUnit) {
            this.readTimeout = timeUnit.toMillis(j);
            return this;
        }

        public HttpClient build() {
            return new AutoValue_HttpClient(this.executor, Collections.unmodifiableList(this.interceptors), this.connectTimeout, this.readTimeout);
        }
    }
}

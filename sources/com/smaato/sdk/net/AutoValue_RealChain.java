package com.smaato.sdk.net;

import com.smaato.sdk.net.RealChain;
import java.util.List;

final class AutoValue_RealChain extends RealChain {
    private final Call call;
    private final long connectTimeoutMillis;
    private final int index;
    private final List<Interceptor> interceptors;
    private final long readTimeoutMillis;
    private final Request request;

    /* synthetic */ AutoValue_RealChain(Call call2, Request request2, long j, long j2, List list, int i, byte b) {
        this(call2, request2, j, j2, list, i);
    }

    private AutoValue_RealChain(Call call2, Request request2, long j, long j2, List<Interceptor> list, int i) {
        this.call = call2;
        this.request = request2;
        this.connectTimeoutMillis = j;
        this.readTimeoutMillis = j2;
        this.interceptors = list;
        this.index = i;
    }

    public final Call call() {
        return this.call;
    }

    public final Request request() {
        return this.request;
    }

    public final long connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final long readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* access modifiers changed from: package-private */
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* access modifiers changed from: package-private */
    public final int index() {
        return this.index;
    }

    public final String toString() {
        return "RealChain{call=" + this.call + ", request=" + this.request + ", connectTimeoutMillis=" + this.connectTimeoutMillis + ", readTimeoutMillis=" + this.readTimeoutMillis + ", interceptors=" + this.interceptors + ", index=" + this.index + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RealChain) {
            RealChain realChain = (RealChain) obj;
            return this.call.equals(realChain.call()) && this.request.equals(realChain.request()) && this.connectTimeoutMillis == realChain.connectTimeoutMillis() && this.readTimeoutMillis == realChain.readTimeoutMillis() && this.interceptors.equals(realChain.interceptors()) && this.index == realChain.index();
        }
    }

    public final int hashCode() {
        long j = this.connectTimeoutMillis;
        long j2 = this.readTimeoutMillis;
        return ((((((((((this.call.hashCode() ^ 1000003) * 1000003) ^ this.request.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.interceptors.hashCode()) * 1000003) ^ this.index;
    }

    static final class Builder extends RealChain.Builder {
        private Call call;
        private Long connectTimeoutMillis;
        private Integer index;
        private List<Interceptor> interceptors;
        private Long readTimeoutMillis;
        private Request request;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final RealChain.Builder call(Call call2) {
            if (call2 != null) {
                this.call = call2;
                return this;
            }
            throw new NullPointerException("Null call");
        }

        /* access modifiers changed from: package-private */
        public final RealChain.Builder request(Request request2) {
            if (request2 != null) {
                this.request = request2;
                return this;
            }
            throw new NullPointerException("Null request");
        }

        /* access modifiers changed from: package-private */
        public final RealChain.Builder connectTimeoutMillis(long j) {
            this.connectTimeoutMillis = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final RealChain.Builder readTimeoutMillis(long j) {
            this.readTimeoutMillis = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final RealChain.Builder interceptors(List<Interceptor> list) {
            if (list != null) {
                this.interceptors = list;
                return this;
            }
            throw new NullPointerException("Null interceptors");
        }

        /* access modifiers changed from: package-private */
        public final RealChain.Builder index(int i) {
            this.index = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final RealChain build() {
            String str = "";
            if (this.call == null) {
                str = str + " call";
            }
            if (this.request == null) {
                str = str + " request";
            }
            if (this.connectTimeoutMillis == null) {
                str = str + " connectTimeoutMillis";
            }
            if (this.readTimeoutMillis == null) {
                str = str + " readTimeoutMillis";
            }
            if (this.interceptors == null) {
                str = str + " interceptors";
            }
            if (this.index == null) {
                str = str + " index";
            }
            if (str.isEmpty()) {
                return new AutoValue_RealChain(this.call, this.request, this.connectTimeoutMillis.longValue(), this.readTimeoutMillis.longValue(), this.interceptors, this.index.intValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}

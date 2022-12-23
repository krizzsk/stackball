package com.yandex.mobile.ads.mediation.base;

public final class MediatedAdapterInfo {

    /* renamed from: a */
    private final String f43593a;

    /* renamed from: b */
    private final String f43594b;

    /* renamed from: c */
    private final String f43595c;

    static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f43596a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f43597b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f43598c;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this);
        }

        /* access modifiers changed from: package-private */
        public Builder setAdapterVersion(String str) {
            this.f43596a = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setNetworkName(String str) {
            this.f43597b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setNetworkSdkVersion(String str) {
            this.f43598c = str;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public String getAdapterVersion() {
        return this.f43593a;
    }

    /* access modifiers changed from: package-private */
    public String getNetworkName() {
        return this.f43594b;
    }

    /* access modifiers changed from: package-private */
    public String getNetworkSdkVersion() {
        return this.f43595c;
    }

    private MediatedAdapterInfo(Builder builder) {
        this.f43593a = builder.f43596a;
        this.f43594b = builder.f43597b;
        this.f43595c = builder.f43598c;
    }
}

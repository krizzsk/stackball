package com.smaato.sdk.iahb;

import com.smaato.sdk.SdkBase;
import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.inject.Providers;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.util.JsonAdapter;

public final class SmaatoIahbComponent extends IahbComponent {
    private final Provider<? extends IahbInteractor> iahbInteractor;
    private final Provider<? extends JsonAdapter<IahbResponse>> jsonAdapter;
    private final Provider<? extends SdkBase> sdkBase;
    private final Provider<? extends UbCache> ubCache;

    static /* synthetic */ String lambda$new$1() {
        return "com.smaato.sdk.iahb.IahbComponent.Bindings.adMarkupCache(com.smaato.sdk.SdkBase) returned null value";
    }

    /* synthetic */ SmaatoIahbComponent(Provider provider, byte b) {
        this(provider);
    }

    private SmaatoIahbComponent(Provider<? extends SdkBase> provider) {
        this.sdkBase = provider;
        this.ubCache = Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoIahbComponent.this.lambda$new$0$SmaatoIahbComponent();
            }
        }, $$Lambda$SmaatoIahbComponent$jvqIHUrVKuN4XwVHvGAnUE9a6JQ.INSTANCE);
        IahbJsonAdapter_Factory iahbJsonAdapter_Factory = new IahbJsonAdapter_Factory();
        this.jsonAdapter = iahbJsonAdapter_Factory;
        this.iahbInteractor = new IahbInteractor_Factory(this.ubCache, iahbJsonAdapter_Factory);
    }

    public /* synthetic */ UbCache lambda$new$0$SmaatoIahbComponent() {
        return ((SdkBase) this.sdkBase.get()).ubCache();
    }

    /* access modifiers changed from: package-private */
    public final IahbInteractor interactor() {
        return (IahbInteractor) this.iahbInteractor.get();
    }

    public static Builder builder() {
        return new Builder((byte) 0);
    }

    public static final class Builder {
        private Provider<? extends SdkBase> sdkBase;

        static /* synthetic */ String lambda$sdkBase$0() {
            return "'sdkBase' provider returned null value";
        }

        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
        }

        public final Builder sdkBase(Provider<? extends SdkBase> provider) {
            if (provider != null) {
                this.sdkBase = Providers.nullSafe(provider, C8719x60369fb8.INSTANCE);
                return this;
            }
            throw new NullPointerException("'sdkBase' is null");
        }

        public final SmaatoIahbComponent build() {
            Provider<? extends SdkBase> provider = this.sdkBase;
            if (provider != null) {
                return new SmaatoIahbComponent(provider, (byte) 0);
            }
            throw new NullPointerException("Missing 'sdkBase' dependency");
        }
    }
}

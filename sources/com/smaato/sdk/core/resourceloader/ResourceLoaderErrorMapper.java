package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.Objects;

public final class ResourceLoaderErrorMapper {
    private ResourceLoaderErrorMapper() {
    }

    public static ResourceLoaderException map(NetworkLayerException networkLayerException) {
        ResourceLoader.Error error;
        ResourceLoader.Error error2;
        Objects.requireNonNull(networkLayerException);
        if (networkLayerException.getReason() instanceof PersistingStrategyException) {
            PersistingStrategyException persistingStrategyException = (PersistingStrategyException) networkLayerException.getReason();
            int i = C86921.f21798x3db22859[persistingStrategyException.getErrorType().ordinal()];
            if (i == 1) {
                error2 = ResourceLoader.Error.IO_ERROR;
            } else if (i == 2) {
                error2 = ResourceLoader.Error.RESOURCE_EXPIRED;
            } else if (i == 3) {
                error2 = ResourceLoader.Error.GENERIC;
            } else {
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{PersistingStrategy.Error.class.getSimpleName(), persistingStrategyException}));
            }
            return new ResourceLoaderException(error2, persistingStrategyException);
        }
        switch (C86921.$SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error[networkLayerException.getErrorType().ordinal()]) {
            case 1:
                error = ResourceLoader.Error.CANCELLED;
                break;
            case 2:
                error = ResourceLoader.Error.NETWORK_TIMEOUT;
                break;
            case 3:
                error = ResourceLoader.Error.IO_ERROR;
                break;
            case 4:
                error = ResourceLoader.Error.GENERIC;
                break;
            case 5:
                error = ResourceLoader.Error.NETWORK_IO_TOO_MANY_REDIRECTS;
                break;
            case 6:
                error = ResourceLoader.Error.NETWORK_NO_CONNECTION;
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{ResourceLoader.Error.class.getSimpleName(), networkLayerException}));
        }
        return new ResourceLoaderException(error, networkLayerException);
    }

    /* renamed from: com.smaato.sdk.core.resourceloader.ResourceLoaderErrorMapper$1 */
    static /* synthetic */ class C86921 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error;

        /* renamed from: $SwitchMap$com$smaato$sdk$core$resourceloader$PersistingStrategy$Error */
        static final /* synthetic */ int[] f21798x3db22859;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        static {
            /*
                com.smaato.sdk.core.resourceloader.PersistingStrategy$Error[] r0 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21798x3db22859 = r0
                r1 = 1
                com.smaato.sdk.core.resourceloader.PersistingStrategy$Error r2 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21798x3db22859     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.resourceloader.PersistingStrategy$Error r3 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f21798x3db22859     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.resourceloader.PersistingStrategy$Error r4 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.smaato.sdk.core.network.NetworkClient$Error[] r3 = com.smaato.sdk.core.network.NetworkClient.Error.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error = r3
                com.smaato.sdk.core.network.NetworkClient$Error r4 = com.smaato.sdk.core.network.NetworkClient.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.smaato.sdk.core.network.NetworkClient$Error r3 = com.smaato.sdk.core.network.NetworkClient.Error.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x004d }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.IO_TOO_MANY_REDIRECTS     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x006e }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.NO_NETWORK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.resourceloader.ResourceLoaderErrorMapper.C86921.<clinit>():void");
        }
    }
}

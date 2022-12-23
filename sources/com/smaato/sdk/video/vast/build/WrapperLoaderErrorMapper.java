package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.video.vast.exceptions.wrapper.GeneralWrapperErrorException;
import com.smaato.sdk.video.vast.exceptions.wrapper.WrapperRequestTimeoutException;

public class WrapperLoaderErrorMapper {

    /* renamed from: com.smaato.sdk.video.vast.build.WrapperLoaderErrorMapper$1 */
    static /* synthetic */ class C89361 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.smaato.sdk.core.network.NetworkClient$Error[] r0 = com.smaato.sdk.core.network.NetworkClient.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error = r0
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.IO_TOO_MANY_REDIRECTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.NO_NETWORK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.build.WrapperLoaderErrorMapper.C89361.<clinit>():void");
        }
    }

    static Exception map(NetworkClient.Error error, String str) {
        int i = C89361.$SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error[error.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return new WrapperRequestTimeoutException(str);
        }
        return new GeneralWrapperErrorException(str);
    }
}

package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;

/* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilderErrorMapper */
public final class AdPresenterBuilderErrorMapper {
    private AdPresenterBuilderErrorMapper() {
    }

    /* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilderErrorMapper$1 */
    static /* synthetic */ class C85981 {

        /* renamed from: $SwitchMap$com$smaato$sdk$core$resourceloader$ResourceLoader$Error */
        static final /* synthetic */ int[] f21788x20b590f9;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error[] r0 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21788x20b590f9 = r0
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.NETWORK_NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.NETWORK_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.NETWORK_GENERIC     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f21788x20b590f9     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.NETWORK_IO_TOO_MANY_REDIRECTS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p248ad.AdPresenterBuilderErrorMapper.C85981.<clinit>():void");
        }
    }

    public static AdPresenterBuilderException mapError(ResourceLoaderException resourceLoaderException) {
        AdPresenterBuilder.Error error;
        switch (C85981.f21788x20b590f9[resourceLoaderException.getErrorType().ordinal()]) {
            case 1:
                error = AdPresenterBuilder.Error.CANCELLED;
                break;
            case 2:
                error = AdPresenterBuilder.Error.RESOURCE_EXPIRED;
                break;
            case 3:
                error = AdPresenterBuilder.Error.GENERIC;
                break;
            case 4:
                error = AdPresenterBuilder.Error.TRANSPORT_GENERIC;
                break;
            case 5:
                error = AdPresenterBuilder.Error.TRANSPORT_IO_ERROR;
                break;
            case 6:
                error = AdPresenterBuilder.Error.TRANSPORT_NO_NETWORK_CONNECTION;
                break;
            case 7:
                error = AdPresenterBuilder.Error.TRANSPORT_TIMEOUT;
                break;
            case 8:
                error = AdPresenterBuilder.Error.TRANSPORT_GENERIC;
                break;
            case 9:
                error = AdPresenterBuilder.Error.TRANSPORT_IO_TOO_MANY_REDIRECTS;
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{ResourceLoader.Error.class.getSimpleName(), resourceLoaderException}));
        }
        return new AdPresenterBuilderException(error, resourceLoaderException);
    }
}

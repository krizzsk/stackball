package com.smaato.sdk.core.p248ad;

import com.appsflyer.ServerParameters;
import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.util.HeaderUtils;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.ad.ApiUtils */
public final class ApiUtils {
    private static final HeaderUtils HEADER_UTILS = new HeaderUtils();

    private ApiUtils() {
    }

    public static String retrieveSessionId(Map<String, List<String>> map) {
        return HEADER_UTILS.extractHeaderMultiValue(map, "X-SMT-SessionId");
    }

    public static String retrieveSci(Map<String, List<String>> map) {
        return HEADER_UTILS.extractHeaderMultiValue(map, "SCI");
    }

    public static String retrieveCsm(Map<String, List<String>> map) {
        return HEADER_UTILS.extractHeaderMultiValue(map, "X-SMT-CSM");
    }

    public static String connectionTypeToApiValue(NetworkConnectionType networkConnectionType) {
        switch (C86021.$SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType[networkConnectionType.ordinal()]) {
            case 1:
                return "2g";
            case 2:
                return "3g";
            case 3:
                return "4g";
            case 4:
                return ServerParameters.CARRIER;
            case 5:
                return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
            case 6:
                return "ethernet";
            case 7:
                return "Other";
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{NetworkConnectionType.class.getSimpleName(), networkConnectionType}));
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.ApiUtils$1 */
    static /* synthetic */ class C86021 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdFormat;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008c */
        static {
            /*
                com.smaato.sdk.core.ad.AdFormat[] r0 = com.smaato.sdk.core.p248ad.AdFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdFormat = r0
                r1 = 1
                com.smaato.sdk.core.ad.AdFormat r2 = com.smaato.sdk.core.p248ad.AdFormat.DISPLAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdFormat r3 = com.smaato.sdk.core.p248ad.AdFormat.STATIC_IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdFormat r4 = com.smaato.sdk.core.p248ad.AdFormat.RICH_MEDIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p248ad.AdFormat.VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdFormat r6 = com.smaato.sdk.core.p248ad.AdFormat.NATIVE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdFormat r7 = com.smaato.sdk.core.p248ad.AdFormat.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.smaato.sdk.core.network.NetworkConnectionType[] r6 = com.smaato.sdk.core.network.NetworkConnectionType.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType = r6
                com.smaato.sdk.core.network.NetworkConnectionType r7 = com.smaato.sdk.core.network.NetworkConnectionType.CARRIER_2G     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.smaato.sdk.core.network.NetworkConnectionType r6 = com.smaato.sdk.core.network.NetworkConnectionType.CARRIER_3G     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType     // Catch:{ NoSuchFieldError -> 0x006e }
                com.smaato.sdk.core.network.NetworkConnectionType r1 = com.smaato.sdk.core.network.NetworkConnectionType.CARRIER_4G     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.core.network.NetworkConnectionType r1 = com.smaato.sdk.core.network.NetworkConnectionType.CARRIER_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.smaato.sdk.core.network.NetworkConnectionType r1 = com.smaato.sdk.core.network.NetworkConnectionType.WIFI     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType     // Catch:{ NoSuchFieldError -> 0x008c }
                com.smaato.sdk.core.network.NetworkConnectionType r1 = com.smaato.sdk.core.network.NetworkConnectionType.ETHERNET     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkConnectionType     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.smaato.sdk.core.network.NetworkConnectionType r1 = com.smaato.sdk.core.network.NetworkConnectionType.OTHER     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p248ad.ApiUtils.C86021.<clinit>():void");
        }
    }

    public static String adFormatToApiValue(AdFormat adFormat) {
        switch (C86021.$SwitchMap$com$smaato$sdk$core$ad$AdFormat[adFormat.ordinal()]) {
            case 1:
                return "display";
            case 2:
                return "img";
            case 3:
                return "richmedia";
            case 4:
                return "video";
            case 5:
                return "native";
            case 6:
                return "interstitial";
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{AdFormat.class.getSimpleName(), adFormat}));
        }
    }
}

package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.api.ApiResponseMapper;
import com.smaato.sdk.core.network.execution.NetworkLayerException;

final class ErrorMappingUtil {
    private ErrorMappingUtil() {
    }

    static ApiConnectorException mapNetworkClientErrorToApiConnectorLayerException(NetworkLayerException networkLayerException) {
        ApiConnector.Error error;
        int i = C86191.$SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error[networkLayerException.getErrorType().ordinal()];
        if (i == 1) {
            error = ApiConnector.Error.CANCELLED;
        } else if (i == 2) {
            error = ApiConnector.Error.TRANSPORT_TIMEOUT;
        } else if (i == 3 || i == 4) {
            error = ApiConnector.Error.TRANSPORT_IO_ERROR;
        } else if (i != 5) {
            error = ApiConnector.Error.TRANSPORT_GENERIC;
        } else {
            error = ApiConnector.Error.TRANSPORT_NO_NETWORK_CONNECTION;
        }
        return new ApiConnectorException(error, networkLayerException);
    }

    /* renamed from: com.smaato.sdk.core.api.ErrorMappingUtil$1 */
    static /* synthetic */ class C86191 {

        /* renamed from: $SwitchMap$com$smaato$sdk$core$api$ApiResponseMapper$MappingException$Type */
        static final /* synthetic */ int[] f21789x137c019c;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bd */
        static {
            /*
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type[] r0 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21789x137c019c = r0
                r1 = 1
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r2 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.NO_AD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r3 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.BAD_REQUEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r4 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_AD_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.UNEXPECTED_AD_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r6 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_CONTENT_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r7 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_MIME_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r6 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r7 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_CHARSET     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r6 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r7 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_BODY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8 = 8
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r6 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r7 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.EMPTY_BODY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r8 = 9
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r6 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r7 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.UNEXPECTED_HTTP_RESPONSE_CODE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r8 = 10
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r6 = f21789x137c019c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r7 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.GENERIC     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r8 = 11
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                com.smaato.sdk.core.network.NetworkClient$Error[] r6 = com.smaato.sdk.core.network.NetworkClient.Error.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error = r6
                com.smaato.sdk.core.network.NetworkClient$Error r7 = com.smaato.sdk.core.network.NetworkClient.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x009f }
                com.smaato.sdk.core.network.NetworkClient$Error r6 = com.smaato.sdk.core.network.NetworkClient.Error.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x009f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.IO_TOO_MANY_REDIRECTS     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.NO_NETWORK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$NetworkClient$Error     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.smaato.sdk.core.network.NetworkClient$Error r1 = com.smaato.sdk.core.network.NetworkClient.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.api.ErrorMappingUtil.C86191.<clinit>():void");
        }
    }

    static ApiConnectorException mapApiResponseMapperErrorToApiConnectorException(ApiResponseMapper.MappingException mappingException) {
        ApiConnector.Error error;
        int i = C86191.f21789x137c019c[mappingException.type.ordinal()];
        if (i == 1) {
            error = ApiConnector.Error.NO_AD;
        } else if (i != 2) {
            error = ApiConnector.Error.RESPONSE_MAPPING;
        } else {
            error = ApiConnector.Error.BAD_REQUEST;
        }
        return new ApiConnectorException(error, mappingException);
    }
}

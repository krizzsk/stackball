package com.amazon.device.ads;

import android.os.AsyncTask;
import com.amazon.device.ads.WebRequest;

/* compiled from: AdMetricsTasks */
class AdMetricsSubmitAaxTask extends AsyncTask<WebRequest, Void, Void> {
    private static final String LOGTAG = AdMetricsSubmitAaxTask.class.getSimpleName();
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    AdMetricsSubmitAaxTask() {
    }

    public Void doInBackground(WebRequest... webRequestArr) {
        for (WebRequest makeCall : webRequestArr) {
            try {
                makeCall.makeCall();
            } catch (WebRequest.WebRequestException e) {
                int i = C09281.$SwitchMap$com$amazon$device$ads$WebRequest$WebRequestStatus[e.getStatus().ordinal()];
                if (i == 1) {
                    this.logger.mo11020e("Unable to submit metrics for ad due to an Invalid Client Protocol, msg: %s", e.getMessage());
                } else if (i != 2) {
                    if (i == 3) {
                        this.logger.mo11020e("Unable to submit metrics for ad due to a Malformed Pixel URL, msg: %s", e.getMessage());
                    } else if (i != 4) {
                    }
                    this.logger.mo11020e("Unable to submit metrics for ad because of unsupported character encoding, msg: %s", e.getMessage());
                } else {
                    this.logger.mo11020e("Unable to submit metrics for ad due to Network Failure, msg: %s", e.getMessage());
                }
            }
        }
        return null;
    }

    /* renamed from: com.amazon.device.ads.AdMetricsSubmitAaxTask$1 */
    /* compiled from: AdMetricsTasks */
    static /* synthetic */ class C09281 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$WebRequest$WebRequestStatus;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.amazon.device.ads.WebRequest$WebRequestStatus[] r0 = com.amazon.device.ads.WebRequest.WebRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$WebRequest$WebRequestStatus = r0
                com.amazon.device.ads.WebRequest$WebRequestStatus r1 = com.amazon.device.ads.WebRequest.WebRequestStatus.INVALID_CLIENT_PROTOCOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$WebRequest$WebRequestStatus     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.WebRequest$WebRequestStatus r1 = com.amazon.device.ads.WebRequest.WebRequestStatus.NETWORK_FAILURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$WebRequest$WebRequestStatus     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.WebRequest$WebRequestStatus r1 = com.amazon.device.ads.WebRequest.WebRequestStatus.MALFORMED_URL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$WebRequest$WebRequestStatus     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.WebRequest$WebRequestStatus r1 = com.amazon.device.ads.WebRequest.WebRequestStatus.UNSUPPORTED_ENCODING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdMetricsSubmitAaxTask.C09281.<clinit>():void");
        }
    }
}

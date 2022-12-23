package com.amazon.device.ads;

import android.content.ContentResolver;
import android.provider.Settings;
import com.amazon.device.ads.GooglePlayServices;
import com.tapjoy.TapjoyConstants;

public class AmazonFireServicesAdapter {
    public static final int FIREOS_ADTRACKING_NOT_LIMITED = 0;
    private static final String LOGTAG = AmazonFireServicesAdapter.class.getSimpleName();
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    public static AmazonFireServicesAdapter newAdapter() {
        return new AmazonFireServicesAdapter();
    }

    private AmazonFireServicesAdapter() {
    }

    public GooglePlayServices.AdvertisingInfo getAdvertisingIdentifierInfo() {
        try {
            ContentResolver contentResolver = MobileAdsInfoStore.getInstance().getApplicationContext().getContentResolver();
            int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
            String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
            boolean z = true;
            this.logger.mo11027v("Fire Id retrieved : %s", string);
            if (i != 0) {
                this.logger.mo11027v("Fire Device does not allow ad tracking : %s", string);
            } else {
                z = false;
            }
            GooglePlayServices.AdvertisingInfo advertisingInfo = new GooglePlayServices.AdvertisingInfo();
            advertisingInfo.setAdvertisingIdentifier(string);
            advertisingInfo.setLimitAdTrackingEnabled(z);
            return advertisingInfo;
        } catch (Settings.SettingNotFoundException e) {
            MobileAdsLogger mobileAdsLogger = this.logger;
            mobileAdsLogger.mo10941v(" Advertising setting not found on this device : %s" + e.getLocalizedMessage());
            return new GooglePlayServices.AdvertisingInfo();
        } catch (Exception e2) {
            MobileAdsLogger mobileAdsLogger2 = this.logger;
            mobileAdsLogger2.mo10941v(" Attempt to retrieve fireID failed. Reason : %s " + e2.getLocalizedMessage());
            return new GooglePlayServices.AdvertisingInfo();
        }
    }
}

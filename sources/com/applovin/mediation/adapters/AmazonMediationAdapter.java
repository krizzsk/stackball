package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.amazon.device.ads.AdConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdLayout;
import com.amazon.device.ads.AdListener;
import com.amazon.device.ads.AdProperties;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdSize;
import com.amazon.device.ads.AdTargetingOptions;
import com.amazon.device.ads.C0898Ad;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import java.util.concurrent.atomic.AtomicBoolean;

public class AmazonMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter {
    private static final String AMAZON_PRICE_FLOOR_KEY = "ec";
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final String SERVER_PRICE_FLOOR_KEY = "price_floor_micro_usd";
    /* access modifiers changed from: private */
    public AdLayout mAdLayout;

    public String getAdapterVersion() {
        return "6.0.0.0.1";
    }

    public AmazonMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        checkExistence(AdLayout.class, AdListener.class);
        if (INITIALIZED.compareAndSet(false, true)) {
            boolean isTesting = maxAdapterInitializationParameters.isTesting();
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id", (String) null);
            StringBuilder sb = new StringBuilder();
            sb.append("Initializing Amazon SDK");
            sb.append(isTesting ? " in test mode" : "");
            sb.append(" with app id: ");
            sb.append(string);
            sb.append("...");
            log(sb.toString());
            AdRegistration.enableTesting(isTesting);
            AdRegistration.enableLogging(isTesting);
            AdRegistration.setAppKey(string);
            removeUnsupportedGDPRConsent(activity);
            AdRegistration.registerApp(activity);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        return AdRegistration.getVersion();
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        log("Loading " + maxAdFormat.getLabel() + " ad...");
        AdLayout adLayout = new AdLayout((Context) activity, toAdSize(maxAdFormat));
        this.mAdLayout = adLayout;
        adLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.mAdLayout.setListener(new AdListener() {
            public void onAdLoaded(C0898Ad ad, AdProperties adProperties) {
                AmazonMediationAdapter.this.log("AdView loaded");
                maxAdViewAdapterListener.onAdViewAdLoaded(AmazonMediationAdapter.this.mAdLayout);
            }

            public void onAdFailedToLoad(C0898Ad ad, AdError adError) {
                if (adError != null) {
                    AmazonMediationAdapter amazonMediationAdapter = AmazonMediationAdapter.this;
                    amazonMediationAdapter.log("AdView failed to load with error code: " + adError.getCode() + " and message: " + adError.getMessage());
                } else {
                    AmazonMediationAdapter.this.log("AdView failed to load");
                }
                maxAdViewAdapterListener.onAdViewAdLoadFailed(AmazonMediationAdapter.toMaxError(adError));
            }

            public void onAdExpanded(C0898Ad ad) {
                AmazonMediationAdapter.this.log("AdView expanded");
                maxAdViewAdapterListener.onAdViewAdExpanded();
            }

            public void onAdCollapsed(C0898Ad ad) {
                AmazonMediationAdapter.this.log("AdView collapsed");
                maxAdViewAdapterListener.onAdViewAdCollapsed();
            }

            public void onAdDismissed(C0898Ad ad) {
                AmazonMediationAdapter.this.log("AdView hidden");
                maxAdViewAdapterListener.onAdViewAdHidden();
            }
        });
        String string = maxAdapterResponseParameters.getServerParameters().getString(SERVER_PRICE_FLOOR_KEY);
        AdTargetingOptions adTargetingOptions = new AdTargetingOptions();
        if (maxAdapterResponseParameters.getServerParameters().getBoolean("set_price_floor_using_setAdvancedOption", true)) {
            adTargetingOptions.setAdvancedOption(AMAZON_PRICE_FLOOR_KEY, string);
        } else if (!TextUtils.isEmpty(string)) {
            try {
                adTargetingOptions.setFloorPrice(Long.parseLong(string));
            } catch (Throwable unused) {
                log("Invalid price floor: " + string);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            }
        }
        this.mAdLayout.loadAd(adTargetingOptions);
    }

    public void onDestroy() {
        AdLayout adLayout = this.mAdLayout;
        if (adLayout != null) {
            adLayout.destroy();
            this.mAdLayout = null;
        }
    }

    private void removeUnsupportedGDPRConsent(Activity activity) {
        PreferenceManager.getDefaultSharedPreferences(activity).edit().remove(AdConstants.IABCONSENT_SUBJECT_TO_GDPR).remove(AdConstants.IABCONSENT_CONSENT_STRING).apply();
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.SIZE_320x50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.SIZE_728x90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.SIZE_300x250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(AdError adError) {
        MaxAdapterError maxAdapterError;
        if (adError == null) {
            return MaxAdapterError.UNSPECIFIED;
        }
        AdError.ErrorCode code = adError.getCode();
        if (code == AdError.ErrorCode.NETWORK_ERROR) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (code == AdError.ErrorCode.NETWORK_TIMEOUT) {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        } else if (code == AdError.ErrorCode.NO_FILL) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (code == AdError.ErrorCode.INTERNAL_ERROR) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (code == AdError.ErrorCode.REQUEST_ERROR) {
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), code.ordinal(), adError.getMessage());
    }
}

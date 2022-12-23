package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p138a.C5656c;
import com.ironsource.mediationsdk.adunit.p138a.C5657d;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.J */
public final class C5577J extends BaseAdAdapter<C5577J> implements AdapterDebugInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, InterstitialSmashListener {

    /* renamed from: a */
    private AbstractAdapter f13001a;

    /* renamed from: b */
    private NetworkInitializationListener f13002b;

    /* renamed from: c */
    private InterstitialAdListener f13003c;

    /* renamed from: d */
    private NetworkSettings f13004d;

    /* renamed from: e */
    private IronSource.AD_UNIT f13005e;

    /* renamed from: f */
    private C5657d f13006f;

    public C5577J(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f13001a = abstractAdapter;
        this.f13004d = networkSettings;
        this.f13005e = ad_unit;
        this.f13006f = new C5657d(ad_unit, C5657d.C5659b.PROVIDER, (C5656c) null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f13001a.addInterstitialListener(this);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error(m13435a("ad unit not supported - " + this.f13005e));
    }

    /* renamed from: a */
    private String m13435a(String str) {
        String str2 = this.f13005e + ", " + this.f13004d.getProviderInstanceName();
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public final String getAdapterVersion() {
        return this.f13001a.getVersion();
    }

    public final Map<String, Object> getBiddingData(Context context) {
        try {
            if (this.f13005e == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f13001a.getInterstitialBiddingData(this.f13004d.getInterstitialSettings());
            }
            IronLog.INTERNAL.error(m13435a("ad unit not supported - " + this.f13005e));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13435a(str));
            this.f13006f.f13408e.mo41756l(str);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    public final String getNetworkSDKVersion() {
        return this.f13001a.getCoreSDKVersion();
    }

    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f13002b = networkInitializationListener;
        String string = adData.getString(DataKeys.USER_ID);
        try {
            String str = C5556E.m13257a().f12856l;
            if (!TextUtils.isEmpty(str)) {
                this.f13001a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f13001a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13435a(str2));
            this.f13006f.f13408e.mo41756l(str2);
        }
        try {
            if (this.f13005e != IronSource.AD_UNIT.INTERSTITIAL) {
                IronLog.INTERNAL.error("ad unit not supported - " + this.f13005e);
            } else if (TextUtils.isEmpty(adData.getServerData())) {
                this.f13001a.initInterstitial("", string, this.f13004d.getInterstitialSettings(), this);
            } else {
                this.f13001a.initInterstitialForBidding("", string, this.f13004d.getInterstitialSettings(), this);
            }
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(m13435a(str3));
            this.f13006f.f13408e.mo41756l(str3);
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
        }
    }

    public final boolean isAdAvailable(AdData adData) {
        try {
            if (this.f13005e == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f13001a.isInterstitialReady(this.f13004d.getInterstitialSettings());
            }
            IronLog.INTERNAL.error(m13435a("ad unit not supported - " + this.f13005e));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13435a(str));
            this.f13006f.f13408e.mo41756l(str);
            return false;
        }
    }

    public final void loadAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        this.f13003c = interstitialAdListener;
        try {
            if (this.f13005e != IronSource.AD_UNIT.INTERSTITIAL) {
                IronLog.INTERNAL.error(m13435a("ad unit not supported - " + this.f13005e));
            } else if (TextUtils.isEmpty(adData.getServerData())) {
                this.f13001a.loadInterstitial(this.f13004d.getInterstitialSettings(), this);
            } else {
                this.f13001a.loadInterstitialForBidding(this.f13004d.getInterstitialSettings(), this, adData.getServerData());
            }
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13435a(str));
            this.f13006f.f13408e.mo41756l(str);
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
        }
    }

    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m13435a(""));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdClicked();
        }
    }

    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m13435a(""));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdClosed();
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m13435a("error = " + ironSourceError));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            boolean z = false;
            if (this.f13005e != IronSource.AD_UNIT.INTERSTITIAL) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error(m13435a("ad unit not supported - " + this.f13005e));
            } else if (ironSourceError.getErrorCode() == 1158) {
                z = true;
            }
            interstitialAdListener.onAdLoadFailed(z ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m13435a(""));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdOpened();
        }
    }

    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(m13435a(""));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdLoadSuccess();
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m13435a("error = " + ironSourceError));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(m13435a(""));
        InterstitialAdListener interstitialAdListener = this.f13003c;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdShowSuccess();
        }
    }

    public final void onInterstitialAdVisible() {
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m13435a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f13002b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m13435a(""));
        NetworkInitializationListener networkInitializationListener = this.f13002b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void setAdapterDebug(boolean z) {
        this.f13001a.setAdapterDebug(Boolean.valueOf(z));
    }

    public final void setConsent(boolean z) {
        this.f13001a.setConsent(z);
    }

    public final void showAd(AdData adData, InterstitialAdListener interstitialAdListener) {
        this.f13003c = interstitialAdListener;
        try {
            if (this.f13005e == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f13001a.showInterstitial(this.f13004d.getInterstitialSettings(), this);
                return;
            }
            IronLog.INTERNAL.error(m13435a("ad unit not supported - " + this.f13005e));
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13435a(str));
            this.f13006f.f13408e.mo41756l(str);
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
        }
    }
}

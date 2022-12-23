package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.ironsource.mediationsdk.C5685c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;

public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface> {
    private final IronSource.AD_UNIT mAdUnit;
    private final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings) {
        this.mAdUnit = ad_unit;
        this.mNetworkSettings = networkSettings;
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter a = C5685c.m13965a().mo41825a(this.mNetworkSettings, this.mAdUnit);
        if (a != null) {
            return a;
        }
        return null;
    }

    public abstract boolean isAdAvailable(AdData adData);

    public abstract void loadAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener);

    public abstract void showAd(AdData adData, InterstitialAdListener interstitialAdListener);
}

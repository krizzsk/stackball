package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;

public abstract class BaseInterstitial<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter> {
    public BaseInterstitial(NetworkSettings networkSettings) {
        super(IronSource.AD_UNIT.INTERSTITIAL, networkSettings);
    }
}

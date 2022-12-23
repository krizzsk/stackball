package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import java.util.List;

public abstract class BaseAdapter implements AdapterDebugInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterMetaDataInterface {
    public void setAdapterDebug(boolean z) {
    }

    public void setConsent(boolean z) {
    }

    public void setMetaData(String str, List<String> list) {
    }
}

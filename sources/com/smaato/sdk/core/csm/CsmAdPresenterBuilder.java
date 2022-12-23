package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import java.util.Map;

public interface CsmAdPresenterBuilder extends AdPresenterBuilder {

    public interface Listener {
        void onCallPassbackUrl(String str);
    }

    void setListener(Listener listener);

    void setObjectExtras(Map<String, Object> map);
}

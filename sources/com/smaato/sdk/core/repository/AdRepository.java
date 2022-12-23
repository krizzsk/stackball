package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.p248ad.AdLoaderException;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdRequest;
import com.smaato.sdk.flow.Flow;
import java.util.Map;

public interface AdRepository {

    public interface Listener {
        void onAdLoadError(AdTypeStrategy adTypeStrategy, AdLoaderException adLoaderException);

        void onAdLoadSuccess(AdTypeStrategy adTypeStrategy, AdPresenter adPresenter);
    }

    Flow<AdPresenter> loadAd(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Map<String, Object> map);

    void loadAd(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Listener listener, Map<String, Object> map);
}

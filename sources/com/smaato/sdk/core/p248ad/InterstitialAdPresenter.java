package com.smaato.sdk.core.p248ad;

import android.view.View;
import com.smaato.sdk.core.p248ad.AdPresenter;

/* renamed from: com.smaato.sdk.core.ad.InterstitialAdPresenter */
public interface InterstitialAdPresenter extends AdPresenter {

    /* renamed from: com.smaato.sdk.core.ad.InterstitialAdPresenter$Listener */
    public interface Listener extends AdPresenter.Listener<InterstitialAdPresenter> {
        void onAdUnload(InterstitialAdPresenter interstitialAdPresenter);

        void onClose(InterstitialAdPresenter interstitialAdPresenter);

        void onShowCloseButton();
    }

    void onCloseClicked();

    void setFriendlyObstructionView(View view);

    void setListener(Listener listener);
}

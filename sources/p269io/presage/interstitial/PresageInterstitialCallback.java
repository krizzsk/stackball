package p269io.presage.interstitial;

@Deprecated
/* renamed from: io.presage.interstitial.PresageInterstitialCallback */
public interface PresageInterstitialCallback {
    void onAdAvailable();

    void onAdClosed();

    void onAdDisplayed();

    void onAdError(int i);

    void onAdLoaded();

    void onAdNotAvailable();

    void onAdNotLoaded();
}

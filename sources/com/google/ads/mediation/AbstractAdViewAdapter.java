package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzub;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzxl;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzbgz {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzlw;
    private InterstitialAd zzlx;
    private AdLoader zzly;
    private Context zzlz;
    /* access modifiers changed from: private */
    public InterstitialAd zzma;
    /* access modifiers changed from: private */
    public MediationRewardedVideoAdListener zzmb;
    private final RewardedVideoAdListener zzmc = new zzb(this);

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzvj.zzpr();
            builder.addTestDevice(zzazm.zzbk(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zzc extends AdListener implements AppEventListener, zzub {
        private final AbstractAdViewAdapter zzmg;
        private final MediationBannerListener zzmh;

        public zzc(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.zzmg = abstractAdViewAdapter;
            this.zzmh = mediationBannerListener;
        }

        public final void onAdLoaded() {
            this.zzmh.onAdLoaded(this.zzmg);
        }

        public final void onAdFailedToLoad(int i) {
            this.zzmh.onAdFailedToLoad(this.zzmg, i);
        }

        public final void onAdOpened() {
            this.zzmh.onAdOpened(this.zzmg);
        }

        public final void onAdClosed() {
            this.zzmh.onAdClosed(this.zzmg);
        }

        public final void onAdLeftApplication() {
            this.zzmh.onAdLeftApplication(this.zzmg);
        }

        public final void onAdClicked() {
            this.zzmh.onAdClicked(this.zzmg);
        }

        public final void onAppEvent(String str, String str2) {
            this.zzmh.zza(this.zzmg, str, str2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zzf extends AdListener implements zzub {
        private final AbstractAdViewAdapter zzmg;
        private final MediationInterstitialListener zzmk;

        public zzf(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzmg = abstractAdViewAdapter;
            this.zzmk = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            this.zzmk.onAdLoaded(this.zzmg);
        }

        public final void onAdFailedToLoad(int i) {
            this.zzmk.onAdFailedToLoad(this.zzmg, i);
        }

        public final void onAdOpened() {
            this.zzmk.onAdOpened(this.zzmg);
        }

        public final void onAdClosed() {
            this.zzmk.onAdClosed(this.zzmg);
        }

        public final void onAdLeftApplication() {
            this.zzmk.onAdLeftApplication(this.zzmg);
        }

        public final void onAdClicked() {
            this.zzmk.onAdClicked(this.zzmg);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zze extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        private final AbstractAdViewAdapter zzmg;
        private final MediationNativeListener zzmj;

        public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.zzmg = abstractAdViewAdapter;
            this.zzmj = mediationNativeListener;
        }

        public final void onAdLoaded() {
        }

        public final void onAdFailedToLoad(int i) {
            this.zzmj.onAdFailedToLoad(this.zzmg, i);
        }

        public final void onAdOpened() {
            this.zzmj.onAdOpened(this.zzmg);
        }

        public final void onAdClosed() {
            this.zzmj.onAdClosed(this.zzmg);
        }

        public final void onAdLeftApplication() {
            this.zzmj.onAdLeftApplication(this.zzmg);
        }

        public final void onAdClicked() {
            this.zzmj.onAdClicked(this.zzmg);
        }

        public final void onAdImpression() {
            this.zzmj.onAdImpression(this.zzmg);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.zzmj.onAdLoaded((MediationNativeAdapter) this.zzmg, (NativeAdMapper) new zzb(nativeAppInstallAd));
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.zzmj.onAdLoaded((MediationNativeAdapter) this.zzmg, (UnifiedNativeAdMapper) new zzd(unifiedNativeAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.zzmj.onAdLoaded((MediationNativeAdapter) this.zzmg, (NativeAdMapper) new zza(nativeContentAd));
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.zzmj.zza(this.zzmg, nativeCustomTemplateAd);
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.zzmj.zza(this.zzmg, nativeCustomTemplateAd, str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static class zza extends NativeContentAdMapper {
        private final NativeContentAd zzme;

        public zza(NativeContentAd nativeContentAd) {
            this.zzme = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzme);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzblg.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.zzme);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static class zzd extends UnifiedNativeAdMapper {
        private final UnifiedNativeAd zzmi;

        public zzd(UnifiedNativeAd unifiedNativeAd) {
            this.zzmi = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzn(unifiedNativeAd.zzjv());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.zzmi);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzblg.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmi);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static class zzb extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd zzmf;

        public zzb(NativeAppInstallAd nativeAppInstallAd) {
            this.zzmf = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzmf);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzblg.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.zzmf);
            }
        }
    }

    public void onDestroy() {
        AdView adView = this.zzlw;
        if (adView != null) {
            adView.destroy();
            this.zzlw = null;
        }
        if (this.zzlx != null) {
            this.zzlx = null;
        }
        if (this.zzly != null) {
            this.zzly = null;
        }
        if (this.zzma != null) {
            this.zzma = null;
        }
    }

    public void onPause() {
        AdView adView = this.zzlw;
        if (adView != null) {
            adView.pause();
        }
    }

    public void onResume() {
        AdView adView = this.zzlw;
        if (adView != null) {
            adView.resume();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzlw = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzlw.setAdUnitId(getAdUnitId(bundle));
        this.zzlw.setAdListener(new zzc(this, mediationBannerListener));
        this.zzlw.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public View getBannerView() {
        return this.zzlw;
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzlx = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzlx.setAdListener(new zzf(this, mediationInterstitialListener));
        this.zzlx.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzlx;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzma;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    public zzxl getVideoController() {
        VideoController videoController;
        AdView adView = this.zzlw;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdu();
    }

    public void showInterstitial() {
        this.zzlx.show();
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdo(1).zzact();
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zze zze2 = new zze(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(zze2);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(zze2);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(zze2);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(zze2);
        }
        if (nativeMediationAdRequest.zztw()) {
            for (String next : nativeMediationAdRequest.zztx().keySet()) {
                withAdListener.forCustomTemplateAd(next, zze2, nativeMediationAdRequest.zztx().get(next).booleanValue() ? zze2 : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzly = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzlz = context.getApplicationContext();
        this.zzmb = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzlz;
        if (context == null || this.zzmb == null) {
            zzazw.zzfa("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzma = interstitialAd;
        interstitialAd.zzd(true);
        this.zzma.setAdUnitId(getAdUnitId(bundle));
        this.zzma.setRewardedVideoAdListener(this.zzmc);
        this.zzma.setAdMetadataListener(new zza(this));
        this.zzma.loadAd(zza(this.zzlz, mediationAdRequest, bundle2, bundle));
    }

    public void showVideo() {
        this.zzma.show();
    }

    public boolean isInitialized() {
        return this.zzmb != null;
    }
}

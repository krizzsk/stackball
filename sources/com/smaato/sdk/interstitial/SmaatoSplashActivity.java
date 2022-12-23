package com.smaato.sdk.interstitial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;

public abstract class SmaatoSplashActivity extends Activity {
    EventListener splashActivityEventListener = new EventListener() {
        InterstitialAd interstitialAd;

        public final void onAdLoaded(InterstitialAd interstitialAd2) {
            this.interstitialAd = interstitialAd2;
            SmaatoSplashActivity.this.findViewById(C8759R.C8761id.smaato_sdk_interstitial_loading).setVisibility(8);
            interstitialAd2.showAdInternal(SmaatoSplashActivity.this, true);
        }

        public final void onAdFailedToLoad(InterstitialRequestError interstitialRequestError) {
            SmaatoSplashActivity.this.findViewById(C8759R.C8761id.smaato_sdk_interstitial_loading).setVisibility(8);
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdFailedToLoad(InterstitialRequestError.this);
                }
            });
            SmaatoSplashActivity.access$000(SmaatoSplashActivity.this);
        }

        public final void onAdError(InterstitialAd interstitialAd2, InterstitialError interstitialError) {
            SmaatoSplashActivity.this.findViewById(C8759R.C8761id.smaato_sdk_interstitial_loading).setVisibility(8);
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer(interstitialError) {
                public final /* synthetic */ InterstitialError f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((EventListener) obj).onAdError(InterstitialAd.this, this.f$1);
                }
            });
            SmaatoSplashActivity.access$000(SmaatoSplashActivity.this);
        }

        public final void onAdOpened(InterstitialAd interstitialAd2) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdOpened(InterstitialAd.this);
                }
            });
        }

        public final void onAdClosed(InterstitialAd interstitialAd2) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdClosed(InterstitialAd.this);
                }
            });
            SmaatoSplashActivity.access$000(SmaatoSplashActivity.this);
        }

        public final void onAdClicked(InterstitialAd interstitialAd2) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdClicked(InterstitialAd.this);
                }
            });
        }

        public final void onAdImpression(InterstitialAd interstitialAd2) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdImpression(InterstitialAd.this);
                }
            });
        }

        public final void onAdTTLExpired(InterstitialAd interstitialAd2) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdTTLExpired(InterstitialAd.this);
                }
            });
        }
    };

    /* access modifiers changed from: protected */
    public abstract String getAdSpaceId();

    /* access modifiers changed from: protected */
    public EventListener getEventListener() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Class<? extends Activity> getNextActivity();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8759R.layout.smaato_sdk_interstitial_splash_activity);
        findViewById(C8759R.C8761id.smaato_sdk_interstitial_loading).setVisibility(0);
        Interstitial.loadAd(getAdSpaceId(), this.splashActivityEventListener);
    }

    static /* synthetic */ void access$000(SmaatoSplashActivity smaatoSplashActivity) {
        smaatoSplashActivity.startActivity(new Intent(smaatoSplashActivity, smaatoSplashActivity.getNextActivity()));
        smaatoSplashActivity.finish();
    }
}

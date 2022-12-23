package com.smaato.sdk.interstitial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.core.view.ViewCompat;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.interstitial.AdEvent;
import com.smaato.sdk.interstitial.InterstitialAdActivity;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class InterstitialAdActivity extends Activity {
    private static final String KEY_BACKGROUND_COLOR = "KEY_BACKGROUND_COLOR";
    private static final String KEY_INTERSTITIAL_IDENTIFIER = "KEY_INTERSTITIAL_IDENTIFIER";
    private static final String KEY_IS_SPLASH = "KEY_IS_SPLASH";
    private static final String KEY_PRESENTER_UUID = "KEY_PRESENTER_UUID";
    /* access modifiers changed from: private */
    public static final String LOG_TAG = InterstitialAdActivity.class.getName();
    private static final long SPLASH_DELAY_CLOSE_AD_MS = 5000;
    private static final long SPLASH_DELAY_SHOW_CLOSE_BUTTON_MS = 3000;
    private InterstitialAdPresenter adPresenter;
    private final TimerTask closeAdTask = new TimerTask() {
        public /* synthetic */ void lambda$run$0$InterstitialAdActivity$2() {
            InterstitialAdActivity.this.onClose();
        }

        public final void run() {
            InterstitialAdActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialAdActivity.C87522.this.lambda$run$0$InterstitialAdActivity$2();
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public ImageButton closeButton;
    /* access modifiers changed from: private */
    public FrameLayout contentHolder;
    @Inject
    private InterstitialAdPresenterStorage interstitialAdPresenterStorage;
    /* access modifiers changed from: private */
    @Inject
    public InterstitialEventsCache interstitialEventsCache;
    private String interstitialKey;
    /* access modifiers changed from: private */
    public boolean isBackButtonEnabled;
    private boolean isSplash;
    private InterstitialAdPresenter.Listener listener;
    private UUID presenterUuid;
    private final TimerTask showCloseButtonTask = new TimerTask() {
        public /* synthetic */ void lambda$run$1$InterstitialAdActivity$1() {
            Objects.onNotNull(InterstitialAdActivity.this.closeButton, $$Lambda$InterstitialAdActivity$1$pCZgeRxSKz_xvA_Kzgg4SKdtErY.INSTANCE);
        }

        public final void run() {
            InterstitialAdActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialAdActivity.C87511.this.lambda$run$1$InterstitialAdActivity$1();
                }
            });
        }
    };
    private boolean splashTimersAreStarted = false;

    public static Intent createIntent(Activity activity, UUID uuid, String str, int i, boolean z) {
        Objects.requireNonNull(activity);
        Objects.requireNonNull(uuid);
        Objects.requireNonNull(str);
        return new Intent(activity, InterstitialAdActivity.class).putExtra(KEY_PRESENTER_UUID, uuid).putExtra(KEY_INTERSTITIAL_IDENTIFIER, str).putExtra(KEY_BACKGROUND_COLOR, i).putExtra(KEY_IS_SPLASH, z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AndroidsInjector.inject((Activity) this);
        if (this.interstitialAdPresenterStorage == null || this.interstitialEventsCache == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized.");
            finish();
            return;
        }
        this.presenterUuid = (UUID) getIntent().getSerializableExtra(KEY_PRESENTER_UUID);
        this.interstitialKey = getIntent().getStringExtra(KEY_INTERSTITIAL_IDENTIFIER);
        this.adPresenter = this.interstitialAdPresenterStorage.getAdPresenter(this.presenterUuid);
        this.isSplash = getIntent().getBooleanExtra(KEY_IS_SPLASH, false);
        if (this.adPresenter == null) {
            finish();
            this.interstitialEventsCache.notifyEvent(this.interstitialKey, new AdEvent(AdEvent.Type.ERROR, InterstitialError.INTERNAL_ERROR));
            return;
        }
        InterstitialAdPresenter.Listener listener2 = setupListener(this.interstitialKey);
        this.listener = listener2;
        this.adPresenter.setListener(listener2);
        initView(this.adPresenter.getAdContentView(this));
        this.interstitialEventsCache.notifyEvent(this.interstitialKey, AdEvent.Type.OPEN);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.isSplash && !this.splashTimersAreStarted) {
            startTimers();
        }
    }

    private InterstitialAdPresenter.Listener setupListener(final String str) {
        return new InterstitialAdPresenter.Listener() {
            public final /* bridge */ /* synthetic */ void onTTLExpired(AdPresenter adPresenter) {
            }

            public final void onClose(InterstitialAdPresenter interstitialAdPresenter) {
                Objects.onNotNull(InterstitialAdActivity.this.interstitialEventsCache, new Consumer(str) {
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        ((InterstitialEventsCache) obj).notifyEvent(this.f$0, AdEvent.Type.CLOSE);
                    }
                });
                InterstitialAdActivity.this.finish();
            }

            public final void onShowCloseButton() {
                InterstitialAdActivity.this.closeButton.setVisibility(0);
                boolean unused = InterstitialAdActivity.this.isBackButtonEnabled = true;
            }

            public final void onAdUnload(InterstitialAdPresenter interstitialAdPresenter) {
                Log.i(InterstitialAdActivity.LOG_TAG, "Ad requested to be unloaded.");
                Objects.onNotNull(InterstitialAdActivity.this.interstitialEventsCache, new Consumer(str) {
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        ((InterstitialEventsCache) obj).notifyEvent(this.f$0, new AdEvent(AdEvent.Type.ERROR, InterstitialError.AD_UNLOADED));
                    }
                });
                InterstitialAdActivity.this.finish();
            }

            public final /* bridge */ /* synthetic */ void onAdError(AdPresenter adPresenter) {
                Objects.onNotNull(InterstitialAdActivity.this.interstitialEventsCache, new Consumer(str) {
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        ((InterstitialEventsCache) obj).notifyEvent(this.f$0, new AdEvent(AdEvent.Type.ERROR, InterstitialError.INTERNAL_ERROR));
                    }
                });
            }

            public final /* bridge */ /* synthetic */ void onAdClicked(AdPresenter adPresenter) {
                Objects.onNotNull(InterstitialAdActivity.this.interstitialEventsCache, new Consumer(str) {
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        ((InterstitialEventsCache) obj).notifyEvent(this.f$0, AdEvent.Type.CLICK);
                    }
                });
            }

            public final /* bridge */ /* synthetic */ void onAdImpressed(AdPresenter adPresenter) {
                Objects.onNotNull(InterstitialAdActivity.this.interstitialEventsCache, new Consumer(str) {
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        ((InterstitialEventsCache) obj).notifyEvent(this.f$0, AdEvent.Type.IMPRESS);
                    }
                });
            }
        };
    }

    private void initView(final AdContentView adContentView) {
        if (requireNonNullAdContentView(adContentView)) {
            setContentView(C8759R.layout.smaato_sdk_interstitial_activity);
            this.closeButton = (ImageButton) findViewById(C8759R.C8761id.smaato_sdk_interstitial_close);
            Objects.onNotNull(this.adPresenter, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialAdActivity.this.lambda$initView$0$InterstitialAdActivity((InterstitialAdPresenter) obj);
                }
            });
            findViewById(16908290).setBackgroundColor(getIntent().getIntExtra(KEY_BACKGROUND_COLOR, ViewCompat.MEASURED_STATE_MASK));
            FrameLayout frameLayout = (FrameLayout) findViewById(C8759R.C8761id.smaato_sdk_interstitial_content);
            this.contentHolder = frameLayout;
            frameLayout.addView(adContentView);
            this.closeButton.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    InterstitialAdActivity.this.lambda$initView$1$InterstitialAdActivity(view);
                }
            });
            this.contentHolder.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    InterstitialAdActivity.this.contentHolder.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (InterstitialAdActivity.this.requireNonNullAdContentView(adContentView)) {
                        InterstitialAdActivity interstitialAdActivity = InterstitialAdActivity.this;
                        float access$700 = interstitialAdActivity.defineScaleFactor(interstitialAdActivity.contentHolder, adContentView);
                        if (Float.isNaN(access$700)) {
                            access$700 = 1.0f;
                        }
                        adContentView.setScaleX(access$700);
                        adContentView.setScaleY(access$700);
                    }
                }
            });
        }
    }

    public /* synthetic */ void lambda$initView$0$InterstitialAdActivity(InterstitialAdPresenter interstitialAdPresenter) {
        interstitialAdPresenter.setFriendlyObstructionView(this.closeButton);
    }

    public /* synthetic */ void lambda$initView$1$InterstitialAdActivity(View view) {
        onClose();
    }

    /* access modifiers changed from: private */
    public boolean requireNonNullAdContentView(AdContentView adContentView) {
        if (adContentView != null) {
            return true;
        }
        Objects.onNotNull(this.interstitialEventsCache, new Consumer() {
            public final void accept(Object obj) {
                InterstitialAdActivity.this.lambda$requireNonNullAdContentView$2$InterstitialAdActivity((InterstitialEventsCache) obj);
            }
        });
        finish();
        return false;
    }

    public /* synthetic */ void lambda$requireNonNullAdContentView$2$InterstitialAdActivity(InterstitialEventsCache interstitialEventsCache2) {
        interstitialEventsCache2.notifyEvent(this.interstitialKey, new AdEvent(AdEvent.Type.ERROR, InterstitialError.INTERNAL_ERROR));
    }

    /* access modifiers changed from: private */
    public float defineScaleFactor(FrameLayout frameLayout, AdContentView adContentView) {
        return Math.min(((float) frameLayout.getWidth()) / ((float) adContentView.getWidth()), ((float) frameLayout.getHeight()) / ((float) adContentView.getHeight()));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Objects.onNotNull(this.interstitialAdPresenterStorage, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialAdActivity.this.lambda$onDestroy$3$InterstitialAdActivity((InterstitialAdPresenterStorage) obj);
                }
            });
            Objects.onNotNull(this.adPresenter, $$Lambda$BKAgaEbF6EgLc9UoekMxWFH84UY.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$onDestroy$3$InterstitialAdActivity(InterstitialAdPresenterStorage interstitialAdPresenterStorage2) {
        interstitialAdPresenterStorage2.removeAdPresenter(this.presenterUuid);
    }

    public void onBackPressed() {
        if (this.isBackButtonEnabled) {
            super.onBackPressed();
            onClose();
        }
    }

    private void startTimers() {
        new Timer().schedule(this.showCloseButtonTask, SPLASH_DELAY_SHOW_CLOSE_BUTTON_MS);
        new Timer().schedule(this.closeAdTask, 5000);
        this.splashTimersAreStarted = true;
    }

    /* access modifiers changed from: private */
    public void onClose() {
        Objects.onNotNull(this.adPresenter, $$Lambda$txm5DTbYXLiKFmFQmU_1Fi3AAck.INSTANCE);
    }
}

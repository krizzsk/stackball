package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.j */
public final class C5754j implements InterstitialListener, RewardedVideoListener, SegmentListener, C5751g {

    /* renamed from: a */
    public RewardedVideoListener f13833a;

    /* renamed from: b */
    public InterstitialListener f13834b;

    /* renamed from: c */
    public OfferwallListener f13835c;

    /* renamed from: d */
    public SegmentListener f13836d;

    /* renamed from: e */
    public InterstitialPlacement f13837e = null;

    /* renamed from: f */
    public String f13838f = null;

    /* renamed from: g */
    private C5776a f13839g;

    /* renamed from: h */
    private long f13840h;

    /* renamed from: com.ironsource.mediationsdk.sdk.j$a */
    class C5776a extends Thread {

        /* renamed from: a */
        Handler f13872a;

        private C5776a() {
        }

        /* synthetic */ C5776a(C5754j jVar, byte b) {
            this();
        }

        public final void run() {
            Looper.prepare();
            this.f13872a = new Handler();
            Looper.loop();
        }
    }

    public C5754j() {
        C5776a aVar = new C5776a(this, (byte) 0);
        this.f13839g = aVar;
        aVar.start();
        this.f13840h = new Date().getTime();
    }

    /* renamed from: a */
    private void m14227a(Runnable runnable) {
        Handler handler;
        C5776a aVar = this.f13839g;
        if (aVar != null && (handler = aVar.f13872a) != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    private boolean m14228a(Object obj) {
        return (obj == null || this.f13839g == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo42056a(final IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f13838f)) {
                mediationAdditionalData.put("placement", this.f13838f);
            }
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5645g.m13810e().mo41689b(new C5641c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdShowFailed(ironSourceError);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo41509a(final boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5645g.m13810e().mo41689b(new C5641c(302, mediationAdditionalData));
        if (m14228a((Object) this.f13835c)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13835c.onOfferwallAvailable(z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42057a(final boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.f13840h;
        this.f13840h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("duration", time);
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5645g.m13810e().mo41689b(new C5641c(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAvailabilityChanged(z);
                }
            });
        }
    }

    public final void onGetOfferwallCreditsFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (m14228a((Object) this.f13835c)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13835c.onGetOfferwallCreditsFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdClicked();
                }
            });
        }
    }

    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdClosed();
                }
            });
        }
    }

    public final void onInterstitialAdLoadFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdLoadFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdOpened();
                }
            });
        }
    }

    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdReady();
                }
            });
        }
    }

    public final void onInterstitialAdShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            if (this.f13837e != null && !TextUtils.isEmpty(this.f13837e.getPlacementName())) {
                mediationAdditionalData.put("placement", this.f13837e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5642d.m13798e().mo41689b(new C5641c(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (m14228a((Object) this.f13834b)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13834b.onInterstitialAdShowSucceeded();
                }
            });
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.f13835c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo41509a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (m14228a((Object) this.f13835c)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13835c.onOfferwallClosed();
                }
            });
        }
    }

    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (m14228a((Object) this.f13835c)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13835c.onOfferwallOpened();
                }
            });
        }
    }

    public final void onOfferwallShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (m14228a((Object) this.f13835c)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13835c.onOfferwallShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onRewardedVideoAdClicked(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdClicked(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdClosed();
                }
            });
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdEnded();
                }
            });
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdOpened();
                }
            });
        }
    }

    public final void onRewardedVideoAdRewarded(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdRewarded(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo42056a(ironSourceError, (Map<String, Object>) null);
    }

    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (m14228a((Object) this.f13833a)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    C5754j.this.f13833a.onRewardedVideoAdStarted();
                }
            });
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        mo42057a(z, (Map<String, Object>) null);
    }

    public final void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (m14228a((Object) this.f13836d)) {
            m14227a((Runnable) new Runnable() {
                public final void run() {
                    if (!TextUtils.isEmpty(str)) {
                        C5754j.this.f13836d.onSegmentReceived(str);
                    }
                }
            });
        }
    }
}

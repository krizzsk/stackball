package com.ironsource.adapters.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.appevents.AppEventsConstants;
import com.ironsource.adapters.supersonicads.SupersonicConfig;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C5556E;
import com.ironsource.mediationsdk.C5690e;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C5751g;
import com.ironsource.mediationsdk.sdk.C5777k;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.C5820a;
import com.ironsource.sdk.C5829b;
import com.ironsource.sdk.C5836c;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.p145c.C5837a;
import com.ironsource.sdk.p150g.C6014e;
import com.ironsource.sdk.p153j.C6030b;
import com.ironsource.sdk.p153j.C6031c;
import com.ironsource.sdk.p153j.C6032d;
import com.ironsource.sdk.p153j.C6033e;
import com.ironsource.sdk.utils.SDKUtils;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.C5504a, C5777k, C6033e {
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "7.1.10.1";
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static String mediationSegment;
    private final String ADM_KEY = "adm";
    private final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String CUSTOM_SEGMENT = "custom_Segment";
    private final String DEMAND_SOURCE_NAME = "demandSourceName";
    private final String DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String IN_APP_BIDDING_KEY = "inAppBidding";
    private final String IN_APP_BIDDING_VALUE = "true";
    private final String LWS_SUPPORT_STATE = "isSupportedLWS";
    private final String OW_CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String OW_PLACEMENT_ID = ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE = "SDKPluginType";
    private final String SESSION_ID = "sessionid";
    /* access modifiers changed from: private */
    public C5837a mBannerAdContainer = null;
    private final ConcurrentHashMap<String, BannerSmashListener> mDemandSourceToBNSmash;
    private ConcurrentHashMap<String, C5829b> mDemandSourceToISAd;
    private ConcurrentHashMap<String, InterstitialSmashListener> mDemandSourceToISSmash;
    private ConcurrentHashMap<String, C5829b> mDemandSourceToRvAd;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mDemandSourceToRvSmash;
    /* access modifiers changed from: private */
    public C5751g mOfferwallListener;

    class IronSourceBannerListener implements C6030b {
        private final String mDemandSourceName;
        private final BannerSmashListener mListener;

        IronSourceBannerListener(BannerSmashListener bannerSmashListener, String str) {
            this.mDemandSourceName = str;
            this.mListener = bannerSmashListener;
        }

        public void onBannerClick() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " bannerListener");
            this.mListener.onBannerAdClicked();
        }

        public void onBannerInitFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " bannerListener");
            this.mListener.onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, str));
        }

        public void onBannerInitSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " bannerListener");
            this.mListener.onBannerInitSuccess();
        }

        public void onBannerLoadFail(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " bannerListener");
            BannerSmashListener bannerSmashListener = this.mListener;
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(IronSourceAdapter.this.getProviderName() + " load failed - error = " + str));
        }

        public void onBannerLoadSuccess(C5837a aVar) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " bannerListener");
            if (aVar == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(IronSourceAdapter.this.getProviderName()));
                return;
            }
            C5837a unused = IronSourceAdapter.this.mBannerAdContainer = aVar;
            C5820a aVar2 = aVar.f14214a != null ? aVar.f14214a.f14225d : new C5820a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar2.f14148a, aVar2.f14149b);
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(aVar, layoutParams);
        }

        public void onBannerShowSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " onBannerShowSuccess");
            BannerSmashListener bannerSmashListener = this.mListener;
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerAdShown();
            }
        }
    }

    class IronSourceInterstitialListener implements C6031c {
        private final String mDemandSourceName;
        private final InterstitialSmashListener mListener;

        IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
            this.mDemandSourceName = str;
            this.mListener = interstitialSmashListener;
        }

        public void onInterstitialAdRewarded(String str, int i) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i);
        }

        public void onInterstitialClick() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
            this.mListener.onInterstitialAdClicked();
        }

        public void onInterstitialClose() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
            this.mListener.onInterstitialAdClosed();
        }

        public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str)) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
                if ("impressions".equals(str)) {
                    this.mListener.onInterstitialAdVisible();
                }
            }
        }

        public void onInterstitialInitFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        }

        public void onInterstitialInitSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        }

        public void onInterstitialLoadFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener " + str);
            this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        }

        public void onInterstitialLoadSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
            this.mListener.onInterstitialAdReady();
        }

        public void onInterstitialOpen() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
            this.mListener.onInterstitialAdOpened();
        }

        public void onInterstitialShowFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener " + str);
            this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, str));
        }

        public void onInterstitialShowSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener");
            this.mListener.onInterstitialAdShowSucceeded();
        }
    }

    class IronSourceRewardedVideoListener implements C6031c {
        private final String mDemandSourceName;
        boolean mIsRvDemandOnly;
        RewardedVideoSmashListener mListener;

        IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
            this.mDemandSourceName = str;
            this.mListener = rewardedVideoSmashListener;
            this.mIsRvDemandOnly = false;
        }

        IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z) {
            this.mDemandSourceName = str;
            this.mListener = rewardedVideoSmashListener;
            this.mIsRvDemandOnly = z;
        }

        public void onInterstitialAdRewarded(String str, int i) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i);
            this.mListener.onRewardedVideoAdRewarded();
        }

        public void onInterstitialClick() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
            this.mListener.onRewardedVideoAdClicked();
        }

        public void onInterstitialClose() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
            this.mListener.onRewardedVideoAdClosed();
        }

        public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str)) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
                if ("impressions".equals(str)) {
                    this.mListener.onRewardedVideoAdVisible();
                }
            }
        }

        public void onInterstitialInitFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        }

        public void onInterstitialInitSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        }

        public void onInterstitialLoadFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
            this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
            if (!this.mIsRvDemandOnly) {
                this.mListener.onRewardedVideoAvailabilityChanged(false);
            }
        }

        public void onInterstitialLoadSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
            if (this.mIsRvDemandOnly) {
                this.mListener.onRewardedVideoLoadSuccess();
            } else {
                this.mListener.onRewardedVideoAvailabilityChanged(true);
            }
        }

        public void onInterstitialOpen() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
            this.mListener.onRewardedVideoAdOpened();
        }

        public void onInterstitialShowFailed(String str) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
            this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
        }

        public void onInterstitialShowSuccess() {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
            if (!this.mIsRvDemandOnly) {
                this.mListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    private IronSourceAdapter(String str) {
        super(str);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str + ": new instance");
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToRvSmash = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISSmash = new ConcurrentHashMap<>();
        this.mDemandSourceToBNSmash = new ConcurrentHashMap<>();
        mediationSegment = null;
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        if (r10 != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ironsource.sdk.C5820a convertBannerSize(android.app.Activity r9, com.ironsource.mediationsdk.ISBannerSize r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.getDescription()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -387072689: goto L_0x0037;
                case 72205083: goto L_0x002d;
                case 79011241: goto L_0x0023;
                case 1951953708: goto L_0x0019;
                case 1999208305: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0041
        L_0x000f:
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0041
            r1 = 3
            goto L_0x0042
        L_0x0019:
            java.lang.String r1 = "BANNER"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0041
            r1 = 0
            goto L_0x0042
        L_0x0023:
            java.lang.String r1 = "SMART"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0041
            r1 = 2
            goto L_0x0042
        L_0x002d:
            java.lang.String r1 = "LARGE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0037:
            java.lang.String r1 = "RECTANGLE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = -1
        L_0x0042:
            r5 = 90
            r6 = 50
            r7 = 320(0x140, float:4.48E-43)
            if (r1 == 0) goto L_0x006a
            if (r1 == r4) goto L_0x006c
            if (r1 == r3) goto L_0x005d
            r3 = 0
            if (r1 == r2) goto L_0x0052
            return r3
        L_0x0052:
            int r10 = r10.getHeight()
            if (r10 == r6) goto L_0x005b
            if (r10 == r5) goto L_0x005b
            return r3
        L_0x005b:
            r5 = r10
            goto L_0x006c
        L_0x005d:
            boolean r10 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r9)
            if (r10 == 0) goto L_0x0067
            r1 = 728(0x2d8, float:1.02E-42)
            r7 = 728(0x2d8, float:1.02E-42)
        L_0x0067:
            if (r10 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r5 = 50
        L_0x006c:
            int r10 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r9, r7)
            int r9 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r9, r5)
            com.ironsource.sdk.a r1 = new com.ironsource.sdk.a
            r1.<init>(r10, r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.app.Activity, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.sdk.a");
    }

    private C5829b createBannerAdInstance(String str, C5820a aVar) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("creating banner ad instance for " + str);
        C5836c cVar = new C5836c(str, new IronSourceBannerListener(this.mDemandSourceToBNSmash.get(str), str));
        cVar.f14211d = getInitParams();
        cVar.f14209b = true;
        cVar.f14210c = aVar;
        return cVar.mo42177a();
    }

    private C5829b getAdInstance(String str, boolean z, boolean z2, boolean z3) {
        C5836c cVar;
        C5829b bVar = (z3 ? this.mDemandSourceToRvAd : this.mDemandSourceToISAd).get(str);
        if (bVar == null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("creating ad instance for " + str + " isDemandOnlyForRv=" + z + " isBidder=" + z2 + " isRewarded=" + z3);
            if (z3) {
                IronSourceRewardedVideoListener ironSourceRewardedVideoListener = new IronSourceRewardedVideoListener(this.mDemandSourceToRvSmash.get(str), str, z);
                cVar.f14211d = getInitParams();
                cVar.f14208a = true;
            } else {
                cVar = new C5836c(str, new IronSourceInterstitialListener(this.mDemandSourceToISSmash.get(str), str));
                cVar.f14211d = getInitParams();
            }
            if (z2) {
                cVar.f14209b = true;
            }
            bVar = cVar.mo42177a();
            (z3 ? this.mDemandSourceToRvAd : this.mDemandSourceToISAd).put(str, bVar);
        }
        return bVar;
    }

    private String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(mediationSegment)) {
            hashMap.put("custom_Segment", mediationSegment);
        }
        if (!TextUtils.isEmpty(C5556E.m13257a().f12860p)) {
            hashMap.put("sessionid", C5556E.m13257a().f12860p);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams() {
        HashMap<String, String> initParams = getInitParams();
        initParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            initParams.putAll(offerwallCustomParams);
        }
        return initParams;
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToISSmash.put(str2, interstitialSmashListener);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToRvSmash.put(str2, rewardedVideoSmashListener);
    }

    private void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + optInt);
            SDKUtils.setDebugMode(optInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.verbose("IronSourceNetwork setting controller url to  " + jSONObject.optString("controllerUrl"));
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig"));
            IronLog ironLog3 = IronLog.ADAPTER_API;
            ironLog3.verbose("IronSourceNetwork setting controller config to  " + jSONObject.optString("controllerConfig"));
            HashMap<String, String> initParams = getInitParams();
            String str2 = C5556E.m13257a().f12854j;
            IronLog ironLog4 = IronLog.ADAPTER_API;
            ironLog4.verbose("with appKey=" + str2 + " userId=" + mediationUserId + " parameters " + initParams);
            IronSourceNetwork.setInitListener(new C6032d() {
                public void onFail(C6014e eVar) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("OnNetworkSDKInitListener fail - code:" + eVar.f14777b + " message:" + eVar.f14776a);
                }

                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), str2, mediationUserId, initParams);
        }
    }

    private boolean isValidMetaData(String str, String str2) {
        if (str.equals("do_not_sell")) {
            return MetaDataUtils.isValidCCPAMetaData(str, str2);
        }
        return true;
    }

    private void loadAdInternal(String str, String str2, boolean z, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            C5690e.m13999a();
            hashMap.put("adm", C5690e.m14010c(str2));
            C5690e.m13999a();
            hashMap.putAll(C5690e.m14008b(str2));
        }
        C5829b adInstance = getAdInstance(str, z, z2, z3);
        printInstanceExtraParams(hashMap);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName=" + adInstance.f14186c);
        IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), adInstance, hashMap);
    }

    private void printInstanceExtraParams(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            IronLog.ADAPTER_API.verbose("instance extra params:");
            for (String next : map.keySet()) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose(next + "=" + map.get(next));
            }
        }
    }

    private void showAdInternal(C5829b bVar, int i) {
        int b = C5804m.m14360a().mo42136b(i);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, String.valueOf(b));
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName=" + bVar.f14186c + " showParams=" + hashMap);
        IronSourceNetwork.showAd(bVar, hashMap);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(demandSourceName + ": destroyBanner()");
        C5837a aVar = this.mBannerAdContainer;
        if (aVar != null) {
            try {
                if (aVar.f14214a == null || aVar.f14214a.f14224c == null) {
                    throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
                }
                aVar.f14214a.f14224c.mo42168a("destroyBanner", new JSONObject().put("adViewId", aVar.f14214a.f14222a).put("isBNAutoRemove", false).put("isBannerDisplay", aVar.f14215b));
                this.mBannerAdContainer = null;
            } catch (Exception e) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (C5556E.m13257a().f12854j != null) {
            IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
            initSDK(C5556E.m13257a().f12854j, jSONObject);
            return;
        }
        IronLog.ADAPTER_API.error("Appkey is null for early init");
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName);
        try {
            loadAdInternal(demandSourceName, (String) null, false, false, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            RewardedVideoSmashListener rewardedVideoSmashListener2 = this.mDemandSourceToRvSmash.get(demandSourceName);
            if (rewardedVideoSmashListener2 != null) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.error("exception " + e.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getBiddingData() {
        IronLog.ADAPTER_API.verbose("");
        HashMap hashMap = new HashMap();
        String token = IronSourceNetwork.getToken(ContextProvider.getInstance().getApplicationContext());
        if (token != null) {
            hashMap.put("token", token);
        } else {
            IronLog.ADAPTER_API.error("bidding token is null");
            hashMap.put("token", "");
        }
        return hashMap;
    }

    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public void getOfferwallCredits() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " getOfferwallCredits");
        try {
            IronSourceNetwork.getOfferWallCredits(this);
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e.getMessage());
        }
    }

    public JSONObject getPlayerBiddingData() {
        JSONObject jSONObject;
        IronLog.ADAPTER_API.verbose("");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = IronSourceNetwork.getRawToken(ContextProvider.getInstance().getApplicationContext());
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("getRawToken exception: " + e.getLocalizedMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        IronLog.ADAPTER_API.error("Player's bidding token is null");
        return jSONObject2;
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public String getVersion() {
        return "7.1.10.1";
    }

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        this.mDemandSourceToBNSmash.put(demandSourceName, bannerSmashListener);
        bannerSmashListener.onBannerInitSuccess();
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    public void initOfferwall(String str, String str2, JSONObject jSONObject) {
        initSDK(str, jSONObject);
        IronLog.ADAPTER_API.verbose(":initOfferwall");
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    IronSourceNetwork.initOfferWall(IronSourceAdapter.this.getOfferwallExtraParams(), IronSourceAdapter.this);
                } catch (Exception e) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.error(IronSourceAdapter.this.getProviderName() + ":initOfferwall " + e);
                    C5751g access$100 = IronSourceAdapter.this.mOfferwallListener;
                    access$100.mo41509a(false, ErrorBuilder.buildInitFailedError("Adapter initialization failure - " + IronSourceAdapter.this.getProviderName() + " - " + e.getMessage(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        C5829b bVar = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar);
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        C5829b bVar = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar);
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName: " + demandSourceName);
        try {
            C5820a convertBannerSize = convertBannerSize(ContextProvider.getInstance().getCurrentActiveActivity(), ironSourceBannerLayout.getSize());
            if (convertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                return;
            }
            HashMap hashMap = new HashMap();
            if (str != null) {
                C5690e.m13999a();
                hashMap.put("adm", C5690e.m14010c(str));
                C5690e.m13999a();
                hashMap.putAll(C5690e.m14008b(str));
                printInstanceExtraParams(hashMap);
            }
            IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), createBannerAdInstance(demandSourceName, convertBannerSize), hashMap);
        } catch (Exception e) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e.getMessage()));
        }
    }

    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), (String) null, false, false, false);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e.getMessage()));
        }
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, false);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("for bidding exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e.getMessage()));
        }
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), (String) null, true, false, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
        }
    }

    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, true, true, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
        }
    }

    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        C5751g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    public boolean onOWAdCredited(int i, int i2, boolean z) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        C5751g gVar = this.mOfferwallListener;
        return gVar != null && gVar.onOfferwallAdCredited(i, i2, z);
    }

    public void onOWShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onOfferwallShowFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOWShowSuccess(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(getProviderName() + ":onOWShowSuccess(placementId:" + str + ")");
        C5751g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        }
    }

    public void onOfferwallInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.mo41509a(false, ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOfferwallInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        C5751g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallAvailable(true);
        }
    }

    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.warning("unsupported method");
    }

    public void setConsent(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb = new StringBuilder("(");
        sb.append(z ? "true" : "false");
        sb.append(")");
        ironLog.verbose(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consent", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e.getMessage());
        }
    }

    public void setInternalOfferwallListener(C5751g gVar) {
        this.mOfferwallListener = gVar;
    }

    public void setMediationSegment(String str) {
        mediationSegment = str;
    }

    public void setMetaData(String str, String str2) {
        if (!mDidInitSdk.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key=" + str + ", value=" + str2);
            if (!isValidMetaData(str, str2)) {
                IronLog.ADAPTER_API.verbose("MetaData not valid");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, str2);
                IronSourceNetwork.updateMetadata(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.error("error - " + e);
                e.printStackTrace();
            }
        }
    }

    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            showAdInternal(this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject)), 2);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e.getMessage()));
        }
    }

    public void showOfferwall(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " showOfferWall");
        try {
            HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams();
            offerwallExtraParams.put(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, str);
            IronSourceNetwork.showOfferWall(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e.getMessage());
        }
    }

    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), 1);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e.getMessage()));
        }
    }
}

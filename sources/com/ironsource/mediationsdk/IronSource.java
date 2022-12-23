package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5568I;
import com.ironsource.mediationsdk.C5579L;
import com.ironsource.mediationsdk.C5710l;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.C5728l;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p142c.C5687a;
import com.ironsource.mediationsdk.sdk.C5750f;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p133c.C5499a;
import com.p243my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER(AdFormat.BANNER);
        

        /* renamed from: a */
        private String f12976a;

        private AD_UNIT(String str) {
            this.f12976a = str;
        }

        public final String toString() {
            return this.f12976a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C5556E a = C5556E.m13257a();
        if (C5687a.m13981a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            C5790c.m14278a().mo42110a(impressionDataListener);
            if (a.f12869y != null) {
                a.f12869y.mo42142a(impressionDataListener);
            }
            if (a.f12870z != null) {
                a.f12870z.mo41913a(impressionDataListener);
            }
            if (a.f12811B != null) {
                a.f12811B.f13440j.add(impressionDataListener);
            }
            if (a.f12810A != null) {
                a.f12810A.mo41913a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        C5556E.m13257a().f12858n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a.f12850f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.f12816G && a.f12810A != null) {
                C5579L l = a.f12810A;
                IronLog.INTERNAL.verbose("");
                C5579L.C55812 r2 = new C5710l.C5712b(ironSourceBannerLayout) {

                    /* renamed from: a */
                    private /* synthetic */ IronSourceBannerLayout f13041a;

                    {
                        this.f13041a = r2;
                    }

                    /* renamed from: a */
                    public final void mo41532a() {
                        IronLog.INTERNAL.verbose("destroying banner");
                        C5579L.this.f13017b.mo41820d();
                        C5579L.this.mo41518a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, C5579L.this.f13020e != null ? C5579L.this.f13020e.mo41608m() : C5579L.this.f13021f);
                        C5579L l = C5579L.this;
                        if (l.f13020e != null) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("mActiveSmash = " + l.f13020e.mo41611p());
                            l.f13020e.mo41420a();
                            l.f13020e = null;
                        }
                        this.f13041a.mo41466b();
                        C5579L.this.f13018c = null;
                        C5579L.this.f13019d = null;
                        C5579L.this.mo41520a(C5585a.READY_TO_LOAD);
                    }

                    /* renamed from: a */
                    public final void mo41533a(String str) {
                        IronLog ironLog = IronLog.API;
                        ironLog.error("destroy banner failed - errorMessage = " + str);
                    }
                };
                if (ironSourceBannerLayout != null) {
                    if (!ironSourceBannerLayout.isDestroyed()) {
                        r2.mo41532a();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                r2.mo41533a(String.format("can't destroy banner - %s", objArr));
            } else if (a.f12849e != null) {
                a.f12849e.mo41880a(ironSourceBannerLayout);
            } else if (a.f12819J != null) {
                a.f12819J.mo41994a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        C5556E.m13257a();
        return C5556E.m13258a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String l;
        synchronized (IronSource.class) {
            l = C5556E.m13257a().mo41391l();
        }
        return l;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String iSDemandOnlyBiddingData;
        synchronized (IronSource.class) {
            iSDemandOnlyBiddingData = getISDemandOnlyBiddingData();
        }
        return iSDemandOnlyBiddingData;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C5556E.m13257a().mo41388k(str);
    }

    public static void getOfferwallCredits() {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            C5578K k = a.f12848d;
            if (k.f13007a != null) {
                k.f13007a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C5556E.m13257a().mo41390l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C5556E.m13257a().mo41362a(activity, str, false, (C5750f) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C5556E.m13257a().mo41361a((Context) activity, str, (C5750f) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        C5556E.m13257a().mo41361a(context, str, (C5750f) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return C5556E.m13257a().mo41394n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C5556E.m13257a().mo41385i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C5556E.m13257a().mo41381g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return C5556E.m13257a().mo41393m(str);
    }

    public static boolean isInterstitialReady() {
        return C5556E.m13257a().mo41380g();
    }

    public static boolean isOfferwallAvailable() {
        return C5556E.m13257a().mo41387j();
    }

    public static boolean isRewardedVideoAvailable() {
        return C5556E.m13257a().mo41372c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.C5556E.C55571.f12872b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C5556E.m13257a()
            int r1 = r0.mo41395o(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.C5556E.C55571.f12872b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.f12865u
            boolean r6 = r0.f12812C
            int r0 = r0.f12817H
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.C5556E.m13267a((org.json.JSONObject) r0, (java.lang.Object[][]) r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.C5556E.m13260a((int) r7, (org.json.JSONObject) r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C5556E.m13257a().mo41364a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C5556E.m13257a().mo41364a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        C5556E.m13257a().mo41359a(activity, ironSourceBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C5556E.m13257a().mo41374d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        C5556E.m13257a().mo41374d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        C5556E.m13257a().mo41371c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        C5556E.m13257a().mo41371c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C5556E.m13257a().mo41369b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        C5556E.m13257a().mo41369b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        C5556E.m13257a().mo41360a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        C5556E.m13257a().mo41360a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a.f12866v) {
                a.f12850f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a.f12867w) {
                a.f12850f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                C5568I.C5572a b = C5568I.m13411a().mo41447b();
                if (b == C5568I.C5572a.INIT_FAILED) {
                    a.f12850f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b != C5568I.C5572a.INIT_IN_PROGRESS) {
                    if (!(a.f12853i == null || a.f12853i.f14083c == null)) {
                        if (a.f12853i.f14083c.f13745b != null) {
                            if (!a.f12813D) {
                                a.f12847c.mo41330c();
                                return;
                            }
                            if (a.f12814E) {
                                if (a.f12811B != null) {
                                    a.f12811B.mo41785a();
                                    return;
                                }
                            } else if (a.f12870z != null) {
                                a.f12870z.mo41562d();
                                return;
                            }
                            a.f12815F = true;
                            return;
                        }
                    }
                    a.f12850f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (C5568I.m13411a().mo41449c()) {
                    a.f12850f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else {
                    a.f12815F = true;
                }
            }
        } catch (Throwable th) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C5736n.m14120a().mo41990a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        C5556E a = C5556E.m13257a();
        try {
            a.f12850f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        C5556E a = C5556E.m13257a();
        try {
            a.f12850f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C5556E a = C5556E.m13257a();
        if (C5687a.m13981a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C5790c.m14278a().mo42113b(impressionDataListener);
            if (a.f12869y != null) {
                a.f12869y.mo42143b(impressionDataListener);
            }
            if (a.f12870z != null) {
                a.f12870z.mo41915b(impressionDataListener);
            }
            if (a.f12811B != null) {
                a.f12811B.f13440j.remove(impressionDataListener);
            }
            if (a.f12810A != null) {
                a.f12810A.mo41915b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.f12851g.f13834b = null;
    }

    public static void removeOfferwallListener() {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.f12851g.f13835c = null;
    }

    public static void removeRewardedVideoListener() {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.f12851g.f13833a = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C5556E a = C5556E.m13257a();
        if (C5687a.m13981a(jSONObject, "setAdRevenueData - impressionData is null") && C5687a.m13981a(str, "setAdRevenueData - dataSource is null")) {
            a.f12820K.mo41877a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        C5556E.m13257a();
        C5556E.m13268a(z);
    }

    public static void setConsent(boolean z) {
        C5556E.m13257a().mo41370b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return C5556E.m13257a().mo41373c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C5556E.m13257a();
        C5556E.m13263a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C5556E.m13257a();
        C5556E.m13264a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C5556E a = C5556E.m13257a();
        IronLog.API.info("removing all impression data listeners");
        C5790c.m14278a().mo42114c();
        if (a.f12869y != null) {
            a.f12869y.mo42144b_();
        }
        if (a.f12870z != null) {
            a.f12870z.mo41916b_();
        }
        if (a.f12811B != null) {
            a.f12811B.f13440j.clear();
        }
        if (a.f12810A != null) {
            a.f12810A.mo41916b_();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.f12851g.f13834b = interstitialListener;
        C5543A.m13206a().mo41281a(interstitialListener);
        C5736n.m14120a().f13806a = interstitialListener;
    }

    public static void setLogListener(LogListener logListener) {
        C5556E a = C5556E.m13257a();
        if (logListener == null) {
            a.f12850f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.f12852h.f13676c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f12850f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setMediationSegment(String str) {
        C5556E a = C5556E.m13257a();
        try {
            a.f12850f.log(IronSourceLogger.IronSourceTag.API, a.f12836a + ":setMediationSegment(segment:" + str + ")", 1);
            C5499a aVar = new C5499a();
            C5556E.m13265a(str, aVar);
            if (aVar.mo41203a()) {
                a.f12856l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.mo41204b().toString(), 2);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = a.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a.f12836a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        C5556E.m13257a().mo41375d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C5556E.m13257a().mo41365a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        C5556E.m13257a().mo41365a(str, list);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.f12851g.f13835c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.f12851g.f13833a = rewardedVideoListener;
        C5615W.m13672a().mo41623a(rewardedVideoListener);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C5556E a = C5556E.m13257a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a.f12850f.log(IronSourceLogger.IronSourceTag.API, a.f12836a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a.f12858n = new HashMap(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f12850f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.f12836a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        C5556E a = C5556E.m13257a();
        if (C5568I.m13411a().mo41447b() == C5568I.C5572a.INIT_IN_PROGRESS || C5568I.m13411a().mo41447b() == C5568I.C5572a.INITIATED) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Segments must be set prior to Init. Setting a segment after the init will be ignored", 0);
        } else {
            a.f12863s = ironSourceSegment;
        }
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        C5556E a = C5556E.m13257a();
        if (a.f12851g != null) {
            a.f12851g.f13836d = segmentListener;
            C5568I.m13411a().f12947o = a.f12851g;
        }
    }

    public static void setUserId(String str) {
        C5556E.m13257a().mo41366a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        C5556E a = C5556E.m13257a();
        a.f12861q = context;
        a.f12862r = Boolean.valueOf(z);
        if (a.f12813D) {
            if (a.f12814E) {
                if (a.f12811B != null) {
                    a.f12811B.mo41787a(z);
                }
            } else if (a.f12870z != null) {
                a.f12870z.mo41557a(z);
            }
        } else if (a.f12847c != null) {
            a.f12847c.mo41319a(context, z);
        }
        if (a.f12812C) {
            if (a.f12869y != null) {
                a.f12869y.mo41400a(context, z);
            }
        } else if (a.f12846b != null) {
            a.f12846b.mo41319a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C5556E a = C5556E.m13257a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f12850f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.f12866v) {
                a.f12850f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a.f12818I == null) {
                a.f12850f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                C5813z.m14382a().mo42146b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
            } else {
                C5741q qVar = a.f12818I;
                if (!qVar.f13823a.containsKey(str)) {
                    C5741q.m14145a(2500, str);
                    C5813z.m14382a().mo42146b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                C5742r rVar = qVar.f13823a.get(str);
                qVar.mo42007a((int) IronSourceConstants.IS_INSTANCE_SHOW, rVar);
                rVar.mo42016a();
            }
        } catch (Exception e) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            C5813z.m14382a().mo42146b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C5556E.m13257a().mo41379f(str);
    }

    public static void showInterstitial() {
        C5556E a = C5556E.m13257a();
        a.f12850f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a.f12866v) {
                a.f12850f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                a.f12851g.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"));
            } else if (!a.mo41383h()) {
                a.f12851g.onInterstitialAdShowFailed(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                InterstitialPlacement e = a.mo41377e();
                if (e != null) {
                    a.mo41382h(e.getPlacementName());
                } else {
                    a.f12851g.onInterstitialAdShowFailed(new IronSourceError(1020, "showInterstitial error: empty default placement in response"));
                }
            }
        } catch (Exception e2) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e2);
            a.f12851g.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e2.getMessage()));
        }
    }

    public static void showInterstitial(String str) {
        C5556E.m13257a().mo41382h(str);
    }

    public static void showOfferwall() {
        C5556E a = C5556E.m13257a();
        try {
            a.f12850f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.mo41384i()) {
                a.f12851g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C5728l a2 = a.f12853i.f14083c.f13746c.mo41977a();
            if (a2 != null) {
                a.mo41386j(a2.f13764b);
            }
        } catch (Exception e) {
            a.f12850f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.f12851g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        C5556E.m13257a().mo41386j(str);
    }

    public static void showRewardedVideo() {
        C5556E a = C5556E.m13257a();
        if (!a.mo41376d()) {
            a.f12851g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            a.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b = a.mo41368b();
        if (b == null) {
            a.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            a.f12851g.onRewardedVideoAdShowFailed(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"));
            return;
        }
        a.mo41378e(b.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        C5556E.m13257a().mo41378e(str);
    }
}

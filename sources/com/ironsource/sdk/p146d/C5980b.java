package com.ironsource.sdk.p146d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.ironsource.mediationsdk.C5710l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.C5820a;
import com.ironsource.sdk.C5829b;
import com.ironsource.sdk.C5978d;
import com.ironsource.sdk.C5997e;
import com.ironsource.sdk.C6000f;
import com.ironsource.sdk.controller.C5860c;
import com.ironsource.sdk.controller.C5868g;
import com.ironsource.sdk.controller.C5893j;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5826e;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.p145c.C5837a;
import com.ironsource.sdk.p149f.C6003b;
import com.ironsource.sdk.p150g.C6004a;
import com.ironsource.sdk.p150g.C6007c;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.p151h.C6022e;
import com.ironsource.sdk.p153j.C6030b;
import com.ironsource.sdk.p153j.C6031c;
import com.ironsource.sdk.p153j.C6033e;
import com.ironsource.sdk.p153j.C6034f;
import com.ironsource.sdk.p153j.p154a.C6026a;
import com.ironsource.sdk.p153j.p154a.C6027b;
import com.ironsource.sdk.p153j.p154a.C6028c;
import com.ironsource.sdk.p153j.p154a.C6029d;
import com.ironsource.sdk.service.C6049a;
import com.ironsource.sdk.service.C6051c;
import com.ironsource.sdk.service.C6055e;
import com.ironsource.sdk.utils.C6058a;
import com.ironsource.sdk.utils.C6059b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d.b */
public final class C5980b implements C5996c, C5997e, C6000f, C6026a, C6027b, C6028c, C6029d {

    /* renamed from: g */
    private static C5980b f14639g;

    /* renamed from: a */
    public C5868g f14640a;

    /* renamed from: b */
    C6033e f14641b;

    /* renamed from: c */
    String f14642c;

    /* renamed from: d */
    String f14643d;

    /* renamed from: e */
    C5893j f14644e;

    /* renamed from: f */
    private final String f14645f = IronSourceConstants.SUPERSONIC_CONFIG_NAME;

    /* renamed from: h */
    private long f14646h;

    /* renamed from: i */
    private C6055e f14647i;

    /* renamed from: j */
    private C6051c f14648j;

    /* renamed from: k */
    private boolean f14649k = false;

    /* renamed from: l */
    private C5860c f14650l;

    private C5980b(Context context) {
        m14749b(context);
    }

    private C5980b(String str, String str2, Context context) {
        this.f14642c = str;
        this.f14643d = str2;
        m14749b(context);
    }

    /* renamed from: a */
    public static synchronized C5980b m14743a(Context context) {
        C5980b a;
        synchronized (C5980b.class) {
            a = m14744a(context, 0);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C5980b m14744a(Context context, int i) {
        C5980b bVar;
        synchronized (C5980b.class) {
            Logger.m14957i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f14639g == null) {
                f14639g = new C5980b(context);
            }
            bVar = f14639g;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C5997e m14745a(String str, String str2, Context context) {
        C5980b bVar;
        synchronized (C5980b.class) {
            if (f14639g == null) {
                C5825d.m14393a(C5827f.f14160a);
                f14639g = new C5980b(str, str2, context);
            } else {
                C6055e.m14934a().mo42607b(str);
                C6055e.m14934a().mo42602a(str2);
            }
            bVar = f14639g;
        }
        return bVar;
    }

    /* renamed from: a */
    private static C6034f m14746a(C6007c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C6034f) cVar.f14742g;
    }

    /* renamed from: a */
    private void m14747a(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f14649k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C5979a(this));
            } catch (Throwable th) {
                C5821a aVar = new C5821a();
                aVar.mo42154a("generalmessage", th.getMessage());
                C5825d.m14394a(C5827f.f14177r, (Map<String, Object>) aVar.f14151a);
            }
        }
    }

    /* renamed from: b */
    private static C6031c m14748b(C6007c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C6031c) cVar.f14742g;
    }

    /* renamed from: b */
    private void m14749b(Context context) {
        try {
            C6059b.m14968a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C6022e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            C6059b.m14967a().mo42612a(C6058a.m14964a());
            this.f14647i = m14752c(context);
            this.f14644e = new C5893j();
            C5860c cVar = new C5860c();
            this.f14650l = cVar;
            if (context instanceof Activity) {
                cVar.mo42246a((Activity) context);
            }
            this.f14640a = new C5868g(context, this.f14650l, this.f14647i, this.f14644e);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.m14957i("IronSourceAdsPublisherAgent", "C'tor");
            m14747a(context, SDKUtils.getNetworkConfiguration());
            this.f14648j = new C6051c();
            C5710l.m14087a("sdkv", (Object) "5.105");
            this.f14648j.mo42595a();
            this.f14648j.mo42596a(context);
            this.f14648j.mo42597b();
            this.f14648j.mo42599c();
            this.f14648j.mo42598b(context);
            this.f14646h = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m14750b(C5829b bVar, Map<String, String> map) {
        if (bVar.f14191h) {
            m14753c(bVar, map);
        } else {
            m14755d(bVar, map);
        }
    }

    /* renamed from: c */
    private static C6030b m14751c(C6007c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C6030b) cVar.f14742g;
    }

    /* renamed from: c */
    private C6055e m14752c(Context context) {
        C6055e a = C6055e.m14934a();
        a.mo42606b();
        a.mo42601a(context, this.f14642c, this.f14643d);
        return a;
    }

    /* renamed from: c */
    private void m14753c(final C5829b bVar, final Map<String, String> map) {
        Logger.m14953d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f14185b);
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C6007c a = C5980b.this.f14644e.mo42310a(C6008d.C6013e.Interstitial, bVar.f14185b);
                if (a != null) {
                    C5980b.this.f14640a.mo42261a(a, (Map<String, String>) map, (C6028c) C5980b.this);
                }
            }
        });
    }

    /* renamed from: d */
    private C6007c m14754d(C6008d.C6013e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f14644e.mo42310a(eVar, str);
    }

    /* renamed from: d */
    private void m14755d(final C5829b bVar, final Map<String, String> map) {
        Logger.m14953d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f14185b);
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C6008d.C6013e eVar = bVar.mo42159a() ? C6008d.C6013e.Banner : C6008d.C6013e.Interstitial;
                C5893j jVar = C5980b.this.f14644e;
                C5829b bVar = bVar;
                String str = bVar.f14185b;
                String str2 = bVar.f14186c;
                HashMap hashMap = new HashMap();
                hashMap.put("instanceId", bVar.f14185b);
                hashMap.put("instanceName", bVar.f14186c);
                hashMap.put("rewarded", Boolean.toString(bVar.f14184a));
                hashMap.put("inAppBidding", Boolean.toString(bVar.f14187d));
                hashMap.put("apiVersion", "2");
                C5820a aVar = bVar.f14188e;
                String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                hashMap.put("width", aVar != null ? Integer.toString(bVar.f14188e.f14148a) : str3);
                if (bVar.f14188e != null) {
                    str3 = Integer.toString(bVar.f14188e.f14149b);
                }
                hashMap.put("height", str3);
                hashMap.put("label", bVar.f14188e != null ? bVar.f14188e.f14150c : "");
                hashMap.put("isBanner", Boolean.toString(bVar.mo42159a()));
                if (bVar.f14189f != null) {
                    hashMap.putAll(bVar.f14189f);
                }
                C6007c cVar = new C6007c(str, str2, hashMap, bVar.f14190g);
                jVar.mo42313a(eVar, str, cVar);
                C5821a aVar2 = new C5821a();
                C5821a a = aVar2.mo42154a("isbiddinginstance", Boolean.valueOf(bVar.f14187d)).mo42154a("demandsourcename", bVar.f14186c).mo42154a("producttype", C5978d.m14741a(bVar));
                C6049a aVar3 = C6049a.f14820a;
                a.mo42154a("custom_c", Long.valueOf(C6049a.m14921c(bVar.f14185b)));
                C5825d.m14394a(C5827f.f14166g, (Map<String, Object>) aVar2.f14151a);
                if (eVar == C6008d.C6013e.Banner) {
                    C5980b.this.f14640a.mo42264a(C5980b.this.f14642c, C5980b.this.f14643d, cVar, (C6027b) C5980b.this);
                    bVar.f14191h = true;
                    C5980b.this.f14640a.mo42260a(cVar, (Map<String, String>) map, (C6027b) C5980b.this);
                    return;
                }
                C5980b.this.f14640a.mo42265a(C5980b.this.f14642c, C5980b.this.f14643d, cVar, (C6028c) C5980b.this);
                bVar.f14191h = true;
                C5980b.this.f14640a.mo42261a(cVar, (Map<String, String>) map, (C6028c) C5980b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo42485a() {
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42277d();
            }
        });
    }

    /* renamed from: a */
    public final void mo42486a(Activity activity) {
        try {
            Logger.m14957i("IronSourceAdsPublisherAgent", "release()");
            C6058a.m14966b();
            this.f14650l.mo42247b();
            this.f14640a.mo42273b((Context) activity);
            this.f14640a.destroy();
            this.f14640a = null;
        } catch (Exception unused) {
        }
        f14639g = null;
    }

    /* renamed from: a */
    public final void mo42487a(Activity activity, C5829b bVar, Map<String, String> map) {
        this.f14650l.mo42246a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        C6049a aVar = C6049a.f14820a;
        C6049a.m14919a(bVar.f14185b, currentTimeMillis);
        C5821a aVar2 = new C5821a();
        aVar2.mo42154a("isbiddinginstance", Boolean.valueOf(bVar.f14187d)).mo42154a("demandsourcename", bVar.f14186c).mo42154a("producttype", C5978d.m14741a(bVar)).mo42154a("custom_c", Long.valueOf(currentTimeMillis));
        C5825d.m14394a(C5827f.f14164e, (Map<String, Object>) aVar2.f14151a);
        Logger.m14953d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f14185b);
        if (bVar.f14187d) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e) {
                C5821a a = new C5821a().mo42154a("callfailreason", e.getMessage()).mo42154a("generalmessage", bVar.f14191h ? C6003b.f14708a : C6003b.f14709b).mo42154a("isbiddinginstance", Boolean.valueOf(bVar.f14187d)).mo42154a("demandsourcename", bVar.f14186c).mo42154a("producttype", C5978d.m14741a(bVar));
                C6049a aVar3 = C6049a.f14820a;
                C5821a a2 = a.mo42154a("custom_c", Long.valueOf(C6049a.m14921c(bVar.f14185b)));
                C6049a aVar4 = C6049a.f14820a;
                C6049a.m14920b(bVar.f14185b);
                C5825d.m14394a(C5827f.f14169j, (Map<String, Object>) a2.f14151a);
                e.printStackTrace();
                Logger.m14953d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e.getMessage());
            }
            m14750b(bVar, map);
            return;
        }
        m14750b(bVar, map);
    }

    /* renamed from: a */
    public final void mo42488a(Activity activity, final Map<String, String> map) {
        if (activity != null) {
            this.f14650l.mo42246a(activity);
        }
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42269a((Map<String, String>) map, C5980b.this.f14641b);
            }
        });
    }

    /* renamed from: a */
    public final void mo42489a(C5829b bVar, final Map<String, String> map) {
        Logger.m14957i("IronSourceAdsPublisherAgent", "showAd " + bVar.f14185b);
        final C6007c a = this.f14644e.mo42310a(C6008d.C6013e.Interstitial, bVar.f14185b);
        if (a != null) {
            this.f14640a.mo42262a((Runnable) new Runnable() {
                public final void run() {
                    C5980b.this.f14640a.mo42274b(a, map, C5980b.this);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42490a(C6008d.C6013e eVar, String str) {
        C6031c b;
        C6007c d = m14754d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C6008d.C6013e.RewardedVideo) {
            C6034f a = m14746a(d);
            if (a != null) {
                a.onRVAdClosed();
            }
        } else if (eVar == C6008d.C6013e.Interstitial && (b = m14748b(d)) != null) {
            b.onInterstitialClose();
        }
    }

    /* renamed from: a */
    public final void mo42491a(C6008d.C6013e eVar, String str, C6004a aVar) {
        C6030b c;
        C6007c d = m14754d(eVar, str);
        if (d != null) {
            d.mo42548a(2);
            if (eVar == C6008d.C6013e.RewardedVideo) {
                C6034f a = m14746a(d);
                if (a != null) {
                    a.onRVInitSuccess(aVar);
                }
            } else if (eVar == C6008d.C6013e.Interstitial) {
                C6031c b = m14748b(d);
                if (b != null) {
                    b.onInterstitialInitSuccess();
                }
            } else if (eVar == C6008d.C6013e.Banner && (c = m14751c(d)) != null) {
                c.onBannerInitSuccess();
            }
        }
    }

    /* renamed from: a */
    public final void mo42492a(C6008d.C6013e eVar, String str, String str2) {
        C6030b c;
        C6007c d = m14754d(eVar, str);
        C5821a a = new C5821a().mo42154a("demandsourcename", str).mo42154a("producttype", eVar).mo42154a("callfailreason", str2);
        C6049a aVar = C6049a.f14820a;
        C5821a a2 = a.mo42154a("custom_c", Long.valueOf(C6049a.m14921c(d.f14737b)));
        C6049a aVar2 = C6049a.f14820a;
        C6049a.m14920b(d.f14737b);
        if (d != null) {
            a2.mo42154a("isbiddinginstance", Boolean.valueOf(C5826e.m14396a(d)));
            d.mo42548a(3);
            if (eVar == C6008d.C6013e.RewardedVideo) {
                C6034f a3 = m14746a(d);
                if (a3 != null) {
                    a3.onRVInitFail(str2);
                }
            } else if (eVar == C6008d.C6013e.Interstitial) {
                C6031c b = m14748b(d);
                if (b != null) {
                    b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C6008d.C6013e.Banner && (c = m14751c(d)) != null) {
                c.onBannerInitFailed(str2);
            }
        }
        C5825d.m14394a(C5827f.f14167h, (Map<String, Object>) a2.f14151a);
    }

    /* renamed from: a */
    public final void mo42493a(C6008d.C6013e eVar, String str, String str2, JSONObject jSONObject) {
        C6030b c;
        C6007c d = m14754d(eVar, str);
        if (d != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.m14957i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + d.f14736a);
                if (eVar == C6008d.C6013e.Interstitial) {
                    C6031c b = m14748b(d);
                    if (b != null) {
                        jSONObject.put("demandSourceName", str);
                        b.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C6008d.C6013e.RewardedVideo) {
                    C6034f a = m14746a(d);
                    if (a != null) {
                        jSONObject.put("demandSourceName", str);
                        a.onRVEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C6008d.C6013e.Banner && (c = m14751c(d)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        c.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo42494a(final C6033e eVar) {
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42267a(C5980b.this.f14642c, C5980b.this.f14643d, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42495a(String str, int i) {
        C6034f a;
        C6007c d = m14754d(C6008d.C6013e.RewardedVideo, str);
        if (d != null && (a = m14746a(d)) != null) {
            a.onRVAdCredited(i);
        }
    }

    /* renamed from: a */
    public final void mo42496a(String str, C5837a aVar) {
        C6030b c;
        C6007c d = m14754d(C6008d.C6013e.Banner, str);
        if (d != null && (c = m14751c(d)) != null) {
            c.onBannerLoadSuccess(aVar);
        }
    }

    /* renamed from: a */
    public final void mo42497a(String str, String str2) {
        C6034f a;
        C6007c d = m14754d(C6008d.C6013e.RewardedVideo, str);
        if (d != null && (a = m14746a(d)) != null) {
            a.onRVShowFail(str2);
        }
    }

    /* renamed from: a */
    public final void mo42498a(String str, String str2, int i) {
        C6008d.C6013e productType;
        C6007c a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (productType = SDKUtils.getProductType(str)) != null && (a = this.f14644e.mo42310a(productType, str2)) != null) {
            a.f14738c = i;
        }
    }

    /* renamed from: a */
    public final void mo42499a(final String str, final String str2, final C6033e eVar) {
        this.f14642c = str;
        this.f14643d = str2;
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42267a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42500a(final String str, final String str2, String str3, Map<String, String> map, C6031c cVar) {
        this.f14642c = str;
        this.f14643d = str2;
        final C6007c a = this.f14644e.mo42311a(C6008d.C6013e.Interstitial, str3, map, cVar);
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42265a(str, str2, a, (C6028c) C5980b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo42501a(final String str, final String str2, String str3, Map<String, String> map, C6034f fVar) {
        this.f14642c = str;
        this.f14643d = str2;
        final C6007c a = this.f14644e.mo42311a(C6008d.C6013e.RewardedVideo, str3, map, fVar);
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42266a(str, str2, a, (C6029d) C5980b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo42502a(String str, String str2, Map<String, String> map, C6033e eVar) {
        this.f14642c = str;
        this.f14643d = str2;
        this.f14641b = eVar;
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C6033e eVar2 = eVar;
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42268a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo42503a(final Map<String, String> map, final C6033e eVar) {
        this.f14641b = eVar;
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42268a(C5980b.this.f14642c, C5980b.this.f14643d, (Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42504a(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f14647i.mo42604a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42270a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final boolean mo42505a(C5829b bVar) {
        Logger.m14953d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f14185b);
        C6007c a = this.f14644e.mo42310a(C6008d.C6013e.Interstitial, bVar.f14185b);
        if (a == null) {
            return false;
        }
        return a.f14741f;
    }

    /* renamed from: a */
    public final boolean mo42506a(String str) {
        return this.f14640a.mo42276c(str);
    }

    /* renamed from: b */
    public final void mo42507b(Activity activity) {
        if (!this.f14649k) {
            mo42518d(activity);
        }
    }

    /* renamed from: b */
    public final void mo42508b(C6008d.C6013e eVar, String str) {
        C6030b c;
        C6007c d = m14754d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C6008d.C6013e.RewardedVideo) {
            C6034f a = m14746a(d);
            if (a != null) {
                a.onRVAdClicked();
            }
        } else if (eVar == C6008d.C6013e.Interstitial) {
            C6031c b = m14748b(d);
            if (b != null) {
                b.onInterstitialClick();
            }
        } else if (eVar == C6008d.C6013e.Banner && (c = m14751c(d)) != null) {
            c.onBannerClick();
        }
    }

    /* renamed from: b */
    public final void mo42509b(String str) {
        C6034f a;
        C6007c d = m14754d(C6008d.C6013e.RewardedVideo, str);
        if (d != null && (a = m14746a(d)) != null) {
            a.onRVNoMoreOffers();
        }
    }

    /* renamed from: b */
    public final void mo42510b(String str, int i) {
        C6007c d = m14754d(C6008d.C6013e.Interstitial, str);
        C6031c b = m14748b(d);
        if (d != null && b != null) {
            b.onInterstitialAdRewarded(str, i);
        }
    }

    /* renamed from: b */
    public final void mo42511b(String str, String str2) {
        C6007c d = m14754d(C6008d.C6013e.Interstitial, str);
        C5821a aVar = new C5821a();
        aVar.mo42154a("callfailreason", str2).mo42154a("demandsourcename", str);
        if (d != null) {
            C5821a a = aVar.mo42154a("producttype", C5826e.m14395a(d, C6008d.C6013e.Interstitial)).mo42154a("generalmessage", d.f14740e == 2 ? C6003b.f14708a : C6003b.f14709b).mo42154a("isbiddinginstance", Boolean.valueOf(C5826e.m14396a(d)));
            C6049a aVar2 = C6049a.f14820a;
            a.mo42154a("custom_c", Long.valueOf(C6049a.m14921c(d.f14737b)));
            C6049a aVar3 = C6049a.f14820a;
            C6049a.m14920b(d.f14737b);
            C6031c b = m14748b(d);
            if (b != null) {
                b.onInterstitialLoadFailed(str2);
            }
        }
        C5825d.m14394a(C5827f.f14165f, (Map<String, Object>) aVar.f14151a);
    }

    /* renamed from: b */
    public final void mo42512b(final JSONObject jSONObject) {
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42272a(jSONObject, (C6029d) C5980b.this);
            }
        });
    }

    /* renamed from: c */
    public final void mo42513c(Activity activity) {
        if (!this.f14649k) {
            mo42522e(activity);
        }
    }

    /* renamed from: c */
    public final void mo42514c(C6008d.C6013e eVar, String str) {
        C6034f a;
        C6007c d = m14754d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C6008d.C6013e.Interstitial) {
            C6031c b = m14748b(d);
            if (b != null) {
                b.onInterstitialOpen();
            }
        } else if (eVar == C6008d.C6013e.RewardedVideo && (a = m14746a(d)) != null) {
            a.onRVAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo42515c(String str) {
        C6007c d = m14754d(C6008d.C6013e.Interstitial, str);
        C5821a a = new C5821a().mo42154a("demandsourcename", str);
        if (d != null) {
            C5821a a2 = a.mo42154a("producttype", C5826e.m14395a(d, C6008d.C6013e.Interstitial)).mo42154a("isbiddinginstance", Boolean.valueOf(C5826e.m14396a(d)));
            C6049a aVar = C6049a.f14820a;
            a2.mo42154a("custom_c", Long.valueOf(C6049a.m14921c(d.f14737b)));
            C6049a aVar2 = C6049a.f14820a;
            C6049a.m14920b(d.f14737b);
            C6031c b = m14748b(d);
            if (b != null) {
                b.onInterstitialLoadSuccess();
            }
        }
        C5825d.m14394a(C5827f.f14170k, (Map<String, Object>) a.f14151a);
    }

    /* renamed from: c */
    public final void mo42516c(String str, String str2) {
        C6031c b;
        C6007c d = m14754d(C6008d.C6013e.Interstitial, str);
        if (d != null && (b = m14748b(d)) != null) {
            b.onInterstitialShowFailed(str2);
        }
    }

    /* renamed from: c */
    public final void mo42517c(JSONObject jSONObject) {
        final String optString = jSONObject.optString("demandSourceName");
        if (!TextUtils.isEmpty(optString)) {
            this.f14640a.mo42262a((Runnable) new Runnable() {
                public final void run() {
                    C5980b.this.f14640a.mo42263a(optString, (C6028c) C5980b.this);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo42518d(Activity activity) {
        try {
            this.f14640a.mo42280f();
            this.f14640a.mo42273b((Context) activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void mo42519d(String str) {
        C6031c b;
        C6007c d = m14754d(C6008d.C6013e.Interstitial, str);
        if (d != null && (b = m14748b(d)) != null) {
            b.onInterstitialShowSuccess();
        }
    }

    /* renamed from: d */
    public final void mo42520d(String str, String str2) {
        C6030b c;
        C6007c d = m14754d(C6008d.C6013e.Banner, str);
        if (d != null && (c = m14751c(d)) != null) {
            c.onBannerLoadFail(str2);
        }
    }

    /* renamed from: d */
    public final void mo42521d(final JSONObject jSONObject) {
        this.f14640a.mo42262a((Runnable) new Runnable() {
            public final void run() {
                C5980b.this.f14640a.mo42271a(jSONObject, (C6028c) C5980b.this);
            }
        });
    }

    /* renamed from: e */
    public final void mo42522e(Activity activity) {
        this.f14650l.mo42246a(activity);
        this.f14640a.mo42279e();
        this.f14640a.mo42259a((Context) activity);
    }
}

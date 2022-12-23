package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.network.C1496f;
import com.applovin.impl.sdk.network.C1499g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1416i;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventServiceImpl implements AppLovinEventService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f2588a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, Object> f2589b;

    /* renamed from: c */
    private final AtomicBoolean f2590c = new AtomicBoolean();

    public EventServiceImpl(C1469j jVar) {
        this.f2588a = jVar;
        if (((Boolean) jVar.mo13088a(C1369c.f2881aX)).booleanValue()) {
            this.f2589b = C1521i.m3469a((String) this.f2588a.mo13112b(C1371e.f3166r, "{}"), (Map<String, Object>) new HashMap(), this.f2588a);
            return;
        }
        this.f2589b = new HashMap();
        jVar.mo13095a(C1371e.f3166r, "{}");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m2331a() {
        return ((String) this.f2588a.mo13088a(C1369c.f2872aO)) + "4.0/pix";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public HashMap<String, String> m2333a(C1482m mVar, C1473k.C1475a aVar) {
        C1473k N = this.f2588a.mo13074N();
        C1473k.C1478d b = N.mo13150b();
        C1473k.C1476b c = N.mo13151c();
        boolean contains = this.f2588a.mo13114b((C1369c) C1369c.f2878aU).contains(mVar.mo13159a());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event", contains ? C1553o.m3557e(mVar.mo13159a()) : "postinstall");
        hashMap.put("ts", Long.toString(mVar.mo13161c()));
        hashMap.put("platform", C1553o.m3557e(b.f3558a));
        hashMap.put(ServerParameters.MODEL, C1553o.m3557e(b.f3561d));
        hashMap.put("api_level", String.valueOf(b.f3560c));
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C1553o.m3557e(c.f3531c));
        hashMap.put("installer_name", C1553o.m3557e(c.f3532d));
        hashMap.put("ia", Long.toString(c.f3536h));
        hashMap.put("api_did", this.f2588a.mo13088a(C1369c.f2851U));
        hashMap.put(ServerParameters.BRAND, C1553o.m3557e(b.f3562e));
        hashMap.put("brand_name", C1553o.m3557e(b.f3563f));
        hashMap.put("hardware", C1553o.m3557e(b.f3564g));
        hashMap.put("revision", C1553o.m3557e(b.f3565h));
        hashMap.put(ServerParameters.SDK_DATA_SDK_VERSION, AppLovinSdk.VERSION);
        hashMap.put("os", C1553o.m3557e(b.f3559b));
        hashMap.put("orientation_lock", b.f3569l);
        hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, C1553o.m3557e(c.f3530b));
        hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, C1553o.m3557e(b.f3566i));
        hashMap.put(ServerParameters.CARRIER, C1553o.m3557e(b.f3567j));
        hashMap.put("tz_offset", String.valueOf(b.f3575r));
        hashMap.put("aida", String.valueOf(b.f3553N));
        String str = "1";
        hashMap.put("adr", b.f3577t ? str : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        hashMap.put("volume", String.valueOf(b.f3581x));
        hashMap.put("sb", String.valueOf(b.f3582y));
        if (!b.f3540A) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        hashMap.put("sim", str);
        hashMap.put("gy", String.valueOf(b.f3541B));
        hashMap.put("is_tablet", String.valueOf(b.f3542C));
        hashMap.put("tv", String.valueOf(b.f3543D));
        hashMap.put("vs", String.valueOf(b.f3544E));
        hashMap.put("lpm", String.valueOf(b.f3545F));
        hashMap.put("tg", c.f3533e);
        hashMap.put("ltg", c.f3534f);
        hashMap.put("fs", String.valueOf(b.f3547H));
        hashMap.put("tds", String.valueOf(b.f3548I));
        hashMap.put("fm", String.valueOf(b.f3549J.f3585b));
        hashMap.put("tm", String.valueOf(b.f3549J.f3584a));
        hashMap.put("lmt", String.valueOf(b.f3549J.f3586c));
        hashMap.put("lm", String.valueOf(b.f3549J.f3587d));
        hashMap.put("adns", String.valueOf(b.f3570m));
        hashMap.put("adnsd", String.valueOf(b.f3571n));
        hashMap.put("xdpi", String.valueOf(b.f3572o));
        hashMap.put("ydpi", String.valueOf(b.f3573p));
        hashMap.put("screen_size_in", String.valueOf(b.f3574q));
        hashMap.put("debug", Boolean.toString(c.f3535g));
        hashMap.put("af", String.valueOf(b.f3579v));
        hashMap.put("font", String.valueOf(b.f3580w));
        hashMap.put("bt_ms", String.valueOf(b.f3556Q));
        hashMap.put("mute_switch", String.valueOf(b.f3557R));
        hashMap.put("test_ads", C1553o.m3550a(c.f3537i));
        if (!((Boolean) this.f2588a.mo13088a(C1369c.f3081eO)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2588a.mo13136t());
        }
        m2336a(aVar, (Map<String, String>) hashMap);
        if (((Boolean) this.f2588a.mo13088a(C1369c.f3029dO)).booleanValue()) {
            C1557r.m3602a("cuid", this.f2588a.mo13125i(), (Map<String, String>) hashMap);
        }
        if (((Boolean) this.f2588a.mo13088a(C1369c.f3032dR)).booleanValue()) {
            hashMap.put("compass_random_token", this.f2588a.mo13126j());
        }
        if (((Boolean) this.f2588a.mo13088a(C1369c.f3034dT)).booleanValue()) {
            hashMap.put("applovin_random_token", this.f2588a.mo13127k());
        }
        Boolean bool = b.f3550K;
        if (bool != null) {
            hashMap.put("huc", bool.toString());
        }
        Boolean bool2 = b.f3551L;
        if (bool2 != null) {
            hashMap.put("aru", bool2.toString());
        }
        Boolean bool3 = b.f3552M;
        if (bool3 != null) {
            hashMap.put("dns", bool3.toString());
        }
        C1473k.C1477c cVar = b.f3578u;
        if (cVar != null) {
            hashMap.put("act", String.valueOf(cVar.f3538a));
            hashMap.put("acm", String.valueOf(cVar.f3539b));
        }
        String str2 = b.f3583z;
        if (C1553o.m3554b(str2)) {
            hashMap.put("ua", C1553o.m3557e(str2));
        }
        String str3 = b.f3546G;
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("so", C1553o.m3557e(str3));
        }
        if (!contains) {
            hashMap.put("sub_event", C1553o.m3557e(mVar.mo13159a()));
        }
        if (b.f3554O > 0.0f) {
            hashMap.put("da", String.valueOf(b.f3554O));
        }
        if (b.f3555P > 0.0f) {
            hashMap.put("dm", String.valueOf(b.f3555P));
        }
        hashMap.put("sc", C1553o.m3557e((String) this.f2588a.mo13088a(C1369c.f2855Y)));
        hashMap.put("sc2", C1553o.m3557e((String) this.f2588a.mo13088a(C1369c.f2856Z)));
        hashMap.put("sc3", C1553o.m3557e((String) this.f2588a.mo13088a(C1369c.f2884aa)));
        hashMap.put("server_installed_at", C1553o.m3557e((String) this.f2588a.mo13088a(C1369c.f2885ab)));
        C1557r.m3602a("persisted_data", C1553o.m3557e((String) this.f2588a.mo13089a(C1371e.f3174z)), (Map<String, String>) hashMap);
        C1557r.m3602a("plugin_version", C1553o.m3557e((String) this.f2588a.mo13088a(C1369c.f3036dV)), (Map<String, String>) hashMap);
        C1557r.m3602a("mediation_provider", C1553o.m3557e(this.f2588a.mo13130n()), (Map<String, String>) hashMap);
        return hashMap;
    }

    /* renamed from: a */
    private void m2335a(C1416i.C1417a aVar) {
        this.f2588a.mo13071K().mo13014a((C1392a) new C1416i(this.f2588a, aVar), C1435s.C1437a.ADVERTISING_INFO_COLLECTION);
    }

    /* renamed from: a */
    private void m2336a(C1473k.C1475a aVar, Map<String, String> map) {
        String str = aVar.f3528b;
        if (C1553o.m3554b(str)) {
            map.put("idfa", str);
        }
        map.put("dnt", Boolean.toString(aVar.f3527a));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m2338b() {
        return ((String) this.f2588a.mo13088a(C1369c.f2873aP)) + "4.0/pix";
    }

    /* renamed from: c */
    private void m2340c() {
        if (((Boolean) this.f2588a.mo13088a(C1369c.f2881aX)).booleanValue()) {
            this.f2588a.mo13095a(C1371e.f3166r, C1521i.m3465a(this.f2589b, "{}", this.f2588a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12565a(String str, boolean z) {
        trackEvent(str, new HashMap(), (Map<String, String>) null, z);
    }

    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.f2589b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f2590c.compareAndSet(false, true)) {
            this.f2588a.mo13133q().trackEvent("landing");
        }
    }

    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C1505q.m3345i("AppLovinEventService", "Super property key cannot be null or empty");
        } else if (obj == null) {
            this.f2589b.remove(str);
            m2340c();
        } else {
            List<String> b = this.f2588a.mo13114b((C1369c) C1369c.f2880aW);
            if (!C1557r.m3612a(obj, b, this.f2588a)) {
                C1505q.m3345i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b);
                return;
            }
            this.f2589b.put(str, C1557r.m3587a(obj, this.f2588a));
            m2340c();
        }
    }

    public String toString() {
        return "EventService{}";
    }

    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap(1);
        }
        hashMap.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, hashMap);
    }

    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, (Map<String, String>) null, true);
    }

    public void trackEvent(String str, Map<String, String> map, Map<String, String> map2, boolean z) {
        if (((Boolean) this.f2588a.mo13088a(C1369c.f2879aV)).booleanValue()) {
            C1505q v = this.f2588a.mo13139v();
            v.mo13277b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
            final String str2 = str;
            final Map<String, String> map3 = map;
            final boolean z2 = z;
            final Map<String, String> map4 = map2;
            m2335a((C1416i.C1417a) new C1416i.C1417a() {
                /* renamed from: a */
                public void mo12575a(C1473k.C1475a aVar) {
                    C1482m mVar = new C1482m(str2, map3, EventServiceImpl.this.f2589b);
                    try {
                        if (z2) {
                            EventServiceImpl.this.f2588a.mo13073M().mo13215a(C1496f.m3253l().mo13233a(EventServiceImpl.this.m2331a()).mo13237b(EventServiceImpl.this.m2338b()).mo13234a((Map<String, String>) EventServiceImpl.this.m2333a(mVar, aVar)).mo13238b((Map<String, String>) map4).mo13240c(mVar.mo13160b()).mo13235a(((Boolean) EventServiceImpl.this.f2588a.mo13088a(C1369c.f3081eO)).booleanValue()).mo13236a());
                            return;
                        }
                        EventServiceImpl.this.f2588a.mo13077Q().dispatchPostbackRequest(C1499g.m3280b(EventServiceImpl.this.f2588a).mo13200a(EventServiceImpl.this.m2331a()).mo13210c(EventServiceImpl.this.m2338b()).mo13201a((Map<String, String>) EventServiceImpl.this.m2333a(mVar, aVar)).mo13207b((Map<String, String>) map4).mo13202a(C1521i.m3473a((Map<String, ?>) mVar.mo13160b())).mo13203a(((Boolean) EventServiceImpl.this.f2588a.mo13088a(C1369c.f3081eO)).booleanValue()).mo13204a(), (AppLovinPostbackListener) null);
                    } catch (Throwable th) {
                        C1505q v = EventServiceImpl.this.f2588a.mo13139v();
                        v.mo13278b("AppLovinEventService", "Unable to track event: " + mVar, th);
                    }
                }
            });
        }
    }

    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        }
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            C1505q.m3341c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent("iap", hashMap);
    }
}

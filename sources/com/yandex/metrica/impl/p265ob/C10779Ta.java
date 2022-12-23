package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ta */
public class C10779Ta implements C10952Ya<YandexMetricaConfig> {

    /* renamed from: a */
    private final C10348Hm f25847a;

    /* renamed from: b */
    private final C11195eb f25848b;

    C10779Ta(C10348Hm hm, C11195eb ebVar) {
        this.f25847a = hm;
        this.f25848b = ebVar;
    }

    /* renamed from: a */
    public JSONObject mo62281a(Object obj) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        YandexMetricaConfig yandexMetricaConfig = (YandexMetricaConfig) obj;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (yandexMetricaConfig != null) {
                JSONObject putOpt = jSONObject3.put(TapjoyConstants.TJC_API_KEY, yandexMetricaConfig.apiKey).putOpt(TapjoyConstants.TJC_APP_VERSION_NAME, yandexMetricaConfig.appVersion).putOpt("session_timeout", yandexMetricaConfig.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig.nativeCrashReporting).putOpt(FirebaseAnalytics.Param.LOCATION, m27797a(yandexMetricaConfig.location)).putOpt("location_tracking", yandexMetricaConfig.locationTracking).putOpt("logs", yandexMetricaConfig.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig.preloadInfo;
                if (preloadInfo == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", C11993ym.m30996f((Map) preloadInfo.getAdditionalParams()));
                }
                putOpt.putOpt("preload_info", jSONObject).putOpt("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig.maxReportsInDatabaseCount).putOpt("error_environment", C11993ym.m30996f((Map) yandexMetricaConfig.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
                if (yandexMetricaConfig instanceof C12043l) {
                    C12043l lVar = (C12043l) yandexMetricaConfig;
                    JSONObject putOpt2 = jSONObject3.putOpt(TapjoyConstants.TJC_DEVICE_TYPE_NAME, lVar.f28945a).putOpt("clids", C11993ym.m30996f((Map) lVar.f28946b)).putOpt("distribution_referrer", lVar.f28947c);
                    List<String> list = lVar.f28948d;
                    if (list == null) {
                        jSONArray = null;
                    } else if (list.isEmpty()) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = C11993ym.m30982b((List<?>) list);
                    }
                    JSONObject putOpt3 = putOpt2.putOpt("custom_hosts", jSONArray).putOpt("app_build_number", lVar.f28949e).putOpt("dispatch_period_seconds", lVar.f28950f).putOpt("max_reports_count", lVar.f28951g).putOpt("app_environment", C11993ym.m30996f((Map) lVar.f28952h)).putOpt("preload_info_auto_tracking", lVar.f28953i).putOpt("permissions_collection", lVar.f28954j).putOpt("anr_monitoring", lVar.f28955k);
                    this.f25848b.getClass();
                    putOpt3.putOpt("pulse_config", (Object) null).putOpt("rtm_config", (Object) null).put("crash_transformer_set", lVar.f28956l != null);
                }
            }
            jSONObject2.putOpt("config", jSONObject3).putOpt("process_name", ((C10197Dm) this.f25847a).mo61204b());
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private JSONObject m27797a(Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt(IronSourceConstants.EVENTS_PROVIDER, location.getProvider()).put("timestamp", location.getTime()).put("precision", (double) location.getAccuracy()).put("altitude", location.getAltitude()).put(ServerParameters.LON_KEY, location.getLongitude()).put(ServerParameters.LAT_KEY, location.getLatitude()).put("direction", (double) location.getBearing()).put("speed", (double) location.getSpeed());
    }
}

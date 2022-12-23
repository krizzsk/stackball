package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10622P3;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.rh */
public class C11718rh implements C11565nh<C11464kh> {

    /* renamed from: a */
    private final C11352ih f28089a;

    public C11718rh(C11352ih ihVar) {
        this.f28089a = ihVar;
    }

    /* renamed from: a */
    public void mo63603a(Uri.Builder builder, C11464kh khVar) {
        C10255Fg a;
        Uri.Builder builder2 = builder;
        builder2.path("analytics/startup");
        builder2.appendQueryParameter(this.f28089a.mo63045a("deviceid"), khVar.mo62778g());
        builder2.appendQueryParameter(this.f28089a.mo63045a("deviceid2"), khVar.mo62779h());
        C10490M2 v = C10619P0.m27164i().mo61894v();
        C11279gc a2 = khVar.mo62762a();
        if (v.mo61773c()) {
            builder2.appendQueryParameter(this.f28089a.mo63045a("adv_id"), "");
            builder2.appendQueryParameter(this.f28089a.mo63045a(ServerParameters.OAID), "");
            builder2.appendQueryParameter(this.f28089a.mo63045a("yandex_adv_id"), "");
        } else {
            m30210a(builder2, a2.mo62960a(), "adv_id");
            m30210a(builder2, a2.mo62961b(), ServerParameters.OAID);
            m30210a(builder2, a2.mo62962c(), "yandex_adv_id");
        }
        builder2.appendQueryParameter(this.f28089a.mo63045a("app_set_id"), khVar.mo62773d());
        builder2.appendQueryParameter(this.f28089a.mo63045a("app_set_id_scope"), khVar.mo62775e());
        builder2.appendQueryParameter(this.f28089a.mo63045a("app_platform"), "android");
        builder2.appendQueryParameter(this.f28089a.mo63045a("protocol_version"), "2");
        builder2.appendQueryParameter(this.f28089a.mo63045a("analytics_sdk_version_name"), "5.0.0");
        builder2.appendQueryParameter(this.f28089a.mo63045a(ServerParameters.MODEL), khVar.mo62785n());
        builder2.appendQueryParameter(this.f28089a.mo63045a("manufacturer"), khVar.mo62784m());
        builder2.appendQueryParameter(this.f28089a.mo63045a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME), khVar.mo62787p());
        builder2.appendQueryParameter(this.f28089a.mo63045a("screen_width"), String.valueOf(khVar.mo62793v()));
        builder2.appendQueryParameter(this.f28089a.mo63045a("screen_height"), String.valueOf(khVar.mo62792u()));
        builder2.appendQueryParameter(this.f28089a.mo63045a("screen_dpi"), String.valueOf(khVar.mo62791t()));
        builder2.appendQueryParameter(this.f28089a.mo63045a("scalefactor"), String.valueOf(khVar.mo62790s()));
        builder2.appendQueryParameter(this.f28089a.mo63045a("locale"), khVar.mo62783l());
        builder2.appendQueryParameter(this.f28089a.mo63045a(TapjoyConstants.TJC_DEVICE_TYPE_NAME), khVar.mo62781j());
        builder2.appendQueryParameter(this.f28089a.mo63045a("queries"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("query_hosts"), String.valueOf(2));
        String a3 = this.f28089a.mo63045a("features");
        String str = "";
        String str2 = "egress";
        String str3 = "easy_collecting";
        String str4 = "permissions_collecting";
        String[] strArr = {this.f28089a.mo63045a("easy_collecting"), this.f28089a.mo63045a("egress"), this.f28089a.mo63045a("package_info"), this.f28089a.mo63045a("socket"), this.f28089a.mo63045a("permissions_collecting"), this.f28089a.mo63045a("features_collecting"), this.f28089a.mo63045a("location_collecting"), this.f28089a.mo63045a("wakeup"), this.f28089a.mo63045a("lbs_collecting"), this.f28089a.mo63045a("google_aid"), this.f28089a.mo63045a("huawei_oaid"), this.f28089a.mo63045a("throttling"), this.f28089a.mo63045a("wifi_around"), this.f28089a.mo63045a("wifi_connected"), this.f28089a.mo63045a("cells_around"), this.f28089a.mo63045a("sim_info"), this.f28089a.mo63045a("sdk_list"), this.f28089a.mo63045a("identity_light_collecting"), this.f28089a.mo63045a("gpl_collecting"), this.f28089a.mo63045a("ui_parsing"), this.f28089a.mo63045a("ui_collecting_for_bridge"), this.f28089a.mo63045a("ui_event_sending"), this.f28089a.mo63045a("ui_raw_event_sending"), this.f28089a.mo63045a("cell_additional_info"), this.f28089a.mo63045a("cell_additional_info_connected_only"), this.f28089a.mo63045a("ssl_pinning")};
        int i = C10585O2.f25307a;
        builder2.appendQueryParameter(a3, TextUtils.join(",", strArr));
        builder2.appendQueryParameter(this.f28089a.mo63045a("socket"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("app_id"), khVar.mo62788q());
        builder2.appendQueryParameter(this.f28089a.mo63045a("location_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("app_debuggable"), khVar.mo62969A());
        builder2.appendQueryParameter(this.f28089a.mo63045a("sdk_list"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("wakeup"), String.valueOf(1));
        if (khVar.mo63234M()) {
            String E = khVar.mo63226E();
            if (!TextUtils.isEmpty(E)) {
                builder2.appendQueryParameter(this.f28089a.mo63045a("country_init"), E);
            }
        } else {
            builder2.appendQueryParameter(this.f28089a.mo63045a("detect_locale"), String.valueOf(1));
        }
        C10622P3.C10623a C = khVar.mo63224C();
        if (!C10796U2.m27897b((Map) C.mo61907b())) {
            builder2.appendQueryParameter(this.f28089a.mo63045a("distribution_customization"), String.valueOf(1));
            builder2.appendQueryParameter(this.f28089a.mo63045a("clids_set"), C11993ym.m30987c(C.mo61907b()));
            int ordinal = C.mo61253a().ordinal();
            builder2.appendQueryParameter(this.f28089a.mo63045a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? str : "retail" : "satellite" : "api");
            String F = khVar.mo63227F();
            String G = khVar.mo63228G();
            if (TextUtils.isEmpty(F) && (a = khVar.mo63230I().mo62359a()) != null) {
                F = a.f24687a;
                G = a.f24690d.f24695a;
            }
            if (!TextUtils.isEmpty(F)) {
                builder2.appendQueryParameter(this.f28089a.mo63045a("install_referrer"), F);
                if (G == null) {
                    G = "null";
                }
                builder2.appendQueryParameter(this.f28089a.mo63045a("install_referrer_source"), G);
            }
        }
        String x = khVar.mo62795x();
        if (!TextUtils.isEmpty(x)) {
            builder2.appendQueryParameter(this.f28089a.mo63045a("uuid"), x);
        }
        builder2.appendQueryParameter(this.f28089a.mo63045a("time"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("requests"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("stat_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("permissions"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("identity_light_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("ui_parsing"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("ui_collecting_for_bridge"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("ui_event_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("ui_raw_event_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("retry_policy"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("throttling"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("cache_control"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("mediascope_api_keys"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("diagnostics"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a(str4), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("app_system_flag"), khVar.mo62970B());
        builder2.appendQueryParameter(this.f28089a.mo63045a("auto_inapp_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("attribution"), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a(str3), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a(str2), String.valueOf(1));
        builder2.appendQueryParameter(this.f28089a.mo63045a("startup_update"), String.valueOf(1));
    }

    /* renamed from: a */
    private void m30210a(Uri.Builder builder, C11078bc bcVar, String str) {
        if (!bcVar.mo62691a()) {
            builder.appendQueryParameter(this.f28089a.mo63045a(str), "");
        } else {
            builder.appendQueryParameter(this.f28089a.mo63045a(str), bcVar.f26600a.f26512b);
        }
    }
}

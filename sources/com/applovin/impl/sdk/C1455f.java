package com.applovin.impl.sdk;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.C1161c;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.network.C1496f;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.f */
public class C1455f implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1469j f3431a;

    /* renamed from: b */
    private final AppLovinCommunicator f3432b;

    C1455f(C1469j jVar) {
        this.f3431a = jVar;
        this.f3432b = AppLovinCommunicator.getInstance(jVar.mo13065D());
        if (!jVar.mo13121e()) {
            this.f3432b.mo11640a(jVar);
            this.f3432b.subscribe((AppLovinCommunicatorSubscriber) this, C1161c.f2149a);
        }
    }

    /* renamed from: a */
    private void m3003a(Bundle bundle, String str) {
        if (!this.f3431a.mo13121e()) {
            if (!"log".equals(str)) {
                C1505q v = this.f3431a.mo13139v();
                v.mo13277b("CommunicatorService", "Sending message " + bundle + " for topic: " + str + "...");
            }
            this.f3432b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f3431a.mo13114b((C1369c) C1369c.f3127fi).contains(str)));
        }
    }

    /* renamed from: a */
    public void mo13044a(C1223a aVar, String str) {
        boolean l = aVar instanceof C1225c ? ((C1225c) aVar).mo12299l() : false;
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("id", aVar.mo12285b());
        bundle.putString("network_name", aVar.mo12337I());
        bundle.putString("max_ad_unit_id", aVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", aVar.mo12288e());
        bundle.putString("ad_format", aVar.getFormat().getLabel());
        bundle.putString("is_fallback_ad", String.valueOf(l));
        m3003a(bundle, "max_ad_events");
    }

    /* renamed from: a */
    public void mo13045a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("adapter_class", str);
        bundle.putInt("init_status", initializationStatus.getCode());
        m3003a(bundle, "adapter_initialization_status");
    }

    /* renamed from: a */
    public void mo13046a(String str, String str2, int i, Object obj) {
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putString("url", str2);
        bundle.putInt("code", i);
        bundle.putBundle("body", C1521i.m3462a(obj));
        m3003a(bundle, "receive_http_response");
    }

    /* renamed from: a */
    public void mo13047a(JSONObject jSONObject, boolean z) {
        Bundle c = C1521i.m3494c(C1521i.m3492b(C1521i.m3492b(jSONObject, "communicator_settings", new JSONObject(), this.f3431a), "safedk_settings", new JSONObject(), this.f3431a));
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3431a.mo13136t());
        bundle.putString("applovin_random_token", this.f3431a.mo13127k());
        bundle.putString(TapjoyConstants.TJC_DEVICE_TYPE_NAME, AppLovinSdkUtils.isTablet(this.f3431a.mo13065D()) ? "tablet" : "phone");
        bundle.putString("init_success", String.valueOf(z));
        bundle.putBundle("settings", c);
        bundle.putBoolean("debug_mode", ((Boolean) this.f3431a.mo13088a(C1369c.f3081eO)).booleanValue());
        m3003a(bundle, "safedk_init");
    }

    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            Map<String, String> a = C1521i.m3468a(messageData.getBundle("query_params"));
            Map<String, Object> map = BundleUtils.toMap(messageData.getBundle("post_body"));
            Map<String, String> a2 = C1521i.m3468a(messageData.getBundle("headers"));
            String string = messageData.getString("id", "");
            if (!map.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3431a.mo13136t());
            }
            this.f3431a.mo13073M().mo13215a(new C1496f.C1498a().mo13233a(messageData.getString("url")).mo13237b(messageData.getString("backup_url")).mo13234a(a).mo13240c(map).mo13238b(a2).mo13235a(((Boolean) this.f3431a.mo13088a(C1369c.f3081eO)).booleanValue()).mo13239c(string).mo13236a());
        }
    }
}

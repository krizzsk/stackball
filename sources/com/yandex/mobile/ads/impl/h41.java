package com.yandex.mobile.ads.impl;

import com.appsflyer.ServerParameters;
import com.yandex.mobile.ads.common.MobileAds;
import java.util.Map;

public class h41 {

    /* renamed from: a */
    private final String f34220a;

    /* renamed from: b */
    private final Map<String, Object> f34221b;

    /* renamed from: com.yandex.mobile.ads.impl.h41$a */
    public interface C13275a {
        /* renamed from: a */
        Map<String, Object> mo66063a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.h41$b */
    public enum C13276b {
        AD_LOADING_RESULT("ad_loading_result"),
        AD_RENDERING_RESULT("ad_rendering_result"),
        ADAPTER_AUTO_REFRESH("adapter_auto_refresh"),
        ADAPTER_INVALID("adapter_invalid"),
        ADAPTER_REQUEST("adapter_request"),
        ADAPTER_RESPONSE("adapter_response"),
        ADAPTER_BIDDER_TOKEN_REQUEST("adapter_bidder_token_request"),
        ADTUNE("adtune"),
        REQUEST("ad_request"),
        RESPONSE("ad_response"),
        VAST_REQUEST("vast_request"),
        VAST_RESPONSE("vast_response"),
        VAST_WRAPPER_REQUEST("vast_wrapper_request"),
        VAST_WRAPPER_RESPONSE("vast_wrapper_response"),
        VIDEO_AD_START("video_ad_start"),
        VIDEO_AD_COMPLETE("video_ad_complete"),
        VIDEO_AD_PLAYER_ERROR("video_ad_player_error"),
        VMAP_REQUEST("vmap_request"),
        VMAP_RESPONSE("vmap_response"),
        RENDERING_START("rendering_start"),
        IMPRESSION_TRACKING_START("impression_tracking_start"),
        IMPRESSION_TRACKING_SUCCESS("impression_tracking_success"),
        IMPRESSION_TRACKING_FAILURE("impression_tracking_failure"),
        FORCED_IMPRESSION_TRACKING_FAILURE("forced_impression_tracking_failure"),
        ADAPTER_ACTION("adapter_action"),
        CLICK("click"),
        CLOSE("close"),
        FEEDBACK("feedback"),
        DEEPLINK("deeplink"),
        SHORTCUT("shortcut"),
        SHOW_SOCIAL_ACTIONS("show_social_actions"),
        REQUIRED_ASSET_MISSING("required_asset_missing"),
        BOUND_ASSETS("bound_assets"),
        RENDERED_ASSETS("rendered_assets"),
        BINDING_FAILURE("binding_failure"),
        EXPECTED_VIEW_MISSING("expected_view_missing"),
        RETURNED_TO_APP("returned_to_app"),
        REWARD("reward"),
        VIDEO_AD_RENDERING_RESULT("video_ad_rendering_result"),
        MULTIBANNER_EVENT("multibanner_event"),
        SLIDER_AD_IMPRESSION_TRACKING_START("ad_unit_impression_tracking_start"),
        SLIDER_AD_IMPRESSION_TRACKING_SUCCESS("ad_unit_impression_tracking_success"),
        SLIDER_AD_IMPRESSION_TRACKING_FAILURE("ad_unit_impression_tracking_failure"),
        SLIDER_AD_FORCED_IMPRESSION_TRACKING_FAILURE("forced_ad_unit_impression_tracking_failure");
        

        /* renamed from: b */
        private final String f34267b;

        private C13276b(String str) {
            this.f34267b = str;
        }

        /* renamed from: a */
        public String mo67416a() {
            return this.f34267b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h41$c */
    public enum C13277c {
        SUCCESS("success"),
        ERROR("error"),
        NO_ADS("no_ads");
        

        /* renamed from: b */
        private final String f34272b;

        private C13277c(String str) {
            this.f34272b = str;
        }

        /* renamed from: a */
        public String mo67417a() {
            return this.f34272b;
        }
    }

    public h41(C13276b bVar, Map<String, Object> map) {
        map.put(ServerParameters.SDK_DATA_SDK_VERSION, MobileAds.getLibraryVersion());
        this.f34221b = map;
        this.f34220a = bVar.mo67416a();
    }

    /* renamed from: a */
    public Map<String, Object> mo67412a() {
        return this.f34221b;
    }

    /* renamed from: b */
    public String mo67413b() {
        return this.f34220a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h41.class != obj.getClass()) {
            return false;
        }
        h41 h41 = (h41) obj;
        if (!this.f34220a.equals(h41.f34220a)) {
            return false;
        }
        return this.f34221b.equals(h41.f34221b);
    }

    public int hashCode() {
        return (this.f34220a.hashCode() * 31) + this.f34221b.hashCode();
    }
}

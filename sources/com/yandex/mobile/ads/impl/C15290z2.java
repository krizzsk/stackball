package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.z2 */
public class C15290z2 {

    /* renamed from: b */
    private static final Map<C15139x2, String> f43004b = new C15291a();

    /* renamed from: a */
    private final C15230y2 f43005a;

    /* renamed from: com.yandex.mobile.ads.impl.z2$a */
    class C15291a extends HashMap<C15139x2, String> {
        C15291a() {
            put(C15139x2.AD_LOADING, "ad_loading_duration");
            put(C15139x2.IDENTIFIERS_LOADING, "identifiers_loading_duration");
            put(C15139x2.ADVERTISING_INFO_LOADING, "advertising_info_loading_duration");
            put(C15139x2.AUTOGRAB_LOADING, "autograb_loading_duration");
            put(C15139x2.BIDDING_DATA_LOADING, "bidding_data_loading_duration");
            put(C15139x2.NETWORK_REQUEST, "network_request_durations");
            put(C15139x2.IMAGE_LOADING, "image_loading_duration");
            put(C15139x2.VIDEO_CACHING, "video_caching_duration");
            put(C15139x2.ADAPTER_LOADING, "adapter_loading_duration");
            put(C15139x2.VAST_LOADING, "vast_loading_durations");
            put(C15139x2.VMAP_LOADING, "vmap_loading_duration");
        }
    }

    public C15290z2(C15230y2 y2Var) {
        this.f43005a = y2Var;
    }

    /* renamed from: a */
    public Map<String, Object> mo71149a() {
        HashMap hashMap = new HashMap();
        for (C15027w2 next : this.f43005a.mo70969b()) {
            String str = (String) ((HashMap) f43004b).get(next.mo70624a());
            if (str != null) {
                List list = (List) hashMap.get(str);
                if (list != null) {
                    list.add(next.mo70625b());
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(next.mo70625b());
                    hashMap.put(str, linkedList);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("durations", hashMap);
        return hashMap2;
    }

    /* renamed from: b */
    public Map<String, Object> mo71150b() {
        i41 i41 = new i41(new HashMap());
        for (C15027w2 next : this.f43005a.mo70969b()) {
            if (next.mo70624a().ordinal() == 3) {
                i41.mo67733b("ad_rendering_duration", next.mo70625b());
            }
        }
        return i41.mo67729a();
    }
}

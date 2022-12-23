package com.smaato.sdk.core.api;

import com.appsflyer.ServerParameters;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.sdk.InMobiSdk;
import com.smaato.sdk.core.hooks.Hook1061;
import com.smaato.sdk.core.network.NetworkHttpRequest;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.Cookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class ApiRequestMapper {
    private final String apiBaseUrl;
    private final String userAgent;

    ApiRequestMapper(String str, String str2) {
        this.apiBaseUrl = (String) Objects.requireNonNull(str);
        this.userAgent = (String) Objects.requireNonNull(str2);
    }

    public NetworkRequest map(ApiAdRequest apiAdRequest) {
        Objects.requireNonNull(apiAdRequest);
        NetworkHttpRequest.Builder method = new NetworkHttpRequest.Builder().setUrl(this.apiBaseUrl).setMethod(NetworkRequest.Method.GET);
        HashMap hashMap = new HashMap();
        hashMap.put("pub", Hook1061.onGetPublisherId(apiAdRequest.getPublisherId(), apiAdRequest.getAdSpaceId()));
        hashMap.put("adspace", apiAdRequest.getAdSpaceId());
        hashMap.put("format", apiAdRequest.getAdFormat());
        Objects.onNotNull(apiAdRequest.getCoppa(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(Cookie.COPPA_KEY, String.valueOf((Integer) obj));
            }
        });
        hashMap.put("secure", String.valueOf(apiAdRequest.getHttpsOnly()));
        Objects.onNotNull(apiAdRequest.getAdDimension(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(ViewHierarchyConstants.DIMENSION_KEY, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getWidth(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("width", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getHeight(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("height", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getMediationNetworkName(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("mnn", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getMediationNetworkSDKVersion(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("mnsv", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getMediationAdapterVersion(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("mav", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getGdpr(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("gdpr", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getGdprConsent(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(InMobiSdk.IM_GDPR_CONSENT_IAB, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getUsPrivacyString(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(CCPA.CCPA_STANDARD, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getKeywords(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("kws", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getSearchQuery(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("qs", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getGender(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(InneractiveMediationDefs.KEY_GENDER, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getAge(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("age", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getGps(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("gps", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getRegion(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("region", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getZip(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("zip", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getLanguage(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(ServerParameters.LANG, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getGeoType(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("geotype", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getAdContentRating(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("madcr", String.valueOf((String) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getCarrierName(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(ServerParameters.CARRIER, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getCarrierCode(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("carriercode", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getGoogleAdId(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("googleadid", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getGoogleDnt(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("googlednt", String.valueOf((Boolean) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getClient(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("client", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getConnection(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("connection", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getDeviceModel(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("devicemodel", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getBundle(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put(TJAdUnitConstants.String.BUNDLE, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getExtraParameters(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ApiRequestMapper.lambda$toApiParamsMap$28(this.f$0, (Map) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getExtensions(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("extensions", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getKeyValuePairs(), new Consumer(hashMap) {
            public final /* synthetic */ HashMap f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ApiRequestMapper.lambda$toApiParamsMap$30(this.f$0, (Map) obj);
            }
        });
        if (apiAdRequest.getIsSplash()) {
            hashMap.put("format", "splash");
        }
        method.setQueryItems(hashMap);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        String headerClient = apiAdRequest.getHeaderClient();
        arrayList.getClass();
        Objects.onNotNull(headerClient, new Consumer(arrayList) {
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((String) obj);
            }
        });
        hashMap2.put("X-SMT-Client", arrayList);
        hashMap2.put("User-Agent", Collections.singletonList(this.userAgent));
        method.setHeaders(hashMap2);
        return method.build();
    }

    public NetworkRequest map(String str) {
        Objects.requireNonNull(str);
        return new NetworkHttpRequest.Builder().setUrl(str).setMethod(NetworkRequest.Method.GET).build();
    }

    static /* synthetic */ void lambda$toApiParamsMap$28(HashMap hashMap, Map map) {
        for (String str : map.keySet()) {
            hashMap.put(str, String.valueOf(map.get(str)));
        }
    }

    static /* synthetic */ void lambda$toApiParamsMap$30(HashMap hashMap, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put("cs_" + ((String) entry.getKey()), Joiner.join((CharSequence) ",", (Iterable) entry.getValue()));
        }
    }

    static class ApiParams {
        ApiParams() {
        }
    }

    static class Headers {
        Headers() {
        }
    }
}

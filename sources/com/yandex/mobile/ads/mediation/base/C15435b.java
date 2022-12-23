package com.yandex.mobile.ads.mediation.base;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.base.b */
public class C15435b {
    /* renamed from: a */
    public Map<String, String> mo71388a(C15434a aVar) {
        HashMap hashMap = new HashMap();
        try {
            MediatedAdapterInfo adapterInfo = aVar.getAdapterInfo();
            String adapterVersion = adapterInfo.getAdapterVersion();
            String str = "null";
            if (adapterVersion == null) {
                adapterVersion = str;
            }
            hashMap.put("mediation_adapter_version", adapterVersion);
            String networkName = adapterInfo.getNetworkName();
            if (networkName == null) {
                networkName = str;
            }
            hashMap.put("mediation_network_name", networkName);
            String networkSdkVersion = adapterInfo.getNetworkSdkVersion();
            if (networkSdkVersion != null) {
                str = networkSdkVersion;
            }
            hashMap.put("mediation_network_sdk_version", str);
        } catch (Exception unused) {
        }
        return hashMap;
    }
}

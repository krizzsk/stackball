package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

public class zq0 implements h41.C13275a {

    /* renamed from: a */
    private final String f43299a;

    /* renamed from: b */
    private final String f43300b;

    /* renamed from: c */
    private final h41.C13275a f43301c;

    public zq0(String str, String str2, h41.C13275a aVar) {
        this.f43299a = str;
        this.f43300b = str2;
        this.f43301c = aVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_name", this.f43299a);
        hashMap.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, this.f43300b);
        h41.C13275a aVar = this.f43301c;
        if (aVar != null) {
            hashMap.putAll(aVar.mo66063a());
        }
        return hashMap;
    }
}

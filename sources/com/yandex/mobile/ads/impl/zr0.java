package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zr0 extends C13484jb<as0> {

    /* renamed from: c */
    private final ds0 f43319c = new ds0();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Object> mo67959a(C14645t1 t1Var) {
        Map<String, Object> a = super.mo67959a(t1Var);
        HashMap hashMap = (HashMap) a;
        hashMap.put("image_loading_automatically", Boolean.valueOf(t1Var.mo70111q()));
        String[] k = t1Var.mo70105k();
        if (k != null && k.length > 0) {
            hashMap.put("image_sizes", t1Var.mo70105k());
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Object> mo67960a(C14645t1 t1Var, c51<AdResponse<as0>> c51, int i) {
        h41.C13277c cVar;
        T t;
        T t2;
        Map<String, Object> a = super.mo67960a(t1Var, c51, i);
        if (204 == i) {
            cVar = h41.C13277c.NO_ADS;
        } else if (c51 == null || (t2 = c51.f31810a) == null || i != 200) {
            cVar = h41.C13277c.ERROR;
        } else {
            AdResponse adResponse = (AdResponse) t2;
            this.f43319c.getClass();
            cVar = null;
            as0 as0 = (as0) adResponse.mo64447z();
            if (as0 != null) {
                cVar = (h41.C13277c) as0.mo65858d().get("status");
            } else if (adResponse.mo64445x() == null) {
                cVar = h41.C13277c.ERROR;
            }
        }
        if (cVar != null) {
            ((HashMap) a).put("status", cVar.mo67417a());
        }
        if (!(c51 == null || (t = c51.f31810a) == null)) {
            ArrayList arrayList = (ArrayList) this.f43319c.mo66665a((AdResponse) t);
            if (!arrayList.isEmpty()) {
                ((HashMap) a).put("image_sizes", arrayList.toArray(new String[arrayList.size()]));
            }
            ArrayList arrayList2 = (ArrayList) this.f43319c.mo66667d((AdResponse) c51.f31810a);
            if (!arrayList2.isEmpty()) {
                ((HashMap) a).put("native_ad_types", arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        return a;
    }
}

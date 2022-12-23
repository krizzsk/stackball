package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C15232y3;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ir0;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.nativeads.C15504k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.nativeads.e0 */
class C15485e0 implements h41.C13275a {

    /* renamed from: a */
    private final C14645t1 f43833a;

    /* renamed from: b */
    private final List<pq0> f43834b;

    /* renamed from: c */
    private final ir0 f43835c = new ir0();

    /* renamed from: d */
    private final C15232y3 f43836d = new C15232y3();

    /* renamed from: e */
    private String f43837e;

    /* renamed from: f */
    private C15504k0.C15507c f43838f;

    C15485e0(List<pq0> list, C14645t1 t1Var) {
        this.f43834b = list;
        this.f43833a = t1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71657a(C15504k0.C15507c cVar) {
        this.f43838f = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71658a(String str) {
        this.f43837e = str;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        HashMap hashMap = new HashMap();
        C15504k0.C15507c cVar = this.f43838f;
        if (cVar != null) {
            hashMap.put("bind_type", cVar.f43896b);
        }
        String str = this.f43837e;
        if (str != null) {
            hashMap.put("native_ad_type", str);
        }
        hashMap.putAll(this.f43836d.mo70991a(this.f43833a.mo70080a()));
        ArrayList arrayList = (ArrayList) this.f43835c.mo67886a(this.f43834b);
        if (arrayList.size() > 0) {
            hashMap.put("image_sizes", arrayList.toArray(new String[arrayList.size()]));
        }
        return hashMap;
    }
}

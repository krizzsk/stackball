package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.aa */
public final class C12366aa {

    /* renamed from: a */
    private final List<C13690k9> f30478a;

    /* renamed from: b */
    private C15550v<?> f30479b;

    public C12366aa(List<? extends C13690k9> list) {
        Intrinsics.checkNotNullParameter(list, "assets");
        this.f30478a = list;
    }

    /* renamed from: a */
    public final void mo65699a(C15550v<?> vVar) {
        this.f30479b = vVar;
    }

    /* renamed from: a */
    public final Map<String, Object> mo65698a() {
        C13838l9 a;
        String a2;
        HashMap hashMap = new HashMap();
        for (C13690k9 next : this.f30478a) {
            String b = next.mo68167b();
            Intrinsics.checkNotNullExpressionValue(b, "asset.name");
            C15550v<?> vVar = this.f30479b;
            if (!(vVar == null || (a = vVar.mo71921a(next)) == null || !a.mo67821b())) {
                HashMap hashMap2 = new HashMap();
                io1 c = a.mo67822c();
                if (c != null) {
                    hashMap2.put("width", Integer.valueOf(c.mo67840b()));
                    hashMap2.put("height", Integer.valueOf(c.mo67839a()));
                }
                gm0.C13214a aVar = null;
                il0 il0 = a instanceof il0 ? (il0) a : null;
                if (il0 != null) {
                    aVar = il0.mo67826e();
                }
                if (!(aVar == null || (a2 = aVar.mo67329a()) == null)) {
                    hashMap2.put("value_type", a2);
                }
                hashMap.put(b, hashMap2);
            }
        }
        return hashMap;
    }
}

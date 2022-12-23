package com.yandex.metrica.impl.p265ob;

import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.billing_interface.C10068a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.m */
public final class C11510m implements C11727s {

    /* renamed from: a */
    private boolean f27704a;

    /* renamed from: b */
    private final Map<String, C10068a> f27705b;

    /* renamed from: c */
    private final C11800u f27706c;

    public C11510m(C11800u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "storage");
        this.f27706c = uVar;
        C11901w3 w3Var = (C11901w3) uVar;
        this.f27704a = w3Var.mo64009b();
        List<C10068a> a = w3Var.mo64007a();
        Intrinsics.checkNotNullExpressionValue(a, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : a) {
            linkedHashMap.put(((C10068a) next).f24200b, next);
        }
        this.f27705b = linkedHashMap;
    }

    /* renamed from: a */
    public void mo63053a(Map<String, ? extends C10068a> map) {
        Intrinsics.checkNotNullParameter(map, "history");
        for (C10068a aVar : map.values()) {
            Map<String, C10068a> map2 = this.f27705b;
            String str = aVar.f24200b;
            Intrinsics.checkNotNullExpressionValue(str, "billingInfo.sku");
            map2.put(str, aVar);
        }
        ((C11901w3) this.f27706c).mo64008a(CollectionsKt.toList(this.f27705b.values()), this.f27704a);
    }

    /* renamed from: b */
    public void mo63055b() {
        if (!this.f27704a) {
            this.f27704a = true;
            ((C11901w3) this.f27706c).mo64008a(CollectionsKt.toList(this.f27705b.values()), this.f27704a);
        }
    }

    /* renamed from: a */
    public C10068a mo63052a(String str) {
        Intrinsics.checkNotNullParameter(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        return this.f27705b.get(str);
    }

    /* renamed from: a */
    public boolean mo63054a() {
        return this.f27704a;
    }
}

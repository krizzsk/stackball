package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class t31 {

    /* renamed from: a */
    private final List<C13690k9> f40227a;

    public t31(List<? extends C13690k9> list) {
        Intrinsics.checkNotNullParameter(list, "assets");
        this.f40227a = list;
    }

    /* renamed from: a */
    public final List<String> mo70124a(C15550v<?> vVar) {
        Intrinsics.checkNotNullParameter(vVar, "viewAdapter");
        List<C13690k9> list = this.f40227a;
        ArrayList<C13690k9> arrayList = new ArrayList<>();
        for (T next : list) {
            C13838l9 a = vVar.mo71921a((C13690k9) next);
            if (a == null ? false : a.mo67821b()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C13690k9 b : arrayList) {
            arrayList2.add(b.mo68167b());
        }
        return arrayList2;
    }
}

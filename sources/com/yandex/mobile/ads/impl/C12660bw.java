package com.yandex.mobile.ads.impl;

import androidx.collection.ArrayMap;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.bw */
public class C12660bw {

    /* renamed from: a */
    private final ArrayMap<C12758cr, C13253gw> f31601a = new ArrayMap<>();

    /* renamed from: a */
    public List<C15177xl> mo66131a(C12758cr crVar, String str) {
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(str, "id");
        if (this.f31601a.get(crVar) == null) {
            return null;
        }
        throw null;
    }

    /* renamed from: a */
    public C13253gw mo66130a(C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        return this.f31601a.get(crVar);
    }
}

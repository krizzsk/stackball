package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13091fq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.hp */
public final class C13338hp {

    /* renamed from: a */
    public static final C13338hp f34501a = new C13338hp();

    private C13338hp() {
    }

    /* renamed from: a */
    public final boolean mo67586a(C15177xl xlVar, C15177xl xlVar2, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C14697tn tnVar = null;
        C14697tn b = xlVar == null ? null : xlVar.mo70911b();
        if (xlVar2 != null) {
            tnVar = xlVar2.mo70911b();
        }
        return mo67585a(b, tnVar, j50);
    }

    /* renamed from: a */
    public final boolean mo67585a(C14697tn tnVar, C14697tn tnVar2, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Object obj = null;
        if (!Intrinsics.areEqual((Object) tnVar == null ? null : tnVar.getClass(), (Object) tnVar2 == null ? null : tnVar2.getClass())) {
            return false;
        }
        if (tnVar == null || tnVar2 == null || tnVar == tnVar2) {
            return true;
        }
        if (tnVar.mo66144c() != null && tnVar2.mo66144c() != null && !Intrinsics.areEqual((Object) tnVar.mo66144c(), (Object) tnVar2.mo66144c())) {
            return false;
        }
        if ((tnVar instanceof C14406qq) && (tnVar2 instanceof C14406qq) && !Intrinsics.areEqual((Object) ((C14406qq) tnVar).f39250h, (Object) ((C14406qq) tnVar2).f39250h)) {
            return false;
        }
        List<C15177xl> a = m37038a(tnVar, j50);
        List<C15177xl> a2 = m37038a(tnVar2, j50);
        if (a.size() != a2.size()) {
            return false;
        }
        List<Pair<T, R>> zip = CollectionsKt.zip(a, a2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(zip, 10));
        for (Pair pair : zip) {
            arrayList.add(Boolean.valueOf(f34501a.mo67586a((C15177xl) pair.getFirst(), (C15177xl) pair.getSecond(), j50)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            while (it.hasNext()) {
                obj = Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) it.next()).booleanValue());
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    private final List<C15177xl> m37038a(C14697tn tnVar, j50 j50) {
        if (tnVar instanceof C12997et) {
            return CollectionsKt.emptyList();
        }
        if (tnVar instanceof C13885ls) {
            return CollectionsKt.emptyList();
        }
        if (tnVar instanceof C13915lz) {
            return CollectionsKt.emptyList();
        }
        if (tnVar instanceof C14841uw) {
            return CollectionsKt.emptyList();
        }
        if (tnVar instanceof C13091fq) {
            C13091fq fqVar = (C13091fq) tnVar;
            if (!fqVar.f33536h.mo66924a(j50).booleanValue() || fqVar.f33550v.mo66924a(j50) != C13091fq.C13100i.VERTICAL) {
                return fqVar.f33547s;
            }
            return CollectionsKt.emptyList();
        } else if (tnVar instanceof C14924vs) {
            return ((C14924vs) tnVar).f41511s;
        } else {
            if (tnVar instanceof C13111fs) {
                return CollectionsKt.emptyList();
            }
            if (tnVar instanceof C14215ov) {
                return CollectionsKt.emptyList();
            }
            if (tnVar instanceof C12667bz) {
                return CollectionsKt.emptyList();
            }
            if (tnVar instanceof C13358hy) {
                return CollectionsKt.emptyList();
            }
            if (tnVar instanceof C14406qq) {
                return CollectionsKt.emptyList();
            }
            return CollectionsKt.emptyList();
        }
    }
}

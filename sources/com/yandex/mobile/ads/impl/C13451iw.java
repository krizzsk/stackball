package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C13358hy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.iw */
public final class C13451iw {

    /* renamed from: a */
    public static final C13451iw f35055a = new C13451iw();

    private C13451iw() {
    }

    /* renamed from: a */
    public final C14429qy mo67896a(View view, C14729ty tyVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(tyVar, "path");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C14429qy) {
            C14429qy qyVar = (C14429qy) view;
            C14729ty e = qyVar.mo69662e();
            if (Intrinsics.areEqual((Object) e == null ? null : e.mo70246b(), (Object) tyVar.mo70246b())) {
                return qyVar;
            }
        }
        for (View a : ViewGroupKt.getChildren((ViewGroup) view)) {
            C14429qy a2 = mo67896a(a, tyVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C15177xl mo67897a(C15177xl xlVar, C14729ty tyVar) {
        Intrinsics.checkNotNullParameter(xlVar, "<this>");
        Intrinsics.checkNotNullParameter(tyVar, "path");
        List<Pair<String, String>> c = tyVar.mo70248c();
        if (c.isEmpty()) {
            return null;
        }
        for (Pair component1 : c) {
            xlVar = f35055a.m37592a(xlVar, (String) component1.component1());
            if (xlVar == null) {
                return null;
            }
        }
        return xlVar;
    }

    /* renamed from: a */
    private final C15177xl m37592a(C15177xl xlVar, String str) {
        boolean z;
        C14697tn b = xlVar.mo70911b();
        if (b instanceof C13358hy) {
            C13358hy hyVar = (C13358hy) b;
            if (Intrinsics.areEqual((Object) hyVar.f34676i, (Object) str)) {
                return xlVar;
            }
            List<C13358hy.C13365g> list = hyVar.f34685r;
            ArrayList arrayList = new ArrayList();
            for (C13358hy.C13365g gVar : list) {
                C15177xl xlVar2 = gVar.f34704c;
                if (xlVar2 != null) {
                    arrayList.add(xlVar2);
                }
            }
            return m37593a((Iterable<? extends C15177xl>) arrayList, str);
        } else if (b instanceof C12667bz) {
            List<C12667bz.C12674g> list2 = ((C12667bz) b).f31682n;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (C12667bz.C12674g gVar2 : list2) {
                arrayList2.add(gVar2.f31703a);
            }
            return m37593a((Iterable<? extends C15177xl>) arrayList2, str);
        } else if (b instanceof C13091fq) {
            return m37593a((Iterable<? extends C15177xl>) ((C13091fq) b).f33547s, str);
        } else {
            if (b instanceof C14924vs) {
                return m37593a((Iterable<? extends C15177xl>) ((C14924vs) b).f41511s, str);
            }
            if (b instanceof C13111fs) {
                return m37593a((Iterable<? extends C15177xl>) ((C13111fs) b).f33660q, str);
            }
            if (b instanceof C14215ov) {
                return m37593a((Iterable<? extends C15177xl>) ((C14215ov) b).f38363n, str);
            }
            boolean z2 = true;
            if (b instanceof C13915lz ? true : b instanceof C14406qq ? true : b instanceof C12997et ? true : b instanceof C14141nx) {
                z = true;
            } else {
                z = b instanceof C13885ls;
            }
            if (!(z ? true : b instanceof C15107wt)) {
                z2 = b instanceof C14841uw;
            }
            if (z2) {
                return null;
            }
            Objects.toString(b);
            return null;
        }
    }

    /* renamed from: a */
    private final C15177xl m37593a(Iterable<? extends C15177xl> iterable, String str) {
        for (C15177xl a : iterable) {
            C15177xl a2 = f35055a.m37592a(a, str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}

package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewGroupKt;
import com.yandex.mobile.ads.impl.C13358hy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class t00 {
    /* renamed from: a */
    public static final Interpolator m42195a(C13525jn jnVar) {
        Intrinsics.checkNotNullParameter(jnVar, "<this>");
        int ordinal = jnVar.ordinal();
        if (ordinal == 0) {
            return new LinearInterpolator();
        }
        if (ordinal == 1) {
            return new w20();
        }
        if (ordinal == 2) {
            return new u20();
        }
        if (ordinal == 3) {
            return new x20();
        }
        if (ordinal == 4) {
            return new v20();
        }
        if (ordinal == 5) {
            return new za1();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final void m42197a(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        view.requestLayout();
        if (view instanceof ViewGroup) {
            for (View a : ViewGroupKt.getChildren((ViewGroup) view)) {
                m42197a(a);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m42198a(C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(tnVar, "<this>");
        if (tnVar.mo66145d() != null || tnVar.mo66163u() != null || tnVar.mo66161s() != null) {
            return true;
        }
        if (!(tnVar instanceof C13915lz) && !(tnVar instanceof C12997et) && !(tnVar instanceof C13885ls) && !(tnVar instanceof C14841uw) && !(tnVar instanceof C15107wt)) {
            if (tnVar instanceof C13091fq) {
                List<C15177xl> list = ((C13091fq) tnVar).f33547s;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C15177xl b : list) {
                    arrayList.add(Boolean.valueOf(m42198a(b.mo70911b())));
                }
                return arrayList.contains(Boolean.TRUE);
            } else if (tnVar instanceof C14924vs) {
                List<C15177xl> list2 = ((C14924vs) tnVar).f41511s;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (C15177xl b2 : list2) {
                    arrayList2.add(Boolean.valueOf(m42198a(b2.mo70911b())));
                }
                return arrayList2.contains(Boolean.TRUE);
            } else if (!(tnVar instanceof C13358hy) && !(tnVar instanceof C13111fs) && !(tnVar instanceof C14215ov) && !(tnVar instanceof C12667bz)) {
                boolean z = tnVar instanceof C14406qq;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final C13358hy.C13365g m42196a(C13358hy hyVar, j50 j50) {
        Intrinsics.checkNotNullParameter(hyVar, "<this>");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        f50<String> f50 = hyVar.f34675h;
        T t = null;
        if (f50 != null) {
            Iterator<T> it = hyVar.f34685r.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (Intrinsics.areEqual((Object) ((C13358hy.C13365g) next).f34705d, (Object) f50.mo66924a(j50))) {
                    t = next;
                    break;
                }
            }
            t = (C13358hy.C13365g) t;
        }
        return t == null ? hyVar.f34685r.get(0) : t;
    }
}

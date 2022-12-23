package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

public final class xn1 {

    /* renamed from: a */
    public static final xn1 f42644a = new xn1();

    /* renamed from: com.yandex.mobile.ads.impl.xn1$a */
    static final class C15195a extends Lambda implements Function1<Pair<? extends View, ? extends View>, Boolean> {

        /* renamed from: b */
        public static final C15195a f42645b = new C15195a();

        C15195a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Pair pair = (Pair) obj;
            Intrinsics.checkNotNullParameter(pair, "it");
            return Boolean.valueOf(xn1.f42644a.mo70926a((View) pair.getFirst(), (View) pair.getSecond()));
        }
    }

    private xn1() {
    }

    /* renamed from: a */
    public final boolean mo70926a(View view, View view2) {
        R r;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view2, "other");
        if (!Intrinsics.areEqual((Object) view.getClass(), (Object) view2.getClass())) {
            return false;
        }
        if (!(view instanceof ViewGroup) || !(view2 instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ViewGroup viewGroup2 = (ViewGroup) view2;
        if (viewGroup.getChildCount() != viewGroup2.getChildCount()) {
            return false;
        }
        Iterator<R> it = SequencesKt.map(SequencesKt.zip(ViewGroupKt.getChildren(viewGroup), ViewGroupKt.getChildren(viewGroup2)), C15195a.f42645b).iterator();
        if (!it.hasNext()) {
            r = null;
        } else {
            R next = it.next();
            while (it.hasNext()) {
                next = Boolean.valueOf(((Boolean) next).booleanValue() && ((Boolean) it.next()).booleanValue());
            }
            r = next;
        }
        Boolean bool = (Boolean) r;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}

package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class hq0<T> implements n50<T> {

    /* renamed from: a */
    private final String f34511a;

    /* renamed from: b */
    private final List<f50<T>> f34512b;

    /* renamed from: c */
    private final gj0<T> f34513c;

    /* renamed from: d */
    private final ny0 f34514d;

    /* renamed from: e */
    private List<? extends T> f34515e;

    /* renamed from: com.yandex.mobile.ads.impl.hq0$a */
    static final class C13340a extends Lambda implements Function1<T, Unit> {

        /* renamed from: b */
        final /* synthetic */ Function1<List<? extends T>, Unit> f34516b;

        /* renamed from: c */
        final /* synthetic */ hq0<T> f34517c;

        /* renamed from: d */
        final /* synthetic */ j50 f34518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13340a(Function1<? super List<? extends T>, Unit> function1, hq0<T> hq0, j50 j50) {
            super(1);
            this.f34516b = function1;
            this.f34517c = hq0;
            this.f34518d = j50;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$noName_0");
            this.f34516b.invoke(this.f34517c.mo67589a(this.f34518d));
            return Unit.INSTANCE;
        }
    }

    public hq0(String str, List<? extends f50<T>> list, gj0<T> gj0, ny0 ny0) {
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(list, "expressionsList");
        Intrinsics.checkNotNullParameter(gj0, "listValidator");
        Intrinsics.checkNotNullParameter(ny0, "logger");
        this.f34511a = str;
        this.f34512b = list;
        this.f34513c = gj0;
        this.f34514d = ny0;
    }

    /* renamed from: b */
    private final List<T> m37043b(j50 j50) {
        List<f50<T>> list = this.f34512b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (f50 a : list) {
            arrayList.add(a.mo66924a(j50));
        }
        if (this.f34513c.mo65494a(arrayList)) {
            return arrayList;
        }
        throw py0.m40996a(this.f34511a, arrayList);
    }

    /* renamed from: a */
    public List<T> mo67589a(j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        try {
            List<? extends T> b = m37043b(j50);
            this.f34515e = b;
            return b;
        } catch (oy0 e) {
            this.f34514d.mo65565c(e);
            List<? extends T> list = this.f34515e;
            if (list != null) {
                return list;
            }
            throw e;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof hq0) && Intrinsics.areEqual((Object) this.f34512b, (Object) ((hq0) obj).f34512b);
    }

    /* renamed from: a */
    public C15055wl mo67588a(j50 j50, Function1<? super List<? extends T>, Unit> function1) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Intrinsics.checkNotNullParameter(function1, "callback");
        C13340a aVar = new C13340a(function1, this, j50);
        if (this.f34512b.size() == 1) {
            return ((f50) CollectionsKt.first(this.f34512b)).mo66923a(j50, aVar);
        }
        C14592sg sgVar = new C14592sg();
        for (f50 a : this.f34512b) {
            sgVar.mo69970a(a.mo66923a(j50, aVar));
        }
        return sgVar;
    }
}

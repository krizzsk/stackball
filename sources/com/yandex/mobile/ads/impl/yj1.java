package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class yj1 {

    /* renamed from: a */
    private final List<r50> f42878a;

    /* renamed from: b */
    private final List<qe1> f42879b;

    /* renamed from: com.yandex.mobile.ads.impl.yj1$a */
    public static final class C15255a {

        /* renamed from: a */
        private List<r50> f42880a = CollectionsKt.emptyList();

        /* renamed from: b */
        private List<qe1> f42881b = CollectionsKt.emptyList();

        /* renamed from: a */
        public final C15255a mo71093a(List<r50> list) {
            Intrinsics.checkNotNullParameter(list, "extensions");
            this.f42880a = list;
            return this;
        }

        /* renamed from: b */
        public final C15255a mo71095b(List<qe1> list) {
            Intrinsics.checkNotNullParameter(list, "trackingEvents");
            this.f42881b = list;
            return this;
        }

        /* renamed from: a */
        public final yj1 mo71094a() {
            return new yj1(this.f42880a, this.f42881b, (DefaultConstructorMarker) null);
        }
    }

    private yj1(List<r50> list, List<qe1> list2) {
        this.f42878a = list;
        this.f42879b = list2;
    }

    public /* synthetic */ yj1(List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2);
    }

    /* renamed from: a */
    public final List<r50> mo71091a() {
        return this.f42878a;
    }

    /* renamed from: b */
    public final List<qe1> mo71092b() {
        return this.f42879b;
    }
}

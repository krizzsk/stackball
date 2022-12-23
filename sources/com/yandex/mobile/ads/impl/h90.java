package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C12066R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

public class h90 extends ViewGroup {

    /* renamed from: a */
    private int f34300a;

    /* renamed from: b */
    private final C13288c f34301b;

    /* renamed from: c */
    private int f34302c;

    /* renamed from: d */
    private boolean f34303d;

    /* renamed from: com.yandex.mobile.ads.impl.h90$a */
    private static final class C13286a {

        /* renamed from: a */
        private final int f34304a;

        /* renamed from: b */
        private final int f34305b;

        /* renamed from: c */
        private final int f34306c;

        /* renamed from: d */
        private int f34307d;

        /* renamed from: e */
        private int f34308e;

        public C13286a(int i, int i2, int i3, int i4, int i5) {
            this.f34304a = i;
            this.f34305b = i2;
            this.f34306c = i3;
            this.f34307d = i4;
            this.f34308e = i5;
        }

        /* renamed from: a */
        public final int mo67454a() {
            return this.f34305b;
        }

        /* renamed from: b */
        public final int mo67456b() {
            return this.f34307d;
        }

        /* renamed from: c */
        public final int mo67457c() {
            return this.f34306c;
        }

        /* renamed from: d */
        public final int mo67458d() {
            return this.f34308e;
        }

        /* renamed from: e */
        public final int mo67459e() {
            return this.f34304a;
        }

        /* renamed from: a */
        public final void mo67455a(int i) {
            this.f34308e = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h90$b */
    private static final class C13287b {

        /* renamed from: a */
        private final int f34309a;

        /* renamed from: b */
        private final int f34310b;

        /* renamed from: c */
        private final int f34311c;

        /* renamed from: d */
        private final int f34312d;

        /* renamed from: e */
        private final int f34313e;

        /* renamed from: f */
        private final float f34314f;

        public C13287b(int i, int i2, int i3, int i4, int i5, float f) {
            this.f34309a = i;
            this.f34310b = i2;
            this.f34311c = i3;
            this.f34312d = i4;
            this.f34313e = i5;
            this.f34314f = f;
        }

        /* renamed from: a */
        public final int mo67460a() {
            return this.f34309a;
        }

        /* renamed from: b */
        public final int mo67461b() {
            return this.f34310b + this.f34311c + this.f34312d;
        }

        /* renamed from: c */
        public final int mo67462c() {
            return this.f34313e;
        }

        /* renamed from: d */
        public final int mo67463d() {
            return mo67461b() / this.f34313e;
        }

        /* renamed from: e */
        public final float mo67464e() {
            return this.f34314f;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h90$c */
    private final class C13288c {

        /* renamed from: a */
        private int f34315a = 1;

        /* renamed from: b */
        private final z41<List<C13286a>> f34316b = new z41<>(new C13289a(this));

        /* renamed from: c */
        private final z41<List<C13293e>> f34317c = new z41<>(new C13290b(this));

        /* renamed from: d */
        private final z41<List<C13293e>> f34318d = new z41<>(new C13291c(this));

        /* renamed from: e */
        private final C13294f f34319e = new C13294f(0, 0, 3);

        /* renamed from: f */
        private final C13294f f34320f = new C13294f(0, 0, 3);

        /* renamed from: g */
        final /* synthetic */ h90 f34321g;

        /* renamed from: com.yandex.mobile.ads.impl.h90$c$a */
        static final class C13289a extends Lambda implements Function0<List<? extends C13286a>> {

            /* renamed from: b */
            final /* synthetic */ C13288c f34322b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13289a(C13288c cVar) {
                super(0);
                this.f34322b = cVar;
            }

            public Object invoke() {
                return C13288c.m36838a(this.f34322b);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.h90$c$b */
        static final class C13290b extends Lambda implements Function0<List<? extends C13293e>> {

            /* renamed from: b */
            final /* synthetic */ C13288c f34323b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13290b(C13288c cVar) {
                super(0);
                this.f34323b = cVar;
            }

            public Object invoke() {
                return C13288c.m36842b(this.f34323b);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.h90$c$c */
        static final class C13291c extends Lambda implements Function0<List<? extends C13293e>> {

            /* renamed from: b */
            final /* synthetic */ C13288c f34324b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13291c(C13288c cVar) {
                super(0);
                this.f34324b = cVar;
            }

            public Object invoke() {
                return C13288c.m36843c(this.f34324b);
            }
        }

        public C13288c(h90 h90) {
            Intrinsics.checkNotNullParameter(h90, "this$0");
            this.f34321g = h90;
        }

        /* renamed from: a */
        public final List<C13286a> mo67466a() {
            return this.f34316b.mo71154a();
        }

        /* renamed from: b */
        public final List<C13293e> mo67468b() {
            return this.f34317c.mo71154a();
        }

        /* renamed from: c */
        public final void mo67470c(int i) {
            if (i > 0 && this.f34315a != i) {
                this.f34315a = i;
                this.f34316b.mo71156c();
                this.f34317c.mo71156c();
                this.f34318d.mo71156c();
            }
        }

        /* renamed from: d */
        public final int mo67471d() {
            if (this.f34317c.mo71155b()) {
                return m36841b(this.f34317c.mo71154a());
            }
            return 0;
        }

        /* renamed from: e */
        public final List<C13293e> mo67472e() {
            return this.f34318d.mo71154a();
        }

        /* renamed from: f */
        public final void mo67473f() {
            this.f34317c.mo71156c();
            this.f34318d.mo71156c();
        }

        /* renamed from: g */
        public final void mo67474g() {
            this.f34316b.mo71156c();
            this.f34317c.mo71156c();
            this.f34318d.mo71156c();
        }

        /* renamed from: a */
        public final int mo67465a(int i) {
            this.f34320f.mo67495a(i);
            return Math.max(this.f34320f.mo67496b(), Math.min(m36841b(mo67472e()), this.f34320f.mo67494a()));
        }

        /* renamed from: b */
        public final int mo67467b(int i) {
            this.f34319e.mo67495a(i);
            return Math.max(this.f34319e.mo67496b(), Math.min(m36841b(mo67468b()), this.f34319e.mo67494a()));
        }

        /* renamed from: a */
        public static final List m36838a(C13288c cVar) {
            Integer num;
            C13288c cVar2 = cVar;
            if (cVar2.f34321g.getChildCount() == 0) {
                return CollectionsKt.emptyList();
            }
            int i = cVar2.f34315a;
            ArrayList arrayList = new ArrayList(cVar2.f34321g.getChildCount());
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            h90 h90 = cVar2.f34321g;
            int childCount = h90.getChildCount();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i4 < childCount) {
                int i5 = i4 + 1;
                View childAt = h90.getChildAt(i4);
                if (childAt.getVisibility() == 8) {
                    i4 = i5;
                } else {
                    Intrinsics.checkNotNullExpressionValue(childAt, "child");
                    Integer minOrNull = ArraysKt.minOrNull(iArr2);
                    int intValue = minOrNull == null ? 0 : minOrNull.intValue();
                    int indexOf = ArraysKt.indexOf(iArr2, intValue);
                    int i6 = i3 + intValue;
                    IntRange until = RangesKt.until(i2, i);
                    int first = until.getFirst();
                    int last = until.getLast();
                    if (first <= last) {
                        while (true) {
                            int i7 = first + 1;
                            iArr2[first] = Math.max(i2, iArr2[first] - intValue);
                            if (first == last) {
                                break;
                            }
                            first = i7;
                        }
                    }
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        C13292d dVar = (C13292d) layoutParams;
                        int min = Math.min(dVar.mo67475a(), i - indexOf);
                        int d = dVar.mo67483d();
                        C13286a aVar = r7;
                        C13286a aVar2 = new C13286a(i4, indexOf, i6, min, d);
                        arrayList.add(aVar);
                        int i8 = indexOf + min;
                        while (indexOf < i8) {
                            int i9 = indexOf + 1;
                            if (iArr2[indexOf] > 0) {
                                Object obj = arrayList.get(iArr[indexOf]);
                                Intrinsics.checkNotNullExpressionValue(obj, "cells[cellIndices[i]]");
                                C13286a aVar3 = (C13286a) obj;
                                int a = aVar3.mo67454a();
                                int b = aVar3.mo67456b() + a;
                                while (a < b) {
                                    int i10 = iArr2[a];
                                    iArr2[a] = 0;
                                    a++;
                                }
                                aVar3.mo67455a(i6 - aVar3.mo67457c());
                            }
                            iArr[indexOf] = i4;
                            iArr2[indexOf] = d;
                            indexOf = i9;
                        }
                        i4 = i5;
                        i3 = i6;
                        i2 = 0;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                    }
                }
            }
            int i11 = 1;
            if (i == 0) {
                num = null;
            } else {
                int i12 = iArr2[0];
                int lastIndex = ArraysKt.getLastIndex(iArr2);
                if (lastIndex == 0) {
                    num = Integer.valueOf(i12);
                } else {
                    int max = Math.max(1, i12);
                    if (1 <= lastIndex) {
                        int i13 = 1;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = iArr2[i13];
                            int max2 = Math.max(1, i15);
                            if (max > max2) {
                                i12 = i15;
                                max = max2;
                            }
                            if (i13 == lastIndex) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    num = Integer.valueOf(i12);
                }
            }
            if (num != null) {
                i11 = num.intValue();
            }
            int c = ((C13286a) CollectionsKt.last(arrayList)).mo67457c() + i11;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                C13286a aVar4 = (C13286a) arrayList.get(i16);
                if (aVar4.mo67457c() + aVar4.mo67458d() > c) {
                    aVar4.mo67455a(c - aVar4.mo67457c());
                }
                i16 = i17;
            }
            return arrayList;
        }

        /* renamed from: b */
        private final int m36841b(List<C13293e> list) {
            if (list.isEmpty()) {
                return 0;
            }
            C13293e eVar = (C13293e) CollectionsKt.last(list);
            return eVar.mo67488a() + eVar.mo67491b();
        }

        /* renamed from: c */
        public static final List m36843c(C13288c cVar) {
            int i;
            int i2;
            float f;
            int i3;
            int i4;
            C13288c cVar2 = cVar;
            List<C13286a> a = cVar.mo67466a();
            if (a.isEmpty()) {
                i = 0;
            } else {
                C13286a aVar = (C13286a) CollectionsKt.last(a);
                i = aVar.mo67457c() + aVar.mo67458d();
            }
            C13294f fVar = cVar2.f34320f;
            List a2 = cVar2.f34316b.mo71154a();
            ArrayList arrayList = new ArrayList(i);
            int i5 = 0;
            while (i5 < i) {
                i5++;
                arrayList.add(new C13293e());
            }
            h90 h90 = cVar2.f34321g;
            int size = a2.size();
            int i6 = 0;
            while (true) {
                int i7 = 1;
                if (i6 < size) {
                    int i8 = i6 + 1;
                    C13286a aVar2 = (C13286a) a2.get(i6);
                    View childAt = h90.getChildAt(aVar2.mo67459e());
                    Intrinsics.checkNotNullExpressionValue(childAt, "child");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        C13292d dVar = (C13292d) layoutParams;
                        int c = aVar2.mo67457c();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i9 = dVar.topMargin;
                        C13287b bVar = new C13287b(c, measuredHeight, i9, dVar.bottomMargin, aVar2.mo67458d(), dVar.mo67484e());
                        if (bVar.mo67462c() == 1) {
                            ((C13293e) arrayList.get(bVar.mo67460a())).mo67490a(bVar.mo67461b(), bVar.mo67464e());
                        } else {
                            int c2 = bVar.mo67462c() - 1;
                            float e = bVar.mo67464e() / ((float) bVar.mo67462c());
                            if (c2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    C13293e.m36864a((C13293e) arrayList.get(bVar.mo67460a() + i10), 0, e, 1);
                                    if (i10 == c2) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        }
                        i6 = i8;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    h90 h902 = cVar2.f34321g;
                    int size2 = a2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        C13286a aVar3 = (C13286a) a2.get(i12);
                        View childAt2 = h902.getChildAt(aVar3.mo67459e());
                        Intrinsics.checkNotNullExpressionValue(childAt2, "child");
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        if (layoutParams2 != null) {
                            C13292d dVar2 = (C13292d) layoutParams2;
                            int c3 = aVar3.mo67457c();
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            int i14 = dVar2.topMargin;
                            C13287b bVar2 = r15;
                            C13287b bVar3 = new C13287b(c3, measuredHeight2, i14, dVar2.bottomMargin, aVar3.mo67458d(), dVar2.mo67484e());
                            if (bVar2.mo67462c() > 1) {
                                arrayList2.add(bVar2);
                            }
                            i12 = i13;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                        }
                    }
                    CollectionsKt.sortWith(arrayList2, C13295g.f34335b);
                    int size3 = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        int i16 = i15 + 1;
                        C13287b bVar4 = (C13287b) arrayList2.get(i15);
                        int a3 = bVar4.mo67460a();
                        int a4 = (bVar4.mo67460a() + bVar4.mo67462c()) - i7;
                        int b = bVar4.mo67461b();
                        if (a3 <= a4) {
                            int i17 = a3;
                            i3 = b;
                            f = 0.0f;
                            i2 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                C13293e eVar = (C13293e) arrayList.get(i17);
                                b -= eVar.mo67491b();
                                if (eVar.mo67493d()) {
                                    f += eVar.mo67492c();
                                } else {
                                    if (eVar.mo67491b() == 0) {
                                        i2++;
                                    }
                                    i3 -= eVar.mo67491b();
                                }
                                if (i17 == a4) {
                                    break;
                                }
                                i17 = i18;
                            }
                        } else {
                            i3 = b;
                            f = 0.0f;
                            i2 = 0;
                        }
                        if (f > 0.0f) {
                            if (a3 <= a4) {
                                while (true) {
                                    int i19 = a3 + 1;
                                    C13293e eVar2 = (C13293e) arrayList.get(a3);
                                    if (eVar2.mo67493d()) {
                                        i4 = i3;
                                        C13293e.m36864a(eVar2, (int) ((float) Math.ceil((double) ((eVar2.mo67492c() / f) * ((float) i3)))), 0.0f, 2);
                                    } else {
                                        i4 = i3;
                                    }
                                    if (a3 == a4) {
                                        break;
                                    }
                                    a3 = i19;
                                    i3 = i4;
                                }
                            }
                        } else if (b > 0 && a3 <= a4) {
                            while (true) {
                                int i20 = a3 + 1;
                                C13293e eVar3 = (C13293e) arrayList.get(a3);
                                if (i2 <= 0) {
                                    C13293e.m36864a(eVar3, eVar3.mo67491b() + (b / bVar4.mo67462c()), 0.0f, 2);
                                } else if (eVar3.mo67491b() == 0 && !eVar3.mo67493d()) {
                                    C13293e.m36864a(eVar3, eVar3.mo67491b() + (b / i2), 0.0f, 2);
                                }
                                if (a3 == a4) {
                                    break;
                                }
                                a3 = i20;
                            }
                        }
                        i15 = i16;
                        i7 = 1;
                    }
                    cVar2.m36840a(arrayList, fVar);
                    cVar2.m36839a((List<C13293e>) arrayList);
                    return arrayList;
                }
            }
        }

        /* renamed from: b */
        public static final List m36842b(C13288c cVar) {
            int i;
            float f;
            int i2;
            int i3;
            C13288c cVar2 = cVar;
            int i4 = cVar2.f34315a;
            C13294f fVar = cVar2.f34319e;
            List a = cVar2.f34316b.mo71154a();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 < i4) {
                i5++;
                arrayList.add(new C13293e());
            }
            h90 h90 = cVar2.f34321g;
            int size = a.size();
            int i6 = 0;
            while (true) {
                int i7 = 1;
                if (i6 < size) {
                    int i8 = i6 + 1;
                    C13286a aVar = (C13286a) a.get(i6);
                    View childAt = h90.getChildAt(aVar.mo67459e());
                    Intrinsics.checkNotNullExpressionValue(childAt, "child");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        C13292d dVar = (C13292d) layoutParams;
                        int a2 = aVar.mo67454a();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int i9 = dVar.leftMargin;
                        C13287b bVar = new C13287b(a2, measuredWidth, i9, dVar.rightMargin, aVar.mo67456b(), dVar.mo67478b());
                        if (bVar.mo67462c() == 1) {
                            ((C13293e) arrayList.get(bVar.mo67460a())).mo67490a(bVar.mo67461b(), bVar.mo67464e());
                        } else {
                            int c = bVar.mo67462c() - 1;
                            float e = bVar.mo67464e() / ((float) bVar.mo67462c());
                            if (c >= 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    C13293e.m36864a((C13293e) arrayList.get(bVar.mo67460a() + i10), 0, e, 1);
                                    if (i10 == c) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        }
                        i6 = i8;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    h90 h902 = cVar2.f34321g;
                    int size2 = a.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        C13286a aVar2 = (C13286a) a.get(i12);
                        View childAt2 = h902.getChildAt(aVar2.mo67459e());
                        Intrinsics.checkNotNullExpressionValue(childAt2, "child");
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        if (layoutParams2 != null) {
                            C13292d dVar2 = (C13292d) layoutParams2;
                            int a3 = aVar2.mo67454a();
                            int measuredWidth2 = childAt2.getMeasuredWidth();
                            int i14 = dVar2.leftMargin;
                            C13287b bVar2 = r15;
                            C13287b bVar3 = new C13287b(a3, measuredWidth2, i14, dVar2.rightMargin, aVar2.mo67456b(), dVar2.mo67478b());
                            if (bVar2.mo67462c() > 1) {
                                arrayList2.add(bVar2);
                            }
                            i12 = i13;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                        }
                    }
                    CollectionsKt.sortWith(arrayList2, C13295g.f34335b);
                    int size3 = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        int i16 = i15 + 1;
                        C13287b bVar4 = (C13287b) arrayList2.get(i15);
                        int a4 = bVar4.mo67460a();
                        int a5 = (bVar4.mo67460a() + bVar4.mo67462c()) - i7;
                        int b = bVar4.mo67461b();
                        if (a4 <= a5) {
                            int i17 = a4;
                            i2 = b;
                            f = 0.0f;
                            i = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                C13293e eVar = (C13293e) arrayList.get(i17);
                                b -= eVar.mo67491b();
                                if (eVar.mo67493d()) {
                                    f += eVar.mo67492c();
                                } else {
                                    if (eVar.mo67491b() == 0) {
                                        i++;
                                    }
                                    i2 -= eVar.mo67491b();
                                }
                                if (i17 == a5) {
                                    break;
                                }
                                i17 = i18;
                            }
                        } else {
                            i2 = b;
                            f = 0.0f;
                            i = 0;
                        }
                        if (f > 0.0f) {
                            if (a4 <= a5) {
                                while (true) {
                                    int i19 = a4 + 1;
                                    C13293e eVar2 = (C13293e) arrayList.get(a4);
                                    if (eVar2.mo67493d()) {
                                        i3 = i2;
                                        C13293e.m36864a(eVar2, (int) ((float) Math.ceil((double) ((eVar2.mo67492c() / f) * ((float) i2)))), 0.0f, 2);
                                    } else {
                                        i3 = i2;
                                    }
                                    if (a4 == a5) {
                                        break;
                                    }
                                    a4 = i19;
                                    i2 = i3;
                                }
                            }
                        } else if (b > 0 && a4 <= a5) {
                            while (true) {
                                int i20 = a4 + 1;
                                C13293e eVar3 = (C13293e) arrayList.get(a4);
                                if (i <= 0) {
                                    C13293e.m36864a(eVar3, eVar3.mo67491b() + (b / bVar4.mo67462c()), 0.0f, 2);
                                } else if (eVar3.mo67491b() == 0 && !eVar3.mo67493d()) {
                                    C13293e.m36864a(eVar3, eVar3.mo67491b() + (b / i), 0.0f, 2);
                                }
                                if (a4 == a5) {
                                    break;
                                }
                                a4 = i20;
                            }
                        }
                        i15 = i16;
                        i7 = 1;
                    }
                    cVar2.m36840a(arrayList, fVar);
                    cVar2.m36839a((List<C13293e>) arrayList);
                    return arrayList;
                }
            }
        }

        /* renamed from: c */
        public final int mo67469c() {
            if (this.f34318d.mo71155b()) {
                return m36841b(this.f34318d.mo71154a());
            }
            return 0;
        }

        /* renamed from: a */
        private final void m36839a(List<C13293e> list) {
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                int i3 = i + 1;
                C13293e eVar = list.get(i);
                eVar.mo67489a(i2);
                i2 += eVar.mo67491b();
                i = i3;
            }
        }

        /* renamed from: a */
        private final void m36840a(List<C13293e> list, C13294f fVar) {
            int i;
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            while (i3 < size) {
                int i5 = i3 + 1;
                C13293e eVar = list.get(i3);
                if (eVar.mo67493d()) {
                    f2 += eVar.mo67492c();
                    f = Math.max(f, ((float) eVar.mo67491b()) / eVar.mo67492c());
                } else {
                    i4 += eVar.mo67491b();
                }
                i3 = i5;
            }
            int size2 = list.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size2) {
                int i8 = i6 + 1;
                C13293e eVar2 = list.get(i6);
                if (eVar2.mo67493d()) {
                    i = (int) ((float) Math.ceil((double) (eVar2.mo67492c() * f)));
                } else {
                    i = eVar2.mo67491b();
                }
                i7 += i;
                i6 = i8;
            }
            float max = ((float) Math.max(0, Math.max(fVar.mo67496b(), i7) - i4)) / f2;
            int size3 = list.size();
            while (i2 < size3) {
                int i9 = i2 + 1;
                C13293e eVar3 = list.get(i2);
                if (eVar3.mo67493d()) {
                    C13293e.m36864a(eVar3, (int) ((float) Math.ceil((double) (eVar3.mo67492c() * max))), 0.0f, 2);
                }
                i2 = i9;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h90$d */
    public static final class C13292d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        private int f34325a;

        /* renamed from: b */
        private int f34326b;

        /* renamed from: c */
        private int f34327c;

        /* renamed from: d */
        private float f34328d;

        /* renamed from: e */
        private float f34329e;

        public C13292d() {
            this(-2, -2);
        }

        /* renamed from: a */
        public final int mo67475a() {
            return this.f34326b;
        }

        /* renamed from: b */
        public final void mo67480b(int i) {
            this.f34325a = i;
        }

        /* renamed from: c */
        public final int mo67481c() {
            return this.f34325a;
        }

        /* renamed from: d */
        public final int mo67483d() {
            return this.f34327c;
        }

        /* renamed from: e */
        public final float mo67484e() {
            return this.f34329e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual((Object) Reflection.getOrCreateKotlinClass(C13292d.class), (Object) Reflection.getOrCreateKotlinClass(obj.getClass()))) {
                return false;
            }
            C13292d dVar = (C13292d) obj;
            if (this.width == dVar.width && this.height == dVar.height && this.leftMargin == dVar.leftMargin && this.rightMargin == dVar.rightMargin && this.topMargin == dVar.topMargin && this.bottomMargin == dVar.bottomMargin && this.f34325a == dVar.f34325a && this.f34326b == dVar.f34326b && this.f34327c == dVar.f34327c) {
                if (this.f34328d == dVar.f34328d) {
                    if (this.f34329e == dVar.f34329e) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((super.hashCode() * 31) + this.f34325a) * 31) + this.f34326b) * 31) + this.f34327c) * 31) + Float.floatToIntBits(this.f34328d)) * 31) + Float.floatToIntBits(this.f34329e);
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            Intrinsics.checkNotNullParameter(typedArray, "attributes");
            this.width = typedArray.getLayoutDimension(i, -2);
            this.height = typedArray.getLayoutDimension(i2, -2);
        }

        public C13292d(int i, int i2) {
            super(i, i2);
            this.f34325a = 51;
            this.f34326b = 1;
            this.f34327c = 1;
        }

        /* renamed from: a */
        public final void mo67477a(int i) {
            this.f34326b = i;
        }

        /* renamed from: b */
        public final float mo67478b() {
            return this.f34328d;
        }

        /* renamed from: c */
        public final void mo67482c(int i) {
            this.f34327c = i;
        }

        /* renamed from: a */
        public final void mo67476a(float f) {
            this.f34328d = f;
        }

        /* renamed from: b */
        public final void mo67479b(float f) {
            this.f34329e = f;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13292d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attributeSet, "attrs");
            this.f34325a = 51;
            this.f34326b = 1;
            this.f34327c = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.GridContainer_Layout);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.GridContainer_Layout)");
            try {
                this.f34325a = obtainStyledAttributes.getInt(C12066R.styleable.GridContainer_Layout_android_layout_gravity, 51);
                this.f34326b = obtainStyledAttributes.getInt(C12066R.styleable.GridContainer_Layout_android_layout_columnSpan, 1);
                this.f34327c = obtainStyledAttributes.getInt(C12066R.styleable.GridContainer_Layout_android_layout_rowSpan, 1);
                this.f34328d = obtainStyledAttributes.getFloat(C12066R.styleable.GridContainer_Layout_android_layout_columnWeight, 0.0f);
                this.f34329e = obtainStyledAttributes.getFloat(C12066R.styleable.GridContainer_Layout_android_layout_rowWeight, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13292d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Intrinsics.checkNotNullParameter(layoutParams, "source");
            this.f34325a = 51;
            this.f34326b = 1;
            this.f34327c = 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13292d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Intrinsics.checkNotNullParameter(marginLayoutParams, "source");
            this.f34325a = 51;
            this.f34326b = 1;
            this.f34327c = 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13292d(C13292d dVar) {
            super(dVar);
            Intrinsics.checkNotNullParameter(dVar, "source");
            this.f34325a = 51;
            this.f34326b = 1;
            this.f34327c = 1;
            this.f34325a = dVar.f34325a;
            this.f34326b = dVar.f34326b;
            this.f34327c = dVar.f34327c;
            this.f34328d = dVar.f34328d;
            this.f34329e = dVar.f34329e;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h90$e */
    private static final class C13293e {

        /* renamed from: a */
        private int f34330a;

        /* renamed from: b */
        private int f34331b;

        /* renamed from: c */
        private float f34332c;

        /* renamed from: a */
        public final int mo67488a() {
            return this.f34330a;
        }

        /* renamed from: b */
        public final int mo67491b() {
            return this.f34331b;
        }

        /* renamed from: c */
        public final float mo67492c() {
            return this.f34332c;
        }

        /* renamed from: d */
        public final boolean mo67493d() {
            return this.f34332c > 0.0f;
        }

        /* renamed from: a */
        public final void mo67489a(int i) {
            this.f34330a = i;
        }

        /* renamed from: a */
        public static /* synthetic */ void m36864a(C13293e eVar, int i, float f, int i2) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            eVar.mo67490a(i, f);
        }

        /* renamed from: a */
        public final void mo67490a(int i, float f) {
            this.f34331b = Math.max(this.f34331b, i);
            this.f34332c = Math.max(this.f34332c, f);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h90$f */
    private static final class C13294f {

        /* renamed from: a */
        private int f34333a;

        /* renamed from: b */
        private int f34334b;

        public C13294f(int i, int i2) {
            this.f34333a = i;
            this.f34334b = i2;
        }

        /* renamed from: a */
        public final int mo67494a() {
            return this.f34334b;
        }

        /* renamed from: b */
        public final int mo67496b() {
            return this.f34333a;
        }

        /* renamed from: a */
        public final void mo67495a(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                this.f34333a = 0;
                this.f34334b = size;
            } else if (mode == 0) {
                this.f34333a = 0;
                this.f34334b = 32768;
            } else if (mode == 1073741824) {
                this.f34333a = size;
                this.f34334b = size;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13294f(int i, int i2, int i3) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 32768 : i2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h90$g */
    private static final class C13295g implements Comparator<C13287b> {

        /* renamed from: b */
        public static final C13295g f34335b = new C13295g();

        private C13295g() {
        }

        public int compare(Object obj, Object obj2) {
            C13287b bVar = (C13287b) obj;
            C13287b bVar2 = (C13287b) obj2;
            Intrinsics.checkNotNullParameter(bVar, "lhs");
            Intrinsics.checkNotNullParameter(bVar2, "rhs");
            if (bVar.mo67463d() < bVar2.mo67463d()) {
                return 1;
            }
            return bVar.mo67463d() > bVar2.mo67463d() ? -1 : 0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h90(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h90(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h90(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final void m36823a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i3 == -1) {
            i7 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else {
            i7 = ViewGroup.getChildMeasureSpec(i, 0, i3);
        }
        if (i4 == -1) {
            i8 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            i8 = ViewGroup.getChildMeasureSpec(i2, 0, i4);
        }
        view.measure(i7, i8);
    }

    /* renamed from: d */
    private final void m36824d() {
        int i = this.f34302c;
        if (i == 0) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                int i3 = i2 + 1;
                View childAt = getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt, "child");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    C13292d dVar = (C13292d) layoutParams;
                    if (dVar.mo67475a() < 0 || dVar.mo67483d() < 0) {
                        throw new IllegalStateException("Negative spans are not supported.");
                    } else if (dVar.mo67478b() < 0.0f || dVar.mo67484e() < 0.0f) {
                        throw new IllegalStateException("Negative weights are not supported.");
                    } else {
                        i2 = i3;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                }
            }
            this.f34302c = m36825e();
        } else if (i != m36825e()) {
            m36826f();
            m36824d();
        }
    }

    /* renamed from: e */
    private final int m36825e() {
        int childCount = getChildCount();
        int i = 223;
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(childAt, "child");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    i = (i * 31) + ((C13292d) layoutParams).hashCode();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                }
            }
            i2 = i3;
        }
        return i;
    }

    /* renamed from: f */
    private final void m36826f() {
        this.f34302c = 0;
        this.f34301b.mo67474g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C13292d();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new C13292d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        h90 h90 = this;
        SystemClock.elapsedRealtime();
        m36824d();
        List<C13293e> b = h90.f34301b.mo67468b();
        List<C13293e> e = h90.f34301b.mo67472e();
        List<C13286a> a = h90.f34301b.mo67466a();
        int i7 = h90.f34300a & 7;
        int d = h90.f34301b.mo67471d();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i8 = 5;
        if (i7 == 1) {
            i5 = getPaddingLeft() + ((measuredWidth - d) / 2);
        } else if (i7 != 5) {
            i5 = getPaddingLeft();
        } else {
            i5 = (getPaddingLeft() + measuredWidth) - d;
        }
        int i9 = h90.f34300a & 112;
        int c = h90.f34301b.mo67469c();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (i9 == 16) {
            i6 = getPaddingTop() + ((measuredHeight - c) / 2);
        } else if (i9 != 80) {
            i6 = getPaddingTop();
        } else {
            i6 = (getPaddingTop() + measuredHeight) - c;
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10 + 1;
            View childAt = h90.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(childAt, "child");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    C13292d dVar = (C13292d) layoutParams;
                    C13286a aVar = a.get(i10);
                    int a2 = b.get(aVar.mo67454a()).mo67488a() + dVar.leftMargin;
                    int a3 = e.get(aVar.mo67457c()).mo67488a() + dVar.topMargin;
                    C13293e eVar = b.get((aVar.mo67454a() + aVar.mo67456b()) - 1);
                    int a4 = ((eVar.mo67488a() + eVar.mo67491b()) - a2) - dVar.rightMargin;
                    C13293e eVar2 = e.get((aVar.mo67457c() + aVar.mo67458d()) - 1);
                    int a5 = ((eVar2.mo67488a() + eVar2.mo67491b()) - a3) - dVar.bottomMargin;
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int c2 = dVar.mo67481c() & 7;
                    if (c2 == 1) {
                        a2 += (a4 - measuredWidth2) / 2;
                    } else if (c2 == i8) {
                        a2 = (a2 + a4) - measuredWidth2;
                    }
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int c3 = dVar.mo67481c() & 112;
                    if (c3 == 16) {
                        a3 += (a5 - measuredHeight2) / 2;
                    } else if (c3 == 80) {
                        a3 = (a3 + a5) - measuredHeight2;
                    }
                    int i12 = a2 + i5;
                    int i13 = a3 + i6;
                    childAt.layout(i12, i13, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + i13);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams");
                }
            }
            h90 = this;
            i10 = i11;
            i8 = 5;
        }
        SystemClock.elapsedRealtime();
        ii0 ii0 = ii0.f34887a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        List<C13293e> list;
        List<C13293e> list2;
        String str;
        List<C13286a> list3;
        List<C13286a> list4;
        int i4;
        List<C13293e> list5;
        String str2;
        String str3;
        int i5 = i;
        SystemClock.elapsedRealtime();
        m36824d();
        this.f34301b.mo67473f();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5 - paddingLeft), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 - paddingTop), View.MeasureSpec.getMode(i2));
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            String str4 = "null cannot be cast to non-null type com.yandex.div.core.widget.GridContainer.LayoutParams";
            String str5 = "child";
            int i7 = 8;
            if (i6 < childCount) {
                int i8 = i6 + 1;
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    Intrinsics.checkNotNullExpressionValue(childAt, str5);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        C13292d dVar = (C13292d) layoutParams;
                        int i9 = dVar.width;
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        int i10 = dVar.height;
                        if (i10 == -1) {
                            i10 = 0;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, i9), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, 0, i10));
                    } else {
                        throw new NullPointerException(str4);
                    }
                }
                i6 = i8;
            } else {
                int b = this.f34301b.mo67467b(makeMeasureSpec);
                List<C13286a> a = this.f34301b.mo67466a();
                List<C13293e> b2 = this.f34301b.mo67468b();
                int childCount2 = getChildCount();
                int i11 = 0;
                while (i11 < childCount2) {
                    int i12 = i11 + 1;
                    View childAt2 = getChildAt(i11);
                    if (childAt2.getVisibility() == i7) {
                        i4 = childCount2;
                        list5 = b2;
                        list4 = a;
                        str2 = str5;
                        str3 = str4;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(childAt2, str5);
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        if (layoutParams2 != null) {
                            C13292d dVar2 = (C13292d) layoutParams2;
                            String str6 = str5;
                            if (dVar2.width != -1) {
                                i4 = childCount2;
                                list5 = b2;
                                list4 = a;
                                str3 = str4;
                                str2 = str6;
                            } else {
                                C13286a aVar = a.get(i11);
                                C13293e eVar = b2.get((aVar.mo67454a() + aVar.mo67456b()) - 1);
                                int a2 = ((eVar.mo67488a() + eVar.mo67491b()) - b2.get(aVar.mo67454a()).mo67488a()) - (dVar2.leftMargin + dVar2.rightMargin);
                                i4 = childCount2;
                                View view = childAt2;
                                list4 = a;
                                list5 = b2;
                                str2 = str6;
                                str3 = str4;
                                m36823a(view, makeMeasureSpec, makeMeasureSpec2, dVar2.width, dVar2.height, a2, 0);
                            }
                        } else {
                            throw new NullPointerException(str4);
                        }
                    }
                    str4 = str3;
                    str5 = str2;
                    i11 = i12;
                    b2 = list5;
                    childCount2 = i4;
                    a = list4;
                    i7 = 8;
                    int i13 = i2;
                }
                String str7 = str5;
                String str8 = str4;
                int a3 = this.f34301b.mo67465a(makeMeasureSpec2);
                List<C13286a> a4 = this.f34301b.mo67466a();
                List<C13293e> b3 = this.f34301b.mo67468b();
                List<C13293e> e = this.f34301b.mo67472e();
                int childCount3 = getChildCount();
                int i14 = 0;
                while (i14 < childCount3) {
                    int i15 = i14 + 1;
                    View childAt3 = getChildAt(i14);
                    if (childAt3.getVisibility() == 8) {
                        i3 = childCount3;
                        list = e;
                        list2 = b3;
                        str = str7;
                        list3 = a4;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(childAt3, str7);
                        ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                        if (layoutParams3 != null) {
                            C13292d dVar3 = (C13292d) layoutParams3;
                            str = str7;
                            if (dVar3.height != -1) {
                                i3 = childCount3;
                                list = e;
                                list2 = b3;
                                list3 = a4;
                            } else {
                                C13286a aVar2 = a4.get(i14);
                                C13293e eVar2 = b3.get((aVar2.mo67454a() + aVar2.mo67456b()) - 1);
                                int a5 = ((eVar2.mo67488a() + eVar2.mo67491b()) - b3.get(aVar2.mo67454a()).mo67488a()) - (dVar3.leftMargin + dVar3.rightMargin);
                                C13293e eVar3 = e.get((aVar2.mo67457c() + aVar2.mo67458d()) - 1);
                                int a6 = ((eVar3.mo67488a() + eVar3.mo67491b()) - e.get(aVar2.mo67457c()).mo67488a()) - (dVar3.topMargin + dVar3.bottomMargin);
                                int i16 = dVar3.width;
                                i3 = childCount3;
                                int i17 = i16;
                                list = e;
                                int i18 = dVar3.height;
                                list2 = b3;
                                int i19 = a5;
                                list3 = a4;
                                m36823a(childAt3, makeMeasureSpec, makeMeasureSpec2, i17, i18, i19, a6);
                            }
                        } else {
                            throw new NullPointerException(str8);
                        }
                    }
                    a4 = list3;
                    i14 = i15;
                    str7 = str;
                    b3 = list2;
                    e = list;
                    childCount3 = i3;
                }
                setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(b + paddingLeft, getSuggestedMinimumWidth()), i5, 0), ViewGroup.resolveSizeAndState(Math.max(a3 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
                SystemClock.elapsedRealtime();
                ii0 ii0 = ii0.f34887a;
                return;
            }
        }
    }

    public void onViewAdded(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.onViewAdded(view);
        m36826f();
    }

    public void onViewRemoved(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.onViewRemoved(view);
        m36826f();
    }

    public void requestLayout() {
        super.requestLayout();
        if (this.f34303d) {
            this.f34301b.mo67473f();
        }
    }

    public final void setColumnCount(int i) {
        this.f34301b.mo67470c(i);
        m36826f();
        requestLayout();
    }

    public final void setGravity(int i) {
        this.f34300a = i;
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h90(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34300a = 51;
        this.f34301b = new C13288c(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.GridContainer, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ntainer, defStyleAttr, 0)");
            try {
                setColumnCount(obtainStyledAttributes.getInt(C12066R.styleable.GridContainer_android_columnCount, 1));
                setGravity(obtainStyledAttributes.getInt(C12066R.styleable.GridContainer_android_gravity, 51));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f34303d = true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "lp");
        if (layoutParams instanceof C13292d) {
            return new C13292d((C13292d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C13292d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C13292d(layoutParams);
    }
}

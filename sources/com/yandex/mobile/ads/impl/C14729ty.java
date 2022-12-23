package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.ty */
public final class C14729ty {

    /* renamed from: c */
    public static final C14730a f40522c = new C14730a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f40523a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Pair<String, String>> f40524b;

    /* renamed from: com.yandex.mobile.ads.impl.ty$a */
    public static final class C14730a {
        private C14730a() {
        }

        public /* synthetic */ C14730a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final int m42548a(C14729ty tyVar, C14729ty tyVar2) {
            int size;
            int size2;
            if (tyVar.mo70249d() != tyVar2.mo70249d()) {
                size = tyVar.mo70249d();
                size2 = tyVar2.mo70249d();
            } else {
                Intrinsics.checkNotNullExpressionValue(tyVar, "lhs");
                int size3 = tyVar.f40524b.size();
                Intrinsics.checkNotNullExpressionValue(tyVar2, "rhs");
                int min = Math.min(size3, tyVar2.f40524b.size());
                int i = 0;
                while (i < min) {
                    int i2 = i + 1;
                    Pair pair = (Pair) tyVar.f40524b.get(i);
                    Pair pair2 = (Pair) tyVar2.f40524b.get(i);
                    int compareTo = ((String) pair.getFirst()).compareTo((String) pair2.getFirst());
                    if (compareTo != 0 || ((String) pair.getSecond()).compareTo((String) pair2.getSecond()) != 0) {
                        return compareTo;
                    }
                    i = i2;
                }
                size = tyVar.f40524b.size();
                size2 = tyVar2.f40524b.size();
            }
            return size - size2;
        }

        /* renamed from: a */
        public final Comparator<C14729ty> mo70255a() {
            return $$Lambda$ty$a$COKor2nxETPg4IcN8uXahYu91ug.INSTANCE;
        }
    }

    public C14729ty(int i, List<Pair<String, String>> list) {
        Intrinsics.checkNotNullParameter(list, "states");
        this.f40523a = i;
        this.f40524b = list;
    }

    @JvmStatic
    /* renamed from: a */
    public static final C14729ty m42538a(String str) throws vy0 {
        Intrinsics.checkNotNullParameter(str, "path");
        ArrayList arrayList = new ArrayList();
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"/"}, false, 0, 6, (Object) null);
        try {
            int parseInt = Integer.parseInt((String) split$default.get(0));
            if (split$default.size() % 2 == 1) {
                IntProgression step = RangesKt.step((IntProgression) RangesKt.until(1, split$default.size()), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (true) {
                        int i = first + step2;
                        arrayList.add(TuplesKt.m45515to(split$default.get(first), split$default.get(first + 1)));
                        if (first == last) {
                            break;
                        }
                        first = i;
                    }
                }
                return new C14729ty(parseInt, arrayList);
            }
            throw new vy0(Intrinsics.stringPlus("Must be even number of states in path: ", str), (Throwable) null);
        } catch (NumberFormatException e) {
            throw new vy0(Intrinsics.stringPlus("Top level id must be number: ", str), e);
        }
    }

    /* renamed from: b */
    public final String mo70246b() {
        if (this.f40524b.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = this.f40523a;
        List<Pair<String, String>> list = this.f40524b;
        sb.append(new C14729ty(i, list.subList(0, list.size() - 1)));
        sb.append('/');
        sb.append((String) ((Pair) CollectionsKt.last(this.f40524b)).getFirst());
        return sb.toString();
    }

    /* renamed from: c */
    public final List<Pair<String, String>> mo70248c() {
        return this.f40524b;
    }

    /* renamed from: d */
    public final int mo70249d() {
        return this.f40523a;
    }

    /* renamed from: e */
    public final boolean mo70250e() {
        return this.f40524b.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14729ty)) {
            return false;
        }
        C14729ty tyVar = (C14729ty) obj;
        return this.f40523a == tyVar.f40523a && Intrinsics.areEqual((Object) this.f40524b, (Object) tyVar.f40524b);
    }

    /* renamed from: f */
    public final C14729ty mo70252f() {
        if (this.f40524b.isEmpty()) {
            return this;
        }
        List<T> mutableList = CollectionsKt.toMutableList(this.f40524b);
        CollectionsKt.removeLast(mutableList);
        return new C14729ty(this.f40523a, mutableList);
    }

    public int hashCode() {
        return (this.f40523a * 31) + this.f40524b.hashCode();
    }

    public String toString() {
        if (!(!this.f40524b.isEmpty())) {
            return String.valueOf(this.f40523a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40523a);
        sb.append('/');
        List<Pair<String, String>> list = this.f40524b;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((String) pair.getFirst(), (String) pair.getSecond()));
        }
        sb.append(CollectionsKt.joinToString$default(arrayList, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean mo70247b(C14729ty tyVar) {
        Intrinsics.checkNotNullParameter(tyVar, "other");
        if (this.f40523a != tyVar.f40523a || this.f40524b.size() >= tyVar.f40524b.size()) {
            return false;
        }
        int i = 0;
        for (T next : this.f40524b) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) next;
            Pair pair2 = tyVar.f40524b.get(i);
            if (!Intrinsics.areEqual((Object) (String) pair.getFirst(), (Object) (String) pair2.getFirst()) || !Intrinsics.areEqual((Object) (String) pair.getSecond(), (Object) (String) pair2.getSecond())) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo70245a() {
        if (this.f40524b.isEmpty()) {
            return null;
        }
        return (String) ((Pair) CollectionsKt.last(this.f40524b)).getSecond();
    }

    /* renamed from: a */
    public final C14729ty mo70244a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "divId");
        Intrinsics.checkNotNullParameter(str2, "stateId");
        List<T> mutableList = CollectionsKt.toMutableList(this.f40524b);
        mutableList.add(TuplesKt.m45515to(str, str2));
        return new C14729ty(this.f40523a, mutableList);
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C13358hy;
import com.yandex.mobile.ads.impl.C15177xl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class q00 implements Sequence<C15177xl> {

    /* renamed from: a */
    private final C15177xl f38909a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<C15177xl, Boolean> f38910b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<C15177xl, Unit> f38911c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f38912d;

    /* renamed from: com.yandex.mobile.ads.impl.q00$a */
    private static final class C14336a implements C14339d {

        /* renamed from: a */
        private final C15177xl f38913a;

        /* renamed from: b */
        private final Function1<C15177xl, Boolean> f38914b;

        /* renamed from: c */
        private final Function1<C15177xl, Unit> f38915c;

        /* renamed from: d */
        private boolean f38916d;

        /* renamed from: e */
        private List<? extends C15177xl> f38917e;

        /* renamed from: f */
        private int f38918f;

        public C14336a(C15177xl xlVar, Function1<? super C15177xl, Boolean> function1, Function1<? super C15177xl, Unit> function12) {
            Intrinsics.checkNotNullParameter(xlVar, "div");
            this.f38913a = xlVar;
            this.f38914b = function1;
            this.f38915c = function12;
        }

        /* renamed from: a */
        public C15177xl mo69466a() {
            ArrayList arrayList;
            if (!this.f38916d) {
                Function1<C15177xl, Boolean> function1 = this.f38914b;
                if (function1 != null && !function1.invoke(this.f38913a).booleanValue()) {
                    return null;
                }
                this.f38916d = true;
                return this.f38913a;
            }
            List list = this.f38917e;
            if (list == null) {
                C15177xl xlVar = this.f38913a;
                if (xlVar instanceof C15177xl.C15192o) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15185h) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15183f) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15188k) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15186i) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15189l) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15181d) {
                    list = CollectionsKt.emptyList();
                } else if (xlVar instanceof C15177xl.C15180c) {
                    list = ((C15177xl.C15180c) xlVar).mo70912c().f33547s;
                } else if (xlVar instanceof C15177xl.C15184g) {
                    list = ((C15177xl.C15184g) xlVar).mo70916c().f41511s;
                } else if (xlVar instanceof C15177xl.C15182e) {
                    list = ((C15177xl.C15182e) xlVar).mo70914c().f33660q;
                } else if (xlVar instanceof C15177xl.C15187j) {
                    list = ((C15177xl.C15187j) xlVar).mo70919c().f38363n;
                } else {
                    if (xlVar instanceof C15177xl.C15191n) {
                        List<C12667bz.C12674g> list2 = ((C15177xl.C15191n) xlVar).mo70923c().f31682n;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (C12667bz.C12674g gVar : list2) {
                            arrayList.add(gVar.f31703a);
                        }
                    } else if (xlVar instanceof C15177xl.C15190m) {
                        List<C13358hy.C13365g> list3 = ((C15177xl.C15190m) xlVar).mo70922c().f34685r;
                        arrayList = new ArrayList();
                        for (C13358hy.C13365g gVar2 : list3) {
                            C15177xl xlVar2 = gVar2.f34704c;
                            if (xlVar2 != null) {
                                arrayList.add(xlVar2);
                            }
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = arrayList;
                }
                this.f38917e = list;
            }
            if (this.f38918f < list.size()) {
                int i = this.f38918f;
                this.f38918f = i + 1;
                return (C15177xl) list.get(i);
            }
            Function1<C15177xl, Unit> function12 = this.f38915c;
            if (function12 == null) {
                return null;
            }
            function12.invoke(this.f38913a);
            return null;
        }

        /* renamed from: b */
        public C15177xl mo69467b() {
            return this.f38913a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q00$c */
    private static final class C14338c implements C14339d {

        /* renamed from: a */
        private final C15177xl f38921a;

        /* renamed from: b */
        private boolean f38922b;

        public C14338c(C15177xl xlVar) {
            Intrinsics.checkNotNullParameter(xlVar, "div");
            this.f38921a = xlVar;
        }

        /* renamed from: a */
        public C15177xl mo69466a() {
            if (this.f38922b) {
                return null;
            }
            this.f38922b = true;
            return this.f38921a;
        }

        /* renamed from: b */
        public C15177xl mo69467b() {
            return this.f38921a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q00$d */
    private interface C14339d {
        /* renamed from: a */
        C15177xl mo69466a();

        /* renamed from: b */
        C15177xl mo69467b();
    }

    private q00(C15177xl xlVar, Function1<? super C15177xl, Boolean> function1, Function1<? super C15177xl, Unit> function12, int i) {
        this.f38909a = xlVar;
        this.f38910b = function1;
        this.f38911c = function12;
        this.f38912d = i;
    }

    public Iterator<C15177xl> iterator() {
        return new C14337b(this, this.f38909a);
    }

    /* renamed from: a */
    public final q00 mo69464a(Function1<? super C15177xl, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "predicate");
        return new q00(this.f38909a, function1, this.f38911c, this.f38912d);
    }

    /* renamed from: b */
    public final q00 mo69465b(Function1<? super C15177xl, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "function");
        return new q00(this.f38909a, this.f38910b, function1, this.f38912d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ q00(C15177xl xlVar, Function1 function1, Function1 function12, int i, int i2) {
        this(xlVar, (Function1<? super C15177xl, Boolean>) null, (Function1<? super C15177xl, Unit>) null, (i2 & 8) != 0 ? Integer.MAX_VALUE : i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.q00$b */
    private final class C14337b extends AbstractIterator<C15177xl> {

        /* renamed from: b */
        private final ArrayDeque<C14339d> f38919b;

        /* renamed from: c */
        final /* synthetic */ q00 f38920c;

        public C14337b(q00 q00, C15177xl xlVar) {
            Intrinsics.checkNotNullParameter(q00, "this$0");
            Intrinsics.checkNotNullParameter(xlVar, "root");
            this.f38920c = q00;
            ArrayDeque<C14339d> arrayDeque = new ArrayDeque<>();
            arrayDeque.addLast(m41036a(xlVar));
            this.f38919b = arrayDeque;
        }

        /* renamed from: a */
        private final C15177xl m41037a() {
            C14339d lastOrNull = this.f38919b.lastOrNull();
            if (lastOrNull == null) {
                return null;
            }
            C15177xl a = lastOrNull.mo69466a();
            if (a == null) {
                this.f38919b.removeLast();
                return m41037a();
            } else if (Intrinsics.areEqual((Object) a, (Object) lastOrNull.mo69467b()) || r00.m41461b(a) || this.f38919b.size() >= this.f38920c.f38912d) {
                return a;
            } else {
                this.f38919b.addLast(m41036a(a));
                return m41037a();
            }
        }

        /* access modifiers changed from: protected */
        public void computeNext() {
            C15177xl a = m41037a();
            if (a != null) {
                setNext(a);
            } else {
                done();
            }
        }

        /* renamed from: a */
        private final C14339d m41036a(C15177xl xlVar) {
            if (r00.m41462c(xlVar)) {
                return new C14336a(xlVar, this.f38920c.f38910b, this.f38920c.f38911c);
            }
            return new C14338c(xlVar);
        }
    }
}

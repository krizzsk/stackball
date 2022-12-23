package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.i50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

public abstract class f50<T> {

    /* renamed from: a */
    public static final C13029a f33229a = new C13029a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ConcurrentHashMap<Object, f50<?>> f33230b = new ConcurrentHashMap<>(1000);

    /* renamed from: com.yandex.mobile.ads.impl.f50$a */
    public static final class C13029a {
        private C13029a() {
        }

        public /* synthetic */ C13029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r1 = new com.yandex.mobile.ads.impl.f50.C13030b(r3);
         */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> com.yandex.mobile.ads.impl.f50<T> mo66929a(T r3) {
            /*
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.concurrent.ConcurrentHashMap r0 = com.yandex.mobile.ads.impl.f50.f33230b
                java.lang.Object r1 = r0.get(r3)
                if (r1 != 0) goto L_0x001c
                com.yandex.mobile.ads.impl.f50$b r1 = new com.yandex.mobile.ads.impl.f50$b
                r1.<init>(r3)
                java.lang.Object r3 = r0.putIfAbsent(r3, r1)
                if (r3 != 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r1 = r3
            L_0x001c:
                com.yandex.mobile.ads.impl.f50 r1 = (com.yandex.mobile.ads.impl.f50) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f50.C13029a.mo66929a(java.lang.Object):com.yandex.mobile.ads.impl.f50");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f50$b */
    public static final class C13030b<T> extends f50<T> {

        /* renamed from: c */
        private final T f33231c;

        public C13030b(T t) {
            Intrinsics.checkNotNullParameter(t, "value");
            this.f33231c = t;
        }

        /* renamed from: a */
        public T mo66924a(j50 j50) {
            Intrinsics.checkNotNullParameter(j50, "resolver");
            return this.f33231c;
        }

        /* renamed from: b */
        public Object mo66926b() {
            return this.f33231c;
        }

        /* renamed from: a */
        public C15055wl mo66923a(j50 j50, Function1<? super T, Unit> function1) {
            Intrinsics.checkNotNullParameter(j50, "resolver");
            Intrinsics.checkNotNullParameter(function1, "callback");
            C15055wl wlVar = C15055wl.f42027a;
            Intrinsics.checkNotNullExpressionValue(wlVar, "NULL");
            return wlVar;
        }

        /* renamed from: b */
        public C15055wl mo66925b(j50 j50, Function1<? super T, Unit> function1) {
            Intrinsics.checkNotNullParameter(j50, "resolver");
            Intrinsics.checkNotNullParameter(function1, "callback");
            function1.invoke(this.f33231c);
            C15055wl wlVar = C15055wl.f42027a;
            Intrinsics.checkNotNullExpressionValue(wlVar, "NULL");
            return wlVar;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f50$c */
    public static final class C13031c<R, T> extends f50<T> {

        /* renamed from: c */
        private final String f33232c;

        /* renamed from: d */
        private final String f33233d;

        /* renamed from: e */
        private final Function1<R, T> f33234e;

        /* renamed from: f */
        private final rh1<T> f33235f;

        /* renamed from: g */
        private final ny0 f33236g;

        /* renamed from: h */
        private final cg1<T> f33237h;

        /* renamed from: i */
        private final C15302zc f33238i;

        /* renamed from: j */
        private final f50<T> f33239j;

        /* renamed from: k */
        private final String f33240k;

        /* renamed from: l */
        private List<? extends i50> f33241l;

        /* renamed from: m */
        private T f33242m;

        /* renamed from: com.yandex.mobile.ads.impl.f50$c$a */
        static final class C13032a extends Lambda implements Function1<T, Unit> {

            /* renamed from: b */
            final /* synthetic */ Function1<T, Unit> f33243b;

            /* renamed from: c */
            final /* synthetic */ C13031c<R, T> f33244c;

            /* renamed from: d */
            final /* synthetic */ j50 f33245d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13032a(Function1<? super T, Unit> function1, C13031c<R, T> cVar, j50 j50) {
                super(1);
                this.f33243b = function1;
                this.f33244c = cVar;
                this.f33245d = j50;
            }

            public Object invoke(Object obj) {
                this.f33243b.invoke(this.f33244c.m35913c(this.f33245d));
                return Unit.INSTANCE;
            }
        }

        public C13031c(String str, String str2, Function1<? super R, ? extends T> function1, rh1<T> rh1, ny0 ny0, cg1<T> cg1, C15302zc zcVar, f50<T> f50) {
            Intrinsics.checkNotNullParameter(str, "expressionKey");
            Intrinsics.checkNotNullParameter(str2, "rawExpression");
            Intrinsics.checkNotNullParameter(rh1, "validator");
            Intrinsics.checkNotNullParameter(ny0, "logger");
            Intrinsics.checkNotNullParameter(cg1, "typeHelper");
            Intrinsics.checkNotNullParameter(zcVar, "builtinVariables");
            this.f33232c = str;
            this.f33233d = str2;
            this.f33234e = function1;
            this.f33235f = rh1;
            this.f33236g = ny0;
            this.f33237h = cg1;
            this.f33238i = zcVar;
            this.f33239j = f50;
            this.f33240k = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final T m35913c(j50 j50) {
            try {
                T b = m35912b(j50);
                this.f33242m = b;
                return b;
            } catch (oy0 e) {
                this.f33236g.mo65565c(e);
                j50.mo67929a(e);
                T t = this.f33242m;
                if (t != null) {
                    return t;
                }
                try {
                    f50<T> f50 = this.f33239j;
                    if (f50 != null) {
                        T a = f50.mo66924a(j50);
                        if (a != null) {
                            this.f33242m = a;
                            return a;
                        }
                    }
                    return this.f33237h.mo66291a();
                } catch (oy0 e2) {
                    this.f33236g.mo65565c(e2);
                    j50.mo67929a(e2);
                    throw e2;
                }
            }
        }

        /* renamed from: b */
        public Object mo66926b() {
            return this.f33240k;
        }

        /* renamed from: a */
        public T mo66924a(j50 j50) {
            Intrinsics.checkNotNullParameter(j50, "resolver");
            return m35913c(j50);
        }

        /* renamed from: b */
        public C15055wl mo66925b(j50 j50, Function1<? super T, Unit> function1) {
            Object obj;
            Intrinsics.checkNotNullParameter(j50, "resolver");
            Intrinsics.checkNotNullParameter(function1, "callback");
            try {
                obj = m35913c(j50);
            } catch (oy0 unused) {
                obj = null;
            }
            if (obj != null) {
                function1.invoke(obj);
            }
            return mo66923a(j50, function1);
        }

        /* renamed from: a */
        public C15055wl mo66923a(j50 j50, Function1<? super T, Unit> function1) {
            Intrinsics.checkNotNullParameter(j50, "resolver");
            Intrinsics.checkNotNullParameter(function1, "callback");
            List<? extends i50> list = this.f33241l;
            if (list == null) {
                list = h50.m36803a(this.f33233d);
                this.f33241l = list;
            }
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (next instanceof i50.C13380b) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                C15055wl wlVar = C15055wl.f42027a;
                Intrinsics.checkNotNullExpressionValue(wlVar, "NULL");
                return wlVar;
            }
            C14592sg sgVar = new C14592sg();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C15055wl a = j50.mo67927a(((i50.C13380b) it.next()).mo67735a(), new C13032a(function1, this, j50));
                Intrinsics.checkNotNullParameter(sgVar, "<this>");
                Intrinsics.checkNotNullParameter(a, "disposable");
                sgVar.mo69970a(a);
            }
            return sgVar;
        }

        /* renamed from: b */
        private final T m35912b(j50 j50) {
            String str = this.f33232c;
            String str2 = this.f33233d;
            List<? extends i50> list = this.f33241l;
            if (list == null) {
                list = h50.m36803a(str2);
                this.f33241l = list;
            }
            T a = j50.mo67928a(str, str2, list, this.f33234e, this.f33235f, this.f33238i, this.f33237h, this.f33236g);
            if (a == null) {
                String str3 = this.f33232c;
                String str4 = this.f33233d;
                Intrinsics.checkNotNullParameter(str3, SDKConstants.PARAM_KEY);
                qy0 qy0 = qy0.INVALID_VALUE;
                throw new oy0(qy0, "Value '" + str4 + "' for key '" + str3 + "' could not be resolved", (Throwable) null, (wh0) null, (String) null, 28);
            } else if (this.f33237h.mo66292a(a)) {
                return a;
            } else {
                throw py0.m40998a(this.f33232c, this.f33233d, (Object) a, (Throwable) null);
            }
        }

        /* renamed from: a */
        public final C13031c<R, T> mo66930a(C15302zc zcVar) {
            Intrinsics.checkNotNullParameter(zcVar, "builtinVariables");
            return new C13031c(this.f33232c, this.f33233d, this.f33234e, this.f33235f, this.f33236g, this.f33237h, zcVar, this.f33239j);
        }
    }

    /* renamed from: a */
    public abstract C15055wl mo66923a(j50 j50, Function1<? super T, Unit> function1);

    /* renamed from: a */
    public abstract T mo66924a(j50 j50);

    /* renamed from: b */
    public abstract C15055wl mo66925b(j50 j50, Function1<? super T, Unit> function1);

    /* renamed from: b */
    public abstract Object mo66926b();

    public boolean equals(Object obj) {
        if (!(obj instanceof f50)) {
            return false;
        }
        return Intrinsics.areEqual(mo66926b(), ((f50) obj).mo66926b());
    }

    public int hashCode() {
        return mo66926b().hashCode() * 16;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m35901a(Object obj) {
        if (!(obj instanceof String) || !StringsKt.contains$default((CharSequence) obj, (CharSequence) "@{", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }
}

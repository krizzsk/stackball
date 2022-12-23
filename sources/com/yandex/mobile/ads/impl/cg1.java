package com.yandex.mobile.ads.impl;

import com.p243my.target.ads.Reward;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public interface cg1<T> {

    /* renamed from: a */
    public static final C12733a f31917a = C12733a.f31918a;

    /* renamed from: com.yandex.mobile.ads.impl.cg1$a */
    public static final class C12733a {

        /* renamed from: a */
        static final /* synthetic */ C12733a f31918a = new C12733a();

        /* renamed from: com.yandex.mobile.ads.impl.cg1$a$a */
        public static final class C12734a implements cg1<T> {

            /* renamed from: b */
            private final T f31919b;

            /* renamed from: c */
            final /* synthetic */ T f31920c;

            /* renamed from: d */
            final /* synthetic */ Function1<Object, Boolean> f31921d;

            C12734a(T t, Function1<Object, Boolean> function1) {
                this.f31920c = t;
                this.f31921d = function1;
                this.f31919b = t;
            }

            /* renamed from: a */
            public T mo66291a() {
                return this.f31919b;
            }

            /* renamed from: a */
            public boolean mo66292a(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "value");
                return this.f31921d.invoke(obj).booleanValue();
            }
        }

        private C12733a() {
        }

        /* renamed from: a */
        public final <T> cg1<T> mo66293a(T t, Function1<Object, Boolean> function1) {
            Intrinsics.checkNotNullParameter(t, Reward.DEFAULT);
            Intrinsics.checkNotNullParameter(function1, "validator");
            return new C12734a(t, function1);
        }
    }

    /* renamed from: a */
    T mo66291a();

    /* renamed from: a */
    boolean mo66292a(Object obj);
}

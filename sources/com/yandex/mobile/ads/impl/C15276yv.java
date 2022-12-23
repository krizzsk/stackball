package com.yandex.mobile.ads.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.yandex.mobile.ads.impl.yv */
public interface C15276yv {

    /* renamed from: a */
    public static final C15277a f42964a = C15277a.f42965a;

    /* renamed from: com.yandex.mobile.ads.impl.yv$a */
    public static final class C15277a {

        /* renamed from: a */
        static final /* synthetic */ C15277a f42965a = new C15277a();

        /* renamed from: b */
        private static final Lazy<C13057fk> f42966b = LazyKt.lazy(C15278a.f42967b);

        /* renamed from: com.yandex.mobile.ads.impl.yv$a$a */
        /* synthetic */ class C15278a extends FunctionReferenceImpl implements Function0<C13057fk> {

            /* renamed from: b */
            public static final C15278a f42967b = new C15278a();

            C15278a() {
                super(0, C13057fk.class, "<init>", "<init>()V", 0);
            }

            public Object invoke() {
                return new C13057fk();
            }
        }

        private C15277a() {
        }

        /* renamed from: a */
        public final C15276yv mo71130a() {
            return f42966b.getValue();
        }
    }
}

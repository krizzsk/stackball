package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13323hi;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;

public interface aa0 extends ca0 {

    /* renamed from: a */
    public static final aa0 f30480a = new C12367a();

    /* renamed from: com.yandex.mobile.ads.impl.aa0$a */
    public static class C12367a implements aa0 {

        /* renamed from: b */
        private final Provider<v90> f30481b = new e20(C12369b.f30486b);

        /* renamed from: c */
        private final Provider<C13323hi> f30482c = new e20(C12368a.f30485b);

        /* renamed from: d */
        private final Provider<yc1> f30483d = new e20(C12371d.f30488b);

        /* renamed from: e */
        private final Provider<o31> f30484e = new e20(C12370c.f30487b);

        /* renamed from: com.yandex.mobile.ads.impl.aa0$a$a */
        static final class C12368a extends Lambda implements Function0<C13323hi> {

            /* renamed from: b */
            public static final C12368a f30485b = new C12368a();

            C12368a() {
                super(0);
            }

            public Object invoke() {
                return new C13323hi.C13324a();
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.aa0$a$b */
        /* synthetic */ class C12369b extends FunctionReferenceImpl implements Function0<rv0> {

            /* renamed from: b */
            public static final C12369b f30486b = new C12369b();

            C12369b() {
                super(0, rv0.class, "<init>", "<init>()V", 0);
            }

            public Object invoke() {
                return new rv0();
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.aa0$a$c */
        /* synthetic */ class C12370c extends AdaptedFunctionReference implements Function0<o31> {

            /* renamed from: b */
            public static final C12370c f30487b = new C12370c();

            C12370c() {
                super(0, o31.class, "<init>", "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", 0);
            }

            public Object invoke() {
                return new o31((ba0) null, (ba0) null, (ba0) null, (ba0) null, 15);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.aa0$a$d */
        /* synthetic */ class C12371d extends FunctionReferenceImpl implements Function0<C14685tk> {

            /* renamed from: b */
            public static final C12371d f30488b = new C12371d();

            C12371d() {
                super(0, C14685tk.class, "<init>", "<init>()V", 0);
            }

            public Object invoke() {
                return new C14685tk();
            }
        }

        /* renamed from: a */
        public boolean mo65704a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo65700b() {
            return false;
        }

        /* renamed from: c */
        public Provider<C13323hi> mo65701c() {
            return this.f30482c;
        }

        /* renamed from: d */
        public Provider<v90> mo65702d() {
            return this.f30481b;
        }

        /* renamed from: e */
        public boolean mo65705e() {
            return false;
        }

        /* renamed from: f */
        public Provider<o31> mo65706f() {
            return this.f30484e;
        }

        /* renamed from: g */
        public boolean mo65707g() {
            return false;
        }

        /* renamed from: h */
        public boolean mo65708h() {
            return false;
        }

        /* renamed from: i */
        public Provider<yc1> mo65703i() {
            return this.f30483d;
        }
    }

    /* renamed from: b */
    boolean mo65700b();

    /* renamed from: c */
    Provider<C13323hi> mo65701c();

    /* renamed from: d */
    Provider<v90> mo65702d();

    /* renamed from: i */
    Provider<yc1> mo65703i();
}

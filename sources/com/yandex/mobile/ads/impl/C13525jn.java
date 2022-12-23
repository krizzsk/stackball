package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.jn */
public enum C13525jn {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");
    

    /* renamed from: c */
    public static final C13527b f35400c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C13525jn> f35401d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f35409b;

    /* renamed from: com.yandex.mobile.ads.impl.jn$a */
    static final class C13526a extends Lambda implements Function1<String, C13525jn> {

        /* renamed from: b */
        public static final C13526a f35410b = null;

        static {
            f35410b = new C13526a();
        }

        C13526a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C13525jn jnVar = C13525jn.LINEAR;
            if (Intrinsics.areEqual((Object) str, (Object) jnVar.f35409b)) {
                return jnVar;
            }
            C13525jn jnVar2 = C13525jn.EASE;
            if (Intrinsics.areEqual((Object) str, (Object) jnVar2.f35409b)) {
                return jnVar2;
            }
            C13525jn jnVar3 = C13525jn.EASE_IN;
            if (Intrinsics.areEqual((Object) str, (Object) jnVar3.f35409b)) {
                return jnVar3;
            }
            C13525jn jnVar4 = C13525jn.EASE_OUT;
            if (Intrinsics.areEqual((Object) str, (Object) jnVar4.f35409b)) {
                return jnVar4;
            }
            C13525jn jnVar5 = C13525jn.EASE_IN_OUT;
            if (Intrinsics.areEqual((Object) str, (Object) jnVar5.f35409b)) {
                return jnVar5;
            }
            C13525jn jnVar6 = C13525jn.SPRING;
            if (Intrinsics.areEqual((Object) str, (Object) jnVar6.f35409b)) {
                return jnVar6;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jn$b */
    public static final class C13527b {
        private C13527b() {
        }

        public /* synthetic */ C13527b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C13525jn> mo68068a() {
            return C13525jn.f35401d;
        }
    }

    static {
        f35400c = new C13527b((DefaultConstructorMarker) null);
        f35401d = C13526a.f35410b;
    }

    private C13525jn(String str) {
        this.f35409b = str;
    }
}

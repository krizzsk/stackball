package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.kx */
public enum C13794kx {
    DP("dp"),
    SP("sp");
    

    /* renamed from: c */
    public static final C13796b f36440c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C13794kx> f36441d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f36445b;

    /* renamed from: com.yandex.mobile.ads.impl.kx$a */
    static final class C13795a extends Lambda implements Function1<String, C13794kx> {

        /* renamed from: b */
        public static final C13795a f36446b = null;

        static {
            f36446b = new C13795a();
        }

        C13795a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C13794kx kxVar = C13794kx.DP;
            if (Intrinsics.areEqual((Object) str, (Object) kxVar.f36445b)) {
                return kxVar;
            }
            C13794kx kxVar2 = C13794kx.SP;
            if (Intrinsics.areEqual((Object) str, (Object) kxVar2.f36445b)) {
                return kxVar2;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kx$b */
    public static final class C13796b {
        private C13796b() {
        }

        public /* synthetic */ C13796b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C13794kx> mo68280a() {
            return C13794kx.f36441d;
        }
    }

    static {
        f36440c = new C13796b((DefaultConstructorMarker) null);
        f36441d = C13795a.f36446b;
    }

    private C13794kx(String str) {
        this.f36445b = str;
    }
}

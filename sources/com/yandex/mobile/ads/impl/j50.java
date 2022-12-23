package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public interface j50 {

    /* renamed from: a */
    public static final j50 f35129a = new C13475a();

    /* renamed from: com.yandex.mobile.ads.impl.j50$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(j50 j50, oy0 oy0) {
            Intrinsics.checkNotNullParameter(oy0, "e");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.j50$a */
    public static final class C13475a implements j50 {
        C13475a() {
        }

        /* renamed from: a */
        public <T> C15055wl mo67927a(String str, Function1<? super T, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "variableName");
            Intrinsics.checkNotNullParameter(function1, "callback");
            C15055wl wlVar = C15055wl.f42027a;
            Intrinsics.checkNotNullExpressionValue(wlVar, "NULL");
            return wlVar;
        }

        /* renamed from: a */
        public <R, T> T mo67928a(String str, String str2, List<? extends i50> list, Function1<? super R, ? extends T> function1, rh1<T> rh1, C15302zc zcVar, cg1<T> cg1, ny0 ny0) {
            Intrinsics.checkNotNullParameter(str, "expressionKey");
            Intrinsics.checkNotNullParameter(str2, "rawExpression");
            Intrinsics.checkNotNullParameter(list, "parts");
            Intrinsics.checkNotNullParameter(rh1, "validator");
            Intrinsics.checkNotNullParameter(zcVar, "builtinVariables");
            Intrinsics.checkNotNullParameter(cg1, "fieldType");
            Intrinsics.checkNotNullParameter(ny0, "logger");
            return null;
        }

        /* renamed from: a */
        public /* synthetic */ void mo67929a(oy0 oy0) {
            CC.$default$a(this, oy0);
        }
    }

    /* renamed from: a */
    <T> C15055wl mo67927a(String str, Function1<? super T, Unit> function1);

    /* renamed from: a */
    <R, T> T mo67928a(String str, String str2, List<? extends i50> list, Function1<? super R, ? extends T> function1, rh1<T> rh1, C15302zc zcVar, cg1<T> cg1, ny0 ny0);

    /* renamed from: a */
    void mo67929a(oy0 oy0);
}

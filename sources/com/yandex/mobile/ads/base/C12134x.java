package com.yandex.mobile.ads.base;

import android.content.Context;
import com.yandex.mobile.ads.base.C12124s;
import com.yandex.mobile.ads.impl.C14564s6;
import com.yandex.mobile.ads.impl.h21;
import com.yandex.mobile.ads.impl.h30;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.y71;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.base.x */
public class C12134x {

    /* renamed from: a */
    private final h30 f29398a = new h30();

    /* renamed from: a */
    public final String mo64674a(Context context, l30 l30, C14564s6 s6Var, y71 y71) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(l30, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(s6Var, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(y71, "sensitiveModeChecker");
        String a = new C12124s.C12126b(y71.mo71005a(context)).mo64657h(l30.mo68326h()).mo64653f(l30.mo68322e()).mo64632a(s6Var.mo69889a(), s6Var.mo69894c()).mo64631a(s6Var.mo69892b()).mo64638b().mo64658i(context).mo64626a(context, l30.mo68318c()).mo64624a(context).mo64643c().mo64647d().mo64636a();
        Intrinsics.checkNotNullExpressionValue(a, "builder(sensitiveModeEnabled)\n            .withUuId(environmentConfiguration.uuId)\n            .withMauid(environmentConfiguration.mauid)\n            .withGmsAdvertisingInfo(\n                advertisingConfiguration.gmsAdvertisingInfo,\n                advertisingConfiguration.isGmsAdvertisingInfoReset,\n            )\n            .withHmsAdvertisingInfo(advertisingConfiguration.hmsAdvertisingInfo)\n            .withAppMetricaInfo()\n            .withScreenInfo(context)\n            .withDeviceInfo(context, environmentConfiguration.deviceId)\n            .withApplicationInfo(context)\n            .withSdkInfo()\n            .withUserConsent()\n            .build()");
        List<h21> f = l30.mo68324f();
        Intrinsics.checkNotNullExpressionValue(f, "environmentConfiguration.queryParams");
        String[] strArr = {a, CollectionsKt.joinToString$default(f, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C12133w.f29397b, 30, (Object) null)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!StringsKt.isBlank(str)) {
                arrayList.add(str);
            }
        }
        return this.f29398a.mo67395a(context, CollectionsKt.joinToString$default(arrayList, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
    }
}

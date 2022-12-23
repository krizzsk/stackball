package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class il1 {

    /* renamed from: a */
    private final sn0 f34916a;

    /* renamed from: b */
    private final hl1 f34917b;

    /* renamed from: c */
    private h41.C13275a f34918c;

    /* renamed from: d */
    private h41.C13275a f34919d;

    /* renamed from: e */
    private Map<String, ? extends Object> f34920e;

    public il1(Context context, C15230y2 y2Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(y2Var, "adLoadingPhasesManager");
        sn0 b = sn0.m42091b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance(context)");
        this.f34916a = b;
        this.f34917b = new hl1(y2Var);
    }

    /* renamed from: a */
    public final void mo67828a(h41.C13275a aVar) {
        this.f34919d = aVar;
    }

    /* renamed from: b */
    public final void mo67830b(h41.C13275a aVar) {
        this.f34918c = aVar;
    }

    /* renamed from: a */
    private final void m37469a(Map<String, Object> map) {
        Map<String, Object> map2;
        Map<String, ? extends Object> map3 = this.f34920e;
        if (map3 == null) {
            map3 = MapsKt.emptyMap();
        }
        map.putAll(map3);
        h41.C13275a aVar = this.f34918c;
        Map<String, Object> map4 = null;
        if (aVar == null) {
            map2 = null;
        } else {
            map2 = aVar.mo66063a();
        }
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        map.putAll(map2);
        h41.C13275a aVar2 = this.f34919d;
        if (aVar2 != null) {
            map4 = aVar2.mo66063a();
        }
        if (map4 == null) {
            map4 = MapsKt.emptyMap();
        }
        map.putAll(map4);
        this.f34916a.mo70035a(new h41(h41.C13276b.VIDEO_AD_RENDERING_RESULT, map));
    }

    /* renamed from: b */
    public final void mo67831b(Map<String, ? extends Object> map) {
        this.f34920e = map;
    }

    /* renamed from: a */
    public final void mo67827a() {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.m45515to("status", "success"));
        mutableMapOf.putAll(this.f34917b.mo67566a());
        m37469a((Map<String, Object>) mutableMapOf);
    }

    /* renamed from: a */
    public final void mo67829a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "failureReason");
        Intrinsics.checkNotNullParameter(str2, "errorMessage");
        m37469a((Map<String, Object>) MapsKt.mutableMapOf(TuplesKt.m45515to("status", "error"), TuplesKt.m45515to("failure_reason", str), TuplesKt.m45515to("error_message", str2)));
    }
}

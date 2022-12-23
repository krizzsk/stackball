package com.ogury.p245ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.hg */
public final class C8288hg {

    /* renamed from: a */
    public static final C8288hg f21407a = new C8288hg();

    /* renamed from: b */
    private static final Map<String, C8432lk<C8287hf, C8386ke>> f21408b = Collections.synchronizedMap(new LinkedHashMap());

    private C8288hg() {
    }

    /* renamed from: a */
    public static void m23313a(String str, C8432lk<? super C8287hf, C8386ke> lkVar) {
        C8467mq.m23881b(str, Creative.AD_ID);
        C8467mq.m23881b(lkVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Map<String, C8432lk<C8287hf, C8386ke>> map = f21408b;
        C8467mq.m23878a((Object) map, "listeners");
        map.put(str, lkVar);
    }

    /* renamed from: a */
    public static void m23311a(C8287hf hfVar) {
        C8467mq.m23881b(hfVar, "event");
        C8432lk lkVar = f21408b.get(hfVar.mo53654b());
        if (lkVar != null) {
            lkVar.mo53077a(hfVar);
        }
    }

    /* renamed from: a */
    public static void m23312a(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
        f21408b.remove(str);
    }
}

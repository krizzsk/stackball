package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.p029a.p030a.C2682a;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.y */
public final class C2813y implements C2814z {

    /* renamed from: a */
    public C2682a f6664a;

    /* renamed from: b */
    C2769b f6665b;

    /* renamed from: c */
    private Map<UnitDisplayType, Map<String, String>> f6666c = new HashMap();

    /* renamed from: d */
    private Map<String, String> f6667d = new HashMap();

    /* renamed from: a */
    public final long mo18082a(String str) {
        try {
            return Long.parseLong(mo18084a(str, ""));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final String mo18084a(String str, String str2) {
        String str3 = this.f6667d.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    /* renamed from: a */
    public final void mo18087a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map map = this.f6666c.get(unitDisplayType);
        if (map == null) {
            map = new HashMap();
            this.f6666c.put(unitDisplayType, map);
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public final void mo18090b(String str, String str2) {
        this.f6667d.put(str, str2);
    }

    /* renamed from: a */
    public final void mo18085a() {
        this.f6666c.clear();
    }

    /* renamed from: a */
    public final void mo18086a(C2689b bVar, int i) {
        this.f6664a.mo17893a(bVar, i);
    }

    /* renamed from: b */
    public final void mo18089b() {
        C2682a aVar = this.f6664a;
        aVar.mo17895a(aVar.f6322a);
        aVar.mo17893a(C2689b.NONE, C2688a.f6339d);
    }

    /* renamed from: a */
    public final void mo18088a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String a : strArr) {
            mo18087a(unitDisplayType, a, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    /* renamed from: a */
    public final String mo18083a(UnitDisplayType unitDisplayType, String str) {
        Map map = this.f6666c.get(unitDisplayType);
        if (map == null || map.get(str) == null) {
            return "";
        }
        return (String) map.get(str);
    }
}

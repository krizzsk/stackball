package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.b1 */
public final class C12563b1 implements in1 {

    /* renamed from: a */
    private final C14652t4 f31189a;

    /* renamed from: b */
    private final String f31190b;

    /* renamed from: c */
    private final td1 f31191c;

    /* renamed from: d */
    private final List<String> f31192d;

    /* renamed from: e */
    private final Map<String, List<String>> f31193e;

    /* renamed from: f */
    private AdBreakParameters f31194f;

    C12563b1(C14652t4 t4Var, String str, Long l, td1 td1, List<String> list, List<r50> list2, Map<String, List<String>> map) {
        this.f31189a = t4Var;
        this.f31190b = str;
        this.f31192d = list;
        this.f31191c = td1;
        this.f31193e = map;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo65493a() {
        return this.f31193e;
    }

    /* renamed from: b */
    public C14652t4 mo65933b() {
        return this.f31189a;
    }

    /* renamed from: c */
    public String mo65934c() {
        return this.f31190b;
    }

    /* renamed from: d */
    public List<String> mo65935d() {
        return this.f31192d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AdBreakParameters mo65936e() {
        return this.f31194f;
    }

    /* renamed from: f */
    public td1 mo65937f() {
        return this.f31191c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo65932a(AdBreakParameters adBreakParameters) {
        this.f31194f = adBreakParameters;
    }
}

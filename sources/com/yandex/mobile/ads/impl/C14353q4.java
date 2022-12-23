package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.q4 */
public final class C14353q4 {

    /* renamed from: a */
    private final ry0 f38983a;

    /* renamed from: b */
    private final WebView f38984b;

    /* renamed from: c */
    private final List<aj1> f38985c;

    /* renamed from: d */
    private final Map<String, aj1> f38986d = new HashMap();

    /* renamed from: e */
    private final String f38987e;

    /* renamed from: f */
    private final String f38988f;

    /* renamed from: g */
    private final String f38989g;

    /* renamed from: h */
    private final C14439r4 f38990h;

    private C14353q4(ry0 ry0, WebView webView, String str, List<aj1> list, String str2, String str3, C14439r4 r4Var) {
        ArrayList arrayList = new ArrayList();
        this.f38985c = arrayList;
        this.f38983a = ry0;
        this.f38984b = null;
        this.f38987e = str;
        this.f38990h = r4Var;
        arrayList.addAll(list);
        for (aj1 put : list) {
            String uuid = UUID.randomUUID().toString();
            this.f38986d.put(uuid, put);
        }
        this.f38989g = str2;
        this.f38988f = str3;
    }

    /* renamed from: a */
    public static C14353q4 m41073a(ry0 ry0, String str, List<aj1> list, String str2, String str3) {
        wt1.m43867a((Object) str, "OM SDK JS script content is null");
        return new C14353q4(ry0, (WebView) null, str, list, (String) null, (String) null, C14439r4.NATIVE);
    }

    /* renamed from: a */
    public C14439r4 mo69477a() {
        return this.f38990h;
    }

    /* renamed from: b */
    public String mo69478b() {
        return this.f38989g;
    }

    /* renamed from: c */
    public String mo69479c() {
        return this.f38988f;
    }

    /* renamed from: d */
    public Map<String, aj1> mo69480d() {
        return Collections.unmodifiableMap(this.f38986d);
    }

    /* renamed from: e */
    public String mo69481e() {
        return this.f38987e;
    }

    /* renamed from: f */
    public ry0 mo69482f() {
        return this.f38983a;
    }

    /* renamed from: g */
    public List<aj1> mo69483g() {
        return Collections.unmodifiableList(this.f38985c);
    }

    /* renamed from: h */
    public WebView mo69484h() {
        return this.f38984b;
    }
}

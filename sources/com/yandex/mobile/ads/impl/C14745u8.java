package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IIdentifierCallback;

/* renamed from: com.yandex.mobile.ads.impl.u8 */
public class C14745u8 {

    /* renamed from: a */
    private final C14874v8 f40584a = new C14874v8();

    /* renamed from: a */
    public String mo70302a() {
        return m42616a("Connection timeout");
    }

    /* renamed from: b */
    public String mo70304b() {
        return m42616a("Incorrect integration");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo70305c() {
        return m42616a("Invalid response");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo70303a(IIdentifierCallback.Reason reason) {
        return m42616a(this.f40584a.mo70456a(reason));
    }

    /* renamed from: a */
    private String m42616a(String str) {
        return "Internal state wasn't completely configured. " + str + ".";
    }
}

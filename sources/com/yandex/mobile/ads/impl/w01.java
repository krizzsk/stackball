package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

public class w01 implements C12575b9 {

    /* renamed from: a */
    private final Object f41835a = new Object();

    /* renamed from: b */
    private final String f41836b;

    /* renamed from: c */
    private final String f41837c;

    /* renamed from: d */
    private final C12575b9 f41838d;

    public w01(String str, String str2, C12575b9 b9Var) {
        this.f41836b = str;
        this.f41837c = str2;
        this.f41838d = b9Var;
    }

    /* renamed from: a */
    public C15035w8 mo65695a() {
        C15035w8 w8Var;
        synchronized (this.f41835a) {
            C15035w8 a = this.f41838d.mo65695a();
            w8Var = new C15035w8(TextUtils.isEmpty(this.f41837c) ? a.mo70659a() : this.f41837c, a.mo70660b(), TextUtils.isEmpty(this.f41836b) ? a.mo70661c() : this.f41836b);
        }
        return w8Var;
    }
}

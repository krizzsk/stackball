package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c51;
import java.io.UnsupportedEncodingException;

public class rb1 extends l41<String> {

    /* renamed from: q */
    private final Object f39427q = new Object();

    /* renamed from: r */
    private c51.C12700b<String> f39428r;

    public rb1(int i, String str, c51.C12700b<String> bVar, c51.C12699a aVar) {
        super(i, str, aVar);
        this.f39428r = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66996a(Object obj) {
        c51.C12700b<String> bVar;
        String str = (String) obj;
        synchronized (this.f39427q) {
            bVar = this.f39428r;
        }
        if (bVar != null) {
            bVar.mo64360a(str);
        }
    }

    /* renamed from: a */
    public void mo66995a() {
        super.mo66995a();
        synchronized (this.f39427q) {
            this.f39428r = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<String> mo66994a(fv0 fv0) {
        String str;
        try {
            str = new String(fv0.f33756b, xb0.m43997a(fv0.f33757c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(fv0.f33756b);
        }
        return c51.m34589a(str, xb0.m43996a(fv0));
    }
}

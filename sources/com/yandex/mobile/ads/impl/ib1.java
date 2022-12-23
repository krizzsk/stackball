package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ib1 implements C13325hj {

    /* renamed from: a */
    private final C13325hj f34817a;

    /* renamed from: b */
    private long f34818b;

    /* renamed from: c */
    private Uri f34819c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f34820d = Collections.emptyMap();

    public ib1(C13325hj hjVar) {
        this.f34817a = (C13325hj) C13479j9.m37703a(hjVar);
    }

    /* renamed from: a */
    public void mo65277a(af1 af1) {
        this.f34817a.mo65277a(af1);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        return this.f34817a.mo65278b();
    }

    /* renamed from: c */
    public long mo67769c() {
        return this.f34818b;
    }

    public void close() throws IOException {
        this.f34817a.close();
    }

    /* renamed from: d */
    public Uri mo67770d() {
        return this.f34819c;
    }

    /* renamed from: e */
    public Map<String, List<String>> mo67771e() {
        return this.f34820d;
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws IOException {
        this.f34819c = jjVar.f35322a;
        this.f34820d = Collections.emptyMap();
        long a = this.f34817a.mo65275a(jjVar);
        Uri a2 = this.f34817a.mo65276a();
        a2.getClass();
        this.f34819c = a2;
        this.f34820d = this.f34817a.mo65278b();
        return a;
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f34817a.mo65274a(bArr, i, i2);
        if (a != -1) {
            this.f34818b += (long) a;
        }
        return a;
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f34817a.mo65276a();
    }
}

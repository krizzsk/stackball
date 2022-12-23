package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class dd1 implements C13325hj {

    /* renamed from: a */
    private final C13325hj f32541a;

    /* renamed from: b */
    private final C13207gj f32542b;

    /* renamed from: c */
    private boolean f32543c;

    /* renamed from: d */
    private long f32544d;

    public dd1(C13325hj hjVar, C13207gj gjVar) {
        this.f32541a = (C13325hj) C13479j9.m37703a(hjVar);
        this.f32542b = (C13207gj) C13479j9.m37703a(gjVar);
    }

    /* renamed from: a */
    public void mo65277a(af1 af1) {
        this.f32541a.mo65277a(af1);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        return this.f32541a.mo65278b();
    }

    public void close() throws IOException {
        try {
            this.f32541a.close();
        } finally {
            if (this.f32543c) {
                this.f32543c = false;
                this.f32542b.close();
            }
        }
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws IOException {
        long a = this.f32541a.mo65275a(jjVar);
        this.f32544d = a;
        if (a == 0) {
            return 0;
        }
        if (jjVar.f35328g == -1 && a != -1) {
            jjVar = jjVar.mo68006a(0, a);
        }
        this.f32543c = true;
        this.f32542b.mo67310a(jjVar);
        return this.f32544d;
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f32544d == 0) {
            return -1;
        }
        int a = this.f32541a.mo65274a(bArr, i, i2);
        if (a > 0) {
            this.f32542b.mo67311a(bArr, i, a);
            long j = this.f32544d;
            if (j != -1) {
                this.f32544d = j - ((long) a);
            }
        }
        return a;
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f32541a.mo65276a();
    }
}

package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class bc0 {

    /* renamed from: a */
    private final int f31287a;

    /* renamed from: b */
    private final List<n90> f31288b;

    /* renamed from: c */
    private final int f31289c;

    /* renamed from: d */
    private final InputStream f31290d;

    /* renamed from: e */
    private final byte[] f31291e;

    public bc0(int i, List<n90> list, int i2, InputStream inputStream) {
        this.f31287a = i;
        this.f31288b = list;
        this.f31289c = i2;
        this.f31290d = inputStream;
        this.f31291e = null;
    }

    /* renamed from: a */
    public final InputStream mo66036a() {
        InputStream inputStream = this.f31290d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f31291e != null) {
            return new ByteArrayInputStream(this.f31291e);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo66037b() {
        return this.f31289c;
    }

    /* renamed from: c */
    public final List<n90> mo66038c() {
        return Collections.unmodifiableList(this.f31288b);
    }

    /* renamed from: d */
    public final int mo66039d() {
        return this.f31287a;
    }

    public bc0(int i, List<n90> list, byte[] bArr) {
        this.f31287a = i;
        this.f31288b = list;
        this.f31289c = bArr.length;
        this.f31291e = bArr;
        this.f31290d = null;
    }
}

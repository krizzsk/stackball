package com.yandex.mobile.ads.impl;

import java.io.File;

/* renamed from: com.yandex.mobile.ads.impl.ud */
public class C14752ud implements Comparable<C14752ud> {

    /* renamed from: b */
    public final String f40629b;

    /* renamed from: c */
    public final long f40630c;

    /* renamed from: d */
    public final long f40631d;

    /* renamed from: e */
    public final boolean f40632e;

    /* renamed from: f */
    public final File f40633f;

    /* renamed from: g */
    public final long f40634g;

    public C14752ud(String str, long j, long j2, long j3, File file) {
        this.f40629b = str;
        this.f40630c = j;
        this.f40631d = j2;
        this.f40632e = file != null;
        this.f40633f = file;
        this.f40634g = j3;
    }

    /* renamed from: a */
    public boolean mo70333a() {
        return !this.f40632e;
    }

    /* renamed from: a */
    public int compareTo(C14752ud udVar) {
        if (!this.f40629b.equals(udVar.f40629b)) {
            return this.f40629b.compareTo(udVar.f40629b);
        }
        int i = ((this.f40630c - udVar.f40630c) > 0 ? 1 : ((this.f40630c - udVar.f40630c) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}

package com.chartboost.sdk.Networking;

import com.chartboost.sdk.Model.CBError;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.chartboost.sdk.Networking.c */
public class C1851c<T> {

    /* renamed from: a */
    public final String f4560a;

    /* renamed from: b */
    public final String f4561b;

    /* renamed from: c */
    public final int f4562c;

    /* renamed from: d */
    public final AtomicInteger f4563d = new AtomicInteger();

    /* renamed from: e */
    public final File f4564e;

    /* renamed from: f */
    public long f4565f;

    /* renamed from: g */
    public long f4566g;

    /* renamed from: h */
    public long f4567h;

    /* renamed from: i */
    public int f4568i;

    public C1851c(String str, String str2, int i, File file) {
        this.f4560a = str;
        this.f4561b = str2;
        this.f4562c = i;
        this.f4564e = file;
        this.f4565f = 0;
        this.f4566g = 0;
        this.f4567h = 0;
        this.f4568i = 0;
    }

    /* renamed from: a */
    public C1852d mo14330a() {
        return new C1852d((Map<String, String>) null, (byte[]) null, (String) null);
    }

    /* renamed from: a */
    public void mo14332a(CBError cBError, C1854f fVar) {
    }

    /* renamed from: a */
    public void mo14333a(T t, C1854f fVar) {
    }

    /* renamed from: b */
    public boolean mo14334b() {
        return this.f4563d.compareAndSet(0, -1);
    }

    /* renamed from: a */
    public C1853e<T> mo14331a(C1854f fVar) {
        return C1853e.m4181a(null);
    }
}

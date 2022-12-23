package com.yandex.metrica.impl.p265ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ed */
public class C10221Ed {

    /* renamed from: a */
    public final long f24584a;

    /* renamed from: b */
    public final boolean f24585b;

    /* renamed from: c */
    public final List<C10547Nc> f24586c;

    public C10221Ed(long j, boolean z, List<C10547Nc> list) {
        this.f24584a = j;
        this.f24585b = z;
        this.f24586c = list;
    }

    public String toString() {
        return "WakeupConfig{collectionDuration=" + this.f24584a + ", aggressiveRelaunch=" + this.f24585b + ", collectionIntervalRanges=" + this.f24586c + '}';
    }
}

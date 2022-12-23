package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.C1832j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.chartboost.sdk.impl.l */
class C1942l implements Comparable<C1942l> {

    /* renamed from: a */
    private final C1832j f4973a;

    /* renamed from: b */
    final int f4974b;

    /* renamed from: c */
    final String f4975c;

    /* renamed from: d */
    final String f4976d;

    /* renamed from: e */
    final String f4977e;

    /* renamed from: f */
    final String f4978f;

    /* renamed from: g */
    final AtomicInteger f4979g;

    /* renamed from: h */
    private final AtomicReference<C1936j> f4980h;

    /* renamed from: i */
    private final long f4981i;

    /* renamed from: j */
    final AtomicInteger f4982j;

    C1942l(C1832j jVar, int i, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference<C1936j> atomicReference, long j, AtomicInteger atomicInteger2, String str4) {
        this.f4973a = jVar;
        this.f4974b = i;
        this.f4975c = str;
        this.f4976d = str2;
        this.f4977e = str3;
        this.f4979g = atomicInteger;
        this.f4980h = atomicReference;
        this.f4981i = j;
        this.f4982j = atomicInteger2;
        this.f4978f = str4;
        atomicInteger.incrementAndGet();
    }

    /* renamed from: a */
    public int compareTo(C1942l lVar) {
        return this.f4974b - lVar.f4974b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14689a(Executor executor, boolean z) {
        C1936j andSet;
        if ((this.f4979g.decrementAndGet() == 0 || !z) && (andSet = this.f4980h.getAndSet((Object) null)) != null) {
            executor.execute(new C1939k(andSet, z, (int) TimeUnit.NANOSECONDS.toMillis(this.f4973a.mo14255b() - this.f4981i), this.f4982j.get()));
        }
    }
}

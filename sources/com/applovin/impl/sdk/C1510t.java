package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p024ad.C1363j;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.sdk.t */
class C1510t {

    /* renamed from: a */
    private int f3692a;

    /* renamed from: b */
    private final Queue<C1363j> f3693b = new LinkedList();

    /* renamed from: c */
    private final Object f3694c = new Object();

    C1510t(int i) {
        mo13287a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo13286a() {
        int size;
        synchronized (this.f3694c) {
            size = this.f3693b.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13287a(int i) {
        if (i > 25) {
            i = 25;
        }
        this.f3692a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13288a(C1363j jVar) {
        synchronized (this.f3694c) {
            if (mo13286a() <= 25) {
                this.f3693b.offer(jVar);
            } else {
                C1505q.m3345i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo13289b() {
        return this.f3692a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo13290c() {
        boolean z;
        synchronized (this.f3694c) {
            z = mo13286a() >= this.f3692a;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo13291d() {
        boolean z;
        synchronized (this.f3694c) {
            z = mo13286a() == 0;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1363j mo13292e() {
        C1363j poll;
        try {
            synchronized (this.f3694c) {
                poll = !mo13291d() ? this.f3693b.poll() : null;
            }
            return poll;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1363j mo13293f() {
        C1363j peek;
        synchronized (this.f3694c) {
            peek = this.f3693b.peek();
        }
        return peek;
    }
}

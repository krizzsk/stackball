package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.O */
public class C10582O<T> {

    /* renamed from: e */
    public static final C11428kg.C11433c f25302e = new C11428kg.C11433c();

    /* renamed from: a */
    private volatile long f25303a;

    /* renamed from: b */
    private volatile long f25304b;

    /* renamed from: c */
    private long f25305c = 0;

    /* renamed from: d */
    private T f25306d = null;

    public C10582O(long j, long j2) {
        this.f25303a = j;
        this.f25304b = j2;
    }

    /* renamed from: a */
    public T mo61844a() {
        return this.f25306d;
    }

    /* renamed from: b */
    public final boolean mo61847b() {
        return this.f25306d == null;
    }

    /* renamed from: c */
    public final boolean mo61848c() {
        if (this.f25305c == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f25305c;
        if (currentTimeMillis > this.f25304b || currentTimeMillis < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo61849d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f25305c;
        return currentTimeMillis > this.f25303a || currentTimeMillis < 0;
    }

    public String toString() {
        return "CachedData{refreshTime=" + this.f25303a + ", mCachedTime=" + this.f25305c + ", expiryTime=" + this.f25304b + ", mCachedData=" + this.f25306d + '}';
    }

    /* renamed from: a */
    public void mo61846a(T t) {
        this.f25306d = t;
        this.f25305c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo61845a(long j, long j2) {
        this.f25303a = j;
        this.f25304b = j2;
    }
}

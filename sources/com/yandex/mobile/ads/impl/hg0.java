package com.yandex.mobile.ads.impl;

public final class hg0 {

    /* renamed from: d */
    private static final Object f34406d = new Object();

    /* renamed from: e */
    private static volatile hg0 f34407e;

    /* renamed from: a */
    private boolean f34408a = true;

    /* renamed from: b */
    private boolean f34409b = true;

    /* renamed from: c */
    private boolean f34410c = true;

    private hg0() {
    }

    /* renamed from: a */
    public static hg0 m36966a() {
        if (f34407e == null) {
            synchronized (f34406d) {
                if (f34407e == null) {
                    f34407e = new hg0();
                }
            }
        }
        return f34407e;
    }

    /* renamed from: b */
    public void mo67549b(boolean z) {
        this.f34408a = z;
    }

    /* renamed from: c */
    public boolean mo67552c() {
        return this.f34408a;
    }

    /* renamed from: d */
    public boolean mo67553d() {
        return this.f34409b;
    }

    /* renamed from: b */
    public boolean mo67550b() {
        return this.f34410c;
    }

    /* renamed from: c */
    public void mo67551c(boolean z) {
        this.f34409b = z;
    }

    /* renamed from: a */
    public void mo67548a(boolean z) {
        this.f34410c = z;
    }
}

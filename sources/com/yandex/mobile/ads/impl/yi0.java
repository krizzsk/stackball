package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12966ed;
import java.util.TreeSet;

public final class yi0 implements C14094nd {

    /* renamed from: a */
    private final long f42870a;

    /* renamed from: b */
    private final TreeSet<C14752ud> f42871b = new TreeSet<>($$Lambda$yi0$2bdHXoaKAPxOxz6t0MjmZ2LO2TU.INSTANCE);

    /* renamed from: c */
    private long f42872c;

    public yi0(long j) {
        this.f42870a = j;
    }

    /* renamed from: a */
    public void mo71088a(C12966ed edVar, String str, long j, long j2) {
        if (j2 != -1) {
            m44336a(edVar, j2);
        }
    }

    /* renamed from: b */
    public void mo66816b(C12966ed edVar, C14752ud udVar) {
        this.f42871b.add(udVar);
        this.f42872c += udVar.f40631d;
        m44336a(edVar, 0);
    }

    /* renamed from: a */
    public void mo66814a(C12966ed edVar, C14752ud udVar) {
        this.f42871b.remove(udVar);
        this.f42872c -= udVar.f40631d;
    }

    /* renamed from: a */
    public void mo66815a(C12966ed edVar, C14752ud udVar, C14752ud udVar2) {
        this.f42871b.remove(udVar);
        this.f42872c -= udVar.f40631d;
        mo66816b(edVar, udVar2);
    }

    /* renamed from: a */
    private void m44336a(C12966ed edVar, long j) {
        while (this.f42872c + j > this.f42870a && !this.f42871b.isEmpty()) {
            try {
                edVar.mo66808a(this.f42871b.first());
            } catch (C12966ed.C12967a unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m44335a(C14752ud udVar, C14752ud udVar2) {
        long j = udVar.f40634g;
        long j2 = udVar2.f40634g;
        if (j - j2 == 0) {
            return udVar.compareTo(udVar2);
        }
        return j < j2 ? -1 : 1;
    }
}

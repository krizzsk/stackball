package com.chartboost.sdk.Tracking;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.chartboost.sdk.Tracking.d */
public class C1873d {

    /* renamed from: a */
    private int f4648a = 10;

    /* renamed from: b */
    private int f4649b = 30;

    /* renamed from: c */
    private HashMap<String, Long> f4650c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, Integer> f4651d = new HashMap<>();

    /* renamed from: e */
    private HashSet<String> f4652e = new HashSet<>();

    public C1873d(int i, int i2) {
        this.f4648a = i;
        this.f4649b = i2;
    }

    /* renamed from: a */
    private long m4295a(long j, long j2) {
        return (j - j2) / 1000;
    }

    /* renamed from: b */
    public synchronized C1878i mo14441b(C1878i iVar) {
        if (iVar == null) {
            return null;
        }
        String f = iVar.mo14470f();
        long g = iVar.mo14471g();
        long a = m4296a(iVar);
        m4297a(f, g);
        if (m4295a(g, a) > ((long) this.f4649b)) {
            this.f4650c.remove(f);
            m4297a(f, g);
            this.f4651d.remove(f);
        }
        if (this.f4652e.contains(f)) {
            return null;
        }
        if (m4294a(f, m4293a(f)) <= this.f4648a) {
            return iVar;
        }
        this.f4652e.add(iVar.mo14470f());
        return new C1875f("too_many_events", f, "", "");
    }

    /* renamed from: a */
    private void m4297a(String str, long j) {
        if (!this.f4650c.containsKey(str)) {
            this.f4650c.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private int m4294a(String str, int i) {
        int i2 = i + 1;
        this.f4651d.put(str, Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: a */
    private int m4293a(String str) {
        Integer num = this.f4651d.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    private long m4296a(C1878i iVar) {
        Long l = this.f4650c.get(iVar.mo14470f());
        if (l == null) {
            l = Long.valueOf(iVar.mo14471g());
        }
        return l.longValue();
    }
}

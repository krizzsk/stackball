package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.File;
import java.util.TreeSet;

/* renamed from: com.yandex.mobile.ads.impl.yd */
final class C15242yd {

    /* renamed from: a */
    public final int f42807a;

    /* renamed from: b */
    public final String f42808b;

    /* renamed from: c */
    private final TreeSet<o81> f42809c = new TreeSet<>();

    /* renamed from: d */
    private C12742ck f42810d;

    /* renamed from: e */
    private boolean f42811e;

    public C15242yd(int i, String str, C12742ck ckVar) {
        this.f42807a = i;
        this.f42808b = str;
        this.f42810d = ckVar;
    }

    /* renamed from: a */
    public C12742ck mo71024a() {
        return this.f42810d;
    }

    /* renamed from: b */
    public TreeSet<o81> mo71031b() {
        return this.f42809c;
    }

    /* renamed from: c */
    public boolean mo71032c() {
        return this.f42809c.isEmpty();
    }

    /* renamed from: d */
    public boolean mo71033d() {
        return this.f42811e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15242yd.class != obj.getClass()) {
            return false;
        }
        C15242yd ydVar = (C15242yd) obj;
        if (this.f42807a != ydVar.f42807a || !this.f42808b.equals(ydVar.f42808b) || !this.f42809c.equals(ydVar.f42809c) || !this.f42810d.equals(ydVar.f42810d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f42807a * 31) + this.f42808b.hashCode()) * 31) + this.f42810d.hashCode();
    }

    /* renamed from: a */
    public boolean mo71029a(C14680th thVar) {
        C12742ck ckVar = this.f42810d;
        C12742ck a = ckVar.mo66312a(thVar);
        this.f42810d = a;
        return !a.equals(ckVar);
    }

    /* renamed from: a */
    public void mo71028a(boolean z) {
        this.f42811e = z;
    }

    /* renamed from: a */
    public void mo71027a(o81 o81) {
        this.f42809c.add(o81);
    }

    /* renamed from: a */
    public o81 mo71025a(long j) {
        o81 a = o81.m40309a(this.f42808b, j);
        o81 floor = this.f42809c.floor(a);
        if (floor != null && floor.f40630c + floor.f40631d > j) {
            return floor;
        }
        o81 ceiling = this.f42809c.ceiling(a);
        if (ceiling == null) {
            return o81.m40312b(this.f42808b, j);
        }
        return o81.m40310a(this.f42808b, j, ceiling.f40630c - j);
    }

    /* renamed from: a */
    public long mo71023a(long j, long j2) {
        boolean z = true;
        C13479j9.m37705a(j >= 0);
        C13479j9.m37705a(j2 >= 0);
        o81 a = mo71025a(j);
        long j3 = Long.MAX_VALUE;
        if (a.mo70333a()) {
            long j4 = a.f40631d;
            if (j4 != -1) {
                z = false;
            }
            if (!z) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = a.f40630c + a.f40631d;
        if (j6 < j3) {
            for (o81 next : this.f42809c.tailSet(a, false)) {
                long j7 = next.f40630c;
                if (j7 <= j6) {
                    j6 = Math.max(j6, j7 + next.f40631d);
                    if (j6 >= j3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    /* renamed from: a */
    public o81 mo71026a(o81 o81, long j, boolean z) {
        C13479j9.m37708b(this.f42809c.remove(o81));
        File file = o81.f40633f;
        if (z) {
            File a = o81.m40311a(file.getParentFile(), this.f42807a, o81.f40630c, j);
            if (file.renameTo(a)) {
                file = a;
            } else {
                Log.w("CachedContent", "Failed to rename " + file + " to " + a);
            }
        }
        o81 a2 = o81.mo69125a(file, j);
        this.f42809c.add(a2);
        return a2;
    }

    /* renamed from: a */
    public boolean mo71030a(C14752ud udVar) {
        if (!this.f42809c.remove(udVar)) {
            return false;
        }
        udVar.f40633f.delete();
        return true;
    }
}

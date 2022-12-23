package com.yandex.metrica.impl.p265ob;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.h6 */
public class C11306h6 {

    /* renamed from: a */
    private boolean f27034a;

    /* renamed from: b */
    private Set<Integer> f27035b;

    /* renamed from: c */
    private int f27036c;

    /* renamed from: d */
    private int f27037d;

    public C11306h6() {
        this(false, 0, 0, new HashSet());
    }

    /* renamed from: a */
    public void mo62990a() {
        this.f27035b = new HashSet();
        this.f27037d = 0;
    }

    /* renamed from: b */
    public Set<Integer> mo62993b() {
        return this.f27035b;
    }

    /* renamed from: c */
    public int mo62995c() {
        return this.f27037d;
    }

    /* renamed from: d */
    public int mo62996d() {
        return this.f27036c;
    }

    /* renamed from: e */
    public boolean mo62997e() {
        return this.f27034a;
    }

    public C11306h6(boolean z, int i, int i2, Set<Integer> set) {
        this.f27034a = z;
        this.f27035b = set;
        this.f27036c = i;
        this.f27037d = i2;
    }

    /* renamed from: b */
    public void mo62994b(int i) {
        this.f27036c = i;
        this.f27037d = 0;
    }

    /* renamed from: a */
    public void mo62992a(boolean z) {
        this.f27034a = z;
    }

    /* renamed from: a */
    public void mo62991a(int i) {
        this.f27035b.add(Integer.valueOf(i));
        this.f27037d++;
    }
}

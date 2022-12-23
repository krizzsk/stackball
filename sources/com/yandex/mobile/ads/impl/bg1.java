package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

final class bg1 implements yb1 {

    /* renamed from: c */
    public static final bg1 f31323c = new bg1();

    /* renamed from: b */
    private final List<C14683ti> f31324b;

    public bg1(C14683ti tiVar) {
        this.f31324b = Collections.singletonList(tiVar);
    }

    /* renamed from: a */
    public int mo66066a() {
        return 1;
    }

    /* renamed from: a */
    public int mo66067a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: a */
    public long mo66068a(int i) {
        C13479j9.m37705a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public List<C14683ti> mo66069b(long j) {
        return j >= 0 ? this.f31324b : Collections.emptyList();
    }

    private bg1() {
        this.f31324b = Collections.emptyList();
    }
}

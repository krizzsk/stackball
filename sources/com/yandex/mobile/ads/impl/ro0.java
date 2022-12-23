package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

final class ro0 implements yb1 {

    /* renamed from: b */
    private final List<C14683ti> f39529b;

    public ro0(List<C14683ti> list) {
        this.f39529b = Collections.unmodifiableList(list);
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
        return j >= 0 ? this.f39529b : Collections.emptyList();
    }
}

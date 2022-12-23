package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

final class db1 implements yb1 {

    /* renamed from: b */
    private final List<List<C14683ti>> f32508b;

    /* renamed from: c */
    private final List<Long> f32509c;

    public db1(List<List<C14683ti>> list, List<Long> list2) {
        this.f32508b = list;
        this.f32509c = list2;
    }

    /* renamed from: a */
    public int mo66067a(long j) {
        int i;
        List<Long> list = this.f32509c;
        Long valueOf = Long.valueOf(j);
        int i2 = ih1.f34858a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size || list.get(binarySearch).compareTo(valueOf) != 0) {
                    i = binarySearch;
                }
                binarySearch++;
                break;
            } while (list.get(binarySearch).compareTo(valueOf) != 0);
            i = binarySearch;
        }
        if (i < this.f32509c.size()) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C14683ti> mo66069b(long j) {
        int i;
        List<Long> list = this.f32509c;
        Long valueOf = Long.valueOf(j);
        int i2 = ih1.f34858a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || list.get(binarySearch).compareTo(valueOf) != 0) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (list.get(binarySearch).compareTo(valueOf) != 0);
            i = binarySearch + 1;
        }
        if (i == -1) {
            return Collections.emptyList();
        }
        return this.f32508b.get(i);
    }

    /* renamed from: a */
    public int mo66066a() {
        return this.f32509c.size();
    }

    /* renamed from: a */
    public long mo66068a(int i) {
        boolean z = true;
        C13479j9.m37705a(i >= 0);
        if (i >= this.f32509c.size()) {
            z = false;
        }
        C13479j9.m37705a(z);
        return this.f32509c.get(i).longValue();
    }
}

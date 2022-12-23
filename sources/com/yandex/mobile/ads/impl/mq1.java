package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import com.yandex.mobile.ads.impl.iq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class mq1 implements yb1 {

    /* renamed from: b */
    private final List<iq1> f37487b;

    /* renamed from: c */
    private final int f37488c;

    /* renamed from: d */
    private final long[] f37489d;

    /* renamed from: e */
    private final long[] f37490e;

    public mq1(List<iq1> list) {
        this.f37487b = list;
        int size = list.size();
        this.f37488c = size;
        this.f37489d = new long[(size * 2)];
        for (int i = 0; i < this.f37488c; i++) {
            iq1 iq1 = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f37489d;
            jArr[i2] = iq1.f34992g;
            jArr[i2 + 1] = iq1.f34993h;
        }
        long[] jArr2 = this.f37489d;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f37490e = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public int mo66067a(long j) {
        int a = ih1.m37368a(this.f37490e, j, false, false);
        if (a < this.f37490e.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C14683ti> mo66069b(long j) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        iq1 iq1 = null;
        for (int i = 0; i < this.f37488c; i++) {
            long[] jArr = this.f37489d;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                iq1 iq12 = this.f37487b.get(i);
                if (!(iq12.f40338c == -3.4028235E38f && iq12.f40339d == 0.5f)) {
                    arrayList.add(iq12);
                } else if (iq1 == null) {
                    iq1 = iq12;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    CharSequence charSequence = iq1.f40337b;
                    charSequence.getClass();
                    SpannableStringBuilder append = spannableStringBuilder.append(charSequence).append("\n");
                    CharSequence charSequence2 = iq12.f40337b;
                    charSequence2.getClass();
                    append.append(charSequence2);
                } else {
                    SpannableStringBuilder append2 = spannableStringBuilder.append("\n");
                    CharSequence charSequence3 = iq12.f40337b;
                    charSequence3.getClass();
                    append2.append(charSequence3);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new iq1.C13435b().mo67875a((CharSequence) spannableStringBuilder).mo67876a());
        } else if (iq1 != null) {
            arrayList.add(iq1);
        }
        return arrayList;
    }

    /* renamed from: a */
    public int mo66066a() {
        return this.f37490e.length;
    }

    /* renamed from: a */
    public long mo66068a(int i) {
        boolean z = true;
        C13479j9.m37705a(i >= 0);
        if (i >= this.f37490e.length) {
            z = false;
        }
        C13479j9.m37705a(z);
        return this.f37490e[i];
    }
}

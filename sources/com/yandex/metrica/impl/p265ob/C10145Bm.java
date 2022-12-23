package com.yandex.metrica.impl.p265ob;

import java.util.Random;

/* renamed from: com.yandex.metrica.impl.ob.Bm */
public class C10145Bm {

    /* renamed from: a */
    private final Random f24416a;

    public C10145Bm() {
        this(new Random());
    }

    /* renamed from: a */
    public long mo61118a(long j, long j2) {
        if (j < j2) {
            long nextLong = this.f24416a.nextLong();
            if (nextLong == Long.MIN_VALUE) {
                nextLong = 0;
            } else if (nextLong < 0) {
                nextLong = -nextLong;
            }
            return j + (nextLong % (j2 - j));
        }
        throw new IllegalArgumentException("min should be less than max");
    }

    public C10145Bm(Random random) {
        this.f24416a = random;
    }
}

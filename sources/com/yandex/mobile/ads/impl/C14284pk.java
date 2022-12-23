package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mj0;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.pk */
public class C14284pk implements hj0 {
    public C14284pk() {
        this(-1);
    }

    /* renamed from: a */
    public int mo69373a(int i) {
        return i == 7 ? 6 : 3;
    }

    /* renamed from: a */
    public long mo69374a(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof jy0) || (iOException instanceof FileNotFoundException) || (iOException instanceof mj0.C13989h)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    public C14284pk(int i) {
    }
}

package com.yandex.metrica.impl.p265ob;

import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.Nm */
public class C10580Nm implements C10616Om {
    /* renamed from: a */
    public long mo61840a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo61841b() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: c */
    public long mo61842c() {
        return SystemClock.elapsedRealtime();
    }
}

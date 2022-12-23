package com.yandex.metrica.impl.p265ob;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Mm */
public class C10530Mm {

    /* renamed from: a */
    private final C10580Nm f25226a;

    public C10530Mm() {
        this(new C10580Nm());
    }

    /* renamed from: a */
    public long mo61804a(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j);
        this.f25226a.getClass();
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    /* renamed from: b */
    public long mo61805b(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return 0;
        }
        return this.f25226a.mo61841b() - timeUnit.toSeconds(j);
    }

    /* renamed from: c */
    public long mo61806c(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f25226a.getClass();
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j));
    }

    public C10530Mm(C10580Nm nm) {
        this.f25226a = nm;
    }
}

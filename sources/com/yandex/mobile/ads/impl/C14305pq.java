package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.pq */
public final class C14305pq {

    /* renamed from: e */
    private static final C14306a f38788e = new C14306a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @Deprecated

    /* renamed from: f */
    public static volatile long f38789f = -1;
    /* access modifiers changed from: private */
    @Deprecated

    /* renamed from: g */
    public static volatile long f38790g = -1;

    /* renamed from: a */
    private final long f38791a;

    /* renamed from: b */
    private long f38792b = -1;

    /* renamed from: c */
    private long f38793c = -1;

    /* renamed from: d */
    private final AtomicBoolean f38794d = new AtomicBoolean(false);

    /* renamed from: com.yandex.mobile.ads.impl.pq$a */
    private static final class C14306a {
        private C14306a() {
        }

        public /* synthetic */ C14306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final boolean m40911a(C14306a aVar, long j) {
            return C14305pq.f38789f == j;
        }

        /* renamed from: b */
        public static final boolean m40912b(C14306a aVar, long j) {
            return C14305pq.f38790g == j;
        }
    }

    public C14305pq(long j) {
        this.f38791a = j;
    }

    /* renamed from: c */
    public final void mo69397c() {
        long j;
        if (this.f38792b < 0) {
            synchronized (f38788e) {
                if (f38789f == -1) {
                    f38789f = SystemClock.uptimeMillis();
                    j = f38789f;
                } else {
                    j = SystemClock.uptimeMillis();
                }
            }
            this.f38792b = j;
        }
    }

    /* renamed from: d */
    public final synchronized long mo69398d() {
        long j;
        if (this.f38793c == -1) {
            synchronized (f38788e) {
                if (f38790g == -1) {
                    f38790g = SystemClock.uptimeMillis();
                    j = f38790g;
                } else {
                    j = SystemClock.uptimeMillis();
                }
            }
            this.f38793c = j;
            return j;
        }
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final void mo69396a(long j, long j2, ea0 ea0) {
        long j3 = j2;
        Intrinsics.checkNotNullParameter(ea0, "histogramReporter");
        if (j3 >= 0) {
            C14306a aVar = f38788e;
            ea0.m35609a(ea0, "Div.View.Create", j3 - j, (String) null, C14306a.m40912b(aVar, j3) ? "Cold" : this.f38793c == j3 ? "Cool" : "Warm", (ba0) null, 20, (Object) null);
            if (this.f38794d.compareAndSet(false, true)) {
                long j4 = this.f38792b;
                if (j4 >= 0) {
                    ea0.m35609a(ea0, "Div.Context.Create", this.f38792b - this.f38791a, (String) null, C14306a.m40911a(aVar, j4) ? "Cold" : "Cool", (ba0) null, 20, (Object) null);
                    this.f38792b = -1;
                }
            }
        }
    }
}

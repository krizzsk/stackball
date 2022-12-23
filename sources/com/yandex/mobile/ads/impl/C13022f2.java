package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.f2 */
public final class C13022f2 {
    @Deprecated

    /* renamed from: d */
    private static final long f33204d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final C12564b2 f33205a;

    /* renamed from: b */
    private final hg0 f33206b = hg0.m36966a();

    /* renamed from: c */
    private final Handler f33207c = new Handler(Looper.getMainLooper());

    public C13022f2(C12564b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "adGroupController");
        this.f33205a = b2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m35873a(C13022f2 f2Var, C13471j2 j2Var) {
        Intrinsics.checkNotNullParameter(f2Var, "this$0");
        Intrinsics.checkNotNullParameter(j2Var, "$nextAd");
        if (Intrinsics.areEqual((Object) f2Var.f33205a.mo65944f(), (Object) j2Var)) {
            ll1 b = j2Var.mo67917b();
            lg0 a = j2Var.mo67916a();
            if (b.mo68486a().ordinal() == 0) {
                a.mo68429d();
            }
        }
    }

    /* renamed from: b */
    public final void mo66910b() {
        C13471j2 f;
        if (this.f33206b.mo67550b() && (f = this.f33205a.mo65944f()) != null) {
            this.f33207c.postDelayed(new Runnable(f) {
                public final /* synthetic */ C13471j2 f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C13022f2.m35873a(C13022f2.this, this.f$1);
                }
            }, f33204d);
        }
    }

    /* renamed from: c */
    public final void mo66911c() {
        C13471j2 f = this.f33205a.mo65944f();
        if (f != null) {
            ll1 b = f.mo67917b();
            lg0 a = f.mo67916a();
            int ordinal = b.mo68486a().ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 6 || ordinal == 7) {
                a.mo68432g();
            }
        }
        this.f33207c.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final void mo66909a() {
        lg0 a;
        C13471j2 f = this.f33205a.mo65944f();
        if (!(f == null || (a = f.mo67916a()) == null)) {
            a.mo68426a();
        }
        this.f33207c.removeCallbacksAndMessages((Object) null);
    }
}

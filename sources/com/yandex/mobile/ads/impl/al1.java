package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

public final class al1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ll1 f30597a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12395a f30598b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f30599c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f30600d;

    /* renamed from: e */
    private boolean f30601e;

    /* renamed from: com.yandex.mobile.ads.impl.al1$a */
    public interface C12395a {
        /* renamed from: b */
        void mo65801b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.al1$b */
    private final class C12396b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ al1 f30602b;

        public C12396b(al1 al1) {
            Intrinsics.checkNotNullParameter(al1, "this$0");
            this.f30602b = al1;
        }

        public void run() {
            if (this.f30602b.f30600d || !this.f30602b.f30597a.mo68487a(kl1.PREPARED)) {
                this.f30602b.f30599c.postDelayed(this, 200);
                return;
            }
            this.f30602b.f30598b.mo65801b();
            this.f30602b.f30600d = true;
            this.f30602b.mo65800b();
        }
    }

    public al1(ll1 ll1, C12395a aVar) {
        Intrinsics.checkNotNullParameter(ll1, "statusController");
        Intrinsics.checkNotNullParameter(aVar, "preparedListener");
        this.f30597a = ll1;
        this.f30598b = aVar;
    }

    /* renamed from: b */
    public final void mo65800b() {
        this.f30599c.removeCallbacksAndMessages((Object) null);
        this.f30601e = false;
    }

    /* renamed from: a */
    public final void mo65799a() {
        if (!this.f30601e && !this.f30600d) {
            this.f30601e = true;
            this.f30599c.post(new C12396b(this));
        }
    }
}

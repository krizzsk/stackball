package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* renamed from: com.yandex.metrica.impl.ob.Mb */
public final class C10515Mb {

    /* renamed from: a */
    private C10439Km f25195a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f25196b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11769sn f25197c;

    /* renamed from: com.yandex.metrica.impl.ob.Mb$a */
    public static final class C10516a extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ C10515Mb f25198a;

        /* renamed from: b */
        final /* synthetic */ C10517b f25199b;

        /* renamed from: c */
        final /* synthetic */ C10701Rb f25200c;

        /* renamed from: d */
        final /* synthetic */ long f25201d;

        C10516a(C10515Mb mb, C10517b bVar, C10701Rb rb, long j) {
            this.f25198a = mb;
            this.f25199b = bVar;
            this.f25200c = rb;
            this.f25201d = j;
        }

        /* renamed from: a */
        public void mo61690a() {
            if (!this.f25198a.f25196b) {
                this.f25199b.mo61791a(true);
                this.f25200c.mo62126a();
                ((C11725rn) this.f25198a.f25197c).mo63614a(C10515Mb.m26958b(this.f25198a), this.f25201d, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Mb$b */
    public static final class C10517b {

        /* renamed from: a */
        private volatile boolean f25202a;

        public C10517b(boolean z) {
            this.f25202a = z;
        }

        /* renamed from: a */
        public final boolean mo61792a() {
            return this.f25202a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10517b(boolean z, int i) {
            this((i & 1) != 0 ? false : z);
        }

        /* renamed from: a */
        public final void mo61791a(boolean z) {
            this.f25202a = z;
        }
    }

    public C10515Mb(C11823ui uiVar, C10517b bVar, Random random, C11769sn snVar, C10701Rb rb) {
        this.f25197c = snVar;
        this.f25195a = new C10516a(this, bVar, rb, (long) uiVar.mo63800b());
        if (bVar.mo61792a()) {
            C10439Km km = this.f25195a;
            if (km == null) {
                Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
            }
            km.run();
            return;
        }
        long nextInt = (long) random.nextInt(uiVar.mo63799a() + 1);
        C10439Km km2 = this.f25195a;
        if (km2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        ((C11725rn) snVar).mo63614a(km2, nextInt, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static final /* synthetic */ C10439Km m26958b(C10515Mb mb) {
        C10439Km km = mb.f25195a;
        if (km == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        return km;
    }

    /* renamed from: a */
    public final void mo61790a() {
        this.f25196b = true;
        C11769sn snVar = this.f25197c;
        C10439Km km = this.f25195a;
        if (km == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        ((C11725rn) snVar).mo63612a((Runnable) km);
    }
}

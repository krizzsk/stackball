package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10199E;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Pb */
public final class C10631Pb {

    /* renamed from: a */
    private C11823ui f25402a;

    /* renamed from: b */
    private C10515Mb f25403b;

    /* renamed from: c */
    private final C10199E f25404c;

    /* renamed from: d */
    private final C10546Nb f25405d;

    /* renamed from: com.yandex.metrica.impl.ob.Pb$a */
    static final class C10632a implements C10199E.C10201b {

        /* renamed from: a */
        final /* synthetic */ C10631Pb f25406a;

        C10632a(C10631Pb pb) {
            this.f25406a = pb;
        }

        /* renamed from: a */
        public final void mo61213a(C10199E.C10200a aVar) {
            this.f25406a.m27213b();
        }
    }

    public C10631Pb(C10199E e, C10546Nb nb) {
        this.f25404c = e;
        this.f25405d = nb;
    }

    /* renamed from: b */
    public synchronized void mo61914b(C10675Qi qi) {
        if (!Intrinsics.areEqual((Object) qi.mo62022n(), (Object) this.f25402a)) {
            this.f25402a = qi.mo62022n();
            C10515Mb mb = this.f25403b;
            if (mb != null) {
                mb.mo61790a();
            }
            this.f25403b = null;
            if (m27212a()) {
                if (this.f25403b == null) {
                    C11823ui uiVar = this.f25402a;
                    if (uiVar != null) {
                        this.f25403b = this.f25405d.mo61814a(uiVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61913a(C10675Qi qi) {
        this.f25402a = qi.mo62022n();
        this.f25404c.mo61206a((C10199E.C10201b) new C10632a(this));
        m27213b();
    }

    /* renamed from: a */
    private final boolean m27212a() {
        boolean z;
        C11823ui uiVar = this.f25402a;
        if (uiVar == null) {
            return false;
        }
        C10199E.C10200a c = this.f25404c.mo61211c();
        Intrinsics.checkNotNullExpressionValue(c, "applicationStateProvider.currentState");
        if (!(uiVar.mo63801c().length() > 0)) {
            return false;
        }
        int ordinal = c.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            z = uiVar.mo63802d();
        } else if (ordinal == 2) {
            z = true;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m27213b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.Mb r0 = r2.f25403b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            boolean r1 = r2.m27212a()     // Catch:{ all -> 0x0031 }
            if (r1 != r0) goto L_0x0010
            monitor-exit(r2)
            return
        L_0x0010:
            if (r0 == 0) goto L_0x001e
            com.yandex.metrica.impl.ob.Mb r0 = r2.f25403b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0019
            r0.mo61790a()     // Catch:{ all -> 0x0031 }
        L_0x0019:
            r0 = 0
            r2.f25403b = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)
            return
        L_0x001e:
            com.yandex.metrica.impl.ob.Mb r0 = r2.f25403b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0023
            goto L_0x002f
        L_0x0023:
            com.yandex.metrica.impl.ob.ui r0 = r2.f25402a     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.yandex.metrica.impl.ob.Nb r1 = r2.f25405d     // Catch:{ all -> 0x0031 }
            com.yandex.metrica.impl.ob.Mb r0 = r1.mo61814a(r0)     // Catch:{ all -> 0x0031 }
            r2.f25403b = r0     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r2)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10631Pb.m27213b():void");
    }
}

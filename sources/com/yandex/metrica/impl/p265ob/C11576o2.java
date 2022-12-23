package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p265ob.C10734S;
import com.yandex.metrica.impl.p265ob.C11928x1;
import com.yandex.metrica.rtm.wrapper.C12060k;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.o2 */
public class C11576o2 implements C11928x1.C11931c, C12060k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10975Z0 f27809a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11928x1 f27810b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f27811c;

    /* renamed from: d */
    private final C11769sn f27812d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10829V6 f27813e;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    class C11577a extends C11583g {

        /* renamed from: b */
        final /* synthetic */ C10797U3 f27814b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11577a(C10797U3 u3) {
            super(C11576o2.this, (C11577a) null);
            this.f27814b = u3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63404a(IMetricaService iMetricaService) throws RemoteException {
            C10975Z0 a = C11576o2.this.f27809a;
            C10797U3 u3 = this.f27814b;
            ((C11544n2) a).getClass();
            Bundle bundle = new Bundle();
            synchronized (u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", u3);
            }
            iMetricaService.mo60835b(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    class C11578b extends C11583g {

        /* renamed from: b */
        final /* synthetic */ C10797U3 f27816b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11578b(C10797U3 u3) {
            super(C11576o2.this, (C11577a) null);
            this.f27816b = u3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63404a(IMetricaService iMetricaService) throws RemoteException {
            C10975Z0 a = C11576o2.this.f27809a;
            C10797U3 u3 = this.f27816b;
            ((C11544n2) a).getClass();
            Bundle bundle = new Bundle();
            synchronized (u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", u3);
            }
            iMetricaService.mo60834a(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$c */
    class C11579c extends C11580d {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f27818d = false;

        /* renamed from: e */
        private final C10197Dm f27819e;

        C11579c(C11582f fVar, C10197Dm dm) {
            super(fVar);
            this.f27819e = dm;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo63407b() {
            C11582f fVar = this.f27821b;
            if (fVar.mo63414b().f27305h == 0) {
                Context a = ((C11544n2) C11576o2.this.f27809a).mo63333a();
                Intent b = C10326H2.m26428b(a);
                fVar.mo63414b().f27302e = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo63170b();
                b.putExtras(fVar.mo63414b().mo63144b(fVar.mo63410a().mo63174c()));
                try {
                    a.startService(b);
                    return false;
                } catch (Throwable unused) {
                    C11576o2.this.f27813e.mo62374a(fVar);
                    return false;
                }
            } else {
                C11576o2.this.f27813e.mo62374a(fVar);
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
            if (r2.endsWith(com.facebook.internal.security.CertificateUtil.DELIMITER + "Metrica") != false) goto L_0x0039;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized java.lang.Void mo63405a() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f27818d     // Catch:{ all -> 0x0051 }
                r1 = 0
                if (r0 == 0) goto L_0x0008
                monitor-exit(r6)
                return r1
            L_0x0008:
                r0 = 1
                r6.f27818d = r0     // Catch:{ all -> 0x0051 }
                com.yandex.metrica.impl.ob.Dm r2 = r6.f27819e     // Catch:{ all -> 0x0051 }
                java.lang.String r3 = "Metrica"
                r2.getClass()     // Catch:{ all -> 0x0051 }
                java.lang.String r4 = r2.mo61204b()     // Catch:{ all -> 0x0038 }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
                if (r4 != 0) goto L_0x0038
                java.lang.String r2 = r2.mo61204b()     // Catch:{ all -> 0x0038 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
                r4.<init>()     // Catch:{ all -> 0x0038 }
                java.lang.String r5 = ":"
                r4.append(r5)     // Catch:{ all -> 0x0038 }
                r4.append(r3)     // Catch:{ all -> 0x0038 }
                java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0038 }
                boolean r2 = r2.endsWith(r3)     // Catch:{ all -> 0x0038 }
                if (r2 == 0) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0042
                com.yandex.metrica.impl.ob.o2$f r0 = r6.f27821b     // Catch:{ all -> 0x0051 }
                r6.mo63406a((com.yandex.metrica.impl.p265ob.C11576o2.C11582f) r0)     // Catch:{ all -> 0x0051 }
                monitor-exit(r6)
                return r1
            L_0x0042:
                com.yandex.metrica.impl.ob.o2 r0 = com.yandex.metrica.impl.p265ob.C11576o2.this     // Catch:{ all -> 0x0051 }
                com.yandex.metrica.impl.ob.x1 r0 = r0.f27810b     // Catch:{ all -> 0x0051 }
                r0.mo64061g()     // Catch:{ all -> 0x0051 }
                java.lang.Void r0 = super.call()     // Catch:{ all -> 0x0051 }
                monitor-exit(r6)
                return r0
            L_0x0051:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11576o2.C11579c.mo63405a():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63406a(C11582f fVar) {
            C11576o2.this.f27813e.mo62374a(fVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$d */
    class C11580d extends C11583g {

        /* renamed from: b */
        final C11582f f27821b;

        C11580d(C11582f fVar) {
            super(C11576o2.this, (C11577a) null);
            this.f27821b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63404a(IMetricaService iMetricaService) throws RemoteException {
            C11582f fVar = this.f27821b;
            ((C11544n2) C11576o2.this.f27809a).mo63336a(iMetricaService, fVar.mo63417e(), fVar.f27824b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63408a(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object call() throws Exception {
            return call();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$e */
    public interface C11581e {
        /* renamed from: a */
        C11411k0 mo63364a(C11411k0 k0Var);
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$f */
    public static class C11582f {

        /* renamed from: a */
        private C11411k0 f27823a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C11414k2 f27824b;

        /* renamed from: c */
        private boolean f27825c = false;

        /* renamed from: d */
        private C11581e f27826d;

        /* renamed from: e */
        private HashMap<C10734S.C10735a, Integer> f27827e;

        public C11582f(C11411k0 k0Var, C11414k2 k2Var) {
            this.f27823a = k0Var;
            this.f27824b = new C11414k2(new C10797U3(k2Var.mo62271a()), new CounterConfiguration(k2Var.mo62272b()), k2Var.mo63176e());
        }

        /* renamed from: b */
        public C11411k0 mo63414b() {
            return this.f27823a;
        }

        /* renamed from: c */
        public HashMap<C10734S.C10735a, Integer> mo63415c() {
            return this.f27827e;
        }

        /* renamed from: d */
        public boolean mo63416d() {
            return this.f27825c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C11411k0 mo63417e() {
            C11581e eVar = this.f27826d;
            return eVar != null ? eVar.mo63364a(this.f27823a) : this.f27823a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.f27823a + ", mEnvironment=" + this.f27824b + ", mCrash=" + this.f27825c + ", mAction=" + this.f27826d + ", mTrimmedFields=" + this.f27827e + '}';
        }

        /* renamed from: a */
        public C11582f mo63411a(C11581e eVar) {
            this.f27826d = eVar;
            return this;
        }

        /* renamed from: a */
        public C11582f mo63412a(HashMap<C10734S.C10735a, Integer> hashMap) {
            this.f27827e = hashMap;
            return this;
        }

        /* renamed from: a */
        public C11582f mo63413a(boolean z) {
            this.f27825c = z;
            return this;
        }

        /* renamed from: a */
        public C11414k2 mo63410a() {
            return this.f27824b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$g */
    private abstract class C11583g implements Callable<Void> {
        private C11583g() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(14:1|2|3|(2:5|6)|8|9|(1:15)|1|2|3|(0)|8|9|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[SYNTHETIC, Splitter:B:5:0x000e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r3 = this;
                r0 = 0
            L_0x0001:
                r1 = 0
                com.yandex.metrica.impl.ob.o2 r2 = com.yandex.metrica.impl.p265ob.C11576o2.this     // Catch:{ all -> 0x0025 }
                com.yandex.metrica.impl.ob.x1 r2 = r2.f27810b     // Catch:{ all -> 0x0025 }
                com.yandex.metrica.IMetricaService r2 = r2.mo64058d()     // Catch:{ all -> 0x0025 }
                if (r2 == 0) goto L_0x0012
                r3.mo63404a((com.yandex.metrica.IMetricaService) r2)     // Catch:{ RemoteException -> 0x0012 }
                return r1
            L_0x0012:
                boolean r2 = r3.mo63407b()     // Catch:{ all -> 0x0025 }
                int r0 = r0 + 1
                if (r2 == 0) goto L_0x0024
                boolean r2 = com.yandex.metrica.impl.p265ob.C10620P1.m27192a()     // Catch:{ all -> 0x0025 }
                if (r2 != 0) goto L_0x0024
                r2 = 20
                if (r0 < r2) goto L_0x0001
            L_0x0024:
                return r1
            L_0x0025:
                r0 = move-exception
                r3.mo63408a((java.lang.Throwable) r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11576o2.C11583g.call():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo63404a(IMetricaService iMetricaService) throws RemoteException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63408a(Throwable th) {
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0029 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo63407b() {
            /*
                r5 = this;
                com.yandex.metrica.impl.ob.o2 r0 = com.yandex.metrica.impl.p265ob.C11576o2.this
                com.yandex.metrica.impl.ob.x1 r0 = r0.f27810b
                r0.mo64056b()
                com.yandex.metrica.impl.ob.o2 r0 = com.yandex.metrica.impl.p265ob.C11576o2.this
                java.lang.Object r0 = r0.f27811c
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.o2 r1 = com.yandex.metrica.impl.p265ob.C11576o2.this     // Catch:{ all -> 0x0035 }
                com.yandex.metrica.impl.ob.x1 r1 = r1.f27810b     // Catch:{ all -> 0x0035 }
                boolean r1 = r1.mo64059e()     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x0032
                com.yandex.metrica.impl.ob.o2 r1 = com.yandex.metrica.impl.p265ob.C11576o2.this     // Catch:{ InterruptedException -> 0x0029 }
                java.lang.Object r1 = r1.f27811c     // Catch:{ InterruptedException -> 0x0029 }
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 0
                r1.wait(r2, r4)     // Catch:{ InterruptedException -> 0x0029 }
                goto L_0x0032
            L_0x0029:
                com.yandex.metrica.impl.ob.o2 r1 = com.yandex.metrica.impl.p265ob.C11576o2.this     // Catch:{ all -> 0x0035 }
                java.lang.Object r1 = r1.f27811c     // Catch:{ all -> 0x0035 }
                r1.notifyAll()     // Catch:{ all -> 0x0035 }
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                r0 = 1
                return r0
            L_0x0035:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11576o2.C11583g.mo63407b():boolean");
        }

        /* synthetic */ C11583g(C11576o2 o2Var, C11577a aVar) {
            this();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$h */
    class C11584h extends C11583g {

        /* renamed from: b */
        private final int f27829b;

        /* renamed from: c */
        private final Bundle f27830c;

        C11584h(C11576o2 o2Var, int i, Bundle bundle) {
            super(o2Var, (C11577a) null);
            this.f27829b = i;
            this.f27830c = bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo63404a(IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.mo60833a(this.f27829b, this.f27830c);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11576o2(com.yandex.metrica.impl.p265ob.C10975Z0 r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.Y r0 = com.yandex.metrica.impl.p265ob.C10941Y.m28234g()
            com.yandex.metrica.impl.ob.qn r0 = r0.mo62500d()
            com.yandex.metrica.impl.ob.sn r0 = r0.mo63563d()
            com.yandex.metrica.impl.ob.V6 r1 = new com.yandex.metrica.impl.ob.V6
            com.yandex.metrica.impl.ob.n2 r4 = (com.yandex.metrica.impl.p265ob.C11544n2) r4
            android.content.Context r2 = r4.mo63333a()
            r1.<init>(r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11576o2.<init>(com.yandex.metrica.impl.ob.Z0):void");
    }

    public void onServiceConnected() {
        synchronized (this.f27811c) {
            this.f27811c.notifyAll();
        }
    }

    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(C10797U3 u3) {
        return ((C11725rn) this.f27812d).mo63611a(new C11578b(u3));
    }

    public Future<Void> queueReport(C11582f fVar) {
        Callable callable;
        C11769sn snVar = this.f27812d;
        if (fVar.mo63416d()) {
            callable = new C11579c(fVar, C10941Y.m28234g().mo62503h());
        } else {
            callable = new C11580d(fVar);
        }
        return ((C11725rn) snVar).mo63611a(callable);
    }

    public Future<Void> queueResumeUserSession(C10797U3 u3) {
        return ((C11725rn) this.f27812d).mo63611a(new C11577a(u3));
    }

    public void reportData(int i, Bundle bundle) {
        ((C11725rn) this.f27812d).mo63611a(new C11584h(this, i, bundle));
    }

    public void sendCrash(C11582f fVar) {
        C11579c cVar = new C11579c(fVar, C10941Y.m28234g().mo62503h());
        if (this.f27810b.mo64059e()) {
            try {
                ((FutureTask) ((C11725rn) this.f27812d).mo63611a(cVar)).get(4, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!cVar.f27818d) {
            try {
                cVar.mo63405a();
            } catch (Throwable unused2) {
            }
        }
    }

    public C11576o2(C10975Z0 z0, C11769sn snVar, C10829V6 v6) {
        this.f27811c = new Object();
        this.f27809a = z0;
        this.f27812d = snVar;
        this.f27813e = v6;
        C11928x1 c = ((C11544n2) z0).mo63358c();
        this.f27810b = c;
        c.mo64055a((C11928x1.C11931c) this);
    }
}

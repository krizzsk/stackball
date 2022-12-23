package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.ADCFunction;
import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0727i0;
import com.adcolony.sdk.C0746l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.adcolony.sdk.j0 */
class C0735j0 {

    /* renamed from: e */
    static final String f1131e = "payload";

    /* renamed from: f */
    static final String f1132f = "request_type";

    /* renamed from: g */
    private static C0735j0 f1133g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0727i0 f1134a;

    /* renamed from: b */
    private final ExecutorService f1135b = C0849u0.m948h();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0746l.C0748b f1136c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f1137d = false;

    /* renamed from: com.adcolony.sdk.j0$a */
    class C0736a implements ADCFunction.Consumer<C0746l.C0748b> {

        /* renamed from: a */
        final /* synthetic */ C0746l.C0748b[] f1138a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f1139b;

        C0736a(C0746l.C0748b[] bVarArr, CountDownLatch countDownLatch) {
            this.f1138a = bVarArr;
            this.f1139b = countDownLatch;
        }

        /* renamed from: a */
        public void accept(C0746l.C0748b bVar) {
            this.f1138a[0] = bVar;
            this.f1139b.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.j0$b */
    class C0737b implements ADCFunction.Consumer<C0746l.C0748b> {
        C0737b() {
        }

        /* renamed from: a */
        public void accept(C0746l.C0748b bVar) {
        }
    }

    /* renamed from: com.adcolony.sdk.j0$c */
    class C0738c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ADCFunction.Consumer f1142a;

        /* renamed from: b */
        final /* synthetic */ long f1143b;

        C0738c(ADCFunction.Consumer consumer, long j) {
            this.f1142a = consumer;
            this.f1143b = j;
        }

        public void run() {
            C0746l.C0748b bVar;
            ADCFunction.Consumer consumer = this.f1142a;
            if (C0735j0.this.f1137d) {
                bVar = C0735j0.this.f1136c;
            } else {
                bVar = C0796s.m784b().mo9855a(C0735j0.this.f1134a, this.f1143b);
            }
            consumer.accept(bVar);
        }
    }

    C0735j0() {
    }

    /* renamed from: d */
    static C0735j0 m537d() {
        if (f1133g == null) {
            synchronized (C0735j0.class) {
                if (f1133g == null) {
                    f1133g = new C0735j0();
                }
            }
        }
        return f1133g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9673e() {
        this.f1137d = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9669a(C0727i0 i0Var) {
        this.f1134a = i0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0746l.C0748b mo9671b() {
        return mo9664a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0746l.C0748b mo9672c() {
        return this.f1136c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = r3.mo10090s(f1132f);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9668a(com.adcolony.sdk.C0645d0 r3) {
        /*
            r2 = this;
            com.adcolony.sdk.i0 r0 = r2.f1134a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.adcolony.sdk.z0 r3 = r3.mo9532b()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r0 = "payload"
            com.adcolony.sdk.z0 r3 = r3.mo10087p(r0)
            if (r3 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r0 = "request_type"
            java.lang.String r0 = r3.mo10090s(r0)
            com.adcolony.sdk.i0 r1 = r2.f1134a
            com.adcolony.sdk.i0$a r1 = r1.mo9646b(r0)
            if (r1 == 0) goto L_0x0026
            r2.m533a(r0, r3, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0735j0.mo9668a(com.adcolony.sdk.d0):void");
    }

    /* renamed from: a */
    private void m533a(String str, C0897z0 z0Var, C0727i0.C0728a aVar) {
        try {
            ContentValues a = m532a(z0Var, aVar);
            C0796s.m784b().mo9860a(aVar.mo9654h(), a);
            C0796s.m784b().mo9857a(aVar, a);
            mo9673e();
        } catch (NullPointerException | NumberFormatException e) {
            e.printStackTrace();
            C0580a0.C0581a aVar2 = new C0580a0.C0581a();
            C0580a0.C0581a a2 = aVar2.mo9419a("Error parsing event:" + str + " ").mo9419a(z0Var.toString());
            a2.mo9419a("Schema version: " + this.f1134a.mo9645b() + " ").mo9419a(" e: ").mo9419a(e.toString()).mo9421a(C0580a0.f190h);
        }
    }

    /* renamed from: a */
    static ContentValues m532a(C0897z0 z0Var, C0727i0.C0728a aVar) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (C0727i0.C0729b next : aVar.mo9647a()) {
            Object r = z0Var.mo10089r(next.mo9657b());
            if (r != null) {
                if (r instanceof Boolean) {
                    contentValues.put(next.mo9657b(), (Boolean) r);
                } else if (r instanceof Long) {
                    contentValues.put(next.mo9657b(), (Long) r);
                } else if (r instanceof Double) {
                    contentValues.put(next.mo9657b(), (Double) r);
                } else if (r instanceof Number) {
                    Number number = (Number) r;
                    if (number.doubleValue() != ((double) number.longValue()) || !"INTEGER".equalsIgnoreCase(next.mo9658c())) {
                        contentValues.put(next.mo9657b(), Double.valueOf(number.doubleValue()));
                    } else {
                        contentValues.put(next.mo9657b(), Long.valueOf(number.longValue()));
                    }
                } else if (r instanceof String) {
                    contentValues.put(next.mo9657b(), (String) r);
                }
            }
        }
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0746l.C0748b mo9664a(long j) {
        C0746l.C0748b[] bVarArr = new C0746l.C0748b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo9667a((ADCFunction.Consumer<C0746l.C0748b>) new C0736a(bVarArr, countDownLatch), j);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9665a() {
        mo9666a((ADCFunction.Consumer<C0746l.C0748b>) new C0737b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9666a(ADCFunction.Consumer<C0746l.C0748b> consumer) {
        mo9667a(consumer, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9667a(ADCFunction.Consumer<C0746l.C0748b> consumer, long j) {
        if (this.f1134a == null) {
            consumer.accept(null);
        } else if (this.f1137d) {
            consumer.accept(this.f1136c);
        } else if (!C0849u0.m919a(this.f1135b, (Runnable) new C0738c(consumer, j))) {
            new C0580a0.C0581a().mo9419a("Execute ADCOdtEventsListener.calculateFeatureVectors failed").mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9670a(C0746l.C0748b bVar) {
        this.f1136c = bVar;
        this.f1137d = true;
    }
}

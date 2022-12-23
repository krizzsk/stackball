package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.l0 */
class C0752l0<T> {

    /* renamed from: a */
    private final List<Callable<T>> f1192a = new ArrayList();

    /* renamed from: b */
    private boolean f1193b = false;

    /* renamed from: com.adcolony.sdk.l0$a */
    interface C0753a<T> extends Callable<T> {
        /* renamed from: a */
        T mo9718a();
    }

    C0752l0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9717a(Callable<T> callable) {
        if (!this.f1193b) {
            this.f1192a.add(callable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo9715a() {
        return mo9716a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo9716a(long j) {
        List<Future<T>> list;
        this.f1193b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f1192a.size());
        ArrayList arrayList2 = new ArrayList();
        if (j > 0) {
            try {
                list = newFixedThreadPool.invokeAll(this.f1192a, j, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        } else {
            list = newFixedThreadPool.invokeAll(this.f1192a);
        }
        arrayList2.addAll(list);
        newFixedThreadPool.shutdownNow();
        for (int i = 0; i < arrayList2.size(); i++) {
            Future future = (Future) arrayList2.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f1192a.get(i) instanceof C0753a) {
                arrayList.add(((C0753a) this.f1192a.get(i)).mo9718a());
            }
        }
        return arrayList;
    }
}

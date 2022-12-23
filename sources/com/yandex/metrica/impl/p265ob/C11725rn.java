package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.rn */
public class C11725rn implements C11769sn {

    /* renamed from: a */
    private final Looper f28095a;

    /* renamed from: b */
    private final Handler f28096b;

    /* renamed from: c */
    private final C11828un f28097c;

    public C11725rn(String str) {
        this(m30220a(str));
    }

    /* renamed from: a */
    public Handler mo63610a() {
        return this.f28096b;
    }

    /* renamed from: b */
    public Looper mo63615b() {
        return this.f28095a;
    }

    /* renamed from: c */
    public boolean mo63616c() {
        return this.f28097c.mo63616c();
    }

    /* renamed from: d */
    public void mo63617d() {
        this.f28096b.removeCallbacksAndMessages((Object) null);
    }

    public void execute(Runnable runnable) {
        this.f28096b.post(runnable);
    }

    C11725rn(C11828un unVar) {
        this(unVar, unVar.getLooper(), new Handler(unVar.getLooper()));
    }

    /* renamed from: a */
    public <T> Future<T> mo63611a(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f28096b.post(futureTask);
        return futureTask;
    }

    public C11725rn(C11828un unVar, Looper looper, Handler handler) {
        this.f28097c = unVar;
        this.f28095a = looper;
        this.f28096b = handler;
    }

    /* renamed from: a */
    public void mo63613a(Runnable runnable, long j) {
        this.f28096b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    /* renamed from: a */
    public void mo63614a(Runnable runnable, long j, TimeUnit timeUnit) {
        this.f28096b.postDelayed(runnable, timeUnit.toMillis(j));
    }

    /* renamed from: a */
    public void mo63612a(Runnable runnable) {
        this.f28096b.removeCallbacks(runnable);
    }

    /* renamed from: a */
    private static C11828un m30220a(String str) {
        C11828un b = new C11922wn(str).mo64047b();
        b.start();
        return b;
    }
}

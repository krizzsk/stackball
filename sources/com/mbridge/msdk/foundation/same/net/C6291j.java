package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.mbridge.msdk.foundation.same.net.j */
/* compiled from: RequestQueue */
public class C6291j {

    /* renamed from: a */
    private static final String f15619a = C6291j.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f15620b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6243c f15621c;

    /* renamed from: d */
    private Set<C6290i> f15622d = new HashSet();

    /* renamed from: e */
    private ExecutorService f15623e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* renamed from: f */
    private AtomicInteger f15624f = new AtomicInteger();

    public C6291j(Context context) {
        this.f15620b = context.getApplicationContext();
        this.f15621c = new C6246d(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final void mo43894a(final C6290i iVar) {
        iVar.mo43875a(this);
        synchronized (this) {
            this.f15622d.add(iVar);
        }
        iVar.mo43874a(this.f15624f.incrementAndGet());
        this.f15623e.execute(new Runnable() {
            public final void run() {
                new C6283h(C6291j.this.f15620b, (SSLSocketFactory) null, C6291j.this.f15621c).mo43863a(iVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43895b(C6290i iVar) {
        synchronized (this) {
            this.f15622d.remove(iVar);
        }
    }
}

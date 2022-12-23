package com.yandex.metrica.impl.p265ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.h */
public class C11296h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long f27011f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final C11298b f27012a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f27013b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Thread f27014c = new C11299c();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicBoolean f27015d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Runnable f27016e = new C11297a();

    /* renamed from: com.yandex.metrica.impl.ob.h$a */
    class C11297a implements Runnable {
        C11297a() {
        }

        public void run() {
            C11296h.this.f27015d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface C11298b {
        /* renamed from: a */
        void mo62982a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$c */
    private class C11299c extends Thread {
        public C11299c() {
        }

        public void run() {
            boolean z = false;
            int i = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C11296h.this.f27015d.set(false);
                    C11296h.this.f27013b.post(C11296h.this.f27016e);
                    i = 0;
                }
                try {
                    Thread.sleep(C11296h.f27011f);
                    if (!C11296h.this.f27015d.get()) {
                        i++;
                        if (i == 4 && !Debug.isDebuggerConnected()) {
                            C11296h.this.mo62979b();
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C11296h(C11298b bVar) {
        this.f27012a = bVar;
    }

    /* renamed from: b */
    public void mo62979b() {
        this.f27012a.mo62982a();
    }

    /* renamed from: c */
    public void mo62980c() {
        try {
            this.f27014c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f27014c.start();
    }
}

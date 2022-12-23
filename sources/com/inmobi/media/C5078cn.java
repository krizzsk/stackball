package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.inmobi.media.cn */
/* compiled from: TimeOutManager */
public class C5078cn {

    /* renamed from: a */
    private static final String f11621a = C5078cn.class.getSimpleName();

    /* renamed from: d */
    private static byte f11622d = -1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5077cm f11623b;

    /* renamed from: c */
    private HashMap<Byte, Timer> f11624c = new HashMap<>();

    public C5078cn(C5077cm cmVar) {
        this.f11623b = cmVar;
    }

    /* renamed from: a */
    public final boolean mo40340a(final byte b, long j) {
        if (this.f11624c.containsKey(Byte.valueOf(b))) {
            mo40339a(b);
        }
        try {
            Timer timer = new Timer(f11621a);
            this.f11624c.put(Byte.valueOf(b), timer);
            timer.schedule(new TimerTask() {
                public final void run() {
                    new Handler(Looper.getMainLooper()).post(new Runnable(b) {
                        public final void run() {
                            C5078cn.this.f11623b.mo40337b(r3);
                        }
                    });
                }
            }, j);
            return true;
        } catch (OutOfMemoryError unused) {
            C5327gw.m12263a((byte) 1, f11621a, "Could not execute timer due to OutOfMemory.");
            this.f11623b.mo40338c(b);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo40339a(byte b) {
        Timer timer = this.f11624c.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.f11624c.remove(Byte.valueOf(b));
        }
    }
}

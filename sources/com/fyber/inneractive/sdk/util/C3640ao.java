package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.ao */
public final class C3640ao {

    /* renamed from: a */
    boolean f9915a = false;

    /* renamed from: b */
    public C3642b f9916b;

    /* renamed from: c */
    public long f9917c = 0;

    /* renamed from: d */
    private final TimeUnit f9918d;

    /* renamed from: e */
    private final long f9919e;

    /* renamed from: f */
    private Handler f9920f;

    /* renamed from: com.fyber.inneractive.sdk.util.ao$b */
    public interface C3642b {
        /* renamed from: a */
        void mo18022a();
    }

    public C3640ao(TimeUnit timeUnit, long j) {
        this.f9919e = j;
        this.f9918d = timeUnit;
        IAlog.m9034b("Visible time counter init - time %d", Long.valueOf(j));
    }

    public C3640ao(TimeUnit timeUnit, long j, long j2) {
        this.f9919e = j;
        this.f9918d = timeUnit;
        this.f9917c = j2;
        IAlog.m9034b("Visible time counter init - time %d", Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo19562a() {
        C3641a aVar = new C3641a(this, (byte) 0);
        this.f9920f = aVar;
        this.f9915a = false;
        aVar.sendEmptyMessage(1932593528);
    }

    /* renamed from: b */
    public final void mo19564b() {
        this.f9915a = true;
        Handler handler = this.f9920f;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    /* renamed from: c */
    public final void mo19565c() {
        this.f9915a = false;
        mo19563a(SystemClock.uptimeMillis());
    }

    /* renamed from: com.fyber.inneractive.sdk.util.ao$a */
    private static class C3641a extends Handler {

        /* renamed from: a */
        private final WeakReference<C3640ao> f9921a;

        /* synthetic */ C3641a(C3640ao aoVar, byte b) {
            this(aoVar);
        }

        private C3641a(C3640ao aoVar) {
            super(Looper.getMainLooper());
            this.f9921a = new WeakReference<>(aoVar);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C3640ao aoVar = (C3640ao) this.f9921a.get();
            if (aoVar != null && message.what == 1932593528 && !aoVar.f9915a) {
                aoVar.mo19563a(message.getWhen());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19563a(long j) {
        long uptimeMillis = this.f9917c + (SystemClock.uptimeMillis() - j) + 50;
        this.f9917c = uptimeMillis;
        if (this.f9916b == null || uptimeMillis <= this.f9918d.toMillis(this.f9919e)) {
            Handler handler = this.f9920f;
            if (handler != null && this.f9916b != null) {
                handler.removeMessages(1932593528);
                this.f9920f.sendEmptyMessageDelayed(1932593528, 50);
                return;
            }
            return;
        }
        this.f9916b.mo18022a();
    }

    /* renamed from: d */
    public final void mo19566d() {
        this.f9915a = false;
        this.f9917c = 0;
        Handler handler = this.f9920f;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }
}

package com.fyber.inneractive.sdk.player.p059c.p081l;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;

/* renamed from: com.fyber.inneractive.sdk.player.c.l.e */
public final class C3569e {

    /* renamed from: a */
    final C3570a f9709a;

    /* renamed from: b */
    final boolean f9710b;

    /* renamed from: c */
    final long f9711c;

    /* renamed from: d */
    final long f9712d;

    /* renamed from: e */
    long f9713e;

    /* renamed from: f */
    long f9714f;

    /* renamed from: g */
    long f9715g;

    /* renamed from: h */
    boolean f9716h;

    /* renamed from: i */
    long f9717i;

    /* renamed from: j */
    long f9718j;

    /* renamed from: k */
    long f9719k;

    public C3569e() {
        this(-1.0d, false);
    }

    private C3569e(double d, boolean z) {
        this.f9710b = z;
        if (z) {
            this.f9709a = C3570a.m8932a();
            long j = (long) (1.0E9d / d);
            this.f9711c = j;
            this.f9712d = (j * 80) / 100;
            return;
        }
        this.f9709a = null;
        this.f9711c = -1;
        this.f9712d = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo19434a(long j, long j2) {
        return Math.abs((j2 - this.f9717i) - (j - this.f9718j)) > 20000000;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.l.e$a */
    private static final class C3570a implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: c */
        private static final C3570a f9720c = new C3570a();

        /* renamed from: a */
        public volatile long f9721a;

        /* renamed from: b */
        final Handler f9722b;

        /* renamed from: d */
        private final HandlerThread f9723d;

        /* renamed from: e */
        private Choreographer f9724e;

        /* renamed from: f */
        private int f9725f;

        /* renamed from: a */
        public static C3570a m8932a() {
            return f9720c;
        }

        private C3570a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f9723d = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.f9723d.getLooper(), this);
            this.f9722b = handler;
            handler.sendEmptyMessage(0);
        }

        public final void doFrame(long j) {
            this.f9721a = j;
            this.f9724e.postFrameCallbackDelayed(this, 500);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f9724e = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f9725f + 1;
                this.f9725f = i2;
                if (i2 == 1) {
                    this.f9724e.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f9725f - 1;
                this.f9725f = i3;
                if (i3 == 0) {
                    this.f9724e.removeFrameCallback(this);
                    this.f9721a = 0;
                }
                return true;
            }
        }
    }

    public C3569e(Context context) {
        this((double) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate(), true);
    }
}

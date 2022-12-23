package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3559s;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.s */
public final class C3528s {

    /* renamed from: a */
    public final ExecutorService f9572a;

    /* renamed from: b */
    public C3530b<? extends C3531c> f9573b;

    /* renamed from: c */
    public IOException f9574c;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.s$a */
    public interface C3529a<T extends C3531c> {
        /* renamed from: a */
        int mo19252a(T t, IOException iOException);

        /* renamed from: a */
        void mo19256a(T t);

        /* renamed from: a */
        void mo19257a(T t, boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.s$c */
    public interface C3531c {
        /* renamed from: a */
        void mo19270a();

        /* renamed from: b */
        boolean mo19272b();

        /* renamed from: c */
        void mo19273c() throws IOException, InterruptedException;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.s$d */
    public static final class C3532d extends IOException {
        public C3532d(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C3528s(String str) {
        this.f9572a = C3560t.m8879a(str);
    }

    /* renamed from: a */
    public final boolean mo19357a() {
        return this.f9573b != null;
    }

    /* renamed from: b */
    public final void mo19358b() {
        this.f9573b.mo19360a(false);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.s$b */
    private final class C3530b<T extends C3531c> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f9575a;

        /* renamed from: b */
        public IOException f9576b;

        /* renamed from: c */
        public int f9577c;

        /* renamed from: e */
        private final T f9579e;

        /* renamed from: f */
        private final C3529a<T> f9580f;

        /* renamed from: g */
        private final long f9581g;

        /* renamed from: h */
        private volatile Thread f9582h;

        /* renamed from: i */
        private volatile boolean f9583i;

        public C3530b(Looper looper, T t, C3529a<T> aVar, int i, long j) {
            super(looper);
            this.f9579e = t;
            this.f9580f = aVar;
            this.f9575a = i;
            this.f9581g = j;
        }

        /* renamed from: a */
        public final void mo19359a(long j) {
            C3535a.m8784b(C3528s.this.f9573b == null);
            C3528s.this.f9573b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m8766a();
            }
        }

        /* renamed from: a */
        public final void mo19360a(boolean z) {
            this.f9583i = z;
            this.f9576b = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f9579e.mo19270a();
                if (this.f9582h != null) {
                    this.f9582h.interrupt();
                }
            }
            if (z) {
                m8767b();
                SystemClock.elapsedRealtime();
                this.f9580f.mo19257a(this.f9579e, true);
            }
        }

        public final void run() {
            try {
                this.f9582h = Thread.currentThread();
                if (!this.f9579e.mo19272b()) {
                    C3559s.m8868a("load:" + this.f9579e.getClass().getSimpleName());
                    this.f9579e.mo19273c();
                    C3559s.m8867a();
                }
                if (!this.f9583i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f9583i) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C3535a.m8784b(this.f9579e.mo19272b());
                if (!this.f9583i) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f9583i) {
                    obtainMessage(3, new C3532d(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f9583i) {
                    obtainMessage(3, new C3532d(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f9583i) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C3559s.m8867a();
                throw th;
            }
        }

        public final void handleMessage(Message message) {
            int i;
            if (!this.f9583i) {
                if (message.what == 0) {
                    m8766a();
                } else if (message.what != 4) {
                    m8767b();
                    SystemClock.elapsedRealtime();
                    if (this.f9579e.mo19272b()) {
                        this.f9580f.mo19257a(this.f9579e, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        this.f9580f.mo19257a(this.f9579e, false);
                    } else if (i2 == 2) {
                        this.f9580f.mo19256a(this.f9579e);
                    } else if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f9576b = iOException;
                        int a = this.f9580f.mo19252a(this.f9579e, iOException);
                        if (a == 3) {
                            C3528s.this.f9574c = this.f9576b;
                        } else if (a != 2) {
                            if (a == 1) {
                                i = 1;
                            } else {
                                i = this.f9577c + 1;
                            }
                            this.f9577c = i;
                            mo19359a((long) Math.min((i - 1) * 1000, 5000));
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        /* renamed from: a */
        private void m8766a() {
            this.f9576b = null;
            C3528s.this.f9572a.execute(C3528s.this.f9573b);
        }

        /* renamed from: b */
        private void m8767b() {
            C3528s.this.f9573b = null;
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class mj0 {

    /* renamed from: d */
    public static final C13984c f37395d = new C13984c(2, -9223372036854775807L);

    /* renamed from: e */
    public static final C13984c f37396e = new C13984c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f37397a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13985d<? extends C13986e> f37398b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f37399c;

    /* renamed from: com.yandex.mobile.ads.impl.mj0$b */
    public interface C13983b<T extends C13986e> {
        /* renamed from: a */
        C13984c mo65305a(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: a */
        void mo65307a(T t, long j, long j2);

        /* renamed from: a */
        void mo65308a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.yandex.mobile.ads.impl.mj0$c */
    public static final class C13984c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f37400a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f37401b;

        private C13984c(int i, long j) {
            this.f37400a = i;
            this.f37401b = j;
        }

        /* renamed from: a */
        public boolean mo68702a() {
            int i = this.f37400a;
            return i == 0 || i == 1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mj0$e */
    public interface C13986e {
        /* renamed from: a */
        void mo65316a() throws IOException, InterruptedException;

        /* renamed from: b */
        void mo65318b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.mj0$f */
    public interface C13987f {
        /* renamed from: d */
        void mo65312d();
    }

    /* renamed from: com.yandex.mobile.ads.impl.mj0$g */
    private static final class C13988g implements Runnable {

        /* renamed from: b */
        private final C13987f f37412b;

        public C13988g(C13987f fVar) {
            this.f37412b = fVar;
        }

        public void run() {
            this.f37412b.mo65312d();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mj0$h */
    public static final class C13989h extends IOException {
        public C13989h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public mj0(String str) {
        this.f37397a = ih1.m37393c(str);
    }

    /* renamed from: c */
    public boolean mo68700c() {
        return this.f37399c != null;
    }

    /* renamed from: d */
    public boolean mo68701d() {
        return this.f37398b != null;
    }

    /* renamed from: com.yandex.mobile.ads.impl.mj0$d */
    private final class C13985d<T extends C13986e> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f37402b;

        /* renamed from: c */
        private final T f37403c;

        /* renamed from: d */
        private final long f37404d;

        /* renamed from: e */
        private C13983b<T> f37405e;

        /* renamed from: f */
        private IOException f37406f;

        /* renamed from: g */
        private int f37407g;

        /* renamed from: h */
        private Thread f37408h;

        /* renamed from: i */
        private boolean f37409i;

        /* renamed from: j */
        private volatile boolean f37410j;

        public C13985d(Looper looper, T t, C13983b<T> bVar, int i, long j) {
            super(looper);
            this.f37403c = t;
            this.f37405e = bVar;
            this.f37402b = i;
            this.f37404d = j;
        }

        /* renamed from: a */
        public void mo68703a(int i) throws IOException {
            IOException iOException = this.f37406f;
            if (iOException != null && this.f37407g > i) {
                throw iOException;
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f37410j) {
                int i = message.what;
                if (i == 0) {
                    this.f37406f = null;
                    ExecutorService b = mj0.this.f37397a;
                    C13985d a = mj0.this.f37398b;
                    a.getClass();
                    b.execute(a);
                } else if (i != 3) {
                    C13985d unused = mj0.this.f37398b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f37404d;
                    C13983b<T> bVar = this.f37405e;
                    bVar.getClass();
                    if (this.f37409i) {
                        bVar.mo65308a(this.f37403c, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            bVar.mo65307a(this.f37403c, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            bk0.m34269a("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused2 = mj0.this.f37399c = new C13989h(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f37406f = iOException;
                        int i3 = this.f37407g + 1;
                        this.f37407g = i3;
                        C13984c a2 = bVar.mo65305a(this.f37403c, elapsedRealtime, j2, iOException, i3);
                        if (a2.f37400a == 3) {
                            IOException unused3 = mj0.this.f37399c = this.f37406f;
                        } else if (a2.f37400a != 2) {
                            if (a2.f37400a == 1) {
                                this.f37407g = 1;
                            }
                            if (a2.f37401b != -9223372036854775807L) {
                                j = a2.f37401b;
                            } else {
                                j = (long) Math.min((this.f37407g - 1) * 1000, 5000);
                            }
                            mo68704a(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f37409i;
                    this.f37408h = Thread.currentThread();
                }
                if (z) {
                    he1.m36941a("load:" + this.f37403c.getClass().getSimpleName());
                    this.f37403c.mo65316a();
                    he1.m36940a();
                }
                synchronized (this) {
                    this.f37408h = null;
                    Thread.interrupted();
                }
                if (!this.f37410j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f37410j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C13479j9.m37708b(this.f37409i);
                if (!this.f37410j) {
                    sendEmptyMessage(1);
                }
            } catch (Exception e2) {
                bk0.m34269a("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f37410j) {
                    obtainMessage(2, new C13989h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                bk0.m34269a("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f37410j) {
                    obtainMessage(2, new C13989h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                bk0.m34269a("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f37410j) {
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                he1.m36940a();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo68704a(long j) {
            C13479j9.m37708b(mj0.this.f37398b == null);
            C13985d unused = mj0.this.f37398b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f37406f = null;
            ExecutorService b = mj0.this.f37397a;
            C13985d a = mj0.this.f37398b;
            a.getClass();
            b.execute(a);
        }

        /* renamed from: a */
        public void mo68705a(boolean z) {
            this.f37410j = z;
            this.f37406f = null;
            if (hasMessages(0)) {
                this.f37409i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f37409i = true;
                    this.f37403c.mo65318b();
                    Thread thread = this.f37408h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                C13985d unused = mj0.this.f37398b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C13983b<T> bVar = this.f37405e;
                bVar.getClass();
                bVar.mo65308a(this.f37403c, elapsedRealtime, elapsedRealtime - this.f37404d, true);
                this.f37405e = null;
            }
        }
    }

    /* renamed from: b */
    public void mo68699b() {
        this.f37399c = null;
    }

    /* renamed from: a */
    public static C13984c m39464a(boolean z, long j) {
        return new C13984c(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public <T extends C13986e> long mo68695a(T t, C13983b<T> bVar, int i) {
        this.f37399c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C13985d((Looper) C13479j9.m37707b(Looper.myLooper()), t, bVar, i, elapsedRealtime).mo68704a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public void mo68696a() {
        ((C13985d) C13479j9.m37707b(this.f37398b)).mo68705a(false);
    }

    /* renamed from: a */
    public void mo68698a(C13987f fVar) {
        C13985d<? extends C13986e> dVar = this.f37398b;
        if (dVar != null) {
            dVar.mo68705a(true);
        }
        this.f37397a.execute(new C13988g(fVar));
        this.f37397a.shutdown();
    }

    /* renamed from: a */
    public void mo68697a(int i) throws IOException {
        IOException iOException = this.f37399c;
        if (iOException == null) {
            C13985d<? extends C13986e> dVar = this.f37398b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f37402b;
                }
                dVar.mo68703a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}

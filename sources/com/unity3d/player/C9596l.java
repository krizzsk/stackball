package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.C9593k;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.unity3d.player.l */
final class C9596l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public UnityPlayer f23926a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f23927b = null;

    /* renamed from: c */
    private C9603a f23928c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Semaphore f23929d = new Semaphore(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Lock f23930e = new ReentrantLock();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9593k f23931f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f23932g = 2;

    /* renamed from: h */
    private boolean f23933h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f23934i = false;

    /* renamed from: com.unity3d.player.l$a */
    public interface C9603a {
        /* renamed from: a */
        void mo58673a();
    }

    C9596l(UnityPlayer unityPlayer) {
        this.f23926a = unityPlayer;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25707d() {
        C9593k kVar = this.f23931f;
        if (kVar != null) {
            this.f23926a.removeViewFromPlayer(kVar);
            this.f23934i = false;
            this.f23931f.destroyPlayer();
            this.f23931f = null;
            C9603a aVar = this.f23928c;
            if (aVar != null) {
                aVar.mo58673a();
            }
        }
    }

    /* renamed from: a */
    public final void mo58827a() {
        this.f23930e.lock();
        C9593k kVar = this.f23931f;
        if (kVar != null) {
            if (this.f23932g == 0) {
                kVar.CancelOnPrepare();
            } else if (this.f23934i) {
                boolean a = kVar.mo58800a();
                this.f23933h = a;
                if (!a) {
                    this.f23931f.pause();
                }
            }
        }
        this.f23930e.unlock();
    }

    /* renamed from: a */
    public final boolean mo58828a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, C9603a aVar) {
        this.f23930e.lock();
        this.f23928c = aVar;
        this.f23927b = context;
        this.f23929d.drainPermits();
        this.f23932g = 2;
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        final long j3 = j;
        final long j4 = j2;
        runOnUiThread(new Runnable() {
            public final void run() {
                if (C9596l.this.f23931f != null) {
                    C9578d.Log(5, "Video already playing");
                    int unused = C9596l.this.f23932g = 2;
                    C9596l.this.f23929d.release();
                    return;
                }
                C9593k unused2 = C9596l.this.f23931f = new C9593k(C9596l.this.f23927b, str2, i4, i5, i6, z2, j3, j4, new C9593k.C9594a() {
                    /* renamed from: a */
                    public final void mo58824a(int i) {
                        C9596l.this.f23930e.lock();
                        int unused = C9596l.this.f23932g = i;
                        if (i == 3 && C9596l.this.f23934i) {
                            C9596l.this.runOnUiThread(new Runnable() {
                                public final void run() {
                                    C9596l.this.m25707d();
                                    C9596l.this.f23926a.resume();
                                }
                            });
                        }
                        if (i != 0) {
                            C9596l.this.f23929d.release();
                        }
                        C9596l.this.f23930e.unlock();
                    }
                });
                if (C9596l.this.f23931f != null) {
                    C9596l.this.f23926a.addView(C9596l.this.f23931f);
                }
            }
        });
        boolean z3 = false;
        try {
            this.f23930e.unlock();
            this.f23929d.acquire();
            this.f23930e.lock();
            if (this.f23932g != 2) {
                z3 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() {
            public final void run() {
                C9596l.this.f23926a.pause();
            }
        });
        runOnUiThread((!z3 || this.f23932g == 3) ? new Runnable() {
            public final void run() {
                C9596l.this.m25707d();
                C9596l.this.f23926a.resume();
            }
        } : new Runnable() {
            public final void run() {
                if (C9596l.this.f23931f != null) {
                    C9596l.this.f23926a.addViewToPlayer(C9596l.this.f23931f, true);
                    boolean unused = C9596l.this.f23934i = true;
                    C9596l.this.f23931f.requestFocus();
                }
            }
        });
        this.f23930e.unlock();
        return z3;
    }

    /* renamed from: b */
    public final void mo58829b() {
        this.f23930e.lock();
        C9593k kVar = this.f23931f;
        if (kVar != null && this.f23934i && !this.f23933h) {
            kVar.start();
        }
        this.f23930e.unlock();
    }

    /* renamed from: c */
    public final void mo58830c() {
        this.f23930e.lock();
        C9593k kVar = this.f23931f;
        if (kVar != null) {
            kVar.updateVideoLayout();
        }
        this.f23930e.unlock();
    }

    /* access modifiers changed from: protected */
    public final void runOnUiThread(Runnable runnable) {
        Context context = this.f23927b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            C9578d.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}

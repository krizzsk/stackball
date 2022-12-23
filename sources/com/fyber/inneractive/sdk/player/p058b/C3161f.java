package com.fyber.inneractive.sdk.player.p058b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.player.C3186c;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.p082d.C3580a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.b.f */
public abstract class C3161f implements C3580a.C3594a {

    /* renamed from: a */
    private C3186c f7849a;

    /* renamed from: f */
    Context f7850f = null;

    /* renamed from: g */
    List<C3170b> f7851g = new CopyOnWriteArrayList();

    /* renamed from: h */
    List<C3169a> f7852h = new CopyOnWriteArrayList();

    /* renamed from: i */
    C3171c f7853i;

    /* renamed from: j */
    protected C3608b f7854j = C3608b.Idle;

    /* renamed from: k */
    boolean f7855k;

    /* renamed from: l */
    Handler f7856l;

    /* renamed from: m */
    TextureView f7857m;

    /* renamed from: n */
    SurfaceTexture f7858n;

    /* renamed from: o */
    Surface f7859o;

    /* renamed from: p */
    TextureView.SurfaceTextureListener f7860p;

    /* renamed from: q */
    boolean f7861q = false;

    /* renamed from: r */
    protected boolean f7862r = false;

    /* renamed from: s */
    boolean f7863s;

    /* renamed from: com.fyber.inneractive.sdk.player.b.f$a */
    public interface C3169a {
        /* renamed from: a */
        void mo18837a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b.f$b */
    public interface C3170b {
        /* renamed from: a */
        void mo18743a(C3608b bVar);

        /* renamed from: a */
        void mo18744a(Exception exc);

        /* renamed from: c */
        void mo18749c(boolean z);

        /* renamed from: t */
        void mo18838t();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b.f$c */
    public interface C3171c {
        /* renamed from: a */
        void mo18839a();

        /* renamed from: b */
        void mo18840b();

        /* renamed from: c */
        void mo18841c();
    }

    /* renamed from: a */
    public abstract void mo18770a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18771a(Surface surface);

    /* renamed from: a */
    public abstract void mo18772a(String str, int i);

    /* renamed from: a */
    public abstract void mo18773a(boolean z);

    /* renamed from: b */
    public abstract void mo18775b(boolean z);

    /* renamed from: b */
    public abstract boolean mo18776b();

    /* renamed from: c */
    public abstract void mo18777c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo18778c(boolean z);

    /* renamed from: d */
    public abstract int mo18779d();

    /* renamed from: e */
    public abstract int mo18780e();

    /* renamed from: f */
    public abstract void mo18781f();

    /* renamed from: g */
    public abstract int mo18782g();

    /* renamed from: h */
    public abstract int mo18783h();

    /* renamed from: i */
    public abstract boolean mo18784i();

    /* renamed from: j */
    public abstract Bitmap mo18785j();

    /* renamed from: k */
    public abstract boolean mo18786k();

    /* renamed from: l */
    public abstract String mo18787l();

    protected C3161f(Context context) {
        this.f7850f = context.getApplicationContext();
        this.f7856l = new Handler(context.getMainLooper());
        this.f7849a = new C3186c(this);
        mo18778c(true);
    }

    /* renamed from: a */
    public final void mo18820a(C3170b bVar) {
        List<C3170b> list = this.f7851g;
        if (list != null && !list.contains(bVar)) {
            this.f7851g.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo18819a(C3169a aVar) {
        List<C3169a> list = this.f7852h;
        if (list != null && !list.contains(aVar)) {
            this.f7852h.add(aVar);
        }
    }

    /* renamed from: p */
    public final C3608b mo18824p() {
        return this.f7854j;
    }

    /* renamed from: m */
    public boolean mo18799m() {
        return this.f7854j == C3608b.Playing;
    }

    /* renamed from: q */
    public final boolean mo18825q() {
        return this.f7862r;
    }

    /* renamed from: a */
    public final void mo18822a(final Exception exc) {
        mo18821a(C3608b.Error);
        IAlog.m9034b("%sonPlayerError called with: %s for onPlayerError", IAlog.m9029a((Object) this), exc);
        this.f7856l.post(new Runnable() {
            public final void run() {
                if (!C3161f.this.f7855k) {
                    try {
                        if (C3161f.this.f7851g != null) {
                            for (C3170b a : C3161f.this.f7851g) {
                                a.mo18744a(exc);
                            }
                        }
                    } catch (Exception e) {
                        if (IAlog.f9870a <= 3) {
                            IAlog.m9034b("%sonPlayerError callback threw an exception!", IAlog.m9029a((Object) C3161f.this));
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        mo18826r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18823d(final boolean z) {
        this.f7856l.post(new Runnable() {
            public final void run() {
                if (!C3161f.this.f7855k) {
                    try {
                        if (C3161f.this.f7851g != null) {
                            for (C3170b c : C3161f.this.f7851g) {
                                c.mo18749c(z);
                            }
                        }
                    } catch (Exception unused) {
                        if (IAlog.f9870a <= 3) {
                            IAlog.m9034b("%sonPlayerError callback threw an exception!", IAlog.m9029a((Object) C3161f.this));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo18774b(final int i) {
        this.f7856l.post(new Runnable() {
            public final void run() {
                try {
                    if (C3161f.this.f7852h != null) {
                        for (C3169a a : C3161f.this.f7852h) {
                            a.mo18837a(i);
                        }
                    }
                } catch (Exception e) {
                    if (IAlog.f9870a <= 3) {
                        IAlog.m9034b("%sonPlayerProgress callback threw an exception!", IAlog.m9029a((Object) C3161f.this));
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo18821a(final C3608b bVar) {
        if (bVar != this.f7854j) {
            this.f7854j = bVar;
            if (bVar == C3608b.Playing) {
                C3186c cVar = this.f7849a;
                if (cVar != null && cVar.f7915b == null) {
                    cVar.f7915b = new ScheduledThreadPoolExecutor(1);
                    cVar.f7915b.scheduleAtFixedRate(cVar.f7916c, 100, 1000, TimeUnit.MILLISECONDS);
                }
            } else if (bVar == C3608b.Paused || bVar == C3608b.Idle || bVar == C3608b.f9847i) {
                mo18826r();
            }
            this.f7856l.post(new Runnable() {
                public final void run() {
                    try {
                        if (C3161f.this.f7851g != null) {
                            for (C3170b a : C3161f.this.f7851g) {
                                a.mo18743a(bVar);
                            }
                        }
                        if (bVar == C3608b.Idle || bVar == C3608b.Error || bVar == C3608b.f9847i) {
                            if (!(C3161f.this.f7858n == null || C3161f.this.f7857m == null || C3161f.this.f7857m.getParent() == null)) {
                                ((ViewGroup) C3161f.this.f7857m.getParent()).removeView(C3161f.this.f7857m);
                            }
                            C3161f.this.f7857m = null;
                            C3161f.this.f7858n = null;
                        }
                    } catch (Exception e) {
                        if (IAlog.f9870a <= 3) {
                            IAlog.m9034b("%sonPlayerStateChanged callback threw an exception!", IAlog.m9029a((Object) C3161f.this));
                            e.printStackTrace();
                        }
                        if (bVar == C3608b.Idle || bVar == C3608b.Error || bVar == C3608b.f9847i) {
                            if (!(C3161f.this.f7858n == null || C3161f.this.f7857m == null || C3161f.this.f7857m.getParent() == null)) {
                                ((ViewGroup) C3161f.this.f7857m.getParent()).removeView(C3161f.this.f7857m);
                            }
                            C3161f.this.f7857m = null;
                            C3161f.this.f7858n = null;
                        }
                    } catch (Throwable th) {
                        if (bVar == C3608b.Idle || bVar == C3608b.Error || bVar == C3608b.f9847i) {
                            if (!(C3161f.this.f7858n == null || C3161f.this.f7857m == null || C3161f.this.f7857m.getParent() == null)) {
                                ((ViewGroup) C3161f.this.f7857m.getParent()).removeView(C3161f.this.f7857m);
                            }
                            C3161f.this.f7857m = null;
                            C3161f.this.f7858n = null;
                        }
                        throw th;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo18826r() {
        C3186c cVar = this.f7849a;
        if (cVar != null && cVar.f7915b != null) {
            cVar.f7915b.shutdownNow();
            cVar.f7915b = null;
        }
    }

    /* renamed from: a */
    public void mo18769a() {
        IAlog.m9034b("%sdestroy started", IAlog.m9029a((Object) this));
        mo18826r();
        this.f7849a = null;
        Handler handler = this.f7856l;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        List<C3170b> list = this.f7851g;
        if (list != null) {
            list.clear();
        }
        this.f7851g = null;
        this.f7855k = true;
        IAlog.m9034b("%sdestroy finished", IAlog.m9029a((Object) this));
    }

    /* renamed from: a */
    static /* synthetic */ void m7551a(C3161f fVar, SurfaceTexture surfaceTexture) {
        boolean z = !surfaceTexture.equals(fVar.f7858n);
        fVar.f7858n = surfaceTexture;
        if (fVar.f7859o == null || z) {
            fVar.f7859o = new Surface(fVar.f7858n);
        }
        fVar.mo18771a(fVar.f7859o);
    }
}

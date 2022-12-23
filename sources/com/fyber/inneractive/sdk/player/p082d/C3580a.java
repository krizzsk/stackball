package com.fyber.inneractive.sdk.player.p082d;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.d.a */
public final class C3580a extends MediaPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    Context f9748a;

    /* renamed from: b */
    public volatile C3608b f9749b = C3608b.Idle;

    /* renamed from: c */
    public boolean f9750c = false;

    /* renamed from: d */
    public boolean f9751d = false;

    /* renamed from: e */
    Handler f9752e;

    /* renamed from: f */
    HandlerThread f9753f;

    /* renamed from: g */
    Handler f9754g;

    /* renamed from: h */
    private boolean f9755h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f9756i = false;

    /* renamed from: j */
    private boolean f9757j = false;

    /* renamed from: k */
    private Exception f9758k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3594a f9759l;

    /* renamed from: m */
    private Surface f9760m;

    /* renamed from: n */
    private SurfaceHolder f9761n;

    /* renamed from: o */
    private long f9762o;

    /* renamed from: p */
    private int f9763p = 0;

    /* renamed from: q */
    private Runnable f9764q;

    /* renamed from: r */
    private Runnable f9765r;

    /* renamed from: s */
    private int f9766s = 0;

    /* renamed from: t */
    private int f9767t = 0;

    /* renamed from: u */
    private int f9768u = 0;

    /* renamed from: v */
    private int f9769v = 0;

    /* renamed from: com.fyber.inneractive.sdk.player.d.a$a */
    public interface C3594a {
        /* renamed from: a */
        void mo18821a(C3608b bVar);

        /* renamed from: a */
        void mo18822a(Exception exc);
    }

    public C3580a(Context context, C3594a aVar, Handler handler) {
        this.f9748a = context;
        this.f9759l = aVar;
        this.f9752e = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f9753f = handlerThread;
        handlerThread.start();
        this.f9754g = new Handler(this.f9753f.getLooper());
        this.f9765r = new Runnable() {
            public final void run() {
                C3580a.m8949h(C3580a.this);
            }
        };
    }

    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    public final void setDisplay(final SurfaceHolder surfaceHolder) {
        IAlog.m9034b("%s setDisplay called", mo19452c());
        if (!mo19450a()) {
            IAlog.m9034b("%s setDisplay called when player is not ready!", mo19452c());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f9761n;
        if (surfaceHolder2 == null || !surfaceHolder2.equals(surfaceHolder)) {
            this.f9761n = surfaceHolder;
            mo19448a((Runnable) new Runnable() {
                public final void run() {
                    C3580a.m8940a(C3580a.this, surfaceHolder);
                }
            });
            return;
        }
        IAlog.m9034b("%s setDisplay called with existing surface. ignoring!", mo19452c());
    }

    public final void setSurface(final Surface surface) {
        IAlog.m9034b("%s setSurface called", mo19452c());
        Surface surface2 = this.f9760m;
        if (surface2 == null || !surface2.equals(surface)) {
            this.f9760m = surface;
            mo19448a((Runnable) new Runnable() {
                public final void run() {
                    C3580a.m8939a(C3580a.this, surface);
                }
            });
            return;
        }
        IAlog.m9034b("%s setSurface called with existing surface. ignoring!", mo19452c());
    }

    /* renamed from: a */
    public final boolean mo19450a() {
        return (this.f9749b == C3608b.Idle || this.f9749b == C3608b.Preparing) ? false : true;
    }

    public final boolean isPlaying() {
        return mo19450a() && this.f9749b != C3608b.Paused && super.isPlaying();
    }

    public final int getDuration() {
        return this.f9766s;
    }

    public final int getCurrentPosition() {
        if (mo19450a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.f9768u;
    }

    public final int getVideoHeight() {
        return this.f9769v;
    }

    /* renamed from: a */
    public final void mo19449a(String str) {
        IAlog.C3616a aVar = new IAlog.C3616a(mo19452c(), "loadUri");
        this.f9756i = false;
        this.f9757j = false;
        this.f9758k = null;
        if (isPlaying()) {
            IAlog.m9034b("%s loadUri stopping play before refresh", mo19452c());
            stop();
        }
        this.f9762o = System.currentTimeMillis();
        m8943d();
        IAlog.m9034b("%s calling setDataSource with %s", mo19452c(), str);
        try {
            setDataSource(str);
            IAlog.m9034b("%s setDataSource succeeded, calling prepareAsync", mo19452c());
            mo19447a(C3608b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.m9037e("%s prepareAsync failed with illegal mState exception: %s", mo19452c(), e.getMessage());
                int i = this.f9763p + 1;
                this.f9763p = i;
                if (i < 5) {
                    mo19449a(str);
                }
                if (this.f9763p == 5) {
                    this.f9758k = e;
                }
                this.f9763p = 0;
            }
            aVar.mo19544a();
        } catch (Exception e2) {
            IAlog.m9037e("%s error setting data source %s", mo19452c(), str);
            IAlog.m9037e("%s exception message: %s", mo19452c(), e2.getMessage());
            this.f9758k = e2;
        }
    }

    public final void release() {
        if (!this.f9755h) {
            mo19448a((Runnable) new Runnable() {
                public final void run() {
                    C3580a.m8937a(C3580a.this);
                    if (C3580a.this.f9754g != null) {
                        C3580a.this.f9754g.removeCallbacksAndMessages((Object) null);
                        C3580a.this.f9754g = null;
                    }
                    C3580a.this.f9753f = null;
                    Looper.myLooper().quit();
                }
            });
        }
        this.f9759l = null;
        this.f9765r = null;
        this.f9755h = true;
        IAlog.m9034b("%s release called", mo19452c());
    }

    public final void reset() {
        IAlog.m9034b("%s reset called", mo19452c());
        if (this.f9764q != null) {
            C3662m.m9137a().removeCallbacks(this.f9764q);
        }
        mo19448a((Runnable) new Runnable() {
            public final void run() {
                C3580a.this.m8943d();
            }
        });
    }

    public final void start() {
        IAlog.m9034b("%s Start called", mo19452c());
        if (!mo19450a()) {
            IAlog.m9034b("%s MediaPlayer: Start called when player is not ready! - mState = %s", mo19452c(), this.f9749b);
        } else if (this.f9749b == C3608b.Seeking) {
            this.f9750c = true;
        } else if (isPlaying()) {
            IAlog.m9034b("%s MediaPlayer: Start called when player is already playing. do nothing", mo19452c());
        } else {
            mo19447a(C3608b.Start_in_progress);
            mo19448a((Runnable) new Runnable() {
                public final void run() {
                    C3580a.m8942c(C3580a.this);
                }
            });
        }
    }

    public final void stop() {
        IAlog.C3616a aVar = new IAlog.C3616a(mo19452c(), "stop");
        if (mo19450a()) {
            super.stop();
        }
        IAlog.m9034b("%s stop called", mo19452c());
        aVar.mo19544a();
    }

    public final void pause() {
        if (this.f9749b == C3608b.Idle || this.f9749b == C3608b.f9847i || this.f9749b == C3608b.Paused || this.f9749b == C3608b.Prepared) {
            IAlog.m9034b("%s paused called when player is in mState: %s ignoring", mo19452c(), this.f9749b);
            return;
        }
        mo19447a(C3608b.Paused);
        if (mo19450a()) {
            mo19448a((Runnable) new Runnable() {
                public final void run() {
                    C3580a.m8944d(C3580a.this);
                }
            });
        } else {
            IAlog.m9034b("%s paused called when player is not ready!", mo19452c());
        }
        IAlog.m9034b("%s pause", mo19452c());
    }

    /* renamed from: b */
    public final void mo19451b() {
        this.f9751d = true;
        if (mo19450a()) {
            mo19448a((Runnable) new Runnable() {
                public final void run() {
                    C3580a.m8946e(C3580a.this);
                }
            });
        } else {
            IAlog.m9034b("%s mute called when player is not ready!", mo19452c());
        }
        IAlog.m9034b("%s mute", mo19452c());
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m9034b("%s onPrepared %s gotPrepared = %s", mo19452c(), this, Boolean.valueOf(this.f9757j));
        IAlog.m9034b("%sMedia prepare time took %d msec", mo19452c(), Long.valueOf(System.currentTimeMillis() - this.f9762o));
        if (this.f9749b != C3608b.Preparing && this.f9749b != C3608b.Seeking) {
            IAlog.m9036d("%s onPrepared: previous error encountered. Aborting", mo19452c());
        } else if (!this.f9757j) {
            this.f9757j = true;
            m8945e();
        } else {
            IAlog.m9034b("%s onPrepared called again??? We are already prepared", mo19452c());
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f9767t = getDuration();
        mo19447a(C3608b.f9847i);
    }

    public final boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
        IAlog.m9036d("%s onError code = %d code2 = %d", mo19452c(), Integer.valueOf(i), Integer.valueOf(i2));
        m8943d();
        this.f9752e.post(new Runnable() {
            public final void run() {
                if (C3580a.this.f9759l != null) {
                    C3580a.this.f9759l.mo18822a((Exception) new C3595b(String.format(Locale.ENGLISH, "Player Error: %d, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})));
                }
            }
        });
        return true;
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.m9034b("%s onSeekComplete called current position = %d", mo19452c(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f9749b != C3608b.Seeking) {
            IAlog.m9034b("%s onSeekComplete called when Story is not seeking", mo19452c());
            return;
        }
        if (this.f9751d) {
            mo19451b();
        }
        if (this.f9750c) {
            IAlog.m9034b("%s onSeekComplete mPlayAfterSeek = true", mo19452c());
            this.f9749b = C3608b.Paused;
            start();
            return;
        }
        IAlog.m9034b("%s onSeekComplete mPlayAfterSeek = false", mo19452c());
        mo19447a(C3608b.Paused);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m9034b("%s onVideoSizeChanged %d, %d", mo19452c(), Integer.valueOf(i), Integer.valueOf(i2));
        if (!this.f9756i) {
            if (this.f9764q != null) {
                C3662m.m9137a().removeCallbacks(this.f9764q);
                IAlog.m9034b("%s onVideoSizeChanged cancelling prepared runnable", mo19452c());
            }
            this.f9756i = true;
            if (i == 0 || i2 == 0) {
                IAlog.m9036d("%s onVideoSizeChanged - Invalid video size!", mo19452c());
                onError(this, 0, 0);
                return;
            }
            IAlog.m9034b("%sMedia got video size time took %d msec", mo19452c(), Long.valueOf(System.currentTimeMillis() - this.f9762o));
            this.f9768u = i;
            this.f9769v = i2;
            m8945e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m8943d() {
        IAlog.C3616a aVar = new IAlog.C3616a(mo19452c(), "reset");
        if (this.f9749b == C3608b.Idle) {
            IAlog.m9034b("%s reset called, but player is already resetted. Do nothing", mo19452c());
            return;
        }
        mo19447a(C3608b.Idle);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        aVar.mo19544a();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m8945e() {
        if (!this.f9757j) {
            return;
        }
        if (this.f9756i) {
            IAlog.m9034b("%sMedia load time took %d msec", mo19452c(), Long.valueOf(System.currentTimeMillis() - this.f9762o));
            this.f9766s = super.getDuration();
            mo19447a(C3608b.Prepared);
            if (this.f9751d) {
                mo19451b();
                return;
            }
            return;
        }
        IAlog.m9034b("%sGot prepared only, waiting for video size", mo19452c());
        if (this.f9764q == null) {
            this.f9764q = new Runnable() {
                public final void run() {
                    IAlog.m9034b("%sCannot wait for video size anymore", C3580a.this.mo19452c());
                    if (C3580a.this.getDuration() == 0) {
                        IAlog.m9034b("%sCannot wait for video size anymore. duration is still 0 - aborting", C3580a.this.mo19452c());
                        C3580a aVar = C3580a.this;
                        aVar.onError(aVar, 0, 0);
                        return;
                    }
                    IAlog.m9034b("%sCannot wait for video size anymore. moving into ready", C3580a.this.mo19452c());
                    boolean unused = C3580a.this.f9756i = true;
                    C3580a.this.m8945e();
                }
            };
        }
        C3662m.m9137a().postDelayed(this.f9764q, 2000);
    }

    /* renamed from: a */
    public final void mo19447a(final C3608b bVar) {
        IAlog.m9034b("%s updatePlayerState - %s", mo19452c(), bVar);
        synchronized (this.f9749b) {
            if (this.f9749b == bVar) {
                IAlog.m9034b("%s updatePlayerState - mState didn't change!", mo19452c());
            } else {
                IAlog.m9034b("%s updatePlayerState - changing from %s to %s", mo19452c(), this.f9749b, bVar);
                this.f9749b = bVar;
                this.f9752e.post(new Runnable() {
                    public final void run() {
                        if (C3580a.this.f9759l != null) {
                            C3580a.this.f9759l.mo18821a(bVar);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo19448a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f9753f;
        if (handlerThread != null && handlerThread.isAlive() && !this.f9753f.isInterrupted() && (handler2 = this.f9754g) != null) {
            handler2.post(runnable);
        }
        if ((this.f9768u == 0 || this.f9769v == 0 || this.f9766s == 0) && (handler = this.f9754g) != null) {
            handler.post(this.f9765r);
        }
    }

    /* renamed from: c */
    public final String mo19452c() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* renamed from: com.fyber.inneractive.sdk.player.d.a$b */
    public static class C3595b extends Exception {
        public C3595b(String str) {
            super(str);
        }

        public C3595b(Throwable th, String str) {
            super(str, th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m8940a(C3580a aVar, SurfaceHolder surfaceHolder) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "setDisplayInternal");
        IAlog.m9034b("%s setDisplay called with %s", aVar.mo19452c(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.m9034b("%s setDisplay with null! current display cleared", aVar.mo19452c());
            } else {
                IAlog.m9034b("%s setDisplay - replacing surface holder!", aVar.mo19452c());
            }
            aVar2.mo19544a();
        } catch (Exception unused) {
            IAlog.m9034b("%s super.setDisplay threw exception!", aVar.mo19452c());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m8939a(C3580a aVar, Surface surface) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "setSurface");
        IAlog.m9034b("%s setSurface called with %s", aVar.mo19452c(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.m9034b("%s setSurface with null! current surface cleared", aVar.mo19452c());
            } else {
                IAlog.m9034b("%s setSurface - replacing surface!", aVar.mo19452c());
            }
            aVar2.mo19544a();
        } catch (Exception unused) {
            IAlog.m9034b("%s super.setSurface threw exception!", aVar.mo19452c());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m8937a(C3580a aVar) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "release");
        super.release();
        aVar2.mo19544a();
    }

    /* renamed from: c */
    static /* synthetic */ void m8942c(C3580a aVar) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "start");
        C3608b bVar = aVar.f9749b;
        if (bVar == C3608b.Paused || bVar == C3608b.Prepared || bVar == C3608b.f9847i || bVar == C3608b.Start_in_progress) {
            super.start();
            aVar.mo19447a(C3608b.Playing);
        } else {
            IAlog.m9034b("%s Start called in wrong mState! %s", aVar.mo19452c(), bVar);
            if (aVar.f9749b == C3608b.Seeking) {
                aVar.f9750c = true;
            }
        }
        aVar2.mo19544a();
    }

    /* renamed from: a */
    static /* synthetic */ void m8938a(C3580a aVar, int i) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "seekTo");
        super.seekTo(i);
        aVar2.mo19544a();
    }

    /* renamed from: d */
    static /* synthetic */ void m8944d(C3580a aVar) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "delayed pause");
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.m9034b("%s paused called cannot set to pause, canceled", aVar.mo19452c());
        }
        aVar2.mo19544a();
    }

    /* renamed from: e */
    static /* synthetic */ void m8946e(C3580a aVar) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "mute");
        aVar.setVolume(0.0f, 0.0f);
        aVar2.mo19544a();
    }

    /* renamed from: f */
    static /* synthetic */ void m8947f(C3580a aVar) {
        IAlog.C3616a aVar2 = new IAlog.C3616a(aVar.mo19452c(), "unmute");
        AudioManager audioManager = (AudioManager) aVar.f9748a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        IAlog.m9034b("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", aVar.mo19452c(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        aVar.setVolume(f, f);
        aVar2.mo19544a();
    }

    /* renamed from: h */
    static /* synthetic */ void m8949h(C3580a aVar) {
        if (aVar.mo19450a()) {
            aVar.f9768u = super.getVideoWidth();
            aVar.f9769v = super.getVideoHeight();
            aVar.f9766s = super.getDuration();
        }
    }
}

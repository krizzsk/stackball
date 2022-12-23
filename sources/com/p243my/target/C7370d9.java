package com.p243my.target;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.AnalyticsEvents;
import com.p243my.target.C7353c9;

/* renamed from: com.my.target.d9 */
public class C7370d9 implements C7353c9, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {

    /* renamed from: a */
    public final C7710v8 f18472a;

    /* renamed from: b */
    public final C7371a f18473b;

    /* renamed from: c */
    public final MediaPlayer f18474c;

    /* renamed from: d */
    public C7353c9.C7354a f18475d;

    /* renamed from: e */
    public Surface f18476e;

    /* renamed from: f */
    public int f18477f;

    /* renamed from: g */
    public float f18478g;

    /* renamed from: h */
    public int f18479h;

    /* renamed from: i */
    public long f18480i;

    /* renamed from: j */
    public C7757y5 f18481j;

    /* renamed from: k */
    public Uri f18482k;

    /* renamed from: com.my.target.d9$a */
    public static class C7371a implements Runnable {

        /* renamed from: a */
        public final int f18483a;

        /* renamed from: b */
        public C7370d9 f18484b;

        /* renamed from: c */
        public C7353c9.C7354a f18485c;

        /* renamed from: d */
        public int f18486d;

        /* renamed from: e */
        public float f18487e;

        public C7371a(int i) {
            this.f18483a = i;
        }

        /* renamed from: a */
        public void mo50038a(C7353c9.C7354a aVar) {
            this.f18485c = aVar;
        }

        /* renamed from: a */
        public void mo50039a(C7370d9 d9Var) {
            this.f18484b = d9Var;
        }

        public void run() {
            C7370d9 d9Var = this.f18484b;
            if (d9Var != null) {
                float n = ((float) d9Var.mo49867n()) / 1000.0f;
                float m = this.f18484b.mo49866m();
                if (this.f18487e == n) {
                    this.f18486d++;
                } else {
                    C7353c9.C7354a aVar = this.f18485c;
                    if (aVar != null) {
                        aVar.mo49871a(n, m);
                    }
                    this.f18487e = n;
                    if (this.f18486d > 0) {
                        this.f18486d = 0;
                    }
                }
                if (this.f18486d > this.f18483a) {
                    C7353c9.C7354a aVar2 = this.f18485c;
                    if (aVar2 != null) {
                        aVar2.mo49877l();
                    }
                    this.f18486d = 0;
                }
            }
        }
    }

    public C7370d9() {
        this(new MediaPlayer(), new C7371a(50));
    }

    public C7370d9(MediaPlayer mediaPlayer, C7371a aVar) {
        this.f18472a = C7710v8.m20686a(200);
        this.f18477f = 0;
        this.f18478g = 1.0f;
        this.f18480i = 0;
        this.f18474c = mediaPlayer;
        this.f18473b = aVar;
        aVar.mo50039a(this);
    }

    /* renamed from: p */
    public static C7353c9 m18958p() {
        return new C7370d9();
    }

    /* renamed from: a */
    public void mo49848a() {
        if (this.f18477f == 2) {
            this.f18472a.mo51748a((Runnable) this.f18473b);
            try {
                this.f18474c.start();
            } catch (Throwable unused) {
                C7374e0.m18989a("start called in wrong state");
            }
            int i = this.f18479h;
            if (i > 0) {
                try {
                    this.f18474c.seekTo(i);
                } catch (Throwable unused2) {
                    C7374e0.m18989a("seekTo called in wrong state");
                }
                this.f18479h = 0;
            }
            this.f18477f = 1;
            C7353c9.C7354a aVar = this.f18475d;
            if (aVar != null) {
                aVar.mo49875h();
            }
        }
    }

    /* renamed from: a */
    public void mo49849a(long j) {
        this.f18480i = j;
        if (mo50037r()) {
            try {
                this.f18474c.seekTo((int) j);
                this.f18480i = 0;
            } catch (Throwable unused) {
                C7374e0.m18989a("seekTo called in wrong state");
            }
        }
    }

    /* renamed from: a */
    public void mo49850a(Uri uri, Context context) {
        this.f18482k = uri;
        C7374e0.m18989a("Play video in Android MediaPlayer: " + uri.toString());
        if (this.f18477f != 0) {
            this.f18474c.reset();
            this.f18477f = 0;
        }
        this.f18474c.setOnCompletionListener(this);
        this.f18474c.setOnErrorListener(this);
        this.f18474c.setOnPreparedListener(this);
        this.f18474c.setOnInfoListener(this);
        try {
            this.f18474c.setDataSource(context, uri);
            C7353c9.C7354a aVar = this.f18475d;
            if (aVar != null) {
                aVar.mo49874g();
            }
            try {
                this.f18474c.prepareAsync();
            } catch (Throwable unused) {
                C7374e0.m18989a("prepareAsync called in wrong state");
            }
            this.f18472a.mo51748a((Runnable) this.f18473b);
        } catch (Throwable th) {
            if (this.f18475d != null) {
                this.f18475d.mo49872a("ExoPlayer dataSource error: " + th.getMessage());
            }
            C7374e0.m18989a("DefaultVideoPlayerUnable to parse video source " + th.getMessage());
            this.f18477f = 5;
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo49851a(Uri uri, C7757y5 y5Var) {
        mo49853a(y5Var);
        mo49850a(uri, y5Var.getContext());
    }

    /* renamed from: a */
    public final void mo50027a(Surface surface) {
        this.f18474c.setSurface(surface);
        Surface surface2 = this.f18476e;
        if (!(surface2 == null || surface2 == surface)) {
            surface2.release();
        }
        this.f18476e = surface;
    }

    /* renamed from: a */
    public void mo49852a(C7353c9.C7354a aVar) {
        this.f18475d = aVar;
        this.f18473b.mo50038a(aVar);
    }

    /* renamed from: a */
    public void mo49853a(C7757y5 y5Var) {
        mo50036q();
        Surface surface = null;
        if (!(y5Var instanceof C7757y5)) {
            this.f18481j = null;
            mo50027a((Surface) null);
            return;
        }
        this.f18481j = y5Var;
        TextureView textureView = y5Var.getTextureView();
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("DefaultVideoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture != null) {
            surface = new Surface(surfaceTexture);
        }
        mo50027a(surface);
    }

    /* renamed from: b */
    public void mo49854b() {
        if (this.f18477f == 1) {
            this.f18479h = this.f18474c.getCurrentPosition();
            this.f18472a.mo51750b(this.f18473b);
            try {
                this.f18474c.pause();
            } catch (Throwable unused) {
                C7374e0.m18989a("pause called in wrong state");
            }
            this.f18477f = 2;
            C7353c9.C7354a aVar = this.f18475d;
            if (aVar != null) {
                aVar.mo49873f();
            }
        }
    }

    /* renamed from: c */
    public boolean mo49855c() {
        return this.f18477f == 1;
    }

    /* renamed from: d */
    public void mo49856d() {
        if (this.f18478g == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    public void destroy() {
        this.f18475d = null;
        this.f18477f = 5;
        this.f18472a.mo51750b(this.f18473b);
        mo50036q();
        if (mo50037r()) {
            try {
                this.f18474c.stop();
            } catch (Throwable unused) {
                C7374e0.m18989a("stop called in wrong state");
            }
        }
        this.f18474c.release();
        this.f18481j = null;
    }

    /* renamed from: e */
    public void mo49858e() {
        this.f18472a.mo51750b(this.f18473b);
        try {
            this.f18474c.stop();
        } catch (Throwable unused) {
            C7374e0.m18989a("stop called in wrong state");
        }
        C7353c9.C7354a aVar = this.f18475d;
        if (aVar != null) {
            aVar.mo49876j();
        }
        this.f18477f = 3;
    }

    /* renamed from: f */
    public boolean mo49859f() {
        return this.f18477f == 2;
    }

    /* renamed from: g */
    public boolean mo49860g() {
        int i = this.f18477f;
        return i >= 1 && i < 3;
    }

    /* renamed from: h */
    public void mo49861h() {
        try {
            this.f18474c.start();
            this.f18477f = 1;
        } catch (Throwable unused) {
            C7374e0.m18989a("replay called in wrong state");
        }
        mo49849a(0);
    }

    /* renamed from: i */
    public boolean mo49862i() {
        return this.f18478g == 0.0f;
    }

    /* renamed from: j */
    public void mo49863j() {
        setVolume(1.0f);
    }

    /* renamed from: k */
    public Uri mo49864k() {
        return this.f18482k;
    }

    /* renamed from: l */
    public void mo49865l() {
        setVolume(0.2f);
    }

    /* renamed from: m */
    public float mo49866m() {
        if (mo50037r()) {
            return ((float) this.f18474c.getDuration()) / 1000.0f;
        }
        return 0.0f;
    }

    /* renamed from: n */
    public long mo49867n() {
        if (!mo50037r() || this.f18477f == 3) {
            return 0;
        }
        return (long) this.f18474c.getCurrentPosition();
    }

    /* renamed from: o */
    public void mo49868o() {
        setVolume(0.0f);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C7353c9.C7354a aVar;
        float m = mo49866m();
        this.f18477f = 4;
        if (m > 0.0f && (aVar = this.f18475d) != null) {
            aVar.mo49871a(m, m);
        }
        C7353c9.C7354a aVar2 = this.f18475d;
        if (aVar2 != null) {
            aVar2.onVideoCompleted();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f18472a.mo51750b(this.f18473b);
        mo50036q();
        mo50027a((Surface) null);
        String str = (i == 100 ? "Server died" : "Unknown error") + " (reason: " + (i2 == -1004 ? "IO error" : i2 == -1007 ? "Malformed error" : i2 == -1010 ? "Unsupported error" : i2 == -110 ? "Timed out error" : i2 == Integer.MIN_VALUE ? "Low-level system error" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN) + ")";
        C7374e0.m18989a("DefaultVideoPlayerVideo error: " + str);
        C7353c9.C7354a aVar = this.f18475d;
        if (aVar != null) {
            aVar.mo49872a(str);
        }
        if (this.f18477f > 0) {
            try {
                this.f18474c.reset();
            } catch (Throwable unused) {
                C7374e0.m18989a("reset called in wrong state");
            }
        }
        this.f18477f = 0;
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        C7353c9.C7354a aVar = this.f18475d;
        if (aVar == null) {
            return true;
        }
        aVar.mo49878o();
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        float f = this.f18478g;
        mediaPlayer.setVolume(f, f);
        this.f18477f = 1;
        try {
            mediaPlayer.start();
            long j = this.f18480i;
            if (j > 0) {
                mo49849a(j);
            }
        } catch (Throwable unused) {
            C7374e0.m18989a("start called in wrong state");
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        mo50027a(new Surface(surfaceTexture));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo50027a((Surface) null);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: q */
    public final void mo50036q() {
        C7757y5 y5Var = this.f18481j;
        TextureView textureView = y5Var != null ? y5Var.getTextureView() : null;
        if (textureView == null) {
            return;
        }
        if (textureView.getSurfaceTextureListener() != this) {
            Log.w("DefaultVideoPlayer", "SurfaceTextureListener already unset or replaced.");
        } else {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
    }

    /* renamed from: r */
    public final boolean mo50037r() {
        int i = this.f18477f;
        return i >= 1 && i <= 4;
    }

    public void setVolume(float f) {
        this.f18478g = f;
        if (mo50037r()) {
            this.f18474c.setVolume(f, f);
        }
        C7353c9.C7354a aVar = this.f18475d;
        if (aVar != null) {
            aVar.mo49870a(f);
        }
    }
}

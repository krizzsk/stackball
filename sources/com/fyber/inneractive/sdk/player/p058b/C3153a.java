package com.fyber.inneractive.sdk.player.p058b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.p082d.C3580a;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.b.a */
public final class C3153a extends C3161f {

    /* renamed from: a */
    private C3580a f7807a;

    /* renamed from: b */
    private int f7808b = 0;

    /* renamed from: c */
    private int f7809c = 2;

    /* renamed from: d */
    private int f7810d = 0;

    /* renamed from: e */
    private boolean f7811e = false;

    /* renamed from: i */
    public final boolean mo18784i() {
        return false;
    }

    /* renamed from: j */
    public final Bitmap mo18785j() {
        return null;
    }

    /* renamed from: k */
    public final boolean mo18786k() {
        return false;
    }

    /* renamed from: l */
    public final String mo18787l() {
        return "media";
    }

    public C3153a(Context context) {
        super(context);
        IAlog.m9034b("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    /* renamed from: a */
    public final void mo18769a() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            aVar.reset();
            this.f7807a.release();
            this.f7807a = null;
        }
        super.mo18769a();
    }

    /* renamed from: a */
    public final void mo18773a(boolean z) {
        if (!mo18776b() || !this.f7862r) {
            this.f7862r = z;
            C3580a aVar = this.f7807a;
            if (aVar != null) {
                aVar.mo19451b();
            }
        }
    }

    /* renamed from: b */
    public final void mo18775b(boolean z) {
        if (mo18776b() || !this.f7862r) {
            this.f7862r = z;
            C3580a aVar = this.f7807a;
            if (aVar != null) {
                IAlog.m9034b("%s unmute", aVar.mo19452c());
                aVar.f9751d = false;
                if (aVar.mo19450a()) {
                    aVar.mo19448a((Runnable) new Runnable() {
                        public final void run() {
                            C3580a.m8947f(C3580a.this);
                        }
                    });
                    return;
                }
                IAlog.m9034b("%s unmute called when player is not ready!", aVar.mo19452c());
            }
        }
    }

    /* renamed from: d */
    public final int mo18779d() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            return aVar.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo18780e() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            return aVar.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo18770a(int i) {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            IAlog.m9034b("%s seek to called with = %d mPlayAfterSeek = %s", aVar.mo19452c(), Integer.valueOf(i), true);
            if (!aVar.mo19450a()) {
                IAlog.m9034b("%s seek called when player is not ready!", aVar.mo19452c());
            } else if (aVar.f9749b == C3608b.Seeking) {
                IAlog.m9034b("%s seek called when player is already seeking!", aVar.mo19452c());
            } else {
                aVar.mo19447a(C3608b.Seeking);
                aVar.f9750c = true;
                aVar.mo19448a((Runnable) new Runnable(i) {

                    /* renamed from: a */
                    final /* synthetic */ int f9772a;

                    {
                        this.f9772a = r2;
                    }

                    public final void run() {
                        C3580a.m8938a(C3580a.this, this.f9772a);
                    }
                });
            }
        }
    }

    /* renamed from: f */
    public final void mo18781f() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            aVar.start();
        }
    }

    /* renamed from: g */
    public final int mo18782g() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: h */
    public final int mo18783h() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            return aVar.getDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo18771a(Surface surface) {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo18778c(boolean z) {
        if (this.f7807a == null) {
            IAlog.m9034b("MediaPlayerController: creating media player", new Object[0]);
            this.f7807a = new C3580a(this.f7850f, this, this.f7856l);
        }
    }

    /* renamed from: a */
    public final void mo18772a(String str, int i) {
        this.f7807a.mo19449a(str);
    }

    /* renamed from: b */
    public final void mo18774b(int i) {
        super.mo18774b(i);
        if (i >= mo18783h()) {
            mo18821a(C3608b.f9847i);
        } else if (i == this.f7808b) {
            IAlog.m9034b("%sVideo is stuck! Progress doesn't change", IAlog.m9029a((Object) this));
            int i2 = this.f7810d + 1;
            this.f7810d = i2;
            if (i2 == this.f7809c) {
                mo18821a(C3608b.Buffering);
                this.f7811e = true;
            }
        } else if (this.f7811e) {
            IAlog.m9034b("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.m9029a((Object) this));
            mo18821a(C3608b.Playing);
            this.f7810d = 0;
            this.f7811e = false;
        }
        this.f7808b = i;
    }

    /* renamed from: b */
    public final boolean mo18776b() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            return aVar.f9751d;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo18777c() {
        C3580a aVar = this.f7807a;
        if (aVar != null) {
            aVar.pause();
        }
    }
}

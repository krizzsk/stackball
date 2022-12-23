package com.p243my.target;

import android.content.Context;
import android.net.Uri;
import com.p243my.target.common.models.AudioData;
import com.p243my.target.instreamads.InstreamAudioAdPlayer;
import java.util.Stack;

/* renamed from: com.my.target.i0 */
public class C7447i0 {

    /* renamed from: a */
    public final C7449b f18716a = new C7449b();

    /* renamed from: b */
    public final C7710v8 f18717b = C7710v8.m20686a(200);

    /* renamed from: c */
    public final C7451d f18718c = new C7451d();

    /* renamed from: d */
    public final Stack<C7303a3> f18719d = new Stack<>();

    /* renamed from: e */
    public final C7679t8 f18720e = C7679t8.m20487b();

    /* renamed from: f */
    public float f18721f = 1.0f;

    /* renamed from: g */
    public InstreamAudioAdPlayer f18722g;

    /* renamed from: h */
    public C7450c f18723h;

    /* renamed from: i */
    public C7413g2<AudioData> f18724i;

    /* renamed from: j */
    public int f18725j;

    /* renamed from: k */
    public float f18726k;

    /* renamed from: l */
    public int f18727l = 10;

    /* renamed from: m */
    public boolean f18728m;

    /* renamed from: n */
    public int f18729n = 0;

    /* renamed from: com.my.target.i0$b */
    public class C7449b implements InstreamAudioAdPlayer.AdPlayerListener {

        /* renamed from: a */
        public float f18730a;

        public C7449b() {
            this.f18730a = 1.0f;
        }

        public void onAdAudioCompleted() {
            if (C7447i0.this.f18729n != 2) {
                if (!(C7447i0.this.f18724i == null || C7447i0.this.f18723h == null)) {
                    C7447i0.this.mo50325a();
                    C7413g2 g = C7447i0.this.f18724i;
                    C7413g2 unused = C7447i0.this.f18724i = null;
                    if (g != null) {
                        float duration = g.getDuration();
                        C7447i0.this.f18720e.mo51600a(duration, duration);
                        C7447i0.this.f18723h.mo50353b(g);
                    }
                }
                int unused2 = C7447i0.this.f18729n = 2;
            }
            C7447i0.this.f18717b.mo51750b(C7447i0.this.f18718c);
        }

        public void onAdAudioError(String str) {
            if (C7447i0.this.f18722g != null) {
                C7447i0.this.f18722g.stopAdAudio();
            }
            if (!(C7447i0.this.f18724i == null || C7447i0.this.f18723h == null)) {
                C7447i0.this.f18723h.mo50352a(str, C7447i0.this.f18724i);
            }
            C7447i0.this.f18720e.mo51612f();
            C7447i0.this.f18717b.mo51750b(C7447i0.this.f18718c);
        }

        public void onAdAudioPaused() {
            Context d = C7447i0.this.mo50336d();
            if (!(C7447i0.this.f18724i == null || d == null)) {
                C7447i0.this.f18720e.mo51611e();
            }
            C7447i0.this.f18717b.mo51750b(C7447i0.this.f18718c);
        }

        public void onAdAudioResumed() {
            Context d = C7447i0.this.mo50336d();
            if (!(C7447i0.this.f18724i == null || d == null)) {
                C7447i0.this.f18720e.mo51614h();
            }
            C7447i0.this.f18717b.mo51748a((Runnable) C7447i0.this.f18718c);
        }

        public void onAdAudioStarted() {
            int unused = C7447i0.this.f18729n = 1;
            if (!C7447i0.this.f18728m && C7447i0.this.f18722g != null) {
                C7447i0 i0Var = C7447i0.this;
                i0Var.mo50333b(i0Var.f18722g.getAdAudioDuration());
            }
            C7447i0.this.f18717b.mo51748a((Runnable) C7447i0.this.f18718c);
        }

        public void onAdAudioStopped() {
            if (C7447i0.this.f18729n == 1) {
                if (!(C7447i0.this.f18724i == null || C7447i0.this.f18723h == null)) {
                    C7447i0.this.f18720e.mo51615i();
                    C7447i0.this.f18723h.mo50351a(C7447i0.this.f18724i);
                }
                int unused = C7447i0.this.f18729n = 0;
            }
            C7447i0.this.f18717b.mo51750b(C7447i0.this.f18718c);
        }

        public void onVolumeChanged(float f) {
            C7679t8 h;
            boolean z;
            float f2 = this.f18730a;
            if (f != f2) {
                int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i <= 0 || f > 0.0f) {
                    if (i == 0 && f > 0.0f && C7447i0.this.mo50336d() != null && C7447i0.this.f18724i != null) {
                        h = C7447i0.this.f18720e;
                        z = true;
                    } else {
                        return;
                    }
                } else if (C7447i0.this.mo50336d() != null && C7447i0.this.f18724i != null) {
                    h = C7447i0.this.f18720e;
                    z = false;
                } else {
                    return;
                }
                h.mo51608b(z);
                this.f18730a = f;
                float unused = C7447i0.this.f18721f = f;
            }
        }
    }

    /* renamed from: com.my.target.i0$c */
    public interface C7450c {
        /* renamed from: a */
        void mo50350a(float f, float f2, C7413g2 g2Var);

        /* renamed from: a */
        void mo50351a(C7413g2 g2Var);

        /* renamed from: a */
        void mo50352a(String str, C7413g2 g2Var);

        /* renamed from: b */
        void mo50353b(C7413g2 g2Var);

        /* renamed from: c */
        void mo50354c(C7413g2 g2Var);
    }

    /* renamed from: com.my.target.i0$d */
    public class C7451d implements Runnable {
        public C7451d() {
        }

        public void run() {
            C7447i0.this.mo50325a();
        }
    }

    /* renamed from: h */
    public static C7447i0 m19299h() {
        return new C7447i0();
    }

    /* renamed from: a */
    public void mo50325a() {
        float f;
        float f2;
        float f3;
        InstreamAudioAdPlayer instreamAudioAdPlayer;
        C7413g2<AudioData> g2Var = this.f18724i;
        float duration = g2Var != null ? g2Var.getDuration() : 0.0f;
        if (this.f18724i == null) {
            this.f18717b.mo51750b(this.f18718c);
            return;
        }
        if (this.f18729n != 1 || (instreamAudioAdPlayer = this.f18722g) == null) {
            f3 = 0.0f;
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f3 = instreamAudioAdPlayer.getAdAudioDuration();
            f2 = this.f18722g.getAdAudioPosition();
            f = duration - f2;
        }
        if (this.f18729n != 1 || this.f18726k == f2 || f3 <= 0.0f) {
            this.f18725j++;
        } else {
            mo50327a(f, f2, duration);
        }
        if (this.f18725j >= (this.f18727l * 1000) / 200) {
            mo50339g();
        }
    }

    /* renamed from: a */
    public final void mo50326a(float f) {
        C7413g2<AudioData> g2Var;
        this.f18720e.mo51600a(f, f);
        C7450c cVar = this.f18723h;
        if (!(cVar == null || (g2Var = this.f18724i) == null)) {
            cVar.mo50350a(0.0f, f, g2Var);
        }
        mo50332b();
    }

    /* renamed from: a */
    public final void mo50327a(float f, float f2, float f3) {
        C7413g2<AudioData> g2Var;
        this.f18725j = 0;
        this.f18726k = f2;
        if (f2 < f3) {
            this.f18720e.mo51600a(f2, f3);
            C7450c cVar = this.f18723h;
            if (cVar != null && (g2Var = this.f18724i) != null) {
                cVar.mo50350a(f, f3, g2Var);
                return;
            }
            return;
        }
        mo50326a(f3);
    }

    /* renamed from: a */
    public void mo50328a(int i) {
        this.f18727l = i;
    }

    /* renamed from: a */
    public void mo50329a(C7413g2<AudioData> g2Var) {
        this.f18724i = g2Var;
        this.f18720e.mo51602a((C7413g2) g2Var);
        this.f18728m = false;
        g2Var.getStatHolder().mo49806b(this.f18719d);
        AudioData mediaData = g2Var.getMediaData();
        if (mediaData != null) {
            Uri parse = Uri.parse(mediaData.getUrl());
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.setVolume(this.f18721f);
                this.f18722g.playAdAudio(parse);
            }
        }
    }

    /* renamed from: a */
    public void mo50330a(C7450c cVar) {
        this.f18723h = cVar;
    }

    /* renamed from: a */
    public void mo50331a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        InstreamAudioAdPlayer instreamAudioAdPlayer2 = this.f18722g;
        if (instreamAudioAdPlayer2 != null) {
            instreamAudioAdPlayer2.setAdPlayerListener((InstreamAudioAdPlayer.AdPlayerListener) null);
        }
        this.f18722g = instreamAudioAdPlayer;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setAdPlayerListener(this.f18716a);
            this.f18720e.mo51601a(instreamAudioAdPlayer.getCurrentContext());
            return;
        }
        this.f18720e.mo51601a((Context) null);
    }

    /* renamed from: b */
    public final void mo50332b() {
        C7450c cVar;
        this.f18717b.mo51750b(this.f18718c);
        if (this.f18729n != 2) {
            this.f18729n = 2;
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            C7413g2<AudioData> g2Var = this.f18724i;
            if (g2Var != null && (cVar = this.f18723h) != null) {
                this.f18724i = null;
                cVar.mo50353b(g2Var);
            }
        }
    }

    /* renamed from: b */
    public final void mo50333b(float f) {
        C7413g2<AudioData> g2Var;
        C7450c cVar;
        C7413g2<AudioData> g2Var2 = this.f18724i;
        if (!(g2Var2 == null || (cVar = this.f18723h) == null)) {
            cVar.mo50354c(g2Var2);
        }
        C7450c cVar2 = this.f18723h;
        if (!(cVar2 == null || (g2Var = this.f18724i) == null)) {
            cVar2.mo50350a(0.0f, f, g2Var);
        }
        this.f18720e.mo51600a(0.0f, f);
        this.f18728m = true;
    }

    /* renamed from: c */
    public void mo50334c() {
        this.f18717b.close();
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.destroy();
        }
        this.f18722g = null;
    }

    /* renamed from: c */
    public void mo50335c(float f) {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(f);
        }
        this.f18721f = f;
    }

    /* renamed from: d */
    public Context mo50336d() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer == null) {
            return null;
        }
        return instreamAudioAdPlayer.getCurrentContext();
    }

    /* renamed from: e */
    public InstreamAudioAdPlayer mo50337e() {
        return this.f18722g;
    }

    /* renamed from: f */
    public float mo50338f() {
        return this.f18721f;
    }

    /* renamed from: g */
    public final void mo50339g() {
        C7413g2<AudioData> g2Var;
        C7374e0.m18989a("video freeze more then " + this.f18727l + " seconds, stopping");
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
        this.f18717b.mo51750b(this.f18718c);
        this.f18720e.mo51613g();
        C7450c cVar = this.f18723h;
        if (cVar != null && (g2Var = this.f18724i) != null) {
            cVar.mo50352a("Timeout", g2Var);
        }
    }

    /* renamed from: i */
    public void mo50340i() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.pauseAdAudio();
        }
    }

    /* renamed from: j */
    public void mo50341j() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.resumeAdAudio();
        }
    }

    /* renamed from: k */
    public void mo50342k() {
        if (this.f18729n == 1) {
            if (!(this.f18724i == null || this.f18723h == null)) {
                this.f18720e.mo51615i();
                this.f18723h.mo50351a(this.f18724i);
            }
            this.f18729n = 0;
        }
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f18722g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
    }
}

package com.p243my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.p243my.target.C7364d7;
import com.p243my.target.C7543m4;
import com.p243my.target.C7667t4;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.m4 */
public class C7543m4 {

    /* renamed from: a */
    public final C7413g2<VideoData> f18987a;

    /* renamed from: b */
    public final C7544a f18988b;

    /* renamed from: c */
    public final C7781z6 f18989c;

    /* renamed from: d */
    public final C7336b9 f18990d;

    /* renamed from: e */
    public final C7679t8 f18991e;

    /* renamed from: f */
    public float f18992f;

    /* renamed from: g */
    public boolean f18993g;

    /* renamed from: h */
    public boolean f18994h;

    /* renamed from: i */
    public boolean f18995i;

    /* renamed from: j */
    public final C7667t4.C7670c f18996j;

    /* renamed from: k */
    public final C7667t4.C7669b f18997k;

    /* renamed from: l */
    public boolean f18998l;

    /* renamed from: m */
    public boolean f18999m = true;

    /* renamed from: com.my.target.m4$a */
    public class C7544a implements C7364d7.C7366b {
        public C7544a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19812a(int i) {
            C7543m4.this.mo50855a(i);
        }

        /* renamed from: a */
        public void mo50868a() {
            if (!C7543m4.this.f18993g) {
                C7543m4.this.mo50861c();
                C7543m4.this.f18991e.mo51608b(false);
                boolean unused = C7543m4.this.f18993g = true;
                return;
            }
            C7543m4.this.mo50867i();
            C7543m4.this.f18991e.mo51608b(true);
            boolean unused2 = C7543m4.this.f18993g = false;
        }

        /* renamed from: a */
        public void mo49870a(float f) {
            C7543m4.this.f18989c.mo49831b(f <= 0.0f);
        }

        /* renamed from: a */
        public void mo49871a(float f, float f2) {
            C7543m4.this.f18989c.setTimeChanged(f);
            boolean unused = C7543m4.this.f18998l = false;
            if (!C7543m4.this.f18995i) {
                boolean unused2 = C7543m4.this.f18995i = true;
            }
            if (C7543m4.this.f18994h && C7543m4.this.f18987a.isAutoPlay() && C7543m4.this.f18987a.getAllowCloseDelay() <= f) {
                C7543m4.this.f18989c.mo49603d();
            }
            if (f <= C7543m4.this.f18992f) {
                C7543m4.this.mo50854a(f, f2);
                if (f == C7543m4.this.f18992f) {
                    onVideoCompleted();
                    return;
                }
                return;
            }
            mo49871a(C7543m4.this.f18992f, C7543m4.this.f18992f);
        }

        /* renamed from: a */
        public void mo49872a(String str) {
            C7374e0.m18989a("Video playing error: " + str);
            C7543m4.this.f18991e.mo51612f();
            if (C7543m4.this.f18999m) {
                C7374e0.m18989a("Try to play video stream from URL");
                boolean unused = C7543m4.this.f18999m = false;
                C7543m4.this.mo50864f();
                return;
            }
            C7543m4.this.mo50853a();
            C7543m4.this.f18997k.mo49484c();
        }

        /* renamed from: b */
        public void mo50018b() {
            C7543m4.this.mo50864f();
        }

        /* renamed from: c */
        public void mo50019c() {
            C7543m4 m4Var = C7543m4.this;
            m4Var.mo50856a(m4Var.f18989c.getView().getContext());
            C7543m4.this.f18991e.mo51611e();
            C7543m4.this.f18989c.mo49830b();
        }

        /* renamed from: f */
        public void mo49873f() {
        }

        /* renamed from: g */
        public void mo49874g() {
        }

        /* renamed from: h */
        public void mo49875h() {
        }

        /* renamed from: j */
        public void mo49876j() {
        }

        /* renamed from: l */
        public void mo49877l() {
            C7543m4.this.f18991e.mo51613g();
            C7543m4.this.mo50853a();
            C7374e0.m18989a("Video playing timeout");
            C7543m4.this.f18997k.mo49484c();
        }

        /* renamed from: m */
        public void mo50020m() {
            if (!C7543m4.this.f18993g) {
                C7543m4 m4Var = C7543m4.this;
                m4Var.mo50860b(m4Var.f18989c.getView().getContext());
            }
            C7543m4.this.mo50864f();
        }

        /* renamed from: n */
        public void mo50021n() {
            C7543m4.this.f18991e.mo51614h();
            C7543m4.this.f18989c.mo49825a();
            if (C7543m4.this.f18993g) {
                C7543m4.this.mo50861c();
            } else {
                C7543m4.this.mo50867i();
            }
        }

        /* renamed from: o */
        public void mo49878o() {
            if (C7543m4.this.f18994h && C7543m4.this.f18987a.getAllowCloseDelay() == 0.0f) {
                C7543m4.this.f18989c.mo49603d();
            }
            C7543m4.this.f18989c.mo49837g();
        }

        public void onAudioFocusChange(int i) {
            if (Build.VERSION.SDK_INT >= 23 ? Looper.getMainLooper().isCurrentThread() : Thread.currentThread() == Looper.getMainLooper().getThread()) {
                C7543m4.this.mo50855a(i);
            } else {
                C7395f0.m19090c(new Runnable(i) {
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7543m4.C7544a.this.m19812a(this.f$1);
                    }
                });
            }
        }

        public void onVideoCompleted() {
            if (!C7543m4.this.f18998l) {
                boolean unused = C7543m4.this.f18998l = true;
                C7374e0.m18989a("Video playing complete:");
                C7543m4.this.mo50866h();
                C7543m4.this.f18996j.mo51584a(C7543m4.this.f18989c.getView().getContext());
                C7543m4.this.f18989c.mo49603d();
                C7543m4.this.f18989c.mo49839h();
                C7543m4.this.f18991e.mo51609c();
            }
        }
    }

    public C7543m4(C7552m7 m7Var, C7413g2<VideoData> g2Var, C7781z6 z6Var, C7667t4.C7670c cVar, C7667t4.C7669b bVar) {
        this.f18987a = g2Var;
        this.f18996j = cVar;
        this.f18997k = bVar;
        C7544a aVar = new C7544a();
        this.f18988b = aVar;
        this.f18989c = z6Var;
        z6Var.setMediaListener(aVar);
        C7336b9 a = C7336b9.m18814a(g2Var.getStatHolder());
        this.f18990d = a;
        a.mo49775a((View) z6Var.getPromoMediaView());
        this.f18991e = m7Var.mo50892a(g2Var);
    }

    /* renamed from: a */
    public static C7543m4 m19773a(C7552m7 m7Var, C7413g2<VideoData> g2Var, C7781z6 z6Var, C7667t4.C7670c cVar, C7667t4.C7669b bVar) {
        return new C7543m4(m7Var, g2Var, z6Var, cVar, bVar);
    }

    /* renamed from: a */
    public void mo50853a() {
        mo50856a(this.f18989c.getView().getContext());
        this.f18989c.destroy();
    }

    /* renamed from: a */
    public final void mo50854a(float f, float f2) {
        this.f18990d.mo49774a(f, f2);
        this.f18991e.mo51600a(f, f2);
    }

    /* renamed from: a */
    public final void mo50855a(int i) {
        if (i == -3) {
            C7374e0.m18989a("Audiofocus loss can duck, set volume to 0.3");
            if (!this.f18993g) {
                mo50859b();
            }
        } else if (i == -2 || i == -1) {
            mo50863e();
            C7374e0.m18989a("Audiofocus loss, pausing");
        } else if (i == 1 || i == 2 || i == 4) {
            C7374e0.m18989a("Audiofocus gain, unmuting");
            if (!this.f18993g) {
                mo50867i();
            }
        }
    }

    /* renamed from: a */
    public final void mo50856a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f18988b);
        }
    }

    /* renamed from: a */
    public void mo50857a(C7399f2 f2Var) {
        this.f18989c.mo49603d();
        this.f18989c.mo49827a(f2Var);
    }

    /* renamed from: a */
    public void mo50858a(C7413g2<VideoData> g2Var, Context context) {
        VideoData mediaData = g2Var.getMediaData();
        if (mediaData != null && mediaData.getData() == null) {
            this.f18999m = false;
        }
        boolean isAllowClose = g2Var.isAllowClose();
        this.f18994h = isAllowClose;
        if (isAllowClose && g2Var.getAllowCloseDelay() == 0.0f && g2Var.isAutoPlay()) {
            C7374e0.m18989a("banner is allowed to close");
            this.f18989c.mo49603d();
        }
        this.f18992f = g2Var.getDuration();
        boolean isAutoMute = g2Var.isAutoMute();
        this.f18993g = isAutoMute;
        if (isAutoMute) {
            this.f18989c.mo49826a(0);
            return;
        }
        if (g2Var.isAutoPlay()) {
            mo50860b(context);
        }
        this.f18989c.mo49826a(2);
    }

    /* renamed from: b */
    public final void mo50859b() {
        this.f18989c.mo49826a(1);
    }

    /* renamed from: b */
    public final void mo50860b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f18988b, 3, 2);
        }
    }

    /* renamed from: c */
    public final void mo50861c() {
        mo50856a(this.f18989c.getView().getContext());
        this.f18989c.mo49826a(0);
    }

    /* renamed from: d */
    public void mo50862d() {
        this.f18989c.mo49829a(true);
        mo50856a(this.f18989c.getView().getContext());
        if (this.f18995i) {
            this.f18991e.mo51610d();
        }
    }

    /* renamed from: e */
    public void mo50863e() {
        this.f18989c.mo49830b();
        mo50856a(this.f18989c.getView().getContext());
        if (this.f18989c.mo49834c() && !this.f18989c.mo49836f()) {
            this.f18991e.mo51611e();
        }
    }

    /* renamed from: f */
    public final void mo50864f() {
        this.f18989c.mo49833c(this.f18999m);
    }

    /* renamed from: g */
    public void mo50865g() {
        mo50856a(this.f18989c.getView().getContext());
    }

    /* renamed from: h */
    public final void mo50866h() {
        this.f18989c.mo49603d();
        mo50856a(this.f18989c.getView().getContext());
        this.f18989c.mo49829a(this.f18987a.isAllowReplay());
    }

    /* renamed from: i */
    public final void mo50867i() {
        if (this.f18989c.mo49834c()) {
            mo50860b(this.f18989c.getView().getContext());
        }
        this.f18989c.mo49826a(2);
    }
}

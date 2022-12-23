package com.p243my.target;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.p243my.target.C7599p3;
import com.p243my.target.C7679t8;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.instreamads.InstreamAdPlayer;

/* renamed from: com.my.target.j0 */
public class C7468j0 {

    /* renamed from: a */
    public final C7470b f18788a = new C7470b();

    /* renamed from: b */
    public final C7710v8 f18789b = C7710v8.m20686a(200);

    /* renamed from: c */
    public final C7471c f18790c = new C7471c();

    /* renamed from: d */
    public final C7679t8 f18791d = C7679t8.m20487b();

    /* renamed from: e */
    public float f18792e = 1.0f;

    /* renamed from: f */
    public C7336b9 f18793f;

    /* renamed from: g */
    public C7599p3 f18794g;

    /* renamed from: h */
    public InstreamAdPlayer f18795h;

    /* renamed from: i */
    public C7472d f18796i;

    /* renamed from: j */
    public C7413g2<VideoData> f18797j;

    /* renamed from: k */
    public int f18798k;

    /* renamed from: l */
    public float f18799l;

    /* renamed from: m */
    public int f18800m = 10;

    /* renamed from: n */
    public boolean f18801n;

    /* renamed from: o */
    public int f18802o = 0;

    /* renamed from: com.my.target.j0$b */
    public class C7470b implements InstreamAdPlayer.AdPlayerListener {

        /* renamed from: a */
        public float f18803a;

        public C7470b() {
            this.f18803a = 1.0f;
        }

        public void onAdVideoCompleted() {
            if (C7468j0.this.f18802o != 2) {
                if (!(C7468j0.this.f18797j == null || C7468j0.this.f18796i == null)) {
                    C7468j0.this.mo50538a();
                    if (C7468j0.this.f18797j != null) {
                        C7413g2 i = C7468j0.this.f18797j;
                        C7468j0.this.mo50545b();
                        float duration = i.getDuration();
                        C7468j0.this.f18791d.mo51600a(duration, duration);
                        C7468j0.this.f18796i.mo50563b(i);
                    }
                }
                int unused = C7468j0.this.f18802o = 2;
            }
            C7468j0.this.f18789b.mo51750b(C7468j0.this.f18790c);
        }

        public void onAdVideoError(String str) {
            if (C7468j0.this.f18795h != null) {
                C7468j0.this.f18795h.stopAdVideo();
            }
            if (!(C7468j0.this.f18797j == null || C7468j0.this.f18796i == null)) {
                C7468j0.this.f18796i.mo50562a(str, C7468j0.this.f18797j);
            }
            C7468j0.this.f18791d.mo51612f();
            C7468j0.this.f18789b.mo51750b(C7468j0.this.f18790c);
            C7468j0.this.mo50545b();
        }

        public void onAdVideoPaused() {
            C7468j0.this.f18791d.mo51611e();
            C7468j0.this.f18789b.mo51750b(C7468j0.this.f18790c);
            if (C7468j0.this.f18797j != null && C7468j0.this.f18796i != null) {
                C7468j0.this.f18796i.mo50566e(C7468j0.this.f18797j);
            }
        }

        public void onAdVideoResumed() {
            C7468j0.this.f18791d.mo51614h();
            C7468j0.this.f18789b.mo51748a((Runnable) C7468j0.this.f18790c);
            if (C7468j0.this.f18797j != null && C7468j0.this.f18796i != null) {
                C7468j0.this.f18796i.mo50565d(C7468j0.this.f18797j);
            }
        }

        public void onAdVideoStarted() {
            int unused = C7468j0.this.f18802o = 1;
            if (!C7468j0.this.f18801n && C7468j0.this.f18795h != null) {
                C7468j0 j0Var = C7468j0.this;
                j0Var.mo50539a(j0Var.f18795h.getAdVideoDuration());
            }
            C7468j0.this.f18789b.mo51748a((Runnable) C7468j0.this.f18790c);
        }

        public void onAdVideoStopped() {
            if (C7468j0.this.f18802o == 1) {
                if (!(C7468j0.this.f18797j == null || C7468j0.this.f18796i == null)) {
                    C7468j0.this.f18791d.mo51615i();
                    C7468j0.this.f18796i.mo50561a(C7468j0.this.f18797j);
                }
                int unused = C7468j0.this.f18802o = 0;
            }
            C7468j0.this.f18789b.mo51750b(C7468j0.this.f18790c);
        }

        public void onVolumeChanged(float f) {
            C7468j0.this.f18791d.mo51607b(this.f18803a, f);
            this.f18803a = f;
            float unused = C7468j0.this.f18792e = f;
        }
    }

    /* renamed from: com.my.target.j0$c */
    public class C7471c implements Runnable {
        public C7471c() {
        }

        public void run() {
            C7468j0.this.mo50538a();
        }
    }

    /* renamed from: com.my.target.j0$d */
    public interface C7472d {
        /* renamed from: a */
        void mo50560a(float f, float f2, C7413g2 g2Var);

        /* renamed from: a */
        void mo50561a(C7413g2 g2Var);

        /* renamed from: a */
        void mo50562a(String str, C7413g2 g2Var);

        /* renamed from: b */
        void mo50563b(C7413g2 g2Var);

        /* renamed from: c */
        void mo50564c(C7413g2 g2Var);

        /* renamed from: d */
        void mo50565d(C7413g2 g2Var);

        /* renamed from: e */
        void mo50566e(C7413g2 g2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m19437i() {
        InstreamAdPlayer instreamAdPlayer;
        C7599p3 p3Var = this.f18794g;
        if (p3Var != null && (instreamAdPlayer = this.f18795h) != null) {
            p3Var.mo51324a(instreamAdPlayer.getView(), new C7599p3.C7602c[0]);
            this.f18794g.mo51329c();
        }
    }

    /* renamed from: j */
    public static C7468j0 m19438j() {
        return new C7468j0();
    }

    /* renamed from: a */
    public void mo50538a() {
        float f;
        float f2;
        float f3;
        InstreamAdPlayer instreamAdPlayer;
        C7413g2<VideoData> g2Var = this.f18797j;
        float duration = g2Var != null ? g2Var.getDuration() : 0.0f;
        if (this.f18797j == null) {
            this.f18789b.mo51750b(this.f18790c);
            return;
        }
        if (this.f18802o != 1 || (instreamAdPlayer = this.f18795h) == null) {
            f3 = 0.0f;
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f3 = instreamAdPlayer.getAdVideoDuration();
            f2 = this.f18795h.getAdVideoPosition();
            f = duration - f2;
        }
        if (this.f18802o != 1 || this.f18799l == f2 || f3 <= 0.0f) {
            this.f18798k++;
        } else {
            mo50540a(f, f2, duration);
        }
        if (this.f18798k >= (this.f18800m * 1000) / 200) {
            mo50554h();
        }
    }

    /* renamed from: a */
    public final void mo50539a(float f) {
        C7413g2<VideoData> g2Var;
        C7472d dVar;
        C7413g2<VideoData> g2Var2 = this.f18797j;
        if (!(g2Var2 == null || (dVar = this.f18796i) == null)) {
            dVar.mo50564c(g2Var2);
        }
        C7472d dVar2 = this.f18796i;
        if (!(dVar2 == null || (g2Var = this.f18797j) == null)) {
            dVar2.mo50560a(f, f, g2Var);
        }
        this.f18791d.mo51600a(0.0f, f);
        this.f18801n = true;
    }

    /* renamed from: a */
    public final void mo50540a(float f, float f2, float f3) {
        C7413g2<VideoData> g2Var;
        this.f18798k = 0;
        this.f18799l = f2;
        if (f2 < f3) {
            this.f18791d.mo51600a(f2, f3);
            C7336b9 b9Var = this.f18793f;
            if (b9Var != null) {
                b9Var.mo49774a(f2, f3);
            }
            C7472d dVar = this.f18796i;
            if (dVar != null && (g2Var = this.f18797j) != null) {
                dVar.mo50560a(f, f3, g2Var);
                return;
            }
            return;
        }
        mo50546b(f3);
    }

    /* renamed from: a */
    public void mo50541a(int i) {
        this.f18800m = i;
    }

    /* renamed from: a */
    public void mo50542a(C7413g2<VideoData> g2Var) {
        this.f18797j = g2Var;
        this.f18801n = false;
        this.f18791d.mo51602a((C7413g2) g2Var);
        this.f18793f = C7336b9.m18814a(g2Var.getStatHolder());
        C7599p3 p3Var = this.f18794g;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            View view = instreamAdPlayer.getView();
            this.f18793f.mo49775a(view);
            this.f18794g = C7599p3.m20069a(g2Var, 3, this.f18797j, view.getContext());
        }
        this.f18791d.mo51603a(this.f18794g);
        this.f18791d.mo51604a((C7679t8.C7680a) new C7679t8.C7680a() {
            /* renamed from: a */
            public final void mo49471a() {
                C7468j0.this.m19437i();
            }
        });
        VideoData mediaData = g2Var.getMediaData();
        if (mediaData != null) {
            Uri parse = Uri.parse(mediaData.getUrl());
            InstreamAdPlayer instreamAdPlayer2 = this.f18795h;
            if (instreamAdPlayer2 != null) {
                instreamAdPlayer2.setVolume(this.f18792e);
                this.f18795h.playAdVideo(parse, mediaData.getWidth(), mediaData.getHeight());
            }
        }
    }

    /* renamed from: a */
    public void mo50543a(InstreamAdPlayer instreamAdPlayer) {
        InstreamAdPlayer instreamAdPlayer2 = this.f18795h;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener((InstreamAdPlayer.AdPlayerListener) null);
        }
        this.f18795h = instreamAdPlayer;
        if (instreamAdPlayer != null) {
            View view = instreamAdPlayer.getView();
            C7336b9 b9Var = this.f18793f;
            if (b9Var != null) {
                b9Var.mo49775a(view);
            }
            instreamAdPlayer.setAdPlayerListener(this.f18788a);
            this.f18791d.mo51601a(view.getContext());
            C7599p3 p3Var = this.f18794g;
            if (p3Var != null) {
                p3Var.mo51323a(instreamAdPlayer.getView());
                return;
            }
            return;
        }
        C7336b9 b9Var2 = this.f18793f;
        if (b9Var2 != null) {
            b9Var2.mo49775a((View) null);
        }
        this.f18791d.mo51601a((Context) null);
    }

    /* renamed from: a */
    public void mo50544a(C7472d dVar) {
        this.f18796i = dVar;
    }

    /* renamed from: b */
    public final void mo50545b() {
        this.f18797j = null;
        C7336b9 b9Var = this.f18793f;
        if (b9Var != null) {
            b9Var.mo49772a();
            this.f18793f = null;
        }
        C7599p3 p3Var = this.f18794g;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
    }

    /* renamed from: b */
    public final void mo50546b(float f) {
        C7413g2<VideoData> g2Var;
        this.f18791d.mo51600a(f, f);
        this.f18799l = f;
        C7336b9 b9Var = this.f18793f;
        if (b9Var != null) {
            b9Var.mo49774a(f, f);
        }
        C7472d dVar = this.f18796i;
        if (!(dVar == null || (g2Var = this.f18797j) == null)) {
            dVar.mo50560a(0.0f, f, g2Var);
        }
        mo50548c();
    }

    /* renamed from: b */
    public void mo50547b(InstreamAdPlayer instreamAdPlayer) {
        VideoData mediaData;
        InstreamAdPlayer instreamAdPlayer2 = this.f18795h;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener((InstreamAdPlayer.AdPlayerListener) null);
            this.f18795h.stopAdVideo();
        }
        this.f18795h = instreamAdPlayer;
        C7336b9 b9Var = this.f18793f;
        if (instreamAdPlayer != null) {
            if (b9Var != null) {
                b9Var.mo49775a(instreamAdPlayer.getView());
            }
            instreamAdPlayer.setAdPlayerListener(this.f18788a);
            this.f18791d.mo51601a(instreamAdPlayer.getView().getContext());
            C7599p3 p3Var = this.f18794g;
            if (p3Var != null) {
                p3Var.mo51323a(instreamAdPlayer.getView());
            }
        } else {
            if (b9Var != null) {
                b9Var.mo49775a((View) null);
            }
            this.f18791d.mo51601a((Context) null);
        }
        C7413g2<VideoData> g2Var = this.f18797j;
        if (g2Var != null && (mediaData = g2Var.getMediaData()) != null) {
            Uri parse = Uri.parse(mediaData.getUrl());
            if (instreamAdPlayer != null) {
                instreamAdPlayer.setVolume(this.f18792e);
                instreamAdPlayer.playAdVideo(parse, mediaData.getWidth(), mediaData.getHeight(), this.f18799l);
            }
        }
    }

    /* renamed from: c */
    public final void mo50548c() {
        C7472d dVar;
        this.f18789b.mo51750b(this.f18790c);
        if (this.f18802o != 2) {
            this.f18802o = 2;
            InstreamAdPlayer instreamAdPlayer = this.f18795h;
            if (instreamAdPlayer != null) {
                instreamAdPlayer.stopAdVideo();
            }
            C7413g2<VideoData> g2Var = this.f18797j;
            mo50545b();
            if (g2Var != null && (dVar = this.f18796i) != null) {
                dVar.mo50563b(g2Var);
            }
        }
    }

    /* renamed from: c */
    public void mo50549c(float f) {
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.setVolume(f);
        }
        this.f18792e = f;
    }

    /* renamed from: d */
    public void mo50550d() {
        this.f18789b.close();
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.destroy();
        }
        this.f18795h = null;
        mo50545b();
    }

    /* renamed from: e */
    public Context mo50551e() {
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer == null) {
            return null;
        }
        return instreamAdPlayer.getView().getContext();
    }

    /* renamed from: f */
    public InstreamAdPlayer mo50552f() {
        return this.f18795h;
    }

    /* renamed from: g */
    public float mo50553g() {
        return this.f18792e;
    }

    /* renamed from: h */
    public final void mo50554h() {
        C7413g2<VideoData> g2Var;
        C7374e0.m18989a("video freeze more then " + this.f18800m + " seconds, stopping");
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        this.f18789b.mo51750b(this.f18790c);
        this.f18791d.mo51613g();
        C7472d dVar = this.f18796i;
        if (!(dVar == null || (g2Var = this.f18797j) == null)) {
            dVar.mo50562a("Timeout", g2Var);
        }
        mo50545b();
    }

    /* renamed from: k */
    public void mo50555k() {
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.pauseAdVideo();
        }
    }

    /* renamed from: l */
    public void mo50556l() {
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.resumeAdVideo();
        }
    }

    /* renamed from: m */
    public void mo50557m() {
        if (this.f18802o == 1) {
            if (!(this.f18797j == null || this.f18796i == null)) {
                this.f18791d.mo51615i();
                this.f18796i.mo50561a(this.f18797j);
            }
            this.f18802o = 0;
        }
        InstreamAdPlayer instreamAdPlayer = this.f18795h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        mo50545b();
    }

    /* renamed from: n */
    public void mo50558n() {
        C7599p3 p3Var = this.f18794g;
        if (p3Var != null) {
            p3Var.mo51321a(2);
        }
    }
}

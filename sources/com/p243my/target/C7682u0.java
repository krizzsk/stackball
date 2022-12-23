package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7443i;
import com.p243my.target.C7447i0;
import com.p243my.target.C7524l3;
import com.p243my.target.common.models.AudioData;
import com.p243my.target.instreamads.InstreamAudioAd;
import com.p243my.target.instreamads.InstreamAudioAdPlayer;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.u0 */
public class C7682u0 {

    /* renamed from: a */
    public final InstreamAudioAd f19443a;

    /* renamed from: b */
    public final C7647s2 f19444b;

    /* renamed from: c */
    public final C7298a f19445c;

    /* renamed from: d */
    public final C7524l3.C7525a f19446d;

    /* renamed from: e */
    public final C7447i0 f19447e;

    /* renamed from: f */
    public final C7424g8 f19448f;

    /* renamed from: g */
    public C7686u2<AudioData> f19449g;

    /* renamed from: h */
    public C7413g2<AudioData> f19450h;

    /* renamed from: i */
    public InstreamAudioAd.InstreamAudioAdBanner f19451i;

    /* renamed from: j */
    public List<InstreamAudioAd.InstreamAdCompanionBanner> f19452j;

    /* renamed from: k */
    public List<C7413g2<AudioData>> f19453k;

    /* renamed from: l */
    public float[] f19454l = new float[0];

    /* renamed from: m */
    public float f19455m;

    /* renamed from: n */
    public int f19456n;

    /* renamed from: o */
    public int f19457o;

    /* renamed from: p */
    public int f19458p;

    /* renamed from: com.my.target.u0$b */
    public class C7684b implements C7447i0.C7450c {
        public C7684b() {
        }

        /* renamed from: a */
        public void mo50350a(float f, float f2, C7413g2 g2Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            if (C7682u0.this.f19449g != null && C7682u0.this.f19450h == g2Var && C7682u0.this.f19451i != null && (listener = C7682u0.this.f19443a.getListener()) != null) {
                listener.onBannerTimeLeftChange(f, f2, C7682u0.this.f19443a);
            }
        }

        /* renamed from: a */
        public void mo50351a(C7413g2 g2Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            if (C7682u0.this.f19449g != null && C7682u0.this.f19450h == g2Var && C7682u0.this.f19451i != null && (listener = C7682u0.this.f19443a.getListener()) != null) {
                listener.onBannerComplete(C7682u0.this.f19443a, C7682u0.this.f19451i);
            }
        }

        /* renamed from: a */
        public void mo50352a(String str, C7413g2 g2Var) {
            if (C7682u0.this.f19449g != null && C7682u0.this.f19450h == g2Var) {
                InstreamAudioAd.InstreamAudioAdListener listener = C7682u0.this.f19443a.getListener();
                if (listener != null) {
                    listener.onError(str, C7682u0.this.f19443a);
                }
                C7682u0.this.mo51640f();
            }
        }

        /* renamed from: b */
        public void mo50353b(C7413g2 g2Var) {
            if (C7682u0.this.f19449g != null && C7682u0.this.f19450h == g2Var && C7682u0.this.f19451i != null) {
                InstreamAudioAd.InstreamAudioAdListener listener = C7682u0.this.f19443a.getListener();
                if (listener != null) {
                    listener.onBannerComplete(C7682u0.this.f19443a, C7682u0.this.f19451i);
                }
                C7682u0.this.mo51640f();
            }
        }

        /* renamed from: c */
        public void mo50354c(C7413g2 g2Var) {
            if (C7682u0.this.f19449g != null && C7682u0.this.f19450h == g2Var && C7682u0.this.f19451i != null) {
                C7374e0.m18989a("Ad shown, banner Id = " + g2Var.getId());
                InstreamAudioAd.InstreamAudioAdListener listener = C7682u0.this.f19443a.getListener();
                if (listener != null) {
                    listener.onBannerStart(C7682u0.this.f19443a, C7682u0.this.f19451i);
                }
            }
        }
    }

    public C7682u0(InstreamAudioAd instreamAudioAd, C7647s2 s2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        this.f19443a = instreamAudioAd;
        this.f19444b = s2Var;
        this.f19445c = aVar;
        this.f19446d = aVar2;
        C7447i0 h = C7447i0.m19299h();
        this.f19447e = h;
        h.mo50330a((C7447i0.C7450c) new C7684b());
        this.f19448f = C7424g8.m19196a();
    }

    /* renamed from: a */
    public static C7682u0 m20508a(InstreamAudioAd instreamAudioAd, C7647s2 s2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7682u0(instreamAudioAd, s2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public final C7302a2 mo51617a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        String str;
        C7413g2<AudioData> g2Var;
        if (this.f19452j == null || this.f19451i == null || (g2Var = this.f19450h) == null) {
            str = "can't find companion banner: no playing banner";
        } else {
            ArrayList<C7302a2> companionBanners = g2Var.getCompanionBanners();
            int indexOf = this.f19452j.indexOf(instreamAdCompanionBanner);
            if (indexOf >= 0 && indexOf < companionBanners.size()) {
                return companionBanners.get(indexOf);
            }
            str = "can't find companion banner: provided instreamAdCompanionBanner not found in current playing banner";
        }
        C7374e0.m18989a(str);
        return null;
    }

    /* renamed from: a */
    public void mo51618a() {
        this.f19447e.mo50334c();
    }

    /* renamed from: a */
    public void mo51619a(float f) {
        this.f19447e.mo50335c(f);
    }

    /* renamed from: a */
    public void mo51620a(int i) {
        this.f19456n = i;
    }

    /* renamed from: a */
    public final void mo51621a(C7413g2 g2Var, String str) {
        if (g2Var == null) {
            C7374e0.m18989a("can't send stat: banner is null");
            return;
        }
        Context d = this.f19447e.mo50336d();
        if (d == null) {
            C7374e0.m18989a("can't send stat: context is null");
        } else {
            C7741x8.m20827c((List<C7328b3>) g2Var.getStatHolder().mo49800a(str), d);
        }
    }

    /* renamed from: a */
    public void mo51622a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        C7302a2 a = mo51617a(instreamAdCompanionBanner);
        if (a == null) {
            C7374e0.m18989a("can't handle click: companion banner not found");
        } else {
            this.f19448f.mo50243a(a, context);
        }
    }

    /* renamed from: a */
    public void mo51623a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.f19447e.mo50331a(instreamAudioAdPlayer);
    }

    /* renamed from: a */
    public final void mo51624a(C7617q1 q1Var, C7686u2<AudioData> u2Var) {
        Context d = this.f19447e.mo50336d();
        if (d == null) {
            C7374e0.m18989a("can't load doAfter service: context is null");
            return;
        }
        C7374e0.m18989a("loading doAfter service: " + q1Var.f19227b);
        C7443i.m19278a(q1Var, this.f19445c, this.f19446d, this.f19456n).mo49685a(new C7443i.C7446c(u2Var) {
            public final /* synthetic */ C7686u2 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                C7682u0.this.m20512b(this.f$1, (C7647s2) q2Var, str);
            }
        }).mo49692b(this.f19446d.mo50803a(), d);
    }

    /* renamed from: a */
    public final void mo51625a(C7686u2<AudioData> u2Var) {
        if (u2Var == this.f19449g) {
            if (InstreamAdBreakType.MIDROLL.equals(u2Var.mo51662h())) {
                this.f19449g.mo51656b(this.f19458p);
            }
            this.f19449g = null;
            this.f19450h = null;
            this.f19451i = null;
            this.f19457o = -1;
            InstreamAudioAd.InstreamAudioAdListener listener = this.f19443a.getListener();
            if (listener != null) {
                listener.onComplete(u2Var.mo51662h(), this.f19443a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51626a(C7686u2<AudioData> u2Var, float f) {
        C7617q1 j = u2Var.mo51664j();
        if (j == null) {
            mo51625a(u2Var);
        } else if (InstreamAdBreakType.MIDROLL.equals(u2Var.mo51662h())) {
            j.mo51385c(true);
            j.mo51373b(f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(j);
            C7374e0.m18989a("using doAfter service for point: " + f);
            mo51630a((ArrayList<C7617q1>) arrayList, u2Var, f);
        } else {
            mo51624a(j, u2Var);
        }
    }

    /* renamed from: a */
    public final void m20512b(C7686u2<AudioData> u2Var, C7647s2 s2Var, String str) {
        if (s2Var == null) {
            if (str != null) {
                C7374e0.m18989a("loading doAfter service failed: " + str);
            }
            if (u2Var == this.f19449g) {
                mo51626a(u2Var, this.f19455m);
                return;
            }
            return;
        }
        C7686u2<AudioData> a = s2Var.mo51479a(u2Var.mo51662h());
        if (a != null) {
            u2Var.mo51655a(a);
        }
        if (u2Var == this.f19449g) {
            this.f19453k = u2Var.mo51658d();
            mo51640f();
        }
    }

    /* renamed from: a */
    public final void m20510a(C7686u2<AudioData> u2Var, C7647s2 s2Var, String str, float f) {
        if (s2Var == null) {
            if (str != null) {
                C7374e0.m18989a("loading midpoint services failed: " + str);
            }
            if (u2Var == this.f19449g && f == this.f19455m) {
                mo51626a(u2Var, f);
                return;
            }
            return;
        }
        C7686u2<AudioData> a = s2Var.mo51479a(u2Var.mo51662h());
        if (a != null) {
            u2Var.mo51655a(a);
        }
        if (u2Var == this.f19449g && f == this.f19455m) {
            mo51635b(u2Var, f);
        }
    }

    /* renamed from: a */
    public void mo51629a(String str) {
        mo51644j();
        C7686u2<AudioData> a = this.f19444b.mo51479a(str);
        this.f19449g = a;
        if (a != null) {
            this.f19447e.mo50328a(a.mo51659e());
            this.f19458p = this.f19449g.mo51660f();
            this.f19457o = -1;
            this.f19453k = this.f19449g.mo51658d();
            mo51640f();
            return;
        }
        C7374e0.m18989a("no section with name " + str);
    }

    /* renamed from: a */
    public final void mo51630a(ArrayList<C7617q1> arrayList, C7686u2<AudioData> u2Var, float f) {
        Context d = this.f19447e.mo50336d();
        if (d == null) {
            C7374e0.m18989a("can't load midpoint services: context is null");
            return;
        }
        C7374e0.m18989a("loading midpoint services for point: " + f);
        C7443i.m19279a((List<C7617q1>) arrayList, this.f19445c, this.f19446d, this.f19456n).mo49685a(new C7443i.C7446c(u2Var, f) {
            public final /* synthetic */ C7686u2 f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                C7682u0.this.m20510a(this.f$1, this.f$2, (C7647s2) q2Var, str);
            }
        }).mo49692b(this.f19446d.mo50803a(), d);
    }

    /* renamed from: a */
    public void mo51631a(float[] fArr) {
        this.f19454l = fArr;
    }

    /* renamed from: b */
    public InstreamAudioAd.InstreamAudioAdBanner mo51632b() {
        return this.f19451i;
    }

    /* renamed from: b */
    public void mo51633b(float f) {
        mo51644j();
        float[] fArr = this.f19454l;
        int length = fArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Float.compare(fArr[i], f) == 0) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C7686u2<AudioData> a = this.f19444b.mo51479a(InstreamAdBreakType.MIDROLL);
            this.f19449g = a;
            if (a != null) {
                this.f19447e.mo50328a(a.mo51659e());
                this.f19458p = this.f19449g.mo51660f();
                this.f19457o = -1;
                this.f19455m = f;
                mo51635b(this.f19449g, f);
                return;
            }
            return;
        }
        C7374e0.m18989a("attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    /* renamed from: b */
    public void mo51634b(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context d = this.f19447e.mo50336d();
        if (d == null) {
            C7374e0.m18989a("can't handle click: context is null");
            return;
        }
        C7302a2 a = mo51617a(instreamAdCompanionBanner);
        if (a == null) {
            C7374e0.m18989a("can't handle click: companion banner not found");
        } else {
            this.f19448f.mo50243a(a, d);
        }
    }

    /* renamed from: b */
    public final void mo51635b(C7686u2<AudioData> u2Var, float f) {
        ArrayList arrayList = new ArrayList();
        for (C7413g2 next : u2Var.mo51658d()) {
            if (next.getPoint() == f) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size <= 0 || this.f19457o >= size - 1) {
            ArrayList<C7617q1> a = u2Var.mo51650a(f);
            if (a.size() > 0) {
                mo51630a(a, u2Var, f);
                return;
            }
            C7374e0.m18989a("There is no one midpoint service for point: " + f);
            mo51626a(u2Var, f);
            return;
        }
        this.f19453k = arrayList;
        mo51640f();
    }

    /* renamed from: c */
    public InstreamAudioAdPlayer mo51636c() {
        return this.f19447e.mo50337e();
    }

    /* renamed from: c */
    public void mo51637c(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context d = this.f19447e.mo50336d();
        if (d == null) {
            C7374e0.m18989a("can't handle show: context is null");
            return;
        }
        C7302a2 a = mo51617a(instreamAdCompanionBanner);
        if (a == null) {
            C7374e0.m18989a("can't handle show: companion banner not found");
        } else {
            C7741x8.m20827c((List<C7328b3>) a.getStatHolder().mo49800a("playbackStarted"), d);
        }
    }

    /* renamed from: d */
    public float mo51638d() {
        return this.f19447e.mo50338f();
    }

    /* renamed from: e */
    public void mo51639e() {
        if (this.f19449g != null) {
            this.f19447e.mo50340i();
        }
    }

    /* renamed from: f */
    public final void mo51640f() {
        List<C7413g2<AudioData>> list;
        C7686u2<AudioData> u2Var = this.f19449g;
        if (u2Var != null) {
            if (this.f19458p == 0 || (list = this.f19453k) == null) {
                mo51626a(u2Var, this.f19455m);
                return;
            }
            int i = this.f19457o + 1;
            if (i < list.size()) {
                this.f19457o = i;
                C7413g2<AudioData> g2Var = this.f19453k.get(i);
                if ("statistics".equals(g2Var.getType())) {
                    mo51621a((C7413g2) g2Var, "playbackStarted");
                    mo51640f();
                    return;
                }
                int i2 = this.f19458p;
                if (i2 > 0) {
                    this.f19458p = i2 - 1;
                }
                this.f19450h = g2Var;
                this.f19451i = InstreamAudioAd.InstreamAudioAdBanner.newBanner(g2Var);
                this.f19452j = new ArrayList(this.f19451i.companionBanners);
                this.f19447e.mo50329a(g2Var);
                return;
            }
            mo51626a(this.f19449g, this.f19455m);
        }
    }

    /* renamed from: g */
    public void mo51641g() {
        if (this.f19449g != null) {
            this.f19447e.mo50341j();
        }
    }

    /* renamed from: h */
    public void mo51642h() {
        mo51621a((C7413g2) this.f19450h, "closedByUser");
        mo51644j();
    }

    /* renamed from: i */
    public void mo51643i() {
        mo51621a((C7413g2) this.f19450h, "closedByUser");
        this.f19447e.mo50342k();
        mo51640f();
    }

    /* renamed from: j */
    public void mo51644j() {
        if (this.f19449g != null) {
            this.f19447e.mo50342k();
            mo51625a(this.f19449g);
        }
    }
}

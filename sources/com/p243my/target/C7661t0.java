package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7391f;
import com.p243my.target.C7468j0;
import com.p243my.target.C7524l3;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.instreamads.InstreamAd;
import com.p243my.target.instreamads.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.t0 */
public class C7661t0 {

    /* renamed from: a */
    public final InstreamAd f19338a;

    /* renamed from: b */
    public final C7632r2 f19339b;

    /* renamed from: c */
    public final C7298a f19340c;

    /* renamed from: d */
    public final C7468j0 f19341d;

    /* renamed from: e */
    public final C7424g8 f19342e;

    /* renamed from: f */
    public final C7524l3.C7525a f19343f;

    /* renamed from: g */
    public C7686u2<VideoData> f19344g;

    /* renamed from: h */
    public C7413g2<VideoData> f19345h;

    /* renamed from: i */
    public InstreamAd.InstreamAdBanner f19346i;

    /* renamed from: j */
    public List<C7413g2<VideoData>> f19347j;

    /* renamed from: k */
    public float[] f19348k = new float[0];

    /* renamed from: l */
    public float f19349l;

    /* renamed from: m */
    public int f19350m;

    /* renamed from: n */
    public int f19351n;

    /* renamed from: o */
    public int f19352o;

    /* renamed from: com.my.target.t0$b */
    public class C7663b implements C7468j0.C7472d {
        public C7663b() {
        }

        /* renamed from: a */
        public void mo50560a(float f, float f2, C7413g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var && C7661t0.this.f19346i != null && (listener = C7661t0.this.f19338a.getListener()) != null) {
                listener.onBannerTimeLeftChange(f, f2, C7661t0.this.f19338a);
            }
        }

        /* renamed from: a */
        public void mo50561a(C7413g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var && C7661t0.this.f19346i != null && (listener = C7661t0.this.f19338a.getListener()) != null) {
                listener.onBannerComplete(C7661t0.this.f19338a, C7661t0.this.f19346i);
            }
        }

        /* renamed from: a */
        public void mo50562a(String str, C7413g2 g2Var) {
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var) {
                InstreamAd.InstreamAdListener listener = C7661t0.this.f19338a.getListener();
                if (listener != null) {
                    listener.onError(str, C7661t0.this.f19338a);
                }
                C7661t0.this.mo51563f();
            }
        }

        /* renamed from: b */
        public void mo50563b(C7413g2 g2Var) {
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var && C7661t0.this.f19346i != null) {
                InstreamAd.InstreamAdListener listener = C7661t0.this.f19338a.getListener();
                if (listener != null) {
                    listener.onBannerComplete(C7661t0.this.f19338a, C7661t0.this.f19346i);
                }
                C7661t0.this.mo51563f();
            }
        }

        /* renamed from: c */
        public void mo50564c(C7413g2 g2Var) {
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var && C7661t0.this.f19346i != null) {
                InstreamAd.InstreamAdListener listener = C7661t0.this.f19338a.getListener();
                C7374e0.m18989a("Ad shown, banner Id = " + g2Var.getId());
                if (listener != null) {
                    listener.onBannerStart(C7661t0.this.f19338a, C7661t0.this.f19346i);
                }
            }
        }

        /* renamed from: d */
        public void mo50565d(C7413g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var && C7661t0.this.f19346i != null && (listener = C7661t0.this.f19338a.getListener()) != null) {
                listener.onBannerResume(C7661t0.this.f19338a, C7661t0.this.f19346i);
            }
        }

        /* renamed from: e */
        public void mo50566e(C7413g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C7661t0.this.f19344g != null && C7661t0.this.f19345h == g2Var && C7661t0.this.f19346i != null && (listener = C7661t0.this.f19338a.getListener()) != null) {
                listener.onBannerPause(C7661t0.this.f19338a, C7661t0.this.f19346i);
            }
        }
    }

    public C7661t0(InstreamAd instreamAd, C7632r2 r2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        this.f19338a = instreamAd;
        this.f19339b = r2Var;
        this.f19340c = aVar;
        this.f19343f = aVar2;
        C7468j0 j = C7468j0.m19438j();
        this.f19341d = j;
        j.mo50544a((C7468j0.C7472d) new C7663b());
        this.f19342e = C7424g8.m19196a();
    }

    /* renamed from: a */
    public static C7661t0 m20387a(InstreamAd instreamAd, C7632r2 r2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7661t0(instreamAd, r2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo51542a() {
        this.f19341d.mo50550d();
    }

    /* renamed from: a */
    public void mo51543a(float f) {
        this.f19341d.mo50549c(f);
    }

    /* renamed from: a */
    public void mo51544a(int i) {
        this.f19350m = i;
    }

    /* renamed from: a */
    public final void mo51545a(C7413g2 g2Var, String str) {
        if (g2Var == null) {
            C7374e0.m18989a("can't send stat: banner is null");
            return;
        }
        Context e = this.f19341d.mo50551e();
        if (e == null) {
            C7374e0.m18989a("can't send stat: context is null");
        } else {
            C7741x8.m20827c((List<C7328b3>) g2Var.getStatHolder().mo49800a(str), e);
        }
    }

    /* renamed from: a */
    public void mo51546a(InstreamAdPlayer instreamAdPlayer) {
        this.f19341d.mo50543a(instreamAdPlayer);
    }

    /* renamed from: a */
    public final void mo51547a(C7617q1 q1Var, C7686u2<VideoData> u2Var) {
        Context e = this.f19341d.mo50551e();
        if (e == null) {
            C7374e0.m18989a("can't load doAfter service: context is null");
            return;
        }
        C7374e0.m18989a("loading doAfter service: " + q1Var.f19227b);
        C7391f.m19075a(q1Var, this.f19340c, this.f19343f, this.f19350m).mo49685a(new C7391f.C7394c(u2Var) {
            public final /* synthetic */ C7686u2 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                C7661t0.this.m20391b(this.f$1, (C7632r2) q2Var, str);
            }
        }).mo49692b(this.f19343f.mo50803a(), e);
    }

    /* renamed from: a */
    public final void mo51548a(C7686u2 u2Var) {
        if (u2Var == this.f19344g) {
            if (InstreamAdBreakType.MIDROLL.equals(u2Var.mo51662h())) {
                this.f19344g.mo51656b(this.f19352o);
            }
            this.f19344g = null;
            this.f19345h = null;
            this.f19346i = null;
            this.f19351n = -1;
            InstreamAd.InstreamAdListener listener = this.f19338a.getListener();
            if (listener != null) {
                listener.onComplete(u2Var.mo51662h(), this.f19338a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51549a(C7686u2<VideoData> u2Var, float f) {
        C7617q1 j = u2Var.mo51664j();
        if (j == null) {
            mo51548a((C7686u2) u2Var);
        } else if (InstreamAdBreakType.MIDROLL.equals(u2Var.mo51662h())) {
            j.mo51385c(true);
            j.mo51373b(f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(j);
            C7374e0.m18989a("using doAfter service for point: " + f);
            mo51553a((ArrayList<C7617q1>) arrayList, u2Var, f);
        } else {
            mo51547a(j, u2Var);
        }
    }

    /* renamed from: a */
    public final void m20391b(C7686u2<VideoData> u2Var, C7632r2 r2Var, String str) {
        if (r2Var == null) {
            if (str != null) {
                C7374e0.m18989a("loading doAfter service failed: " + str);
            }
            if (u2Var == this.f19344g) {
                mo51549a(u2Var, this.f19349l);
                return;
            }
            return;
        }
        C7686u2<VideoData> a = r2Var.mo51445a(u2Var.mo51662h());
        if (a != null) {
            u2Var.mo51655a(a);
        }
        if (u2Var == this.f19344g) {
            this.f19347j = u2Var.mo51658d();
            mo51563f();
        }
    }

    /* renamed from: a */
    public final void m20389a(C7686u2<VideoData> u2Var, C7632r2 r2Var, String str, float f) {
        if (r2Var == null) {
            if (str != null) {
                C7374e0.m18989a("loading midpoint services failed: " + str);
            }
            if (u2Var == this.f19344g && f == this.f19349l) {
                mo51549a(u2Var, f);
                return;
            }
            return;
        }
        C7686u2<VideoData> a = r2Var.mo51445a(u2Var.mo51662h());
        if (a != null) {
            u2Var.mo51655a(a);
        }
        if (u2Var == this.f19344g && f == this.f19349l) {
            mo51559b(u2Var, f);
        }
    }

    /* renamed from: a */
    public void mo51552a(String str) {
        mo51567j();
        C7686u2<VideoData> a = this.f19339b.mo51445a(str);
        this.f19344g = a;
        if (a != null) {
            this.f19341d.mo50541a(a.mo51659e());
            this.f19352o = this.f19344g.mo51660f();
            this.f19351n = -1;
            this.f19347j = this.f19344g.mo51658d();
            mo51563f();
            return;
        }
        C7374e0.m18989a("no section with name " + str);
    }

    /* renamed from: a */
    public final void mo51553a(ArrayList<C7617q1> arrayList, C7686u2<VideoData> u2Var, float f) {
        Context e = this.f19341d.mo50551e();
        if (e == null) {
            C7374e0.m18989a("can't load midpoint services: context is null");
            return;
        }
        C7374e0.m18989a("loading midpoint services for point: " + f);
        C7391f.m19076a((List<C7617q1>) arrayList, this.f19340c, this.f19343f, this.f19350m).mo49685a(new C7391f.C7394c(u2Var, f) {
            public final /* synthetic */ C7686u2 f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                C7661t0.this.m20389a(this.f$1, this.f$2, (C7632r2) q2Var, str);
            }
        }).mo49692b(this.f19343f.mo50803a(), e);
    }

    /* renamed from: a */
    public void mo51554a(boolean z) {
        mo51545a((C7413g2) this.f19345h, z ? "fullscreenOn" : "fullscreenOff");
    }

    /* renamed from: a */
    public void mo51555a(float[] fArr) {
        this.f19348k = fArr;
    }

    /* renamed from: b */
    public InstreamAdPlayer mo51556b() {
        return this.f19341d.mo50552f();
    }

    /* renamed from: b */
    public void mo51557b(float f) {
        mo51567j();
        float[] fArr = this.f19348k;
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
            C7686u2<VideoData> a = this.f19339b.mo51445a(InstreamAdBreakType.MIDROLL);
            this.f19344g = a;
            if (a != null) {
                this.f19341d.mo50541a(a.mo51659e());
                this.f19352o = this.f19344g.mo51660f();
                this.f19351n = -1;
                this.f19349l = f;
                mo51559b(this.f19344g, f);
                return;
            }
            return;
        }
        C7374e0.m18989a("attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    /* renamed from: b */
    public void mo51558b(InstreamAdPlayer instreamAdPlayer) {
        this.f19341d.mo50547b(instreamAdPlayer);
    }

    /* renamed from: b */
    public final void mo51559b(C7686u2<VideoData> u2Var, float f) {
        ArrayList arrayList = new ArrayList();
        for (C7413g2 next : u2Var.mo51658d()) {
            if (next.getPoint() == f) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size <= 0 || this.f19351n >= size - 1) {
            ArrayList<C7617q1> a = u2Var.mo51650a(f);
            if (a.size() > 0) {
                mo51553a(a, u2Var, f);
                return;
            }
            C7374e0.m18989a("There is no one midpoint service for point: " + f);
            mo51549a(u2Var, f);
            return;
        }
        this.f19347j = arrayList;
        mo51563f();
    }

    /* renamed from: c */
    public float mo51560c() {
        return this.f19341d.mo50553g();
    }

    /* renamed from: d */
    public void mo51561d() {
        if (this.f19345h == null) {
            C7374e0.m18989a("can't handle click: no playing banner");
            return;
        }
        Context e = this.f19341d.mo50551e();
        if (e == null) {
            C7374e0.m18989a("can't handle click: context is null");
        } else {
            this.f19342e.mo50243a(this.f19345h, e);
        }
    }

    /* renamed from: e */
    public void mo51562e() {
        if (this.f19344g != null) {
            this.f19341d.mo50555k();
        }
    }

    /* renamed from: f */
    public final void mo51563f() {
        List<C7413g2<VideoData>> list;
        C7686u2<VideoData> u2Var = this.f19344g;
        if (u2Var != null) {
            if (this.f19352o == 0 || (list = this.f19347j) == null) {
                mo51549a(u2Var, this.f19349l);
                return;
            }
            int i = this.f19351n + 1;
            if (i < list.size()) {
                this.f19351n = i;
                C7413g2<VideoData> g2Var = this.f19347j.get(i);
                if ("statistics".equals(g2Var.getType())) {
                    mo51545a((C7413g2) g2Var, "playbackStarted");
                    mo51563f();
                    return;
                }
                int i2 = this.f19352o;
                if (i2 > 0) {
                    this.f19352o = i2 - 1;
                }
                this.f19345h = g2Var;
                this.f19346i = InstreamAd.InstreamAdBanner.newBanner(g2Var);
                this.f19341d.mo50542a(g2Var);
                return;
            }
            mo51549a(this.f19344g, this.f19349l);
        }
    }

    /* renamed from: g */
    public void mo51564g() {
        if (this.f19344g != null) {
            this.f19341d.mo50556l();
        }
    }

    /* renamed from: h */
    public void mo51565h() {
        mo51545a((C7413g2) this.f19345h, "closedByUser");
        this.f19341d.mo50558n();
        mo51567j();
    }

    /* renamed from: i */
    public void mo51566i() {
        mo51545a((C7413g2) this.f19345h, "closedByUser");
        this.f19341d.mo50558n();
        this.f19341d.mo50557m();
        mo51563f();
    }

    /* renamed from: j */
    public void mo51567j() {
        if (this.f19344g != null) {
            this.f19341d.mo50557m();
            mo51548a((C7686u2) this.f19344g);
        }
    }
}

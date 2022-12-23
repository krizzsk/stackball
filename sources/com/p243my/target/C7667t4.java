package com.p243my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p243my.target.C7308a7;
import com.p243my.target.C7409g0;
import com.p243my.target.C7596p1;
import com.p243my.target.C7605p4;
import java.util.List;

/* renamed from: com.my.target.t4 */
public final class C7667t4 implements C7605p4 {

    /* renamed from: a */
    public final C7399f2 f19362a;

    /* renamed from: b */
    public final C7672e f19363b;

    /* renamed from: c */
    public final C7308a7 f19364c;

    /* renamed from: d */
    public final Handler f19365d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final C7670c f19366e;

    /* renamed from: f */
    public C7432h0 f19367f;

    /* renamed from: g */
    public C7781z6 f19368g;

    /* renamed from: h */
    public C7486j7 f19369h;

    /* renamed from: i */
    public C7481j4 f19370i;

    /* renamed from: j */
    public C7543m4 f19371j;

    /* renamed from: k */
    public long f19372k;

    /* renamed from: l */
    public long f19373l;

    /* renamed from: com.my.target.t4$a */
    public static class C7668a implements View.OnClickListener {

        /* renamed from: a */
        public final C7667t4 f19374a;

        public C7668a(C7667t4 t4Var) {
            this.f19374a = t4Var;
        }

        public void onClick(View view) {
            C7543m4 f = this.f19374a.mo51581f();
            if (f != null) {
                f.mo50862d();
            }
            this.f19374a.mo51582g().mo51332a();
        }
    }

    /* renamed from: com.my.target.t4$b */
    public interface C7669b {
        /* renamed from: c */
        void mo49484c();
    }

    /* renamed from: com.my.target.t4$c */
    public interface C7670c extends C7605p4.C7606a {
        /* renamed from: a */
        void mo51584a(Context context);
    }

    /* renamed from: com.my.target.t4$d */
    public static class C7671d implements C7308a7.C7309a {

        /* renamed from: a */
        public final C7667t4 f19375a;

        public C7671d(C7667t4 t4Var) {
            this.f19375a = t4Var;
        }

        /* renamed from: a */
        public final void mo51585a() {
            Context context = this.f19375a.mo50719j().getContext();
            C7596p1 adChoices = this.f19375a.mo51580d().getAdChoices();
            if (adChoices != null) {
                C7432h0 a = this.f19375a.f19367f;
                if (a != null && a.mo50266c()) {
                    return;
                }
                if (a == null) {
                    C7534l8.m19712a(adChoices.mo51317b(), context);
                } else {
                    a.mo50260a(context);
                }
            }
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            C7543m4 f = this.f19375a.mo51581f();
            if (f != null) {
                f.mo50853a();
            }
            this.f19375a.mo51582g().mo51333a((C7768z1) this.f19375a.mo51580d(), context);
        }

        /* renamed from: d */
        public void mo49609d() {
            mo51585a();
        }

        /* renamed from: e */
        public void mo49610e() {
            this.f19375a.mo51582g().mo51335a(this.f19375a.mo51580d(), (String) null, this.f19375a.mo50719j().getContext());
        }
    }

    /* renamed from: com.my.target.t4$e */
    public static class C7672e implements Runnable {

        /* renamed from: a */
        public final C7308a7 f19376a;

        public C7672e(C7308a7 a7Var) {
            this.f19376a = a7Var;
        }

        public void run() {
            C7374e0.m18989a("banner became just closeable");
            this.f19376a.mo49603d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.my.target.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.my.target.j7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.my.target.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.my.target.z6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7667t4(com.p243my.target.C7552m7 r7, com.p243my.target.C7399f2 r8, com.p243my.target.C7667t4.C7670c r9, android.content.Context r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.f19362a = r8
            r6.f19366e = r9
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r6.f19365d = r0
            com.my.target.t4$d r0 = new com.my.target.t4$d
            r0.<init>(r6)
            com.my.target.g2 r1 = r8.getVideoBanner()
            java.util.List r2 = r8.getInterstitialAdCards()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002e
            com.my.target.j7 r2 = r7.mo50891a()
            r6.f19369h = r2
        L_0x002b:
            r6.f19364c = r2
            goto L_0x0043
        L_0x002e:
            if (r1 == 0) goto L_0x003c
            int r2 = r8.getStyle()
            r3 = 1
            if (r2 != r3) goto L_0x003c
            com.my.target.z6 r2 = r7.mo50896c()
            goto L_0x0040
        L_0x003c:
            com.my.target.z6 r2 = r7.mo50895b()
        L_0x0040:
            r6.f19368g = r2
            goto L_0x002b
        L_0x0043:
            com.my.target.t4$e r2 = new com.my.target.t4$e
            com.my.target.a7 r3 = r6.f19364c
            r2.<init>(r3)
            r6.f19363b = r2
            com.my.target.a7 r2 = r6.f19364c
            r2.setInterstitialPromoViewListener(r0)
            com.my.target.a7 r2 = r6.f19364c
            android.view.View r2 = r2.getCloseButton()
            com.my.target.t4$a r3 = new com.my.target.t4$a
            r3.<init>(r6)
            r2.setOnClickListener(r3)
            com.my.target.z6 r2 = r6.f19368g
            r3 = 0
            if (r2 == 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
            com.my.target.-$$Lambda$plDRtsAvR3ScsvrqWiUeo_ZAtmA r5 = new com.my.target.-$$Lambda$plDRtsAvR3ScsvrqWiUeo_ZAtmA
            r5.<init>()
            com.my.target.m4 r7 = com.p243my.target.C7543m4.m19773a(r7, r1, r2, r9, r5)
            r6.f19371j = r7
            r7.mo50858a((com.p243my.target.C7413g2<com.p243my.target.common.models.VideoData>) r1, (android.content.Context) r10)
            boolean r7 = r1.isAutoPlay()
            if (r7 == 0) goto L_0x007d
            r6.f19373l = r3
        L_0x007d:
            com.my.target.a7 r7 = r6.f19364c
            r7.setBanner(r8)
            com.my.target.a7 r7 = r6.f19364c
            com.my.target.r1 r10 = r8.getClickArea()
            r7.setClickArea(r10)
            if (r1 == 0) goto L_0x0093
            boolean r7 = r1.isAutoPlay()
            if (r7 != 0) goto L_0x00cd
        L_0x0093:
            float r7 = r8.getAllowCloseDelay()
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r10
            long r1 = (long) r7
            r6.f19372k = r1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "banner will be allowed to close in "
            r7.append(r10)
            long r1 = r6.f19372k
            r7.append(r1)
            java.lang.String r10 = " millis"
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.p243my.target.C7374e0.m18989a(r7)
            long r1 = r6.f19372k
            r6.mo51577a((long) r1)
            goto L_0x00cd
        L_0x00c3:
            java.lang.String r7 = "banner is allowed to close"
            com.p243my.target.C7374e0.m18989a(r7)
            com.my.target.a7 r7 = r6.f19364c
            r7.mo49603d()
        L_0x00cd:
            java.util.List r7 = r8.getInterstitialAdCards()
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L_0x00e1
            com.my.target.j7 r10 = r6.f19369h
            if (r10 == 0) goto L_0x00e1
            com.my.target.j4 r7 = com.p243my.target.C7481j4.m19505a(r7, r10)
            r6.f19370i = r7
        L_0x00e1:
            com.my.target.j4 r7 = r6.f19370i
            if (r7 == 0) goto L_0x00e8
            r7.mo50593a((com.p243my.target.C7667t4.C7670c) r9)
        L_0x00e8:
            com.my.target.p1 r7 = r8.getAdChoices()
            if (r7 == 0) goto L_0x00f1
            r6.mo51578a(r0, r7)
        L_0x00f1:
            com.my.target.a7 r7 = r6.f19364c
            android.view.View r7 = r7.getView()
            r9.mo51334a((com.p243my.target.C7768z1) r8, (android.view.View) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7667t4.<init>(com.my.target.m7, com.my.target.f2, com.my.target.t4$c, android.content.Context):void");
    }

    /* renamed from: a */
    public static C7667t4 m20443a(C7552m7 m7Var, C7399f2 f2Var, C7670c cVar, Context context) {
        return new C7667t4(m7Var, f2Var, cVar, context);
    }

    /* renamed from: a */
    public void mo50705a() {
        if (this.f19371j == null) {
            long j = this.f19372k;
            if (j > 0) {
                mo51577a(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo51577a(long j) {
        this.f19365d.removeCallbacks(this.f19363b);
        this.f19373l = System.currentTimeMillis();
        this.f19365d.postDelayed(this.f19363b, j);
    }

    /* renamed from: a */
    public final void mo51578a(C7308a7.C7309a aVar, C7596p1 p1Var) {
        List<C7596p1.C7597a> a = p1Var.mo51315a();
        if (a != null) {
            C7432h0 a2 = C7432h0.m19222a(a);
            this.f19367f = a2;
            a2.mo50261a((C7409g0.C7411b) aVar);
        }
    }

    /* renamed from: b */
    public void mo50711b() {
        C7543m4 m4Var = this.f19371j;
        if (m4Var != null) {
            m4Var.mo50863e();
        }
        this.f19365d.removeCallbacks(this.f19363b);
        if (this.f19373l > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f19373l;
            if (currentTimeMillis > 0) {
                long j = this.f19372k;
                if (currentTimeMillis < j) {
                    this.f19372k = j - currentTimeMillis;
                    return;
                }
            }
            this.f19372k = 0;
        }
    }

    /* renamed from: c */
    public void mo51579c() {
        C7543m4 m4Var = this.f19371j;
        if (m4Var != null) {
            m4Var.mo50857a(this.f19362a);
            this.f19371j.mo50853a();
            this.f19371j = null;
        }
    }

    /* renamed from: d */
    public C7399f2 mo51580d() {
        return this.f19362a;
    }

    public void destroy() {
        this.f19365d.removeCallbacks(this.f19363b);
        C7543m4 m4Var = this.f19371j;
        if (m4Var != null) {
            m4Var.mo50853a();
        }
    }

    /* renamed from: e */
    public void mo50717e() {
        C7543m4 m4Var = this.f19371j;
        if (m4Var != null) {
            m4Var.mo50865g();
        }
    }

    /* renamed from: f */
    public C7543m4 mo51581f() {
        return this.f19371j;
    }

    /* renamed from: g */
    public C7670c mo51582g() {
        return this.f19366e;
    }

    public View getCloseButton() {
        return this.f19364c.getCloseButton();
    }

    /* renamed from: j */
    public View mo50719j() {
        return this.f19364c.getView();
    }
}

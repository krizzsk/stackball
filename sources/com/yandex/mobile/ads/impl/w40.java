package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.exo.C12227m;
import com.yandex.mobile.ads.exo.C12266p;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12333e;
import com.yandex.mobile.ads.impl.xk1;

public class w40 implements st0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12266p f41858a;

    /* renamed from: b */
    private final am0 f41859b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final tm1 f41860c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final rt0 f41861d = new rt0();

    /* renamed from: e */
    private final C15031b f41862e;

    /* renamed from: f */
    private final zm1 f41863f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final q40 f41864g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ok1 f41865h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public yk1 f41866i;

    /* renamed from: j */
    private boolean f41867j;

    /* renamed from: com.yandex.mobile.ads.impl.w40$b */
    private class C15031b implements C12227m.C12228a {

        /* renamed from: a */
        private boolean f41868a;

        /* renamed from: b */
        private int f41869b;

        /* renamed from: c */
        private boolean f41870c;

        /* renamed from: d */
        private boolean f41871d;

        private C15031b() {
            this.f41870c = false;
            this.f41871d = false;
        }

        /* renamed from: a */
        public /* synthetic */ void mo64984a(C12270q qVar, int i) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, qVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo64985a(TrackGroupArray trackGroupArray, C12333e eVar) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, trackGroupArray, eVar);
        }

        /* renamed from: a */
        public void mo64986a(k40 k40) {
            xk1 xk1;
            this.f41868a = false;
            w40.this.f41864g.mo69486b();
            w40.this.f41858a.mo65157b(false);
            w40.this.f41860c.mo70206a(k40 != null ? k40.getMessage() : null);
            if (w40.this.f41866i != null && w40.this.f41865h != null) {
                if (k40 != null) {
                    xk1 = w40.this.f41861d.mo69817b(k40);
                } else {
                    xk1 = new xk1(xk1.C15176a.UNKNOWN, new C15054wk());
                }
                w40.this.f41866i.mo67188a(w40.this.f41865h, xk1);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo64987a(sz0 sz0) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, sz0);
        }

        public void onIsPlayingChanged(boolean z) {
            if (z) {
                if (!this.f41868a) {
                    if (w40.this.f41866i != null && w40.this.f41865h != null) {
                        this.f41868a = true;
                        w40.this.f41866i.mo67195h(w40.this.f41865h);
                    }
                } else if (this.f41871d) {
                    this.f41871d = false;
                    if (w40.this.f41866i != null && w40.this.f41865h != null) {
                        w40.this.f41866i.mo67192e(w40.this.f41865h);
                    }
                }
            } else if (!this.f41870c) {
                this.f41871d = true;
                if (w40.this.f41866i != null && w40.this.f41865h != null) {
                    w40.this.f41866i.mo67190c(w40.this.f41865h);
                }
            }
        }

        public /* synthetic */ void onLoadingChanged(boolean z) {
            C12227m.C12228a.CC.$default$onLoadingChanged(this, z);
        }

        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C12227m.C12228a.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (this.f41869b != i) {
                this.f41869b = i;
                if (i == 3) {
                    w40.this.f41864g.mo69486b();
                    if (!(w40.this.f41866i == null || w40.this.f41865h == null)) {
                        w40.this.f41866i.mo67196i(w40.this.f41865h);
                    }
                    if (this.f41870c) {
                        this.f41870c = false;
                        if (w40.this.f41866i != null && w40.this.f41865h != null) {
                            w40.this.f41866i.mo67194g(w40.this.f41865h);
                        }
                    }
                } else if (i == 2) {
                    this.f41870c = true;
                    if (w40.this.f41866i != null && w40.this.f41865h != null) {
                        w40.this.f41866i.mo67191d(w40.this.f41865h);
                    }
                } else if (i == 4) {
                    this.f41868a = false;
                    if (w40.this.f41866i != null && w40.this.f41865h != null) {
                        w40.this.f41866i.mo67189b(w40.this.f41865h);
                    }
                }
            }
        }

        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C12227m.C12228a.CC.$default$onPositionDiscontinuity(this, i);
        }

        public /* synthetic */ void onSeekProcessed() {
            C12227m.C12228a.CC.$default$onSeekProcessed(this);
        }
    }

    public w40(C12266p pVar, am0 am0, tm1 tm1) {
        this.f41858a = pVar;
        this.f41859b = am0;
        this.f41860c = tm1;
        C15031b bVar = new C15031b();
        this.f41862e = bVar;
        pVar.mo65150a((C12227m.C12228a) bVar);
        zm1 zm1 = new zm1();
        this.f41863f = zm1;
        this.f41864g = new q40(bVar);
        pVar.mo65152a((im1) zm1);
    }

    /* renamed from: g */
    public void mo70646g() {
        if (!this.f41867j) {
            this.f41858a.mo65154a(false);
        }
    }

    /* renamed from: h */
    public void mo70647h() {
        if (!this.f41867j) {
            this.f41858a.mo65154a(true);
        }
    }

    /* renamed from: i */
    public void mo70648i() {
        if (!this.f41867j) {
            this.f41858a.mo65154a(true);
        }
    }

    /* renamed from: j */
    public void mo70649j() {
        ok1 ok1;
        if (!this.f41867j) {
            yk1 yk1 = this.f41866i;
            if (!(yk1 == null || (ok1 = this.f41865h) == null)) {
                yk1.mo67186a(ok1);
            }
            m43499d();
        }
    }

    /* renamed from: d */
    private void m43499d() {
        this.f41867j = true;
        this.f41864g.mo69486b();
        this.f41858a.mo65149a((TextureView) null);
        this.f41863f.mo71254a((TextureView) null);
        this.f41858a.mo65155b((C12227m.C12228a) this.f41862e);
        this.f41858a.mo65156b((im1) this.f41863f);
        this.f41858a.mo65160n();
    }

    /* renamed from: a */
    public void mo70637a(TextureView textureView) {
        if (!this.f41867j) {
            this.f41863f.mo71254a(textureView);
            this.f41858a.mo65149a(textureView);
        }
    }

    /* renamed from: b */
    public long mo70642b() {
        return this.f41858a.mo64919i();
    }

    /* renamed from: c */
    public float mo70643c() {
        return this.f41858a.mo65159m();
    }

    /* renamed from: e */
    public boolean mo70644e() {
        return this.f41867j;
    }

    /* renamed from: f */
    public boolean mo70645f() {
        return this.f41858a.mo64789k();
    }

    /* renamed from: a */
    public void mo70636a(float f) {
        ok1 ok1;
        if (!this.f41867j) {
            this.f41858a.mo65148a(f);
            yk1 yk1 = this.f41866i;
            if (yk1 != null && (ok1 = this.f41865h) != null) {
                yk1.mo67187a(ok1, f);
            }
        }
    }

    /* renamed from: a */
    public void mo70639a(fu0 fu0) {
        this.f41865h = fu0;
        if (!this.f41867j) {
            C12287f a = this.f41859b.mo65822a(fu0);
            this.f41858a.mo65154a(false);
            this.f41858a.mo65151a(a);
            this.f41864g.mo69485a();
        }
    }

    /* renamed from: a */
    public long mo70635a() {
        return this.f41858a.mo65158l();
    }

    /* renamed from: a */
    public void mo70641a(yk1 yk1) {
        this.f41866i = yk1;
    }

    /* renamed from: a */
    public void mo70638a(bn1 bn1) {
        if (!this.f41867j) {
            this.f41863f.mo71255a(bn1);
        }
    }

    /* renamed from: a */
    public void mo70640a(xk1 xk1) {
        if (!this.f41867j) {
            m43499d();
        }
    }
}

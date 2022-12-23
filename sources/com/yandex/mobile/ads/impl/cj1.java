package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.ln1;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class cj1 implements ln1 {

    /* renamed from: a */
    private final Context f31950a;

    /* renamed from: b */
    private final ck1<?> f31951b;

    /* renamed from: c */
    private final C13156g1 f31952c;

    /* renamed from: d */
    private final jn1 f31953d;

    /* renamed from: e */
    private C14165o4 f31954e;

    /* renamed from: f */
    private tl0 f31955f;

    /* renamed from: g */
    private C14861v1 f31956g;

    /* renamed from: h */
    private boolean f31957h;

    public cj1(Context context, ck1<?> ck1, C13156g1 g1Var, jn1 jn1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(g1Var, "adBreakPosition");
        Intrinsics.checkNotNullParameter(jn1, "eventsTracker");
        this.f31950a = context;
        this.f31951b = ck1;
        this.f31952c = g1Var;
        this.f31953d = jn1;
    }

    /* renamed from: a */
    public void mo65759a(xk1 xk1) {
        Intrinsics.checkNotNullParameter(this, "this");
        Intrinsics.checkNotNullParameter(xk1, "error");
    }

    /* renamed from: b */
    public void mo65760b() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: c */
    public void mo65761c() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: d */
    public void mo65762d() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70192a();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public void mo65763e() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70197c();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public void mo65764f() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70201g();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public void mo65765g() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70200f();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public void mo65766h() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70202h();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public void mo65767i() {
        C14165o4 o4Var = this.f31954e;
        if (o4Var != null) {
            try {
                if (!this.f31957h) {
                    o4Var.mo69105a();
                    this.f31954e = null;
                    this.f31955f = null;
                    this.f31956g = null;
                    this.f31957h = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public void mo65768j() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: k */
    public void mo65769k() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70194a(ih0.CLICK);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: l */
    public void mo65770l() {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70195b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: m */
    public void mo65771m() {
        C14861v1 v1Var = this.f31956g;
        if (v1Var != null) {
            try {
                if (!this.f31957h) {
                    v1Var.mo70435a();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: n */
    public void mo65772n() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public void mo65753a() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public static final void m34731a(cj1 cj1, wi1 wi1) {
        cj1.getClass();
        cj1.f31953d.mo68070a(wi1.mo70708b(), "verificationNotExecuted", MapsKt.mapOf(TuplesKt.m45515to("[REASON]", String.valueOf(wi1.mo70707a().mo70709a()))));
    }

    /* renamed from: a */
    public void mo65756a(View view, List<bk1> list) {
        q01 q01;
        ji1 ji1;
        t70 t70;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(list, "friendlyOverlays");
        mo65767i();
        this.f31957h = false;
        ck1<?> ck1 = this.f31951b;
        Unit unit = Unit.INSTANCE;
        try {
            Context context = this.f31950a;
            List<vi1> d = ck1.mo66325e().mo68457d();
            Intrinsics.checkNotNullExpressionValue(d, "videoAdInfo.vastVideoAd.adVerifications");
            vw0 a = new ww0(context, new bj1(this)).mo70768a(d);
            if (a != null) {
                C14165o4 b = a.mo70598b();
                b.mo69106a(view);
                Unit unit2 = Unit.INSTANCE;
                this.f31954e = b;
                this.f31955f = a.mo70599c();
                this.f31956g = a.mo70597a();
            }
        } catch (Exception unused) {
        }
        C14165o4 o4Var = this.f31954e;
        if (o4Var != null) {
            for (bk1 bk1 : list) {
                View c = bk1.mo66091c();
                if (c != null) {
                    Unit unit3 = Unit.INSTANCE;
                    try {
                        bk1.C12593a b2 = bk1.mo66090b();
                        Intrinsics.checkNotNullParameter(b2, "purpose");
                        int ordinal = b2.ordinal();
                        if (ordinal == 0) {
                            t70 = t70.VIDEO_CONTROLS;
                        } else if (ordinal == 1) {
                            t70 = t70.CLOSE_AD;
                        } else if (ordinal == 2) {
                            t70 = t70.NOT_VISIBLE;
                        } else if (ordinal == 3) {
                            t70 = t70.OTHER;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        o4Var.mo69107a(c, t70, bk1.mo66089a());
                    } catch (Exception unused2) {
                        continue;
                    }
                }
            }
        }
        C14165o4 o4Var2 = this.f31954e;
        if (o4Var2 != null) {
            try {
                if (!this.f31957h) {
                    o4Var2.mo69108b();
                }
            } catch (Exception unused3) {
            }
        }
        ck1<?> ck12 = this.f31951b;
        C14861v1 v1Var = this.f31956g;
        if (v1Var != null) {
            try {
                if (!this.f31957h) {
                    C13413ii a2 = ck12.mo66321a();
                    C13156g1 g1Var = this.f31952c;
                    SkipInfo a3 = new f91().mo66944a(a2);
                    int ordinal2 = g1Var.ordinal();
                    if (ordinal2 == 0) {
                        q01 = q01.PREROLL;
                    } else if (ordinal2 == 1) {
                        q01 = q01.MIDROLL;
                    } else if (ordinal2 != 2) {
                        q01 = q01.STANDALONE;
                    } else {
                        q01 = q01.POSTROLL;
                    }
                    if (a3 != null) {
                        ji1 = ji1.m37841a(((float) ((ig0) a3).getSkipOffset()) / 1000.0f, true, q01);
                    } else {
                        ji1 = ji1.m37842a(true, q01);
                    }
                    Intrinsics.checkNotNullExpressionValue(ji1, "create(videoAdInfo.creative, adBreakPosition)");
                    v1Var.mo70436a(ji1);
                }
            } catch (Exception unused4) {
            }
        }
    }

    /* renamed from: a */
    public void mo65755a(long j, float f) {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70193a(((float) j) / ((float) 1000), f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo65757a(ln1.C13869a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "quartile");
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        tl0.mo70198d();
                    } else if (ordinal == 1) {
                        tl0.mo70199e();
                    } else if (ordinal == 2) {
                        tl0.mo70203i();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo65754a(float f) {
        tl0 tl0 = this.f31955f;
        if (tl0 != null) {
            try {
                if (!this.f31957h) {
                    tl0.mo70196b(f);
                }
            } catch (Exception unused) {
            }
        }
    }
}

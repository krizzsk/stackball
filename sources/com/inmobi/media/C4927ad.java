package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C4955an;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ad */
/* compiled from: NativeUnifiedAdManager */
public class C4927ad extends C4937ag {

    /* renamed from: k */
    private static final String f11141k = C4927ad.class.getSimpleName();

    /* renamed from: l */
    private static final String f11142l = "InMobi";

    /* renamed from: m */
    private C4924ab f11143m;

    /* renamed from: a */
    public void mo39965a() {
    }

    public C4927ad(PublisherCallbacks publisherCallbacks) {
        this.f11167h = publisherCallbacks;
    }

    /* renamed from: a */
    public void mo39967a(C5003az azVar, Context context) {
        C4924ab abVar = this.f11143m;
        if (abVar == null) {
            this.f11143m = new C4924ab(context, new C4955an.C4957a("native", f11142l).mo40086a(azVar.f11350a).mo40094b(C5100d.m11598a(context)).mo40095c(azVar.f11351b).mo40090a(azVar.f11352c).mo40091a(azVar.f11353d).mo40092a(), this);
        } else {
            abVar.mo39952a(context);
            this.f11143m.mo40980a(C5100d.m11598a(context));
        }
        this.f11143m.mo40984a(azVar.f11352c);
    }

    /* renamed from: l */
    public boolean mo39974l() {
        C4924ab abVar = this.f11143m;
        return abVar != null && abVar.mo39951Z();
    }

    /* renamed from: m */
    public C5435p mo39975m() {
        return this.f11143m;
    }

    /* renamed from: a */
    public void mo39966a(final AdMetaInfo adMetaInfo) {
        this.f11169j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C4924ab abVar = this.f11143m;
        if (abVar == null) {
            mo40000a((C5435p) null, inMobiAdRequestStatus);
        } else if (abVar.mo41009v() == null) {
            mo40000a((C5435p) null, inMobiAdRequestStatus);
        } else {
            super.mo39966a(adMetaInfo);
            this.f11168i.post(new Runnable() {
                public final void run() {
                    if (C4927ad.this.f11167h != null) {
                        C4927ad.this.f11167h.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
            if (!mo39974l() && this.f11143m.mo40995d((byte) 1)) {
                this.f11143m.mo39949T();
            }
        }
    }

    /* renamed from: n */
    public void mo39976n() {
        if (this.f11166g == null || this.f11166g.booleanValue()) {
            this.f11166g = Boolean.TRUE;
            C4924ab abVar = this.f11143m;
            if (abVar != null && mo40006a(f11142l, abVar.mo41000j().toString(), this.f11167h)) {
                this.f11165f = 1;
                this.f11143m.mo39947B();
                return;
            }
            return;
        }
        C5327gw.m12263a((byte) 1, f11142l, "Cannot call load() API after calling load(byte[])");
    }

    /* renamed from: b */
    public void mo39969b(final AdMetaInfo adMetaInfo) {
        super.mo39969b(adMetaInfo);
        this.f11165f = 2;
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4927ad.this.f11167h != null) {
                    C4927ad.this.f11167h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: o */
    public void mo39977o() {
        C4924ab abVar = this.f11143m;
        if (abVar != null) {
            abVar.mo39950Y();
        }
        this.f11143m = null;
    }

    /* renamed from: p */
    public void mo39978p() {
        C4924ab abVar = this.f11143m;
        if (abVar == null) {
            C5327gw.m12263a((byte) 1, f11141k, "InMobiNative is not initialized. Ignoring takeAction");
        } else if (abVar.f12521h != null) {
            abVar.f12521h.mo40801u();
        }
    }

    /* renamed from: q */
    public void mo39979q() {
        C5331h t;
        C4924ab abVar = this.f11143m;
        if (abVar != null && abVar.mo41001k() == 4 && !(abVar.mo40999i() instanceof Activity) && (t = abVar.mo41007t()) != null) {
            ((C5397j) t).mo40800t();
        }
    }

    /* renamed from: r */
    public void mo39980r() {
        C5331h t;
        C4924ab abVar = this.f11143m;
        if (abVar != null && abVar.mo41001k() == 4 && !(abVar.mo40999i() instanceof Activity) && (t = abVar.mo41007t()) != null) {
            ((C5397j) t).mo40799s();
        }
    }

    /* renamed from: s */
    public JSONObject mo39981s() {
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null) {
            return new JSONObject();
        }
        C5331h t = abVar.mo41007t();
        if (t == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return null;
        }
        return bjVar.f11410i.f11422a;
    }

    /* renamed from: t */
    public String mo39982t() {
        C5331h t;
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return null;
        }
        return bjVar.f11410i.f11423b.f11426a;
    }

    /* renamed from: u */
    public String mo39983u() {
        C5331h t;
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return null;
        }
        return bjVar.f11410i.f11423b.f11427b;
    }

    /* renamed from: v */
    public String mo39984v() {
        C5331h t;
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return null;
        }
        return bjVar.f11410i.f11423b.f11428c;
    }

    /* renamed from: w */
    public String mo39985w() {
        C5331h t;
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return null;
        }
        return bjVar.f11410i.f11423b.f11431f;
    }

    /* renamed from: x */
    public String mo39986x() {
        C5331h t;
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return null;
        }
        return bjVar.f11410i.f11423b.f11429d;
    }

    /* renamed from: y */
    public float mo39987y() {
        C5331h t;
        C5016bj bjVar;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null || (bjVar = (C5016bj) t.getDataModel()) == null) {
            return 0.0f;
        }
        return bjVar.f11410i.f11423b.f11430e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (com.inmobi.media.C5016bj) r0.getDataModel();
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39988z() {
        /*
            r2 = this;
            com.inmobi.media.ab r0 = r2.f11143m
            r1 = 0
            if (r0 == 0) goto L_0x001f
            com.inmobi.media.h r0 = r0.mo41007t()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.getDataModel()
            com.inmobi.media.bj r0 = (com.inmobi.media.C5016bj) r0
            if (r0 == 0) goto L_0x001a
            com.inmobi.media.bj$a r0 = r0.f11410i
            com.inmobi.media.bj$a$a r0 = r0.f11423b
            boolean r0 = r0.f11432g
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x001f
            r0 = 1
            return r0
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4927ad.mo39988z():boolean");
    }

    /* renamed from: A */
    public Boolean mo39963A() {
        C5331h t;
        C4924ab abVar = this.f11143m;
        if (abVar == null || (t = abVar.mo41007t()) == null) {
            return null;
        }
        return Boolean.valueOf(t instanceof C5410k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (com.inmobi.media.C5397j) r0;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39964B() {
        /*
            r4 = this;
            com.inmobi.media.ab r0 = r4.f11143m
            if (r0 == 0) goto L_0x0022
            com.inmobi.media.h r0 = r0.mo41007t()
            if (r0 == 0) goto L_0x0022
            com.inmobi.media.j r0 = (com.inmobi.media.C5397j) r0
            com.inmobi.media.bj r1 = r0.mo40784k()
            if (r1 == 0) goto L_0x0022
            r2 = 0
            com.inmobi.media.bj$a r3 = r1.f11410i
            com.inmobi.media.bf r3 = r3.f11424c
            r0.mo40772a((android.view.View) r2, (com.inmobi.media.C5010bf) r3)
            com.inmobi.media.bj$a r1 = r1.f11410i
            com.inmobi.media.bf r1 = r1.f11424c
            r2 = 1
            r0.mo40773a((com.inmobi.media.C5010bf) r1, (boolean) r2)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4927ad.mo39964B():void");
    }

    /* renamed from: b */
    public void mo39970b(C5003az azVar, Context context) {
        if (this.f11143m == null) {
            mo39967a(azVar, context);
        }
        C4924ab abVar = this.f11143m;
        if (abVar != null) {
            abVar.f11136v = true;
        }
    }

    /* renamed from: e */
    public void mo39971e() {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4927ad.this.f11167h != null) {
                    C4927ad.this.f11167h.onAdImpressed();
                }
            }
        });
    }

    /* renamed from: h */
    public void mo39973h() {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4927ad.this.f11167h != null) {
                    C4927ad.this.f11167h.onVideoSkipped();
                }
            }
        });
    }

    /* renamed from: f */
    public void mo39972f() {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4927ad.this.f11167h != null) {
                    C4927ad.this.f11167h.onVideoCompleted();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo39968a(final boolean z) {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4927ad.this.f11167h != null) {
                    C4927ad.this.f11167h.onAudioStateChanged(z);
                }
            }
        });
    }
}

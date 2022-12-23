package com.inmobi.media;

import android.content.Context;
import com.google.common.base.Ascii;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C4955an;
import com.inmobi.media.C5435p;

/* renamed from: com.inmobi.media.z */
/* compiled from: InterstitialUnifiedAdManager */
public class C5475z extends C4937ag {

    /* renamed from: k */
    private static final String f12608k = C5475z.class.getSimpleName();

    /* renamed from: l */
    private static final String f12609l = "InMobi";

    /* renamed from: m */
    private C5471y f12610m;

    /* renamed from: n */
    private boolean f12611n;

    /* renamed from: o */
    private long f12612o;

    /* renamed from: d */
    private void m13005d(final AdMetaInfo adMetaInfo) {
        super.mo39969b(adMetaInfo);
        this.f11165f = 2;
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C5475z.this.f11167h != null) {
                    C5475z.this.f11167h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private void m13003a(boolean z, byte b) {
        C5471y yVar = this.f12610m;
        if (yVar != null) {
            yVar.mo40973a(this.f12612o, (int) b);
        }
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C5475z.this.f11167h != null) {
                    C5475z.this.f11167h.onAdDisplayFailed();
                }
                C5475z.this.m13008q();
            }
        });
        if (z) {
            this.f11165f = 6;
            C5471y yVar2 = this.f12610m;
            if (yVar2 != null) {
                yVar2.mo40955G();
            }
        }
    }

    /* renamed from: a */
    public void mo41077a(C5003az azVar, Context context) {
        if (this.f12610m == null) {
            this.f12610m = new C5471y(context, new C4955an.C4957a("int", f12609l).mo40086a(azVar.f11350a).mo40095c(azVar.f11351b).mo40090a(azVar.f11352c).mo40092a(), this);
        }
        this.f12610m.mo39952a(context);
        this.f12610m.mo40984a(azVar.f11352c);
        this.f12610m.mo40980a("activity");
        if (azVar.f11353d) {
            this.f12610m.mo39951Z();
        }
    }

    /* renamed from: a */
    public void mo39966a(final AdMetaInfo adMetaInfo) {
        this.f11169j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (this.f12610m == null) {
            mo40000a((C5435p) null, inMobiAdRequestStatus);
            return;
        }
        super.mo39966a(adMetaInfo);
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C5475z.this.f11167h != null) {
                    C5475z.this.f11167h.onAdFetchSuccessful(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: l */
    public void mo41078l() throws IllegalStateException {
        C5471y yVar = this.f12610m;
        if (yVar != null) {
            if (!yVar.mo39950Y() || this.f11169j == null) {
                if (this.f12611n) {
                    C5327gw.m12263a((byte) 1, f12609l, C4937ag.f11160b);
                    return;
                }
                C4948ah v = this.f12610m.mo41009v();
                boolean a = mo40005a(f12609l, this.f12610m.mo41000j().toString());
                if (v != null && this.f11169j != null && a) {
                    if (v.mo40042l()) {
                        this.f11165f = 8;
                        if (this.f12610m.mo40995d((byte) 1)) {
                            this.f12610m.mo39949T();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            m13005d(this.f11169j);
            return;
        }
        throw new IllegalStateException(C4937ag.f11162d);
    }

    /* renamed from: b */
    public final void mo39969b(AdMetaInfo adMetaInfo) {
        C5471y yVar = this.f12610m;
        if (yVar == null) {
            m13006d((C5435p) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        try {
            if (!m13004a(yVar, true) || this.f12611n) {
                this.f12610m.mo41070h(this);
            } else {
                m13005d(adMetaInfo);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo39965a() {
        C5471y yVar = this.f12610m;
        if (yVar != null) {
            yVar.mo40975a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: c */
    public final void mo40013c() {
        C5471y yVar = this.f12610m;
        if (yVar != null && !yVar.mo40969W()) {
            this.f11168i.post(new Runnable() {
                public final void run() {
                    if (C5475z.this.f11167h != null) {
                        C5475z.this.f11167h.onAdDismissed();
                    }
                }
            });
            this.f12610m.mo40955G();
            this.f11165f = 0;
            this.f11166g = null;
            this.f12610m.mo40970X();
        }
    }

    /* renamed from: m */
    public C5435p mo39975m() {
        return this.f12610m;
    }

    /* renamed from: a */
    public void mo41076a(PublisherCallbacks publisherCallbacks) {
        if (this.f11166g != null && !this.f11166g.booleanValue()) {
            C5327gw.m12263a((byte) 1, f12609l, "Cannot call load() API after calling load(byte[])");
        } else if (this.f12611n) {
            C5327gw.m12263a((byte) 1, f12609l, C4937ag.f11160b);
        } else {
            this.f11166g = Boolean.TRUE;
            C5471y yVar = this.f12610m;
            if (yVar != null && mo40006a(f12609l, yVar.mo41000j().toString(), publisherCallbacks)) {
                this.f11165f = 1;
                this.f11167h = publisherCallbacks;
                String str = f12608k;
                C5327gw.m12263a((byte) 2, str, "Fetching an Interstitial ad for placement id: " + this.f12610m.mo41000j().toString());
                this.f12610m.mo40979a((C5435p.C5453a) this);
                this.f12610m.mo39947B();
            }
        }
    }

    /* renamed from: n */
    public boolean mo41079n() {
        if (this.f12610m == null || 2 != this.f11165f) {
            return false;
        }
        try {
            if (!m13004a(this.f12610m, false) || this.f12610m.mo39950Y()) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public void mo41080o() {
        this.f12612o = System.currentTimeMillis();
        if (!m13007p()) {
            return;
        }
        if (!C5346hh.m12351h()) {
            C5471y yVar = this.f12610m;
            if (yVar != null) {
                m13006d(yVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED));
                this.f12610m.mo40955G();
                return;
            }
            return;
        }
        C5471y yVar2 = this.f12610m;
        if (yVar2 != null && yVar2.mo40995d((byte) 4)) {
            this.f12611n = true;
            try {
                if (m13004a(this.f12610m, true)) {
                    this.f12610m.mo41070h(this);
                } else {
                    this.f12610m.mo39949T();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: i */
    public void mo41028i() {
        C5435p m = mo39975m();
        if (m == null) {
            return;
        }
        if (m.mo41001k() == 6 || m.mo41001k() == 7) {
            C5471y yVar = this.f12610m;
            if (yVar != null) {
                yVar.mo40970X();
            }
            m.mo39958g((C5435p.C5453a) this);
            return;
        }
        m13003a(true, (byte) 45);
    }

    /* renamed from: j */
    public void mo41029j() {
        C5471y yVar = this.f12610m;
        if (yVar != null) {
            yVar.mo40975a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40011b(C5435p pVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!z) {
            m13006d(pVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: a */
    public final void mo40000a(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (inMobiAdRequestStatus == null || !InMobiAdRequestStatus.StatusCode.AD_ACTIVE.equals(inMobiAdRequestStatus.getStatusCode())) {
            super.mo40000a(pVar, inMobiAdRequestStatus);
        } else {
            mo40015c(pVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: c */
    public void mo40014c(AdMetaInfo adMetaInfo) {
        super.mo40014c(adMetaInfo);
        this.f12611n = false;
    }

    /* renamed from: a */
    private boolean m13004a(C5471y yVar, boolean z) throws IllegalStateException {
        C4948ah ahVar;
        C4958ao aoVar = yVar.f12530q;
        if (aoVar == null) {
            ahVar = null;
        } else {
            ahVar = aoVar.mo40108k();
        }
        if (ahVar != null) {
            return aoVar.mo40106i();
        }
        if (z) {
            m13006d(yVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
        throw new IllegalStateException("AdUnit doesn't have a current ad");
    }

    /* renamed from: d */
    private void m13006d(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        byte b = this.f11165f;
        if (b != 1) {
            if (b == 2) {
                C5327gw.m12263a((byte) 1, f12609l, "Unable to Show Ad, canShowAd Failed");
                m13003a(true, (byte) Ascii.f10100CR);
                return;
            } else if (b == 5) {
                C5327gw.m12263a((byte) 1, f12609l, "Ad will be dismissed, Internal error");
                C5471y yVar = this.f12610m;
                if (yVar != null) {
                    yVar.mo40970X();
                }
                m13008q();
                mo40013c();
                return;
            } else if (b != 8) {
                return;
            }
        }
        mo40015c(pVar, inMobiAdRequestStatus);
    }

    /* renamed from: p */
    private boolean m13007p() {
        byte b = this.f11165f;
        if (b != 1) {
            if (b == 5) {
                if (this.f12610m != null) {
                    C5327gw.m12263a((byte) 1, f12609l, C4937ag.f11159a + this.f12610m.mo41000j().toString());
                    m13003a(false, (byte) Ascii.f10109SI);
                }
                return false;
            } else if (b != 7) {
                if (!this.f12611n) {
                    return true;
                }
                C5327gw.m12263a((byte) 1, f12609l, C4937ag.f11160b);
                return false;
            }
        }
        C5327gw.m12263a((byte) 1, f12609l, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m13008q() {
        C5471y yVar = this.f12610m;
        if (yVar != null) {
            yVar.mo40997e((byte) 4);
        }
    }
}

package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C4955an;
import com.inmobi.media.C5435p;
import com.p243my.tracker.ads.AdFormat;

/* renamed from: com.inmobi.media.t */
/* compiled from: BannerUnifiedAdManager */
public class C5464t extends C4937ag {

    /* renamed from: k */
    private static final String f12584k = C5464t.class.getSimpleName();

    /* renamed from: l */
    private static final String f12585l = "InMobi";

    /* renamed from: m */
    private C5458s f12586m;

    /* renamed from: n */
    private C5458s f12587n;

    /* renamed from: o */
    private C5458s f12588o;

    /* renamed from: p */
    private C5458s f12589p;

    /* renamed from: a */
    public void mo41052a(Context context, C5003az azVar, String str) {
        C4955an a = new C4955an.C4957a(AdFormat.BANNER, f12585l).mo40094b(C5100d.m11598a(context)).mo40086a(azVar.f11350a).mo40095c(azVar.f11351b).mo40090a(azVar.f11352c).mo40089a(str).mo40091a(azVar.f11353d).mo40092a();
        C5458s sVar = this.f12586m;
        if (sVar == null || this.f12587n == null) {
            this.f12586m = new C5458s(context, a, this);
            this.f12587n = new C5458s(context, a, this);
            this.f12589p = this.f12586m;
            return;
        }
        sVar.mo40974a(context, a, (C5435p.C5453a) this);
        this.f12587n.mo40974a(context, a, (C5435p.C5453a) this);
    }

    /* renamed from: a */
    public final void mo39966a(final AdMetaInfo adMetaInfo) {
        this.f11169j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C5458s sVar = this.f12589p;
        if (sVar == null) {
            mo40000a((C5435p) null, inMobiAdRequestStatus);
        } else if (sVar.mo41009v() == null) {
            mo40000a((C5435p) null, inMobiAdRequestStatus);
        } else {
            super.mo39966a(adMetaInfo);
            this.f11168i.post(new Runnable() {
                public final void run() {
                    if (C5464t.this.f11167h != null) {
                        C5464t.this.f11167h.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo39969b(final AdMetaInfo adMetaInfo) {
        super.mo39969b(adMetaInfo);
        this.f11165f = 0;
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C5464t.this.f11167h != null) {
                    C5464t.this.f11167h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo40013c() {
        this.f11165f = 0;
        super.mo40013c();
    }

    /* renamed from: j */
    public void mo41029j() {
        C5435p m = mo39975m();
        if (m != null) {
            m.mo40975a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: l */
    public boolean mo41057l() {
        C5458s sVar;
        C5458s sVar2 = this.f12589p;
        if (sVar2 == null || sVar2.mo41001k() == 4 || this.f12589p.mo41001k() == 1 || this.f12589p.mo41001k() == 2 || ((sVar = this.f12588o) != null && sVar.mo41001k() == 7)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public C5435p mo39975m() {
        if (m12935x()) {
            return this.f12588o;
        }
        return this.f12589p;
    }

    /* renamed from: x */
    private boolean m12935x() {
        C5458s sVar = this.f12588o;
        if (sVar != null) {
            return sVar.mo41001k() == 4 || this.f12588o.mo41001k() == 7 || this.f12588o.mo41001k() == 6;
        }
        return false;
    }

    /* renamed from: a */
    public void mo41054a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        if (this.f11166g == null || this.f11166g.booleanValue()) {
            this.f11166g = Boolean.TRUE;
            C5458s sVar = this.f12589p;
            if (sVar != null && mo40006a(f12585l, sVar.mo41000j().toString(), publisherCallbacks)) {
                this.f11165f = 1;
                this.f11169j = null;
                this.f11167h = publisherCallbacks;
                this.f12589p.mo41038b(str);
                this.f12589p.mo41033a(z);
                return;
            }
            return;
        }
        C5327gw.m12263a((byte) 1, f12585l, "Cannot call load() API after calling load(byte[])");
    }

    /* renamed from: n */
    public void mo41058n() throws IllegalStateException {
        C5458s sVar = this.f12589p;
        if (sVar == null) {
            throw new IllegalStateException(C4937ag.f11162d);
        } else if (mo40005a(f12585l, sVar.mo41000j().toString())) {
            this.f11165f = 8;
            if (this.f12589p.mo40995d((byte) 1)) {
                this.f12589p.mo39949T();
            }
        }
    }

    /* renamed from: o */
    public void mo41059o() {
        C5458s sVar = this.f12589p;
        if (sVar != null) {
            sVar.mo40951C();
        }
    }

    /* renamed from: a */
    public void mo40004a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        if (this.f11166g == null || !this.f11166g.booleanValue()) {
            this.f11166g = Boolean.FALSE;
            this.f11165f = 1;
            if (this.f12589p != null) {
                C5458s sVar = this.f12588o;
                if (sVar == null || !sVar.mo40952D()) {
                    this.f11167h = publisherCallbacks;
                    this.f12589p.f12526m = false;
                    this.f12589p.mo40986a(bArr);
                    return;
                }
                return;
            }
            return;
        }
        C5327gw.m12263a((byte) 1, f12585l, "Cannot call load(byte[]) API after load() API is called");
    }

    /* renamed from: p */
    public void mo41060p() {
        C5458s sVar = this.f12588o;
        if (sVar == null) {
            this.f12588o = this.f12586m;
            this.f12589p = this.f12587n;
        } else if (sVar.equals(this.f12586m)) {
            this.f12588o = this.f12587n;
            this.f12589p = this.f12586m;
        } else if (this.f12588o.equals(this.f12587n)) {
            this.f12588o = this.f12586m;
            this.f12589p = this.f12587n;
        }
    }

    /* renamed from: a */
    public void mo41053a(RelativeLayout relativeLayout) {
        C5415m mVar;
        C5458s sVar = this.f12588o;
        if (sVar != null && (mVar = (C5415m) sVar.mo41007t()) != null) {
            C5098cz viewableAd = mVar.getViewableAd();
            if (this.f12588o.mo39950Y()) {
                mVar.mo40683a();
            }
            ViewGroup viewGroup = (ViewGroup) mVar.getParent();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View c = viewableAd.mo40372c();
            viewableAd.mo40370a(new View[0]);
            C5458s sVar2 = this.f12589p;
            if (sVar2 != null) {
                sVar2.mo41034aa();
            }
            if (viewGroup == null) {
                relativeLayout.addView(c, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(c, layoutParams);
            }
            this.f12589p.mo40955G();
        }
    }

    /* renamed from: q */
    public void mo41061q() {
        C5458s sVar = this.f12588o;
        if (sVar != null) {
            sVar.mo41035ab();
        }
    }

    /* renamed from: r */
    public void mo41062r() {
        C5458s sVar = this.f12588o;
        if (sVar != null) {
            sVar.mo41034aa();
        }
    }

    /* renamed from: a */
    public int mo41051a(int i, int i2) {
        C5458s sVar = this.f12589p;
        if (sVar != null) {
            return i < sVar.mo41003p().minimumRefreshInterval ? this.f12589p.mo41003p().minimumRefreshInterval : i;
        }
        return i2;
    }

    /* renamed from: s */
    public int mo41063s() {
        C5435p m = mo39975m();
        if (m != null) {
            return m.mo41003p().defaultRefreshInterval;
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo41055a(long j) {
        C5458s sVar = this.f12589p;
        if (sVar == null) {
            return false;
        }
        int i = sVar.mo41003p().minimumRefreshInterval;
        if (SystemClock.elapsedRealtime() - j >= ((long) (i * 1000))) {
            return true;
        }
        C5458s sVar2 = this.f12589p;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
        mo40015c(sVar2, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + i + " seconds"));
        String str = f12584k;
        C5327gw.m12263a((byte) 1, str, "Ad cannot be refreshed before " + i + " seconds (AdPlacement Id = " + this.f12589p.mo41000j().toString() + ")");
        return false;
    }

    /* renamed from: t */
    public boolean mo41064t() {
        C5458s sVar = this.f12588o;
        return sVar != null && sVar.mo39951Z();
    }

    /* renamed from: u */
    public void mo41065u() {
        C5458s sVar = this.f12586m;
        if (sVar != null) {
            sVar.mo41036ac();
        }
        C5458s sVar2 = this.f12587n;
        if (sVar2 != null) {
            sVar2.mo41036ac();
        }
    }

    /* renamed from: b */
    public boolean mo41056b(RelativeLayout relativeLayout) {
        if (this.f12588o == null) {
            return true;
        }
        C5458s sVar = this.f12589p;
        if ((sVar != null && sVar.mo41001k() == 4) || !this.f12588o.mo40969W()) {
            return true;
        }
        m12934c(relativeLayout);
        this.f12588o.mo40970X();
        return false;
    }

    /* renamed from: c */
    private void m12934c(RelativeLayout relativeLayout) {
        C5415m mVar;
        C5458s sVar = this.f12588o;
        if (sVar != null && (mVar = (C5415m) sVar.mo41007t()) != null) {
            C5098cz viewableAd = mVar.getViewableAd();
            if (this.f12588o.mo39950Y()) {
                mVar.mo40683a();
            }
            View c = viewableAd.mo40372c();
            viewableAd.mo40370a(new View[0]);
            ViewGroup viewGroup = (ViewGroup) mVar.getParent();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (viewGroup == null) {
                relativeLayout.addView(c, layoutParams);
                return;
            }
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo40000a(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (mo40016c(inMobiAdRequestStatus)) {
            C5458s sVar = this.f12588o;
            if (sVar != null && sVar.equals(pVar)) {
                this.f12588o.f12531r = true;
            }
            if (pVar != null) {
                pVar.mo40975a(inMobiAdRequestStatus);
                return;
            }
            return;
        }
        mo40015c(pVar, inMobiAdRequestStatus);
    }

    /* renamed from: b */
    public void mo40011b(C5435p pVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (2 == this.f11165f) {
            if (z) {
            }
        } else if (!z) {
            pVar.mo40970X();
            mo40015c(pVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: v */
    public void mo41066v() {
        C5458s sVar = this.f12586m;
        if (sVar != null) {
            sVar.mo41037ad();
        }
        C5458s sVar2 = this.f12587n;
        if (sVar2 != null) {
            sVar2.mo41037ad();
        }
    }

    /* renamed from: w */
    public void mo41067w() {
        mo41065u();
        C5458s sVar = this.f12586m;
        if (sVar != null) {
            sVar.mo40955G();
            this.f12586m = null;
        }
        C5458s sVar2 = this.f12587n;
        if (sVar2 != null) {
            sVar2.mo40955G();
            this.f12587n = null;
        }
        this.f12588o = null;
        this.f12589p = null;
        this.f11166g = null;
    }
}

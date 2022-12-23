package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5435p;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.inmobi.media.y */
/* compiled from: InterstitialAdUnit */
public class C5471y extends C5435p {

    /* renamed from: t */
    private static final String f12601t = C5471y.class.getSimpleName();

    /* renamed from: u */
    private int f12602u = 0;

    /* renamed from: v */
    private boolean f12603v = false;

    /* renamed from: w */
    private long f12604w;

    /* renamed from: l */
    public String mo39959l() {
        return "int";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final byte mo39960m() {
        return 1;
    }

    public C5471y(Context context, C4955an anVar, C5435p.C5453a aVar) {
        super(context, anVar, aVar);
        anVar.mo40070e();
        mo40974a(context, anVar, aVar);
        mo40980a("activity");
    }

    /* renamed from: u */
    public C5415m mo41008u() {
        C5415m u = super.mo41008u();
        if (this.f12603v && u != null) {
            u.mo40683a();
        }
        return u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12971aa() {
        /*
            r8 = this;
            boolean r0 = r8.mo40950A()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r0.<init>(r3)
            r3 = 39
            r8.mo40976a((com.inmobi.ads.InMobiAdRequestStatus) r0, (boolean) r2, (byte) r3)
            return r1
        L_0x0015:
            com.inmobi.media.p$a r0 = r8.mo41004q()
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            byte r3 = r8.mo41001k()
            java.lang.String r4 = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: "
            r5 = 2
            java.lang.String r6 = "InMobiInterstitial"
            if (r3 == r2) goto L_0x0086
            if (r3 == r5) goto L_0x005c
            r4 = 6
            if (r3 == r4) goto L_0x0031
            r4 = 7
            if (r3 == r4) goto L_0x0031
            r0 = 0
            goto L_0x009e
        L_0x0031:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: "
            r3.<init>(r4)
            com.inmobi.media.an r4 = r8.mo41000j()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.C5327gw.m12263a((byte) r2, (java.lang.String) r6, (java.lang.String) r3)
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE
            r3.<init>(r4)
            r4 = 15
            r8.mo40971a((byte) r4)
            if (r0 == 0) goto L_0x009d
            r0.mo40000a((com.inmobi.media.C5435p) r8, (com.inmobi.ads.InMobiAdRequestStatus) r3)
            goto L_0x009d
        L_0x005c:
            java.lang.String r3 = r8.mo41002o()
            java.lang.String r7 = "html"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0080
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            com.inmobi.media.an r3 = r8.mo41000j()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.C5327gw.m12263a((byte) r2, (java.lang.String) r6, (java.lang.String) r0)
            goto L_0x009d
        L_0x0080:
            if (r0 == 0) goto L_0x009d
            r8.mo40989b((com.inmobi.media.C5435p.C5453a) r0)
            goto L_0x009d
        L_0x0086:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            com.inmobi.media.an r3 = r8.mo41000j()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.C5327gw.m12263a((byte) r2, (java.lang.String) r6, (java.lang.String) r0)
        L_0x009d:
            r0 = 1
        L_0x009e:
            if (r0 == 0) goto L_0x00a1
            return r1
        L_0x00a1:
            r0 = 4
            byte r3 = r8.mo41001k()
            if (r0 != r3) goto L_0x00c5
            boolean r0 = r8.mo41005r()
            if (r0 == 0) goto L_0x00b2
            r8.mo40955G()
            goto L_0x00c5
        L_0x00b2:
            com.inmobi.media.p$a r0 = r8.mo41004q()
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "Listener was garbage collected. Unable to give callback"
            com.inmobi.media.C5327gw.m12263a((byte) r5, (java.lang.String) r6, (java.lang.String) r0)
            goto L_0x00c4
        L_0x00be:
            r8.mo40989b((com.inmobi.media.C5435p.C5453a) r0)
            r8.mo40992c((com.inmobi.media.C5435p.C5453a) r0)
        L_0x00c4:
            return r1
        L_0x00c5:
            r8.f12526m = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5471y.m12971aa():boolean");
    }

    /* renamed from: B */
    public void mo39947B() {
        if (m12971aa()) {
            super.mo39947B();
        }
    }

    /* renamed from: a */
    public void mo40986a(byte[] bArr) {
        if (m12971aa()) {
            super.mo40986a(bArr);
        }
    }

    /* renamed from: h */
    public void mo41070h(C5435p.C5453a aVar) {
        this.f12604w = System.currentTimeMillis();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (byte) 44);
            C5327gw.m12263a((byte) 1, "InMobiInterstitial", "Please ensure that you call show() on the UI thread");
        } else if (aVar == null) {
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!mo39950Y()) {
            C5327gw.m12263a((byte) 1, f12601t, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            mo40973a(this.f12604w, 50);
            aVar.mo39965a();
        } else {
            mo40979a(aVar);
            this.f12515b = 6;
            if (!TJAdUnitConstants.String.HTML.equals(mo41002o())) {
                this.f12532s.mo40658a(hashCode(), new C5470x(this, aVar));
            } else if (mo41005r()) {
                mo40973a(this.f12604w, 36);
                mo41072j(aVar);
                C5331h t = mo41007t();
                if (t != null) {
                    t.destroy();
                }
            } else {
                mo41071i(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo41071i(C5435p.C5453a aVar) {
        boolean ab = m12972ab();
        if (aVar == null) {
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!ab) {
            this.f12515b = 3;
            mo40973a(this.f12604w, 51);
            aVar.mo39965a();
        } else {
            aVar.mo40007b();
        }
    }

    /* renamed from: ab */
    private boolean m12972ab() {
        try {
            InMobiAdActivity.class.getSimpleName();
            C5331h t = mo41007t();
            if (t != null) {
                if (!"unknown".equals(t.getMarkupType())) {
                    int a = InMobiAdActivity.m11053a(t);
                    Intent intent = new Intent(mo40999i(), InMobiAdActivity.class);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", TJAdUnitConstants.String.HTML.equals(mo41002o()) ? 200 : ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                    C5314go.m12192a(mo40999i(), intent);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, "InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return false;
        }
    }

    /* renamed from: Y */
    public boolean mo39950Y() {
        return mo41001k() == 4;
    }

    /* renamed from: Z */
    public void mo39951Z() {
        C5331h t = mo41007t();
        if (t != null) {
            this.f12603v = true;
            t.mo40683a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final Integer mo41013z() {
        return Integer.valueOf(this.f12516c.minimumRefreshInterval);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39954a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.mo39954a(z, inMobiAdRequestStatus);
        if (mo41001k() == 2) {
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + mo41000j().toString());
            mo40965R();
        }
    }

    /* renamed from: T */
    public void mo39949T() {
        mo40956H();
        try {
            if (!mo40966S()) {
                mo40967U();
                String o = mo41002o();
                char c = 65535;
                int hashCode = o.hashCode();
                if (hashCode != -1084172778) {
                    if (hashCode == 3213227) {
                        if (o.equals(TJAdUnitConstants.String.HTML)) {
                            c = 0;
                        }
                    }
                } else if (o.equals("inmobiJson")) {
                    c = 1;
                }
                if (c == 0) {
                    this.f12523j.post(new Runnable() {
                        public final void run() {
                            C5471y.this.mo41011x();
                        }
                    });
                } else if (c != 1) {
                    mo41002o();
                }
            }
        } catch (IllegalStateException unused) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* renamed from: a */
    public void mo39953a(C4948ah ahVar, boolean z) {
        if (!z) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) Ascii.f10100CR);
            return;
        }
        try {
            super.mo39953a(ahVar, z);
        } catch (IllegalStateException unused) {
        }
        C4948ah v = mo41009v();
        if (v == null) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) Ascii.f10100CR);
        } else if (v.mo40035e()) {
            this.f12524k = true;
            mo40963O();
        } else {
            mo40988b(v);
        }
    }

    /* renamed from: b */
    public void mo39955b(C4955an anVar, boolean z) {
        super.mo39955b(anVar, z);
        if (!z) {
            if (!mo41000j().equals(anVar)) {
                return;
            }
            if (2 == mo41001k() || 4 == mo41001k()) {
                this.f12515b = 0;
                mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (byte) Ascii.f10100CR);
            }
        } else if (mo41000j().equals(anVar) && 2 == mo41001k()) {
            if (this.f12524k) {
                this.f12525l = true;
                mo40964P();
                return;
            }
            mo39948Q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo39948Q() {
        mo40961M();
        this.f12515b = 4;
        C5435p.C5453a q = mo41004q();
        if (q != null && q.mo41027g()) {
            mo40992c(q);
        }
    }

    /* renamed from: I */
    public void mo40957I() {
        super.mo40957I();
        if (mo41001k() == 2) {
            mo40997e((byte) 2);
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + mo41000j().toString());
            mo40953E();
            mo39948Q();
        }
    }

    /* renamed from: J */
    public void mo40958J() {
        super.mo40958J();
        if (mo41001k() == 2) {
            mo40997e((byte) 2);
            this.f12515b = 3;
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + mo41000j().toString());
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo40959K() {
        if (2 == mo41001k()) {
            mo40997e((byte) 2);
            this.f12515b = 3;
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + mo41000j().toString());
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    /* renamed from: c */
    public synchronized void mo40817c(C5415m mVar) {
        super.mo40817c(mVar);
        this.f12523j.post(new Runnable() {
            public final void run() {
                C5471y yVar = C5471y.this;
                yVar.mo39957f(yVar.mo41004q());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo39957f(C5435p.C5453a aVar) {
        if (mo41001k() == 6) {
            int i = this.f12602u + 1;
            this.f12602u = i;
            if (i == 1) {
                C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + mo41000j().toString());
                if (aVar != null) {
                    if (mo41002o().equals(TJAdUnitConstants.String.HTML) && !mo40968V()) {
                        mo40822f();
                    }
                    mo40994d(aVar);
                    return;
                }
                return;
            }
            this.f12515b = 7;
        } else if (mo41001k() == 7) {
            this.f12602u++;
        }
    }

    /* renamed from: d */
    public synchronized void mo40819d(C5415m mVar) {
        super.mo40819d(mVar);
        this.f12523j.post(new Runnable() {
            public final void run() {
                C5471y yVar = C5471y.this;
                yVar.mo39958g(yVar.mo41004q());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo39958g(C5435p.C5453a aVar) {
        if (mo41001k() == 7) {
            int i = this.f12602u - 1;
            this.f12602u = i;
            if (i == 1) {
                this.f12515b = 6;
            }
        } else if (mo41001k() == 6) {
            this.f12602u--;
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + mo41000j().toString());
            if (aVar != null) {
                aVar.mo40013c();
            } else {
                C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    /* renamed from: L */
    public boolean mo40960L() {
        return 2 == mo41001k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo40965R() {
        C5435p.C5453a q = mo41004q();
        if (q != null) {
            mo40989b(q);
        }
    }

    /* renamed from: a */
    public void mo40980a(String str) {
        super.mo40980a("activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo40956H() {
        super.mo40956H();
        this.f12602u = 0;
    }

    /* renamed from: g */
    public void mo40823g() {
        Activity fullScreenActivity;
        super.mo40823g();
        C5331h t = mo41007t();
        if ((t instanceof C5415m) && (fullScreenActivity = ((C5415m) t).getFullScreenActivity()) != null) {
            this.f12531r = true;
            fullScreenActivity.finish();
        }
    }

    /* renamed from: G */
    public void mo40955G() {
        super.mo40955G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo41072j(C5435p.C5453a aVar) {
        this.f12515b = 0;
        if (aVar != null) {
            aVar.mo39965a();
        } else {
            C5327gw.m12263a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }
}

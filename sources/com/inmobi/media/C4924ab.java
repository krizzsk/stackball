package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5435p;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.ab */
/* compiled from: NativeAdUnit */
public final class C4924ab extends C5435p {

    /* renamed from: t */
    public static final String f11134t = C4924ab.class.getSimpleName();

    /* renamed from: u */
    public WeakReference<View> f11135u;

    /* renamed from: v */
    public boolean f11136v = false;

    /* renamed from: w */
    private int f11137w = 0;

    /* renamed from: l */
    public final String mo39959l() {
        return "native";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final byte mo39960m() {
        return 0;
    }

    C4924ab(Context context, C4955an anVar, C5435p.C5453a aVar) {
        super(context, anVar, aVar);
        anVar.mo40070e();
        mo40974a(context, anVar, aVar);
    }

    /* renamed from: a */
    public final void mo39952a(Context context) {
        super.mo39952a(context);
        m11067b(context);
    }

    /* renamed from: aa */
    private boolean m11066aa() {
        C5435p.C5453a q = mo41004q();
        if (mo40950A()) {
            if (q != null) {
                q.mo40000a((C5435p) this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
            return false;
        } else if (1 == mo41001k() || 2 == mo41001k()) {
            C5327gw.m12263a((byte) 1, f11134t, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return false;
        } else {
            String str = f11134t;
            C5327gw.m12263a((byte) 2, str, "Fetching a Native ad for placement id: " + mo41000j().toString());
            if (4 == mo41001k()) {
                if (!mo41005r()) {
                    if (q != null) {
                        m11067b(mo40999i());
                        mo40989b(q);
                        mo40992c(q);
                    }
                    return false;
                }
                mo39950Y();
            }
            this.f12526m = false;
            return true;
        }
    }

    /* renamed from: b */
    private void m11067b(Context context) {
        C5331h t = mo41007t();
        if (t instanceof C5397j) {
            ((C5397j) t).mo40770a(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo39955b(C4955an anVar, boolean z) {
        super.mo39955b(anVar, z);
        if (!z) {
            if (!mo41000j().equals(anVar)) {
                return;
            }
            if (2 == mo41001k() || 4 == mo41001k()) {
                this.f12515b = 0;
                if (mo41004q() != null) {
                    mo41004q().mo40000a((C5435p) this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                }
            }
        } else if (mo41000j().equals(anVar) && 2 == mo41001k() && mo41004q() != null && mo40999i() != null) {
            if (this.f12524k) {
                this.f12525l = true;
                mo40964P();
                return;
            }
            mo39948Q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo39956b(C4958ao aoVar) {
        if (TJAdUnitConstants.String.HTML.equals(mo41002o())) {
            mo40977a(mo41000j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            super.mo39956b(aoVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39954a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5435p.C5453a q;
        super.mo39954a(z, inMobiAdRequestStatus);
        if (mo41001k() == 2 && (q = mo41004q()) != null) {
            mo40989b(q);
        }
    }

    /* renamed from: T */
    public final void mo39949T() {
        mo40956H();
        try {
            if (!mo40966S()) {
                mo40967U();
            }
        } catch (IllegalStateException unused) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|(2:9|10)(4:11|(2:13|(1:15))(1:16)|17|(2:19|23)(1:24))) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        mo40976a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) com.google.common.base.Ascii.f10100CR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[Catch:{ Exception -> 0x0042 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39953a(com.inmobi.media.C4948ah r3, boolean r4) {
        /*
            r2 = this;
            r0 = 13
            r1 = 1
            if (r4 != 0) goto L_0x0010
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r3.<init>(r4)
            r2.mo40976a((com.inmobi.ads.InMobiAdRequestStatus) r3, (boolean) r1, (byte) r0)
            return
        L_0x0010:
            super.mo39953a((com.inmobi.media.C4948ah) r3, (boolean) r4)     // Catch:{ IllegalStateException -> 0x0013 }
        L_0x0013:
            com.inmobi.media.ah r3 = r2.mo41009v()     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0024
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus     // Catch:{ Exception -> 0x0042 }
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR     // Catch:{ Exception -> 0x0042 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0042 }
            r2.mo40976a((com.inmobi.ads.InMobiAdRequestStatus) r3, (boolean) r1, (byte) r0)     // Catch:{ Exception -> 0x0042 }
            return
        L_0x0024:
            byte r4 = r2.f12522i     // Catch:{ Exception -> 0x0042 }
            if (r4 != 0) goto L_0x0033
            boolean r4 = r3.mo40035e()     // Catch:{ Exception -> 0x0042 }
            if (r4 != 0) goto L_0x0036
            r4 = 0
            r2.mo40998f((com.inmobi.media.C5415m) r4)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0036
        L_0x0033:
            r2.mo40988b((com.inmobi.media.C4948ah) r3)     // Catch:{ Exception -> 0x0042 }
        L_0x0036:
            boolean r3 = r3.mo40035e()     // Catch:{ Exception -> 0x0042 }
            if (r3 == 0) goto L_0x0041
            r2.f12524k = r1     // Catch:{ Exception -> 0x0042 }
            r2.mo40963O()     // Catch:{ Exception -> 0x0042 }
        L_0x0041:
            return
        L_0x0042:
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r3.<init>(r4)
            r2.mo40976a((com.inmobi.ads.InMobiAdRequestStatus) r3, (boolean) r1, (byte) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4924ab.mo39953a(com.inmobi.media.ah, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo39948Q() {
        this.f12532s.mo40658a(hashCode(), new C4926ac(this));
    }

    /* renamed from: Y */
    public final void mo39950Y() {
        try {
            super.mo40955G();
            this.f12518e = null;
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, "InMobi", "Could not destroy native ad; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: Z */
    public final boolean mo39951Z() {
        return mo41001k() == 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Map<String, String> mo39961n() {
        Map<String, String> n = super.mo39961n();
        n.put("a-parentViewWidth", String.valueOf(C5343hf.m12333a().f12240a));
        n.put("a-productVersion", "NS-1.0.0-20160411");
        n.put("trackerType", "url_ping");
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo39957f(C5435p.C5453a aVar) {
        if (mo41001k() == 4) {
            this.f12515b = 6;
        } else if (mo41001k() == 6) {
            this.f11137w++;
        }
        C5327gw.m12263a((byte) 2, "InMobi", "Successfully displayed fullscreen for placement id: " + mo41000j().toString());
        if (this.f11137w != 0) {
            return;
        }
        if (aVar != null) {
            mo40994d(aVar);
        } else {
            C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo39958g(C5435p.C5453a aVar) {
        if (mo41001k() == 6) {
            int i = this.f11137w;
            if (i > 0) {
                this.f11137w = i - 1;
            } else {
                this.f12515b = 4;
            }
        }
        C5327gw.m12263a((byte) 2, "InMobi", "Successfully dismissed fullscreen for placement id: " + mo41000j().toString());
        if (this.f11137w != 0 || mo41001k() != 4) {
            return;
        }
        if (aVar != null) {
            aVar.mo40013c();
        } else {
            C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* renamed from: B */
    public final void mo39947B() {
        if (!this.f12526m && m11066aa()) {
            super.mo39947B();
        }
    }
}

package com.inmobi.media;

import com.appsflyer.internal.referrer.Payload;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5435p;
import com.smaato.sdk.video.vast.model.C8937Ad;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.w */
/* compiled from: GetSignalsWorker */
final class C5469w extends C4935af<byte[]> {

    /* renamed from: a */
    private final WeakReference<C5435p> f12595a;

    /* renamed from: b */
    private C5007bc f12596b;

    /* renamed from: c */
    private final long f12597c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39945a(Object obj) {
        byte[] bArr = (byte[]) obj;
        C5435p pVar = (C5435p) this.f12595a.get();
        if (pVar != null) {
            if (this.f12596b != null) {
                pVar.f12515b = 3;
            }
            C5435p.C5453a q = pVar.mo41004q();
            if (q != null) {
                if (this.f12596b != null) {
                    pVar.mo40972a(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.equals(this.f12596b.f11357a.getStatusCode()) ? 9 : 21, this.f12597c);
                    q.mo40008b(new InMobiAdRequestStatus(this.f12596b.f11357a.getStatusCode()));
                } else if (bArr == null) {
                    pVar.f12515b = 3;
                    pVar.mo40972a(13, this.f12597c);
                    q.mo40008b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                } else {
                    long j = this.f12597c;
                    pVar.f12527n = false;
                    HashMap hashMap = new HashMap();
                    hashMap.put(C8937Ad.AD_TYPE, pVar.mo39959l());
                    hashMap.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - j));
                    hashMap.put("networkType", C5342he.m12330b());
                    pVar.mo40993c("AdGetSignalsSucceeded", hashMap);
                    q.mo40003a(bArr);
                }
            }
        }
    }

    C5469w(C5435p pVar, long j) {
        super(pVar, (byte) 2);
        this.f12595a = new WeakReference<>(pVar);
        this.f12597c = j;
    }

    /* renamed from: b */
    public final void mo39946b() {
        C5435p.C5453a q;
        super.mo39946b();
        C5435p pVar = (C5435p) this.f12595a.get();
        if (pVar != null && (q = pVar.mo41004q()) != null) {
            q.mo40008b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C5435p pVar = (C5435p) this.f12595a.get();
        if (pVar == null || pVar.f12528o == null) {
            mo39995b(null);
        } else if (pVar.mo41004q() == null) {
            mo39995b(null);
        } else {
            try {
                C5034bu buVar = pVar.f12528o;
                buVar.f11485b = new C5035bv(buVar.f11484a);
                C5035bv bvVar = buVar.f11485b;
                C5037bx F = bvVar.f11486a.mo40954F();
                bvVar.f11486a.mo41010w();
                HashMap hashMap = new HashMap();
                hashMap.put("h-user-agent", C5314go.m12216i());
                F.mo40618c(hashMap);
                F.mo40207a();
                if (((C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null)).mo40585i()) {
                    throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED));
                } else if (F.f12139r == 1) {
                    mo39995b(F.mo40622g().getBytes());
                } else {
                    throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED));
                }
            } catch (C5007bc e) {
                this.f12596b = e;
                mo39995b(null);
            }
        }
    }
}

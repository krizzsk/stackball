package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5435p;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.q */
/* compiled from: AuctionCloseWorker */
final class C5455q extends C4935af<InMobiAdRequestStatus> {

    /* renamed from: a */
    private final WeakReference<C5435p> f12568a;

    /* renamed from: b */
    private final JSONObject f12569b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39945a(Object obj) {
        C5435p.C5453a q;
        InMobiAdRequestStatus inMobiAdRequestStatus = (InMobiAdRequestStatus) obj;
        C5435p pVar = (C5435p) this.f12568a.get();
        if (pVar != null && (q = pVar.mo41004q()) != null) {
            if (inMobiAdRequestStatus == null) {
                pVar.f12515b = 2;
                pVar.mo40989b(q);
                return;
            }
            q.mo39999a(inMobiAdRequestStatus);
        }
    }

    C5455q(C5435p pVar, JSONObject jSONObject) {
        super(pVar, (byte) 4);
        this.f12568a = new WeakReference<>(pVar);
        this.f12569b = jSONObject;
    }

    /* renamed from: b */
    public final void mo39946b() {
        C5435p.C5453a q;
        super.mo39946b();
        C5435p pVar = (C5435p) this.f12568a.get();
        if (pVar != null && (q = pVar.mo41004q()) != null) {
            q.mo39999a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C5435p pVar = (C5435p) this.f12568a.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (pVar == null || pVar.f12530q == null) {
            mo39995b(inMobiAdRequestStatus);
            return;
        }
        try {
            pVar.f12530q.mo40098a(this.f12569b, pVar.f12516c);
            mo39995b(null);
        } catch (Exception unused) {
            String str = C5435p.f12510a;
            mo39995b(inMobiAdRequestStatus);
        }
    }
}

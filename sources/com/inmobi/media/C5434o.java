package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5435p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.o */
/* compiled from: AdFetcherTask */
final class C5434o extends C4935af<C4958ao> {

    /* renamed from: a */
    private final WeakReference<C5435p> f12508a;

    /* renamed from: b */
    private C5007bc f12509b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39945a(Object obj) {
        C4958ao aoVar = (C4958ao) obj;
        C5435p pVar = (C5435p) this.f12508a.get();
        if (pVar != null) {
            pVar.mo40997e((byte) 0);
            if (this.f12509b != null) {
                pVar.mo40977a(pVar.mo41000j(), this.f12509b.f11357a);
            } else if (aoVar == null) {
                pVar.mo40977a(pVar.mo41000j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (aoVar.mo40100c()) {
                pVar.mo40978a(aoVar);
            } else if (!pVar.f12526m && pVar.mo40999i() != null && pVar.mo41001k() == 1) {
                pVar.f12530q = aoVar;
                C5435p.C5453a q = pVar.mo41004q();
                if (q != null) {
                    q.mo41026a(pVar.f12529p, aoVar);
                }
            }
        }
    }

    C5434o(C5435p pVar) {
        super(pVar, (byte) 0);
        this.f12508a = new WeakReference<>(pVar);
    }

    /* renamed from: b */
    public final void mo39946b() {
        super.mo39946b();
        C5435p pVar = (C5435p) this.f12508a.get();
        if (pVar != null) {
            pVar.mo40977a(pVar.mo41000j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C5435p pVar = (C5435p) this.f12508a.get();
        if (pVar == null) {
            this.f12509b = new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            mo39995b(null);
            return;
        }
        boolean z = true;
        if (!((C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null)).mo40585i()) {
            pVar.f12519f = System.currentTimeMillis();
            try {
                C4960ap s = pVar.mo41006s();
                C5037bx F = pVar.mo40954F();
                Integer z2 = pVar.mo41013z();
                if (z2 != null) {
                    if (SystemClock.elapsedRealtime() - s.f11248c >= ((long) (z2.intValue() * 1000))) {
                        z = false;
                    }
                    if (z) {
                        throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST));
                    }
                }
                C4960ap.m11249a(F);
                s.f11248c = SystemClock.elapsedRealtime();
                C5038by a = new C5036bw(F).mo40206a();
                if (a == null) {
                    throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                } else if (a.f11499a.f12145a == null) {
                    mo39995b(s.mo40110a(a, F.f11496e));
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(a.f11499a.f12145a.f12120a));
                    s.mo40112a((Map<String, Object>) hashMap);
                    throw new C5007bc(a.f11500b);
                }
            } catch (C5007bc e) {
                String str = C5435p.f12510a;
                this.f12509b = e;
                mo39995b(null);
            }
        } else {
            C5327gw.m12263a((byte) 1, C5435p.f12510a, "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
            this.f12509b = new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED));
            mo39995b(null);
        }
    }
}

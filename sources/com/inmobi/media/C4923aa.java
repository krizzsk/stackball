package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.aa */
/* compiled from: LoadWithResponseWorker */
final class C4923aa extends C4935af<C4958ao> {

    /* renamed from: a */
    private final WeakReference<C5034bu> f11130a;

    /* renamed from: b */
    private byte[] f11131b;

    /* renamed from: c */
    private long f11132c;

    /* renamed from: d */
    private byte f11133d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39945a(Object obj) {
        C4958ao aoVar = (C4958ao) obj;
        C5034bu buVar = (C5034bu) this.f11130a.get();
        if (buVar == null) {
            return;
        }
        if (aoVar == null) {
            buVar.f11484a.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, this.f11133d);
        } else {
            buVar.f11484a.mo40991c(aoVar);
        }
    }

    C4923aa(C5435p pVar, C5034bu buVar, byte[] bArr, long j) {
        super(pVar, (byte) 3);
        this.f11130a = new WeakReference<>(buVar);
        this.f11131b = bArr;
        this.f11132c = j;
    }

    /* renamed from: b */
    public final void mo39946b() {
        super.mo39946b();
        C5034bu buVar = (C5034bu) this.f11130a.get();
        if (buVar != null) {
            buVar.f11484a.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (byte) 40);
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C5034bu buVar = (C5034bu) this.f11130a.get();
        if (buVar == null) {
            mo39995b(null);
            return;
        }
        byte[] bArr = this.f11131b;
        C5300gd gdVar = new C5300gd();
        gdVar.mo40626b(bArr);
        try {
            JSONObject jSONObject = new JSONObject(new C5038by((C5037bx) null, gdVar).f11499a.mo40625b());
            if (this.f11132c == jSONObject.getLong(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID)) {
                mo39995b(buVar.f11484a.mo41006s().mo40111a(jSONObject, (C5074ck) null));
                return;
            }
            C5327gw.m12263a((byte) 1, "InMobi", "Placement Id of Request and response doesn't match");
            this.f11133d = 46;
            throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } catch (C5007bc | JSONException unused) {
            String str = C5435p.f12510a;
            this.f11133d = 1;
            mo39995b(null);
        }
    }
}

package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ae */
/* compiled from: ParseAdResponseWorker */
final class C4934ae extends C4935af<Boolean> {

    /* renamed from: a */
    private final WeakReference<C5435p> f11153a;

    /* renamed from: b */
    private final C4948ah f11154b;

    /* renamed from: c */
    private final boolean f11155c;

    /* renamed from: d */
    private InMobiAdRequestStatus f11156d;

    C4934ae(C5435p pVar, C4948ah ahVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super(pVar, (byte) 1);
        this.f11153a = new WeakReference<>(pVar);
        this.f11154b = ahVar;
        this.f11155c = z;
        this.f11156d = inMobiAdRequestStatus;
    }

    /* renamed from: b */
    public final void mo39946b() {
        super.mo39946b();
        this.f11156d = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        mo39945a(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo39945a(Boolean bool) {
        C5435p pVar = (C5435p) this.f11153a.get();
        if (pVar == null) {
            return;
        }
        if (this.f11155c) {
            pVar.mo40990b(bool.booleanValue(), this.f11156d);
        } else {
            pVar.mo39954a(bool.booleanValue(), this.f11156d);
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C5435p pVar = (C5435p) this.f11153a.get();
        if (pVar == null) {
            mo39995b(Boolean.FALSE);
        } else {
            mo39995b(Boolean.valueOf(pVar.mo40987a(this.f11154b)));
        }
    }
}

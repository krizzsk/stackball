package com.inmobi.media;

import com.inmobi.media.C5120dk;
import com.inmobi.media.C5220ev;

/* renamed from: com.inmobi.media.dj */
/* compiled from: PollingVisibilityTracker */
class C5119dj extends C5120dk {

    /* renamed from: a */
    C5220ev.C5234k f11739a;

    C5119dj(C5120dk.C5121a aVar, C5220ev.C5234k kVar) {
        super(aVar);
        this.f11739a = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo40377a() {
        C5220ev.C5234k kVar = this.f11739a;
        if (kVar == null) {
            return 100;
        }
        return kVar.visibilityThrottleMillis;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40378b() {
        mo40404h();
    }
}

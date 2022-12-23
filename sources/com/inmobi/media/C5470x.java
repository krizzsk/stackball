package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5435p;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.x */
/* compiled from: IntLoadMarkupInContainerNative */
final class C5470x extends C4935af<Boolean> {

    /* renamed from: a */
    private final WeakReference<C5471y> f12598a;

    /* renamed from: b */
    private final WeakReference<C5435p.C5453a> f12599b;

    /* renamed from: c */
    private byte f12600c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39945a(Object obj) {
        C5435p.C5453a aVar;
        Boolean bool = (Boolean) obj;
        C5471y yVar = (C5471y) this.f12598a.get();
        if (yVar != null && (aVar = (C5435p.C5453a) this.f12599b.get()) != null) {
            if (bool.booleanValue()) {
                C5331h t = yVar.mo41007t();
                C5415m N = yVar.mo40962N();
                if (N != null) {
                    if (t instanceof C5397j) {
                        C5397j jVar = (C5397j) t;
                        jVar.f12392u = N;
                        jVar.f12393v = yVar.f12522i;
                    } else {
                        yVar.mo41072j(aVar);
                    }
                }
                yVar.mo41071i(aVar);
                return;
            }
            byte b = this.f12600c;
            if (b != 0) {
                yVar.mo40983a(this.f12599b, b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else {
                yVar.mo41072j(aVar);
            }
        }
    }

    C5470x(C5471y yVar, C5435p.C5453a aVar) {
        super(yVar, (byte) 5);
        this.f12598a = new WeakReference<>(yVar);
        this.f12599b = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public final void mo39946b() {
        super.mo39946b();
        C5471y yVar = (C5471y) this.f12598a.get();
        if (yVar != null && ((C5435p.C5453a) this.f12599b.get()) != null) {
            yVar.mo40983a(this.f12599b, (byte) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C5471y yVar = (C5471y) this.f12598a.get();
        if (yVar == null) {
            mo39995b(Boolean.FALSE);
            return;
        }
        C5435p.C5453a aVar = (C5435p.C5453a) this.f12599b.get();
        if (aVar == null) {
            mo39995b(Boolean.FALSE);
            return;
        }
        C4948ah v = yVar.mo41009v();
        boolean z = true;
        if (v != null && !v.mo40031a(yVar.f12516c.mo40556a(yVar.mo39959l()).timeToLive)) {
            byte e = yVar.mo40996e(aVar);
            this.f12600c = e;
            if (e != 0) {
                z = false;
            }
            mo39995b(Boolean.valueOf(z));
            return;
        }
        mo39995b(Boolean.FALSE);
    }
}

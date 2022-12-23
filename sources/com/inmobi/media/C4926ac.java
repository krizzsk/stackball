package com.inmobi.media;

import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5435p;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ac */
/* compiled from: NativeLoadMarkupInContainerNative */
final class C4926ac extends C4935af<Byte> {

    /* renamed from: a */
    private final WeakReference<C4924ab> f11140a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39945a(Object obj) {
        Byte b = (Byte) obj;
        C4924ab abVar = (C4924ab) this.f11140a.get();
        if (abVar != null) {
            if (b.byteValue() != 0) {
                abVar.mo40983a((WeakReference<C5435p.C5453a>) new WeakReference(abVar.mo41004q()), b.byteValue(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (2 == abVar.mo41001k()) {
                abVar.f12515b = 4;
                C5331h t = abVar.mo41007t();
                C5415m N = abVar.mo40962N();
                C5435p.C5453a q = abVar.mo41004q();
                if (t instanceof C5397j) {
                    C5397j jVar = (C5397j) t;
                    jVar.f12392u = N;
                    jVar.f12393v = abVar.f12522i;
                    abVar.mo40961M();
                    if (q != null) {
                        String str = C4924ab.f11134t;
                        abVar.mo40992c(q);
                    }
                } else if (q != null) {
                    String str2 = C4924ab.f11134t;
                    q.mo40000a((C5435p) abVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    C4926ac(C4924ab abVar) {
        super(abVar, (byte) 6);
        this.f11140a = new WeakReference<>(abVar);
    }

    /* renamed from: b */
    public final void mo39946b() {
        C5435p.C5453a q;
        super.mo39946b();
        C4924ab abVar = (C4924ab) this.f11140a.get();
        if (abVar != null && (q = abVar.mo41004q()) != null) {
            q.mo40000a((C5435p) abVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo39944a() {
        C4924ab abVar = (C4924ab) this.f11140a.get();
        if (abVar == null) {
            mo39995b(Byte.valueOf(Ascii.f10100CR));
        } else {
            mo39995b(Byte.valueOf(abVar.mo40996e(abVar.mo41004q())));
        }
    }
}

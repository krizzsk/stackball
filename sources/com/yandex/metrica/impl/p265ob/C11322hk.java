package com.yandex.metrica.impl.p265ob;

import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.hk */
public class C11322hk extends C10678Qj<CellInfoLte> {

    /* renamed from: c */
    private final C11568nk<CellIdentityLte> f27081c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11322hk() {
        this(C10796U2.m27890a(28) ? new C11721rk() : new C11692qk());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62089b(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.mo62415a(4).mo62420b(Integer.valueOf(cellIdentity.getCi())).mo62422c(Integer.valueOf(cellIdentity.getTac())).mo62430k(Integer.valueOf(cellIdentity.getPci())).mo62431l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).mo62428i(this.f27081c.mo63388b(cellIdentity)).mo62429j(this.f27081c.mo63387a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62090c(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (C10796U2.m27890a(24)) {
            aVar.mo62416a(Integer.valueOf(C11163dk.m28797a(cellInfoLte.getCellIdentity())));
        }
        if (C10796U2.m27890a(26)) {
            aVar.mo62425f(Integer.valueOf(C11213ek.m28890b(cellInfoLte.getCellSignalStrength())));
            aVar.mo62427h(Integer.valueOf(C11213ek.m28891c(cellInfoLte.getCellSignalStrength())));
            aVar.mo62424e(Integer.valueOf(C11213ek.m28889a(cellInfoLte.getCellSignalStrength())));
        }
        if (C10796U2.m27890a(28)) {
            aVar.mo62423d(Integer.valueOf(C11249fk.m29006a(cellInfoLte.getCellIdentity())));
        }
        if (C10796U2.m27890a(29)) {
            aVar.mo62426g(Integer.valueOf(C11290gk.m29087a(cellInfoLte.getCellSignalStrength())));
        }
    }

    C11322hk(C11568nk<CellIdentityLte> nkVar) {
        this.f27081c = nkVar;
    }
}

package com.yandex.metrica.impl.p265ob;

import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.ck */
public class C11118ck extends C10678Qj<CellInfoGsm> {

    /* renamed from: c */
    private final C11568nk<CellIdentityGsm> f26664c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11118ck() {
        this(C10796U2.m27890a(28) ? new C11661pk() : new C11609ok());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62089b(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.mo62415a(1).mo62420b(Integer.valueOf(cellIdentity.getCid())).mo62422c(Integer.valueOf(cellIdentity.getLac())).mo62431l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).mo62428i(this.f26664c.mo63388b(cellIdentity)).mo62429j(this.f26664c.mo63387a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62090c(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (C10796U2.m27890a(24)) {
            aVar.mo62416a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    C11118ck(C11568nk<CellIdentityGsm> nkVar) {
        this.f26664c = nkVar;
    }
}

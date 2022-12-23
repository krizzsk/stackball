package com.yandex.metrica.impl.p265ob;

import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.ik */
public class C11355ik extends C10678Qj<CellInfo> {

    /* renamed from: c */
    private final C11568nk<CellIdentityWcdma> f27131c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11355ik() {
        this(C10796U2.m27890a(28) ? new C11795tk() : new C11765sk());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62089b(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.mo62415a(3).mo62420b(Integer.valueOf(cellIdentity.getCid())).mo62422c(Integer.valueOf(cellIdentity.getLac())).mo62430k(Integer.valueOf(cellIdentity.getPsc())).mo62431l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).mo62428i(this.f27131c.mo63388b(cellIdentity)).mo62429j(this.f27131c.mo63387a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62090c(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        if (C10796U2.m27890a(24)) {
            aVar.mo62416a(Integer.valueOf(C11163dk.m28798a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    C11355ik(C11568nk<CellIdentityWcdma> nkVar) {
        this.f27131c = nkVar;
    }
}

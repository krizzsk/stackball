package com.yandex.metrica.impl.p265ob;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.ak */
public class C11051ak extends C10678Qj<CellInfoCdma> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62089b(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        aVar.mo62431l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.mo62415a(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62090c(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
    }
}

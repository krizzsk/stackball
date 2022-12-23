package com.yandex.metrica.impl.p265ob;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.Zj */
public class C11003Zj implements C11010a0 {

    /* renamed from: a */
    private final C11470kk f26468a;

    /* renamed from: b */
    private final C10678Qj<CellInfoGsm> f26469b;

    /* renamed from: c */
    private final C10678Qj<CellInfoCdma> f26470c;

    /* renamed from: d */
    private final C10678Qj<CellInfoLte> f26471d;

    /* renamed from: e */
    private final C10678Qj<CellInfo> f26472e;

    /* renamed from: f */
    private final C11010a0[] f26473f;

    public C11003Zj() {
        this(new C11089bk());
    }

    /* renamed from: a */
    public void mo62593a(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        this.f26468a.mo63247a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.f26469b.mo62087a((CellInfoGsm) cellInfo, aVar);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.f26470c.mo62087a((CellInfoCdma) cellInfo, aVar);
        } else if (cellInfo instanceof CellInfoLte) {
            this.f26471d.mo62087a((CellInfoLte) cellInfo, aVar);
        } else if (C10796U2.m27890a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.f26472e.mo62087a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C11003Zj(C10678Qj<CellInfo> qj) {
        this(new C11470kk(), new C11118ck(), new C11051ak(), new C11322hk(), C10796U2.m27890a(18) ? new C11355ik() : qj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.yandex.metrica.impl.ob.a0[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11003Zj(com.yandex.metrica.impl.p265ob.C11470kk r2, com.yandex.metrica.impl.p265ob.C10678Qj<android.telephony.CellInfoGsm> r3, com.yandex.metrica.impl.p265ob.C10678Qj<android.telephony.CellInfoCdma> r4, com.yandex.metrica.impl.p265ob.C10678Qj<android.telephony.CellInfoLte> r5, com.yandex.metrica.impl.p265ob.C10678Qj<android.telephony.CellInfo> r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f26468a = r2
            r1.f26469b = r3
            r1.f26470c = r4
            r1.f26471d = r5
            r1.f26472e = r6
            r2 = 4
            com.yandex.metrica.impl.ob.a0[] r2 = new com.yandex.metrica.impl.p265ob.C11010a0[r2]
            r0 = 0
            r2[r0] = r3
            r3 = 1
            r2[r3] = r4
            r3 = 2
            r2[r3] = r6
            r3 = 3
            r2[r3] = r5
            r1.f26473f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11003Zj.<init>(com.yandex.metrica.impl.ob.kk, com.yandex.metrica.impl.ob.Qj, com.yandex.metrica.impl.ob.Qj, com.yandex.metrica.impl.ob.Qj, com.yandex.metrica.impl.ob.Qj):void");
    }

    /* renamed from: a */
    public void mo62308a(C11761si siVar) {
        for (C11010a0 a : this.f26473f) {
            a.mo62308a(siVar);
        }
    }
}

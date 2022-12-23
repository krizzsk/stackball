package com.yandex.metrica.impl.p265ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.Tj */
public class C10788Tj implements C11535mk {

    /* renamed from: a */
    private final C11003Zj f25882a;

    /* renamed from: b */
    private final C10966Yj f25883b;

    public C10788Tj() {
        this(new C11003Zj(), new C10966Yj());
    }

    /* renamed from: a */
    public void mo62308a(C11761si siVar) {
        this.f25882a.mo62308a(siVar);
    }

    C10788Tj(C11003Zj zj, C10966Yj yj) {
        this.f25882a = zj;
        this.f25883b = yj;
    }

    /* renamed from: a */
    public C10859Vj mo62307a(CellInfo cellInfo) {
        C10859Vj.C10860a aVar = new C10859Vj.C10860a();
        this.f25882a.mo62593a(cellInfo, aVar);
        return this.f25883b.mo62552a(new C10859Vj(aVar));
    }
}

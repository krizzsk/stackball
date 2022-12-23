package com.yandex.metrica.impl.p265ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.p265ob.C10859Vj;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.kk */
public class C11470kk {

    /* renamed from: a */
    private C10530Mm f27617a;

    public C11470kk() {
        this(new C10530Mm());
    }

    /* renamed from: a */
    public void mo63247a(CellInfo cellInfo, C10859Vj.C10860a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long l = null;
        if (timeStamp > 0) {
            C10530Mm mm = this.f27617a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long c = mm.mo61806c(timeStamp, timeUnit);
            if (c > 0 && c < TimeUnit.HOURS.toSeconds(1)) {
                l = Long.valueOf(c);
            }
            if (l == null) {
                long a = this.f27617a.mo61804a(timeStamp, timeUnit);
                if (a > 0 && a < TimeUnit.HOURS.toSeconds(1)) {
                    l = Long.valueOf(a);
                }
            }
        }
        aVar.mo62417a(l).mo62419a(cellInfo.isRegistered());
    }

    C11470kk(C10530Mm mm) {
        this.f27617a = mm;
    }
}

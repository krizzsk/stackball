package com.yandex.metrica.impl.p265ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.p265ob.C10859Vj;

/* renamed from: com.yandex.metrica.impl.ob.Qj */
public abstract class C10678Qj<T extends CellInfo> implements Object<T> {

    /* renamed from: a */
    private final String f25547a = ("[" + getClass().getName() + "]");

    /* renamed from: b */
    private volatile C11761si f25548b;

    /* renamed from: b */
    private boolean m27443b(T t) {
        C11761si siVar = this.f25548b;
        if (siVar == null || !siVar.f28199u) {
            return false;
        }
        boolean isRegistered = t.isRegistered();
        if (!siVar.f28200v || isRegistered) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo62087a(T t, C10859Vj.C10860a aVar) {
        mo62089b(t, aVar);
        if (m27443b(t)) {
            mo62090c(t, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo62089b(T t, C10859Vj.C10860a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo62090c(T t, C10859Vj.C10860a aVar);

    /* renamed from: a */
    public void mo62088a(C11761si siVar) {
        this.f25548b = siVar;
    }
}

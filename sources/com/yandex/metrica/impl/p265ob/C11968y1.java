package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.y1 */
public interface C11968y1 extends C10584O1 {
    /* renamed from: a */
    void mo61078a(int i, Bundle bundle);

    /* renamed from: a */
    void mo61082a(Bundle bundle);

    /* renamed from: a */
    void mo61083a(MetricaService.C10026e eVar);

    @Deprecated
    /* renamed from: a */
    void mo61085a(String str, int i, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo61088b(Bundle bundle);

    void reportData(Bundle bundle);
}

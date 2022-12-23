package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import com.appsflyer.ServerParameters;
import com.yandex.metrica.impl.p265ob.C10810Uf;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Jd */
public class C10402Jd {
    /* renamed from: a */
    public C10810Uf.C10812b mo61626a(C11630pd pdVar) {
        C10810Uf.C10812b bVar = new C10810Uf.C10812b();
        Location c = pdVar.mo63480c();
        bVar.f25938b = pdVar.mo63479b() == null ? bVar.f25938b : pdVar.mo63479b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f25940d = timeUnit.toSeconds(c.getTime());
        bVar.f25948l = C11127d2.m28679a(pdVar.f27913a);
        bVar.f25939c = timeUnit.toSeconds(pdVar.mo63482e());
        bVar.f25949m = timeUnit.toSeconds(pdVar.mo63481d());
        bVar.f25941e = c.getLatitude();
        bVar.f25942f = c.getLongitude();
        bVar.f25943g = Math.round(c.getAccuracy());
        bVar.f25944h = Math.round(c.getBearing());
        bVar.f25945i = Math.round(c.getSpeed());
        bVar.f25946j = (int) Math.round(c.getAltitude());
        String provider = c.getProvider();
        int i = 0;
        if ("gps".equals(provider)) {
            i = 1;
        } else if (ServerParameters.NETWORK.equals(provider)) {
            i = 2;
        } else if ("fused".equals(provider)) {
            i = 3;
        }
        bVar.f25947k = i;
        bVar.f25950n = C11127d2.m28678a(pdVar.mo63478a());
        return bVar;
    }
}

package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10810Uf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.Hd */
public class C10337Hd {
    /* renamed from: a */
    public C10810Uf.C10811a mo61464a(C10781Tc tc) {
        int i;
        int i2;
        C10810Uf.C10811a aVar = new C10810Uf.C10811a();
        aVar.f25930b = tc.mo62294f() == null ? aVar.f25930b : tc.mo62294f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f25931c = timeUnit.toSeconds(tc.mo62292d());
        aVar.f25934f = timeUnit.toSeconds(tc.mo62291c());
        if (tc.mo62288b() == null) {
            i = 0;
        } else {
            i = C11127d2.m28678a(tc.mo62288b());
        }
        aVar.f25935g = i;
        if (tc.mo62293e() == null) {
            i2 = 3;
        } else {
            i2 = C11127d2.m28679a(tc.mo62293e());
        }
        aVar.f25936h = i2;
        JSONArray a = tc.mo62282a();
        if (a != null) {
            aVar.f25932d = C11127d2.m28688b(a);
        }
        JSONArray g = tc.mo62295g();
        if (g != null) {
            aVar.f25933e = C11127d2.m28685a(g);
        }
        return aVar;
    }
}

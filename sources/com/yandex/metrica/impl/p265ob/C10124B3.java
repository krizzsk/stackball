package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.billing_interface.C10070c;
import com.yandex.metrica.billing_interface.C10072d;
import com.yandex.metrica.billing_interface.C10073e;
import com.yandex.metrica.impl.p265ob.C10992Zf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.B3 */
public class C10124B3 {

    /* renamed from: a */
    private final C10072d f24389a;

    public C10124B3(C10072d dVar) {
        this.f24389a = dVar;
    }

    /* renamed from: a */
    public byte[] mo61093a() {
        String str;
        C10072d dVar = this.f24389a;
        C10992Zf zf = new C10992Zf();
        zf.f26428b = dVar.f24219c;
        zf.f26434h = dVar.f24220d;
        try {
            str = Currency.getInstance(dVar.f24221e).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        zf.f26430d = str.getBytes();
        zf.f26431e = dVar.f24218b.getBytes();
        C10992Zf.C10993a aVar = new C10992Zf.C10993a();
        aVar.f26440b = dVar.f24230n.getBytes();
        aVar.f26441c = dVar.f24226j.getBytes();
        zf.f26433g = aVar;
        int i = 1;
        zf.f26435i = true;
        zf.f26436j = 1;
        if (dVar.f24217a.ordinal() == 1) {
            i = 2;
        }
        zf.f26437k = i;
        C10992Zf.C10997c cVar = new C10992Zf.C10997c();
        cVar.f26451b = dVar.f24227k.getBytes();
        cVar.f26452c = TimeUnit.MILLISECONDS.toSeconds(dVar.f24228l);
        zf.f26438l = cVar;
        if (dVar.f24217a == C10073e.SUBS) {
            C10992Zf.C10994b bVar = new C10992Zf.C10994b();
            bVar.f26442b = dVar.f24229m;
            C10070c cVar2 = dVar.f24225i;
            if (cVar2 != null) {
                bVar.f26443c = m26043a(cVar2);
            }
            C10992Zf.C10994b.C10995a aVar2 = new C10992Zf.C10994b.C10995a();
            aVar2.f26445b = dVar.f24222f;
            C10070c cVar3 = dVar.f24223g;
            if (cVar3 != null) {
                aVar2.f26446c = m26043a(cVar3);
            }
            aVar2.f26447d = dVar.f24224h;
            bVar.f26444d = aVar2;
            zf.f26439m = bVar;
        }
        return C11169e.m28804a((C11169e) zf);
    }

    /* renamed from: a */
    private C10992Zf.C10994b.C10996b m26043a(C10070c cVar) {
        C10992Zf.C10994b.C10996b bVar = new C10992Zf.C10994b.C10996b();
        bVar.f26449b = cVar.f24209a;
        int ordinal = cVar.f24210b.ordinal();
        int i = 4;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal != 4) {
            i = 0;
        }
        bVar.f26450c = i;
        return bVar;
    }
}

package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11083bg;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.X9 */
public class C10920X9 implements C11194ea<C11040ae, C11083bg> {

    /* renamed from: a */
    private final C11030aa f26251a;

    public C10920X9() {
        this(new C11030aa());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11083bg bgVar = (C11083bg) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C11083bg.C11085b[] bVarArr = bgVar.f26608b;
            if (i2 >= bVarArr.length) {
                break;
            }
            C11083bg.C11085b bVar = bVarArr[i2];
            arrayList.add(new C11347ie(bVar.f26614b, bVar.f26615c));
            i2++;
        }
        C10322H h = null;
        C11083bg.C11084a aVar = bgVar.f26609c;
        if (aVar != null) {
            h = this.f26251a.mo61049a(aVar);
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = bgVar.f26610d;
            if (i >= strArr.length) {
                return new C11040ae(arrayList, h, arrayList2);
            }
            arrayList2.add(strArr[i]);
            i++;
        }
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C11040ae aeVar = (C11040ae) obj;
        C11083bg bgVar = new C11083bg();
        bgVar.f26608b = new C11083bg.C11085b[aeVar.f26519a.size()];
        int i = 0;
        int i2 = 0;
        for (C11347ie next : aeVar.f26519a) {
            C11083bg.C11085b[] bVarArr = bgVar.f26608b;
            C11083bg.C11085b bVar = new C11083bg.C11085b();
            bVar.f26614b = next.f27118a;
            bVar.f26615c = next.f27119b;
            bVarArr[i2] = bVar;
            i2++;
        }
        C10322H h = aeVar.f26520b;
        if (h != null) {
            bgVar.f26609c = this.f26251a.mo61050b(h);
        }
        bgVar.f26610d = new String[aeVar.f26521c.size()];
        for (String str : aeVar.f26521c) {
            bgVar.f26610d[i] = str;
            i++;
        }
        return bgVar;
    }

    C10920X9(C11030aa aaVar) {
        this.f26251a = aaVar;
    }
}

package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11382jg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ca */
public class C10159Ca implements C11194ea<C10225Eh, C11382jg> {
    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11382jg jgVar = (C11382jg) obj;
        ArrayList arrayList = new ArrayList(jgVar.f27195b.length);
        int i = 0;
        while (true) {
            C11382jg.C11383a[] aVarArr = jgVar.f27195b;
            if (i >= aVarArr.length) {
                return new C10225Eh(arrayList, jgVar.f27196c, jgVar.f27197d, jgVar.f27198e, jgVar.f27199f);
            }
            C11382jg.C11383a aVar = aVarArr[i];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f27202c;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f27202c.length);
                int i2 = 0;
                while (true) {
                    String[] strArr2 = aVar.f27202c;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    arrayList2.add(strArr2[i2]);
                    i2++;
                }
            }
            arrayList.add(new C10341Hh(C10585O2.m27105b(aVar.f27201b), arrayList2));
            i++;
        }
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C10225Eh eh = (C10225Eh) obj;
        C11382jg jgVar = new C11382jg();
        jgVar.f27195b = new C11382jg.C11383a[eh.f24588a.size()];
        for (int i = 0; i < eh.f24588a.size(); i++) {
            C11382jg.C11383a[] aVarArr = jgVar.f27195b;
            C10341Hh hh = eh.f24588a.get(i);
            C11382jg.C11383a aVar = new C11382jg.C11383a();
            aVar.f27201b = hh.f24835a;
            List<String> list = hh.f24836b;
            aVar.f27202c = new String[list.size()];
            int i2 = 0;
            for (String str : list) {
                aVar.f27202c[i2] = str;
                i2++;
            }
            aVarArr[i] = aVar;
        }
        jgVar.f27196c = eh.f24589b;
        jgVar.f27197d = eh.f24590c;
        jgVar.f27198e = eh.f24591d;
        jgVar.f27199f = eh.f24592e;
        return jgVar;
    }
}

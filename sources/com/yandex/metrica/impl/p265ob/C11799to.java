package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.to */
public class C11799to implements C11829uo<List<C11770so>> {
    /* renamed from: a */
    public C11770so mo61590a(Object obj) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C11770so soVar : (List) obj) {
            if (!soVar.mo63695b()) {
                linkedList.add(soVar.mo63694a());
                z = false;
            }
        }
        if (z) {
            return C11770so.m30371a(this);
        }
        return C11770so.m30372a(this, TextUtils.join(", ", linkedList));
    }
}

package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Build;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.je */
public class C11380je {
    /* renamed from: a */
    public List<C11347ie> mo63069a(Context context, List<C11347ie> list) {
        C11314he heVar;
        if (Build.VERSION.SDK_INT >= 16) {
            heVar = new C11426ke(context, new C10898Wn());
        } else {
            heVar = new C11562ne(context, context.getPackageName(), new C10898Wn());
        }
        List<C11347ie> a = heVar.mo63012a();
        if (C11327i.m29173a((Collection<?>) a, (Collection<?>) list)) {
            return null;
        }
        return a;
    }
}

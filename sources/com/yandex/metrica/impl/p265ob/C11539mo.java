package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.mo */
public class C11539mo implements Comparator<C10977Z2> {
    public int compare(Object obj, Object obj2) {
        C10977Z2 z2 = (C10977Z2) obj;
        C10977Z2 z22 = (C10977Z2) obj2;
        return (TextUtils.equals(z2.f26380a, z22.f26380a) && TextUtils.equals(z2.f26381b, z22.f26381b)) ? 0 : 10;
    }
}

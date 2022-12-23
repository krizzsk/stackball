package com.tapjoy.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.tapjoy.internal.eo */
public final class C9217eo {
    /* renamed from: a */
    public static List m24675a() {
        return new C9218ep(Collections.emptyList());
    }

    /* renamed from: a */
    public static List m24676a(String str, List list) {
        if (list != null) {
            if (list instanceof C9218ep) {
                list = ((C9218ep) list).f22628a;
            }
            if (list == Collections.emptyList() || (list instanceof C9216en)) {
                return list;
            }
            C9216en enVar = new C9216en(list);
            if (!enVar.contains((Object) null)) {
                return enVar;
            }
            throw new IllegalArgumentException(str + ".contains(null)");
        }
        throw new NullPointerException(str + " == null");
    }

    /* renamed from: a */
    public static boolean m24677a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static IllegalStateException m24674a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + sb);
    }
}

package com.tapjoy.internal;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.jv */
public final class C9472jv {
    /* renamed from: a */
    public static HashSet m25456a(Iterator it) {
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        return hashSet;
    }
}

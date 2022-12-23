package com.mbridge.msdk.foundation.same.net.p177f;

import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.c */
/* compiled from: NetworkResponse */
public final class C6272c {

    /* renamed from: a */
    public final int f15552a;

    /* renamed from: b */
    public final byte[] f15553b;

    /* renamed from: c */
    public final Map<String, String> f15554c;

    /* renamed from: d */
    public final List<C6245b> f15555d;

    public C6272c(int i, byte[] bArr, List<C6245b> list) {
        this(i, bArr, m15854a(list), list);
    }

    private C6272c(int i, byte[] bArr, Map<String, String> map, List<C6245b> list) {
        this.f15552a = i;
        this.f15553b = bArr;
        this.f15554c = map;
        if (list == null) {
            this.f15555d = null;
        } else {
            this.f15555d = Collections.unmodifiableList(list);
        }
    }

    /* renamed from: a */
    private static Map<String, String> m15854a(List<C6245b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C6245b next : list) {
            treeMap.put(next.mo43825a(), next.mo43826b());
        }
        return treeMap;
    }
}

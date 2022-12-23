package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class fv0 {

    /* renamed from: a */
    public final int f33755a;

    /* renamed from: b */
    public final byte[] f33756b;

    /* renamed from: c */
    public final Map<String, String> f33757c;

    /* renamed from: d */
    public final List<n90> f33758d;

    /* renamed from: e */
    public final boolean f33759e;

    @Deprecated
    public fv0(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m36323a(map), z, j);
    }

    /* renamed from: a */
    private static Map<String, String> m36324a(List<n90> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (n90 next : list) {
            treeMap.put(next.mo68936a(), next.mo68937b());
        }
        return treeMap;
    }

    public fv0(int i, byte[] bArr, boolean z, long j, List<n90> list) {
        this(i, bArr, m36324a(list), list, z, j);
    }

    private fv0(int i, byte[] bArr, Map<String, String> map, List<n90> list, boolean z, long j) {
        this.f33755a = i;
        this.f33756b = bArr;
        this.f33757c = map;
        if (list == null) {
            this.f33758d = null;
        } else {
            this.f33758d = Collections.unmodifiableList(list);
        }
        this.f33759e = z;
    }

    /* renamed from: a */
    private static List<n90> m36323a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new n90((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }
}

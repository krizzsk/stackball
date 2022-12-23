package com.yandex.metrica.impl.p265ob;

import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: com.yandex.metrica.impl.ob.ti */
public final class C11793ti {

    /* renamed from: a */
    private Map<String, ? extends List<String>> f28326a = MapsKt.emptyMap();

    /* renamed from: b */
    private Map<String, ? extends C11258g1> f28327b = MapsKt.emptyMap();

    /* renamed from: c */
    private C11258g1 f28328c;

    /* renamed from: a */
    public final C11258g1 mo63743a() {
        return this.f28328c;
    }

    /* renamed from: b */
    public final Map<String, C11258g1> mo63746b() {
        return this.f28327b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r2 == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f A[SYNTHETIC, Splitter:B:36:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3 A[SYNTHETIC, Splitter:B:52:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo63744a(com.yandex.metrica.impl.p265ob.C11258g1 r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.yandex.metrica.impl.ob.g1 r0 = r8.f28328c     // Catch:{ all -> 0x00ef }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.f26933a     // Catch:{ all -> 0x00ef }
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            int r0 = r0.length()     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = r9.f26933a     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x0024
            int r0 = r0.length()     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 != 0) goto L_0x00ed
        L_0x0027:
            r8.f28328c = r9     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r9.f26933a     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x002f
            r2 = r1
            goto L_0x005d
        L_0x002f:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00ef }
            r2.<init>()     // Catch:{ all -> 0x00ef }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x005c }
            r3.<init>(r0)     // Catch:{ all -> 0x005c }
            java.util.Iterator r0 = r3.keys()     // Catch:{ all -> 0x005c }
        L_0x003d:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x005d
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x005c }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ all -> 0x003d }
            java.lang.String r6 = r3.optString(r4)     // Catch:{ all -> 0x003d }
            r5.<init>(r6)     // Catch:{ all -> 0x003d }
            java.util.List r5 = com.yandex.metrica.impl.p265ob.C11993ym.m30980b((org.json.JSONArray) r5)     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x003d
            r2.put(r4, r5)     // Catch:{ all -> 0x003d }
            goto L_0x003d
        L_0x005c:
        L_0x005d:
            if (r2 == 0) goto L_0x009f
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00ef }
            int r3 = r2.size()     // Catch:{ all -> 0x00ef }
            int r3 = kotlin.collections.MapsKt.mapCapacity(r3)     // Catch:{ all -> 0x00ef }
            r0.<init>(r3)     // Catch:{ all -> 0x00ef }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00ef }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ef }
        L_0x0074:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ef }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00ef }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00ef }
            com.yandex.metrica.impl.ob.g1 r5 = new com.yandex.metrica.impl.ob.g1     // Catch:{ all -> 0x00ef }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00ef }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x00ef }
            org.json.JSONArray r3 = com.yandex.metrica.impl.p265ob.C11993ym.m30982b((java.util.List<?>) r3)     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ef }
            com.yandex.metrica.impl.ob.e1 r6 = r9.f26934b     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r9.f26935c     // Catch:{ all -> 0x00ef }
            r5.<init>(r3, r6, r7)     // Catch:{ all -> 0x00ef }
            r0.put(r4, r5)     // Catch:{ all -> 0x00ef }
            goto L_0x0074
        L_0x009f:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ all -> 0x00ef }
        L_0x00a3:
            r8.f28327b = r0     // Catch:{ all -> 0x00ef }
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00ef }
            int r2 = r0.size()     // Catch:{ all -> 0x00ef }
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)     // Catch:{ all -> 0x00ef }
            r9.<init>(r2)     // Catch:{ all -> 0x00ef }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x00ef }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ef }
        L_0x00ba:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x00eb
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00ef }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00ef }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00ef }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00ef }
            com.yandex.metrica.impl.ob.g1 r2 = (com.yandex.metrica.impl.p265ob.C11258g1) r2     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r2.f26933a     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00d5
            goto L_0x00df
        L_0x00d5:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x00df }
            r4.<init>(r2)     // Catch:{ all -> 0x00df }
            java.util.List r2 = com.yandex.metrica.impl.p265ob.C11993ym.m30980b((org.json.JSONArray) r4)     // Catch:{ all -> 0x00df }
            goto L_0x00e0
        L_0x00df:
            r2 = r1
        L_0x00e0:
            if (r2 == 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x00ef }
        L_0x00e7:
            r9.put(r3, r2)     // Catch:{ all -> 0x00ef }
            goto L_0x00ba
        L_0x00eb:
            r8.f28326a = r9     // Catch:{ all -> 0x00ef }
        L_0x00ed:
            monitor-exit(r8)
            return
        L_0x00ef:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11793ti.mo63744a(com.yandex.metrica.impl.ob.g1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x000a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo63745a(java.util.List<java.lang.String> r5, java.util.Map<java.lang.String, com.yandex.metrica.impl.p265ob.C11258g1> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0051 }
            r0.<init>()     // Catch:{ all -> 0x0051 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0051 }
        L_0x000a:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0051 }
            java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r2 = r4.f28326a     // Catch:{ all -> 0x0051 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0051 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0029
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            if (r3 != 0) goto L_0x000a
            r0.put(r1, r2)     // Catch:{ all -> 0x0051 }
            goto L_0x000a
        L_0x0030:
            java.lang.String r5 = "yandex_mobile_metrica_custom_sdk_hosts"
            com.yandex.metrica.impl.ob.g1 r1 = new com.yandex.metrica.impl.ob.g1     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30978b((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r0)     // Catch:{ all -> 0x0051 }
            com.yandex.metrica.impl.ob.g1 r2 = r4.f28328c     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0041
            com.yandex.metrica.impl.ob.e1 r3 = r2.f26934b     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            com.yandex.metrica.impl.ob.e1 r3 = com.yandex.metrica.impl.p265ob.C11171e1.UNKNOWN     // Catch:{ all -> 0x0051 }
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r2.f26935c     // Catch:{ all -> 0x0051 }
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            r1.<init>(r0, r3, r2)     // Catch:{ all -> 0x0051 }
            r6.put(r5, r1)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)
            return
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11793ti.mo63745a(java.util.List, java.util.Map):void");
    }
}

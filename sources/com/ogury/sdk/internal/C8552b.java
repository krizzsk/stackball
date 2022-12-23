package com.ogury.sdk.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.sdk.internal.b */
/* compiled from: MonitoringInfo.kt */
public final class C8552b {

    /* renamed from: a */
    private final Map<String, String> f21774a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo54025a(String str, String str2) {
        if (str != null) {
            boolean z = true;
            if ((str.length() > 0) && str2 != null) {
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z && !this.f21774a.containsKey(str)) {
                    this.f21774a.put(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54026a() {
        return this.f21774a.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo54028a(String str) {
        C8567m.m24059b(str, "name");
        return this.f21774a.containsKey(str);
    }

    /* renamed from: b */
    public final String mo54029b(String str) {
        C8567m.m24059b(str, "name");
        return this.f21774a.get(str);
    }

    /* renamed from: b */
    public final Set<Map.Entry<String, String>> mo54030b() {
        return this.f21774a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C8567m.m24058a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        return C8567m.m24058a((Object) this.f21774a, (Object) ((C8552b) obj).f21774a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54027a(com.ogury.sdk.internal.C8552b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "other"
            com.ogury.sdk.internal.C8567m.m24059b(r5, r0)
            java.util.Set r5 = r5.mo54030b()
            java.util.Iterator r5 = r5.iterator()
        L_0x000d:
            boolean r0 = r5.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r4.mo54028a((java.lang.String) r2)
            if (r3 == 0) goto L_0x0037
            java.lang.String r2 = r4.mo54029b((java.lang.String) r2)
            boolean r0 = com.ogury.sdk.internal.C8567m.m24058a((java.lang.Object) r2, (java.lang.Object) r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000d
        L_0x0037:
            r5 = 0
            return r5
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.sdk.internal.C8552b.mo54027a(com.ogury.sdk.internal.b):boolean");
    }

    /* renamed from: b */
    public final void mo54031b(C8552b bVar) {
        C8567m.m24059b(bVar, "other");
        this.f21774a.putAll(bVar.f21774a);
    }

    /* renamed from: c */
    public final void mo54032c() {
        this.f21774a.clear();
    }

    public final int hashCode() {
        return this.f21774a.hashCode();
    }
}

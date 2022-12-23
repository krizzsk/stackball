package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.y2 */
public class C15230y2 {

    /* renamed from: a */
    private final Object f42744a = new Object();

    /* renamed from: b */
    private final fz0 f42745b = new fz0();

    /* renamed from: c */
    private final Map<C15139x2, Map<Object, Long>> f42746c = new LinkedHashMap();

    /* renamed from: d */
    private final List<C15027w2> f42747d = new ArrayList();

    /* renamed from: a */
    public void mo70968a(C15139x2 x2Var, Object obj) {
        Intrinsics.checkNotNullParameter(x2Var, "adLoadingPhaseType");
        synchronized (this.f42744a) {
            Map map = this.f42746c.get(x2Var);
            if (map == null) {
                map = new LinkedHashMap();
            }
            this.f42746c.put(x2Var, map);
            map.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public List<C15027w2> mo70969b() {
        List<C15027w2> list;
        synchronized (this.f42744a) {
            list = CollectionsKt.toList(this.f42747d);
        }
        return list;
    }

    /* renamed from: b */
    public void mo70970b(C15139x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "adLoadingPhaseType");
        mo70968a(x2Var, (Object) null);
    }

    /* renamed from: a */
    public void mo70965a(C15139x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "adLoadingPhaseType");
        mo70966a(x2Var, (gz0) this.f42745b);
    }

    /* renamed from: a */
    public void mo70966a(C15139x2 x2Var, gz0 gz0) {
        Intrinsics.checkNotNullParameter(x2Var, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(gz0, "parametersProvider");
        mo70967a(x2Var, gz0, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70967a(com.yandex.mobile.ads.impl.C15139x2 r6, com.yandex.mobile.ads.impl.gz0 r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.String r0 = "adLoadingPhaseType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "parametersProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r5.f42744a
            monitor-enter(r0)
            java.util.Map<com.yandex.mobile.ads.impl.x2, java.util.Map<java.lang.Object, java.lang.Long>> r1 = r5.f42746c     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x005e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x005e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x002f
        L_0x0022:
            long r1 = r1.longValue()     // Catch:{ all -> 0x005e }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005e }
            long r3 = r3 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005e }
        L_0x002f:
            if (r1 != 0) goto L_0x0032
            goto L_0x0049
        L_0x0032:
            long r1 = r1.longValue()     // Catch:{ all -> 0x005e }
            java.util.Map r7 = r7.mo67135a(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "parametersProvider.getReportParameters(duration)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch:{ all -> 0x005e }
            com.yandex.mobile.ads.impl.w2 r1 = new com.yandex.mobile.ads.impl.w2     // Catch:{ all -> 0x005e }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x005e }
            java.util.List<com.yandex.mobile.ads.impl.w2> r7 = r5.f42747d     // Catch:{ all -> 0x005e }
            r7.add(r1)     // Catch:{ all -> 0x005e }
        L_0x0049:
            java.util.Map<com.yandex.mobile.ads.impl.x2, java.util.Map<java.lang.Object, java.lang.Long>> r7 = r5.f42746c     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x005e }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x005e }
            if (r6 != 0) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            java.lang.Object r6 = r6.remove(r8)     // Catch:{ all -> 0x005e }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x005e }
        L_0x005a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005e }
            monitor-exit(r0)
            return
        L_0x005e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15230y2.mo70967a(com.yandex.mobile.ads.impl.x2, com.yandex.mobile.ads.impl.gz0, java.lang.Object):void");
    }

    /* renamed from: a */
    public void mo70964a() {
        synchronized (this.f42744a) {
            this.f42746c.clear();
            this.f42747d.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}

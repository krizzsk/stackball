package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.I8 */
public final class C10363I8 extends C10396J8 {

    /* renamed from: e */
    private final Set<String> f24875e = SetsKt.setOf("first_event_done", "init_event_done", "report_request_id", "global_number", "numbers_of_type", "session_id", "referrer_handled", "open_id", "attribution_id", "last_migration_api_level");

    public C10363I8(Context context, String str, C10442L0 l0) {
        super(context, "appmetrica_vital_" + str + ".dat", l0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<String> mo61428a() {
        return this.f24875e;
    }

    /* renamed from: b */
    public final synchronized void mo61485b(boolean z) {
        JSONObject put = mo61604b().put("init_event_done", z);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(INIT_EVENT_DONE, value)");
        mo61603a(put);
    }

    /* renamed from: c */
    public final synchronized void mo61487c(int i) {
        JSONObject put = mo61604b().put("report_request_id", i);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_REPORT_REQUEST_ID, value)");
        mo61603a(put);
    }

    /* renamed from: d */
    public final synchronized int mo61489d() {
        return mo61604b().optInt("global_number", 0);
    }

    /* renamed from: e */
    public final synchronized int mo61490e() {
        return mo61604b().optInt("last_migration_api_level", 0);
    }

    /* renamed from: f */
    public final synchronized JSONObject mo61491f() {
        return mo61604b().optJSONObject("numbers_of_type");
    }

    /* renamed from: g */
    public final synchronized int mo61492g() {
        return mo61604b().optInt("open_id", 1);
    }

    /* renamed from: h */
    public final synchronized boolean mo61493h() {
        return mo61604b().optBoolean("referrer_handled", false);
    }

    /* renamed from: i */
    public final synchronized int mo61494i() {
        return mo61604b().optInt("report_request_id", -1);
    }

    /* renamed from: j */
    public final synchronized long mo61495j() {
        return mo61604b().optLong("session_id", -1);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: k */
    public final synchronized void mo61496k() {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            org.json.JSONObject r0 = r3.mo61604b()     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "attribution_id"
            r2 = 1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            int r0 = r0 + r2
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            org.json.JSONObject r1 = r3.mo61604b()     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "attribution_id"
            org.json.JSONObject r0 = r1.put(r2, r0)     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "getOrLoadData().put(KEY_ATTRIBUTION_ID, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x0025 }
            r3.mo61603a(r0)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r3)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10363I8.mo61496k():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: l */
    public final synchronized void mo61497l() {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            org.json.JSONObject r0 = r3.mo61604b()     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "open_id"
            r2 = 1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            int r0 = r0 + r2
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            org.json.JSONObject r1 = r3.mo61604b()     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "open_id"
            org.json.JSONObject r0 = r1.put(r2, r0)     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "getOrLoadData().put(KEY_OPEN_ID, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x0025 }
            r3.mo61603a(r0)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r3)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10363I8.mo61497l():void");
    }

    /* renamed from: m */
    public final synchronized boolean mo61498m() {
        return mo61604b().optBoolean("first_event_done", false);
    }

    /* renamed from: n */
    public final synchronized boolean mo61499n() {
        return mo61604b().optBoolean("init_event_done", false);
    }

    /* renamed from: a */
    public final synchronized void mo61481a(boolean z) {
        JSONObject put = mo61604b().put("first_event_done", z);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(FIRST_EVENT_DONE, value)");
        mo61603a(put);
    }

    /* renamed from: b */
    public final synchronized void mo61484b(JSONObject jSONObject) {
        JSONObject put = mo61604b().put("numbers_of_type", jSONObject);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_NUMBERS_OF_TYPE, value)");
        mo61603a(put);
    }

    /* renamed from: c */
    public final synchronized void mo61488c(boolean z) {
        JSONObject put = mo61604b().put("referrer_handled", z);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_REFERRER_HANDLED, value)");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61479a(int i) {
        JSONObject put = mo61604b().put("global_number", i);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_GLOBAL_NUMBER, value)");
        mo61603a(put);
    }

    /* renamed from: b */
    public final synchronized void mo61483b(int i) {
        JSONObject put = mo61604b().put("last_migration_api_level", i);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        mo61603a(put);
    }

    /* renamed from: c */
    public final synchronized int mo61486c() {
        return mo61604b().optInt("attribution_id", 1);
    }

    /* renamed from: a */
    public final synchronized void mo61480a(long j) {
        JSONObject put = mo61604b().put("session_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_SESSION_ID, value)");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61482a(boolean z, boolean z2, Integer num, Integer num2, Long l, Boolean bool, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        JSONObject put = new JSONObject().put("first_event_done", z).put("init_event_done", z2).put("report_request_id", num).put("global_number", num2).put("session_id", l).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        Intrinsics.checkNotNullExpressionValue(put, "json");
        mo61603a(put);
    }
}

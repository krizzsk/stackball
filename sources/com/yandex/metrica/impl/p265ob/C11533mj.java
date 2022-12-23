package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.mj */
public class C11533mj {

    /* renamed from: a */
    private static final Map<String, Integer> f27736a = Collections.unmodifiableMap(new C11534a());

    /* renamed from: com.yandex.metrica.impl.ob.mj$a */
    class C11534a extends HashMap<String, Integer> {
        C11534a() {
            put("BACKGROUND", 0);
            put("FOREGROUND", 2);
            put("VISIBLE", 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63327a(com.yandex.metrica.impl.p265ob.C11885vj r17, org.json.JSONObject r18) {
        /*
            r16 = this;
            com.yandex.metrica.impl.ob.sa r0 = new com.yandex.metrica.impl.ob.sa
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "location_collecting"
            r3 = r18
            org.json.JSONArray r2 = r3.optJSONArray(r2)
            if (r2 == 0) goto L_0x036a
            r3 = 0
            r4 = 0
        L_0x0016:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x036a
            org.json.JSONObject r5 = r2.optJSONObject(r4)
            if (r5 == 0) goto L_0x0366
            com.yandex.metrica.impl.ob.si r6 = r17.mo63962e()
            com.yandex.metrica.impl.ob.kg$k r7 = new com.yandex.metrica.impl.ob.kg$k
            r7.<init>()
            java.lang.String r8 = "config"
            org.json.JSONObject r8 = r5.optJSONObject(r8)
            com.yandex.metrica.impl.ob.kg$k$a r9 = new com.yandex.metrica.impl.ob.kg$k$a
            r9.<init>()
            r7.f27496b = r9
            r12 = 1
            if (r8 == 0) goto L_0x0280
            java.lang.String r13 = "min_update_interval_seconds"
            java.lang.Long r13 = com.yandex.metrica.impl.p265ob.C11993ym.m30989d(r8, r13)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            com.yandex.metrica.impl.ob.kg$k$a r15 = r7.f27496b
            long r10 = r15.f27498b
            long r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30956a((java.lang.Long) r13, (java.util.concurrent.TimeUnit) r14, (long) r10)
            r9.f27498b = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "min_update_distance_meters"
            boolean r11 = r8.has(r10)
            r13 = 0
            if (r11 == 0) goto L_0x0062
            double r10 = r8.getDouble(r10)     // Catch:{ all -> 0x0062 }
            float r10 = (float) r10     // Catch:{ all -> 0x0062 }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ all -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r10 = r13
        L_0x0063:
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            float r11 = r11.f27499c
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            if (r10 != 0) goto L_0x006e
            r10 = r11
        L_0x006e:
            float r10 = r10.floatValue()
            r9.f27499c = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "records_count_to_force_flush"
            java.lang.Integer r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30985c(r8, r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            int r11 = r11.f27500d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r10 != 0) goto L_0x0087
            r10 = r11
        L_0x0087:
            int r10 = r10.intValue()
            r9.f27500d = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "max_records_count_in_batch"
            java.lang.Integer r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30985c(r8, r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            int r11 = r11.f27501e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r10 != 0) goto L_0x00a0
            r10 = r11
        L_0x00a0:
            int r10 = r10.intValue()
            r9.f27501e = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "max_age_seconds_to_force_flush"
            java.lang.Long r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30989d(r8, r10)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            com.yandex.metrica.impl.ob.kg$k$a r14 = r7.f27496b
            long r14 = r14.f27502f
            long r14 = com.yandex.metrica.impl.p265ob.C11993ym.m30956a((java.lang.Long) r10, (java.util.concurrent.TimeUnit) r11, (long) r14)
            r9.f27502f = r14
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "max_records_to_store_locally"
            java.lang.Integer r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30985c(r8, r10)
            com.yandex.metrica.impl.ob.kg$k$a r14 = r7.f27496b
            int r14 = r14.f27503g
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            if (r10 != 0) goto L_0x00cd
            r10 = r14
        L_0x00cd:
            int r10 = r10.intValue()
            r9.f27503g = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "lbs_min_update_interval_seconds"
            java.lang.Long r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30989d(r8, r10)
            com.yandex.metrica.impl.ob.kg$k$a r14 = r7.f27496b
            long r14 = r14.f27507k
            long r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30956a((java.lang.Long) r10, (java.util.concurrent.TimeUnit) r11, (long) r14)
            r9.f27507k = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "location_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            boolean r11 = r11.f27504h
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x00f8
            r10 = r11
        L_0x00f8:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0104
            boolean r10 = r6.f28185g
            if (r10 == 0) goto L_0x0104
            r10 = 1
            goto L_0x0105
        L_0x0104:
            r10 = 0
        L_0x0105:
            r9.f27504h = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "lbs_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            boolean r11 = r11.f27505i
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x011a
            r10 = r11
        L_0x011a:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0126
            boolean r10 = r6.f28186h
            if (r10 == 0) goto L_0x0126
            r10 = 1
            goto L_0x0127
        L_0x0126:
            r10 = 0
        L_0x0127:
            r9.f27505i = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "passive_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            boolean r11 = r11.f27506j
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x013c
            r10 = r11
        L_0x013c:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0148
            boolean r10 = r6.f28185g
            if (r10 == 0) goto L_0x0148
            r10 = 1
            goto L_0x0149
        L_0x0148:
            r10 = 0
        L_0x0149:
            r9.f27506j = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "all_cells_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            boolean r11 = r11.f27513q
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x015e
            r10 = r11
        L_0x015e:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x016a
            boolean r10 = r6.f28197s
            if (r10 == 0) goto L_0x016a
            r10 = 1
            goto L_0x016b
        L_0x016a:
            r10 = 0
        L_0x016b:
            r9.f27513q = r10
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "connected_cell_collecting_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            com.yandex.metrica.impl.ob.kg$k$a r11 = r7.f27496b
            boolean r11 = r11.f27514r
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x0180
            r10 = r11
        L_0x0180:
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x018c
            boolean r10 = r6.f28197s
            if (r10 == 0) goto L_0x018c
            r10 = 1
            goto L_0x018d
        L_0x018c:
            r10 = 0
        L_0x018d:
            r9.f27514r = r10
            boolean r9 = r6.f28195q
            if (r9 == 0) goto L_0x01a1
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            java.lang.String r10 = "wifi_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.kg$k$a$a r10 = m29807a((org.json.JSONObject) r10, (boolean) r3)
            r9.f27508l = r10
        L_0x01a1:
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            boolean r10 = r9.f27505i
            if (r10 == 0) goto L_0x01b3
            java.lang.String r10 = "lbs_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.kg$k$a$a r10 = m29807a((org.json.JSONObject) r10, (boolean) r3)
            r9.f27509m = r10
        L_0x01b3:
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            boolean r10 = r9.f27504h
            if (r10 == 0) goto L_0x01c5
            java.lang.String r10 = "gps_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.kg$k$a$a r10 = m29807a((org.json.JSONObject) r10, (boolean) r3)
            r9.f27510n = r10
        L_0x01c5:
            com.yandex.metrica.impl.ob.kg$k$a r9 = r7.f27496b
            boolean r10 = r9.f27506j
            if (r10 == 0) goto L_0x01d7
            java.lang.String r10 = "passive_access_config"
            org.json.JSONObject r10 = r8.optJSONObject(r10)
            com.yandex.metrica.impl.ob.kg$k$a$a r10 = m29807a((org.json.JSONObject) r10, (boolean) r12)
            r9.f27511o = r10
        L_0x01d7:
            boolean r6 = r6.f28188j
            if (r6 == 0) goto L_0x0280
            com.yandex.metrica.impl.ob.kg$k$a r6 = r7.f27496b
            java.lang.String r9 = "gpl_access_config"
            org.json.JSONObject r8 = r8.optJSONObject(r9)
            com.yandex.metrica.impl.ob.kg$k$a$b r9 = new com.yandex.metrica.impl.ob.kg$k$a$b
            r9.<init>()
            java.lang.String r10 = "scanning_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            boolean r11 = r9.f27521c
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x01f7
            r10 = r11
        L_0x01f7:
            boolean r10 = r10.booleanValue()
            r9.f27521c = r10
            java.lang.String r10 = "last_known_enabled"
            java.lang.Boolean r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30976b((org.json.JSONObject) r8, (java.lang.String) r10)
            boolean r11 = r9.f27520b
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            if (r10 != 0) goto L_0x020c
            r10 = r11
        L_0x020c:
            boolean r10 = r10.booleanValue()
            r9.f27520b = r10
            boolean r10 = r9.f27521c
            if (r10 == 0) goto L_0x027e
            java.lang.String r10 = "priority"
            java.lang.String r10 = com.yandex.metrica.impl.p265ob.C11993ym.m30992e(r8, r10)
            java.lang.String r11 = "duration_seconds"
            java.lang.Long r11 = com.yandex.metrica.impl.p265ob.C11993ym.m30989d(r8, r11)
            java.lang.String r14 = "interval_seconds"
            java.lang.Long r8 = com.yandex.metrica.impl.p265ob.C11993ym.m30989d(r8, r14)
            if (r10 == 0) goto L_0x025f
            java.lang.String r14 = "PRIORITY_NO_POWER"
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x0237
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            goto L_0x025f
        L_0x0237:
            java.lang.String r14 = "PRIORITY_LOW_POWER"
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x0244
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x025f
        L_0x0244:
            java.lang.String r14 = "PRIORITY_BALANCED_POWER_ACCURACY"
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x0252
            r14 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            goto L_0x025f
        L_0x0252:
            java.lang.String r14 = "PRIORITY_HIGH_ACCURACY"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x025f
            r10 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
        L_0x025f:
            if (r13 == 0) goto L_0x027e
            if (r11 == 0) goto L_0x027e
            if (r8 == 0) goto L_0x027e
            com.yandex.metrica.impl.ob.kg$k$a$b$a r10 = new com.yandex.metrica.impl.ob.kg$k$a$b$a
            r10.<init>()
            long r14 = r11.longValue()
            r10.f27523b = r14
            long r14 = r8.longValue()
            r10.f27524c = r14
            int r8 = r13.intValue()
            r10.f27525d = r8
            r9.f27522d = r10
        L_0x027e:
            r6.f27512p = r9
        L_0x0280:
            com.yandex.metrica.impl.ob.kg$k$b r6 = new com.yandex.metrica.impl.ob.kg$k$b
            r6.<init>()
            r7.f27497c = r6
            java.lang.String r6 = "preconditions"
            org.json.JSONObject r5 = r5.optJSONObject(r6)
            if (r5 == 0) goto L_0x035f
            com.yandex.metrica.impl.ob.kg$k$b r6 = r7.f27497c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = "charge_types"
            org.json.JSONArray r9 = r5.optJSONArray(r9)
            if (r9 == 0) goto L_0x02f1
            r10 = 0
        L_0x029f:
            int r11 = r9.length()
            if (r10 >= r11) goto L_0x02f1
            java.lang.String r11 = r9.optString(r10)
            java.lang.String r13 = "USB"
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x02bb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r8.add(r11)
            r11 = 2
            r13 = 3
            goto L_0x02ee
        L_0x02bb:
            java.lang.String r13 = "AC"
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x02cd
            r13 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r8.add(r11)
        L_0x02cb:
            r11 = 2
            goto L_0x02ee
        L_0x02cd:
            r13 = 3
            java.lang.String r14 = "NONE"
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto L_0x02de
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r8.add(r11)
            goto L_0x02cb
        L_0x02de:
            java.lang.String r14 = "WIRELESS"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x02cb
            r11 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r8.add(r14)
        L_0x02ee:
            int r10 = r10 + 1
            goto L_0x029f
        L_0x02f1:
            int r9 = r8.size()
            int[] r9 = new int[r9]
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x02fc:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0310
            java.lang.Object r11 = r8.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r9[r10] = r11
            int r10 = r10 + r12
            goto L_0x02fc
        L_0x0310:
            r6.f27526b = r9
            com.yandex.metrica.impl.ob.kg$k$b r6 = r7.f27497c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = "app_statuses"
            org.json.JSONArray r5 = r5.optJSONArray(r9)
            if (r5 == 0) goto L_0x033e
            r9 = 0
        L_0x0322:
            int r10 = r5.length()
            if (r9 >= r10) goto L_0x033e
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f27736a
            java.lang.String r11 = ""
            java.lang.String r11 = r5.optString(r9, r11)
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x033b
            r8.add(r10)
        L_0x033b:
            int r9 = r9 + 1
            goto L_0x0322
        L_0x033e:
            int r5 = r8.size()
            int[] r5 = new int[r5]
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
        L_0x0349:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x035d
            java.lang.Object r10 = r8.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r5[r9] = r10
            int r9 = r9 + r12
            goto L_0x0349
        L_0x035d:
            r6.f27527c = r5
        L_0x035f:
            com.yandex.metrica.impl.ob.Wc r5 = r0.mo63628a((com.yandex.metrica.impl.p265ob.C11428kg.C11441k) r7)
            r1.add(r5)
        L_0x0366:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x036a:
            r0 = r17
            r0.mo63954b((java.util.List<com.yandex.metrica.impl.p265ob.C10883Wc>) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11533mj.mo63327a(com.yandex.metrica.impl.ob.vj, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static C11428kg.C11441k.C11442a.C11443a m29807a(JSONObject jSONObject, boolean z) {
        C11428kg.C11441k.C11442a.C11443a aVar = new C11428kg.C11441k.C11442a.C11443a();
        Boolean b = C11993ym.m30976b(jSONObject, "last_known_enabled");
        Boolean valueOf = Boolean.valueOf(aVar.f27515b);
        if (b == null) {
            b = valueOf;
        }
        aVar.f27515b = b.booleanValue();
        Boolean b2 = C11993ym.m30976b(jSONObject, "scanning_enabled");
        Boolean valueOf2 = Boolean.valueOf(z);
        if (b2 == null) {
            b2 = valueOf2;
        }
        boolean booleanValue = b2.booleanValue();
        aVar.f27516c = booleanValue;
        if (jSONObject != null && booleanValue) {
            C11428kg.C11441k.C11442a.C11443a.C11444a aVar2 = new C11428kg.C11441k.C11442a.C11443a.C11444a();
            Long d = C11993ym.m30989d(jSONObject, "duration_seconds");
            Long valueOf3 = Long.valueOf(aVar2.f27518b);
            if (d == null) {
                d = valueOf3;
            }
            aVar2.f27518b = d.longValue();
            Long d2 = C11993ym.m30989d(jSONObject, "interval_seconds");
            Long valueOf4 = Long.valueOf(aVar2.f27519c);
            if (d2 == null) {
                d2 = valueOf4;
            }
            aVar2.f27519c = d2.longValue();
            aVar.f27517d = aVar2;
        }
        return aVar;
    }
}

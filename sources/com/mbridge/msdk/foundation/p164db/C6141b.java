package com.mbridge.msdk.foundation.p164db;

import android.database.Cursor;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.foundation.db.b */
/* compiled from: CampaignClickDao */
public class C6141b extends C6137a<CommonJumpLoader.JumpLoaderResult> {

    /* renamed from: a */
    public static final String f15185a = C6141b.class.getSimpleName();

    /* renamed from: b */
    private static C6141b f15186b;

    private C6141b(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6141b m15357a(C6146e eVar) {
        C6141b bVar;
        synchronized (C6141b.class) {
            if (f15186b == null) {
                f15186b = new C6141b(eVar);
            }
            bVar = f15186b;
        }
        return bVar;
    }

    /* renamed from: a */
    public final synchronized void mo42947a() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - " + "ts" + ") > " + "cti", (String[]) null);
        } catch (Exception e) {
            C6361q.m16158d(f15185a, e.getMessage());
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo42946a(com.mbridge.msdk.foundation.entity.CampaignEx r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 != 0) goto L_0x0007
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x0007:
            r0 = -1
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r2 = r8.getJumpResult()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C6367v.m16232a((java.lang.Object) r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.<init>()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r4 = "id"
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r4 = "unitid"
            r3.put(r4, r9)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r4 = "result"
            r3.put(r4, r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r2 = "cti"
            int r4 = r8.getClickInterval()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            int r4 = r4 * 1000
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.put(r2, r4)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r2 = "package_name"
            java.lang.String r4 = r8.getPackageName()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.put(r2, r4)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            com.mbridge.msdk.b.b r2 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r4 = r4.mo42896e()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            com.mbridge.msdk.b.a r2 = r2.mo42749b(r4)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r4 = "ts"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            if (r2 == 0) goto L_0x0075
            int r4 = r2.mo42656A()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            if (r4 <= 0) goto L_0x0075
            java.lang.String r4 = "cpei"
            int r5 = r2.mo42656A()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            int r5 = r5 * 1000
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
        L_0x0075:
            if (r2 == 0) goto L_0x008c
            int r4 = r2.mo42657B()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            if (r4 <= 0) goto L_0x008c
            java.lang.String r4 = "cpoci"
            int r2 = r2.mo42657B()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            int r2 = r2 * 1000
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r3.put(r4, r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
        L_0x008c:
            java.lang.String r2 = r8.getId()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            boolean r2 = r7.m15358c(r2, r9)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r4 = 0
            if (r2 == 0) goto L_0x00d3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r2.<init>()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r5 = "id = "
            r2.append(r5)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r8 = r8.getId()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r2.append(r8)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r8 = " AND "
            r2.append(r8)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r8 = "unitid"
            r2.append(r8)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r8 = " = "
            r2.append(r8)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            r2.append(r9)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            android.database.sqlite.SQLiteDatabase r9 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            if (r9 != 0) goto L_0x00c6
            monitor-exit(r7)
            return r0
        L_0x00c6:
            android.database.sqlite.SQLiteDatabase r9 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r2 = "campaignclick"
            int r8 = r9.update(r2, r3, r8, r4)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            long r8 = (long) r8
            monitor-exit(r7)
            return r8
        L_0x00d3:
            android.database.sqlite.SQLiteDatabase r8 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            java.lang.String r9 = "campaignclick"
            long r8 = r8.insert(r9, r4, r3)     // Catch:{ Exception -> 0x00e2, all -> 0x00df }
            monitor-exit(r7)
            return r8
        L_0x00df:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x00e2:
            monitor-exit(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6141b.mo42946a(com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo42948a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065 }
            r1.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = "SELECT id FROM campaignclick WHERE id='"
            r1.append(r2)     // Catch:{ Exception -> 0x0065 }
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "' AND "
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "unitid"
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "='"
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            r1.append(r5)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "' AND "
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "cti"
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = " + "
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "ts"
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = " > "
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0065 }
            r1.append(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0065 }
            android.database.sqlite.SQLiteDatabase r5 = r3.getReadableDatabase()     // Catch:{ Exception -> 0x0065 }
            r1 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r1)     // Catch:{ Exception -> 0x0065 }
            if (r4 == 0) goto L_0x005c
            int r5 = r4.getCount()     // Catch:{ Exception -> 0x0065 }
            if (r5 <= 0) goto L_0x005c
            r4.close()     // Catch:{ Exception -> 0x0065 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x005c:
            if (r4 == 0) goto L_0x0061
            r4.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0061:
            monitor-exit(r3)
            return r0
        L_0x0063:
            r4 = move-exception
            goto L_0x0071
        L_0x0065:
            r4 = move-exception
            java.lang.String r5 = f15185a     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0063 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r5, r4)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)
            return r0
        L_0x0071:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6141b.mo42948a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r11 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r11 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f A[SYNTHETIC, Splitter:B:33:0x005f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult mo42949b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            java.lang.String r2 = "campaignclick"
            r3 = 0
            java.lang.String r4 = "id=? AND unitid=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r6 = 0
            r5[r6] = r11     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r11 = 1
            r5[r11] = r12     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r11 == 0) goto L_0x0049
            int r12 = r11.getCount()     // Catch:{ Exception -> 0x0047 }
            if (r12 <= 0) goto L_0x0049
            boolean r12 = r11.moveToFirst()     // Catch:{ Exception -> 0x0047 }
            if (r12 == 0) goto L_0x0049
            java.lang.String r12 = "result"
            int r12 = r11.getColumnIndex(r12)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r12 = r11.getString(r12)     // Catch:{ Exception -> 0x0047 }
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x0047 }
            if (r1 != 0) goto L_0x0049
            java.lang.Object r12 = com.mbridge.msdk.foundation.tools.C6367v.m16231a((java.lang.String) r12)     // Catch:{ Exception -> 0x0047 }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r12 = (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r12     // Catch:{ Exception -> 0x0047 }
            if (r11 == 0) goto L_0x0045
            r11.close()     // Catch:{ all -> 0x0063 }
        L_0x0045:
            monitor-exit(r10)
            return r12
        L_0x0047:
            r12 = move-exception
            goto L_0x0053
        L_0x0049:
            if (r11 == 0) goto L_0x0059
        L_0x004b:
            r11.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0059
        L_0x004f:
            r12 = move-exception
            goto L_0x005d
        L_0x0051:
            r12 = move-exception
            r11 = r0
        L_0x0053:
            r12.printStackTrace()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0059
            goto L_0x004b
        L_0x0059:
            monitor-exit(r10)
            return r0
        L_0x005b:
            r12 = move-exception
            r0 = r11
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()     // Catch:{ all -> 0x0063 }
        L_0x0062:
            throw r12     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6141b.mo42949b(java.lang.String, java.lang.String):com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult");
    }

    /* renamed from: c */
    private synchronized boolean m15358c(String str, String str2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id='" + str + "' AND " + "unitid" + "= '" + str2 + "'", (String[]) null);
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        }
        rawQuery.close();
        return true;
    }
}

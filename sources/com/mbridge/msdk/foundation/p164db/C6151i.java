package com.mbridge.msdk.foundation.p164db;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.C6195e;

/* renamed from: com.mbridge.msdk.foundation.db.i */
/* compiled from: FqInfoDao */
public final class C6151i extends C6137a<C6195e> {

    /* renamed from: a */
    private static C6151i f15220a;

    private C6151i(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6151i m15437a(C6146e eVar) {
        C6151i iVar;
        synchronized (C6151i.class) {
            if (f15220a == null) {
                f15220a = new C6151i(eVar);
            }
            iVar = f15220a;
        }
        return iVar;
    }

    /* renamed from: a */
    public final synchronized void mo43010a(C6195e eVar) {
        try {
            if (getWritableDatabase() != null) {
                if (eVar != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", eVar.mo43620a());
                    contentValues.put("time", Long.valueOf(eVar.mo43627d()));
                    contentValues.put("unitId", eVar.mo43624b());
                    contentValues.put("type", Integer.valueOf(eVar.mo43626c()));
                    if (m15438a(eVar.mo43624b(), eVar.mo43620a())) {
                        getWritableDatabase().update("fq_info", contentValues, "id = " + eVar.mo43620a() + " AND " + "unitId" + " = " + eVar.mo43624b(), (String[]) null);
                    } else {
                        getWritableDatabase().insert("fq_info", (String) null, contentValues);
                    }
                }
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m15438a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004a }
            r1.<init>()     // Catch:{ Exception -> 0x004a }
            java.lang.String r2 = "select id from fq_info where unitId='"
            r1.append(r2)     // Catch:{ Exception -> 0x004a }
            r1.append(r4)     // Catch:{ Exception -> 0x004a }
            java.lang.String r4 = "' and "
            r1.append(r4)     // Catch:{ Exception -> 0x004a }
            java.lang.String r4 = "id"
            r1.append(r4)     // Catch:{ Exception -> 0x004a }
            java.lang.String r4 = "='"
            r1.append(r4)     // Catch:{ Exception -> 0x004a }
            r1.append(r5)     // Catch:{ Exception -> 0x004a }
            java.lang.String r4 = "'"
            r1.append(r4)     // Catch:{ Exception -> 0x004a }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x004a }
            android.database.sqlite.SQLiteDatabase r5 = r3.getReadableDatabase()     // Catch:{ Exception -> 0x004a }
            r1 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r1)     // Catch:{ Exception -> 0x004a }
            if (r4 == 0) goto L_0x0041
            int r5 = r4.getCount()     // Catch:{ Exception -> 0x004a }
            if (r5 <= 0) goto L_0x0041
            r4.close()     // Catch:{ Exception -> 0x004a }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0041:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ Exception -> 0x004a }
        L_0x0046:
            monitor-exit(r3)
            return r0
        L_0x0048:
            r4 = move-exception
            goto L_0x0050
        L_0x004a:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)
            return r0
        L_0x0050:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6151i.m15438a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43011a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r0.<init>()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r1 = "time<"
            r0.append(r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r0.append(r2)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r1 = " and "
            r0.append(r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r1 = "unitId"
            r0.append(r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r1 = "=?"
            r0.append(r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r2 = 0
            r1[r2] = r5     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            if (r5 == 0) goto L_0x0042
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r2 = "fq_info"
            r5.delete(r2, r0, r1)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0042:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6151i.mo43011a(java.lang.String):void");
    }
}

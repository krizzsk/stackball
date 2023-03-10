package com.mbridge.msdk.foundation.p164db;

import android.content.ContentValues;
import android.database.Cursor;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.l */
/* compiled from: ReplaceTempDao */
public final class C6154l extends C6137a {

    /* renamed from: a */
    private static String f15223a = "ReplaceTempDao";

    /* renamed from: b */
    private static C6154l f15224b;

    private C6154l(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static C6154l m15452a(C6146e eVar) {
        if (f15224b == null) {
            synchronized (C6143d.class) {
                if (f15224b == null) {
                    f15224b = new C6154l(eVar);
                }
            }
        }
        return f15224b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r4 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r4 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo43021a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT * FROM c_replace_temp WHERE d_key = '"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "'"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r3.getReadableDatabase()
            android.database.Cursor r4 = r0.rawQuery(r4, r1)
            if (r4 == 0) goto L_0x004d
            int r0 = r4.getCount()     // Catch:{ all -> 0x004b }
            if (r0 <= 0) goto L_0x004d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            r1 = r0
        L_0x0034:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "d_value"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x004b }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x004b }
            r2.<init>(r0)     // Catch:{ all -> 0x004b }
            r1 = r2
            goto L_0x0034
        L_0x004b:
            r0 = move-exception
            goto L_0x0053
        L_0x004d:
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ all -> 0x004b }
            goto L_0x0069
        L_0x0053:
            java.lang.String r2 = f15223a     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0062 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x006c
        L_0x005e:
            r4.close()
            goto L_0x006c
        L_0x0062:
            r0 = move-exception
            if (r4 == 0) goto L_0x0068
            r4.close()
        L_0x0068:
            throw r0
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x005e
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6154l.mo43021a(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public final void mo43022a(String str, JSONObject jSONObject) {
        boolean z;
        try {
            if (getWritableDatabase() != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("d_key", str);
                contentValues.put("d_value", jSONObject.toString());
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key='" + str + "'", (String[]) null);
                if (rawQuery == null || rawQuery.getCount() <= 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    z = false;
                } else {
                    rawQuery.close();
                    z = true;
                }
                if (!z) {
                    getWritableDatabase().insert("c_replace_temp", (String) null, contentValues);
                    return;
                }
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = '" + str + "'", (String[]) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo43020a() {
        /*
            r8 = this;
            r0 = 604800000(0x240c8400, float:3.046947E-17)
            long r0 = (long) r0
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch:{ Exception -> 0x0026 }
            if (r0 != 0) goto L_0x0010
            goto L_0x002a
        L_0x0010:
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = "c_replace_temp"
            java.lang.String r4 = "time<?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0026 }
            r6 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0026 }
            r5[r6] = r2     // Catch:{ Exception -> 0x0026 }
            r0.delete(r1, r4, r5)     // Catch:{ Exception -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002a:
            android.database.sqlite.SQLiteDatabase r0 = r8.getReadableDatabase()
            java.lang.String r1 = "SELECT * FROM c_replace_temp"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            if (r0 == 0) goto L_0x006e
            int r1 = r0.getCount()     // Catch:{ all -> 0x0069 }
            if (r1 <= 0) goto L_0x006e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
        L_0x0042:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = "d_key"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "d_value"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0067 }
            r4.<init>(r3)     // Catch:{ all -> 0x0067 }
            r1.put(r2, r4)     // Catch:{ all -> 0x0067 }
            goto L_0x0042
        L_0x0065:
            r2 = r1
            goto L_0x008a
        L_0x0067:
            r2 = move-exception
            goto L_0x0074
        L_0x0069:
            r1 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0074
        L_0x006e:
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ all -> 0x0069 }
            goto L_0x008a
        L_0x0074:
            java.lang.String r3 = f15223a     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0083 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r3, r2)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0090
            r0.close()
            goto L_0x0090
        L_0x0083:
            r1 = move-exception
            if (r0 == 0) goto L_0x0089
            r0.close()
        L_0x0089:
            throw r1
        L_0x008a:
            if (r0 == 0) goto L_0x008f
            r0.close()
        L_0x008f:
            r1 = r2
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6154l.mo43020a():org.json.JSONObject");
    }
}

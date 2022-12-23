package com.mbridge.msdk.foundation.p164db;

/* renamed from: com.mbridge.msdk.foundation.db.m */
/* compiled from: ReportErrorDao */
public final class C6155m extends C6137a {

    /* renamed from: a */
    private static C6155m f15225a;

    private C6155m(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6155m m15456a(C6146e eVar) {
        C6155m mVar;
        synchronized (C6155m.class) {
            if (f15225a == null) {
                f15225a = new C6155m(eVar);
            }
            mVar = f15225a;
        }
        return mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo43023a() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = " count(*) "
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x003c }
            r0 = 0
            r9 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x002d }
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0025
            int r1 = r0.getInt(r9)     // Catch:{ Exception -> 0x002d }
            r9 = r1
        L_0x0025:
            if (r0 == 0) goto L_0x0034
        L_0x0027:
            r0.close()     // Catch:{ all -> 0x003c }
            goto L_0x0034
        L_0x002b:
            r1 = move-exception
            goto L_0x0036
        L_0x002d:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0034
            goto L_0x0027
        L_0x0034:
            monitor-exit(r10)
            return r9
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ all -> 0x003c }
        L_0x003b:
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6155m.mo43023a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo43024a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            java.lang.String r1 = "url=?"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r3 = 0
            r2[r3] = r5     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            if (r5 != 0) goto L_0x0012
            monitor-exit(r4)
            return r0
        L_0x0012:
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            java.lang.String r3 = "reporterror"
            int r5 = r5.delete(r3, r1, r2)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            monitor-exit(r4)
            return r5
        L_0x001e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0021:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6155m.mo43024a(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo43025a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            java.lang.String r1 = "url=? and data=?"
            if (r5 != 0) goto L_0x0008
            java.lang.String r5 = ""
        L_0x0008:
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0028, all -> 0x0025 }
            r3 = 0
            r2[r3] = r6     // Catch:{ Exception -> 0x0028, all -> 0x0025 }
            r6 = 1
            r2[r6] = r5     // Catch:{ Exception -> 0x0028, all -> 0x0025 }
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0028, all -> 0x0025 }
            if (r5 != 0) goto L_0x0019
            monitor-exit(r4)
            return r0
        L_0x0019:
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0028, all -> 0x0025 }
            java.lang.String r6 = "reporterror"
            int r5 = r5.delete(r6, r1, r2)     // Catch:{ Exception -> 0x0028, all -> 0x0025 }
            monitor-exit(r4)
            return r5
        L_0x0025:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0028:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6155m.mo43025a(java.lang.String, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0.close();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo43027b() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 0
            java.lang.String r2 = " count(*) "
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r3 = r12.getReadableDatabase()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r4 = "reporterror"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0025 }
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x0025 }
            if (r0 == 0) goto L_0x002c
        L_0x001f:
            r0.close()     // Catch:{ all -> 0x0034 }
            goto L_0x002c
        L_0x0023:
            r1 = move-exception
            goto L_0x002e
        L_0x0025:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x002c
            goto L_0x001f
        L_0x002c:
            monitor-exit(r12)
            return r1
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ all -> 0x0034 }
        L_0x0033:
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6155m.mo43027b():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084 A[SYNTHETIC, Splitter:B:27:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d A[SYNTHETIC, Splitter:B:34:0x008d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.C6201k> mo43026a(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.getReadableDatabase()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r2 = "reporterror"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r9.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r9.append(r12)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r12 = ""
            r9.append(r12)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            if (r12 == 0) goto L_0x0070
            int r1 = r12.getCount()     // Catch:{ Exception -> 0x006b }
            if (r1 <= 0) goto L_0x0070
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x006b }
            r1.<init>()     // Catch:{ Exception -> 0x006b }
        L_0x0030:
            boolean r0 = r12.moveToNext()     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "url"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = "data"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = "method"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r4 = "unitId"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x0069 }
            com.mbridge.msdk.foundation.entity.k r5 = new com.mbridge.msdk.foundation.entity.k     // Catch:{ Exception -> 0x0069 }
            r5.<init>(r0, r3, r2, r4)     // Catch:{ Exception -> 0x0069 }
            r1.add(r5)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0030
        L_0x0067:
            r0 = r1
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            goto L_0x007f
        L_0x006b:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x007f
        L_0x0070:
            if (r12 == 0) goto L_0x0088
            r12.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0088
        L_0x0076:
            r12 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x008b
        L_0x007b:
            r12 = move-exception
            r1 = r0
            r0 = r12
            r12 = r1
        L_0x007f:
            r0.printStackTrace()     // Catch:{ all -> 0x008a }
            if (r12 == 0) goto L_0x0087
            r12.close()     // Catch:{ all -> 0x0091 }
        L_0x0087:
            r0 = r1
        L_0x0088:
            monitor-exit(r11)
            return r0
        L_0x008a:
            r0 = move-exception
        L_0x008b:
            if (r12 == 0) goto L_0x0090
            r12.close()     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6155m.mo43026a(int):java.util.List");
    }
}

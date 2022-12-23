package com.mbridge.msdk.foundation.p164db;

import com.mbridge.msdk.foundation.entity.C6196f;

/* renamed from: com.mbridge.msdk.foundation.db.j */
/* compiled from: FrequenceDao */
public final class C6152j extends C6137a<C6196f> {

    /* renamed from: a */
    private static C6152j f15221a;

    private C6152j(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6152j m15441a(C6146e eVar) {
        C6152j jVar;
        synchronized (C6152j.class) {
            if (f15221a == null) {
                f15221a = new C6152j(eVar);
            }
            jVar = f15221a;
        }
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047 A[Catch:{ Exception -> 0x004b, all -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long[] mo43014a() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "SELECT id FROM frequence WHERE fc_a<impression_count"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getReadableDatabase()     // Catch:{ Exception -> 0x004b, all -> 0x0041 }
            android.database.Cursor r0 = r2.rawQuery(r0, r1)     // Catch:{ Exception -> 0x004b, all -> 0x0041 }
            if (r0 == 0) goto L_0x003b
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            if (r2 <= 0) goto L_0x003b
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            long[] r2 = new long[r2]     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r3 = 0
        L_0x001b:
            boolean r4 = r0.moveToNext()     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            if (r4 == 0) goto L_0x0030
            java.lang.String r4 = "id"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r2[r3] = r4     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ all -> 0x0051 }
        L_0x0035:
            monitor-exit(r7)
            return r2
        L_0x0037:
            r1 = move-exception
            goto L_0x0045
        L_0x0039:
            goto L_0x004c
        L_0x003b:
            if (r0 == 0) goto L_0x004f
        L_0x003d:
            r0.close()     // Catch:{ all -> 0x0051 }
            goto L_0x004f
        L_0x0041:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ all -> 0x0051 }
        L_0x004a:
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x004b:
            r0 = r1
        L_0x004c:
            if (r0 == 0) goto L_0x004f
            goto L_0x003d
        L_0x004f:
            monitor-exit(r7)
            return r1
        L_0x0051:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6152j.mo43014a():long[]");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43015b() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.<init>()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r3 = "ts<"
            r2.append(r3)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.append(r0)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            if (r1 == 0) goto L_0x002e
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r2 = "frequence"
            r3 = 0
            r1.delete(r2, r0, r3)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x002e:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6152j.mo43015b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo43013a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            monitor-enter(r5)     // Catch:{ Exception -> 0x0047, all -> 0x003e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r2.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "SELECT id FROM frequence WHERE id='"
            r2.append(r3)     // Catch:{ all -> 0x003b }
            r2.append(r5)     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch:{ all -> 0x003b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x003b }
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch:{ all -> 0x003b }
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0033
            int r2 = r1.getCount()     // Catch:{ all -> 0x003b }
            if (r2 <= 0) goto L_0x0033
            r2 = 1
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0031:
            monitor-exit(r4)
            return r2
        L_0x0033:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0039:
            monitor-exit(r4)
            return r0
        L_0x003b:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r2     // Catch:{ Exception -> 0x0047, all -> 0x003e }
        L_0x003e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0044:
            throw r5     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ all -> 0x0045 }
            goto L_0x004f
        L_0x004d:
            monitor-exit(r4)
            throw r5
        L_0x004f:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6152j.mo43013a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final synchronized void mo43016b(String str) {
        if (mo43013a(str)) {
            String str2 = "UPDATE frequence Set impression_count=impression_count+1 WHERE id=" + str;
            if (getReadableDatabase() != null) {
                getReadableDatabase().execSQL(str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m15442b(com.mbridge.msdk.foundation.entity.C6196f r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = -1
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "id"
            java.lang.String r4 = r7.mo43628a()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "fc_a"
            int r4 = r7.mo43632b()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "fc_b"
            int r4 = r7.mo43634c()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "ts"
            long r4 = r7.mo43639f()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "impression_count"
            int r4 = r7.mo43636d()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "click_count"
            int r4 = r7.mo43638e()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "ts"
            long r4 = r7.mo43639f()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r7)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.database.sqlite.SQLiteDatabase r7 = r6.getWritableDatabase()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r7 != 0) goto L_0x0067
            monitor-exit(r6)
            return r0
        L_0x0067:
            android.database.sqlite.SQLiteDatabase r7 = r6.getWritableDatabase()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "frequence"
            r4 = 0
            long r0 = r7.insert(r3, r4, r2)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            monitor-exit(r6)
            return r0
        L_0x0074:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0077:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6152j.m15442b(com.mbridge.msdk.foundation.entity.f):long");
    }

    /* renamed from: a */
    public final synchronized void mo43012a(C6196f fVar) {
        if (!mo43013a(fVar.mo43628a())) {
            m15442b(fVar);
        }
    }
}

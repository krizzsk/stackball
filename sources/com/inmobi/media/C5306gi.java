package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.inmobi.media.gi */
/* compiled from: DbStore */
public final class C5306gi {

    /* renamed from: a */
    private static final String f12158a = C5306gi.class.getSimpleName();

    /* renamed from: b */
    private static volatile C5306gi f12159b;

    /* renamed from: c */
    private static final Object f12160c = new Object();

    /* renamed from: d */
    private static final Object f12161d = new Object();

    /* renamed from: e */
    private static int f12162e = 0;

    /* renamed from: f */
    private SQLiteDatabase f12163f;

    private C5306gi() {
        try {
            this.f12163f = new C5305gh(C5314go.m12203c()).getWritableDatabase();
            f12159b = this;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C5306gi m12146a() {
        synchronized (f12161d) {
            f12162e++;
        }
        C5306gi giVar = f12159b;
        if (giVar == null) {
            synchronized (f12160c) {
                giVar = f12159b;
                if (giVar == null) {
                    giVar = new C5306gi();
                    f12159b = giVar;
                }
            }
        }
        return giVar;
    }

    /* renamed from: a */
    public final void mo40637a(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            synchronized (f12160c) {
                if (-1 == mo40635a(str, contentValues)) {
                    mo40639b(str, contentValues, str2, strArr);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final long mo40635a(String str, ContentValues contentValues) {
        long insertWithOnConflict;
        try {
            synchronized (f12160c) {
                insertWithOnConflict = this.f12163f.insertWithOnConflict(str, (String) null, contentValues, 4);
            }
            return insertWithOnConflict;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo40634a(String str, String str2, String[] strArr) {
        int delete;
        try {
            synchronized (f12160c) {
                delete = this.f12163f.delete(str, str2, strArr);
            }
            return delete;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final int mo40639b(String str, ContentValues contentValues, String str2, String[] strArr) {
        int updateWithOnConflict;
        try {
            synchronized (f12160c) {
                updateWithOnConflict = this.f12163f.updateWithOnConflict(str, contentValues, str2, strArr, 4);
            }
            return updateWithOnConflict;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r2 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.content.ContentValues> mo40636a(java.lang.String r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r14 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.Object r3 = f12160c     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r4 = r14
            android.database.sqlite.SQLiteDatabase r5 = r4.f12163f     // Catch:{ all -> 0x003d }
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x003d }
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r0 == 0) goto L_0x0037
        L_0x0026:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r0.<init>()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            android.database.DatabaseUtils.cursorRowToContentValues(r2, r0)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r1.add(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r0 != 0) goto L_0x0026
        L_0x0037:
            r2.close()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r2 == 0) goto L_0x0052
            goto L_0x004f
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            goto L_0x0046
        L_0x0042:
            goto L_0x004d
        L_0x0044:
            r0 = move-exception
            r4 = r14
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.close()
        L_0x004b:
            throw r0
        L_0x004c:
            r4 = r14
        L_0x004d:
            if (r2 == 0) goto L_0x0052
        L_0x004f:
            r2.close()
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5306gi.mo40636a(java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final int mo40633a(String str) {
        Cursor cursor = null;
        try {
            String str2 = "SELECT COUNT(*) FROM " + str + " ; ";
            synchronized (f12160c) {
                cursor = this.f12163f.rawQuery(str2, (String[]) null);
            }
            cursor.moveToFirst();
            int i = cursor.getInt(0);
            cursor.close();
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Exception unused) {
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo40640b(String str, String str2, String[] strArr) {
        Cursor cursor = null;
        try {
            String str3 = "SELECT COUNT(*) FROM " + str + " WHERE " + str2 + " ; ";
            synchronized (f12160c) {
                cursor = this.f12163f.rawQuery(str3, strArr);
            }
            cursor.moveToFirst();
            int i = cursor.getInt(0);
            cursor.close();
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Exception unused) {
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo40642b(String str) {
        try {
            String str2 = "DROP TABLE IF EXISTS \"" + str + "\"";
            synchronized (f12160c) {
                this.f12163f.execSQL(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo40638a(String str, String str2) {
        try {
            String str3 = "CREATE TABLE IF NOT EXISTS " + str + str2 + ";";
            synchronized (f12160c) {
                this.f12163f.execSQL(str3);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo40641b() {
        try {
            synchronized (f12161d) {
                int i = f12162e - 1;
                f12162e = i;
                if (i == 0) {
                    synchronized (f12160c) {
                        this.f12163f.close();
                    }
                    f12159b = null;
                }
            }
        } catch (Exception unused) {
        }
    }
}

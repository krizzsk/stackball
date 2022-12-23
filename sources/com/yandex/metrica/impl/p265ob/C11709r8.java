package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.r8 */
public abstract class C11709r8 {

    /* renamed from: a */
    private final C11906w8 f28073a;

    /* renamed from: b */
    private final C10332H8 f28074b;

    /* renamed from: c */
    private final AtomicLong f28075c;

    /* renamed from: d */
    private final AtomicLong f28076d;

    /* renamed from: e */
    private final AtomicLong f28077e;

    /* renamed from: f */
    private final ContentValues f28078f = new ContentValues();

    C11709r8(C11906w8 w8Var, C10332H8 h8) {
        this.f28073a = w8Var;
        this.f28074b = h8;
        this.f28075c = new AtomicLong(m30177d());
        this.f28076d = new AtomicLong(mo63585a(Long.MAX_VALUE));
        this.f28077e = new AtomicLong(mo61051a());
    }

    /* renamed from: d */
    private long m30177d() {
        try {
            SQLiteDatabase readableDatabase = this.f28073a.getReadableDatabase();
            if (readableDatabase != null) {
                return C11327i.m29164a(readableDatabase, mo61053e());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo61051a();

    /* renamed from: a */
    public synchronized void mo63587a(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f28073a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f28078f.clear();
                this.f28078f.put("incremental_id", Long.valueOf(this.f28077e.get() + 1));
                this.f28078f.put("timestamp", Long.valueOf(j));
                this.f28078f.put("data", str);
                if (writableDatabase.insert(mo61053e(), (String) null, this.f28078f) != -1) {
                    this.f28075c.incrementAndGet();
                    this.f28077e.incrementAndGet();
                    mo61052b(this.f28077e.get());
                    if (this.f28076d.get() > j) {
                        this.f28076d.set(j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long mo63589b() {
        return this.f28076d.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo61052b(long j);

    /* renamed from: c */
    public long mo63591c() {
        return this.f28075c.get();
    }

    /* renamed from: e */
    public abstract String mo61053e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10332H8 mo63592f() {
        return this.f28074b;
    }

    /* renamed from: b */
    public synchronized int mo63588b(int i) {
        int i2;
        i2 = 0;
        if (i < 1) {
            return 0;
        }
        String format = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", new Object[]{"incremental_id", mo61053e()});
        try {
            SQLiteDatabase writableDatabase = this.f28073a.getWritableDatabase();
            if (writableDatabase != null && (i2 = writableDatabase.delete(mo61053e(), format, new String[]{String.valueOf(i)})) > 0) {
                this.f28075c.getAndAdd((long) (-i2));
                this.f28076d.set(mo63585a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i2;
    }

    /* renamed from: c */
    public synchronized int mo63590c(long j) {
        int i;
        i = 0;
        String format = String.format(Locale.US, "%s <= ?", new Object[]{"incremental_id"});
        try {
            SQLiteDatabase writableDatabase = this.f28073a.getWritableDatabase();
            if (writableDatabase != null && (i = writableDatabase.delete(mo61053e(), format, new String[]{String.valueOf(j)})) > 0) {
                this.f28075c.getAndAdd((long) (-i));
                this.f28076d.set(mo63585a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    /* renamed from: a */
    public long mo63585a(long j) {
        String format = String.format(Locale.US, "Select min(%s) from %s", new Object[]{"timestamp", mo61053e()});
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f28073a.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(format, (String[]) null);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 != 0) {
                        j = j2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        C10796U2.m27886a(cursor);
        return j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|(2:20|31)|28|11) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(5:7|8|9|10|(8:13|14|15|16|17|(2:20|31)|28|11))(0)|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0051 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.Long, java.lang.String> mo63586a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0056 }
            r0.<init>()     // Catch:{ all -> 0x0056 }
            r1 = 0
            com.yandex.metrica.impl.ob.w8 r2 = r12.f28073a     // Catch:{ all -> 0x0051 }
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0051
            java.lang.String r4 = r12.mo61053e()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "incremental_id"
            java.lang.String r5 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r2, r5}     // Catch:{ all -> 0x0051 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "incremental_id ASC"
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0051 }
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0051 }
        L_0x0029:
            boolean r13 = r1.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x0051
            android.content.ContentValues r13 = r12.f28078f     // Catch:{ all -> 0x0051 }
            r13.clear()     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r13 = r12.f28078f     // Catch:{ all -> 0x0051 }
            com.yandex.metrica.impl.p265ob.C11327i.m29170a((android.database.Cursor) r1, (android.content.ContentValues) r13)     // Catch:{ all -> 0x0039 }
        L_0x0039:
            android.content.ContentValues r13 = r12.f28078f     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "incremental_id"
            java.lang.Long r13 = r13.getAsLong(r2)     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r2 = r12.f28078f     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "data"
            java.lang.String r2 = r2.getAsString(r3)     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x0029
            if (r2 == 0) goto L_0x0029
            r0.put(r13, r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0029
        L_0x0051:
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r12)
            return r0
        L_0x0056:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11709r8.mo63586a(int):java.util.Map");
    }
}

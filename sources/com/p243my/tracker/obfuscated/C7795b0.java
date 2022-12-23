package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: com.my.tracker.obfuscated.b0 */
final class C7795b0 {

    /* renamed from: v */
    static long f19820v = -1;

    /* renamed from: a */
    private final String[] f19821a = new String[1];

    /* renamed from: b */
    private final SQLiteDatabase f19822b;

    /* renamed from: c */
    private final C7802g f19823c = new C7802g();

    /* renamed from: d */
    private final SQLiteStatement f19824d;

    /* renamed from: e */
    private final SQLiteStatement f19825e;

    /* renamed from: f */
    private final SQLiteStatement f19826f;

    /* renamed from: g */
    private final SQLiteStatement f19827g;

    /* renamed from: h */
    private final SQLiteStatement f19828h;

    /* renamed from: i */
    private final SQLiteStatement f19829i;

    /* renamed from: j */
    private final SQLiteStatement f19830j;

    /* renamed from: k */
    private final SQLiteStatement f19831k;

    /* renamed from: l */
    private final SQLiteStatement f19832l;

    /* renamed from: m */
    private final SQLiteStatement f19833m;

    /* renamed from: n */
    private final SQLiteStatement f19834n;

    /* renamed from: o */
    private final SQLiteStatement f19835o;

    /* renamed from: p */
    private final SQLiteStatement f19836p;

    /* renamed from: q */
    private final SQLiteStatement f19837q;

    /* renamed from: r */
    private final SQLiteStatement f19838r;

    /* renamed from: s */
    private final SQLiteStatement f19839s;

    /* renamed from: t */
    private final SQLiteStatement f19840t;

    /* renamed from: u */
    private final SQLiteStatement f19841u;

    /* renamed from: com.my.tracker.obfuscated.b0$a */
    static abstract class C7796a implements Closeable {

        /* renamed from: a */
        final Cursor f19842a;

        C7796a(Cursor cursor) {
            this.f19842a = cursor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo52224a() {
            return this.f19842a.moveToNext();
        }

        public final void close() {
            try {
                this.f19842a.close();
            } catch (Throwable th) {
                C7877u0.m21552b("AbstractReader error: error while closing cursor", th);
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$b */
    static final class C7797b extends C7796a {
        C7797b(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte[] mo52227b() {
            return this.f19842a.getBlob(3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo52228c() {
            return this.f19842a.getLong(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo52229d() {
            return this.f19842a.getLong(4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo52230e() {
            return this.f19842a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$c */
    static final class C7798c extends C7796a {
        C7798c(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo52231b() {
            return this.f19842a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$d */
    static final class C7799d extends C7796a {
        C7799d(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo52232b() {
            return this.f19842a.getString(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo52233c() {
            return this.f19842a.getLong(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo52234d() {
            return this.f19842a.getString(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo52235e() {
            return this.f19842a.getLong(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$e */
    static final class C7800e extends C7796a {
        C7800e(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo52236b() {
            return this.f19842a.getLong(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo52237c() {
            return this.f19842a.getString(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo52238d() {
            return this.f19842a.isNull(2) ? C7795b0.f19820v : this.f19842a.getLong(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo52239e() {
            return this.f19842a.getLong(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$f */
    static final class C7801f extends C7796a {
        C7801f(Cursor cursor) {
            super(cursor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo52240b() {
            return this.f19842a.getLong(2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo52241c() {
            return this.f19842a.getLong(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo52242d() {
            return this.f19842a.isNull(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$g */
    static final class C7802g implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        long f19843a;

        /* renamed from: b */
        byte[] f19844b;

        C7802g() {
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f19843a);
            sQLiteQuery.bindBlob(2, this.f19844b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private C7795b0(SQLiteDatabase sQLiteDatabase) {
        this.f19822b = sQLiteDatabase;
        this.f19824d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f19825e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f19826f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f19827g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f19828h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f19829i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f19830j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f19831k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f19832l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f19833m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f19834n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f19838r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f19835o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f19836p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f19839s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f19837q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f19840t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f19841u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
    }

    /* renamed from: a */
    static C7795b0 m21077a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
            if (openOrCreateDatabase == null) {
                C7877u0.m21551b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (openOrCreateDatabase.getVersion() != 8) {
                openOrCreateDatabase.close();
                context.deleteDatabase(str2);
                openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
                openOrCreateDatabase.setVersion(8);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
            }
            return new C7795b0(openOrCreateDatabase);
        } catch (Throwable th) {
            C7877u0.m21552b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo52195a(int i, byte[] bArr, boolean z) {
        this.f19824d.bindLong(1, (long) i);
        this.f19824d.bindLong(2, z ? 1 : 0);
        this.f19824d.bindBlob(3, bArr);
        return this.f19824d.executeInsert();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo52196a(long j, long j2) {
        this.f19838r.bindLong(1, j);
        this.f19838r.bindLong(2, j2);
        return (long) this.f19838r.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo52197a(long j, byte[] bArr) {
        C7802g gVar = this.f19823c;
        gVar.f19843a = j;
        gVar.f19844b = bArr;
        Cursor rawQueryWithFactory = this.f19822b.rawQueryWithFactory(gVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", (String[]) null, (String) null);
        try {
            if (rawQueryWithFactory.moveToNext()) {
                long j2 = rawQueryWithFactory.getLong(0);
                rawQueryWithFactory.close();
                return j2;
            }
            rawQueryWithFactory.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo52198a(String str, long j) {
        this.f19826f.bindString(1, str);
        this.f19826f.bindLong(2, j);
        return this.f19826f.executeInsert();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo52199a(String str, String str2, long j) {
        this.f19829i.bindString(1, str);
        this.f19829i.bindString(2, str2);
        this.f19829i.bindLong(3, j);
        return this.f19829i.executeInsert();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7800e mo52200a(String str) {
        String[] strArr = this.f19821a;
        strArr[0] = str;
        return new C7800e(this.f19822b.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52201a() {
        this.f19833m.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52202a(long j) {
        this.f19841u.bindLong(1, j);
        this.f19841u.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52203a(long j, long j2, long j3) {
        if (j2 != f19820v) {
            this.f19831k.bindLong(1, j2);
        } else {
            this.f19831k.bindNull(1);
        }
        this.f19831k.bindLong(2, j3);
        this.f19831k.bindLong(3, j);
        this.f19831k.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52204a(long j, long j2, boolean z, long j3) {
        this.f19827g.bindLong(1, j);
        this.f19827g.bindLong(2, j2);
        SQLiteStatement sQLiteStatement = this.f19827g;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j3);
        }
        this.f19827g.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52205a(String str, Long l) {
        SQLiteStatement sQLiteStatement;
        if (l == null) {
            this.f19840t.bindString(1, str);
            sQLiteStatement = this.f19840t;
        } else {
            long longValue = l.longValue();
            this.f19828h.bindString(1, str);
            this.f19828h.bindLong(2, longValue);
            if (this.f19828h.executeInsert() == f19820v) {
                this.f19832l.bindLong(1, longValue);
                this.f19832l.bindString(2, str);
                sQLiteStatement = this.f19832l;
            } else {
                return;
            }
        }
        sQLiteStatement.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo52206b(long j) {
        this.f19821a[0] = String.valueOf(j);
        Cursor rawQuery = this.f19822b.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f19821a);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo52207b(long j, long j2) {
        this.f19839s.bindLong(1, j);
        this.f19839s.bindLong(2, j2);
        return (long) this.f19839s.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7797b mo52208b(long j, byte[] bArr) {
        C7802g gVar = this.f19823c;
        gVar.f19843a = j;
        gVar.f19844b = bArr;
        return new C7797b(this.f19822b.rawQueryWithFactory(gVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", (String[]) null, (String) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Long mo52209b(String str) {
        String[] strArr = this.f19821a;
        strArr[0] = str;
        Cursor rawQuery = this.f19822b.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (rawQuery.moveToNext()) {
                Long valueOf = Long.valueOf(rawQuery.getLong(0));
                rawQuery.close();
                return valueOf;
            }
            rawQuery.close();
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52210b() {
        this.f19834n.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7798c mo52211c(long j) {
        this.f19821a[0] = String.valueOf(j);
        return new C7798c(this.f19822b.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f19821a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo52212c() {
        this.f19835o.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo52213c(long j, long j2) {
        this.f19825e.bindLong(1, j);
        this.f19825e.bindLong(2, j2);
        this.f19825e.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo52214d(long j) {
        this.f19821a[0] = String.valueOf(j);
        Cursor rawQuery = this.f19822b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f19821a);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo52215d() {
        this.f19836p.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo52216d(long j, long j2) {
        this.f19830j.bindLong(1, j2);
        this.f19830j.bindLong(2, j);
        this.f19830j.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo52217e(long j) {
        this.f19821a[0] = String.valueOf(j);
        Cursor rawQuery = this.f19822b.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f19821a);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo52218e() {
        this.f19837q.execute();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7797b mo52219f() {
        return new C7797b(this.f19822b.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", (String[]) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7801f mo52220f(long j) {
        this.f19821a[0] = String.valueOf(j);
        return new C7801f(this.f19822b.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f19821a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo52221g() {
        Cursor rawQuery = this.f19822b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo52222h() {
        Cursor rawQuery = this.f19822b.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7799d mo52223i() {
        return new C7799d(this.f19822b.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", (String[]) null));
    }
}

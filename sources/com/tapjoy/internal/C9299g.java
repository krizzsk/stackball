package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.g */
public final class C9299g extends C9076at implements C9081ax, Closeable {

    /* renamed from: a */
    private SQLiteDatabase f22991a;

    /* renamed from: b */
    private final C9088bd f22992b;

    /* renamed from: c */
    private int f22993c;

    public C9299g(File file, C9088bd bdVar) {
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        this.f22991a = openOrCreateDatabase;
        this.f22992b = bdVar;
        if (openOrCreateDatabase.getVersion() != 1) {
            this.f22991a.beginTransaction();
            try {
                this.f22991a.execSQL("CREATE TABLE IF NOT EXISTS List(value BLOB)");
                this.f22991a.setVersion(1);
                this.f22991a.setTransactionSuccessful();
            } finally {
                this.f22991a.endTransaction();
            }
        }
        this.f22993c = m24925a();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
        super.finalize();
    }

    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.f22991a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f22991a = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: a */
    private int m24925a() {
        Cursor cursor = 0;
        try {
            cursor = this.f22991a.rawQuery("SELECT COUNT(1) FROM List", cursor);
            if (cursor.moveToNext()) {
                return cursor.getInt(0);
            }
            m24926a(cursor);
            return 0;
        } finally {
            m24926a((Cursor) cursor);
        }
    }

    public final int size() {
        return this.f22993c;
    }

    public final void clear() {
        this.f22991a.delete("List", "1", (String[]) null);
        this.f22993c = 0;
    }

    public final boolean offer(Object obj) {
        C9464jp.m25446a(obj);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f22992b.mo57833a(byteArrayOutputStream, obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C9476jz.m25460a(byteArrayOutputStream);
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", byteArray);
            if (this.f22991a.insert("List", (String) null, contentValues) == -1) {
                return false;
            }
            this.f22993c++;
            return true;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (Throwable th) {
            C9476jz.m25460a(byteArrayOutputStream);
            throw th;
        }
    }

    public final Object poll() {
        if (this.f22993c <= 0) {
            return null;
        }
        Object peek = peek();
        mo57778b(1);
        return peek;
    }

    public final Object peek() {
        if (this.f22993c > 0) {
            return mo57777a(0);
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo57777a(int i) {
        ByteArrayInputStream byteArrayInputStream;
        if (i < 0 || i >= this.f22993c) {
            throw new IndexOutOfBoundsException();
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f22991a;
            cursor = sQLiteDatabase.rawQuery("SELECT value FROM List ORDER BY rowid LIMIT " + i + ",1", (String[]) null);
            if (cursor.moveToNext()) {
                byteArrayInputStream = new ByteArrayInputStream(cursor.getBlob(0));
                Object b = this.f22992b.mo57832b(byteArrayInputStream);
                C9476jz.m25460a(byteArrayInputStream);
                m24926a(cursor);
                return b;
            }
            throw new NoSuchElementException();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } catch (Throwable th) {
            m24926a(cursor);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo57778b(int i) {
        int i2;
        if (i <= 0 || i > (i2 = this.f22993c)) {
            throw new IndexOutOfBoundsException();
        } else if (i == i2) {
            clear();
        } else {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = this.f22991a;
                StringBuilder sb = new StringBuilder("SELECT rowid FROM List ORDER BY rowid LIMIT ");
                sb.append(i - 1);
                sb.append(",1");
                Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
                try {
                    if (rawQuery.moveToNext()) {
                        long j = rawQuery.getLong(0);
                        rawQuery.close();
                        SQLiteDatabase sQLiteDatabase2 = this.f22991a;
                        int delete = sQLiteDatabase2.delete("List", "rowid <= " + j, (String[]) null);
                        this.f22993c = this.f22993c - delete;
                        if (delete == i) {
                            m24926a((Cursor) null);
                            return;
                        }
                        throw new IllegalStateException("Try to delete " + i + ", but deleted " + delete);
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    m24926a(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m24926a(cursor);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static Cursor m24926a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        cursor.close();
        return null;
    }
}

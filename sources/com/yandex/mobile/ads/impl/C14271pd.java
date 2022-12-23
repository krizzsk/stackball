package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.pd */
final class C14271pd {

    /* renamed from: c */
    private static final String[] f38586c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final C13859lj f38587a;

    /* renamed from: b */
    private String f38588b;

    public C14271pd(C13859lj ljVar) {
        this.f38587a = ljVar;
    }

    /* renamed from: a */
    public void mo69353a(long j) throws C13713kj {
        SQLiteDatabase writableDatabase;
        try {
            String hexString = Long.toHexString(j);
            this.f38588b = "ExoPlayerCacheFileMetadata" + hexString;
            if (hj1.m36993a(this.f38587a.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = this.f38587a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                hj1.m36994a(writableDatabase, 2, hexString, 1);
                String str = this.f38588b;
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                writableDatabase.execSQL("CREATE TABLE " + this.f38588b + " " + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C13713kj(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo69355a(String str, long j, long j2) throws C13713kj {
        this.f38588b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f38587a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f38588b, (String) null, contentValues);
        } catch (SQLException e) {
            throw new C13713kj(e);
        }
    }

    /* renamed from: a */
    public void mo69354a(String str) throws C13713kj {
        this.f38588b.getClass();
        try {
            this.f38587a.getWritableDatabase().delete(this.f38588b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C13713kj(e);
        }
    }

    /* renamed from: a */
    public void mo69356a(Set<String> set) throws C13713kj {
        SQLiteDatabase writableDatabase;
        this.f38588b.getClass();
        try {
            writableDatabase = this.f38587a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (String str : set) {
                writableDatabase.delete(this.f38588b, "name = ?", new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C13713kj(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public Map<String, C14179od> mo69352a() throws C13713kj {
        Cursor query;
        try {
            this.f38588b.getClass();
            query = this.f38587a.getReadableDatabase().query(this.f38588b, f38586c, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), new C14179od(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (SQLException e) {
            throw new C13713kj(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}

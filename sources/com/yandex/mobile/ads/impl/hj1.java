package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class hj1 {
    /* renamed from: a */
    public static void m36994a(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws C13713kj {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", (String) null, contentValues);
        } catch (SQLException e) {
            throw new C13713kj(e);
        }
    }

    /* renamed from: b */
    public static void m36996b(SQLiteDatabase sQLiteDatabase, int i, String str) throws C13713kj {
        try {
            if (m36995a(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str});
            }
        } catch (SQLException e) {
            throw new C13713kj(e);
        }
    }

    /* renamed from: a */
    public static int m36993a(SQLiteDatabase sQLiteDatabase, int i, String str) throws C13713kj {
        Cursor query;
        try {
            if (!m36995a(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, (String) null, (String) null, (String) null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i2 = query.getInt(0);
            query.close();
            return i2;
        } catch (SQLException e) {
            throw new C13713kj(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    static boolean m36995a(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.exoplayer2.database.ExoDatabaseProvider;

public final class i40 extends SQLiteOpenHelper implements C13859lj {
    public i40(Context context) {
        super(context.getApplicationContext(), ExoDatabaseProvider.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    str = "DROP " + string + " IF EXISTS " + string2;
                    sQLiteDatabase.execSQL(str);
                }
            } catch (SQLException e) {
                bk0.m34269a("ExoDatabaseProvider", "Error executing " + str, e);
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        query.close();
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.k9 */
public class C11421k9 extends C10628P8 {

    /* renamed from: a */
    private static final String f27387a = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C12017z6.FOREGROUND.mo64185a() + "," + "app_environment" + " TEXT DEFAULT '" + "{}" + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + " )");

    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "app_environment" + " TEXT DEFAULT '{}'");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "app_environment_revision" + " INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
        sQLiteDatabase.execSQL(f27387a);
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                    String asString = contentValues.getAsString("environment");
                    contentValues.remove("environment");
                    contentValues.put("error_environment", asString);
                    sQLiteDatabase.insert("reports", (String) null, contentValues);
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    C10796U2.m27886a(cursor);
                    throw th;
                }
            }
            C10796U2.m27886a(rawQuery);
            sQLiteDatabase.execSQL("DROP TABLE reports_backup");
        } catch (Throwable th2) {
            th = th2;
            C10796U2.m27886a(cursor);
            throw th;
        }
    }
}

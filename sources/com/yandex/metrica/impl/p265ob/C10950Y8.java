package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p265ob.C10591O8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.Y8 */
public class C10950Y8 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS startup (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL(C10591O8.C10592a.C10594b.f25323a);
        sQLiteDatabase.execSQL(C10591O8.C10592a.C10593a.f25321a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}

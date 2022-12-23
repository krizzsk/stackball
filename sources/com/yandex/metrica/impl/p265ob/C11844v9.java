package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.v9 */
public class C11844v9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "report_request_parameters" + " TEXT DEFAULT ''");
    }
}

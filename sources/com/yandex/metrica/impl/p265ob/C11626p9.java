package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.p9 */
public class C11626p9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "obtained_before_first_sync" + " INTEGER DEFAULT 0");
    }
}

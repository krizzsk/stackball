package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.t9 */
public class C11784t9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2)});
        sQLiteDatabase.delete("sessions", "id = ?", new String[]{String.valueOf(-2)});
    }
}

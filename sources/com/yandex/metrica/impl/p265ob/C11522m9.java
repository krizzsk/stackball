package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TapjoyConstants;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.m9 */
public class C11522m9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + TapjoyConstants.TJC_CONNECTION_TYPE + " INTEGER DEFAULT 2");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cellular_connection_type" + " TEXT ");
    }
}

package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p265ob.C10474M;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.w9 */
public class C11907w9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "battery_charge_type", Integer.valueOf(C10474M.C10476b.C10477a.UNKNOWN.mo61753a())}));
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"reports", "collection_mode"}));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = \"\" WHERE %s == %d AND %2$s != \"\" AND %2$s IS NOT NULL", new Object[]{"reports", "value", "type", Integer.valueOf(C11413k1.EVENT_TYPE_START.mo63170b())}));
    }
}

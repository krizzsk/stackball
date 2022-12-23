package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p265ob.C10842Vf;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.B9 */
public class C10130B9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "open_id", Long.valueOf(new C10842Vf.C10847d.C10848a().f26068x)}));
    }
}

package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.q9 */
public class C11677q9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(C11538mn.NONE.mo63328a())}));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = %d where %s=%d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(C11538mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.mo63328a()), "type", Integer.valueOf(C11413k1.EVENT_TYPE_IDENTITY.mo63170b())}));
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}

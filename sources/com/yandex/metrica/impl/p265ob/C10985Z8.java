package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p265ob.C10591O8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.Z8 */
public class C10985Z8 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(C10591O8.C10592a.C10594b.f25324b);
        sQLiteDatabase.execSQL(C10591O8.C10592a.C10593a.f25322b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}

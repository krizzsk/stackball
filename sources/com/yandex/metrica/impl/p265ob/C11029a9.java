package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.YandexMetrica;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.a9 */
public class C11029a9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS api_level_info (API_LEVEL INT )");
        ContentValues contentValues = new ContentValues();
        contentValues.put("API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        sQLiteDatabase.insert("api_level_info", "API_LEVEL", contentValues);
    }
}

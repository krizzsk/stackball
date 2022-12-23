package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.e9 */
public class C11193e9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS permissions (name TEXT PRIMARY KEY,granted INTEGER)");
    }
}

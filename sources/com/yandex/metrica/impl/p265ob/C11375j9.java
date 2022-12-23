package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.j9 */
public class C11375j9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "environment" + " TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "user_info" + " TEXT ");
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE ");
        sb.append("reports");
        sb.append(" ADD COLUMN ");
        sb.append("session_type");
        sb.append(" INTEGER DEFAULT ");
        C12017z6 z6Var = C12017z6.FOREGROUND;
        sb.append(z6Var.mo64185a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append("reports");
        sb2.append(" SET ");
        sb2.append("session_type");
        sb2.append(" = ");
        C12017z6 z6Var2 = C12017z6.BACKGROUND;
        sb2.append(z6Var2.mo64185a());
        sb2.append(" WHERE ");
        sb2.append("session_id");
        sb2.append(" = ");
        sb2.append(-2);
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "server_time_offset" + " INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE " + "sessions" + " ADD COLUMN " + "type" + " INTEGER DEFAULT " + z6Var.mo64185a());
        sQLiteDatabase.execSQL("UPDATE " + "sessions" + " SET " + "type" + " = " + z6Var2.mo64185a() + " WHERE " + "id" + " = " + -2);
    }
}

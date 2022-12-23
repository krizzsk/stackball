package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C0580a0;

/* renamed from: com.adcolony.sdk.m */
class C0754m {
    C0754m() {
    }

    /* renamed from: a */
    static void m622a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.insertOrThrow(str, (String) null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                C0580a0.C0581a aVar = new C0580a0.C0581a();
                C0580a0.C0581a a = aVar.mo9419a("Exception on insert to " + str + ", db version:").mo9417a(sQLiteDatabase.getVersion());
                a.mo9419a(". Values: " + contentValues.toString() + " caused: ").mo9419a(e.toString()).mo9421a(C0580a0.f190h);
            } catch (Throwable th) {
                C0580a0.C0581a aVar2 = new C0580a0.C0581a();
                C0580a0.C0581a a2 = aVar2.mo9419a("Error on insert to " + str + ", db version:").mo9417a(sQLiteDatabase.getVersion());
                a2.mo9419a(". Values: " + contentValues.toString() + " caused: ").mo9419a(th.toString()).mo9421a(C0580a0.f192j);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    static void m621a(int i, long j, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            if (str == null) {
                str = "rowid";
                j = -1;
            }
            if (i >= 0) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, (String[]) null);
                if (rawQuery.moveToFirst()) {
                    j = Math.max(j, rawQuery.getLong(0));
                }
                rawQuery.close();
            }
            if (j >= 0) {
                sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                new C0580a0.C0581a().mo9419a("Exception on deleting excessive rows:").mo9419a(e.toString()).mo9421a(C0580a0.f190h);
            } catch (Throwable th) {
                new C0580a0.C0581a().mo9419a("Error on deleting excessive rows:").mo9419a(th.toString()).mo9421a(C0580a0.f192j);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }
}

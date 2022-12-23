package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.Oa */
class C10600Oa implements C11976y8 {

    /* renamed from: a */
    private final C10452L8 f25333a;

    public C10600Oa(C10452L8 l8, String str) {
        this.f25333a = l8;
    }

    /* renamed from: a */
    public void mo61855a(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f25333a.mo61713a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabase.insertWithOnConflict("binary_data", (String) null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = sQLiteDatabase2;
            this.f25333a.mo61714a(sQLiteDatabase);
        }
        this.f25333a.mo61714a(sQLiteDatabase);
    }

    /* renamed from: b */
    public void mo61857b(String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f25333a.mo61713a();
            if (sQLiteDatabase != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabase.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f25333a.mo61714a(sQLiteDatabase);
    }

    /* renamed from: a */
    public byte[] mo61856a(String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f25333a.mo61713a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query("binary_data", (String[]) null, "data_key = ?", new String[]{str}, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                                byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("value"));
                                C10796U2.m27886a(cursor);
                                this.f25333a.mo61714a(sQLiteDatabase);
                                return blob;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (cursor != null) {
                        cursor.getCount();
                    }
                } catch (Throwable unused2) {
                }
                C10796U2.m27886a(cursor);
                this.f25333a.mo61714a(sQLiteDatabase);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
            sQLiteDatabase = null;
        }
        C10796U2.m27886a(cursor);
        this.f25333a.mo61714a(sQLiteDatabase);
        return null;
    }
}

package com.yandex.metrica.impl.p265ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.C8 */
public class C10157C8 {

    /* renamed from: a */
    private final C10452L8 f24445a;

    public C10157C8(C11906w8 w8Var, String str) {
        this((C10452L8) new C10543N8(w8Var), str);
    }

    /* renamed from: a */
    public void mo61139a() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f24445a.mo61713a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f24445a.mo61714a(sQLiteDatabase);
    }

    /* renamed from: b */
    public List<C11347ie> mo61140b() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f24445a.mo61713a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query("permissions", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new C11347ie(cursor.getString(cursor.getColumnIndex("name")), cursor.getLong(cursor.getColumnIndex("granted")) == 1));
                                } while (cursor.moveToNext());
                                this.f24445a.mo61714a(sQLiteDatabase);
                                C10796U2.m27886a(cursor);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                this.f24445a.mo61714a(sQLiteDatabase);
                C10796U2.m27886a(cursor);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
            cursor = null;
        }
        this.f24445a.mo61714a(sQLiteDatabase);
        C10796U2.m27886a(cursor);
        return null;
    }

    C10157C8(C10452L8 l8, String str) {
        this.f24445a = l8;
    }
}

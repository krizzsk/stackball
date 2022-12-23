package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.N8 */
public class C10543N8 implements C10452L8 {

    /* renamed from: a */
    private final C11906w8 f25241a;

    public C10543N8(C11906w8 w8Var) {
        this.f25241a = w8Var;
    }

    /* renamed from: a */
    public SQLiteDatabase mo61713a() {
        try {
            return this.f25241a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo61714a(SQLiteDatabase sQLiteDatabase) {
    }
}

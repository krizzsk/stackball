package com.mbridge.msdk.foundation.p164db;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.mbridge.msdk.foundation.db.a */
/* compiled from: BaseDao */
public class C6137a<T> {
    protected C6146e mHelper = null;

    public C6137a(C6146e eVar) {
        this.mHelper = eVar;
    }

    /* access modifiers changed from: protected */
    public synchronized SQLiteDatabase getReadableDatabase() {
        return this.mHelper.mo42996a();
    }

    /* access modifiers changed from: protected */
    public synchronized SQLiteDatabase getWritableDatabase() {
        return this.mHelper.mo42999b();
    }
}

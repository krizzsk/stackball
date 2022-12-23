package com.mbridge.msdk.foundation.p164db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.mbridge.msdk.foundation.db.e */
/* compiled from: CommonAbsDBHelper */
public abstract class C6146e {

    /* renamed from: a */
    private C6147a f15213a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42997a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42998a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo43000b(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo43001c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo43002d();

    public C6146e(Context context) {
        this.f15213a = new C6147a(context, mo43001c(), mo43002d());
    }

    /* renamed from: a */
    public final SQLiteDatabase mo42996a() {
        return this.f15213a.getReadableDatabase();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.database.sqlite.SQLiteDatabase mo42999b() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.mbridge.msdk.foundation.db.e$a r0 = r1.f15213a     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            goto L_0x000c
        L_0x0008:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x000b:
            r0 = 0
        L_0x000c:
            monitor-exit(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6146e.mo42999b():android.database.sqlite.SQLiteDatabase");
    }

    /* renamed from: com.mbridge.msdk.foundation.db.e$a */
    /* compiled from: CommonAbsDBHelper */
    private class C6147a extends SQLiteOpenHelper {
        public C6147a(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            C6146e.this.mo42997a(sQLiteDatabase);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C6146e.this.mo42998a(sQLiteDatabase, i, i2);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C6146e.this.mo43000b(sQLiteDatabase, i, i2);
        }
    }
}

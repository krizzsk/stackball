package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.w8 */
public class C11906w8 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    private final String f28636a;

    /* renamed from: b */
    private final C10380Im f28637b;

    /* renamed from: c */
    protected final C10214E8 f28638c;

    public C11906w8(Context context, String str, C10214E8 e8) {
        this(context, str, e8, C12038zm.m31085a());
    }

    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f28637b.mo64222a(th, "", new Object[0]);
            this.f28637b.mo64224b("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f28636a);
            ((C10552Nh) C10611Oh.m27142a()).reportError("db_read_error", th);
            return null;
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f28637b.mo64222a(th, "", new Object[0]);
            this.f28637b.mo64224b("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f28636a);
            ((C10552Nh) C10611Oh.m27142a()).reportError("db_write_error", th);
            return null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f28638c.mo61220a(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f28638c.mo61221a(sQLiteDatabase, i, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f28638c.mo61222b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f28638c.mo61223b(sQLiteDatabase, i, i2);
    }

    C11906w8(Context context, String str, C10214E8 e8, C10380Im im) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C10591O8.f25316a);
        this.f28638c = e8;
        this.f28636a = str;
        this.f28637b = im;
    }
}

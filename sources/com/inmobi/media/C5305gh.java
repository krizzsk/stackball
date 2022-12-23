package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.inmobi.media.gh */
/* compiled from: DbHelper */
public final class C5305gh extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f12157a = ("com.im_" + C5315gp.m12226b() + ".db");

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C5305gh(Context context) {
        super(context, f12157a, (SQLiteDatabase.CursorFactory) null, 1);
    }
}

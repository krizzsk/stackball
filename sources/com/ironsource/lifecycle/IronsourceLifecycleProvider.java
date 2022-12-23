package com.ironsource.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

public class IronsourceLifecycleProvider extends ContentProvider {

    /* renamed from: a */
    private static boolean f12749a = false;

    /* renamed from: a */
    static boolean m13187a() {
        return f12749a;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        f12749a = true;
        C5537c a = C5537c.m13194a();
        Context context = getContext();
        if (C5537c.f12751a.compareAndSet(false, true)) {
            a.f12753b = new Handler(Looper.getMainLooper());
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(a);
            }
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

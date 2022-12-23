package com.smaato.sdk.sys;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class LifecycleProvider extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        if (uri != null) {
            return 0;
        }
        throw new NullPointerException("'uri' specified as non-null is null");
    }

    public String getType(Uri uri) {
        if (uri != null) {
            return null;
        }
        throw new NullPointerException("'uri' specified as non-null is null");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (uri != null) {
            return null;
        }
        throw new NullPointerException("'uri' specified as non-null is null");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri != null) {
            return null;
        }
        throw new NullPointerException("'uri' specified as non-null is null");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (uri != null) {
            return 0;
        }
        throw new NullPointerException("'uri' specified as non-null is null");
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!(context instanceof Application)) {
            return false;
        }
        Lifecycling.init((Application) context);
        return false;
    }
}

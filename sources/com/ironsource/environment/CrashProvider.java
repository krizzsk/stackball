package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: a */
    private Context f12682a;

    /* renamed from: b */
    private C5526f f12683b;

    /* renamed from: c */
    private String f12684c;

    /* renamed from: d */
    private UriMatcher f12685d = new UriMatcher(-1);

    /* renamed from: e */
    private Uri f12686e;

    /* renamed from: f */
    private int f12687f = 1;

    /* renamed from: g */
    private int f12688g = 2;

    /* renamed from: h */
    private String f12689h;

    /* renamed from: i */
    private String f12690i;

    /* renamed from: j */
    private String f12691j = "REPORTS";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f12685d.match(uri);
        if (match == 1) {
            return this.f12689h;
        }
        if (match == 2) {
            return this.f12690i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f12682a = getContext();
        this.f12683b = new C5526f(this.f12682a);
        this.f12684c = this.f12682a.getPackageName();
        this.f12686e = Uri.parse("content://" + this.f12684c + "/REPORTS");
        this.f12689h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f12690i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f12685d.match(uri);
        if (match == 1) {
            return C5526f.m13127b();
        }
        if (match == 2) {
            return C5526f.m13124a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

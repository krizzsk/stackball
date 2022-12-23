package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class MobileAdsInitializeProvider extends ContentProvider {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31618a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r2.getBoolean(r1, true) == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31619a(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 1
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x0029 }
            int r2 = com.yandex.mobile.ads.C12066R.string.yandex_mobileads_automatic_sdk_initialization     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x0029 }
            r2 = 0
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ Exception -> 0x001b }
            java.lang.String r4 = r7.getPackageName()     // Catch:{ Exception -> 0x001b }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r4, r5)     // Catch:{ Exception -> 0x001b }
            goto L_0x001c
        L_0x001b:
        L_0x001c:
            if (r2 == 0) goto L_0x0029
            android.os.Bundle r2 = r2.metaData     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x002a
            boolean r1 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            com.yandex.mobile.ads.core.initializer.-$$Lambda$MobileAdsInitializeProvider$IzQT8xfLYK_3_52uGZkHhcuuWi0 r0 = com.yandex.mobile.ads.core.initializer.C12149xf8b84335.INSTANCE
            com.yandex.mobile.ads.common.MobileAds.initialize(r7, r0)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.core.initializer.MobileAdsInitializeProvider.m31619a(android.content.Context):void");
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
        Context context = getContext();
        if (context == null) {
            return true;
        }
        m31619a(context);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

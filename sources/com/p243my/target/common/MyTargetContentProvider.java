package com.p243my.target.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.p243my.target.C7374e0;
import com.p243my.target.C7395f0;

/* renamed from: com.my.target.common.MyTargetContentProvider */
public final class MyTargetContentProvider extends ContentProvider {
    private static final String INFO_INCORRECT = "com.my.target.mytargetcontentprovider";
    private static final String META_DATA_INIT_MODE = "com.my.target.autoInitMode";
    private boolean enabled = true;

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            if (INFO_INCORRECT.equals(providerInfo.authority)) {
                C7374e0.m18991c("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
                this.enabled = false;
            }
            super.attachInfo(context, providerInfo);
        }
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

    public /* synthetic */ void lambda$onCreate$0$MyTargetContentProvider() {
        try {
            Context context = getContext();
            Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(META_DATA_INIT_MODE);
            if (num == null || num.intValue() != 0) {
                C7374e0.m18991c("start autoinitialization");
                MyTargetManager.initSdk(context);
            }
        } catch (Throwable th) {
            C7374e0.m18991c("autoinitialization failed: " + th.getMessage());
        }
    }

    public boolean onCreate() {
        if (!this.enabled) {
            return false;
        }
        C7395f0.m19086a(new Runnable() {
            public final void run() {
                MyTargetContentProvider.this.lambda$onCreate$0$MyTargetContentProvider();
            }
        });
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

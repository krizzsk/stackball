package com.smaato.sdk.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;

public final class AppMetaData {
    private final Context context;

    public AppMetaData(Context context2) {
        this.context = (Context) Objects.requireNonNull(context2, "Parameter context cannot be null for PermissionChecker::new");
    }

    public final boolean isPermissionGranted(String str) {
        Objects.requireNonNull(str);
        try {
            if (this.context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public final boolean isActivityRegistered(Class<? extends Activity> cls) {
        return Intents.canHandleIntent(this.context, new Intent(this.context, cls));
    }
}

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AnalyticsUserIDStore.kt */
final class AnalyticsUserIDStore$setUserID$1 implements Runnable {
    final /* synthetic */ String $id;

    AnalyticsUserIDStore$setUserID$1(String str) {
        this.$id = str;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AnalyticsUserIDStore.lock.writeLock().lock();
                AnalyticsUserIDStore.userID = this.$id;
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
                edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", AnalyticsUserIDStore.userID);
                edit.apply();
                AnalyticsUserIDStore.lock.writeLock().unlock();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}

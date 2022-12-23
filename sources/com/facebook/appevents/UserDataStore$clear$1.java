package com.facebook.appevents;

import android.util.Log;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: UserDataStore.kt */
final class UserDataStore$clear$1 implements Runnable {
    public static final UserDataStore$clear$1 INSTANCE = new UserDataStore$clear$1();

    UserDataStore$clear$1() {
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (!UserDataStore.access$getInitialized$p(UserDataStore.INSTANCE).get()) {
                    Log.w(UserDataStore.access$getTAG$p(UserDataStore.INSTANCE), "initStore should have been called before calling setUserData");
                    UserDataStore.access$initAndWait(UserDataStore.INSTANCE);
                }
                UserDataStore.access$getExternalHashedUserData$p(UserDataStore.INSTANCE).clear();
                UserDataStore.access$getSharedPreferences$p(UserDataStore.INSTANCE).edit().putString("com.facebook.appevents.UserDataStore.userData", (String) null).apply();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}

package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo72093d2 = {"Lcom/facebook/appevents/AnalyticsUserIDStore;", "", "()V", "ANALYTICS_USER_ID_KEY", "", "TAG", "initialized", "", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "userID", "getUserID", "initAndWait", "", "initStore", "setUserID", "id", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: AnalyticsUserIDStore.kt */
public final class AnalyticsUserIDStore {
    private static final String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";
    public static final AnalyticsUserIDStore INSTANCE = new AnalyticsUserIDStore();
    private static final String TAG;
    private static volatile boolean initialized;
    /* access modifiers changed from: private */
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    /* access modifiers changed from: private */
    public static String userID;

    static {
        String simpleName = AnalyticsUserIDStore.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        TAG = simpleName;
    }

    private AnalyticsUserIDStore() {
    }

    @JvmStatic
    public static final void initStore() {
        if (!initialized) {
            InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(AnalyticsUserIDStore$initStore$1.INSTANCE);
        }
    }

    @JvmStatic
    public static final void setUserID(String str) {
        AppEventUtility.assertIsNotMainThread();
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.initAndWait();
        }
        InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new AnalyticsUserIDStore$setUserID$1(str));
    }

    @JvmStatic
    public static final String getUserID() {
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.initAndWait();
        }
        lock.readLock().lock();
        try {
            return userID;
        } finally {
            lock.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    public final void initAndWait() {
        if (!initialized) {
            lock.writeLock().lock();
            try {
                if (!initialized) {
                    userID = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString(ANALYTICS_USER_ID_KEY, (String) null);
                    initialized = true;
                    lock.writeLock().unlock();
                }
            } finally {
                lock.writeLock().unlock();
            }
        }
    }
}

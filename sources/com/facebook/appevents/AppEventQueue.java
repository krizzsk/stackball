package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.unification.sdk.InitializationStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J*\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001fH\u0007J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150(H\u0007J0\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010-\u001a\u00020\u0013H\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, mo72093d2 = {"Lcom/facebook/appevents/AppEventQueue;", "", "()V", "FLUSH_PERIOD_IN_SECONDS", "", "NO_CONNECTIVITY_ERROR_CODE", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "TAG", "", "appEventCollection", "Lcom/facebook/appevents/AppEventCollection;", "flushRunnable", "Ljava/lang/Runnable;", "scheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "add", "", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "appEvent", "Lcom/facebook/appevents/AppEvent;", "buildRequestForSession", "Lcom/facebook/GraphRequest;", "appEvents", "Lcom/facebook/appevents/SessionEventsState;", "limitEventUsage", "", "flushState", "Lcom/facebook/appevents/FlushStatistics;", "buildRequests", "", "flushResults", "flush", "reason", "Lcom/facebook/appevents/FlushReason;", "flushAndWait", "getKeySet", "", "handleResponse", "request", "response", "Lcom/facebook/GraphResponse;", "persistToDisk", "sendEventsToServer", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: AppEventQueue.kt */
public final class AppEventQueue {
    private static final int FLUSH_PERIOD_IN_SECONDS = 15;
    public static final AppEventQueue INSTANCE = new AppEventQueue();
    private static final int NO_CONNECTIVITY_ERROR_CODE = -1;
    private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
    private static final String TAG;
    private static volatile AppEventCollection appEventCollection = new AppEventCollection();
    private static final Runnable flushRunnable = AppEventQueue$flushRunnable$1.INSTANCE;
    private static ScheduledFuture<?> scheduledFuture;
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    static {
        String name = AppEventQueue.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventQueue::class.java.name");
        TAG = name;
    }

    private AppEventQueue() {
    }

    public static final /* synthetic */ AppEventCollection access$getAppEventCollection$p(AppEventQueue appEventQueue) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return appEventCollection;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Runnable access$getFlushRunnable$p(AppEventQueue appEventQueue) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return flushRunnable;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ int access$getNUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER$p(AppEventQueue appEventQueue) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return 0;
        }
        try {
            return NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return 0;
        }
    }

    public static final /* synthetic */ ScheduledFuture access$getScheduledFuture$p(AppEventQueue appEventQueue) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return scheduledFuture;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledExecutorService access$getSingleThreadExecutor$p(AppEventQueue appEventQueue) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return singleThreadExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void access$setAppEventCollection$p(AppEventQueue appEventQueue, AppEventCollection appEventCollection2) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                appEventCollection = appEventCollection2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setScheduledFuture$p(AppEventQueue appEventQueue, ScheduledFuture scheduledFuture2) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                scheduledFuture = scheduledFuture2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void persistToDisk() {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                singleThreadExecutor.execute(AppEventQueue$persistToDisk$1.INSTANCE);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void flush(FlushReason flushReason) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(flushReason, IronSourceConstants.EVENTS_ERROR_REASON);
                singleThreadExecutor.execute(new AppEventQueue$flush$1(flushReason));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void add(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppId");
                Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                singleThreadExecutor.execute(new AppEventQueue$add$1(accessTokenAppIdPair, appEvent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final Set<AccessTokenAppIdPair> getKeySet() {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return appEventCollection.keySet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void flushAndWait(com.facebook.appevents.FlushReason r4) {
        /*
            java.lang.Class<com.facebook.appevents.AppEventQueue> r0 = com.facebook.appevents.AppEventQueue.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.PersistedEvents r1 = com.facebook.appevents.AppEventStore.readAndClearStore()     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.AppEventCollection r2 = appEventCollection     // Catch:{ all -> 0x0051 }
            r2.addPersistedEvents(r1)     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.AppEventCollection r1 = appEventCollection     // Catch:{ Exception -> 0x0046 }
            com.facebook.appevents.FlushStatistics r4 = sendEventsToServer(r4, r1)     // Catch:{ Exception -> 0x0046 }
            if (r4 == 0) goto L_0x0045
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.getNumEvents()     // Catch:{ all -> 0x0051 }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            com.facebook.appevents.FlushResult r4 = r4.getResult()     // Catch:{ all -> 0x0051 }
            java.io.Serializable r4 = (java.io.Serializable) r4     // Catch:{ all -> 0x0051 }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x0051 }
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x0051 }
            androidx.localbroadcastmanager.content.LocalBroadcastManager r4 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r4)     // Catch:{ all -> 0x0051 }
            r4.sendBroadcast(r1)     // Catch:{ all -> 0x0051 }
        L_0x0045:
            return
        L_0x0046:
            r4 = move-exception
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0051 }
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r4 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventQueue.flushAndWait(com.facebook.appevents.FlushReason):void");
    }

    @JvmStatic
    public static final FlushStatistics sendEventsToServer(FlushReason flushReason, AppEventCollection appEventCollection2) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(flushReason, IronSourceConstants.EVENTS_ERROR_REASON);
            Intrinsics.checkNotNullParameter(appEventCollection2, "appEventCollection");
            FlushStatistics flushStatistics = new FlushStatistics();
            List<GraphRequest> buildRequests = buildRequests(appEventCollection2, flushStatistics);
            if (!(!buildRequests.isEmpty())) {
                return null;
            }
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics.getNumEvents()), flushReason.toString());
            for (GraphRequest executeAndWait : buildRequests) {
                executeAndWait.executeAndWait();
            }
            return flushStatistics;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final List<GraphRequest> buildRequests(AppEventCollection appEventCollection2, FlushStatistics flushStatistics) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection2, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushStatistics, "flushResults");
            boolean limitEventAndDataUsage = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair next : appEventCollection2.keySet()) {
                SessionEventsState sessionEventsState = appEventCollection2.get(next);
                if (sessionEventsState != null) {
                    GraphRequest buildRequestForSession = buildRequestForSession(next, sessionEventsState, limitEventAndDataUsage, flushStatistics);
                    if (buildRequestForSession != null) {
                        arrayList.add(buildRequestForSession);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final GraphRequest buildRequestForSession(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState, boolean z, FlushStatistics flushStatistics) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(sessionEventsState, "appEvents");
            Intrinsics.checkNotNullParameter(flushStatistics, "flushState");
            String applicationId = accessTokenAppIdPair.getApplicationId();
            boolean z2 = false;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.Companion;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            GraphRequest newPostRequest = companion.newPostRequest((AccessToken) null, format, (JSONObject) null, (GraphRequest.Callback) null);
            newPostRequest.setForceApplicationRequest(true);
            Bundle parameters = newPostRequest.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("access_token", accessTokenAppIdPair.getAccessTokenString());
            String pushNotificationsRegistrationId = InternalAppEventsLogger.Companion.getPushNotificationsRegistrationId();
            if (pushNotificationsRegistrationId != null) {
                parameters.putString("device_token", pushNotificationsRegistrationId);
            }
            String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
            if (installReferrer != null) {
                parameters.putString("install_referrer", installReferrer);
            }
            newPostRequest.setParameters(parameters);
            if (queryAppSettings != null) {
                z2 = queryAppSettings.supportsImplicitLogging();
            }
            Context applicationContext = FacebookSdk.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "FacebookSdk.getApplicationContext()");
            int populateRequest = sessionEventsState.populateRequest(newPostRequest, applicationContext, z2, z);
            if (populateRequest == 0) {
                return null;
            }
            flushStatistics.setNumEvents(flushStatistics.getNumEvents() + populateRequest);
            newPostRequest.setCallback(new AppEventQueue$buildRequestForSession$1(accessTokenAppIdPair, newPostRequest, sessionEventsState, flushStatistics));
            return newPostRequest;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final void handleResponse(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, GraphResponse graphResponse, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        String str;
        AccessTokenAppIdPair accessTokenAppIdPair2 = accessTokenAppIdPair;
        SessionEventsState sessionEventsState2 = sessionEventsState;
        FlushStatistics flushStatistics2 = flushStatistics;
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair2, "accessTokenAppId");
                Intrinsics.checkNotNullParameter(graphRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
                Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
                Intrinsics.checkNotNullParameter(sessionEventsState2, "appEvents");
                Intrinsics.checkNotNullParameter(flushStatistics2, "flushState");
                FacebookRequestError error = graphResponse.getError();
                String str2 = InitializationStatus.SUCCESS;
                FlushResult flushResult = FlushResult.SUCCESS;
                boolean z = true;
                if (error != null) {
                    if (error.getErrorCode() == -1) {
                        str2 = "Failed: No Connectivity";
                        flushResult = FlushResult.NO_CONNECTIVITY;
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{graphResponse.toString(), error.toString()}, 2));
                        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                        flushResult = FlushResult.SERVER_ERROR;
                    }
                }
                if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) graphRequest.getTag()).toString(2);
                        Intrinsics.checkNotNullExpressionValue(str, "jsonArray.toString(2)");
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.getGraphObject()), str2, str);
                }
                if (error == null) {
                    z = false;
                }
                sessionEventsState2.clearInFlightAndStats(z);
                if (flushResult == FlushResult.NO_CONNECTIVITY) {
                    FacebookSdk.getExecutor().execute(new AppEventQueue$handleResponse$1(accessTokenAppIdPair2, sessionEventsState2));
                }
                if (flushResult != FlushResult.SUCCESS && flushStatistics.getResult() != FlushResult.NO_CONNECTIVITY) {
                    flushStatistics2.setResult(flushResult);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}

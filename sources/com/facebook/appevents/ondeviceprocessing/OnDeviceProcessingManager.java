package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo72093d2 = {"Lcom/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager;", "", "()V", "ALLOWED_IMPLICIT_EVENTS", "", "", "isEventEligibleForOnDeviceProcessing", "", "event", "Lcom/facebook/appevents/AppEvent;", "isOnDeviceProcessingEnabled", "sendCustomEventAsync", "", "applicationId", "sendInstallEventAsync", "preferencesName", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: OnDeviceProcessingManager.kt */
public final class OnDeviceProcessingManager {
    private static final Set<String> ALLOWED_IMPLICIT_EVENTS = SetsKt.setOf(AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_START_TRIAL, AppEventsConstants.EVENT_NAME_SUBSCRIBE);
    public static final OnDeviceProcessingManager INSTANCE = new OnDeviceProcessingManager();

    private OnDeviceProcessingManager() {
    }

    @JvmStatic
    public static final boolean isOnDeviceProcessingEnabled() {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            if (!(!FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext()) && !Utility.isDataProcessingRestricted()) || !RemoteServiceWrapper.isServiceAvailable()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @JvmStatic
    public static final void sendInstallEventAsync(String str, String str2) {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                if (applicationContext != null && str != null && str2 != null) {
                    FacebookSdk.getExecutor().execute(new OnDeviceProcessingManager$sendInstallEventAsync$1(applicationContext, str2, str));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void sendCustomEventAsync(String str, AppEvent appEvent) {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(str, "applicationId");
                Intrinsics.checkNotNullParameter(appEvent, "event");
                if (INSTANCE.isEventEligibleForOnDeviceProcessing(appEvent)) {
                    FacebookSdk.getExecutor().execute(new OnDeviceProcessingManager$sendCustomEventAsync$1(str, appEvent));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final boolean isEventEligibleForOnDeviceProcessing(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            boolean z = appEvent.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(appEvent.getName());
            if ((!appEvent.isImplicit()) || z) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}

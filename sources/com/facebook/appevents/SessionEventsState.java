package com.facebook.appevents;

import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bJ0\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo72093d2 = {"Lcom/facebook/appevents/SessionEventsState;", "", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "", "(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;)V", "accumulatedEventCount", "", "getAccumulatedEventCount", "()I", "accumulatedEvents", "", "Lcom/facebook/appevents/AppEvent;", "eventsToPersist", "", "getEventsToPersist", "()Ljava/util/List;", "inFlightEvents", "numSkippedEventsDueToFullBuffer", "accumulatePersistedEvents", "", "events", "addEvent", "event", "clearInFlightAndStats", "moveToAccumulated", "", "populateRequest", "request", "Lcom/facebook/GraphRequest;", "applicationContext", "Landroid/content/Context;", "includeImplicitEvents", "limitEventUsage", "numSkipped", "Lorg/json/JSONArray;", "Companion", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: SessionEventsState.kt */
public final class SessionEventsState {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
    private static final String TAG;
    private List<AppEvent> accumulatedEvents = new ArrayList();
    private final String anonymousAppDeviceGUID;
    private final AttributionIdentifiers attributionIdentifiers;
    private final List<AppEvent> inFlightEvents = new ArrayList();
    private int numSkippedEventsDueToFullBuffer;

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers2, String str) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers2, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(str, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = attributionIdentifiers2;
        this.anonymousAppDeviceGUID = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void addEvent(com.facebook.appevents.AppEvent r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)     // Catch:{ all -> 0x002d }
            java.util.List<com.facebook.appevents.AppEvent> r0 = r2.accumulatedEvents     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            java.util.List<com.facebook.appevents.AppEvent> r1 = r2.inFlightEvents     // Catch:{ all -> 0x002d }
            int r1 = r1.size()     // Catch:{ all -> 0x002d }
            int r0 = r0 + r1
            int r1 = MAX_ACCUMULATED_LOG_EVENTS     // Catch:{ all -> 0x002d }
            if (r0 < r1) goto L_0x0026
            int r3 = r2.numSkippedEventsDueToFullBuffer     // Catch:{ all -> 0x002d }
            int r3 = r3 + 1
            r2.numSkippedEventsDueToFullBuffer = r3     // Catch:{ all -> 0x002d }
            goto L_0x002b
        L_0x0026:
            java.util.List<com.facebook.appevents.AppEvent> r0 = r2.accumulatedEvents     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r3, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.SessionEventsState.addEvent(com.facebook.appevents.AppEvent):void");
    }

    public final synchronized int getAccumulatedEventCount() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final synchronized void clearInFlightAndStats(boolean z) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (z) {
                try {
                    this.accumulatedEvents.addAll(this.inFlightEvents);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            }
            this.inFlightEvents.clear();
            this.numSkippedEventsDueToFullBuffer = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int populateRequest(com.facebook.GraphRequest r9, android.content.Context r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch:{ all -> 0x0087 }
            monitor-enter(r8)     // Catch:{ all -> 0x0087 }
            int r5 = r8.numSkippedEventsDueToFullBuffer     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r0 = r8.accumulatedEvents     // Catch:{ all -> 0x0084 }
            com.facebook.appevents.eventdeactivation.EventDeactivationManager.processEvents(r0)     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r0 = r8.inFlightEvents     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r2 = r8.accumulatedEvents     // Catch:{ all -> 0x0084 }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0084 }
            r0.addAll(r2)     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r0 = r8.accumulatedEvents     // Catch:{ all -> 0x0084 }
            r0.clear()     // Catch:{ all -> 0x0084 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x0084 }
            r0.<init>()     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r2 = r8.inFlightEvents     // Catch:{ all -> 0x0084 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0084 }
        L_0x0033:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0084 }
            com.facebook.appevents.AppEvent r3 = (com.facebook.appevents.AppEvent) r3     // Catch:{ all -> 0x0084 }
            boolean r4 = r3.isChecksumValid()     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0055
            if (r11 != 0) goto L_0x004d
            boolean r4 = r3.isImplicit()     // Catch:{ all -> 0x0084 }
            if (r4 != 0) goto L_0x0033
        L_0x004d:
            org.json.JSONObject r3 = r3.getJsonObject()     // Catch:{ all -> 0x0084 }
            r0.put(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0033
        L_0x0055:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r6.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "Event with invalid checksum: "
            r6.append(r7)     // Catch:{ all -> 0x0084 }
            r6.append(r3)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0084 }
            com.facebook.internal.Utility.logd((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0033
        L_0x006c:
            int r11 = r0.length()     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x0074
            monitor-exit(r8)     // Catch:{ all -> 0x0087 }
            return r1
        L_0x0074:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0084 }
            monitor-exit(r8)     // Catch:{ all -> 0x0087 }
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            r7 = r12
            r2.populateRequest(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0087 }
            int r9 = r0.length()     // Catch:{ all -> 0x0087 }
            return r9
        L_0x0084:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0087 }
            throw r9     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r9 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.SessionEventsState.populateRequest(com.facebook.GraphRequest, android.content.Context, boolean, boolean):int");
    }

    public final synchronized List<AppEvent> getEventsToPersist() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final synchronized void accumulatePersistedEvents(List<AppEvent> list) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(list, "events");
                this.accumulatedEvents.addAll(list);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void populateRequest(com.facebook.GraphRequest r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
        /*
            r3 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType r0 = com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001d }
            com.facebook.internal.AttributionIdentifiers r1 = r3.attributionIdentifiers     // Catch:{ JSONException -> 0x001d }
            java.lang.String r2 = r3.anonymousAppDeviceGUID     // Catch:{ JSONException -> 0x001d }
            org.json.JSONObject r5 = com.facebook.appevents.internal.AppEventsLoggerUtility.getJSONObjectForGraphAPICall(r0, r1, r2, r8, r5)     // Catch:{ JSONException -> 0x001d }
            int r8 = r3.numSkippedEventsDueToFullBuffer     // Catch:{ JSONException -> 0x001d }
            if (r8 <= 0) goto L_0x0022
            java.lang.String r8 = "num_skipped_events"
            r5.put(r8, r6)     // Catch:{ JSONException -> 0x001d }
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
            goto L_0x003e
        L_0x001d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r5.<init>()     // Catch:{ all -> 0x001b }
        L_0x0022:
            r4.setGraphObject(r5)     // Catch:{ all -> 0x001b }
            android.os.Bundle r5 = r4.getParameters()     // Catch:{ all -> 0x001b }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "events.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001b }
            r4.setTag(r6)     // Catch:{ all -> 0x001b }
            r4.setParameters(r5)     // Catch:{ all -> 0x001b }
            return
        L_0x003e:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.SessionEventsState.populateRequest(com.facebook.GraphRequest, android.content.Context, int, org.json.JSONArray, boolean):void");
    }

    @Metadata(mo72092d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo72093d2 = {"Lcom/facebook/appevents/SessionEventsState$Companion;", "", "()V", "MAX_ACCUMULATED_LOG_EVENTS", "", "TAG", "", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: SessionEventsState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = SessionEventsState.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "SessionEventsState::class.java.simpleName");
        TAG = simpleName;
    }
}

package com.tapjoy.internal;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.es */
class C9224es extends C9223er {

    /* renamed from: c */
    private boolean f22648c = false;

    /* renamed from: d */
    private String f22649d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TJCurrency f22650e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TapjoyCache f22651f = null;

    /* renamed from: b */
    public final String mo58057b() {
        return "12.4.2";
    }

    C9224es() {
    }

    /* renamed from: a */
    public final void mo58052a(boolean z) {
        TapjoyLog.setDebugEnabled(z);
    }

    /* renamed from: a */
    public final boolean mo58053a(Context context, String str) {
        return mo58055a(context, str, (Hashtable) null, (TJConnectListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo58055a(final android.content.Context r3, java.lang.String r4, java.util.Hashtable r5, final com.tapjoy.TJConnectListener r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "TJC_OPTION_ENABLE_LOGGING"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "true"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.setDebugEnabled(r0)     // Catch:{ all -> 0x00c5 }
        L_0x0018:
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch:{ all -> 0x00c5 }
            r0 = 0
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "The application context is NULL"
            r4.<init>(r5, r1)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r4)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0033
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x0033:
            monitor-exit(r2)
            return r0
        L_0x0035:
            boolean r1 = com.tapjoy.internal.C9465jq.m25449c(r4)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "The SDK key is NULL. A valid SDK key is required to connect successfully to Tapjoy"
            r4.<init>(r5, r1)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r4)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x004e
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x004e:
            monitor-exit(r2)
            return r0
        L_0x0050:
            com.tapjoy.FiveRocksIntegration.m24111a()     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyAppSettings.init(r3)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            com.tapjoy.internal.es$1 r1 = new com.tapjoy.internal.es$1     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            r1.<init>(r3, r6)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            com.tapjoy.TapjoyConnectCore.requestTapjoyConnect(r3, r4, r5, r1)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            r4 = 1
            r2.f22648c = r4     // Catch:{ all -> 0x00c5 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c5 }
            r1 = 14
            if (r6 >= r1) goto L_0x006f
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is not available on this device."
            com.tapjoy.TapjoyLog.m24276i(r3, r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x0093
        L_0x006f:
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "TJC_OPTION_DISABLE_AUTOMATIC_SESSION_TRACKING"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "true"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0086
            r0 = 1
        L_0x0086:
            if (r0 != 0) goto L_0x008c
            com.tapjoy.internal.C9274fl.m24881a((android.content.Context) r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x0093
        L_0x008c:
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is disabled."
            com.tapjoy.TapjoyLog.m24276i(r3, r5)     // Catch:{ all -> 0x00c5 }
        L_0x0093:
            monitor-exit(r2)
            return r4
        L_0x0095:
            r3 = move-exception
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x00ab
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x00ab:
            monitor-exit(r2)
            return r0
        L_0x00ad:
            r3 = move-exception
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x00c3
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r2)
            return r0
        L_0x00c5:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9224es.mo58055a(android.content.Context, java.lang.String, java.util.Hashtable, com.tapjoy.TJConnectListener):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo58054a(final android.content.Context r4, java.lang.String r5, final com.tapjoy.TJConnectListener r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch:{ all -> 0x0074 }
            r0 = 0
            if (r4 != 0) goto L_0x001e
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "The application context is NULL"
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x001c
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x001c:
            monitor-exit(r3)
            return r0
        L_0x001e:
            boolean r1 = com.tapjoy.internal.C9465jq.m25449c(r5)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0039
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "The limited SDK key is NULL. A valid limited SDK key is required to connect successfully to Tapjoy"
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0037
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x0037:
            monitor-exit(r3)
            return r0
        L_0x0039:
            com.tapjoy.internal.es$2 r1 = new com.tapjoy.internal.es$2     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            r1.<init>(r4, r6)     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            com.tapjoy.TapjoyConnectCore.requestLimitedTapjoyConnect(r4, r5, r1)     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0044:
            r4 = move-exception
            java.lang.String r5 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r1 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r2 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0074 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r5, (com.tapjoy.TapjoyErrorMessage) r1)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x005a
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x005a:
            monitor-exit(r3)
            return r0
        L_0x005c:
            r4 = move-exception
            java.lang.String r5 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r1 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r2 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0074 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r5, (com.tapjoy.TapjoyErrorMessage) r1)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0072
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r3)
            return r0
        L_0x0074:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9224es.mo58054a(android.content.Context, java.lang.String, com.tapjoy.TJConnectListener):boolean");
    }

    /* renamed from: a */
    public final TJPlacement mo58027a(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.m24218a(str, "", "", tJPlacementListener);
    }

    /* renamed from: b */
    public final TJPlacement mo58056b(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.m24219b(str, "", "", tJPlacementListener);
    }

    /* renamed from: a */
    public final void mo58033a(Activity activity) {
        if (activity != null) {
            C9084b.m24324a(activity);
        } else {
            TapjoyLog.m24274e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Cannot set activity to NULL"));
        }
    }

    /* renamed from: a */
    public final void mo58028a(float f) {
        if (m24754l("setCurrencyMultiplier")) {
            TapjoyConnectCore.getInstance().setCurrencyMultiplier(f);
        }
    }

    /* renamed from: c */
    public final float mo58063c() {
        if (m24754l("getCurrencyMultiplier")) {
            return TapjoyConnectCore.getInstance().getCurrencyMultiplier();
        }
        return 1.0f;
    }

    /* renamed from: e */
    public final void mo58071e(String str) {
        if (m24753k("actionComplete")) {
            TapjoyConnectCore.getInstance().actionComplete(str);
        }
    }

    /* renamed from: a */
    public final void mo58037a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        if (this.f22650e != null && m24753k("getCurrencyBalance")) {
            this.f22650e.getCurrencyBalance(tJGetCurrencyBalanceListener);
        }
    }

    /* renamed from: a */
    public final void mo58031a(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        if (this.f22650e != null && m24753k("spendCurrency")) {
            this.f22650e.spendCurrency(i, tJSpendCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo58030a(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        if (this.f22650e != null && m24753k("awardCurrency")) {
            this.f22650e.awardCurrency(i, tJAwardCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo58036a(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        if (this.f22650e != null && m24753k("setEarnedCurrencyListener")) {
            this.f22650e.setEarnedCurrencyListener(tJEarnedCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo58038a(TJVideoListener tJVideoListener) {
        if (m24754l("setVideoListener")) {
            TJAdUnit.f21855a = tJVideoListener;
        }
    }

    /* renamed from: a */
    public final void mo58045a(String str, String str2, String str3, String str4) {
        C9326gn.m25005a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo58042a(String str, String str2) {
        C9326gn.m25005a(str, (String) null, (String) null, str2);
    }

    /* renamed from: a */
    public final void mo58039a(String str) {
        C9326gn.m25006a((String) null, str, (String) null, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo58040a(String str, long j) {
        C9326gn.m25006a((String) null, str, (String) null, (String) null, j);
    }

    /* renamed from: a */
    public final void mo58044a(String str, String str2, long j) {
        C9326gn.m25006a(str, str2, (String) null, (String) null, j);
    }

    /* renamed from: b */
    public final void mo58061b(String str, String str2, String str3, String str4) {
        C9326gn.m25006a(str, str2, str3, str4, 0);
    }

    /* renamed from: a */
    public final void mo58046a(String str, String str2, String str3, String str4, long j) {
        C9326gn.m25006a(str, str2, str3, str4, j);
    }

    /* renamed from: a */
    public final void mo58047a(String str, String str2, String str3, String str4, String str5, long j) {
        C9326gn.m25007a(str, str2, str3, str4, str5, j, (String) null, 0, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo58048a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        C9326gn.m25007a(str, str2, str3, str4, str5, j, str6, j2, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo58049a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        C9326gn.m25007a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    /* renamed from: d */
    public final void mo58067d() {
        if (m24754l("startSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                C9274fl.m24880a();
            }
            TapjoyConnectCore.getInstance().appResume();
            C9326gn.m25003a();
        }
    }

    /* renamed from: e */
    public final void mo58070e() {
        if (m24754l("endSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                C9274fl.m24880a();
            }
            C9344gz.m25060a().f23124n = false;
            TapjoyConnectCore.getInstance().appPause();
            C9326gn.m25008b();
        }
    }

    /* renamed from: b */
    public final void mo58059b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            C9274fl.m24880a();
        }
        C9344gz.m25060a().f23124n = true;
        C9326gn.m25004a(activity);
    }

    /* renamed from: c */
    public final void mo58064c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            C9274fl.m24880a();
        }
        C9326gn.m25009b(activity);
    }

    /* renamed from: a */
    public final void mo58041a(String str, TJSetUserIDListener tJSetUserIDListener) {
        if (m24754l("setUserID")) {
            TapjoyConnectCore.setUserID(str, tJSetUserIDListener);
            C9344gz a = C9344gz.m25060a();
            if (a.mo58253d("setUserId")) {
                a.f23116f.mo58292b(C9335gu.m25031a(str));
            }
        } else if (tJSetUserIDListener != null) {
            tJSetUserIDListener.onSetUserIDFailure(this.f22649d);
        }
    }

    /* renamed from: j */
    public final void mo58080j(String str) {
        TapjoyConnectCore.setCustomParameter(str);
    }

    /* renamed from: l */
    public final String mo58083l() {
        return TapjoyConnectCore.getCustomParameter();
    }

    /* renamed from: f */
    public final Set mo58072f() {
        return C9344gz.m25060a().mo58250c();
    }

    /* renamed from: a */
    public final void mo58051a(Set set) {
        C9344gz.m25060a().mo58245a(set);
    }

    /* renamed from: g */
    public final void mo58075g() {
        C9344gz.m25060a().mo58245a((Set) null);
    }

    /* renamed from: c */
    public final void mo58065c(String str) {
        if (!C9465jq.m25449c(str)) {
            C9344gz a = C9344gz.m25060a();
            Set c = a.mo58250c();
            if (c.add(str)) {
                a.mo58245a(c);
            }
        }
    }

    /* renamed from: d */
    public final void mo58068d(String str) {
        if (!C9465jq.m25449c(str)) {
            C9344gz a = C9344gz.m25060a();
            Set c = a.mo58250c();
            if (c.remove(str)) {
                a.mo58245a(c);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo58077h() {
        C9344gz a = C9344gz.m25060a();
        if (!a.mo58253d("isPushNotificationDisabled")) {
            return false;
        }
        boolean f = a.f23116f.mo58297f();
        C9340gw.m25045a("isPushNotificationDisabled = {}", Boolean.valueOf(f));
        return f;
    }

    /* renamed from: b */
    public final void mo58062b(boolean z) {
        String str;
        Object[] objArr;
        String str2;
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("setPushNotificationDisabled")) {
            boolean a2 = a.f23116f.mo58289a(z);
            char c = 0;
            String str3 = "setPushNotificationDisabled({}) called, but it is already {}";
            if (a2) {
                objArr = new Object[1];
                str = Boolean.valueOf(z);
                str3 = "setPushNotificationDisabled({}) called";
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(z);
                str = z ? "disabled" : TJAdUnitConstants.String.ENABLED;
                objArr = objArr2;
                c = 1;
            }
            objArr[c] = str;
            C9340gw.m25045a(str3, objArr);
            if (a2 && a.f23121k && !C9465jq.m25449c(a.f23114d)) {
                if (a.f23125o != null) {
                    str2 = null;
                } else {
                    C9355hb b = C9355hb.m25106b(a.f23115e);
                    str2 = C9465jq.m25448b(b.f23600b.mo58275b(b.f23599a));
                }
                a.mo58241a(str2);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo58079i() {
        return this.f22646a;
    }

    /* renamed from: j */
    public final boolean mo58081j() {
        return this.f22647b;
    }

    /* renamed from: g */
    public final String mo58074g(String str) {
        if (m24753k("getSupportURL")) {
            return TapjoyConnectCore.getSupportURL(str);
        }
        return null;
    }

    /* renamed from: k */
    public final String mo58082k() {
        return TapjoyConnectCore.getUserToken();
    }

    /* renamed from: i */
    public final void mo58078i(String str) {
        C9344gz.m25060a().mo58241a(str);
    }

    /* renamed from: a */
    public final void mo58034a(Context context, Map map) {
        C9344gz a = C9344gz.m25060a();
        if (a.f23115e == null) {
            a.mo58248b(context);
        }
        C9355hb.m25106b(a.f23115e);
        Context context2 = a.f23115e;
        String str = (String) map.get("fiverocks");
        if (str == null) {
            return;
        }
        if (C9357hc.m25129a(context2).mo58297f()) {
            C9344gz.m25061a(context2).mo58249b(str);
            return;
        }
        String str2 = (String) map.get("title");
        String str3 = (String) map.get("message");
        if (str3 != null) {
            String str4 = (String) map.get("rich");
            String str5 = (String) map.get("sound");
            String str6 = (String) map.get("payload");
            String str7 = (String) map.get("always");
            boolean z = "true".equals(str7) || Boolean.TRUE.equals(str7);
            String str8 = (String) map.get("repeatable");
            boolean z2 = "true".equals(str8) || Boolean.TRUE.equals(str8);
            String str9 = (String) map.get("placement");
            int b = C9355hb.m25105b(map.get("nid"));
            String str10 = (String) map.get("channel_id");
            if (z || !C9344gz.m25061a(context2).mo58252d()) {
                Notification a2 = C9355hb.m25102a(context2, str, C9465jq.m25447a(str2), str3, C9355hb.m25104a((Object) str4), C9355hb.m25104a((Object) str5), str6, str9, b, str10);
                if (C9344gz.m25061a(context2).mo58246a(context2, str, z2)) {
                    C9355hb.m25103a(context2, b, a2);
                }
            }
        }
    }

    /* renamed from: k */
    private boolean m24753k(String str) {
        if (this.f22646a) {
            return true;
        }
        TapjoyLog.m24278w("TapjoyAPI", "Can not call " + str + " because Tapjoy SDK has not successfully connected.");
        return false;
    }

    /* renamed from: l */
    private boolean m24754l(String str) {
        if (this.f22648c) {
            return true;
        }
        this.f22649d = "Can not call " + str + " because Tapjoy SDK is not initialized.";
        TapjoyLog.m24274e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, this.f22649d));
        return false;
    }

    /* renamed from: c */
    public final void mo58066c(boolean z) {
        C9313ge a = C9313ge.m24951a();
        a.f23032a = Boolean.valueOf(z);
        if (!a.mo58189b()) {
            a.f23035d = true;
        }
    }

    /* renamed from: h */
    public final void mo58076h(String str) {
        C9313ge a = C9313ge.m24951a();
        if (!C9067al.m24297a(str)) {
            a.f23033b = str;
            if (!a.mo58190c()) {
                a.f23035d = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo58069d(boolean z) {
        C9313ge a = C9313ge.m24951a();
        a.f23034c = Boolean.valueOf(z);
        if (!a.mo58191d()) {
            a.f23035d = true;
        }
    }

    /* renamed from: a */
    public final void mo58043a(String str, String str2, double d, String str3) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58251c("trackPurchase")) {
            String str4 = str;
            String a2 = C9335gu.m25032a(str, "trackPurchase", "productId");
            if (a2 != null) {
                String str5 = str2;
                String a3 = C9335gu.m25032a(str2, "trackPurchase", AppsFlyerProperties.CURRENCY_CODE);
                if (a3 == null) {
                    return;
                }
                if (a3.length() != 3) {
                    C9340gw.m25044a("trackPurchase", AppsFlyerProperties.CURRENCY_CODE, "invalid currency code");
                    return;
                }
                a.f23117g.mo58236a(a2, a3.toUpperCase(Locale.US), d, (String) null, (String) null, C9335gu.m25033b(str3));
                C9340gw.m25043a("trackPurchase called");
            }
        }
    }

    /* renamed from: a */
    public final void mo58050a(String str, String str2, String str3, String str4, Map map) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58251c("trackEvent") && !C9465jq.m25449c(str2)) {
            LinkedHashMap b = C9471ju.m25455b();
            if (map != null && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null) {
                        if (C9340gw.f23095a) {
                            C9507x.m25550a("Tapjoy", "{}: {} must not be null", "trackEvent", "key in values map");
                            return;
                        }
                        return;
                    } else if (key instanceof String) {
                        String a2 = C9335gu.m25032a((String) key, "trackEvent", "key in values map");
                        if (a2 != null) {
                            Object value = entry.getValue();
                            if (value instanceof Number) {
                                b.put(a2, Long.valueOf(((Number) value).longValue()));
                            } else {
                                C9340gw.m25044a("trackEvent", "value in values map", "must be a long");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            a.f23117g.mo58238a(str, str2, str3, str4, b);
            C9340gw.m25045a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, b);
        }
    }

    /* renamed from: a */
    public final void mo58029a(int i) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("setUserLevel")) {
            C9340gw.m25045a("setUserLevel({}) called", Integer.valueOf(i));
            a.f23116f.mo58286a(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    /* renamed from: b */
    public final void mo58058b(int i) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("setUserFriendCount")) {
            C9340gw.m25045a("setUserFriendCount({}) called", Integer.valueOf(i));
            a.f23116f.mo58291b(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    /* renamed from: b */
    public final void mo58060b(String str) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("setAppDataVersion")) {
            a.f23116f.mo58287a(C9335gu.m25031a(str));
        }
    }

    /* renamed from: a */
    public final void mo58032a(int i, String str) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("setUserCohortVariable")) {
            boolean z = i > 0 && i <= 5;
            if (C9340gw.f23095a && !z) {
                C9340gw.m25048b("setCohortVariable: variableIndex is out of range");
            }
            if (z) {
                C9340gw.m25045a("setUserCohortVariable({}, {}) called", Integer.valueOf(i), str);
                a.f23116f.mo58285a(i, C9335gu.m25031a(str));
            }
        }
    }

    /* renamed from: f */
    public final void mo58073f(String str) {
        C9344gz a = C9344gz.m25060a();
        C9340gw.m25045a("setGcmSender({}) called", str);
        a.f23114d = C9465jq.m25447a(str);
        a.mo58247b();
    }

    /* renamed from: a */
    public final void mo58035a(GLSurfaceView gLSurfaceView) {
        C9344gz.m25060a();
        C9344gz.m25063a(gLSurfaceView);
    }
}

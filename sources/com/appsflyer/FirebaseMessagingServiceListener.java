package com.appsflyer;

import com.appsflyer.internal.C1743ad;
import com.appsflyer.internal.C1750d;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.google.firebase.messaging.FirebaseMessagingService, com.appsflyer.FirebaseMessagingServiceListener] */
    public void onNewToken(String str) {
        FirebaseMessagingServiceListener.super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C1750d.C1751c.C1752d r2 = C1750d.C1751c.C1752d.m3871(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C1750d.C1751c.C1752d dVar = new C1750d.C1751c.C1752d(currentTimeMillis, str);
            if (r2.mo14077(dVar)) {
                C1743ad.m3850(getApplicationContext(), dVar.f4179);
            }
        }
    }
}

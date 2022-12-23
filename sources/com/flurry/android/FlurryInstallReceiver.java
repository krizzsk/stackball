package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.flurry.sdk.C2530db;
import com.flurry.sdk.C2619em;
import com.flurry.sdk.C2672y;

public final class FlurryInstallReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5319a = FlurryInstallReceiver.class.getSimpleName();

    public final void onReceive(Context context, Intent intent) {
        String str = f5319a;
        C2530db.m5474a(4, str, "Received an Install notification of " + intent.getAction());
        String string = intent.getExtras().getString("referrer");
        C2530db.m5474a(4, f5319a, "Received an Install referrer of ".concat(String.valueOf(string)));
        if (string == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            C2530db.m5474a(5, f5319a, "referrer is null");
            return;
        }
        if (!string.contains("=")) {
            C2530db.m5474a(4, f5319a, "referrer is before decoding: ".concat(String.valueOf(string)));
            string = C2619em.m5708f(string);
            C2530db.m5474a(4, f5319a, "referrer is: ".concat(String.valueOf(string)));
        }
        new C2672y(context).mo17881a(string);
    }
}

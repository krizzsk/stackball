package com.p243my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.my.target.j5 */
public class C7484j5 extends C7438h5 {

    /* renamed from: a */
    public boolean f18829a = false;

    /* renamed from: a */
    public static boolean m19512a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !str.matches("^[0]+(-[0]+)+$");
    }

    /* renamed from: a */
    public final void mo50596a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            if (!TextUtils.isEmpty(string)) {
                addParam("android_id", string);
            }
        }
    }

    /* renamed from: b */
    public final void mo50597b(Context context) {
        C7374e0.m18989a("send google AId");
        String str = null;
        try {
            str = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
            C7374e0.m18989a("google AId: " + str);
            boolean isLimitAdTrackingEnabled = AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled() ^ true;
            StringBuilder sb = new StringBuilder();
            sb.append("ad tracking enabled: ");
            sb.append(!isLimitAdTrackingEnabled);
            C7374e0.m18989a(sb.toString());
            addParam(TapjoyConstants.TJC_ADVERTISING_ID, str);
            addParam("advertising_tracking_enabled", (isLimitAdTrackingEnabled ? 1 : 0) + "");
        } catch (Throwable th) {
            C7374e0.m18989a("failed to send google AId, " + th.getMessage());
        }
        if (!m19512a(str)) {
            mo50596a(context);
        }
    }

    public synchronized void collectData(Context context) {
        if (C7395f0.m19089b()) {
            C7374e0.m18989a("You must not call collectData method from main thread");
        } else if (!this.f18829a) {
            mo50597b(context);
            this.f18829a = true;
        }
    }
}

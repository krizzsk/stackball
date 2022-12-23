package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import com.tapjoy.internal.C9344gz;
import com.tapjoy.internal.C9442j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class InstallReferrerReceiver extends C9442j {
    public void onReceive(Context context, Intent intent) {
        String a = C9344gz.m25062a(context, intent);
        int a2 = mo58426a(context, intent);
        if (intent.getBooleanExtra("fiverocks:verify", false) && isOrderedBroadcast()) {
            setResultCode(a2 + 1);
            if (a != null) {
                try {
                    setResultData("http://play.google.com/store/apps/details?id=" + context.getPackageName() + "&referrer=" + URLEncoder.encode(a, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
    }
}

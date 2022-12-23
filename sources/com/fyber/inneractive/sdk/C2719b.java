package com.fyber.inneractive.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.p033c.C2727c;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.b */
public class C2719b {
    /* renamed from: a */
    public static int m5890a(Context context, Intent intent) {
        Class<C2719b> cls = C2719b.class;
        if (context != null) {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers == null) {
                return 0;
            }
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                String str = resolveInfo.activityInfo.name;
                try {
                    ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                } catch (ClassNotFoundException unused) {
                    IAlog.m9036d("%sCould not find receiver for %s", IAlog.m9028a((Class<?>) cls), str);
                } catch (Exception unused2) {
                    IAlog.m9036d("%sError instantiating or executing registration for kit %s", IAlog.m9028a((Class<?>) cls), str);
                }
            }
            if (C2727c.C2728a.f6415a.f6414a.size() == 0) {
                Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
            }
            return queryBroadcastReceivers.size();
        }
        throw new IllegalArgumentException("Context can't be null");
    }
}

package com.tapjoy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.tapjoy.internal.C9232ev;
import com.tapjoy.internal.C9241ey;
import com.tapjoy.internal.C9253fc;
import com.tapjoy.internal.C9340gw;
import com.tapjoy.internal.C9343gy;
import com.tapjoy.internal.C9344gz;
import com.tapjoy.internal.C9355hb;
import com.tapjoy.internal.C9369hk;
import java.util.List;

public class TapjoyReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        C9355hb.m25106b(context);
        if ("com.tapjoy.PUSH_CLICK".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("com.tapjoy.PUSH_ID");
            String stringExtra2 = intent.getStringExtra(Tapjoy.INTENT_EXTRA_PUSH_PAYLOAD);
            String stringExtra3 = intent.getStringExtra("com.tapjoy.PUSH_PLACEMENT");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.setPackage(packageName);
                intent3.addCategory("android.intent.category.LAUNCHER");
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent3, 0);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    intent2 = null;
                } else {
                    intent2 = new Intent(intent3);
                    intent2.setFlags(268435456);
                    intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
                }
                if (intent2 != null) {
                    if (stringExtra2 != null) {
                        intent2.putExtra(Tapjoy.INTENT_EXTRA_PUSH_PAYLOAD, stringExtra2);
                    }
                    C9344gz a = C9344gz.m25061a(context);
                    if (a.f23116f.mo58294c(stringExtra)) {
                        C9343gy gyVar = a.f23117g;
                        C9232ev.C9233a a2 = gyVar.mo58234a(C9241ey.APP, "push_click");
                        a2.f22725s = new C9253fc((String) null, (String) null, stringExtra);
                        gyVar.mo58235a(a2);
                    }
                    if (stringExtra3 != null) {
                        C9369hk.m25183a(stringExtra, stringExtra3);
                    }
                    context.startActivity(intent2);
                } else {
                    C9340gw.m25048b("No intent that can be used to launch the main activity.");
                }
            }
        }
        if (isOrderedBroadcast()) {
            setResult(-1, (String) null, (Bundle) null);
        }
    }
}

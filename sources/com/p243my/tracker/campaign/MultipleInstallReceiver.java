package com.p243my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.p243my.tracker.obfuscated.C7877u0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.campaign.MultipleInstallReceiver */
public class MultipleInstallReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f19780a = CampaignReceiver.class.getName();

    /* renamed from: b */
    private static final String f19781b = MultipleInstallReceiver.class.getName();

    /* renamed from: c */
    private static final AtomicBoolean f19782c = new AtomicBoolean();

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            if (!f19782c.compareAndSet(false, true)) {
                C7877u0.m21547a("MultipleInstallReceiver: attempt to call, but it was called before");
                return;
            }
            C7877u0.m21547a("MultipleInstallReceiver called");
            CampaignReceiver.m21037a(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!f19780a.equals(str) && !f19781b.equals(str)) {
                        C7877u0.m21547a("MultipleInstallReceiver: trigger onReceive class " + str);
                        try {
                            ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                        } catch (Throwable th) {
                            C7877u0.m21547a("MultipleInstallReceiver: error in BroadcastReceiver " + str + " : " + th.getMessage());
                        }
                    }
                }
            }
        }
    }
}

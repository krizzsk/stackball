package com.p243my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p243my.tracker.obfuscated.C7877u0;

/* renamed from: com.my.tracker.campaign.CampaignReceiver */
public class CampaignReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static void m21037a(Context context, Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("referrer");
            if (TextUtils.isEmpty(string)) {
                C7877u0.m21547a("CampaignReceiver: referrer is null or empty");
                return;
            }
            C7877u0.m21547a("CampaignReceiver: got referrer " + string);
            try {
                context.startService(new Intent(context, CampaignService.class).putExtra("referrer", string));
            } catch (Throwable th) {
                C7877u0.m21551b("CampaignReceiver error: " + th.toString());
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        m21037a(context, intent);
    }
}

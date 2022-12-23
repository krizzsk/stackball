package com.mbridge.msdk.videocommon.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetStateOnReceive extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    C7184c.getInstance().mo49206a(false);
                } else if (activeNetworkInfo.getType() == 1) {
                    C7184c.getInstance().mo49211b(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    C7184c.getInstance().mo49205a();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

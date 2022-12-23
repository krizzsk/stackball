package com.tapjoy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tapjoy.internal.C9355hb;

public class GCMReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        boolean a = C9355hb.m25106b(context).mo58491a(intent);
        if (isOrderedBroadcast()) {
            setResult(-1, (String) null, (Bundle) null);
            if (a) {
                abortBroadcast();
            }
        }
    }
}

package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.p133c.C5499a;
import org.json.JSONObject;

class BroadcastReceiverStrategy$1 extends BroadcastReceiver {

    /* renamed from: a */
    private /* synthetic */ C6043a f14810a;

    BroadcastReceiverStrategy$1(C6043a aVar) {
        this.f14810a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        String a = C5499a.m13042a(context);
        if (a.equals("none")) {
            this.f14810a.f14811a.mo42352a();
            return;
        }
        C6046d dVar = this.f14810a.f14811a;
        new JSONObject();
        dVar.mo42353a(a);
    }
}

package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.a */
public final class C6043a implements C6045c {

    /* renamed from: a */
    final C6046d f14811a;

    /* renamed from: b */
    private BroadcastReceiver f14812b = new BroadcastReceiverStrategy$1(this);

    public C6043a(C6046d dVar) {
        this.f14811a = dVar;
    }

    /* renamed from: a */
    public final void mo42585a() {
        this.f14812b = null;
    }

    /* renamed from: a */
    public final void mo42586a(Context context) {
        try {
            context.registerReceiver(this.f14812b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo42587b(Context context) {
        try {
            context.unregisterReceiver(this.f14812b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    /* renamed from: c */
    public final JSONObject mo42588c(Context context) {
        return new JSONObject();
    }
}

package com.applovin.impl.sdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.network.c */
public class C1490c extends BroadcastReceiver {

    /* renamed from: a */
    private final List<C1491a> f3632a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.sdk.network.c$a */
    public interface C1491a {
        /* renamed from: a */
        void mo13146a();

        /* renamed from: b */
        void mo13147b();
    }

    public C1490c(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    private static boolean m3224a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public void mo13211a(C1491a aVar) {
        this.f3632a.add(aVar);
    }

    /* renamed from: b */
    public void mo13212b(C1491a aVar) {
        this.f3632a.remove(aVar);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            ArrayList arrayList = new ArrayList(this.f3632a);
            boolean a = m3224a(intent);
            Iterator it = arrayList.iterator();
            if (a) {
                while (it.hasNext()) {
                    ((C1491a) it.next()).mo13146a();
                }
                return;
            }
            while (it.hasNext()) {
                ((C1491a) it.next()).mo13147b();
            }
        }
    }
}

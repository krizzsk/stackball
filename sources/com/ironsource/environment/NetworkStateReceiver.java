package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private ConnectivityManager f12692a;

    /* renamed from: b */
    private C5531j f12693b;

    /* renamed from: c */
    private boolean f12694c;

    public NetworkStateReceiver(Context context, C5531j jVar) {
        this.f12693b = jVar;
        this.f12692a = (ConnectivityManager) context.getSystemService("connectivity");
        m13065a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m13065a() {
        /*
            r4 = this;
            boolean r0 = r4.f12694c
            android.net.ConnectivityManager r1 = r4.f12692a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r4.f12694c = r1     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r4.f12694c = r3
        L_0x001c:
            boolean r1 = r4.f12694c
            if (r0 == r1) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.m13065a():boolean");
    }

    public void onReceive(Context context, Intent intent) {
        C5531j jVar;
        if (intent != null && intent.getExtras() != null && m13065a() && (jVar = this.f12693b) != null) {
            if (this.f12694c) {
                jVar.mo41252a(true);
            } else {
                jVar.mo41252a(false);
            }
        }
    }
}

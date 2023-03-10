package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public class NetworkConnectivity extends Activity {

    /* renamed from: a */
    private final int f23671a = 0;

    /* renamed from: b */
    private final int f23672b;

    /* renamed from: c */
    private final int f23673c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f23674d;

    /* renamed from: e */
    private ConnectivityManager f23675e;

    /* renamed from: f */
    private final ConnectivityManager.NetworkCallback f23676f;

    public NetworkConnectivity(Context context) {
        int i = 1;
        this.f23672b = 1;
        this.f23673c = 2;
        this.f23674d = 0;
        this.f23676f = new ConnectivityManager.NetworkCallback() {
            public final void onAvailable(Network network) {
                super.onAvailable(network);
            }

            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                NetworkConnectivity networkConnectivity;
                int i;
                super.onCapabilitiesChanged(network, networkCapabilities);
                if (networkCapabilities.hasTransport(0)) {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 1;
                } else {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 2;
                }
                int unused = networkConnectivity.f23674d = i;
            }

            public final void onLost(Network network) {
                super.onLost(network);
                int unused = NetworkConnectivity.this.f23674d = 0;
            }

            public final void onUnavailable() {
                super.onUnavailable();
                int unused = NetworkConnectivity.this.f23674d = 0;
            }
        };
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f23675e = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(this.f23676f);
        NetworkInfo activeNetworkInfo = this.f23675e.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.f23674d = activeNetworkInfo.getType() != 0 ? 2 : i;
        }
    }

    /* renamed from: a */
    public final int mo58603a() {
        return this.f23674d;
    }

    /* renamed from: b */
    public final void mo58604b() {
        this.f23675e.unregisterNetworkCallback(this.f23676f);
    }
}

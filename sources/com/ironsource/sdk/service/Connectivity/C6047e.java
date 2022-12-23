package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.ironsource.p133c.C5499a;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.e */
public class C6047e implements C6045c {

    /* renamed from: a */
    private String f14814a = C6047e.class.getSimpleName();

    /* renamed from: b */
    private int f14815b = 23;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6046d f14816c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f14817d;

    public C6047e(C6046d dVar) {
        this.f14816c = dVar;
    }

    /* renamed from: a */
    public final void mo42585a() {
        this.f14817d = null;
    }

    /* renamed from: a */
    public final void mo42586a(final Context context) {
        if (Build.VERSION.SDK_INT >= this.f14815b) {
            mo42587b(context);
            if (C5499a.m13042a(context).equals("none")) {
                this.f14816c.mo42352a();
            }
            if (this.f14817d == null) {
                this.f14817d = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        if (network != null) {
                            C6046d a = C6047e.this.f14816c;
                            String a2 = C5499a.m13043a(network, context);
                            C5499a.m13044a(context, network);
                            a.mo42353a(a2);
                            return;
                        }
                        C6046d a3 = C6047e.this.f14816c;
                        String a4 = C5499a.m13042a(context);
                        Context context = context;
                        C5499a.m13044a(context, C5499a.m13045b(context));
                        a3.mo42353a(a4);
                    }

                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        if (network != null) {
                            C6047e.this.f14816c.mo42354a(C5499a.m13043a(network, context), C5499a.m13044a(context, network));
                        }
                    }

                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        if (network != null) {
                            C6047e.this.f14816c.mo42354a(C5499a.m13043a(network, context), C5499a.m13044a(context, network));
                        }
                    }

                    public final void onLost(Network network) {
                        if (C5499a.m13042a(context).equals("none")) {
                            C6047e.this.f14816c.mo42352a();
                        }
                    }
                };
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f14817d);
                }
            } catch (Exception unused) {
                Log.e(this.f14814a, "NetworkCallback was not able to register");
            }
        }
    }

    /* renamed from: b */
    public final void mo42587b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f14815b && this.f14817d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f14817d);
            } catch (Exception unused) {
                Log.e(this.f14814a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo42588c(Context context) {
        return C5499a.m13044a(context, C5499a.m13045b(context));
    }
}

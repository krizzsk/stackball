package com.p243my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.my.tracker.obfuscated.e0 */
public final class C7809e0 {

    /* renamed from: a */
    private int f19872a = -1;

    /* renamed from: b */
    private int f19873b = -1;

    /* renamed from: c */
    private String f19874c;

    C7809e0() {
    }

    /* renamed from: a */
    public void mo52283a(Context context) {
        this.f19872a = -1;
        this.f19873b = -1;
        NetworkInfo networkInfo = null;
        this.f19874c = null;
        if (C7815h0.m21188a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                }
                if (networkInfo != null) {
                    int type = networkInfo.getType();
                    if (type == 0) {
                        this.f19872a = 2;
                    } else if (type != 1) {
                        this.f19872a = 1;
                    } else {
                        this.f19872a = 3;
                    }
                    this.f19874c = networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
                }
            } catch (SecurityException unused) {
                C7877u0.m21547a("No permissions for access to network state");
            }
        }
        if (!C7815h0.m21187a() && C7815h0.m21188a("android.permission.BLUETOOTH", context)) {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    this.f19873b = defaultAdapter.isEnabled() ? 1 : 0;
                }
            } catch (SecurityException unused2) {
                C7877u0.m21547a("Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
            }
        }
    }

    /* renamed from: a */
    public void mo52284a(C7831m0 m0Var, Context context) {
        m0Var.mo52381a(this.f19872a, this.f19874c);
        int i = this.f19873b;
        if (i != -1) {
            m0Var.mo52428g(i);
        }
    }

    /* renamed from: b */
    public void mo52285b(Context context) {
    }
}

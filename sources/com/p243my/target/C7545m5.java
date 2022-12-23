package com.p243my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.my.target.m5 */
public class C7545m5 extends C7438h5 {
    /* renamed from: a */
    public final void mo50870a(NetworkInfo networkInfo) {
        String str;
        if (networkInfo.getType() == 0) {
            if (networkInfo.getSubtypeName() != null) {
                str = networkInfo.getSubtypeName();
                addParam(TapjoyConstants.TJC_CONNECTION_TYPE, str);
            }
        } else if (networkInfo.getTypeName() != null) {
            str = networkInfo.getTypeName();
            addParam(TapjoyConstants.TJC_CONNECTION_TYPE, str);
        }
        str = "";
        addParam(TapjoyConstants.TJC_CONNECTION_TYPE, str);
    }

    public synchronized void collectData(Context context) {
        removeAll();
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                addParam("connection", networkInfo.getTypeName());
                mo50870a(networkInfo);
            }
        } catch (Throwable unused) {
            C7374e0.m18989a("No permissions for access to network state");
        }
        return;
    }
}

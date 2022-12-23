package com.chartboost.sdk.Networking;

import android.content.Context;
import android.net.NetworkInfo;
import com.chartboost.sdk.Libraries.CBLogging;
import com.facebook.internal.AnalyticsEvents;

/* renamed from: com.chartboost.sdk.Networking.h */
public class C1856h {

    /* renamed from: a */
    private Context f4582a;

    /* renamed from: b */
    private C1861k f4583b = new C1861k();

    public C1856h(Context context) {
        this.f4582a = context;
    }

    /* renamed from: a */
    public String mo14337a() {
        C1861k kVar = this.f4583b;
        if (kVar == null) {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        switch (kVar.mo14352d(this.f4582a)) {
            case 1:
                return "Ethernet";
            case 2:
                return "WIFI";
            case 3:
                return "Cellular_Unknown";
            case 4:
                return "Cellular_2G";
            case 5:
                return "Cellular_3G";
            case 6:
                return "Cellular_4G";
            default:
                return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    /* renamed from: b */
    public int mo14338b() {
        Context context = this.f4582a;
        if (context == null) {
            return 0;
        }
        if (this.f4583b.mo14351c(context) == null) {
            CBLogging.m3991a("CBReachability", "NETWORK TYPE: unknown");
            return -1;
        }
        NetworkInfo a = this.f4583b.mo14349a(this.f4582a);
        if (a == null || !a.isConnected()) {
            CBLogging.m3991a("CBReachability", "NETWORK TYPE: NO Network");
            return 0;
        } else if (a.getType() == 1) {
            CBLogging.m3991a("CBReachability", "NETWORK TYPE: TYPE_WIFI");
            return 1;
        } else {
            CBLogging.m3991a("CBReachability", "NETWORK TYPE: TYPE_MOBILE");
            return 2;
        }
    }

    /* renamed from: c */
    public int mo14339c() {
        C1861k kVar = this.f4583b;
        if (kVar != null) {
            return kVar.mo14352d(this.f4582a);
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo14340d() {
        return this.f4583b.mo14353e(this.f4582a);
    }

    /* renamed from: a */
    public int mo14336a(Context context) {
        C1861k kVar = this.f4583b;
        if (kVar != null) {
            return kVar.mo14350b(context);
        }
        return 0;
    }
}

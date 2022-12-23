package com.fyber.inneractive.sdk.p039dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.p033c.C2724b;
import com.fyber.inneractive.sdk.p033c.C2727c;
import com.fyber.inneractive.sdk.p033c.C2730d;
import com.fyber.inneractive.sdk.p039dv.p040a.C2866b;
import com.fyber.inneractive.sdk.p039dv.p043d.C2885d;
import com.fyber.inneractive.sdk.p039dv.p044e.C2894c;
import com.fyber.inneractive.sdk.p045e.C2897a;
import com.fyber.inneractive.sdk.p045e.C2899b;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p051j.C3014a;
import com.fyber.inneractive.sdk.p051j.C3015b;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.DVKit */
public class DVKit extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        IAlog.m9034b("DVKit: onReceive in package: %s", C3656k.m9085a(context.getApplicationContext()));
        C2727c.C2728a.f6415a.mo17966a(C3014a.RETURNED_ADTYPE_MOBILE_ADS, new C2727c.C2729b() {
            /* renamed from: a */
            public final C3015b mo17969a() {
                return new C2877d();
            }

            /* renamed from: b */
            public final /* synthetic */ C2897a mo17970b() {
                return new C2867b();
            }
        });
        C2730d.C2732b.f6417a.mo17972a((C2730d.C2731a) new C2730d.C2731a() {
            /* renamed from: a */
            public final boolean mo17973a(InneractiveAdSpot inneractiveAdSpot) {
                return IAConfigManager.m5931d() != null && (inneractiveAdSpot.getAdContent() instanceof C2863a);
            }

            /* renamed from: b */
            public final C2900c mo17974b(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveAdRequest g = inneractiveAdSpot.getAdContent().mo18130g();
                boolean z = g == null || g.getAllowFullscreen();
                if (!inneractiveAdSpot.getAdContent().mo18126a_() || !z) {
                    return null;
                }
                if (inneractiveAdSpot.getAdContent().mo18129f().f7415r == UnitDisplayType.INTERSTITIAL) {
                    return new C2885d();
                }
                return new C2894c();
            }
        });
        C2724b.C2726b.f6413a.mo17962a((C2724b.C2725a) new C2724b.C2725a() {
            /* renamed from: a */
            public final boolean mo17964a(InneractiveAdSpot inneractiveAdSpot) {
                return DVKit.m6303a(inneractiveAdSpot);
            }

            /* renamed from: a */
            public final C2899b mo17963a() {
                return new C2866b();
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ boolean m6303a(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C2863a);
    }
}

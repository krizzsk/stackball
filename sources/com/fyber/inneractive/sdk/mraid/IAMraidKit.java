package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.p033c.C2724b;
import com.fyber.inneractive.sdk.p033c.C2727c;
import com.fyber.inneractive.sdk.p033c.C2730d;
import com.fyber.inneractive.sdk.p037d.C2832e;
import com.fyber.inneractive.sdk.p037d.C2853m;
import com.fyber.inneractive.sdk.p045e.C2897a;
import com.fyber.inneractive.sdk.p045e.C2899b;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p050i.C2997d;
import com.fyber.inneractive.sdk.p050i.C3008g;
import com.fyber.inneractive.sdk.p051j.C3014a;
import com.fyber.inneractive.sdk.p051j.C3015b;
import com.fyber.inneractive.sdk.p051j.C3016c;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3671r;
import com.fyber.inneractive.sdk.util.IAlog;

public class IAMraidKit extends BroadcastReceiver {
    private static final C3671r.C3673a sProvider = new C3671r.C3673a() {
        /* renamed from: a */
        public final boolean mo18656a(String str) {
            return false;
        }

        /* renamed from: a */
        public final C3671r.C3674b mo18655a() {
            return C3671r.C3674b.Mraid;
        }
    };

    public void onReceive(Context context, Intent intent) {
        IAlog.m9034b("IAMraidKit: onReceive in package: %s", C3656k.m9085a(context.getApplicationContext()));
        IAConfigManager.m5917a(sProvider);
        C30682 r2 = new C2727c.C2729b() {
            /* renamed from: a */
            public final C3015b mo17969a() {
                return new C3016c();
            }

            /* renamed from: b */
            public final /* synthetic */ C2897a mo17970b() {
                return new C2832e();
            }
        };
        C2727c.C2728a.f6415a.mo17966a(C3014a.RETURNED_ADTYPE_HTML, r2);
        C2727c.C2728a.f6415a.mo17966a(C3014a.RETURNED_ADTYPE_MRAID, r2);
        C2730d.C2732b.f6417a.mo17972a((C2730d.C2731a) new C2730d.C2731a() {
            /* renamed from: a */
            public final boolean mo17973a(InneractiveAdSpot inneractiveAdSpot) {
                return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
            }

            /* renamed from: b */
            public final C2900c mo17974b(InneractiveAdSpot inneractiveAdSpot) {
                return new C3008g();
            }
        });
        C2724b.C2726b.f6413a.mo17962a((C2724b.C2725a) new C2724b.C2725a() {
            /* renamed from: a */
            public final boolean mo17964a(InneractiveAdSpot inneractiveAdSpot) {
                return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
            }

            /* renamed from: a */
            public final C2899b mo17963a() {
                return new C2997d();
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C2853m);
    }
}

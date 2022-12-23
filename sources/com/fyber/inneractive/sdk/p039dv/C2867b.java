package com.fyber.inneractive.sdk.p039dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.p037d.C2825b;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p039dv.p040a.C2864a;
import com.fyber.inneractive.sdk.p039dv.p043d.C2879b;
import com.fyber.inneractive.sdk.p039dv.p043d.C2882c;
import com.fyber.inneractive.sdk.p039dv.p044e.C2887a;
import com.fyber.inneractive.sdk.p039dv.p044e.C2891b;
import com.fyber.inneractive.sdk.util.C3657l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* renamed from: com.fyber.inneractive.sdk.dv.b */
public final class C2867b extends C2825b<C2895f, C2863a> implements C2870c {

    /* renamed from: g */
    private boolean f6817g = (!C3657l.m9122c("com.google.android.gms.ads.InterstitialAd"));

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo18103b() {
        return null;
    }

    /* renamed from: a */
    public final void mo18098a() {
        C2836g gVar;
        if (this.f6701b == null || ((C2895f) this.f6701b).mo18501e() == null) {
            mo18243d();
            return;
        }
        if (this.f6700a != null) {
            boolean muteVideo = this.f6700a.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        UnitDisplayType unitDisplayType = ((C2895f) this.f6701b).f7415r;
        QueryInfo queryInfo = ((C2895f) this.f6701b).mo18501e().f6853a;
        int i = C28681.f6818a[unitDisplayType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                gVar = new C2864a(mo18106g(), this.f6704e, (C2895f) this.f6701b);
            } else if (i != 4) {
                gVar = null;
            } else if (this.f6817g) {
                gVar = new C2887a(mo18106g(), this.f6704e, (C2895f) this.f6701b);
            } else {
                gVar = new C2891b(mo18106g(), this.f6704e, (C2895f) this.f6701b);
            }
        } else if (this.f6817g) {
            gVar = new C2879b(mo18106g(), this.f6704e, (C2895f) this.f6701b);
        } else {
            gVar = new C2882c(mo18106g(), this.f6704e, (C2895f) this.f6701b);
        }
        this.f6702c = gVar;
        if (queryInfo == null || this.f6702c == null) {
            mo18243d();
        } else {
            ((C2863a) this.f6702c).mo18226a(new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, ((C2895f) this.f6701b).f6852a)).build(), this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.b$1 */
    static /* synthetic */ class C28681 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6818a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6818a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6818a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6818a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6818a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p039dv.C2867b.C28681.<clinit>():void");
        }
    }

    /* renamed from: c */
    public final void mo18242c() {
        super.mo18107h();
    }

    /* renamed from: d */
    public final void mo18243d() {
        mo18101a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
    }
}

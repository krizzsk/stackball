package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.C5003az;
import com.inmobi.media.C5144e;
import com.inmobi.media.C5275fn;
import com.inmobi.media.C5308gk;
import com.inmobi.media.C5314go;
import com.inmobi.media.C5327gw;
import com.inmobi.media.C5343hf;
import com.inmobi.media.C5475z;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiInterstitial {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f11060b = InMobiInterstitial.class.getSimpleName();

    /* renamed from: a */
    public InterstitialAdEventListener f11061a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5475z f11062c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f11063d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11064e = false;

    /* renamed from: f */
    private WeakReference<Context> f11065f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5003az f11066g = new C5003az();

    /* renamed from: h */
    private C4907a f11067h = new C4907a(this);

    /* renamed from: i */
    private PreloadManager f11068i = new PreloadManager() {

        /* renamed from: b */
        private C5144e f11070b = new C5144e(InMobiInterstitial.this);

        public final void preload() {
            boolean unused = InMobiInterstitial.this.f11064e = true;
            InMobiInterstitial.this.f11062c.mo41077a(InMobiInterstitial.this.f11066g, InMobiInterstitial.this.f11063d);
            InMobiInterstitial.this.f11062c.mo41076a((PublisherCallbacks) this.f11070b);
        }

        public final void load() {
            try {
                InMobiInterstitial.this.f11062c.mo41078l();
            } catch (IllegalStateException e) {
                C5327gw.m12263a((byte) 1, InMobiInterstitial.f11060b, e.getMessage());
                InMobiInterstitial.this.f11061a.onAdLoadFailed(InMobiInterstitial.this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    };

    public InMobiInterstitial(Context context, long j, InterstitialAdEventListener interstitialAdEventListener) throws SdkNotInitializedException {
        if (C5314go.m12202b()) {
            this.f11063d = context.getApplicationContext();
            this.f11066g.f11350a = j;
            this.f11065f = new WeakReference<>(context);
            this.f11061a = interstitialAdEventListener;
            this.f11062c = new C5475z();
            return;
        }
        throw new SdkNotInitializedException(f11060b);
    }

    public final void setListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f11061a = interstitialAdEventListener;
    }

    public final void setKeywords(String str) {
        this.f11066g.f11351b = str;
    }

    public final void getSignals() {
        this.f11062c.mo41077a(this.f11066g, this.f11063d);
        this.f11062c.mo40009b((PublisherCallbacks) this.f11067h);
    }

    public final PreloadManager getPreloadManager() {
        return this.f11068i;
    }

    public final void load(byte[] bArr) {
        this.f11064e = true;
        this.f11062c.mo41077a(this.f11066g, this.f11063d);
        if (Build.VERSION.SDK_INT >= 29) {
            WeakReference<Context> weakReference = this.f11065f;
            C5343hf.m12334a(weakReference == null ? null : (Context) weakReference.get());
        }
        this.f11062c.mo40004a(bArr, (PublisherCallbacks) this.f11067h);
    }

    public final void load() {
        try {
            this.f11064e = true;
            this.f11062c.mo41077a(this.f11066g, this.f11063d);
            if (Build.VERSION.SDK_INT >= 29) {
                C5343hf.m12334a(this.f11065f == null ? null : (Context) this.f11065f.get());
            }
            this.f11062c.mo41076a((PublisherCallbacks) this.f11067h);
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11060b, "Unable to load ad; SDK encountered an unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    public final void show() {
        try {
            if (!this.f11064e) {
                C5327gw.m12263a((byte) 1, f11060b, "load() must be called before trying to show the ad");
            } else {
                this.f11062c.mo41080o();
            }
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11060b, "Unable to show ad; SDK encountered an unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    @Deprecated
    public final void show(int i, int i2) {
        C5327gw.m12263a((byte) 1, f11060b, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", new Object[]{"show(int, int)"}));
        show();
    }

    public final boolean isReady() {
        return this.f11062c.mo41079n();
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f11062c.mo39998D();
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f11062c.mo39997C();
    }

    public final void setExtras(Map<String, String> map) {
        this.f11066g.f11352c = map;
    }

    public final void disableHardwareAcceleration() {
        this.f11066g.f11353d = true;
    }

    /* renamed from: com.inmobi.ads.InMobiInterstitial$a */
    public static final class C4907a extends C5144e {
        public final byte getType() {
            return 0;
        }

        C4907a(InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.f11062c.mo41078l();
                } catch (IllegalStateException e) {
                    C5327gw.m12263a((byte) 1, InMobiInterstitial.f11060b, e.getMessage());
                    inMobiInterstitial.f11061a.onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
            if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
                inMobiInterstitial.f11061a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
            }
        }
    }
}

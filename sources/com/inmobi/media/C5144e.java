package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.e */
/* compiled from: InterstitialPreloadCallbacks */
public class C5144e extends PublisherCallbacks {

    /* renamed from: a */
    protected WeakReference<InMobiInterstitial> f11809a;

    public byte getType() {
        return 1;
    }

    public C5144e(InMobiInterstitial inMobiInterstitial) {
        this.f11809a = new WeakReference<>(inMobiInterstitial);
    }

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (!(inMobiInterstitial == null || inMobiInterstitial.f11061a == null)) {
            inMobiInterstitial.f11061a.onAdReceived(inMobiInterstitial);
        }
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
        }
    }

    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
        }
    }

    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (!(inMobiInterstitial == null || inMobiInterstitial.f11061a == null)) {
            inMobiInterstitial.f11061a.onAdLoadSucceeded(inMobiInterstitial);
        }
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
        }
    }

    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
        }
    }

    public void onAdWillDisplay() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdWillDisplay(inMobiInterstitial);
        }
    }

    public void onAdDisplayFailed() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdDisplayFailed(inMobiInterstitial);
        }
    }

    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (!(inMobiInterstitial == null || inMobiInterstitial.f11061a == null)) {
            inMobiInterstitial.f11061a.onAdDisplayed(inMobiInterstitial);
        }
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdDisplayed(inMobiInterstitial, adMetaInfo);
        }
    }

    public void onAdDismissed() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdDismissed(inMobiInterstitial);
        }
    }

    public void onAdClicked(Map<Object, Object> map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onAdClicked(inMobiInterstitial, map);
        }
    }

    public void onRewardsUnlocked(Map<Object, Object> map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onRewardsUnlocked(inMobiInterstitial, map);
        }
    }

    public void onUserLeftApplication() {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onUserLeftApplication(inMobiInterstitial);
        }
    }

    public void onRequestPayloadCreated(byte[] bArr) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onRequestPayloadCreated(bArr);
        }
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f11809a.get();
        if (inMobiInterstitial != null && inMobiInterstitial.f11061a != null) {
            inMobiInterstitial.f11061a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
        }
    }
}

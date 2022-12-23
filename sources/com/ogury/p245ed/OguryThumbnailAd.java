package com.ogury.p245ed;

import android.app.Activity;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8081bv;
import com.ogury.p245ed.internal.C8089bz;
import com.ogury.p245ed.internal.C8182e;
import com.ogury.p245ed.internal.C8214f;
import com.ogury.p245ed.internal.C8270gs;
import com.ogury.p245ed.internal.C8280h;
import com.ogury.p245ed.internal.C8381k;
import com.ogury.p245ed.internal.C8467mq;
import p269io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.OguryThumbnailAd */
public final class OguryThumbnailAd {

    /* renamed from: a */
    private final C8081bv f20799a;

    /* renamed from: b */
    private final C8270gs f20800b;

    private OguryThumbnailAd(C8081bv bvVar) {
        this.f20799a = bvVar;
        this.f20800b = new C8270gs();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OguryThumbnailAd(android.content.Context r3, p269io.presage.common.AdConfig r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p245ed.internal.C8467mq.m23881b(r3, r0)
            java.lang.String r0 = "adConfig"
            com.ogury.p245ed.internal.C8467mq.m23881b(r4, r0)
            com.ogury.ed.internal.bv r0 = new com.ogury.ed.internal.bv
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r3, (java.lang.String) r1)
            r0.<init>(r3, r4)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.OguryThumbnailAd.<init>(android.content.Context, io.presage.common.AdConfig):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OguryThumbnailAd(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p245ed.internal.C8467mq.m23881b(r3, r0)
            java.lang.String r0 = "adUnitId"
            com.ogury.p245ed.internal.C8467mq.m23881b(r4, r0)
            com.ogury.ed.internal.bv r0 = new com.ogury.ed.internal.bv
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r3, (java.lang.String) r1)
            io.presage.common.AdConfig r1 = new io.presage.common.AdConfig
            r1.<init>(r4)
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.OguryThumbnailAd.<init>(android.content.Context, java.lang.String):void");
    }

    private final void setCampaignId(String str) {
        this.f20799a.mo53242a(str);
    }

    private final void setCreativeId(String str) {
        this.f20799a.mo53248b(str);
    }

    @Deprecated
    public final void setCallback(OguryThumbnailAdCallback oguryThumbnailAdCallback) {
        this.f20799a.mo53240a((C8280h) this.f20800b.mo53623a((PresageInterstitialCallback) oguryThumbnailAdCallback));
    }

    @Deprecated
    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f20800b.mo53624a(oguryAdClickCallback);
    }

    public final void setListener(OguryThumbnailAdListener oguryThumbnailAdListener) {
        OguryIntegrationLogger.m22104d("[Ads] Thumbnail Ad - setListener() called");
        C8081bv bvVar = this.f20799a;
        C8214f.C8215a aVar = C8214f.f21265a;
        bvVar.mo53240a((C8280h) C8214f.C8215a.m22993a(oguryThumbnailAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C8081bv bvVar = this.f20799a;
        C8182e.C8183a aVar = C8182e.f21170a;
        bvVar.mo53241a((C8381k) C8182e.C8183a.m22793a(oguryAdImpressionListener));
    }

    public final void load(int i, int i2) {
        OguryIntegrationLogger.m22104d("[Ads] Thumbnail Ad - load() called with maxWidth: " + i + " maxHeight: " + i2);
        this.f20799a.mo53237a(i, i2);
    }

    public final void load() {
        OguryIntegrationLogger.m22104d("[Ads] Thumbnail Ad - load() called");
        this.f20799a.mo53246b();
    }

    public final void show(Activity activity, int i, int i2) {
        C8467mq.m23881b(activity, "activity");
        OguryIntegrationLogger.m22104d("[Ads] Thumbnail Ad - show() called with activity: " + activity.getClass().getName() + " leftMargin: " + i + " topMargin: " + i2);
        this.f20799a.mo53239a(activity, new C8089bz(OguryThumbnailGravity.TOP_LEFT.getValue(), i, i2));
    }

    public final void show(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        OguryIntegrationLogger.m22104d(C8467mq.m23873a("[Ads] Thumbnail Ad - show() called with activity: ", (Object) activity.getClass().getName()));
        this.f20799a.mo53238a(activity);
    }

    public final void show(Activity activity, OguryThumbnailGravity oguryThumbnailGravity, int i, int i2) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(oguryThumbnailGravity, "gravity");
        OguryIntegrationLogger.m22104d("[Ads] Thumbnail Ad - show() called with activity: " + activity.getClass().getName() + " gravity: " + oguryThumbnailGravity.ordinal() + " xMargin: " + i + " yMargin: " + i2);
        this.f20799a.mo53239a(activity, new C8089bz(oguryThumbnailGravity.getValue(), i, i2));
    }

    public final boolean isLoaded() {
        return this.f20799a.mo53245a();
    }

    public final void setWhiteListPackages(String... strArr) {
        C8467mq.m23881b(strArr, "packages");
        this.f20799a.mo53244a(strArr);
    }

    @SafeVarargs
    public final void setBlackListActivities(Class<? extends Activity>... clsArr) {
        C8467mq.m23881b(clsArr, "activities");
        this.f20799a.mo53243a(clsArr);
    }

    public final void setWhiteListFragmentPackages(String... strArr) {
        C8467mq.m23881b(strArr, "packages");
        this.f20799a.mo53250b(strArr);
    }

    @SafeVarargs
    public final void setBlackListFragments(Class<? extends Object>... clsArr) {
        C8467mq.m23881b(clsArr, "fragments");
        this.f20799a.mo53249b(clsArr);
    }

    public final void logWhiteListedActivities(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        this.f20799a.mo53247b(activity);
    }
}

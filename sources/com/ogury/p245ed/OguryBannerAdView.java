package com.ogury.p245ed;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8005a;
import com.ogury.p245ed.internal.C8009ac;
import com.ogury.p245ed.internal.C8090c;
import com.ogury.p245ed.internal.C8182e;
import com.ogury.p245ed.internal.C8193ej;
import com.ogury.p245ed.internal.C8214f;
import com.ogury.p245ed.internal.C8239ft;
import com.ogury.p245ed.internal.C8280h;
import com.ogury.p245ed.internal.C8381k;
import com.ogury.p245ed.internal.C8463mm;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8540w;
import p269io.presage.C15576R;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.OguryBannerAdView */
public final class OguryBannerAdView extends FrameLayout implements C8009ac {

    /* renamed from: a */
    private C8540w f20791a;

    /* renamed from: b */
    private OguryBannerAdSize f20792b;

    /* renamed from: c */
    private AdConfig f20793c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C8463mm) null);
        C8467mq.m23881b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8463mm) null);
        C8467mq.m23881b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, C8463mm mmVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        C8467mq.m23881b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C8467mq.m23878a((Object) applicationContext, "context.applicationContext");
        this.f20791a = new C8540w(applicationContext, this);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C15576R.styleable.BannerLayout, 0, 0);
        String string = obtainStyledAttributes.getString(C15576R.styleable.BannerLayout_adUnit);
        this.f20793c = new AdConfig(string == null ? "" : string);
        int i2 = obtainStyledAttributes.getInt(C15576R.styleable.BannerLayout_bannerAdSize, 0);
        if (i2 == OguryBannerAdSize.SMALL_BANNER_320x50.getHeight()) {
            setAdSize(OguryBannerAdSize.SMALL_BANNER_320x50);
        } else if (i2 == OguryBannerAdSize.MPU_300x250.getHeight()) {
            setAdSize(OguryBannerAdSize.MPU_300x250);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAdUnit(String str) {
        C8467mq.m23881b(str, "adUnitId");
        this.f20793c = new AdConfig(str);
    }

    public final void setAdSize(OguryBannerAdSize oguryBannerAdSize) {
        C8467mq.m23881b(oguryBannerAdSize, "adSize");
        OguryIntegrationLogger.m22104d(C8467mq.m23873a("[Ads] Banner Ad View - setAdSize() called with adSize: ", (Object) oguryBannerAdSize.name()));
        this.f20792b = oguryBannerAdSize;
    }

    private final void setCampaignId(String str) {
        C8239ft.m23149a(this.f20793c, str);
    }

    private final void setCreativeId(String str) {
        C8239ft.m23150b(this.f20793c, str);
    }

    @Deprecated
    public final void setCallback(OguryBannerCallback oguryBannerCallback) {
        this.f20791a.mo54008a((C8280h) C8090c.m22557a(oguryBannerCallback));
    }

    public final void setListener(OguryBannerAdListener oguryBannerAdListener) {
        OguryIntegrationLogger.m22104d("[Ads] Banner Ad View - setListener() called");
        C8540w wVar = this.f20791a;
        C8214f.C8215a aVar = C8214f.f21265a;
        wVar.mo54008a((C8280h) C8214f.C8215a.m22993a(oguryBannerAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C8540w wVar = this.f20791a;
        C8182e.C8183a aVar = C8182e.f21170a;
        wVar.mo54009a((C8381k) C8182e.C8183a.m22793a(oguryAdImpressionListener));
    }

    public final void loadAd() {
        OguryIntegrationLogger.m22104d("[Ads] Banner Ad View - load() called");
        C8005a aVar = C8005a.f20804a;
        C8193ej a = C8005a.m22255a(this.f20792b);
        C8005a aVar2 = C8005a.f20804a;
        this.f20791a.mo54010a(this.f20793c, a, C8005a.m22256b(this.f20792b));
    }

    public final boolean isBannerExpanded() {
        return this.f20791a.mo54012c();
    }

    public final void destroy() {
        ViewGroup container = getContainer();
        if (container != null) {
            container.removeView(this);
        }
        removeAllViews();
        this.f20791a.mo54011b();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m22251a()) {
            this.f20791a.mo54007a();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        this.f20791a.mo54007a();
    }

    /* renamed from: a */
    private final boolean m22251a() {
        return getChildCount() > 0;
    }

    private final ViewGroup getContainer() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20791a.mo54007a();
    }
}

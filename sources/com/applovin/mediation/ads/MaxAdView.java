package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.C1220a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.utils.C1513b;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.impl.sdk.utils.C1558s;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

public class MaxAdView extends RelativeLayout {

    /* renamed from: a */
    private MaxAdViewImpl f3907a;

    /* renamed from: b */
    private View f3908b;

    /* renamed from: c */
    private int f3909c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String attributeValue = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, "adUnitId");
        String attributeValue2 = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat c = C1553o.m3554b(attributeValue2) ? C1557r.m3624c(attributeValue2) : C1513b.m3407a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (attributeValue == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(attributeValue)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m3685a(attributeValue, c, attributeIntValue, AppLovinSdk.getInstance(activity), activity);
        } else {
            throw new IllegalArgumentException("Max ad view context is not an activity");
        }
    }

    public MaxAdView(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Activity activity) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Activity activity) {
        super(activity);
        C1220a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        m3685a(str, maxAdFormat, 49, appLovinSdk, activity);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Activity activity) {
        this(str, C1513b.m3407a((Context) activity), appLovinSdk, activity);
    }

    /* renamed from: a */
    private void m3684a(MaxAdFormat maxAdFormat, Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (maxAdFormat == MaxAdFormat.MREC) {
            i = (int) TypedValue.applyDimension(1, (float) AppLovinAdSize.MREC.getWidth(), displayMetrics);
            i2 = (int) TypedValue.applyDimension(1, (float) AppLovinAdSize.MREC.getHeight(), displayMetrics);
        } else {
            int i3 = displayMetrics.widthPixels;
            i2 = (int) TypedValue.applyDimension(1, (float) (maxAdFormat == MaxAdFormat.BANNER ? AppLovinAdSize.BANNER : AppLovinAdSize.LEADER).getHeight(), displayMetrics);
            i = i3;
        }
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    /* renamed from: a */
    private void m3685a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Activity activity) {
        if (!isInEditMode()) {
            View view = new View(activity);
            this.f3908b = view;
            view.setBackgroundColor(0);
            addView(this.f3908b);
            this.f3908b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f3909c = getVisibility();
            this.f3907a = new MaxAdViewImpl(str, maxAdFormat, this, this.f3908b, C1557r.m3585a(appLovinSdk), activity);
            setGravity(i);
            if (getBackground() instanceof ColorDrawable) {
                setBackgroundColor(((ColorDrawable) getBackground()).getColor());
            }
            super.setBackgroundColor(0);
            return;
        }
        m3684a(maxAdFormat, activity);
    }

    public void destroy() {
        this.f3907a.destroy();
    }

    public String getPlacement() {
        return this.f3907a.getPlacement();
    }

    public void loadAd() {
        this.f3907a.loadAd();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        MaxAdViewImpl maxAdViewImpl = this.f3907a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f3907a != null && C1558s.m3636a(this.f3909c, i)) {
            this.f3907a.onWindowVisibilityChanged(i);
        }
        this.f3909c = i;
    }

    public void setAlpha(float f) {
        MaxAdViewImpl maxAdViewImpl = this.f3907a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f3908b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public void setBackgroundColor(int i) {
        MaxAdViewImpl maxAdViewImpl = this.f3907a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f3907a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i);
        }
        View view = this.f3908b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f3907a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f3907a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f3907a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f3907a.setListener(maxAdViewAdListener);
    }

    public void setPlacement(String str) {
        this.f3907a.setPlacement(str);
    }

    public void startAutoRefresh() {
        this.f3907a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f3907a.stopAutoRefresh();
    }

    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f3907a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}

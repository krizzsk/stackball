package com.applovin.impl.adview;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a */
public class C1039a extends RelativeLayout {

    /* renamed from: a */
    private final ProgressBar f1821a;

    public C1039a(Activity activity, int i, int i2) {
        super(activity);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, i2);
        this.f1821a = progressBar;
        progressBar.setIndeterminate(true);
        this.f1821a.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(activity, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        this.f1821a.setLayoutParams(layoutParams);
        addView(this.f1821a);
    }

    /* renamed from: a */
    public void mo11807a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo11808b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f1821a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}

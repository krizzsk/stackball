package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class l60 {

    /* renamed from: c */
    private static final int f36542c = Color.parseColor("#66000000");

    /* renamed from: d */
    private static final int f36543d = Color.parseColor("#00000000");

    /* renamed from: e */
    private static final int f36544e = Color.parseColor("#7f7f7f");

    /* renamed from: a */
    private Context f36545a;

    /* renamed from: b */
    private final NativeAdAssets f36546b;

    public l60(Context context, NativeAdAssets nativeAdAssets) {
        this.f36545a = context;
        this.f36546b = nativeAdAssets;
    }

    /* renamed from: a */
    public void mo68358a(ImageView imageView, FrameLayout frameLayout, int i) {
        if (!new m60(this.f36546b).mo68580a()) {
            m38623a(imageView, f36544e);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground((Drawable) null);
            frameLayout.setVisibility(0);
        } else if (this.f36546b.getMedia() != null) {
            m38623a(imageView, f36544e);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground((Drawable) null);
            frameLayout.setVisibility(8);
        } else if (this.f36546b.getImage() != null) {
            m38623a(imageView, -1);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f36542c, f36543d});
            frameLayout.setPadding(0, 0, 0, i);
            frameLayout.setBackground(gradientDrawable);
            frameLayout.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m38623a(ImageView imageView, int i) {
        Drawable drawable = this.f36545a.getResources().getDrawable(C12066R.C12067drawable.yandex_ads_internal_ic_close_gray);
        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        imageView.setImageDrawable(drawable);
    }
}

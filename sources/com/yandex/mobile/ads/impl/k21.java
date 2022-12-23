package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class k21<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f35937a;

    /* renamed from: b */
    private final l21 f35938b = new l21();

    /* renamed from: c */
    private final qq0 f35939c = new qq0();

    /* renamed from: d */
    private final ar0 f35940d = new ar0();

    public k21(NativeAdAssets nativeAdAssets) {
        this.f35937a = nativeAdAssets;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        String str;
        this.f35940d.getClass();
        ViewGroup viewGroup = (ViewGroup) v.findViewById(C12066R.C12068id.rating_container);
        Float rating = this.f35937a.getRating();
        if (rating != null) {
            this.f35939c.getClass();
            TextView textView = (TextView) v.findViewById(C12066R.C12068id.rating_text);
            if (textView != null) {
                l21 l21 = this.f35938b;
                float floatValue = rating.floatValue();
                l21.getClass();
                try {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                    decimalFormatSymbols.setDecimalSeparator(',');
                    str = new DecimalFormat("0.0", decimalFormatSymbols).format((double) floatValue);
                } catch (RuntimeException unused) {
                    str = String.valueOf(floatValue);
                }
                textView.setText(str);
            }
        } else if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C12066R;

/* renamed from: com.yandex.mobile.ads.impl.aj */
public class C12389aj extends FrameLayout {

    /* renamed from: c */
    private static final int f30556c = C12066R.layout.yandex_ads_internal_outstream_controls_default;

    /* renamed from: a */
    private final int f30557a;

    /* renamed from: b */
    private final bn1 f30558b;

    public C12389aj(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo65781a() {
        return this.f30557a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public bn1 mo65782b() {
        return this.f30558b;
    }

    public C12389aj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12389aj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.YandexAdsInternalMediaView);
            cn1 cn1 = new cn1();
            this.f30557a = obtainStyledAttributes.getResourceId(C12066R.styleable.YandexAdsInternalMediaView_yandex_video_controls_layout, f30556c);
            this.f30558b = cn1.mo66335a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            return;
        }
        this.f30557a = f30556c;
        this.f30558b = null;
    }
}

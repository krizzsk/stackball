package com.yandex.mobile.ads.nativeads.template;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.yandex.mobile.ads.nativeads.template.b */
class C15544b {

    /* renamed from: b */
    static final int f44065b = Color.parseColor("#eaeaea");

    /* renamed from: a */
    private final ImageView[] f44066a;

    C15544b(ImageView... imageViewArr) {
        this.f44066a = imageViewArr;
        mo71900b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71899a() {
        for (ImageView imageView : this.f44066a) {
            ColorDrawable colorDrawable = (ColorDrawable) imageView.getBackground();
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                m45343a(colorDrawable, 255, 0).start();
                m45343a(drawable, 0, 255).start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71900b() {
        for (ImageView imageView : this.f44066a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f44065b);
                }
            }
        }
    }

    /* renamed from: a */
    private ObjectAnimator m45343a(Drawable drawable, int i, int i2) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", new int[]{i, i2})});
        ofPropertyValuesHolder.setTarget(drawable);
        ofPropertyValuesHolder.setDuration(500);
        return ofPropertyValuesHolder;
    }
}

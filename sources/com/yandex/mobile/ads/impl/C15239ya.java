package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.yandex.mobile.ads.impl.ya */
public class C15239ya<T extends View> implements C15236y7<T> {
    public C15239ya(int i) {
    }

    /* renamed from: a */
    public void mo66392a() {
    }

    /* renamed from: a */
    public void mo66393a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
        }
    }
}

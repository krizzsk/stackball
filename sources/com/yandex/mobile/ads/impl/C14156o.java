package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* renamed from: com.yandex.mobile.ads.impl.o */
class C14156o {

    /* renamed from: a */
    private final c41 f38036a = new c41();

    /* renamed from: b */
    private final qz0 f38037b = new qz0();

    /* renamed from: c */
    private final r61<PlaybackControlsContainer> f38038c = new r61<>();

    C14156o() {
    }

    /* renamed from: a */
    public qt0 mo69091a(Context context, jm1 jm1, int i) {
        PlaybackControlsContainer a = this.f38038c.mo69698a(context, PlaybackControlsContainer.class, i, (ViewGroup) null);
        a41 a2 = this.f38036a.mo66202a(context);
        qt0 qt0 = new qt0(context, a2, a);
        if (a != null) {
            this.f38037b.getClass();
            CheckBox b = a.mo71931b();
            if (b != null) {
                b.setChecked(jm1.mo68064a());
            }
            a.setVisibility(8);
            qt0.addView(a);
        }
        a2.setVisibility(8);
        qt0.addView(a2);
        return qt0;
    }
}

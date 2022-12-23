package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.Rating;

public class j21<V extends View & Rating> extends un1<V, String> {
    public j21(V v) {
        super(v);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        String str = (String) obj;
        return true;
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        String str = (String) obj;
        try {
            ((Rating) view).setRating(Math.max(Float.parseFloat(str), 0.0f));
        } catch (NumberFormatException unused) {
            String.format("Could not parse rating value. Rating value is %s", new Object[]{str});
        }
    }

    /* renamed from: a */
    public void mo65866a(V v) {
        ((Rating) v).setRating(0.0f);
        super.mo65866a(v);
    }
}

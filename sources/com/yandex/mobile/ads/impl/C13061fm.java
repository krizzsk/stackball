package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.mobile.ads.C12066R;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.fm */
public final class C13061fm implements b60<Context> {

    /* renamed from: a */
    private final Provider<ContextThemeWrapper> f33392a;

    public C13061fm(Provider<ContextThemeWrapper> provider) {
        this.f33392a = provider;
    }

    public Object get() {
        return new ContextThemeWrapper(this.f33392a.get(), C12066R.style.Div_Theme);
    }
}

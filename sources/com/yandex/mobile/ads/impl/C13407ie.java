package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.ie */
public class C13407ie<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final tq0 f34825a = new tq0();

    /* renamed from: b */
    private final Locale f34826b;

    /* renamed from: c */
    private final int f34827c;

    public C13407ie(AdResponse<?> adResponse, int i) {
        this.f34826b = adResponse.mo64443w();
        this.f34827c = i;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        Context context = v.getContext();
        Locale locale = this.f34826b;
        int i = this.f34827c;
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.setLocale(locale);
            resources = context.createConfigurationContext(configuration).getResources();
        }
        String string = resources.getString(i);
        TextView k = this.f34825a.mo65911k(v);
        if (k != null && string != null) {
            k.setText(string);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}

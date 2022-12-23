package com.tapjoy;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class TapjoyDisplayMetricsUtil {

    /* renamed from: a */
    private Context f22265a;

    /* renamed from: b */
    private Configuration f22266b;

    /* renamed from: c */
    private DisplayMetrics f22267c = new DisplayMetrics();

    public TapjoyDisplayMetricsUtil(Context context) {
        this.f22265a = context;
        ((WindowManager) this.f22265a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f22267c);
        this.f22266b = this.f22265a.getResources().getConfiguration();
    }

    public int getScreenDensityDPI() {
        return this.f22267c.densityDpi;
    }

    public float getScreenDensityScale() {
        return this.f22267c.density;
    }

    public int getScreenLayoutSize() {
        return this.f22266b.screenLayout & 15;
    }
}

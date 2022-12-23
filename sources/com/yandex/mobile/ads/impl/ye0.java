package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.yf0;

public class ye0 {

    /* renamed from: a */
    private final kg0 f42816a;

    public ye0(kg0 kg0) {
        this.f42816a = kg0;
    }

    /* renamed from: a */
    public yf0 mo71037a(qj1 qj1, yf0 yf0) {
        boolean z = this.f42816a.getVolume() == 0.0f;
        View g = qj1.mo69610g();
        Float f = null;
        Boolean valueOf = g != null ? Boolean.valueOf(g.isEnabled()) : null;
        ProgressBar f2 = qj1.mo69609f();
        if (f2 != null) {
            int progress = f2.getProgress();
            int max = f2.getMax();
            if (max != 0) {
                f = Float.valueOf(((float) progress) / ((float) max));
            }
        }
        yf0.C15248b bVar = new yf0.C15248b();
        bVar.mo71052b(z);
        if (valueOf != null) {
            bVar.mo71049a(valueOf.booleanValue());
        }
        if (f != null) {
            bVar.mo71051b(f.floatValue());
        }
        bVar.mo71048a(yf0.mo71044a());
        return bVar.mo71050a();
    }
}

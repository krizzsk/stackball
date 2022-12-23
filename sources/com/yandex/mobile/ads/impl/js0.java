package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.ye1;
import java.lang.ref.WeakReference;

class js0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<View> f35618a;

    /* renamed from: b */
    private final ye1.C15244a f35619b;

    /* renamed from: c */
    private Integer f35620c;

    js0(View view, ye1.C15244a aVar) {
        this.f35618a = new WeakReference<>(view);
        this.f35619b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68088a() {
        View view = (View) this.f35618a.get();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        View view = (View) this.f35618a.get();
        if (view != null) {
            Integer valueOf = Integer.valueOf(view.getVisibility());
            if (!valueOf.equals(this.f35620c)) {
                this.f35620c = valueOf;
                if (this.f35619b == null) {
                    return;
                }
                if (valueOf.intValue() == 0) {
                    this.f35619b.mo71040a();
                } else {
                    this.f35619b.mo71041b();
                }
            }
        }
    }
}

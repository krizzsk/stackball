package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C13955m5;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.me1;

/* renamed from: com.yandex.mobile.ads.banner.k */
abstract class C12084k extends me1 {

    /* renamed from: I */
    private boolean f29062I = true;

    /* renamed from: J */
    private Runnable f29063J = new C12085a();

    /* renamed from: com.yandex.mobile.ads.banner.k$a */
    class C12085a implements Runnable {
        C12085a() {
        }

        public void run() {
            C12084k kVar = C12084k.this;
            kVar.mo64584b(kVar.mo64594f());
        }
    }

    C12084k(Context context, C13955m5 m5Var, C12115n nVar, C15230y2 y2Var) {
        super(context, m5Var, nVar, y2Var);
    }

    /* renamed from: x */
    private void m31249x() {
        this.f29208a.removeCallbacks(this.f29063J);
        AdResponse g = mo64595g();
        if (g != null && g.mo64418I() && this.f29062I && !mo68676v()) {
            this.f29208a.postDelayed(this.f29063J, (long) g.mo64426f());
        }
    }

    /* renamed from: b */
    public void mo64405b(int i) {
        super.mo64405b(i);
        m31249x();
    }

    /* renamed from: c */
    public void mo64364c() {
        super.mo64364c();
        this.f29062I = false;
        this.f29208a.removeCallbacks(this.f29063J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo64406n() {
        super.mo64406n();
        m31249x();
    }

    /* renamed from: a */
    public void mo64403a(Intent intent) {
        super.mo64403a(intent);
        m31249x();
    }

    /* renamed from: a */
    public void mo64404a(C12350a2 a2Var) {
        super.mo64404a(a2Var);
        if (5 != a2Var.mo65651a() && 2 != a2Var.mo65651a()) {
            m31249x();
        }
    }
}

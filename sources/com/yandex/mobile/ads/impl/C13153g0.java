package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import java.io.Serializable;

/* renamed from: com.yandex.mobile.ads.impl.g0 */
public final class C13153g0 implements C12348a0, C14384qh {

    /* renamed from: a */
    private final RelativeLayout f33798a;

    /* renamed from: b */
    private final AdResponse<String> f33799b;

    /* renamed from: c */
    private final Window f33800c;

    /* renamed from: d */
    private final C13371i0 f33801d;

    /* renamed from: e */
    private final z70 f33802e;

    /* renamed from: f */
    private final hx0 f33803f;

    /* renamed from: g */
    private final w70 f33804g;

    C13153g0(Context context, RelativeLayout relativeLayout, C13371i0 i0Var, Window window, g80 g80) {
        this.f33798a = relativeLayout;
        this.f33800c = window;
        this.f33801d = i0Var;
        AdResponse<String> a = g80.mo67208a();
        this.f33799b = a;
        z70 b = g80.mo67209b();
        this.f33802e = b;
        b.mo71163a((C14384qh) this);
        this.f33803f = new hx0(context, a, i0Var);
        this.f33804g = new w70(context);
    }

    /* renamed from: a */
    public void mo64505a() {
        ((C14049n0) this.f33801d).mo68877a(2, (Bundle) null);
        this.f33802e.mo71169h();
    }

    /* renamed from: b */
    public void mo64508b() {
        ((C14049n0) this.f33801d).mo68877a(3, (Bundle) null);
        this.f33802e.mo71167f();
    }

    /* renamed from: c */
    public void mo64510c() {
        this.f33802e.mo71165d();
    }

    /* renamed from: d */
    public void mo64511d() {
        this.f33800c.requestFeature(1);
        this.f33800c.addFlags(1024);
        this.f33800c.addFlags(16777216);
        if (C13378i5.m37280a(28)) {
            this.f33800c.setBackgroundDrawableResource(17170444);
            this.f33800c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.f33803f.mo67702a();
    }

    /* renamed from: e */
    public void mo64512e() {
        this.f33802e.mo71162a(this.f33798a);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_tracking_parameters", (Serializable) this.f33802e.mo71166e().mo65692a());
        ((C14049n0) this.f33801d).mo68877a(0, bundle);
        ((C14049n0) this.f33801d).mo68877a(5, (Bundle) null);
    }

    /* renamed from: f */
    public boolean mo64513f() {
        if (this.f33804g.mo70656a()) {
            if (!(this.f33802e.mo71166e().mo65693b() && this.f33799b.mo64415F())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo67136g() {
        ((C14049n0) this.f33801d).mo68875a();
    }

    public void onAdClosed() {
        ((C14049n0) this.f33801d).mo68877a(4, (Bundle) null);
    }
}

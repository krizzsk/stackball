package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;

/* renamed from: com.yandex.mobile.ads.impl.j0 */
public class C13463j0 implements C12348a0, C14384qh {

    /* renamed from: a */
    private final Context f35090a;

    /* renamed from: b */
    private final C13371i0 f35091b;

    /* renamed from: c */
    private final Window f35092c;

    /* renamed from: d */
    private final C15526t f35093d;

    /* renamed from: e */
    private final u80 f35094e;

    /* renamed from: f */
    private final w70 f35095f;

    public C13463j0(Context context, RelativeLayout relativeLayout, Window window, C15526t tVar, AdResponse<String> adResponse, C13371i0 i0Var, C12947e0 e0Var, int i) {
        C13371i0 i0Var2 = i0Var;
        this.f35090a = context;
        this.f35092c = window;
        this.f35091b = i0Var2;
        C15526t tVar2 = tVar;
        this.f35093d = tVar2;
        this.f35094e = new v80(i0Var2, i).mo70457a(context, adResponse, tVar2, relativeLayout, this, new vs0(i0Var2), e0Var);
        this.f35095f = new w70(context);
    }

    /* renamed from: a */
    public void mo64505a() {
        ((C14049n0) this.f35091b).mo68877a(2, (Bundle) null);
    }

    /* renamed from: b */
    public void mo64508b() {
        ((C14049n0) this.f35091b).mo68877a(3, (Bundle) null);
    }

    /* renamed from: c */
    public void mo64510c() {
        this.f35094e.mo70306a();
    }

    /* renamed from: d */
    public void mo64511d() {
        ((C14049n0) this.f35091b).mo68876a(this.f35090a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f35092c.requestFeature(1);
        this.f35092c.addFlags(1024);
        this.f35092c.addFlags(16777216);
        if (C13378i5.m37280a(28)) {
            this.f35092c.setBackgroundDrawableResource(17170444);
            this.f35092c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* renamed from: e */
    public void mo64512e() {
        this.f35094e.mo70307b();
        ((C14049n0) this.f35091b).mo68877a(0, (Bundle) null);
        ((C14049n0) this.f35091b).mo68877a(5, (Bundle) null);
    }

    /* renamed from: f */
    public boolean mo64513f() {
        return this.f35095f.mo70656a();
    }

    /* renamed from: g */
    public void mo67136g() {
        ((C14049n0) this.f35091b).mo68875a();
    }

    public void onAdClosed() {
        this.f35093d.destroy();
        ((C14049n0) this.f35091b).mo68877a(4, (Bundle) null);
    }
}

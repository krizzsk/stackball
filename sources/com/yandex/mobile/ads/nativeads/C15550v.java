package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C13838l9;
import com.yandex.mobile.ads.impl.C14063n9;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14660t9;
import com.yandex.mobile.ads.impl.d81;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.hm0;
import com.yandex.mobile.ads.impl.ht0;
import com.yandex.mobile.ads.impl.is0;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.nativeads.v */
public class C15550v<T extends View> {

    /* renamed from: a */
    private final C15476c f44085a;

    /* renamed from: b */
    private final ed0 f44086b;

    /* renamed from: c */
    private final C15471a0 f44087c;

    /* renamed from: d */
    private final Map<String, C13838l9> f44088d;

    /* renamed from: e */
    private final C15554w f44089e = new C15554w();

    public C15550v(T t, is0<T> is0, C14645t1 t1Var, ed0 ed0, sd0 sd0, C15476c cVar, or0 or0, C14660t9 t9Var, ht0 ht0, d81 d81) {
        this.f44085a = cVar;
        this.f44086b = ed0;
        hm0 hm0 = new hm0(t9Var, t1Var, sd0, or0.mo69261c(), d81);
        T t2 = t;
        is0<T> is02 = is0;
        C15471a0 a = is0.mo67888a(t);
        this.f44087c = a;
        this.f44088d = new C14063n9(a, ed0, hm0, ht0).mo68935a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71922a() {
        for (C13838l9 next : this.f44088d.values()) {
            if (next != null) {
                next.mo67817a();
            }
        }
    }

    /* renamed from: b */
    public void mo71923b() {
        for (C13838l9 next : this.f44088d.values()) {
            if (next != null) {
                next.destroy();
            }
        }
    }

    /* renamed from: c */
    public Map<String, C13838l9> mo71924c() {
        return this.f44088d;
    }

    /* renamed from: d */
    public ed0 mo71925d() {
        return this.f44086b;
    }

    /* renamed from: e */
    public View mo71926e() {
        return this.f44087c.mo71630k();
    }

    /* renamed from: f */
    public NativeAdViewBinder mo71927f() {
        View k = this.f44087c.mo71630k();
        View view = null;
        if (k == null) {
            return null;
        }
        C15554w wVar = this.f44089e;
        C15471a0 a0Var = this.f44087c;
        wVar.getClass();
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(k);
        try {
            NativeAdViewBinder.Builder priceView = builder.setAgeView(a0Var.mo71620a()).setBodyView(a0Var.mo71621b()).setCallToActionView(a0Var.mo71622c()).setDomainView(a0Var.mo71624e()).setFaviconView(a0Var.mo71625f()).setFeedbackView(a0Var.mo71626g()).setIconView(a0Var.mo71627h()).setMediaView(a0Var.mo71629j()).setPriceView(a0Var.mo71631l());
            View m = a0Var.mo71632m();
            if (m instanceof Rating) {
                view = m;
            }
            priceView.setRatingView(view).setReviewCountView(a0Var.mo71633n()).setSponsoredView(a0Var.mo71634o()).setTitleView(a0Var.mo71635p()).setWarningView(a0Var.mo71636q());
        } catch (Exception unused) {
        }
        return builder.build();
    }

    /* renamed from: g */
    public C15476c mo71928g() {
        return this.f44085a;
    }

    /* renamed from: h */
    public C15471a0 mo71929h() {
        return this.f44087c;
    }

    /* renamed from: a */
    public C13838l9 mo71921a(C13690k9 k9Var) {
        if (k9Var != null) {
            return this.f44088d.get(k9Var.mo68167b());
        }
        return null;
    }
}

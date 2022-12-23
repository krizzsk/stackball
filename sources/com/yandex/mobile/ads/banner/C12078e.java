package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.C13474j5;
import com.yandex.mobile.ads.impl.C14559s3;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.cb0;
import com.yandex.mobile.ads.impl.eq1;
import com.yandex.mobile.ads.impl.jb0;

/* renamed from: com.yandex.mobile.ads.banner.e */
public class C12078e extends cb0 {

    /* renamed from: n */
    private final SizeInfo f29053n;

    /* renamed from: o */
    private SizeInfo f29054o;

    /* renamed from: p */
    private boolean f29055p = true;

    /* renamed from: q */
    final int f29056q;

    /* renamed from: r */
    int f29057r;

    C12078e(Context context, AdResponse adResponse, C14645t1 t1Var, SizeInfo sizeInfo) {
        super(context, adResponse, t1Var);
        this.f29053n = sizeInfo;
        if (mo64389l()) {
            this.f29056q = sizeInfo.mo64491c(context);
            this.f29057r = sizeInfo.mo64488a(context);
        } else {
            this.f29056q = adResponse.mo64436p() == 0 ? sizeInfo.mo64491c(context) : adResponse.mo64436p();
            this.f29057r = adResponse.mo64422c();
        }
        m31225a(this.f29056q, this.f29057r);
    }

    /* renamed from: a */
    private void m31225a(int i, int i2) {
        this.f29054o = new SizeInfo(i, i2, this.f29053n.mo64493d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo64385b(int i, String str) {
        if (this.f31869k.mo64422c() != 0) {
            i = this.f31869k.mo64422c();
        }
        this.f29057r = i;
        super.mo64385b(i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo64386c() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f31869k.mo64419J()) {
            int i = this.f29056q;
            String str3 = eq1.f33044a;
            str = "<body style='width:" + i + "px;'>";
        } else {
            str = str2;
        }
        sb.append(str);
        Context context = getContext();
        int c = this.f29053n.mo64491c(context);
        int a = this.f29053n.mo64488a(context);
        if (mo64389l()) {
            String str4 = eq1.f33044a;
            str2 = "\n<style>ytag.container { width:" + c + "px; height:" + a + "px; }</style>\n";
        }
        sb.append(str2);
        sb.append(super.mo64386c());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo64387h() {
        if (this.f29055p) {
            this.f29054o = new SizeInfo(this.f29056q, this.f29057r, this.f29053n.mo64493d());
            boolean a = C13474j5.m37668a(getContext(), this.f29054o, this.f29053n);
            jb0 jb0 = this.f32295f;
            if (jb0 != null && a) {
                jb0.mo64356a(this, mo66245i());
            }
            jb0 jb02 = this.f32295f;
            if (jb02 != null) {
                if (a) {
                    jb02.onAdLoaded();
                } else {
                    jb02.mo64404a(C14559s3.f39810c);
                }
            }
            this.f29055p = false;
        }
    }

    /* renamed from: k */
    public SizeInfo mo64388k() {
        return this.f29054o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo64389l() {
        Context context = getContext();
        return mo66246j() && this.f31869k.mo64436p() == 0 && this.f31869k.mo64422c() == 0 && this.f29053n.mo64491c(context) > 0 && this.f29053n.mo64488a(context) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64384a(Context context, C14645t1 t1Var) {
        addJavascriptInterface(new cb0.C12720a(context), "AdPerformActionsJSI");
    }
}

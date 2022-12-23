package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12116o;
import com.yandex.mobile.ads.base.SizeInfo;

public abstract class za0 extends C12116o<String> implements jb0, AdResultReceiver.C12088a {

    /* renamed from: x */
    private final ab0 f43071x;

    /* renamed from: y */
    protected final AdResultReceiver f43072y;

    za0(Context context, C12115n nVar, C15230y2 y2Var) {
        super(context, nVar, y2Var);
        AdResultReceiver adResultReceiver = new AdResultReceiver(this.f29208a);
        this.f43072y = adResultReceiver;
        adResultReceiver.mo64485a(this);
        this.f43071x = new ab0(context, this.f29213f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13403ib<String> mo64575a(String str, String str2) {
        return new C15289z1(this.f29209b, this.f29213f, str, str2, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64361a(String str, AdResponse<String> adResponse, SizeInfo sizeInfo);

    /* renamed from: a */
    public void mo66858a(boolean z) {
    }

    /* renamed from: b */
    public void mo68674b(AdResponse<String> adResponse) {
        mo64591c("Yandex");
        this.f29217j.mo70970b(C15139x2.ADAPTER_LOADING);
        SizeInfo n = this.f29213f.mo70108n();
        if (n == null) {
            mo64404a(C14559s3.f39811d);
            return;
        }
        SizeInfo D = adResponse.mo64413D();
        if (!(mo64363b(D) && C13474j5.m37668a(this.f29209b, D, n))) {
            mo64404a(C14559s3.f39810c);
            return;
        }
        String z = adResponse.mo64447z();
        if (!TextUtils.isEmpty(z)) {
            mo64361a(z, adResponse, n);
        } else {
            mo64404a(C14559s3.f39812e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo64363b(SizeInfo sizeInfo);

    /* renamed from: c */
    public synchronized void mo64364c() {
        super.mo64364c();
        this.f43072y.mo64485a((AdResultReceiver.C12088a) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public synchronized void mo71192d(String str) {
        if (this.f29227t != null) {
            this.f43071x.mo65717a(str, this.f29227t, new C13946m0(this.f29209b, this.f29213f.mo70113s(), this.f43072y));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo71191a(SizeInfo sizeInfo, SizeInfo sizeInfo2) {
        return mo64363b(sizeInfo) && C13474j5.m37668a(this.f29209b, sizeInfo, sizeInfo2);
    }

    /* renamed from: a */
    public void mo64580a(ug1 ug1) {
        mo64578a(this.f29213f.mo70080a(), ug1);
    }
}

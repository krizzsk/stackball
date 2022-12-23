package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

public class k80 implements ko0, lo0 {

    /* renamed from: a */
    private final Context f36017a;

    /* renamed from: b */
    private final AdResponse<String> f36018b;

    /* renamed from: c */
    private final AdResultReceiver f36019c;

    /* renamed from: d */
    private final pr1 f36020d;

    public k80(Context context, C14645t1 t1Var, AdResponse<String> adResponse, AdResultReceiver adResultReceiver) {
        this.f36017a = context;
        this.f36018b = adResponse;
        this.f36019c = adResultReceiver;
        this.f36020d = new pr1(t1Var);
    }

    /* renamed from: a */
    public void mo68155a() {
        this.f36020d.mo69424a(this.f36017a, this.f36018b);
        this.f36019c.send(13, (Bundle) null);
    }

    /* renamed from: c */
    public void mo68156c() {
        this.f36019c.send(14, (Bundle) null);
    }

    /* renamed from: e */
    public void mo68157e() {
        this.f36019c.send(15, (Bundle) null);
    }
}

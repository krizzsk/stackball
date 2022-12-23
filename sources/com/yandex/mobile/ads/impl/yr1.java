package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.lang.ref.WeakReference;

public class yr1 implements d80 {

    /* renamed from: a */
    private final WeakReference<m80> f42924a;

    /* renamed from: b */
    private final pr1 f42925b;

    public yr1(m80 m80) {
        this.f42924a = new WeakReference<>(m80);
        this.f42925b = new pr1(m80.mo64592d());
    }

    /* renamed from: a */
    public void mo66522a(Context context) {
    }

    /* renamed from: a */
    public boolean mo66524a() {
        m80 m80 = (m80) this.f42924a.get();
        return m80 != null && m80.mo64598j();
    }

    /* renamed from: b */
    public void mo66525b() {
        m80 m80 = (m80) this.f42924a.get();
        if (m80 != null) {
            m80.mo68610C();
        }
    }

    /* renamed from: a */
    public void mo66523a(Context context, AdResponse<String> adResponse) {
        m80 m80 = (m80) this.f42924a.get();
        if (m80 != null) {
            this.f42925b.mo69425a(context, adResponse, (h41.C13275a) null);
            this.f42925b.mo69426b(context, adResponse, (h41.C13275a) null);
            m80.mo68674b(adResponse);
        }
    }
}

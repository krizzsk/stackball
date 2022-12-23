package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.xe0;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.List;

public class nf0 implements r41<ep1>, xe0.C15168b {

    /* renamed from: a */
    private final Context f37800a;

    /* renamed from: b */
    private final xe0 f37801b;

    /* renamed from: c */
    private final C14097a f37802c;

    /* renamed from: d */
    private final m20 f37803d = new m20();

    /* renamed from: com.yandex.mobile.ads.impl.nf0$a */
    public interface C14097a {
        /* renamed from: a */
        void mo69027a(InstreamAd instreamAd);

        /* renamed from: a */
        void mo69028a(String str);
    }

    nf0(Context context, hk1 hk1, C14097a aVar) {
        this.f37800a = context.getApplicationContext();
        this.f37802c = aVar;
        this.f37801b = new xe0(hk1);
    }

    /* renamed from: a */
    public void mo66590a(Object obj) {
        List<C12563b1> a = ((ep1) obj).mo66859a();
        ArrayList arrayList = new ArrayList();
        for (C12563b1 next : a) {
            if (next.mo65935d().contains("linear")) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f37801b.mo70894a(this.f37800a, arrayList, this);
        } else {
            this.f37802c.mo69028a("Received response with no ad breaks");
        }
    }

    /* renamed from: a */
    public void mo66589a(wj1 wj1) {
        this.f37802c.mo69028a(wj1.mo70710b());
    }

    /* renamed from: a */
    public void mo69026a(List<og0> list) {
        List<og0> a = this.f37803d.mo68554a(list);
        if (!((ArrayList) a).isEmpty()) {
            this.f37802c.mo69027a((InstreamAd) new ng0(a));
            return;
        }
        this.f37802c.mo69028a("Received response with no ad breaks");
    }
}

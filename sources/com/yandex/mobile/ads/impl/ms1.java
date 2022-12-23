package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12130v;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.List;

public class ms1 implements ve1 {

    /* renamed from: a */
    private final tv0 f37511a;

    /* renamed from: b */
    private final C12130v f37512b;

    /* renamed from: c */
    private final de0 f37513c;

    /* renamed from: d */
    private final s31 f37514d;

    ms1(tv0 tv0, s31 s31, de0 de0, C12130v vVar) {
        this.f37511a = tv0;
        this.f37514d = s31;
        this.f37513c = de0;
        this.f37512b = vVar;
    }

    /* renamed from: a */
    public void mo66851a(Context context, C12130v.C12132b bVar, C15550v vVar) {
        this.f37514d.mo69855b();
        this.f37511a.mo69631b();
        this.f37512b.mo64670a(bVar, context);
        if (vVar != null) {
            this.f37513c.mo66560a(context, vVar);
        }
    }

    /* renamed from: a */
    public void mo66850a(Context context, C12130v.C12132b bVar) {
        this.f37514d.mo69856c();
        this.f37511a.mo69625a();
        this.f37512b.mo64671b(bVar, context);
        this.f37513c.mo66559a();
    }

    /* renamed from: a */
    public void mo66852a(AdResponse adResponse, List<k81> list) {
        this.f37511a.mo69627a(adResponse, list);
    }

    /* renamed from: a */
    public void mo66855a(C15550v vVar) {
        this.f37513c.mo66561a(vVar);
    }

    /* renamed from: a */
    public void mo66854a(xd0 xd0) {
        this.f37511a.mo69630a(xd0);
    }

    /* renamed from: a */
    public void mo66853a(h41.C13275a aVar) {
        this.f37514d.mo69854a(aVar);
    }
}

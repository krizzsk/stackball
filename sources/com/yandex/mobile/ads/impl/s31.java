package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.n31;
import java.util.List;

public class s31 implements n31.C14054b {

    /* renamed from: a */
    private final r31 f39828a;

    /* renamed from: b */
    private final n31 f39829b;

    /* renamed from: c */
    private final C14351q2 f39830c;

    /* renamed from: d */
    private final v31 f39831d;

    /* renamed from: e */
    private boolean f39832e;

    public s31(Context context, C14352q3 q3Var, AdResponse adResponse, C14645t1 t1Var, C14351q2 q2Var, v31 v31, List<String> list) {
        this.f39830c = q2Var;
        this.f39831d = v31;
        this.f39828a = new r31(context, adResponse, t1Var, list);
        this.f39829b = new n31(q3Var, this);
    }

    /* renamed from: a */
    public void mo69854a(h41.C13275a aVar) {
        this.f39828a.mo69685a(aVar);
    }

    /* renamed from: b */
    public void mo69855b() {
        if (!this.f39832e) {
            this.f39832e = true;
            this.f39829b.mo68883a();
        }
    }

    /* renamed from: c */
    public void mo69856c() {
        this.f39832e = false;
        this.f39829b.mo68884b();
    }

    /* renamed from: a */
    public void mo69853a() {
        this.f39828a.mo69684a();
        this.f39830c.mo69472b();
        this.f39831d.mo69955d();
    }
}

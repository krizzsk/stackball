package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.e0 */
public class C12947e0 {

    /* renamed from: a */
    private final Set<C13664k0> f32867a = new HashSet();

    /* renamed from: b */
    private final Set<C13019f0> f32868b = new HashSet();

    /* renamed from: c */
    private int f32869c;

    public C12947e0(Context context) {
        this.f32869c = m35521a(context);
    }

    /* renamed from: a */
    public void mo66721a(Configuration configuration) {
        int i = configuration.orientation;
        if (i != this.f32869c) {
            for (C13664k0 a : this.f32867a) {
                a.mo68112a(i);
            }
            this.f32869c = i;
        }
    }

    /* renamed from: b */
    public void mo66723b() {
        for (C13019f0 a : this.f32868b) {
            a.mo65687a();
        }
    }

    /* renamed from: b */
    public void mo66724b(C13019f0 f0Var) {
        this.f32868b.remove(f0Var);
    }

    /* renamed from: a */
    public void mo66720a() {
        for (C13019f0 b : this.f32868b) {
            b.mo65688b();
        }
    }

    /* renamed from: a */
    public void mo66722a(C13019f0 f0Var) {
        this.f32868b.add(f0Var);
    }

    /* renamed from: a */
    private int m35521a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}

package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.s90;

/* renamed from: com.yandex.mobile.ads.impl.lb */
public abstract class C13841lb implements do1.C12908a {

    /* renamed from: a */
    private final ViewGroup f36599a;

    /* renamed from: b */
    private final s90.C14572b f36600b;

    /* renamed from: c */
    private final s90.C14571a f36601c;

    /* renamed from: d */
    protected final SparseArray<pc1> f36602d = new SparseArray<>();

    /* renamed from: e */
    private int f36603e = 0;

    /* renamed from: f */
    private float f36604f = 0.0f;

    protected C13841lb(ViewGroup viewGroup, s90.C14572b bVar, s90.C14571a aVar) {
        this.f36599a = viewGroup;
        this.f36600b = bVar;
        this.f36601c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ int m38685b(int i, int i2) {
        return this.f36600b.mo65556a(this.f36599a, i, i2);
    }

    /* renamed from: a */
    public int mo66652a(int i, int i2) {
        pc1 pc1 = this.f36602d.get(i);
        if (pc1 == null) {
            int a = this.f36601c.mo65555a();
            if (a == 0) {
                return 0;
            }
            pc1 pc12 = new pc1(a, new pc1.C14270a(View.MeasureSpec.getSize(i)) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                /* renamed from: a */
                public final int mo65552a(int i) {
                    return C13841lb.this.m38685b(this.f$1, i);
                }
            });
            this.f36602d.put(i, pc12);
            pc1 = pc12;
        }
        return mo68393a(pc1, this.f36603e, this.f36604f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo68393a(pc1 pc1, int i, float f);

    /* renamed from: b */
    public void mo68395b(int i, float f) {
        this.f36603e = i;
        this.f36604f = f;
    }

    /* renamed from: a */
    public void mo68394a() {
        this.f36602d.clear();
    }
}

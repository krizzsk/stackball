package com.yandex.mobile.ads.base;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C13403ib;
import com.yandex.mobile.ads.impl.C14559s3;
import com.yandex.mobile.ads.impl.C15243ye;
import com.yandex.mobile.ads.impl.lv0;
import com.yandex.mobile.ads.impl.s41;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.base.g */
public class C12100g implements C15243ye {

    /* renamed from: c */
    private static final SparseArray<C12350a2> f29163c;

    /* renamed from: a */
    private final s41 f29164a = s41.m41806a();

    /* renamed from: b */
    private final WeakReference<C12116o> f29165b;

    static {
        SparseArray<C12350a2> sparseArray = new SparseArray<>();
        f29163c = sparseArray;
        sparseArray.put(6, C14559s3.f39817j);
        sparseArray.put(2, C14559s3.f39814g);
        sparseArray.put(5, C14559s3.f39812e);
        sparseArray.put(8, C14559s3.f39813f);
        C12350a2 a2Var = C14559s3.f39819l;
        sparseArray.put(10, a2Var);
        sparseArray.put(4, a2Var);
        sparseArray.put(9, C14559s3.f39815h);
        sparseArray.put(7, C14559s3.f39818k);
        sparseArray.put(11, C14559s3.f39821n);
    }

    public C12100g(C12116o oVar) {
        this.f29165b = new WeakReference<>(oVar);
    }

    /* renamed from: a */
    public static C12350a2 m31393a(int i) {
        return f29163c.get(i, C14559s3.f39826s);
    }

    /* renamed from: b */
    public void mo64526b() {
        C12116o oVar = (C12116o) this.f29165b.get();
        if (oVar != null) {
            s41 s41 = this.f29164a;
            Context context = oVar.f29209b;
            int i = C13278h5.f34274b;
            s41.mo69870a(context, oVar.toString());
        }
        this.f29165b.clear();
    }

    /* renamed from: a */
    public void mo64524a() {
        C12116o oVar = (C12116o) this.f29165b.get();
        if (oVar != null) {
            s41 s41 = this.f29164a;
            Context context = oVar.f29209b;
            int i = C13278h5.f34274b;
            s41.mo69870a(context, oVar.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64525a(C13403ib ibVar) {
        C12116o oVar = (C12116o) this.f29165b.get();
        if (oVar != null) {
            s41 s41 = this.f29164a;
            Context context = oVar.f29209b;
            synchronized (s41) {
                lv0.m39021a(context).mo70284a(ibVar);
            }
        }
    }
}

package com.fyber.inneractive.sdk.player.p083e;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.C3670q;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.e.c */
public final class C3598c extends TextureView {

    /* renamed from: a */
    private WeakReference<C3602g> f9797a;

    public C3598c(C3602g gVar) {
        super(gVar.getContext());
        this.f9797a = new WeakReference<>(gVar);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C3602g gVar = (C3602g) C3670q.m9152a(this.f9797a);
        if (gVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(gVar.f9798A.f9896a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(gVar.f9798A.f9897b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}

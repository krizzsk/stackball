package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.yandex.mobile.ads.C12066R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.eo */
final class C12986eo extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ C14697tn f33020b;

    /* renamed from: c */
    final /* synthetic */ j50 f33021c;

    /* renamed from: d */
    final /* synthetic */ C12663bx f33022d;

    /* renamed from: e */
    final /* synthetic */ View f33023e;

    /* renamed from: f */
    final /* synthetic */ Ref.ObjectRef<Drawable> f33024f;

    /* renamed from: g */
    final /* synthetic */ Ref.ObjectRef<Drawable> f33025g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12986eo(C14697tn tnVar, j50 j50, C12663bx bxVar, View view, Ref.ObjectRef<Drawable> objectRef, Ref.ObjectRef<Drawable> objectRef2) {
        super(0);
        this.f33020b = tnVar;
        this.f33021c = j50;
        this.f33022d = bxVar;
        this.f33023e = view;
        this.f33024f = objectRef;
        this.f33025g = objectRef2;
    }

    public Object invoke() {
        ArrayList arrayList = new ArrayList();
        if (!this.f33020b.mo66153k().f42074c.mo66924a(this.f33021c).booleanValue()) {
            this.f33023e.setElevation(0.0f);
        } else if (this.f33022d == null) {
            View view = this.f33023e;
            view.setElevation(view.getResources().getDimension(C12066R.dimen.div_shadow_elevation));
        } else {
            Drawable drawable = (Drawable) this.f33024f.element;
            if (drawable != null) {
                arrayList.add(drawable);
            }
        }
        Drawable drawable2 = (Drawable) this.f33025g.element;
        if (drawable2 != null) {
            arrayList.add(drawable2);
        }
        View view2 = this.f33023e;
        Object[] array = arrayList.toArray(new Drawable[0]);
        if (array != null) {
            view2.setBackground(new LayerDrawable((Drawable[]) array));
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

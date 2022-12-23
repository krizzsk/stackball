package com.yandex.mobile.ads.impl;

import android.content.res.ColorStateList;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.wz */
final class C15125wz extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ TextView f42338b;

    /* renamed from: c */
    final /* synthetic */ Ref.ObjectRef<Integer> f42339c;

    /* renamed from: d */
    final /* synthetic */ Ref.IntRef f42340d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15125wz(TextView textView, Ref.ObjectRef<Integer> objectRef, Ref.IntRef intRef) {
        super(0);
        this.f42338b = textView;
        this.f42339c = objectRef;
        this.f42340d = intRef;
    }

    public Object invoke() {
        TextView textView = this.f42338b;
        int[][] iArr = {new int[]{16842908}, new int[0]};
        int[] iArr2 = new int[2];
        Integer num = (Integer) this.f42339c.element;
        iArr2[0] = num == null ? this.f42340d.element : num.intValue();
        iArr2[1] = this.f42340d.element;
        textView.setTextColor(new ColorStateList(iArr, iArr2));
        return Unit.INSTANCE;
    }
}

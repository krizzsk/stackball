package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

public final class bk1 {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f31350d = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(bk1.class), "view", "getView()Landroid/view/View;"))};

    /* renamed from: a */
    private final C12593a f31351a;

    /* renamed from: b */
    private final String f31352b;

    /* renamed from: c */
    private final ReadWriteProperty f31353c;

    /* renamed from: com.yandex.mobile.ads.impl.bk1$a */
    public enum C12593a {
        CONTROLS,
        CLOSE_AD,
        NOT_VISIBLE,
        OTHER
    }

    public bk1(View view, C12593a aVar, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(aVar, "purpose");
        this.f31351a = aVar;
        this.f31352b = str;
        this.f31353c = f31.m35889a(view);
    }

    /* renamed from: a */
    public final String mo66089a() {
        return this.f31352b;
    }

    /* renamed from: b */
    public final C12593a mo66090b() {
        return this.f31351a;
    }

    /* renamed from: c */
    public final View mo66091c() {
        return (View) this.f31353c.getValue(this, f31350d[0]);
    }
}

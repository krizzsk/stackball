package com.yandex.mobile.ads.impl;

import android.widget.PopupWindow;
import com.yandex.mobile.ads.impl.C14416qt;
import kotlin.jvm.internal.Intrinsics;

final class ge1 {

    /* renamed from: a */
    private final PopupWindow f33974a;

    /* renamed from: b */
    private C14416qt.C14420d f33975b;

    /* renamed from: c */
    private boolean f33976c;

    public ge1(PopupWindow popupWindow, C15177xl xlVar, C14416qt.C14420d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(popupWindow, "popupWindow");
        Intrinsics.checkNotNullParameter(xlVar, "div");
        this.f33974a = popupWindow;
        this.f33975b = dVar;
        this.f33976c = z;
    }

    /* renamed from: a */
    public final void mo67271a(C14416qt.C14420d dVar) {
        this.f33975b = dVar;
    }

    /* renamed from: b */
    public final PopupWindow mo67274b() {
        return this.f33974a;
    }

    /* renamed from: c */
    public final C14416qt.C14420d mo67275c() {
        return this.f33975b;
    }

    /* renamed from: a */
    public final boolean mo67273a() {
        return this.f33976c;
    }

    /* renamed from: a */
    public final void mo67272a(boolean z) {
        this.f33976c = z;
    }
}

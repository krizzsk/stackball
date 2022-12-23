package com.yandex.metrica.impl.p265ob;

import android.os.Process;

/* renamed from: com.yandex.metrica.impl.ob.k8 */
class C11420k8 {

    /* renamed from: a */
    public final String f27383a;

    /* renamed from: b */
    public final boolean f27384b;

    /* renamed from: c */
    public final boolean f27385c;

    /* renamed from: d */
    public final C10918X7 f27386d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C11420k8(String str, boolean z, C10918X7 x7) {
        this(str, z, x7, C10796U2.m27890a(23) && Process.is64Bit());
    }

    C11420k8(String str, boolean z, C10918X7 x7, boolean z2) {
        this.f27383a = str;
        this.f27385c = z;
        this.f27386d = x7;
        this.f27384b = z2;
    }
}

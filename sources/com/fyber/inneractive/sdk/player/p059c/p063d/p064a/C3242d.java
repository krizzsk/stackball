package com.fyber.inneractive.sdk.player.p059c.p063d.p064a;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.a.d */
abstract class C3242d {

    /* renamed from: b */
    protected final C3278n f8178b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18996a(C3548k kVar, long j) throws C3295l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18997a(C3548k kVar) throws C3295l;

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.a.d$a */
    public static final class C3243a extends C3295l {
        public C3243a(String str) {
            super(str);
        }
    }

    protected C3242d(C3278n nVar) {
        this.f8178b = nVar;
    }

    /* renamed from: b */
    public final void mo19003b(C3548k kVar, long j) throws C3295l {
        if (mo18997a(kVar)) {
            mo18996a(kVar, j);
        }
    }
}

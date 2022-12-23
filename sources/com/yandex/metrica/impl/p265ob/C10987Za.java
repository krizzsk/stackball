package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Za */
public class C10987Za<T> {

    /* renamed from: a */
    private final Context f26412a;

    /* renamed from: b */
    private final String f26413b;

    /* renamed from: c */
    private final C10952Ya<T> f26414c;

    /* renamed from: d */
    private final C10864Vm<C10921Xa, C10880Wa> f26415d;

    /* renamed from: e */
    private final C11108cb f26416e;

    /* renamed from: f */
    private final C11077bb f26417f;

    /* renamed from: g */
    private final C10868W0 f26418g;

    /* renamed from: h */
    private final C10616Om f26419h;

    public C10987Za(Context context, C11011a1 a1Var, String str, C10952Ya<T> ya, C10864Vm<C10921Xa, C10880Wa> vm, C11108cb cbVar) {
        this(context, str, ya, vm, cbVar, new C11077bb(context, str, cbVar, a1Var), C10611Oh.m27142a(), new C10580Nm());
    }

    /* renamed from: a */
    public synchronized void mo62572a(T t, C10921Xa xa) {
        if (this.f26417f.mo62690a(this.f26415d.mo61128a(xa))) {
            this.f26418g.mo61575a(this.f26413b, this.f26414c.mo62281a(t));
            this.f26416e.mo62352a(new C10184D9(C10663Qa.m27298a(this.f26412a).mo61964g()), this.f26419h.mo61841b());
        }
    }

    public C10987Za(Context context, String str, C10952Ya<T> ya, C10864Vm<C10921Xa, C10880Wa> vm, C11108cb cbVar, C11077bb bbVar, C10868W0 w0, C10616Om om) {
        this.f26412a = context;
        this.f26413b = str;
        this.f26414c = ya;
        this.f26415d = vm;
        this.f26416e = cbVar;
        this.f26417f = bbVar;
        this.f26418g = w0;
        this.f26419h = om;
    }
}

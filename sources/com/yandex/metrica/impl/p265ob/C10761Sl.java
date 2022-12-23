package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Sl */
public class C10761Sl {

    /* renamed from: a */
    private final C11506ll f25802a;

    /* renamed from: b */
    private final C11405jl f25803b;

    /* renamed from: c */
    private final C11471kl f25804c;

    /* renamed from: d */
    private final C11323hl f25805d;

    /* renamed from: e */
    private final String f25806e;

    public C10761Sl(C11506ll llVar, C11405jl jlVar, C11471kl klVar, C11323hl hlVar, String str) {
        this.f25802a = llVar;
        this.f25803b = jlVar;
        this.f25804c = klVar;
        this.f25805d = hlVar;
        this.f25806e = str;
    }

    /* renamed from: a */
    public JSONObject mo62245a(Activity activity, C10319Gl gl, C10437Kl kl, C11090bl blVar, long j) {
        JSONObject a = this.f25802a.mo61839a(activity, j);
        try {
            this.f25804c.mo61803a(a, new JSONObject(), this.f25806e);
            this.f25804c.mo61803a(a, this.f25803b.mo62207a(gl, kl, blVar, (a.toString().getBytes().length + (this.f25805d.mo61402a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f25806e);
        } catch (Throwable unused) {
        }
        return a;
    }
}

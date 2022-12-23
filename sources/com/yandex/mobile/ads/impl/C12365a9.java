package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.C12046p;

/* renamed from: com.yandex.mobile.ads.impl.a9 */
public final class C12365a9 implements C12575b9, C15237y8 {

    /* renamed from: f */
    private static final Object f30467f = new Object();

    /* renamed from: g */
    private static volatile C12575b9 f30468g;

    /* renamed from: a */
    private final Context f30469a;

    /* renamed from: b */
    private final C14659t8 f30470b;

    /* renamed from: c */
    private final C12712c9 f30471c = new C12712c9();

    /* renamed from: d */
    private final C15297z8 f30472d;

    /* renamed from: e */
    private C15035w8 f30473e;

    private C12365a9(Context context) {
        this.f30469a = context.getApplicationContext();
        C14659t8 t8Var = new C14659t8();
        this.f30470b = t8Var;
        this.f30472d = new C15297z8(t8Var);
        sn0.m42091b(context);
    }

    /* renamed from: a */
    public static C12575b9 m33637a(Context context) {
        if (f30468g == null) {
            synchronized (f30467f) {
                if (f30468g == null) {
                    f30468g = new C12365a9(context.getApplicationContext());
                }
            }
        }
        return f30468g;
    }

    /* renamed from: a */
    public C15035w8 mo65695a() {
        C15035w8 w8Var;
        String str;
        String str2;
        synchronized (f30467f) {
            w8Var = this.f30473e;
            if (w8Var == null) {
                C14659t8 t8Var = this.f30470b;
                Context context = this.f30469a;
                t8Var.getClass();
                try {
                    str = C12046p.guid(context);
                } catch (Throwable unused) {
                    str = null;
                }
                C14659t8 t8Var2 = this.f30470b;
                Context context2 = this.f30469a;
                t8Var2.getClass();
                try {
                    str2 = C12046p.gdid(context2);
                } catch (Throwable unused2) {
                    str2 = null;
                }
                C15035w8 w8Var2 = new C15035w8((String) null, str2, str);
                this.f30472d.mo71179a(this.f30469a, this);
                w8Var = w8Var2;
            }
        }
        return w8Var;
    }

    /* renamed from: a */
    public void mo65696a(C15035w8 w8Var) {
        synchronized (f30467f) {
            if (this.f30471c.mo66234a(w8Var)) {
                this.f30473e = w8Var;
            }
        }
    }
}

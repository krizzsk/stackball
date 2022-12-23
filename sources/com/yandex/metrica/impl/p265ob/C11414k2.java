package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.k2 */
public class C11414k2 extends C10770T3 {

    /* renamed from: c */
    protected C10324H0 f27371c;

    /* renamed from: d */
    protected C10640Pe f27372d;

    /* renamed from: e */
    private boolean f27373e;

    /* renamed from: f */
    private final String f27374f;

    protected C11414k2(C10797U3 u3, CounterConfiguration counterConfiguration) {
        this(u3, counterConfiguration, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63172a(C10473Ln ln) {
        this.f27371c = new C10324H0(ln);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bundle mo63174c() {
        Bundle bundle = new Bundle();
        CounterConfiguration b = mo62272b();
        synchronized (b) {
            bundle.putParcelable("COUNTER_CFG_OBJ", b);
        }
        C10797U3 a = mo62271a();
        synchronized (a) {
            bundle.putParcelable("PROCESS_CFG_OBJ", a);
        }
        return bundle;
    }

    /* renamed from: d */
    public String mo63175d() {
        return this.f27371c.mo61413a();
    }

    /* renamed from: e */
    public String mo63176e() {
        return this.f27374f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo62678f() {
        return this.f27373e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo63177g() {
        this.f27373e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo63178h() {
        this.f27373e = false;
    }

    protected C11414k2(C10797U3 u3, CounterConfiguration counterConfiguration, String str) {
        super(u3, counterConfiguration);
        this.f27373e = true;
        this.f27374f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63171a(C10434Ki ki) {
        if (ki != null) {
            mo62272b().mo60804d(((C10373Ii) ki).mo61556e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63173a(C10640Pe pe) {
        this.f27372d = pe;
    }
}

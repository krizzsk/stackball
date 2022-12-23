package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.yandex.metrica.gpllibrary.C10081a;
import com.yandex.metrica.gpllibrary.C10084b;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.Kc */
public class C10428Kc extends C11490ld<C10401Jc> {

    /* renamed from: f */
    private final C10084b f25054f;

    public C10428Kc(Context context, C11943xd xdVar, C11725rn rnVar, C11241fe feVar) {
        this(context, xdVar, rnVar, feVar, new C11012a2());
    }

    /* renamed from: a */
    public boolean mo61108a(Object obj) {
        C10401Jc jc = (C10401Jc) obj;
        if (jc.f25021b != null && this.f27658b.mo62489a(this.f27657a)) {
            try {
                this.f25054f.startLocationUpdates(jc.f25021b.f24830a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo61109b() {
        if (this.f27658b.mo62489a(this.f27657a)) {
            try {
                this.f25054f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private C10428Kc(Context context, C11943xd xdVar, C11725rn rnVar, C11241fe feVar, C11012a2 a2Var) {
        this(context, rnVar, (LocationListener) new C11313hd(xdVar), a2Var.mo62629a(feVar));
    }

    /* renamed from: a */
    public void mo61107a() {
        try {
            this.f25054f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static C10084b m26737a(Context context, LocationListener locationListener, C11725rn rnVar) {
        if (C10122B2.m26036a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new C10081a(context, locationListener, rnVar.mo63615b(), (Executor) rnVar, C11490ld.f27656e);
            } catch (Throwable unused) {
            }
        }
        return new C10105Ac();
    }

    C10428Kc(Context context, C11725rn rnVar, LocationListener locationListener, C11281ge geVar) {
        this(context, rnVar.mo63615b(), locationListener, geVar, m26737a(context, locationListener, rnVar));
    }

    C10428Kc(Context context, Looper looper, LocationListener locationListener, C11281ge geVar, C10084b bVar) {
        super(context, locationListener, geVar, looper);
        this.f25054f = bVar;
    }
}

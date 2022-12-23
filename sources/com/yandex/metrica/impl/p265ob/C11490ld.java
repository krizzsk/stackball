package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ld */
public abstract class C11490ld<T> {

    /* renamed from: e */
    static final long f27656e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    protected final Context f27657a;

    /* renamed from: b */
    protected final C11281ge f27658b;

    /* renamed from: c */
    protected final LocationListener f27659c;

    /* renamed from: d */
    protected final Looper f27660d;

    public C11490ld(Context context, LocationListener locationListener, C11281ge geVar, Looper looper) {
        this.f27657a = context;
        this.f27659c = locationListener;
        this.f27658b = geVar;
        this.f27660d = looper;
    }

    /* renamed from: a */
    public abstract void mo61107a();

    /* renamed from: a */
    public abstract boolean mo61108a(T t);

    /* renamed from: b */
    public abstract void mo61109b();
}

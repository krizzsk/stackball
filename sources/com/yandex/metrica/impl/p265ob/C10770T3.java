package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.T3 */
public class C10770T3 {

    /* renamed from: a */
    private final C10797U3 f25836a;

    /* renamed from: b */
    private final CounterConfiguration f25837b;

    public C10770T3(Bundle bundle) {
        this.f25836a = C10797U3.m27899a(bundle);
        this.f25837b = CounterConfiguration.m25767a(bundle);
    }

    /* renamed from: a */
    public C10797U3 mo62271a() {
        return this.f25836a;
    }

    /* renamed from: b */
    public CounterConfiguration mo62272b() {
        return this.f25837b;
    }

    public String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f25836a + ", mCounterConfiguration=" + this.f25837b + '}';
    }

    /* renamed from: a */
    public static boolean m27780a(C10770T3 t3, Context context) {
        return t3.f25836a == null || !context.getPackageName().equals(t3.f25836a.mo62340f()) || t3.f25836a.mo62343i() != YandexMetrica.getLibraryApiLevel();
    }

    public C10770T3(C10797U3 u3, CounterConfiguration counterConfiguration) {
        this.f25836a = u3;
        this.f25837b = counterConfiguration;
    }
}

package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.z */
public class C11997z {

    /* renamed from: a */
    private final WeakHashMap<Activity, C11998a> f28819a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum C11998a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    /* renamed from: a */
    public boolean mo64179a(Activity activity, C11998a aVar) {
        if (activity != null && this.f28819a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f28819a.put(activity, aVar);
        return true;
    }
}

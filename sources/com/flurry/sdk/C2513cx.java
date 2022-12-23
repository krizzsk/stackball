package com.flurry.sdk;

import java.util.Comparator;

/* renamed from: com.flurry.sdk.cx */
public class C2513cx implements Comparator<Runnable> {

    /* renamed from: a */
    private static final String f5885a = C2513cx.class.getSimpleName();

    public /* synthetic */ int compare(Object obj, Object obj2) {
        int a = m5428a((Runnable) obj);
        int a2 = m5428a((Runnable) obj2);
        if (a < a2) {
            return -1;
        }
        return a > a2 ? 1 : 0;
    }

    /* renamed from: a */
    private static int m5428a(Runnable runnable) {
        if (runnable == null) {
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof C2514cy) {
            C2625eq eqVar = (C2625eq) ((C2514cy) runnable).mo17726a();
            if (eqVar != null) {
                return eqVar.f6169u;
            }
            return Integer.MAX_VALUE;
        } else if (runnable instanceof C2625eq) {
            return ((C2625eq) runnable).f6169u;
        } else {
            String str = f5885a;
            C2530db.m5474a(6, str, "Unknown runnable class: " + runnable.getClass().getName());
            return Integer.MAX_VALUE;
        }
    }
}

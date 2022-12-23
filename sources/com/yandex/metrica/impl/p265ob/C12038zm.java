package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.zm */
public abstract class C12038zm {

    /* renamed from: a */
    private static Map<String, C10380Im> f28919a = new HashMap();

    /* renamed from: b */
    private static Map<String, C11959xm> f28920b = new HashMap();

    /* renamed from: c */
    private static final Object f28921c = new Object();

    /* renamed from: d */
    private static final Object f28922d = new Object();

    /* renamed from: e */
    public static final /* synthetic */ int f28923e = 0;

    /* renamed from: a */
    public static C11959xm m31086a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C11959xm.m30860g();
        }
        C11959xm xmVar = f28920b.get(str);
        if (xmVar == null) {
            synchronized (f28922d) {
                xmVar = f28920b.get(str);
                if (xmVar == null) {
                    xmVar = new C11959xm(str);
                    f28920b.put(str, xmVar);
                }
            }
        }
        return xmVar;
    }

    /* renamed from: b */
    public static C10380Im m31087b(String str) {
        if (TextUtils.isEmpty(str)) {
            return C10380Im.m26607g();
        }
        C10380Im im = f28919a.get(str);
        if (im == null) {
            synchronized (f28921c) {
                im = f28919a.get(str);
                if (im == null) {
                    im = new C10380Im(str);
                    f28919a.put(str, im);
                }
            }
        }
        return im;
    }

    /* renamed from: a */
    public static C10380Im m31085a() {
        return C10380Im.m26607g();
    }
}

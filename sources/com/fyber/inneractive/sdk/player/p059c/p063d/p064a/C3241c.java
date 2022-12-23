package com.fyber.inneractive.sdk.player.p059c.p063d.p064a;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.a.c */
final class C3241c extends C3242d {

    /* renamed from: a */
    long f8177a = -9223372036854775807L;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18997a(C3548k kVar) {
        return true;
    }

    public C3241c() {
        super((C3278n) null);
    }

    /* renamed from: b */
    private static Double m7886b(C3548k kVar) {
        return Double.valueOf(Double.longBitsToDouble(kVar.mo19398l()));
    }

    /* renamed from: c */
    private static String m7887c(C3548k kVar) {
        int e = kVar.mo19389e();
        int i = kVar.f9626b;
        kVar.mo19388d(e);
        return new String(kVar.f9625a, i, e);
    }

    /* renamed from: d */
    private static ArrayList<Object> m7888d(C3548k kVar) {
        int n = kVar.mo19400n();
        ArrayList<Object> arrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(m7885a(kVar, kVar.mo19387d()));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static HashMap<String, Object> m7889e(C3548k kVar) {
        int n = kVar.mo19400n();
        HashMap<String, Object> hashMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            hashMap.put(m7887c(kVar), m7885a(kVar, kVar.mo19387d()));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18996a(C3548k kVar, long j) throws C3295l {
        if (kVar.mo19387d() != 2) {
            throw new C3295l();
        } else if ("onMetaData".equals(m7887c(kVar)) && kVar.mo19387d() == 8) {
            HashMap<String, Object> e = m7889e(kVar);
            if (e.containsKey("duration")) {
                double doubleValue = ((Double) e.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f8177a = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    /* renamed from: a */
    private static Object m7885a(C3548k kVar, int i) {
        if (i == 0) {
            return m7886b(kVar);
        }
        boolean z = true;
        if (i == 1) {
            if (kVar.mo19387d() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return m7887c(kVar);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String c = m7887c(kVar);
                    int d = kVar.mo19387d();
                    if (d == 9) {
                        return hashMap;
                    }
                    hashMap.put(c, m7885a(kVar, d));
                }
            } else if (i == 8) {
                return m7889e(kVar);
            } else {
                if (i == 10) {
                    return m7888d(kVar);
                }
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) m7886b(kVar).doubleValue());
                kVar.mo19388d(2);
                return date;
            }
        }
    }
}

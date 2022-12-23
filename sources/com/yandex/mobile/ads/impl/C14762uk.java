package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.google.common.primitives.SignedBytes;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.tf1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.uk */
public final class C14762uk implements tf1.C14677c {

    /* renamed from: a */
    private final int f40666a;

    /* renamed from: b */
    private final List<Format> f40667b;

    public C14762uk(int i) {
        this(i, Collections.singletonList(Format.m31678a((String) null, "application/cea-608", 0, (String) null)));
    }

    /* renamed from: a */
    public SparseArray<tf1> mo70175a() {
        return new SparseArray<>();
    }

    public C14762uk(int i, List<Format> list) {
        this.f40666a = i;
        this.f40667b = list;
    }

    /* renamed from: a */
    public tf1 mo70176a(int i, tf1.C14676b bVar) {
        if (i == 2) {
            return new cz0(new i90(new hh1(m42702a(bVar))));
        }
        if (i == 3 || i == 4) {
            return new cz0(new to0(bVar.f40309a));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new cz0(new oc0());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new cz0(new k90(new w71(m42702a(bVar))));
                    }
                    if (i == 89) {
                        return new cz0(new r20(bVar.f40310b));
                    }
                    if (i != 138) {
                        if (i == 172) {
                            return new cz0(new C13152g(bVar.f40309a));
                        }
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (m42703a(16)) {
                                    return null;
                                } else {
                                    return new r71(new ya1());
                                }
                            } else if (!m42703a(64)) {
                                return null;
                            }
                        }
                        return new cz0(new C12844d(bVar.f40309a));
                    }
                    return new cz0(new j20(bVar.f40309a));
                } else if (m42703a(4)) {
                    return null;
                } else {
                    return new cz0(new j90(new w71(m42702a(bVar)), m42703a(1), m42703a(8)));
                }
            } else if (m42703a(2)) {
                return null;
            } else {
                return new cz0(new qi0(bVar.f40309a));
            }
        } else if (m42703a(2)) {
            return null;
        } else {
            return new cz0(new C15147x5(false, bVar.f40309a));
        }
    }

    /* renamed from: a */
    private List<Format> m42702a(tf1.C14676b bVar) {
        ArrayList arrayList;
        int i;
        String str;
        List list;
        if (m42703a(32)) {
            return this.f40667b;
        }
        fy0 fy0 = new fy0(bVar.f40311c);
        List<Format> list2 = this.f40667b;
        while (fy0.mo67098a() > 0) {
            int r = fy0.mo67126r();
            int b = fy0.mo67105b() + fy0.mo67126r();
            if (r == 134) {
                ArrayList arrayList2 = new ArrayList();
                int r2 = fy0.mo67126r() & 31;
                for (int i2 = 0; i2 < r2; i2++) {
                    String b2 = fy0.mo67106b(3);
                    int r3 = fy0.mo67126r();
                    boolean z = (r3 & 128) != 0;
                    if (z) {
                        i = r3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte r4 = (byte) fy0.mo67126r();
                    fy0.mo67114f(1);
                    if (z) {
                        list = Collections.singletonList(new byte[]{(byte) ((r4 & SignedBytes.MAX_POWER_OF_TWO) != 0 ? 1 : 0)});
                    } else {
                        list = null;
                    }
                    arrayList2.add(Format.m31684a((String) null, str, (String) null, -1, 0, b2, i, (DrmInitData) null, Long.MAX_VALUE, list));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list2;
            }
            fy0.mo67112e(b);
            list2 = arrayList;
        }
        return list2;
    }

    /* renamed from: a */
    private boolean m42703a(int i) {
        return (i & this.f40666a) != 0;
    }
}

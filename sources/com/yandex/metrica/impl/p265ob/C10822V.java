package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.V */
public class C10822V {

    /* renamed from: a */
    private final C10757Si f25973a;

    /* renamed from: b */
    private final C11196ec f25974b;

    /* renamed from: c */
    private final Context f25975c;

    public C10822V(C10757Si si, C11196ec ecVar, Context context) {
        this.f25973a = si;
        this.f25974b = ecVar;
        this.f25975c = context;
    }

    /* renamed from: a */
    public C10793U mo62372a(Map<String, String> map) {
        return new C10793U(this.f25973a.mo62241c(), this.f25974b.mo62816a(this.f25975c, (C11560nc) new C11525mc()), map);
    }
}

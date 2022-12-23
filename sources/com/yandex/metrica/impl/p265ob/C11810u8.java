package com.yandex.metrica.impl.p265ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p265ob.C10214E8;
import com.yandex.metrica.impl.p265ob.C10591O8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u8 */
public class C11810u8 {

    /* renamed from: a */
    private final C11843v8 f28370a;

    /* renamed from: b */
    private final C11938x8 f28371b;

    /* renamed from: c */
    private final C10214E8.C10216b f28372c;

    public C11810u8(C11843v8 v8Var, C11938x8 x8Var, C10214E8.C10216b bVar) {
        this.f28370a = v8Var;
        this.f28371b = x8Var;
        this.f28372c = bVar;
    }

    /* renamed from: a */
    public C10214E8 mo63772a() {
        HashMap hashMap = new HashMap();
        hashMap.put("binary_data", C10591O8.C10595b.f25325a);
        return this.f28372c.mo61224a("auto_inapp", this.f28370a.mo63825a(), this.f28370a.mo63826b(), new SparseArray(), new C10305G8("auto_inapp", hashMap));
    }

    /* renamed from: b */
    public C10214E8 mo63773b() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C10591O8.C10596c.f25326a);
        return this.f28372c.mo61224a("client storage", this.f28370a.mo63827c(), this.f28370a.mo63828d(), new SparseArray(), new C10305G8("metrica.db", hashMap));
    }

    /* renamed from: c */
    public C10214E8 mo63774c() {
        return this.f28372c.mo61224a("main", this.f28370a.mo63829e(), this.f28370a.mo63830f(), this.f28370a.mo63836l(), new C10305G8("main", this.f28371b.mo64068a()));
    }

    /* renamed from: d */
    public C10214E8 mo63775d() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C10591O8.C10596c.f25326a);
        return this.f28372c.mo61224a("metrica_multiprocess.db", this.f28370a.mo63831g(), this.f28370a.mo63832h(), new SparseArray(), new C10305G8("metrica_multiprocess.db", hashMap));
    }

    /* renamed from: e */
    public C10214E8 mo63776e() {
        HashMap hashMap = new HashMap();
        List<String> list = C10591O8.C10596c.f25326a;
        hashMap.put("preferences", list);
        hashMap.put("binary_data", C10591O8.C10595b.f25325a);
        hashMap.put("startup", list);
        List<String> list2 = C10591O8.C10592a.f25320a;
        hashMap.put("l_dat", list2);
        hashMap.put("lbs_dat", list2);
        return this.f28372c.mo61224a("metrica.db", this.f28370a.mo63833i(), this.f28370a.mo63834j(), this.f28370a.mo63835k(), new C10305G8("metrica.db", hashMap));
    }
}

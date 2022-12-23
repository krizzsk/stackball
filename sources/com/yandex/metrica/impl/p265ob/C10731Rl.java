package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10893Wl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Rl */
public class C10731Rl implements C11405jl {

    /* renamed from: a */
    private final List<C10893Wl> f25753a;

    public C10731Rl(List<C10893Wl> list) {
        this.f25753a = list;
    }

    /* renamed from: a */
    public Object mo62207a(C10319Gl gl, C10437Kl kl, C11090bl blVar, int i) {
        JSONArray jSONArray = new JSONArray();
        if (this.f25753a.isEmpty()) {
            return jSONArray;
        }
        for (C10893Wl next : this.f25753a) {
            C10893Wl.C10895b a = next.mo61245a(blVar);
            int i2 = 0;
            if ((kl.f25068f || next.mo61247a()) && (a == null || !kl.f25071i)) {
                JSONObject a2 = next.mo62459a(kl, a);
                int length = a2.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i + length <= kl.f25076n && length2 < kl.f25075m) {
                    jSONArray.put(a2);
                    i2 = length;
                }
            }
            i += i2;
        }
        return jSONArray;
    }
}

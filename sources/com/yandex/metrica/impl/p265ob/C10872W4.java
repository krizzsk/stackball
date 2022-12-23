package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10842Vf;
import com.yandex.metrica.impl.p265ob.C10980Z4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.W4 */
public class C10872W4 {

    /* renamed from: h */
    public static final Map<Integer, Integer> f26144h = Collections.unmodifiableMap(new C10873a());

    /* renamed from: a */
    private final C11411k0 f26145a;

    /* renamed from: b */
    private final C10912X4 f26146b;

    /* renamed from: c */
    private final C10980Z4 f26147c;

    /* renamed from: d */
    private final C10531Mn f26148d;

    /* renamed from: e */
    private final C10531Mn f26149e;

    /* renamed from: f */
    private final C10616Om f26150f;

    /* renamed from: g */
    private final C11333i4 f26151g;

    /* renamed from: com.yandex.metrica.impl.ob.W4$a */
    class C10873a extends HashMap<Integer, Integer> {
        C10873a() {
            put(Integer.valueOf(C11413k1.EVENT_TYPE_DIAGNOSTIC.mo63170b()), 22);
            put(Integer.valueOf(C11413k1.EVENT_TYPE_DIAGNOSTIC_STATBOX.mo63170b()), 23);
            put(Integer.valueOf(C11413k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.mo63170b()), 24);
            put(Integer.valueOf(C11413k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.mo63170b()), 24);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.W4$b */
    public static class C10874b {
    }

    public C10872W4(C11411k0 k0Var, C10912X4 x4, C10980Z4 z4, C11333i4 i4Var, C10531Mn mn, C10531Mn mn2, C10616Om om) {
        this.f26145a = k0Var;
        this.f26146b = x4;
        this.f26147c = z4;
        this.f26151g = i4Var;
        this.f26149e = mn;
        this.f26148d = mn2;
        this.f26150f = om;
    }

    /* renamed from: a */
    public byte[] mo62440a() {
        C10842Vf vf = new C10842Vf();
        C10842Vf.C10847d dVar = new C10842Vf.C10847d();
        int i = 0;
        vf.f26008b = new C10842Vf.C10847d[]{dVar};
        C10980Z4.C10981a a = this.f26147c.mo62570a();
        dVar.f26042b = a.f26403a;
        C10842Vf.C10847d.C10851b bVar = new C10842Vf.C10847d.C10851b();
        dVar.f26043c = bVar;
        bVar.f26078d = 2;
        bVar.f26076b = new C10842Vf.C10853f();
        C10842Vf.C10853f fVar = dVar.f26043c.f26076b;
        long j = a.f26404b;
        fVar.f26084b = j;
        fVar.f26085c = C11327i.m29162a(j);
        dVar.f26043c.f26077c = this.f26146b.mo62783l();
        C10842Vf.C10847d.C10848a aVar = new C10842Vf.C10847d.C10848a();
        dVar.f26044d = new C10842Vf.C10847d.C10848a[]{aVar};
        aVar.f26046b = (long) a.f26405c;
        aVar.f26061q = (long) this.f26151g.mo63031a(this.f26145a.mo63161n());
        aVar.f26047c = this.f26150f.mo61841b() - a.f26404b;
        aVar.f26048d = f26144h.get(Integer.valueOf(this.f26145a.mo63161n())).intValue();
        if (!TextUtils.isEmpty(this.f26145a.mo63154g())) {
            aVar.f26049e = this.f26149e.mo61205a(this.f26145a.mo63154g());
        }
        if (!TextUtils.isEmpty(this.f26145a.mo63163p())) {
            String p = this.f26145a.mo63163p();
            String a2 = this.f26148d.mo61205a(p);
            if (!TextUtils.isEmpty(a2)) {
                aVar.f26050f = a2.getBytes();
            }
            int length = p.getBytes().length;
            byte[] bArr = aVar.f26050f;
            if (bArr != null) {
                i = bArr.length;
            }
            aVar.f26055k = length - i;
        }
        return C11169e.m28804a((C11169e) vf);
    }
}

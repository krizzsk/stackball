package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.D2 */
public class C10176D2 {

    /* renamed from: a */
    private final C10205E2 f24464a;

    /* renamed from: b */
    private final Context f24465b;

    /* renamed from: c */
    private final Map<String, C10151C2> f24466c = new HashMap();

    public C10176D2(Context context, C10205E2 e2) {
        this.f24465b = context;
        this.f24464a = e2;
    }

    /* renamed from: a */
    public synchronized C10151C2 mo61164a(String str, CounterConfiguration.C10019b bVar) {
        C10151C2 c2;
        c2 = this.f24466c.get(str);
        if (c2 == null) {
            c2 = new C10151C2(str, this.f24465b, bVar, this.f24464a);
            this.f24466c.put(str, c2);
        }
        return c2;
    }
}

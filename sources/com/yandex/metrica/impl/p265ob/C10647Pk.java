package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10893Wl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.Pk */
public class C10647Pk implements C11324hm {

    /* renamed from: a */
    private final Pattern f25434a;

    C10647Pk(Pattern pattern) {
        this.f25434a = pattern;
    }

    /* renamed from: a */
    public boolean mo61157a(Object obj) {
        return !this.f25434a.matcher((String) obj).matches();
    }

    /* renamed from: a */
    public C10893Wl.C10895b mo61156a() {
        return C10893Wl.C10895b.REGEXP_NOT_MATCHED;
    }
}

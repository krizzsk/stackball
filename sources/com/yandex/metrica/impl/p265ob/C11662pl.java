package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10893Wl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.pl */
public class C11662pl implements C11324hm {

    /* renamed from: a */
    private final Pattern f27985a;

    C11662pl(Pattern pattern) {
        this.f27985a = pattern;
    }

    /* renamed from: a */
    public boolean mo61157a(Object obj) {
        return this.f27985a.matcher((String) obj).matches();
    }

    /* renamed from: a */
    public C10893Wl.C10895b mo61156a() {
        return C10893Wl.C10895b.BAD_REGEXP_MATCHED;
    }
}

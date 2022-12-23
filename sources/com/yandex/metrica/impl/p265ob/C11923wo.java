package com.yandex.metrica.impl.p265ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.wo */
public class C11923wo implements C11829uo<String> {

    /* renamed from: a */
    private final Map<String, ?> f28682a;

    public C11923wo(Map<String, ?> map) {
        this.f28682a = map;
    }

    /* renamed from: a */
    public C11770so mo61590a(Object obj) {
        String str = (String) obj;
        if (!this.f28682a.containsKey(str)) {
            return C11770so.m30371a(this);
        }
        return C11770so.m30372a(this, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", new Object[]{str}));
    }
}

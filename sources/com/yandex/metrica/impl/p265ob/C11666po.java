package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.po */
public class C11666po implements C11829uo<String> {

    /* renamed from: a */
    private final String f27991a;

    public C11666po(String str) {
        this.f27991a = str;
    }

    /* renamed from: a */
    public C11770so mo61590a(Object obj) {
        if (!TextUtils.isEmpty((String) obj)) {
            return C11770so.m30371a(this);
        }
        return C11770so.m30372a(this, this.f27991a + " is empty.");
    }
}

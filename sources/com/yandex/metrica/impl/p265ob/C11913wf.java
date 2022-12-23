package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.wf */
public class C11913wf implements C11829uo<String> {
    /* renamed from: a */
    public C11770so mo61590a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return C11770so.m30372a(this, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return C11770so.m30372a(this, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return C11770so.m30372a(this, "key length more then 200 characters");
        }
        return C11770so.m30371a(this);
    }
}

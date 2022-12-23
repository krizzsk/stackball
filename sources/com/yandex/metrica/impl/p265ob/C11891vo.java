package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.vo */
public class C11891vo implements C11829uo<String> {
    /* renamed from: a */
    public C11770so mo61590a(Object obj) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return C11770so.m30372a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return C11770so.m30371a(this);
        } catch (Throwable unused) {
            return C11770so.m30372a(this, "Invalid ApiKey=" + str + ". " + "Please, read official documentation how to obtain one:" + " " + "https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
    }
}

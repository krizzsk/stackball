package com.yandex.metrica.impl.p265ob;

import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.Gm */
public class C10320Gm extends HashMap<String, String> {

    /* renamed from: a */
    private int f24795a = 0;

    public C10320Gm() {
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        if (containsKey(str)) {
            if (str2 == null) {
                return remove(str);
            }
            String str3 = (String) get(str);
            this.f24795a += str2.length() - (str3 == null ? 0 : str3.length());
            return (String) super.put(str, str2);
        } else if (str2 == null) {
            return null;
        } else {
            this.f24795a += str.length() + str2.length();
            return (String) super.put(str, str2);
        }
    }

    public C10320Gm(String str) throws JSONException {
        super(C11993ym.m30993e(str));
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f24795a += str2.length() + (str3 == null ? 0 : str3.length());
        }
    }

    /* renamed from: a */
    public String remove(Object obj) {
        int i;
        if (containsKey(obj)) {
            String str = (String) get(obj);
            int i2 = this.f24795a;
            int length = ((String) obj).length();
            if (str == null) {
                i = 0;
            } else {
                i = str.length();
            }
            this.f24795a = i2 - (length + i);
        }
        return (String) super.remove(obj);
    }

    /* renamed from: a */
    public int mo61405a() {
        return this.f24795a;
    }
}

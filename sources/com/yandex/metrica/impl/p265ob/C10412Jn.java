package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Jn */
public class C10412Jn {

    /* renamed from: a */
    private final String f25030a;

    /* renamed from: b */
    private final C10380Im f25031b;

    public C10412Jn(int i, String str, C10380Im im) {
        this.f25030a = str;
        this.f25031b = im;
    }

    /* renamed from: a */
    public boolean mo61637a(C10320Gm gm, String str, String str2) {
        int a = gm.mo61405a();
        if (str2 != null) {
            a += str2.length();
        }
        if (gm.containsKey(str)) {
            String str3 = (String) gm.get(str);
            if (str3 != null) {
                a -= str3.length();
            }
        } else {
            a += str.length();
        }
        return a > 4500;
    }

    /* renamed from: a */
    public void mo61636a(String str) {
        if (this.f25031b.mo64227c()) {
            this.f25031b.mo64226c("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f25030a, 4500, str);
        }
    }
}

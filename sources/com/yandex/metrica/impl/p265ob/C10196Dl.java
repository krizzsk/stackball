package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Dl */
public class C10196Dl implements C10730Rk {

    /* renamed from: a */
    private final int f24525a;

    public C10196Dl(int i) {
        this.f24525a = i;
    }

    /* renamed from: a */
    public void mo61203a(C10229El el) {
        if (el.f24607h.length() > this.f24525a) {
            int length = el.f24607h.length();
            int i = this.f24525a;
            int i2 = length - i;
            String substring = el.f24607h.substring(0, i);
            el.f24607h = substring;
            el.f24609j = Integer.valueOf(substring.length() + i2);
        }
    }
}

package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Nn */
public class C10581Nn extends C10172Cn<String> {
    public C10581Nn(int i, String str) {
        this(i, str, C10380Im.m26607g());
    }

    public C10581Nn(int i, String str, C10380Im im) {
        super(i, str, im);
    }

    /* renamed from: a */
    public String mo61205a(String str) {
        if (str == null || str.length() <= super.mo61160b()) {
            return str;
        }
        String substring = str.substring(0, super.mo61160b());
        if (this.f24461c.mo64227c()) {
            this.f24461c.mo64226c("\"%s\" %s size exceeded limit of %d characters", super.mo61159a(), str, Integer.valueOf(super.mo61160b()));
        }
        return substring;
    }
}

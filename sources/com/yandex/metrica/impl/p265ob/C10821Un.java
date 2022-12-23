package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Un */
public class C10821Un extends C10733Rn<String, C10265Fn> {
    public C10821Un(int i) {
        super(i);
    }

    /* renamed from: a */
    public C10682Qn<String, C10265Fn> mo62210a(String str) {
        int i = 0;
        if (str != null && str.length() > mo62209a()) {
            String substring = str.substring(0, mo62209a());
            int length = C10585O2.m27106c(str).length;
            int length2 = C10585O2.m27106c(substring).length;
            String str2 = substring;
            i = str.getBytes().length - substring.getBytes().length;
            str = str2;
        }
        return new C10682Qn<>(str, new C10233En(i));
    }
}

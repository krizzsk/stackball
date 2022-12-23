package com.yandex.metrica.impl.p265ob;

import android.os.Build;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.om */
public class C11611om {

    /* renamed from: a */
    private final Set<String> f27867a;

    public C11611om(Set<String> set) {
        this.f27867a = set;
    }

    /* renamed from: a */
    public String mo63443a() {
        if (C10796U2.m27890a(21)) {
            String a = m29994a(Build.SUPPORTED_64_BIT_ABIS);
            return a != null ? a : m29994a(Build.SUPPORTED_32_BIT_ABIS);
        }
        return m29994a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
    }

    /* renamed from: a */
    private String m29994a(String[] strArr) {
        for (String str : strArr) {
            if (this.f27867a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}

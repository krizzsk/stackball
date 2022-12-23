package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.hf */
public class C11315hf implements C11529mf, C10841Ve {
    /* renamed from: a */
    public int mo62380a(C11538mn mnVar) {
        return 2;
    }

    /* renamed from: a */
    public byte[] mo61983a(C10926Xe xe, C11384jh jhVar) {
        if (TextUtils.isEmpty(xe.f26258b)) {
            return new byte[0];
        }
        return Base64.decode(xe.f26258b, 0);
    }
}

package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.Mn */
public class C10531Mn extends C10172Cn<String> {
    public C10531Mn(int i, String str, C10380Im im) {
        super(i, str, im);
    }

    /* renamed from: a */
    public String mo61205a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.mo61160b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.mo61160b(), "UTF-8");
            try {
                if (this.f24461c.mo64227c()) {
                    C10380Im im = this.f24461c;
                    im.mo64226c("\"%s\" %s exceeded limit of %d bytes", super.mo61159a(), str, Integer.valueOf(super.mo61160b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}

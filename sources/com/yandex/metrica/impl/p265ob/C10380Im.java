package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10842Vf;

/* renamed from: com.yandex.metrica.impl.ob.Im */
public class C10380Im extends C10116Am {

    /* renamed from: d */
    private static final int[] f24927d = {3, 6, 4};

    /* renamed from: e */
    private static final C10380Im f24928e = new C10380Im("");

    public C10380Im(String str) {
        super(str);
    }

    /* renamed from: g */
    public static C10380Im m26607g() {
        return f24928e;
    }

    /* renamed from: a */
    public void mo61568a(C10842Vf.C10847d dVar, String str) {
        boolean z;
        String str2;
        for (C10842Vf.C10847d.C10848a aVar : dVar.f26044d) {
            if (aVar != null) {
                int[] iArr = f24927d;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (aVar.f26048d == iArr[i]) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(": ");
                    if (aVar.f26048d == 3 && TextUtils.isEmpty(aVar.f26049e)) {
                        str2 = "Native crash of app";
                    } else if (aVar.f26048d == 4) {
                        StringBuilder sb2 = new StringBuilder(aVar.f26049e);
                        if (aVar.f26050f != null) {
                            String str3 = new String(aVar.f26050f);
                            if (!TextUtils.isEmpty(str3)) {
                                sb2.append(" with value ");
                                sb2.append(str3);
                            }
                        }
                        str2 = sb2.toString();
                    } else {
                        str2 = aVar.f26049e;
                    }
                    sb.append(str2);
                    mo64223b(sb.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public String mo61569b() {
        return "AppMetrica";
    }

    public C10380Im() {
        this("");
    }
}

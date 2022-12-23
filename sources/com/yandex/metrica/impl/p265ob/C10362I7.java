package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.I7 */
public class C10362I7 implements C10864Vm<File, C10331H7>, C10820Um<File> {
    /* renamed from: a */
    public Object mo61128a(Object obj) {
        String a = C10823V0.m27962a((File) obj);
        if (!TextUtils.isEmpty(a)) {
            try {
                return new C10331H7(a);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo61092b(Object obj) {
        try {
            ((File) obj).delete();
        } catch (Throwable unused) {
        }
    }
}

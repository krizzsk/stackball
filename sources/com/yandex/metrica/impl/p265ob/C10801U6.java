package com.yandex.metrica.impl.p265ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.U6 */
public class C10801U6 {
    /* renamed from: a */
    public boolean mo62349a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdir();
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.delete()) {
            return file.mkdir();
        }
        return false;
    }
}

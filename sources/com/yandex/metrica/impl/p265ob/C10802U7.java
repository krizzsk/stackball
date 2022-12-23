package com.yandex.metrica.impl.p265ob;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.U7 */
class C10802U7 implements FilenameFilter {
    C10802U7(C10830V7 v7) {
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}

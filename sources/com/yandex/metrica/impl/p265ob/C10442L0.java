package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.L0 */
public class C10442L0 {
    /* renamed from: a */
    public File mo61698a(File file, String str) {
        if (file == null) {
            return null;
        }
        return mo61700b(file.getAbsoluteFile(), str);
    }

    /* renamed from: b */
    public File mo61699b(Context context) {
        return mo61697a(context, "YandexMetricaNativeCrashes");
    }

    /* renamed from: a */
    public File mo61696a(Context context) {
        File file;
        if (C10796U2.m27890a(24)) {
            file = context.getDataDir();
        } else {
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                file = null;
            } else {
                file = filesDir.getParentFile();
            }
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "lib");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    /* renamed from: b */
    public File mo61700b(File file, String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }

    /* renamed from: b */
    public String mo61701b(Context context, String str) {
        File file;
        if (C10796U2.m27890a(21)) {
            file = context.getNoBackupFilesDir();
        } else {
            file = context.getFilesDir();
        }
        if (file == null) {
            return null;
        }
        return file.getAbsolutePath() + "/" + str;
    }

    /* renamed from: a */
    public File mo61697a(Context context, String str) {
        File file;
        if (C10796U2.m27890a(21)) {
            file = context.getNoBackupFilesDir();
        } else {
            file = context.getFilesDir();
        }
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }
}

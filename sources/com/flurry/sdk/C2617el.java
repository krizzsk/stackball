package com.flurry.sdk;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.el */
public final class C2617el {

    /* renamed from: a */
    private static String f6146a = C2617el.class.getSimpleName();

    /* renamed from: a */
    public static File m5687a() {
        File file;
        Context context = C2494ck.m5371a().f5832a;
        if (C2619em.m5699a(21)) {
            file = context.getNoBackupFilesDir();
        } else {
            file = new File(context.getFilesDir().getPath() + File.separator + "no_backup");
        }
        return new File(file.getPath() + File.separator + ".flurryNoBackup");
    }

    /* renamed from: a */
    public static boolean m5689a(File file) {
        if (file == null || file.getAbsoluteFile() == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
            return true;
        }
        C2530db.m5474a(6, f6146a, "Unable to create persistent dir: ".concat(String.valueOf(parentFile)));
        return false;
    }

    /* renamed from: b */
    public static boolean m5691b(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        for (String file2 : file.list()) {
            if (!m5691b(new File(file, file2))) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m5692c(java.io.File r6) {
        /*
            r0 = 4
            r1 = 0
            if (r6 == 0) goto L_0x0061
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x000b
            goto L_0x0061
        L_0x000b:
            java.lang.String r2 = f6146a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Loading persistent data: "
            r3.<init>(r4)
            java.lang.String r4 = r6.getAbsolutePath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r2, (java.lang.String) r3)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            r0.<init>(r6)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r6.<init>()     // Catch:{ all -> 0x0044 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0044 }
        L_0x0030:
            int r3 = r0.read(r2)     // Catch:{ all -> 0x0044 }
            if (r3 <= 0) goto L_0x0040
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0044 }
            r5 = 0
            r4.<init>(r2, r5, r3)     // Catch:{ all -> 0x0044 }
            r6.append(r4)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x0040:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)
            goto L_0x0054
        L_0x0044:
            r6 = move-exception
            goto L_0x0048
        L_0x0046:
            r6 = move-exception
            r0 = r1
        L_0x0048:
            r2 = 6
            java.lang.String r3 = f6146a     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.C2530db.m5475a(r2, r3, r4, r6)     // Catch:{ all -> 0x005c }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)
            r6 = r1
        L_0x0054:
            if (r6 == 0) goto L_0x005b
            java.lang.String r6 = r6.toString()
            return r6
        L_0x005b:
            return r1
        L_0x005c:
            r6 = move-exception
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)
            throw r6
        L_0x0061:
            java.lang.String r6 = f6146a
            java.lang.String r2 = "Persistent file doesn't exist."
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r6, (java.lang.String) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2617el.m5692c(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static void m5688a(File file, String str) {
        if (file == null) {
            C2530db.m5474a(4, f6146a, "No persistent file specified.");
        } else if (str == null) {
            String str2 = f6146a;
            C2530db.m5474a(4, str2, "No data specified; deleting persistent file: " + file.getAbsolutePath());
            file.delete();
        } else {
            String str3 = f6146a;
            C2530db.m5474a(4, str3, "Writing persistent data: " + file.getAbsolutePath());
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(str.getBytes());
                    C2619em.m5698a((Closeable) fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C2530db.m5475a(6, f6146a, "Error writing persistent file", th);
                    } finally {
                        C2619em.m5698a((Closeable) fileOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C2530db.m5475a(6, f6146a, "Error writing persistent file", th);
            }
        }
    }

    /* renamed from: a */
    public static String[] m5690a(File file, final Pattern pattern) {
        if (!file.exists()) {
            return new String[0];
        }
        String[] list = file.list(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return pattern.matcher(str).matches();
            }
        });
        return list == null ? new String[0] : list;
    }
}

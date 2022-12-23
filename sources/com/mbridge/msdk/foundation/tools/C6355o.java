package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.p167b.C6211c;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.mbridge.msdk.foundation.same.p168c.C6223e;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.mbridge.msdk.foundation.tools.o */
/* compiled from: SameFileTool */
public final class C6355o extends C6334e {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A[SYNTHETIC, Splitter:B:24:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[SYNTHETIC, Splitter:B:28:0x003e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m16147c(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x0032 }
            if (r3 == 0) goto L_0x001b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0032 }
            int r4 = r3.available()     // Catch:{ Exception -> 0x0018, all -> 0x0015 }
            long r0 = (long) r4
            r2 = r3
            goto L_0x0025
        L_0x0015:
            r4 = move-exception
            r2 = r3
            goto L_0x003c
        L_0x0018:
            r4 = move-exception
            r2 = r3
            goto L_0x0033
        L_0x001b:
            r4.createNewFile()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = "获取文件大小"
            java.lang.String r3 = "文件不存在!"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r4, r3)     // Catch:{ Exception -> 0x0032 }
        L_0x0025:
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ Exception -> 0x002b }
            goto L_0x003b
        L_0x002b:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x003b
        L_0x0030:
            r4 = move-exception
            goto L_0x003c
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            r4.printStackTrace()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ Exception -> 0x002b }
        L_0x003b:
            return r0
        L_0x003c:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0046:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6355o.m16147c(java.io.File):long");
    }

    /* renamed from: d */
    private static long m16149d(File file) throws Exception {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    j = m16149d(listFiles[i]);
                } else {
                    j = m16147c(listFiles[i]);
                }
                j2 += j;
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0050 A[SYNTHETIC, Splitter:B:30:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16137a(java.io.File r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0036 }
            r4.<init>()     // Catch:{ IOException -> 0x0036 }
        L_0x0013:
            java.lang.String r2 = r1.readLine()     // Catch:{ IOException -> 0x0034 }
            if (r2 == 0) goto L_0x002e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0034 }
            r3.<init>()     // Catch:{ IOException -> 0x0034 }
            r3.append(r2)     // Catch:{ IOException -> 0x0034 }
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch:{ IOException -> 0x0034 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0034 }
            r4.append(r2)     // Catch:{ IOException -> 0x0034 }
            goto L_0x0013
        L_0x002e:
            r1.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0044
        L_0x0032:
            goto L_0x0044
        L_0x0034:
            r2 = move-exception
            goto L_0x003e
        L_0x0036:
            r2 = move-exception
            r4 = r0
            goto L_0x003e
        L_0x0039:
            r4 = move-exception
            goto L_0x004e
        L_0x003b:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L_0x003e:
            r2.printStackTrace()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0044
            goto L_0x002e
        L_0x0044:
            if (r4 == 0) goto L_0x004b
            java.lang.String r4 = r4.toString()
            return r4
        L_0x004b:
            return r0
        L_0x004c:
            r4 = move-exception
            r0 = r1
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6355o.m16137a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m16142a(String str) {
        if (C6223e.m15759a(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static File[] m16146b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m16139a() {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    if (C6122a.m15302b().mo42895d() != null) {
                        String b = C6213e.m15725b(C6211c.MBRIDGE_VC);
                        try {
                            File file = new File(b);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : C6355o.m16146b(b)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
        }).start();
    }

    /* renamed from: c */
    public static void m16148c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
                if (b == null) {
                    b = C6076b.m15089a().mo42748b();
                }
                long currentTimeMillis = System.currentTimeMillis() - ((long) (b.mo42727q() * 1000));
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                                m16144b(file2);
                                try {
                                    File file3 = new File(str + ".zip");
                                    if (file3.exists() && file3.isFile()) {
                                        m16144b(file3);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public static void m16145b() {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
                    if (b == null) {
                        b = C6076b.m15089a().mo42748b();
                    }
                    C6355o.m16141a(C6213e.m15725b(C6211c.MBRIDGE_RES_MANAGER_DIR), b.mo42694c());
                    C6355o.m16140a(System.currentTimeMillis() - ((long) (b.mo42727q() * 1000)));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    /* renamed from: b */
    public static String m16144b(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            } else if (!file.isDirectory()) {
                return "";
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (listFiles.length != 0) {
                        for (File b : listFiles) {
                            m16144b(b);
                        }
                        file.delete();
                        return "";
                    }
                }
                file.delete();
                return "";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /* renamed from: e */
    private static ArrayList<File> m16151e(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                if (!file.isHidden() || file.isDirectory()) {
                    return true;
                }
                return false;
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(m16151e(file2));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private static void m16150d(String str) {
        try {
            ArrayList<File> e = m16151e(new File(str));
            Collections.sort(e, new Comparator<File>() {
                public final boolean equals(Object obj) {
                    return true;
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    int i = ((((File) obj).lastModified() - ((File) obj2).lastModified()) > 0 ? 1 : ((((File) obj).lastModified() - ((File) obj2).lastModified()) == 0 ? 0 : -1));
                    if (i > 0) {
                        return 1;
                    }
                    return i == 0 ? 0 : -1;
                }
            });
            int size = (e.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = e.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            C6361q.m16158d("SameFileTool", "del memory failed");
        }
    }

    /* renamed from: a */
    public static void m16140a(long j) {
        try {
            Iterator<File> it = m16151e(new File(C6213e.m15725b(C6211c.MBRIDGE_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("SameFileTool", th.getMessage(), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0035 A[SYNTHETIC, Splitter:B:24:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC, Splitter:B:30:0x0040] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16143a(byte[] r2, java.io.File r3) {
        /*
            r0 = 0
            java.io.File r1 = r3.getParentFile()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x0014
            boolean r1 = r3.exists()     // Catch:{ Exception -> 0x002e }
            if (r1 != 0) goto L_0x0014
            java.io.File r1 = r3.getParentFile()     // Catch:{ Exception -> 0x002e }
            r1.mkdirs()     // Catch:{ Exception -> 0x002e }
        L_0x0014:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e }
            r1.<init>(r3)     // Catch:{ Exception -> 0x002e }
            r1.write(r2)     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r1.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0024:
            r2 = 1
            return r2
        L_0x0026:
            r2 = move-exception
            r0 = r1
            goto L_0x003e
        L_0x0029:
            r2 = move-exception
            r0 = r1
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            goto L_0x003e
        L_0x002e:
            r2 = move-exception
        L_0x002f:
            r2.printStackTrace()     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r3 = move-exception
            r3.printStackTrace()
        L_0x003d:
            return r2
        L_0x003e:
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0048:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6355o.m16143a(byte[], java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[Catch:{ all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e0 A[SYNTHETIC, Splitter:B:70:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea A[SYNTHETIC, Splitter:B:75:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f6 A[SYNTHETIC, Splitter:B:82:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100 A[SYNTHETIC, Splitter:B:87:0x0100] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16138a(java.lang.String r8, java.lang.String r9) {
        /*
            if (r8 == 0) goto L_0x0109
            if (r9 != 0) goto L_0x0006
            goto L_0x0109
        L_0x0006:
            java.lang.String r0 = "/"
            boolean r1 = r9.endsWith(r0)
            if (r1 != 0) goto L_0x001d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
        L_0x001d:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L_0x002b
            java.lang.String r8 = "unzip file not exists"
            return r8
        L_0x002b:
            r8 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00d1, all -> 0x00ce }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00d1, all -> 0x00ce }
            java.util.Enumeration r0 = r1.entries()     // Catch:{ IOException -> 0x00d1, all -> 0x00ce }
            r2 = r8
        L_0x0036:
            boolean r3 = r0.hasMoreElements()     // Catch:{ IOException -> 0x00cc }
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r0.nextElement()     // Catch:{ IOException -> 0x00cc }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00cc }
            if (r3 != 0) goto L_0x005b
            java.lang.String r9 = "unzip zipEntry is null"
            if (r8 == 0) goto L_0x0050
            r8.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0050:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r8 = move-exception
            r8.printStackTrace()
        L_0x005a:
            return r9
        L_0x005b:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00cc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cc }
            r5.<init>()     // Catch:{ IOException -> 0x00cc }
            r5.append(r9)     // Catch:{ IOException -> 0x00cc }
            java.lang.String r6 = r3.getName()     // Catch:{ IOException -> 0x00cc }
            r5.append(r6)     // Catch:{ IOException -> 0x00cc }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00cc }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00cc }
            boolean r5 = r3.isDirectory()     // Catch:{ IOException -> 0x00cc }
            if (r5 == 0) goto L_0x007d
            r4.mkdirs()     // Catch:{ IOException -> 0x00cc }
            goto L_0x0036
        L_0x007d:
            java.io.File r5 = r4.getParentFile()     // Catch:{ IOException -> 0x00cc }
            boolean r5 = r5.exists()     // Catch:{ IOException -> 0x00cc }
            if (r5 != 0) goto L_0x008e
            java.io.File r5 = r4.getParentFile()     // Catch:{ IOException -> 0x00cc }
            r5.mkdirs()     // Catch:{ IOException -> 0x00cc }
        L_0x008e:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00cc }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00cc }
            java.io.InputStream r8 = r1.getInputStream(r3)     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
        L_0x009b:
            r4 = 0
            int r6 = r8.read(r3, r4, r2)     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
            r7 = -1
            if (r6 == r7) goto L_0x00aa
            r5.write(r3, r4, r6)     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
            r5.flush()     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
            goto L_0x009b
        L_0x00aa:
            r2 = r5
            goto L_0x0036
        L_0x00ac:
            r9 = move-exception
            r2 = r5
            goto L_0x00f4
        L_0x00af:
            r9 = move-exception
            r2 = r5
            goto L_0x00d3
        L_0x00b2:
            r1.close()     // Catch:{ IOException -> 0x00cc }
            if (r8 == 0) goto L_0x00bf
            r8.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00bf:
            if (r2 == 0) goto L_0x00c9
            r2.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00c9:
            java.lang.String r8 = ""
            return r8
        L_0x00cc:
            r9 = move-exception
            goto L_0x00d3
        L_0x00ce:
            r9 = move-exception
            r2 = r8
            goto L_0x00f4
        L_0x00d1:
            r9 = move-exception
            r2 = r8
        L_0x00d3:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00da
            r9.printStackTrace()     // Catch:{ all -> 0x00f3 }
        L_0x00da:
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x00e8
            r8.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00e8
        L_0x00e4:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00e8:
            if (r2 == 0) goto L_0x00f2
            r2.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00f2
        L_0x00ee:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00f2:
            return r9
        L_0x00f3:
            r9 = move-exception
        L_0x00f4:
            if (r8 == 0) goto L_0x00fe
            r8.close()     // Catch:{ IOException -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00fe:
            if (r2 == 0) goto L_0x0108
            r2.close()     // Catch:{ IOException -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0108:
            throw r9
        L_0x0109:
            java.lang.String r8 = "unzip srcFile or destDir is null "
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6355o.m16138a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    static /* synthetic */ void m16141a(String str, int i) {
        try {
            if (m16149d(new File(str)) > ((long) (i * 1048576))) {
                m16150d(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
            C6361q.m16158d("SameFileTool", "clean memory failed");
        }
    }
}

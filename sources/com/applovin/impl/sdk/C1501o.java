package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1383e;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.utils.C1553o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.o */
public class C1501o {

    /* renamed from: a */
    private final String f3665a = "FileManager";

    /* renamed from: b */
    private final C1469j f3666b;

    /* renamed from: c */
    private final C1505q f3667c;

    /* renamed from: d */
    private final Object f3668d = new Object();

    C1501o(C1469j jVar) {
        this.f3666b = jVar;
        this.f3667c = jVar.mo13139v();
    }

    /* renamed from: a */
    private long m3309a() {
        long longValue = ((Long) this.f3666b.mo13088a(C1369c.f2913bC)).longValue();
        if (longValue < 0 || !m3313b()) {
            return -1;
        }
        return longValue;
    }

    /* renamed from: a */
    private long m3310a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* renamed from: a */
    private void m3311a(long j, Context context) {
        C1505q qVar;
        String str;
        if (m3313b()) {
            long intValue = (long) ((Integer) this.f3666b.mo13088a(C1369c.f2914bD)).intValue();
            if (intValue == -1) {
                qVar = this.f3667c;
                str = "Cache has no maximum size set; skipping drop...";
            } else {
                int i = (m3310a(j) > intValue ? 1 : (m3310a(j) == intValue ? 0 : -1));
                qVar = this.f3667c;
                if (i > 0) {
                    qVar.mo13277b("FileManager", "Cache has exceeded maximum size; dropping...");
                    for (File b : m3317d(context)) {
                        m3315b(b);
                    }
                    this.f3666b.mo13072L().mo12926a(C1387g.f3253f);
                    return;
                }
                str = "Cache is present but under size limit; not dropping...";
            }
            qVar.mo13277b("FileManager", str);
        }
    }

    /* renamed from: a */
    private boolean m3312a(File file, String str, List<String> list, boolean z, C1383e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream a = mo13257a(str, list, z);
            if (!(eVar == null || a == null)) {
                eVar.mo12910a((long) a.size());
            }
            return mo13262a(a, file);
        }
        C1505q qVar = this.f3667c;
        qVar.mo13277b("FileManager", "File exists for " + str);
        if (eVar == null) {
            return true;
        }
        eVar.mo12911b(file.length());
        return true;
    }

    /* renamed from: b */
    private boolean m3313b() {
        return ((Boolean) this.f3666b.mo13088a(C1369c.f2912bB)).booleanValue();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0038=Splitter:B:16:0x0038, B:22:0x0048=Splitter:B:22:0x0048} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3314b(java.io.ByteArrayOutputStream r5, java.io.File r6) {
        /*
            r4 = this;
            com.applovin.impl.sdk.q r0 = r4.f3667c
            java.lang.String r1 = "FileManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing resource to filesystem: "
            r2.append(r3)
            java.lang.String r3 = r6.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo13277b(r1, r2)
            java.lang.Object r0 = r4.f3668d
            monitor-enter(r0)
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0047, all -> 0x0037 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0047, all -> 0x0037 }
            r5.writeTo(r2)     // Catch:{ IOException -> 0x0034, all -> 0x0031 }
            r5 = 1
            com.applovin.impl.sdk.j r6 = r4.f3666b     // Catch:{ all -> 0x002f }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r6)     // Catch:{ all -> 0x002f }
            goto L_0x0055
        L_0x002f:
            r5 = move-exception
            goto L_0x005e
        L_0x0031:
            r5 = move-exception
            r1 = r2
            goto L_0x0038
        L_0x0034:
            r5 = move-exception
            r1 = r2
            goto L_0x0048
        L_0x0037:
            r5 = move-exception
        L_0x0038:
            com.applovin.impl.sdk.q r6 = r4.f3667c     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "FileManager"
            java.lang.String r3 = "Unknown failure to write file."
            r6.mo13278b(r2, r3, r5)     // Catch:{ all -> 0x0057 }
            com.applovin.impl.sdk.j r5 = r4.f3666b     // Catch:{ all -> 0x002f }
        L_0x0043:
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r1, (com.applovin.impl.sdk.C1469j) r5)     // Catch:{ all -> 0x002f }
            goto L_0x0054
        L_0x0047:
            r5 = move-exception
        L_0x0048:
            com.applovin.impl.sdk.q r6 = r4.f3667c     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "FileManager"
            java.lang.String r3 = "Unable to write data to file."
            r6.mo13278b(r2, r3, r5)     // Catch:{ all -> 0x0057 }
            com.applovin.impl.sdk.j r5 = r4.f3666b     // Catch:{ all -> 0x002f }
            goto L_0x0043
        L_0x0054:
            r5 = 0
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r5
        L_0x0057:
            r5 = move-exception
            com.applovin.impl.sdk.j r6 = r4.f3666b     // Catch:{ all -> 0x002f }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r1, (com.applovin.impl.sdk.C1469j) r6)     // Catch:{ all -> 0x002f }
            throw r5     // Catch:{ all -> 0x002f }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1501o.m3314b(java.io.ByteArrayOutputStream, java.io.File):boolean");
    }

    /* renamed from: b */
    private boolean m3315b(File file) {
        boolean delete;
        C1505q qVar = this.f3667c;
        qVar.mo13277b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        synchronized (this.f3668d) {
            try {
                delete = file.delete();
            } catch (Exception e) {
                C1505q qVar2 = this.f3667c;
                qVar2.mo13278b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return delete;
    }

    /* renamed from: c */
    private long m3316c(Context context) {
        long j;
        boolean z;
        long a = m3309a();
        boolean z2 = a != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        synchronized (this.f3668d) {
            List<String> b = this.f3666b.mo13114b((C1369c) C1369c.f2920bJ);
            j = 0;
            for (File next : m3317d(context)) {
                if (!z2 || b.contains(next.getName()) || seconds - TimeUnit.MILLISECONDS.toSeconds(next.lastModified()) <= a) {
                    z = false;
                } else {
                    C1505q qVar = this.f3667c;
                    qVar.mo13277b("FileManager", "File " + next.getName() + " has expired, removing...");
                    z = m3315b(next);
                }
                if (z) {
                    this.f3666b.mo13072L().mo12926a(C1387g.f3252e);
                } else {
                    j += next.length();
                }
            }
        }
        return j;
    }

    /* renamed from: d */
    private List<File> m3317d(Context context) {
        List<File> asList;
        File e = m3318e(context);
        if (!e.isDirectory()) {
            return Collections.emptyList();
        }
        synchronized (this.f3668d) {
            asList = Arrays.asList(e.listFiles());
        }
        return asList;
    }

    /* renamed from: e */
    private File m3318e(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r3, r8.f3666b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, r8.f3666b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0091=Splitter:B:43:0x0091, B:27:0x0057=Splitter:B:27:0x0057, B:35:0x0069=Splitter:B:35:0x0069} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.ByteArrayOutputStream mo13256a(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.sdk.q r1 = r8.f3667c
            java.lang.String r2 = "FileManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.append(r4)
            java.lang.String r4 = r9.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.mo13277b(r2, r3)
            java.lang.Object r1 = r8.f3668d
            monitor-enter(r1)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x0067, all -> 0x0055 }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x0067, all -> 0x0055 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004f }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004f }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004f }
        L_0x0031:
            r6 = 0
            int r7 = r2.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004f }
            if (r7 < 0) goto L_0x0048
            r3.write(r5, r6, r7)     // Catch:{ Exception -> 0x003c }
            goto L_0x0031
        L_0x003c:
            com.applovin.impl.sdk.j r4 = r8.f3666b     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004f }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r3, (com.applovin.impl.sdk.C1469j) r4)     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004f }
            com.applovin.impl.sdk.j r9 = r8.f3666b     // Catch:{ all -> 0x00b7 }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r9)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            return r0
        L_0x0048:
            com.applovin.impl.sdk.j r9 = r8.f3666b     // Catch:{ all -> 0x00b7 }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r9)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            return r3
        L_0x004f:
            r9 = move-exception
            goto L_0x0057
        L_0x0051:
            r3 = move-exception
            goto L_0x0069
        L_0x0053:
            r9 = move-exception
            goto L_0x0091
        L_0x0055:
            r9 = move-exception
            r2 = r0
        L_0x0057:
            com.applovin.impl.sdk.q r3 = r8.f3667c     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "FileManager"
            java.lang.String r5 = "Unknown failure to read file."
            r3.mo13278b(r4, r5, r9)     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.sdk.j r9 = r8.f3666b     // Catch:{ all -> 0x00b7 }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r9)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            return r0
        L_0x0067:
            r3 = move-exception
            r2 = r0
        L_0x0069:
            com.applovin.impl.sdk.q r4 = r8.f3667c     // Catch:{ all -> 0x00b0 }
            java.lang.String r5 = "FileManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r6.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = "Failed to read file: "
            r6.append(r7)     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x00b0 }
            r6.append(r9)     // Catch:{ all -> 0x00b0 }
            r6.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00b0 }
            r4.mo13277b(r5, r9)     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.sdk.j r9 = r8.f3666b     // Catch:{ all -> 0x00b7 }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r9)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            return r0
        L_0x008f:
            r9 = move-exception
            r2 = r0
        L_0x0091:
            com.applovin.impl.sdk.q r3 = r8.f3667c     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "FileManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r5.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = "File not found. "
            r5.append(r6)     // Catch:{ all -> 0x00b0 }
            r5.append(r9)     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x00b0 }
            r3.mo13279c(r4, r9)     // Catch:{ all -> 0x00b0 }
            com.applovin.impl.sdk.j r9 = r8.f3666b     // Catch:{ all -> 0x00b7 }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r9)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            return r0
        L_0x00b0:
            r9 = move-exception
            com.applovin.impl.sdk.j r0 = r8.f3666b     // Catch:{ all -> 0x00b7 }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r0)     // Catch:{ all -> 0x00b7 }
            throw r9     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1501o.mo13256a(java.io.File):java.io.ByteArrayOutputStream");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.io.InputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, r7.f3666b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, r7.f3666b);
        com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, r7.f3666b);
        com.applovin.impl.sdk.utils.C1557r.m3604a(r10, r7.f3666b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.ByteArrayOutputStream mo13257a(java.lang.String r8, java.util.List<java.lang.String> r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "FileManager"
            r1 = 0
            if (r10 == 0) goto L_0x0022
            boolean r9 = com.applovin.impl.sdk.utils.C1557r.m3613a((java.lang.String) r8, (java.util.List<java.lang.String>) r9)
            if (r9 != 0) goto L_0x0022
            com.applovin.impl.sdk.q r9 = r7.f3667c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Domain is not whitelisted, skipping precache for url: "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.mo13277b(r0, r8)
            return r1
        L_0x0022:
            com.applovin.impl.sdk.j r9 = r7.f3666b
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r10 = com.applovin.impl.sdk.p025b.C1369c.f3061du
            java.lang.Object r9 = r9.mo13088a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0047
            java.lang.String r9 = "https://"
            boolean r10 = r8.contains(r9)
            if (r10 != 0) goto L_0x0047
            com.applovin.impl.sdk.q r10 = r7.f3667c
            java.lang.String r2 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r10.mo13280d(r0, r2)
            java.lang.String r10 = "http://"
            java.lang.String r8 = r8.replace(r10, r9)
        L_0x0047:
            com.applovin.impl.sdk.q r9 = r7.f3667c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Loading "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = "..."
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.mo13277b(r0, r10)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x011d, all -> 0x0119 }
            r9.<init>()     // Catch:{ IOException -> 0x011d, all -> 0x0119 }
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x0116, all -> 0x0113 }
            r10.<init>(r8)     // Catch:{ IOException -> 0x0116, all -> 0x0113 }
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ IOException -> 0x0116, all -> 0x0113 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x0116, all -> 0x0113 }
            com.applovin.impl.sdk.j r2 = r7.f3666b     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            com.applovin.impl.sdk.b.c<java.lang.Integer> r3 = com.applovin.impl.sdk.p025b.C1369c.f3059ds     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            java.lang.Object r2 = r2.mo13088a(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r10.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            com.applovin.impl.sdk.j r2 = r7.f3666b     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            com.applovin.impl.sdk.b.c<java.lang.Integer> r3 = com.applovin.impl.sdk.p025b.C1369c.f3060dt     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            java.lang.Object r2 = r2.mo13088a(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r10.setReadTimeout(r2)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r2 = 1
            r10.setDefaultUseCaches(r2)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r10.setUseCaches(r2)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r3 = 0
            r10.setAllowUserInteraction(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r10.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            int r2 = r10.getResponseCode()     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 < r4) goto L_0x00fe
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r4) goto L_0x00af
            goto L_0x00fe
        L_0x00af:
            java.io.InputStream r2 = r10.getInputStream()     // Catch:{ IOException -> 0x0110, all -> 0x010e }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ IOException -> 0x00fc }
        L_0x00b7:
            int r6 = r2.read(r5, r3, r4)     // Catch:{ IOException -> 0x00fc }
            if (r6 < 0) goto L_0x00d6
            r9.write(r5, r3, r6)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00b7
        L_0x00c1:
            com.applovin.impl.sdk.j r3 = r7.f3666b     // Catch:{ IOException -> 0x00fc }
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, (com.applovin.impl.sdk.C1469j) r3)     // Catch:{ IOException -> 0x00fc }
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3604a((java.net.HttpURLConnection) r10, (com.applovin.impl.sdk.C1469j) r8)
            return r1
        L_0x00d6:
            com.applovin.impl.sdk.q r3 = r7.f3667c     // Catch:{ IOException -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r4.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r5 = "Loaded resource at "
            r4.append(r5)     // Catch:{ IOException -> 0x00fc }
            r4.append(r8)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00fc }
            r3.mo13277b(r0, r4)     // Catch:{ IOException -> 0x00fc }
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3604a((java.net.HttpURLConnection) r10, (com.applovin.impl.sdk.C1469j) r8)
            return r9
        L_0x00fc:
            r3 = move-exception
            goto L_0x0121
        L_0x00fe:
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r1, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3604a((java.net.HttpURLConnection) r10, (com.applovin.impl.sdk.C1469j) r8)
            return r1
        L_0x010e:
            r8 = move-exception
            goto L_0x0149
        L_0x0110:
            r3 = move-exception
            r2 = r1
            goto L_0x0121
        L_0x0113:
            r8 = move-exception
            r10 = r1
            goto L_0x0149
        L_0x0116:
            r3 = move-exception
            r10 = r1
            goto L_0x0120
        L_0x0119:
            r8 = move-exception
            r9 = r1
            r10 = r9
            goto L_0x0149
        L_0x011d:
            r3 = move-exception
            r9 = r1
            r10 = r9
        L_0x0120:
            r2 = r10
        L_0x0121:
            com.applovin.impl.sdk.q r4 = r7.f3667c     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r5.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r6 = "Error loading "
            r5.append(r6)     // Catch:{ all -> 0x0147 }
            r5.append(r8)     // Catch:{ all -> 0x0147 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0147 }
            r4.mo13278b(r0, r8, r3)     // Catch:{ all -> 0x0147 }
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r2, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, (com.applovin.impl.sdk.C1469j) r8)
            com.applovin.impl.sdk.j r8 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3604a((java.net.HttpURLConnection) r10, (com.applovin.impl.sdk.C1469j) r8)
            return r1
        L_0x0147:
            r8 = move-exception
            r1 = r2
        L_0x0149:
            com.applovin.impl.sdk.j r0 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r1, (com.applovin.impl.sdk.C1469j) r0)
            com.applovin.impl.sdk.j r0 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3601a((java.io.Closeable) r9, (com.applovin.impl.sdk.C1469j) r0)
            com.applovin.impl.sdk.j r9 = r7.f3666b
            com.applovin.impl.sdk.utils.C1557r.m3604a((java.net.HttpURLConnection) r10, (com.applovin.impl.sdk.C1469j) r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1501o.mo13257a(java.lang.String, java.util.List, boolean):java.io.ByteArrayOutputStream");
    }

    /* renamed from: a */
    public File mo13258a(String str, Context context) {
        File file;
        if (!C1553o.m3554b(str)) {
            this.f3667c.mo13277b("FileManager", "Nothing to look up, skipping...");
            return null;
        }
        C1505q qVar = this.f3667c;
        qVar.mo13277b("FileManager", "Looking up cached resource: " + str);
        if (str.contains(RewardPlus.ICON)) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.f3668d) {
            File e = m3318e(context);
            file = new File(e, str);
            try {
                e.mkdirs();
            } catch (Throwable th) {
                C1505q qVar2 = this.f3667c;
                qVar2.mo13278b("FileManager", "Unable to make cache directory at " + e, th);
                return null;
            }
        }
        return file;
    }

    /* renamed from: a */
    public String mo13259a(Context context, String str, String str2, List<String> list, boolean z, C1383e eVar) {
        return mo13260a(context, str, str2, list, z, false, eVar);
    }

    /* renamed from: a */
    public String mo13260a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, C1383e eVar) {
        if (!C1553o.m3554b(str)) {
            this.f3667c.mo13277b("FileManager", "Nothing to cache, skipping...");
            return null;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (C1553o.m3554b(lastPathSegment) && C1553o.m3554b(str2)) {
            StringBuilder sb = new StringBuilder();
            String str3 = str2;
            sb.append(str2);
            sb.append(lastPathSegment);
            lastPathSegment = sb.toString();
        }
        String str4 = lastPathSegment;
        Context context2 = context;
        File a = mo13258a(str4, context);
        if (!m3312a(a, str, list, z, eVar)) {
            return null;
        }
        C1505q qVar = this.f3667c;
        qVar.mo13277b("FileManager", "Caching succeeded for file " + str4);
        return z2 ? Uri.fromFile(a).toString() : str4;
    }

    /* renamed from: a */
    public void mo13261a(Context context) {
        if (m3313b() && this.f3666b.mo13119c()) {
            this.f3667c.mo13277b("FileManager", "Compacting cache...");
            synchronized (this.f3668d) {
                m3311a(m3316c(context), context);
            }
        }
    }

    /* renamed from: a */
    public boolean mo13262a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        C1505q qVar = this.f3667c;
        qVar.mo13277b("FileManager", "Caching " + file.getAbsolutePath() + "...");
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            C1505q qVar2 = this.f3667c;
            qVar2.mo13280d("FileManager", "No data for " + file.getAbsolutePath());
            return false;
        } else if (!m3314b(byteArrayOutputStream, file)) {
            C1505q qVar3 = this.f3667c;
            qVar3.mo13281e("FileManager", "Unable to cache " + file.getAbsolutePath());
            return false;
        } else {
            C1505q qVar4 = this.f3667c;
            qVar4.mo13277b("FileManager", "Caching completed for " + file);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo13263a(File file, String str, List<String> list, C1383e eVar) {
        return m3312a(file, str, list, true, eVar);
    }

    /* renamed from: b */
    public void mo13264b(Context context) {
        try {
            mo13258a(".nomedia", context);
            File file = new File(m3318e(context), ".nomedia");
            if (!file.exists()) {
                C1505q qVar = this.f3667c;
                qVar.mo13277b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
                if (!file.createNewFile()) {
                    this.f3667c.mo13281e("FileManager", "Failed to create .nomedia file");
                }
            }
        } catch (IOException e) {
            this.f3667c.mo13278b("FileManager", "Failed to create .nomedia file", e);
        }
    }

    /* renamed from: b */
    public boolean mo13265b(String str, Context context) {
        boolean z;
        synchronized (this.f3668d) {
            File a = mo13258a(str, context);
            z = a != null && a.exists() && !a.isDirectory();
        }
        return z;
    }
}

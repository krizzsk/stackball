package com.chartboost.sdk.Libraries;

import android.content.Context;
import com.chartboost.sdk.Model.C1844h;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Libraries.g */
public class C1828g {

    /* renamed from: a */
    private final AtomicReference<C1844h> f4391a;

    /* renamed from: b */
    private final C1829h f4392b;

    public C1828g(Context context, AtomicReference<C1844h> atomicReference) {
        this.f4392b = new C1829h(context.getCacheDir());
        this.f4391a = atomicReference;
        try {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis((long) atomicReference.get().f4534o);
            File file = new File(this.f4392b.f4393a, "templates");
            if (file.exists()) {
                m4037a(file.listFiles(), currentTimeMillis);
                m4036a(this.f4392b);
            }
        } catch (Exception e) {
            CBLogging.m3992a("FileCache", "Exception while cleaning up templates directory at " + this.f4392b.f4395c.getPath(), e);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m4037a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    m4039b(file.listFiles(), j);
                    m4038a(file.listFiles(), file);
                }
            }
        }
    }

    /* renamed from: b */
    private void m4039b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    CBLogging.m3993b("FileCache", "Unable to delete " + file.getPath());
                }
            }
        }
    }

    /* renamed from: c */
    public JSONArray mo14239c() {
        JSONArray jSONArray = new JSONArray();
        String[] list = mo14234a().f4396d.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(".nomedia") && !str.endsWith(".tmp")) {
                    jSONArray.put(str);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public JSONObject mo14241d() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = mo14234a().f4393a;
            for (String next : this.f4391a.get().f4535p) {
                if (!next.equals("templates")) {
                    File file2 = new File(file, next);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str : list) {
                            if (!str.equals(".nomedia") && !str.endsWith(".tmp")) {
                                jSONArray.put(str);
                            }
                        }
                    }
                    C1825e.m4026a(jSONObject, next, jSONArray);
                }
            }
        } catch (Exception e) {
            CBLogging.m3993b("FileCache", "getWebViewCacheAssets: " + e.toString());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized byte[] mo14238b(File file) {
        byte[] bArr;
        bArr = null;
        if (file == null) {
            return null;
        }
        try {
            bArr = C1827f.m4035b(file);
        } catch (Exception e) {
            CBLogging.m3992a("FileCache", "Error loading cache from disk", e);
        }
        return bArr;
    }

    /* renamed from: a */
    private void m4038a(File[] fileArr, File file) {
        if (fileArr != null && fileArr.length == 0 && !file.delete()) {
            CBLogging.m3993b("FileCache", "Unable to delete " + file.getPath());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0028, all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003f A[SYNTHETIC, Splitter:B:28:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14240c(java.io.File r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FileCache"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0028 }
            java.lang.String r3 = "rw"
            r2.<init>(r6, r3)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0028 }
            r3 = 0
            r2.seek(r3)     // Catch:{ FileNotFoundException -> 0x0023, IOException -> 0x0020, all -> 0x001d }
            int r6 = r2.read()     // Catch:{ FileNotFoundException -> 0x0023, IOException -> 0x0020, all -> 0x001d }
            r2.seek(r3)     // Catch:{ FileNotFoundException -> 0x0023, IOException -> 0x0020, all -> 0x001d }
            r2.write(r6)     // Catch:{ FileNotFoundException -> 0x0023, IOException -> 0x0020, all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x001d:
            r6 = move-exception
            r1 = r2
            goto L_0x003d
        L_0x0020:
            r6 = move-exception
            r1 = r2
            goto L_0x0029
        L_0x0023:
            r6 = move-exception
            r1 = r2
            goto L_0x0032
        L_0x0026:
            r6 = move-exception
            goto L_0x003d
        L_0x0028:
            r6 = move-exception
        L_0x0029:
            java.lang.String r2 = "IOException when attempting to touch file"
            com.chartboost.sdk.Libraries.CBLogging.m3992a(r0, r2, r6)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x003c
            goto L_0x0039
        L_0x0031:
            r6 = move-exception
        L_0x0032:
            java.lang.String r2 = "File not found when attempting to touch"
            com.chartboost.sdk.Libraries.CBLogging.m3992a(r0, r2, r6)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x003c
        L_0x0039:
            r1.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            return
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Libraries.C1828g.mo14240c(java.io.File):void");
    }

    /* renamed from: b */
    public boolean mo14237b(String str) {
        if (mo14234a().f4394b == null || str == null) {
            return false;
        }
        return new File(mo14234a().f4394b, str).exists();
    }

    /* renamed from: a */
    private void m4036a(C1829h hVar) {
        File file = new File(hVar.f4393a, ".adId");
        if (file.exists() && !file.delete()) {
            CBLogging.m3993b("FileCache", "Unable to delete " + file.getPath());
        }
    }

    /* renamed from: a */
    public String mo14235a(String str) {
        File file = new File(mo14234a().f4396d, str);
        if (file.exists()) {
            return file.getPath();
        }
        return null;
    }

    /* renamed from: b */
    public JSONObject mo14236b() {
        JSONObject jSONObject = new JSONObject();
        C1825e.m4026a(jSONObject, ".chartboost-internal-folder-size", Long.valueOf(mo14233a(this.f4392b.f4393a)));
        File file = mo14234a().f4393a;
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String file2 : list) {
                File file3 = new File(file, file2);
                JSONObject jSONObject2 = new JSONObject();
                C1825e.m4026a(jSONObject2, file3.getName() + "-size", Long.valueOf(mo14233a(file3)));
                String[] list2 = file3.list();
                if (list2 != null) {
                    C1825e.m4026a(jSONObject2, "count", Integer.valueOf(list2.length));
                }
                C1825e.m4026a(jSONObject, file3.getName(), jSONObject2);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C1829h mo14234a() {
        return this.f4392b;
    }

    /* renamed from: a */
    public long mo14233a(File file) {
        long j = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return 0;
                    }
                    for (File a : listFiles) {
                        j += mo14233a(a);
                    }
                    return j;
                }
            } catch (Exception e) {
                CBLogging.m3993b("FileCache", "getFolderSize: " + e.toString());
                return 0;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0;
    }
}

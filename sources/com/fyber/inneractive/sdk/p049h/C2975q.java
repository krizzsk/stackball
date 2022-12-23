package com.fyber.inneractive.sdk.p049h;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.p029a.C2681a;
import com.fyber.inneractive.sdk.p029a.C2704e;

/* renamed from: com.fyber.inneractive.sdk.h.q */
public final class C2975q<ResultData> {

    /* renamed from: a */
    final Context f7249a;

    /* renamed from: b */
    C2681a<ResultData> f7250b;

    /* renamed from: c */
    SharedPreferences f7251c;

    /* renamed from: d */
    String f7252d;

    /* renamed from: com.fyber.inneractive.sdk.h.q$a */
    public static class C2976a extends Exception {
    }

    public C2975q(Context context, C2681a<ResultData> aVar) {
        this.f7249a = context;
        this.f7250b = aVar;
    }

    /* renamed from: a */
    public final C2704e<ResultData> mo18439a() {
        try {
            if (!this.f7250b.mo17890d()) {
                return C2704e.m5876a(new C2976a());
            }
            ResultData a = this.f7250b.mo17885a(m6656a(this.f7250b.mo17888b()));
            if (this.f7251c == null) {
                this.f7251c = this.f7249a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            String string = this.f7251c.getString(this.f7250b.mo17886a(), (String) null);
            this.f7252d = string;
            return new C2704e<>(a, string);
        } catch (Exception e) {
            if (this.f7251c == null) {
                this.f7251c = this.f7249a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            this.f7251c.edit().remove(this.f7250b.mo17886a()).apply();
            return C2704e.m5876a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b A[SYNTHETIC, Splitter:B:20:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18440a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed closing cache file: %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r7
            java.lang.String r4 = "caching file %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r4, r2)
            r2 = 0
            android.content.Context r4 = r6.f7249a     // Catch:{ Exception -> 0x003a }
            java.io.FileOutputStream r2 = r4.openFileOutput(r7, r3)     // Catch:{ Exception -> 0x003a }
            byte[] r7 = r8.getBytes()     // Catch:{ Exception -> 0x003a }
            r2.write(r7)     // Catch:{ Exception -> 0x003a }
            java.lang.String r7 = "File cached successfully"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0035 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r8)     // Catch:{ Exception -> 0x0035 }
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ Exception -> 0x0028 }
            goto L_0x005c
        L_0x0028:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r7 = r7.getMessage()
            r8[r3] = r7
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r8)
            goto L_0x005c
        L_0x0035:
            r7 = move-exception
            r8 = 1
            goto L_0x003c
        L_0x0038:
            r7 = move-exception
            goto L_0x005d
        L_0x003a:
            r7 = move-exception
            r8 = 0
        L_0x003c:
            java.lang.String r4 = "Failed caching file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0038 }
            r5[r3] = r7     // Catch:{ all -> 0x0038 }
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r4, r5)     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x005b
        L_0x004f:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = r7.getMessage()
            r1[r3] = r7
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r1)
        L_0x005b:
            r1 = r8
        L_0x005c:
            return r1
        L_0x005d:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x006f
        L_0x0063:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = r8.getMessage()
            r1[r3] = r8
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r1)
        L_0x006f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2975q.mo18440a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC, Splitter:B:26:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m6656a(java.lang.String r9) throws java.io.FileNotFoundException {
        /*
            r8 = this;
            java.lang.String r0 = "Failed closing local file: %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            java.lang.String r4 = "reading local file: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r4, r2)
            r2 = 0
            android.content.Context r4 = r8.f7249a     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.io.FileInputStream r4 = r4.openFileInput(r9)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            int r5 = r4.available()     // Catch:{ Exception -> 0x0038 }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0038 }
            r4.read(r5)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0038 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch:{ Exception -> 0x0038 }
            if (r4 == 0) goto L_0x0036
            r4.close()     // Catch:{ Exception -> 0x002a }
            goto L_0x0036
        L_0x002a:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r4[r3] = r2
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r4)
        L_0x0036:
            r2 = r6
            goto L_0x0061
        L_0x0038:
            r5 = move-exception
            goto L_0x003e
        L_0x003a:
            r9 = move-exception
            goto L_0x0073
        L_0x003c:
            r5 = move-exception
            r4 = r2
        L_0x003e:
            boolean r6 = r5 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x0071 }
            if (r6 != 0) goto L_0x006b
            java.lang.String r6 = "Failed reading local file: %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0071 }
            r7[r3] = r5     // Catch:{ all -> 0x0071 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r6, r7)     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0061
            r4.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0061
        L_0x0055:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r4 = r4.getMessage()
            r5[r3] = r4
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r5)
        L_0x0061:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r3] = r9
            java.lang.String r9 = "local file %s read successfully"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r0)
            return r2
        L_0x006b:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0071 }
            r9.<init>()     // Catch:{ all -> 0x0071 }
            throw r9     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r9 = move-exception
            r2 = r4
        L_0x0073:
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ Exception -> 0x0079 }
            goto L_0x0085
        L_0x0079:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r3] = r2
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r1)
        L_0x0085:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2975q.m6656a(java.lang.String):java.lang.String");
    }
}

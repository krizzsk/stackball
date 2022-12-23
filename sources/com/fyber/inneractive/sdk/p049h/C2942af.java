package com.fyber.inneractive.sdk.p049h;

import android.os.Environment;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.h.af */
public final class C2942af extends C2937ab<String> {

    /* renamed from: a */
    private final String f7083a;

    /* renamed from: g */
    public final boolean mo18407g() {
        return false;
    }

    /* renamed from: h */
    public final int mo18408h() {
        return 0;
    }

    public C2942af(C2977r<String> rVar, String str) {
        super(rVar, new C2957f());
        this.f7083a = str;
    }

    /* renamed from: c */
    public final C2984u mo18406c() {
        return C2984u.GET;
    }

    /* renamed from: k */
    public final String mo18409k() {
        return this.f7083a;
    }

    /* renamed from: m */
    public final int mo18410m() {
        return C2945ah.f7088b;
    }

    /* renamed from: a */
    public final C2986w<String> mo18405a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        C2987x xVar = new C2987x();
        try {
            File file = new File(new File(Environment.getExternalStorageDirectory(), "Pictures"), m6602a(URI.create(this.f7083a), map));
            T file2 = file.toString();
            C3670q.m9159a(inputStream, (OutputStream) new FileOutputStream(file));
            xVar.f7270a = file2;
        } catch (Exception unused) {
            IAlog.m9034b("failed to download and save the image file.", new Object[0]);
        }
        return xVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m6602a(java.net.URI r4, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5) {
        /*
            java.lang.String r4 = r4.getPath()
            r0 = 0
            if (r4 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            java.lang.String r4 = r1.getName()
            if (r5 == 0) goto L_0x001c
            java.lang.String r1 = "text/html"
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            r1 = 0
            if (r5 == 0) goto L_0x0027
            java.lang.Object r5 = r5.get(r1)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
        L_0x0027:
            if (r0 == 0) goto L_0x006c
            java.lang.String r5 = ";"
            java.lang.String[] r5 = r0.split(r5)
            int r0 = r5.length
        L_0x0030:
            if (r1 >= r0) goto L_0x006c
            r2 = r5[r1]
            java.lang.String r3 = "image/"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x0069
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "."
            r5.<init>(r0)
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r2.split(r0)
            r1 = 1
            r0 = r0[r1]
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            boolean r0 = r4.endsWith(r5)
            if (r0 != 0) goto L_0x006c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            goto L_0x006c
        L_0x0069:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2942af.m6602a(java.net.URI, java.util.Map):java.lang.String");
    }
}

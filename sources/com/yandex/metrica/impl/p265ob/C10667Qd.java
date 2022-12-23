package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Qd */
public class C10667Qd {

    /* renamed from: a */
    private final C10669b f25482a;

    /* renamed from: com.yandex.metrica.impl.ob.Qd$a */
    public interface C10668a {
        /* renamed from: a */
        void mo61063a();

        /* renamed from: a */
        void mo61064a(String str, byte[] bArr);

        /* renamed from: b */
        String mo61065b();

        /* renamed from: c */
        void mo61066c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Qd$b */
    static class C10669b {
        C10669b() {
        }
    }

    public C10667Qd() {
        this(new C10669b());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61982a(java.lang.String r5, com.yandex.metrica.impl.p265ob.C10667Qd.C10668a r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.yandex.metrica.impl.ob.Qd$b r2 = r4.f25482a     // Catch:{  }
            java.lang.String r3 = r6.mo61065b()     // Catch:{  }
            r2.getClass()     // Catch:{  }
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()     // Catch:{ all -> 0x0036 }
            com.yandex.metrica.impl.ob.Zd r2 = r2.mo61896x()     // Catch:{ all -> 0x0036 }
            javax.net.ssl.HttpsURLConnection r5 = r2.mo62577a((java.lang.String) r5)     // Catch:{ all -> 0x0036 }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0036 }
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "If-None-Match"
            r5.setRequestProperty(r2, r3)     // Catch:{ all -> 0x0036 }
        L_0x0022:
            r5.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "GET"
            r5.setRequestMethod(r2)     // Catch:{ all -> 0x0036 }
            int r2 = com.yandex.metrica.impl.p265ob.C10839Vd.C10840a.f26007a     // Catch:{ all -> 0x0036 }
            r5.setConnectTimeout(r2)     // Catch:{ all -> 0x0036 }
            r5.setReadTimeout(r2)     // Catch:{ all -> 0x0036 }
            r5.connect()     // Catch:{ all -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r5 == 0) goto L_0x0063
            int r2 = r5.getResponseCode()     // Catch:{  }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x004a
            r5 = 304(0x130, float:4.26E-43)
            if (r2 == r5) goto L_0x0046
            goto L_0x0063
        L_0x0046:
            r6.mo61063a()     // Catch:{  }
            goto L_0x0064
        L_0x004a:
            java.lang.String r2 = "ETag"
            java.lang.String r2 = r5.getHeaderField(r2)     // Catch:{  }
            java.lang.String r2 = com.yandex.metrica.impl.p265ob.C10585O2.m27105b(r2)     // Catch:{  }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ all -> 0x0063 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            byte[] r5 = com.yandex.metrica.impl.p265ob.C10823V0.m27967a((java.io.InputStream) r5, (int) r3)     // Catch:{ all -> 0x0063 }
            r6.mo61064a(r2, r5)     // Catch:{ all -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 != 0) goto L_0x0069
            r6.mo61066c()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10667Qd.mo61982a(java.lang.String, com.yandex.metrica.impl.ob.Qd$a):void");
    }

    C10667Qd(C10669b bVar) {
        this.f25482a = bVar;
    }
}

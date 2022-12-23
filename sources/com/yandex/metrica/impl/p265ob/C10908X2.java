package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X2 */
public class C10908X2 {

    /* renamed from: a */
    private final List<C10820Um<C10380Im>> f26216a = new ArrayList();

    /* renamed from: b */
    private C10380Im f26217b;

    /* renamed from: com.yandex.metrica.impl.ob.X2$a */
    class C10909a implements C10820Um<C10380Im> {

        /* renamed from: a */
        final /* synthetic */ String f26218a;

        C10909a(C10908X2 x2, String str) {
            this.f26218a = str;
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C10380Im im = (C10380Im) obj;
            if (im.mo64227c()) {
                im.mo64225c(this.f26218a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r0 = new com.yandex.metrica.impl.p265ob.C10944Y2(r2, r3, "WebView interface setup failed because of an exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3 = r2.f26217b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r3 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r2.f26216a.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        r0.mo61092b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62464a(android.webkit.WebView r3, com.yandex.metrica.impl.p265ob.C11851vg r4) {
        /*
            r2 = this;
            r0 = 17
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r0)
            if (r0 == 0) goto L_0x0061
            android.webkit.WebSettings r0 = r3.getSettings()     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.getJavaScriptEnabled()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0040
            com.yandex.metrica.AppMetricaJsInterface r0 = new com.yandex.metrica.AppMetricaJsInterface     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "AppMetrica"
            r3.addJavascriptInterface(r0, r1)     // Catch:{ all -> 0x0046 }
            com.yandex.metrica.AppMetricaInitializerJsInterface r0 = new com.yandex.metrica.AppMetricaInitializerJsInterface     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "AppMetricaInitializer"
            r3.addJavascriptInterface(r0, r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = "WebView interface setup is successful."
            com.yandex.metrica.impl.ob.W2 r4 = new com.yandex.metrica.impl.ob.W2     // Catch:{ all -> 0x0046 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x0046 }
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            com.yandex.metrica.impl.ob.Im r3 = r2.f26217b     // Catch:{ all -> 0x003d }
            if (r3 != 0) goto L_0x0038
            java.util.List<com.yandex.metrica.impl.ob.Um<com.yandex.metrica.impl.ob.Im>> r3 = r2.f26216a     // Catch:{ all -> 0x003d }
            r3.add(r4)     // Catch:{ all -> 0x003d }
            goto L_0x003b
        L_0x0038:
            r4.mo61092b(r3)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0040:
            java.lang.String r3 = "WebView interface setup failed because javascript is disabled for the WebView."
            r2.m28176a((java.lang.String) r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x0046:
            r3 = move-exception
            java.lang.String r4 = "WebView interface setup failed because of an exception."
            com.yandex.metrica.impl.ob.Y2 r0 = new com.yandex.metrica.impl.ob.Y2
            r0.<init>(r2, r3, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.Im r3 = r2.f26217b     // Catch:{ all -> 0x005e }
            if (r3 != 0) goto L_0x0059
            java.util.List<com.yandex.metrica.impl.ob.Um<com.yandex.metrica.impl.ob.Im>> r3 = r2.f26216a     // Catch:{ all -> 0x005e }
            r3.add(r0)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0059:
            r0.mo61092b(r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r2)
            goto L_0x0066
        L_0x005e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0061:
            java.lang.String r3 = "WebView interface is not available on Android < 17."
            r2.m28176a((java.lang.String) r3)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10908X2.mo62464a(android.webkit.WebView, com.yandex.metrica.impl.ob.vg):void");
    }

    /* renamed from: a */
    public void mo62465a(C10380Im im) {
        synchronized (this) {
            this.f26217b = im;
        }
        for (C10820Um<C10380Im> b : this.f26216a) {
            b.mo61092b(im);
        }
        this.f26216a.clear();
    }

    /* renamed from: a */
    private void m28176a(String str) {
        C10909a aVar = new C10909a(this, str);
        synchronized (this) {
            C10380Im im = this.f26217b;
            if (im == null) {
                this.f26216a.add(aVar);
            } else {
                aVar.mo61092b(im);
            }
        }
    }
}

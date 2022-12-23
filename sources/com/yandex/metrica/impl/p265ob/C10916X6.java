package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X6 */
public class C10916X6 implements C10876W6 {

    /* renamed from: a */
    private final List<C10820Um<String>> f26244a;

    /* renamed from: b */
    private final C11190e8 f26245b;

    /* renamed from: c */
    private final C10820Um<String> f26246c;

    /* renamed from: com.yandex.metrica.impl.ob.X6$a */
    class C10917a implements C10820Um<String> {
        C10917a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C10916X6.m28194a(C10916X6.this, (String) obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10916X6(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.e8 r0 = new com.yandex.metrica.impl.ob.e8
            java.lang.String r1 = com.yandex.metrica.impl.p265ob.C11327i.m29167a((android.content.Context) r4)
            r2 = 21
            boolean r2 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r2)
            if (r2 == 0) goto L_0x0013
            java.io.File r4 = r4.getNoBackupFilesDir()
            goto L_0x0017
        L_0x0013:
            java.io.File r4 = r4.getFilesDir()
        L_0x0017:
            if (r4 != 0) goto L_0x001b
            r4 = 0
            goto L_0x0035
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.String r4 = "appmetrica_native_crashes"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x0035:
            r0.<init>(r1, r4)
            r3.<init>((com.yandex.metrica.impl.p265ob.C11190e8) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10916X6.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public synchronized void mo62441a(C10820Um<String> um) {
        this.f26244a.add(um);
    }

    /* renamed from: b */
    public synchronized void mo62442b(C10820Um<String> um) {
        this.f26244a.remove(um);
    }

    /* renamed from: a */
    public void mo61207a() {
        this.f26245b.mo62812a(this.f26246c);
    }

    /* renamed from: b */
    public void mo61209b() {
        this.f26245b.mo62813b(this.f26246c);
    }

    /* renamed from: a */
    static void m28194a(C10916X6 x6, String str) {
        ArrayList arrayList;
        synchronized (x6) {
            arrayList = new ArrayList(x6.f26244a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10820Um) it.next()).mo61092b(str);
        }
    }

    C10916X6(C11190e8 e8Var) {
        this.f26244a = new ArrayList();
        this.f26246c = new C10917a();
        this.f26245b = e8Var;
    }
}

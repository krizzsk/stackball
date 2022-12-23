package com.yandex.metrica.impl.p265ob;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fm */
class C11253fm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WeakReference f26919a;

    /* renamed from: b */
    final /* synthetic */ List f26920b;

    /* renamed from: c */
    final /* synthetic */ C10378Il f26921c;

    /* renamed from: d */
    final /* synthetic */ C11091bm f26922d;

    /* renamed from: e */
    final /* synthetic */ C11119cl f26923e;

    /* renamed from: f */
    final /* synthetic */ boolean f26924f;

    /* renamed from: g */
    final /* synthetic */ C11292gm f26925g;

    C11253fm(C11292gm gmVar, WeakReference weakReference, List list, C10378Il il, C11091bm bmVar, C11119cl clVar, boolean z) {
        this.f26925g = gmVar;
        this.f26919a = weakReference;
        this.f26920b = list;
        this.f26921c = il;
        this.f26922d = bmVar;
        this.f26923e = clVar;
        this.f26924f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f26919a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            com.yandex.metrica.impl.ob.gm r1 = r11.f26925g
            com.yandex.metrica.impl.ob.gm$a r1 = r1.f27007f
            java.util.List r2 = r11.f26920b
            com.yandex.metrica.impl.ob.gm r3 = r11.f26925g
            java.util.List r3 = r3.f27008g
            com.yandex.metrica.impl.ob.Il r4 = r11.f26921c
            r1.getClass()
            java.util.Iterator r1 = r2.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.am r2 = (com.yandex.metrica.impl.p265ob.C11053am) r2
            boolean r2 = r2.mo61471a(r4)
            if (r2 == 0) goto L_0x0022
            goto L_0x004b
        L_0x0035:
            java.util.Iterator r1 = r3.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.am r2 = (com.yandex.metrica.impl.p265ob.C11053am) r2
            boolean r2 = r2.mo61471a(r4)
            if (r2 == 0) goto L_0x0039
        L_0x004b:
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r1 == 0) goto L_0x0056
            com.yandex.metrica.impl.ob.wl r1 = new com.yandex.metrica.impl.ob.wl
            r1.<init>()
            goto L_0x005b
        L_0x0056:
            com.yandex.metrica.impl.ob.Qk r1 = new com.yandex.metrica.impl.ob.Qk
            r1.<init>()
        L_0x005b:
            r7 = r1
            com.yandex.metrica.impl.ob.gm r1 = r11.f26925g
            com.yandex.metrica.impl.ob.Mk r1 = r1.f27004c
            long r8 = r1.mo61802a()
            com.yandex.metrica.impl.ob.gm r1 = r11.f26925g
            com.yandex.metrica.impl.p265ob.C11292gm.m29089a(r1, r0, r8)
            r10 = 0
            com.yandex.metrica.impl.ob.gm r1 = r11.f26925g     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.Hl r1 = r1.f27005d     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.bm r3 = r11.f26922d     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.cl r2 = r11.f26923e     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.bl r4 = r2.mo62735c()     // Catch:{ all -> 0x0084 }
            boolean r6 = r11.f26924f     // Catch:{ all -> 0x0084 }
            r2 = r0
            r5 = r7
            com.yandex.metrica.impl.ob.Gl r1 = r1.mo61472a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0084 }
            r3 = r1
            goto L_0x008f
        L_0x0084:
            r1 = move-exception
            com.yandex.metrica.impl.ob.gm r2 = r11.f26925g
            java.util.List r3 = r11.f26920b
            com.yandex.metrica.impl.ob.bm r4 = r11.f26922d
            com.yandex.metrica.impl.p265ob.C11292gm.m29091a(r2, r3, r1, r4)
            r3 = r10
        L_0x008f:
            if (r3 == 0) goto L_0x00a1
            com.yandex.metrica.impl.ob.gm r1 = r11.f26925g
            java.util.List r2 = r11.f26920b
            java.util.List r4 = r7.mo62091a()
            com.yandex.metrica.impl.ob.Il r6 = r11.f26921c
            com.yandex.metrica.impl.ob.cl r7 = r11.f26923e
            r5 = r0
            com.yandex.metrica.impl.p265ob.C11292gm.m29090a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11253fm.run():void");
    }
}

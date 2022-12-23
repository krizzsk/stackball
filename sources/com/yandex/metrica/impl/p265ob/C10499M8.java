package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.M8 */
public class C10499M8 implements C10452L8 {

    /* renamed from: a */
    private final Context f25178a;

    /* renamed from: b */
    private final String f25179b;

    /* renamed from: c */
    private final C10214E8 f25180c;

    /* renamed from: d */
    private final C11093bn f25181d;

    /* renamed from: e */
    private C11906w8 f25182e;

    public C10499M8(Context context, String str, C11093bn bnVar, C10214E8 e8) {
        this.f25178a = context;
        this.f25179b = str;
        this.f25181d = bnVar;
        this.f25180c = e8;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase mo61713a() {
        C11906w8 w8Var;
        try {
            this.f25181d.mo62712a();
            w8Var = new C11906w8(this.f25178a, this.f25179b, this.f25180c);
            this.f25182e = w8Var;
        } catch (Throwable unused) {
            return null;
        }
        return w8Var.getWritableDatabase();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo61714a(android.database.sqlite.SQLiteDatabase r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L_0x0006
            r1.close()     // Catch:{ all -> 0x0006 }
        L_0x0006:
            com.yandex.metrica.impl.ob.w8 r1 = r0.f25182e     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r1)     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.impl.ob.bn r1 = r0.f25181d     // Catch:{ all -> 0x0015 }
            r1.mo62713b()     // Catch:{ all -> 0x0015 }
            r1 = 0
            r0.f25182e = r1     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10499M8.mo61714a(android.database.sqlite.SQLiteDatabase):void");
    }
}

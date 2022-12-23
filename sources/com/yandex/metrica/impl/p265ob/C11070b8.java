package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.p264ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.b8 */
public class C11070b8 implements C10498M7<String> {

    /* renamed from: a */
    private final C11136d8 f26587a;

    /* renamed from: b */
    private final C10864Vm<String, Bundle> f26588b;

    /* renamed from: c */
    private final Callable<List<Bundle>> f26589c;

    /* renamed from: d */
    private final C10820Um<String> f26590d;

    /* renamed from: e */
    private final C11028a8 f26591e;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    class C11071a implements C10864Vm<String, Bundle> {
        C11071a() {
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return CrashpadServiceHelper.readCrash((String) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$b */
    class C11072b implements Callable<List<Bundle>> {
        C11072b() {
        }

        public Object call() throws Exception {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$c */
    class C11073c implements C10820Um<String> {
        C11073c() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            CrashpadServiceHelper.m25955a((String) obj);
        }
    }

    public C11070b8(C11136d8 d8Var) {
        this(d8Var, new C11028a8(), new C11071a(), new C11072b(), new C11073c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61784a(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            com.yandex.metrica.impl.ob.Vm<java.lang.String, android.os.Bundle> r0 = r2.f26588b     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.mo61128a(r3)     // Catch:{ all -> 0x0013 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            com.yandex.metrica.impl.ob.a8 r1 = r2.f26591e     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.Z7 r0 = r1.mo61165a((java.lang.String) r3, (android.os.Bundle) r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.d8 r3 = r2.f26587a
            r3.mo62747a((com.yandex.metrica.impl.p265ob.C10984Z7) r0)
            goto L_0x0021
        L_0x001c:
            com.yandex.metrica.impl.ob.Um<java.lang.String> r0 = r2.f26590d
            r0.mo61092b(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11070b8.mo61784a(java.lang.Object):void");
    }

    public C11070b8(C11136d8 d8Var, C11028a8 a8Var, C10864Vm<String, Bundle> vm, Callable<List<Bundle>> callable, C10820Um<String> um) {
        this.f26587a = d8Var;
        this.f26591e = a8Var;
        this.f26588b = vm;
        this.f26589c = callable;
        this.f26590d = um;
    }

    /* renamed from: a */
    public void mo61783a() {
        try {
            for (Bundle bundle : this.f26589c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    C10984Z7 a = this.f26591e.mo61165a(string, bundle);
                    if (a != null) {
                        this.f26587a.mo62748b(a);
                    } else {
                        this.f26590d.mo61092b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}

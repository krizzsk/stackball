package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.C10078e;
import com.yandex.metrica.rtm.wrapper.C12058i;
import com.yandex.metrica.rtm.wrapper.C12059j;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.xh */
public class C11950xh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10442L0 f28721a;

    /* renamed from: com.yandex.metrica.impl.ob.xh$a */
    class C11951a implements C12058i {
        C11951a() {
        }

        public File getCrashesDirectory(Context context) {
            return C11950xh.this.f28721a.mo61697a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C11950xh.this.f28721a.mo61697a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$b */
    class C11952b implements C12059j {
        C11952b(C11950xh xhVar) {
        }

        public String getDeviceType(Context context) {
            C10078e a = C10619P0.m27164i().mo61888p().mo64117a().mo63999a();
            if (a == null) {
                return null;
            }
            return a.mo60963a();
        }

        public String getVersion(Context context) {
            return C10796U2.m27877a(context, context.getPackageName());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$c */
    class C11953c implements C12058i {
        C11953c() {
        }

        public File getCrashesDirectory(Context context) {
            return C11950xh.this.f28721a.mo61697a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C11950xh.this.f28721a.mo61697a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public C11950xh() {
        this(new C10442L0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.C12055f mo64082b(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p265ob.C10122B2.m26036a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0024
            com.yandex.metrica.rtm.wrapper.l r0 = new com.yandex.metrica.rtm.wrapper.l     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.xh$a r1 = new com.yandex.metrica.impl.ob.xh$a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.zn r2 = r2.mo61891s()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.sn r2 = r2.mo64213g()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.xh$b r3 = new com.yandex.metrica.impl.ob.xh$b     // Catch:{ all -> 0x0024 }
            r3.<init>(r4)     // Catch:{ all -> 0x0024 }
            r0.<init>(r1, r5, r2, r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x002c
            com.yandex.metrica.impl.ob.uh r0 = new com.yandex.metrica.impl.ob.uh
            r0.<init>()
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11950xh.mo64082b(android.content.Context):com.yandex.metrica.rtm.wrapper.f");
    }

    C11950xh(C10442L0 l0) {
        this.f28721a = l0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.C12054e mo64081a(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p265ob.C10122B2.m26036a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0013
            com.yandex.metrica.rtm.wrapper.h r0 = new com.yandex.metrica.rtm.wrapper.h     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.xh$c r1 = new com.yandex.metrica.impl.ob.xh$c     // Catch:{ all -> 0x0013 }
            r1.<init>()     // Catch:{ all -> 0x0013 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x001b
            com.yandex.metrica.impl.ob.th r0 = new com.yandex.metrica.impl.ob.th
            r0.<init>()
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11950xh.mo64081a(android.content.Context):com.yandex.metrica.rtm.wrapper.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.C12053d mo64080a(com.yandex.metrica.rtm.wrapper.C12060k r2, java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p265ob.C10122B2.m26036a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000e
            com.yandex.metrica.rtm.wrapper.g r0 = new com.yandex.metrica.rtm.wrapper.g     // Catch:{ all -> 0x000e }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0016
            com.yandex.metrica.impl.ob.sh r0 = new com.yandex.metrica.impl.ob.sh
            r0.<init>()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11950xh.mo64080a(com.yandex.metrica.rtm.wrapper.k, java.lang.String, boolean):com.yandex.metrica.rtm.wrapper.d");
    }
}

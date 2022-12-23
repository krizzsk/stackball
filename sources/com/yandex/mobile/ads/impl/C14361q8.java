package com.yandex.mobile.ads.impl;

import com.yandex.metrica.C12046p;
import com.yandex.mobile.ads.impl.C14568s8;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.q8 */
class C14361q8 {

    /* renamed from: a */
    private final Executor f39019a = Executors.newSingleThreadExecutor(new oq0("YandexMobileAds.AppMetrica"));

    /* renamed from: com.yandex.mobile.ads.impl.q8$a */
    public interface C14362a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.q8$b */
    private static class C14363b implements C12046p.Ucc {

        /* renamed from: a */
        private final C14362a f39020a;

        /* renamed from: b */
        private final C14573sa f39021b = new C14573sa();

        C14363b(C14362a aVar) {
            this.f39020a = aVar;
        }

        public void onError(String str) {
            C14568s8.C14569a aVar = (C14568s8.C14569a) this.f39020a;
            aVar.getClass();
            synchronized (C14568s8.f39870g) {
                C14568s8.m41839a(C14568s8.this, str);
            }
        }

        public void onResult(JSONObject jSONObject) {
            String a = jSONObject != null ? this.f39021b.mo69913a(jSONObject) : null;
            C14568s8.C14569a aVar = (C14568s8.C14569a) this.f39020a;
            aVar.getClass();
            synchronized (C14568s8.f39870g) {
                C14568s8.this.m41840a(a);
            }
        }
    }

    C14361q8() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69506b(com.yandex.mobile.ads.impl.C14361q8.C14362a r3) {
        /*
            r2 = this;
            java.util.concurrent.Executor r0 = r2.f39019a     // Catch:{ all -> 0x000b }
            com.yandex.mobile.ads.impl.-$$Lambda$q8$kQB8B-I_q7gLYCFTeJ7skTJs-mU r1 = new com.yandex.mobile.ads.impl.-$$Lambda$q8$kQB8B-I_q7gLYCFTeJ7skTJs-mU     // Catch:{ all -> 0x000b }
            r1.<init>()     // Catch:{ all -> 0x000b }
            r0.execute(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001d
        L_0x000b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.yandex.mobile.ads.impl.s8$a r3 = (com.yandex.mobile.ads.impl.C14568s8.C14569a) r3
            java.lang.Object r1 = com.yandex.mobile.ads.impl.C14568s8.f39870g
            monitor-enter(r1)
            com.yandex.mobile.ads.impl.s8 r3 = com.yandex.mobile.ads.impl.C14568s8.this     // Catch:{ all -> 0x001e }
            com.yandex.mobile.ads.impl.C14568s8.m41839a(r3, r0)     // Catch:{ all -> 0x001e }
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
        L_0x001d:
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14361q8.mo69506b(com.yandex.mobile.ads.impl.q8$a):void");
    }
}

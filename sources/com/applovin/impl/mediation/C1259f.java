package com.applovin.impl.mediation;

import android.os.Bundle;

/* renamed from: com.applovin.impl.mediation.f */
public class C1259f {

    /* renamed from: a */
    private final Bundle f2435a;

    /* renamed from: com.applovin.impl.mediation.f$a */
    public static class C1261a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Bundle f2436a = new Bundle();

        /* renamed from: a */
        public C1261a mo12404a(String str) {
            if (str != null) {
                this.f2436a.remove(str);
                return this;
            }
            throw new IllegalArgumentException("No key specified.");
        }

        /* renamed from: a */
        public C1261a mo12405a(String str, String str2) {
            if (str != null) {
                this.f2436a.putString(str, str2);
                return this;
            }
            throw new IllegalArgumentException("No key specified");
        }

        /* renamed from: a */
        public C1259f mo12406a() {
            return new C1259f(this);
        }
    }

    private C1259f(C1261a aVar) {
        this.f2435a = aVar.f2436a;
    }

    /* renamed from: a */
    public Bundle mo12402a() {
        return this.f2435a;
    }

    public String toString() {
        return "MediatedRequestParameters{extraParameters=" + this.f2435a + '}';
    }
}

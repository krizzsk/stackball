package com.yandex.metrica.impl.p265ob;

import com.appsflyer.internal.referrer.Payload;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Qb */
public final class C10664Qb {

    /* renamed from: a */
    private final C10868W0 f25472a;

    /* renamed from: com.yandex.metrica.impl.ob.Qb$a */
    public static final class C10665a {

        /* renamed from: a */
        private final boolean f25473a;

        /* renamed from: b */
        private final int f25474b;

        /* renamed from: c */
        private final int f25475c;

        /* renamed from: d */
        private final String f25476d;

        public C10665a() {
            this(false, 0, 0, (String) null, 15);
        }

        public C10665a(boolean z, int i, int i2, String str) {
            this.f25473a = z;
            this.f25474b = i;
            this.f25475c = i2;
            this.f25476d = str;
        }

        /* renamed from: a */
        public final String mo61975a() {
            return this.f25476d;
        }

        /* renamed from: b */
        public final int mo61976b() {
            return this.f25474b;
        }

        /* renamed from: c */
        public final int mo61977c() {
            return this.f25475c;
        }

        /* renamed from: d */
        public final boolean mo61978d() {
            return this.f25473a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10665a)) {
                return false;
            }
            C10665a aVar = (C10665a) obj;
            return this.f25473a == aVar.f25473a && this.f25474b == aVar.f25474b && this.f25475c == aVar.f25475c && Intrinsics.areEqual((Object) this.f25476d, (Object) aVar.f25476d);
        }

        public int hashCode() {
            boolean z = this.f25473a;
            if (z) {
                z = true;
            }
            int i = (((((z ? 1 : 0) * true) + this.f25474b) * 31) + this.f25475c) * 31;
            String str = this.f25476d;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RequestReport(success=" + this.f25473a + ", httpStatus=" + this.f25474b + ", size=" + this.f25475c + ", failureReason=" + this.f25476d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10665a(boolean z, int i, int i2, String str, int i3) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str);
        }
    }

    public C10664Qb(C11823ui uiVar, C10868W0 w0) {
        this.f25472a = !uiVar.mo63803e() ? null : w0;
    }

    /* renamed from: a */
    public final void mo61974a(C10665a aVar) {
        C10868W0 w0 = this.f25472a;
        if (w0 != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.m45515to("status", aVar.mo61978d() ? Payload.RESPONSE_OK : "FAILED");
            pairArr[1] = TuplesKt.m45515to("http_status", Integer.valueOf(aVar.mo61976b()));
            pairArr[2] = TuplesKt.m45515to("size", Integer.valueOf(aVar.mo61977c()));
            Map mutableMapOf = MapsKt.mutableMapOf(pairArr);
            String a = aVar.mo61975a();
            if (a != null) {
                mutableMapOf.put(IronSourceConstants.EVENTS_ERROR_REASON, a);
            }
            w0.reportEvent("egress_status", (Map<String, Object>) MapsKt.toMap(mutableMapOf));
        }
    }

    /* renamed from: a */
    public final void mo61973a() {
        C10868W0 w0 = this.f25472a;
        if (w0 != null) {
            w0.mo61023d("egress_diagnostics", "Unable to open url connection, check config url.");
        }
    }
}

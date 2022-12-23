package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.yandex.metrica.impl.ob.U */
public class C10793U {

    /* renamed from: a */
    private final C11258g1 f25886a;

    /* renamed from: b */
    private final C11258g1 f25887b;

    /* renamed from: c */
    private final C11258g1 f25888c;

    /* renamed from: d */
    private final C11258g1 f25889d;

    /* renamed from: e */
    private final C11258g1 f25890e;

    /* renamed from: f */
    private final C11258g1 f25891f;

    /* renamed from: g */
    private final C11258g1 f25892g;

    /* renamed from: h */
    private final C11258g1 f25893h;

    /* renamed from: i */
    private final C11258g1 f25894i;

    /* renamed from: j */
    private final C11258g1 f25895j;

    /* renamed from: k */
    private final C11258g1 f25896k;

    /* renamed from: l */
    private final long f25897l;

    /* renamed from: m */
    private final C10378Il f25898m;

    /* renamed from: n */
    private final C10921Xa f25899n;

    /* renamed from: o */
    private final long f25900o;

    /* renamed from: p */
    private final C11954xi f25901p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C10793U(com.yandex.metrica.impl.p265ob.C10675Qi r21, com.yandex.metrica.impl.p265ob.C11279gc r22, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            r20 = this;
            java.lang.String r0 = r21.mo62007V()
            com.yandex.metrica.impl.ob.g1 r2 = m27839a((java.lang.String) r0)
            java.lang.String r0 = r21.mo62017i()
            com.yandex.metrica.impl.ob.g1 r3 = m27839a((java.lang.String) r0)
            java.lang.String r0 = r21.mo62019k()
            com.yandex.metrica.impl.ob.g1 r4 = m27839a((java.lang.String) r0)
            java.lang.String r0 = r21.mo61992G()
            com.yandex.metrica.impl.ob.g1 r5 = m27839a((java.lang.String) r0)
            java.lang.String r0 = r21.mo62025q()
            com.yandex.metrica.impl.ob.g1 r6 = m27839a((java.lang.String) r0)
            java.lang.String r0 = r21.mo62023o()
            java.util.Map r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30966a((java.lang.String) r0)
            java.lang.String r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30964a((java.util.Map<java.lang.String, java.lang.String>) r0)
            com.yandex.metrica.impl.ob.g1 r7 = m27839a((java.lang.String) r0)
            java.lang.String r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30964a((java.util.Map<java.lang.String, java.lang.String>) r23)
            com.yandex.metrica.impl.ob.g1 r8 = m27839a((java.lang.String) r0)
            com.yandex.metrica.impl.ob.g1 r9 = new com.yandex.metrica.impl.ob.g1
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62960a()
            com.yandex.metrica.impl.ob.ac r0 = r0.f26600a
            r1 = 0
            if (r0 != 0) goto L_0x004d
            r0 = r1
            goto L_0x0055
        L_0x004d:
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62960a()
            com.yandex.metrica.impl.ob.ac r0 = r0.f26600a
            java.lang.String r0 = r0.f26512b
        L_0x0055:
            com.yandex.metrica.impl.ob.bc r10 = r22.mo62960a()
            com.yandex.metrica.impl.ob.e1 r10 = r10.f26601b
            com.yandex.metrica.impl.ob.bc r11 = r22.mo62960a()
            java.lang.String r11 = r11.f26602c
            r9.<init>(r0, r10, r11)
            com.yandex.metrica.impl.ob.g1 r10 = new com.yandex.metrica.impl.ob.g1
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62961b()
            com.yandex.metrica.impl.ob.ac r0 = r0.f26600a
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0078
        L_0x0070:
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62961b()
            com.yandex.metrica.impl.ob.ac r0 = r0.f26600a
            java.lang.String r0 = r0.f26512b
        L_0x0078:
            com.yandex.metrica.impl.ob.bc r11 = r22.mo62961b()
            com.yandex.metrica.impl.ob.e1 r11 = r11.f26601b
            com.yandex.metrica.impl.ob.bc r12 = r22.mo62961b()
            java.lang.String r12 = r12.f26602c
            r10.<init>(r0, r11, r12)
            com.yandex.metrica.impl.ob.g1 r11 = new com.yandex.metrica.impl.ob.g1
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62962c()
            com.yandex.metrica.impl.ob.ac r0 = r0.f26600a
            if (r0 != 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62962c()
            com.yandex.metrica.impl.ob.ac r0 = r0.f26600a
            java.lang.String r1 = r0.f26512b
        L_0x009a:
            com.yandex.metrica.impl.ob.bc r0 = r22.mo62962c()
            com.yandex.metrica.impl.ob.e1 r0 = r0.f26601b
            com.yandex.metrica.impl.ob.bc r12 = r22.mo62962c()
            java.lang.String r12 = r12.f26602c
            r11.<init>(r1, r0, r12)
            java.util.Map r0 = r21.mo62016h()
            java.lang.String r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30978b((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r0)
            com.yandex.metrica.impl.ob.g1 r12 = m27839a((java.lang.String) r0)
            com.yandex.metrica.impl.ob.Il r0 = new com.yandex.metrica.impl.ob.Il
            r13 = r0
            r1 = r21
            r0.<init>((com.yandex.metrica.impl.p265ob.C10675Qi) r1)
            com.yandex.metrica.impl.ob.Xa r14 = r21.mo62021m()
            long r15 = com.yandex.metrica.impl.p265ob.C11327i.m29163a()
            long r17 = r21.mo61988C()
            com.yandex.metrica.impl.ob.Ti r0 = r21.mo62000O()
            int r0 = r0.mo62303a()
            long r0 = (long) r0
            long r17 = r17 + r0
            com.yandex.metrica.impl.ob.si r0 = r21.mo62014f()
            java.lang.Boolean r0 = r0.f28203y
            com.yandex.metrica.impl.ob.xi r19 = m27841a((java.lang.Boolean) r0)
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10793U.<init>(com.yandex.metrica.impl.ob.Qi, com.yandex.metrica.impl.ob.gc, java.util.Map):void");
    }

    /* renamed from: a */
    public C11258g1 mo62310a() {
        return this.f25892g;
    }

    /* renamed from: b */
    public C11258g1 mo62311b() {
        return this.f25896k;
    }

    /* renamed from: c */
    public C11258g1 mo62312c() {
        return this.f25887b;
    }

    /* renamed from: d */
    public C11258g1 mo62314d() {
        return this.f25888c;
    }

    /* renamed from: e */
    public C10921Xa mo62315e() {
        return this.f25899n;
    }

    /* renamed from: f */
    public C11954xi mo62316f() {
        return this.f25901p;
    }

    /* renamed from: g */
    public C11258g1 mo62317g() {
        return this.f25893h;
    }

    /* renamed from: h */
    public C11258g1 mo62318h() {
        return this.f25890e;
    }

    /* renamed from: i */
    public C11258g1 mo62319i() {
        return this.f25894i;
    }

    /* renamed from: j */
    public long mo62320j() {
        return this.f25900o;
    }

    /* renamed from: k */
    public C11258g1 mo62321k() {
        return this.f25889d;
    }

    /* renamed from: l */
    public C11258g1 mo62322l() {
        return this.f25891f;
    }

    /* renamed from: m */
    public long mo62323m() {
        return this.f25897l;
    }

    /* renamed from: n */
    public C10378Il mo62324n() {
        return this.f25898m;
    }

    /* renamed from: o */
    public C11258g1 mo62325o() {
        return this.f25886a;
    }

    /* renamed from: p */
    public C11258g1 mo62326p() {
        return this.f25895j;
    }

    public String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f25886a + ", mDeviceIdData=" + this.f25887b + ", mDeviceIdHashData=" + this.f25888c + ", mReportAdUrlData=" + this.f25889d + ", mGetAdUrlData=" + this.f25890e + ", mResponseClidsData=" + this.f25891f + ", mClientClidsForRequestData=" + this.f25892g + ", mGaidData=" + this.f25893h + ", mHoaidData=" + this.f25894i + ", yandexAdvIdData=" + this.f25895j + ", customSdkHostsData=" + this.f25896k + ", customSdkHosts=" + this.f25896k + ", mServerTimeOffset=" + this.f25897l + ", mUiAccessConfig=" + this.f25898m + ", diagnosticsConfigsHolder=" + this.f25899n + ", nextStartupTime=" + this.f25900o + ", features=" + this.f25901p + '}';
    }

    /* renamed from: a */
    private static Bundle m27836a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("value", parcelable);
        return bundle;
    }

    /* renamed from: b */
    private static C10378Il m27842b(Bundle bundle) {
        return (C10378Il) m27837a(bundle.getBundle("UiAccessConfig"), C10378Il.class.getClassLoader());
    }

    /* renamed from: c */
    public void mo62313c(Bundle bundle) {
        bundle.putBundle("Uuid", m27836a((Parcelable) this.f25886a));
        bundle.putBundle("DeviceId", m27836a((Parcelable) this.f25887b));
        bundle.putBundle("DeviceIdHash", m27836a((Parcelable) this.f25888c));
        bundle.putBundle("AdUrlReport", m27836a((Parcelable) this.f25889d));
        bundle.putBundle("AdUrlGet", m27836a((Parcelable) this.f25890e));
        bundle.putBundle("Clids", m27836a((Parcelable) this.f25891f));
        bundle.putBundle("RequestClids", m27836a((Parcelable) this.f25892g));
        bundle.putBundle(IronSourceConstants.TYPE_GAID, m27836a((Parcelable) this.f25893h));
        bundle.putBundle("HOAID", m27836a((Parcelable) this.f25894i));
        bundle.putBundle("YANDEX_ADV_ID", m27836a((Parcelable) this.f25895j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", m27836a((Parcelable) this.f25896k));
        bundle.putBundle("UiAccessConfig", m27836a((Parcelable) this.f25898m));
        bundle.putBundle("DiagnosticsConfigsHolder", m27836a((Parcelable) this.f25899n));
        bundle.putLong("ServerTimeOffset", this.f25897l);
        bundle.putLong("NextStartupTime", this.f25900o);
        bundle.putBundle("features", m27836a((Parcelable) this.f25901p));
    }

    /* renamed from: a */
    private static Parcelable m27837a(Bundle bundle, ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable("value");
    }

    /* renamed from: b */
    private static C11258g1 m27843b(Bundle bundle, String str) {
        C11258g1 g1Var = (C11258g1) m27837a(bundle.getBundle(str), C11258g1.class.getClassLoader());
        return g1Var == null ? new C11258g1((String) null, C11171e1.UNKNOWN, "bundle serialization error") : g1Var;
    }

    /* renamed from: a */
    private static C10921Xa m27838a(Bundle bundle) {
        C10921Xa xa = (C10921Xa) m27837a(bundle.getBundle("DiagnosticsConfigsHolder"), C10921Xa.class.getClassLoader());
        return xa == null ? new C10921Xa() : xa;
    }

    /* renamed from: a */
    private static C11954xi m27840a(Bundle bundle, String str) {
        C11954xi xiVar = (C11954xi) m27837a(bundle.getBundle(str), C11954xi.class.getClassLoader());
        return xiVar == null ? new C11954xi((Boolean) null, C11171e1.UNKNOWN, "bundle serialization error") : xiVar;
    }

    /* renamed from: a */
    private static C11258g1 m27839a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new C11258g1(str, isEmpty ? C11171e1.UNKNOWN : C11171e1.f26755b, isEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    private static C11954xi m27841a(Boolean bool) {
        boolean z = bool != null;
        return new C11954xi(bool, z ? C11171e1.f26755b : C11171e1.UNKNOWN, z ? null : "no identifier in startup state");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10793U(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = r22
            r1 = r21
            java.lang.String r2 = "Uuid"
            com.yandex.metrica.impl.ob.g1 r2 = m27843b(r0, r2)
            java.lang.String r3 = "DeviceId"
            com.yandex.metrica.impl.ob.g1 r3 = m27843b(r0, r3)
            java.lang.String r4 = "DeviceIdHash"
            com.yandex.metrica.impl.ob.g1 r4 = m27843b(r0, r4)
            java.lang.String r5 = "AdUrlReport"
            com.yandex.metrica.impl.ob.g1 r5 = m27843b(r0, r5)
            java.lang.String r6 = "AdUrlGet"
            com.yandex.metrica.impl.ob.g1 r6 = m27843b(r0, r6)
            java.lang.String r7 = "Clids"
            com.yandex.metrica.impl.ob.g1 r7 = m27843b(r0, r7)
            java.lang.String r8 = "RequestClids"
            com.yandex.metrica.impl.ob.g1 r8 = m27843b(r0, r8)
            java.lang.String r9 = "GAID"
            com.yandex.metrica.impl.ob.g1 r9 = m27843b(r0, r9)
            java.lang.String r10 = "HOAID"
            com.yandex.metrica.impl.ob.g1 r10 = m27843b(r0, r10)
            java.lang.String r11 = "YANDEX_ADV_ID"
            com.yandex.metrica.impl.ob.g1 r11 = m27843b(r0, r11)
            java.lang.String r12 = "CUSTOM_SDK_HOSTS"
            com.yandex.metrica.impl.ob.g1 r12 = m27843b(r0, r12)
            com.yandex.metrica.impl.ob.Il r13 = m27842b(r22)
            com.yandex.metrica.impl.ob.Xa r14 = m27838a((android.os.Bundle) r22)
            java.lang.String r15 = "ServerTimeOffset"
            long r15 = r0.getLong(r15)
            r20 = r1
            java.lang.String r1 = "NextStartupTime"
            long r17 = r0.getLong(r1)
            java.lang.String r1 = "features"
            com.yandex.metrica.impl.ob.xi r19 = m27840a((android.os.Bundle) r0, (java.lang.String) r1)
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10793U.<init>(android.os.Bundle):void");
    }

    public C10793U(C11258g1 g1Var, C11258g1 g1Var2, C11258g1 g1Var3, C11258g1 g1Var4, C11258g1 g1Var5, C11258g1 g1Var6, C11258g1 g1Var7, C11258g1 g1Var8, C11258g1 g1Var9, C11258g1 g1Var10, C11258g1 g1Var11, C10378Il il, C10921Xa xa, long j, long j2, C11954xi xiVar) {
        this.f25886a = g1Var;
        this.f25887b = g1Var2;
        this.f25888c = g1Var3;
        this.f25889d = g1Var4;
        this.f25890e = g1Var5;
        this.f25891f = g1Var6;
        this.f25892g = g1Var7;
        this.f25893h = g1Var8;
        this.f25894i = g1Var9;
        this.f25895j = g1Var10;
        this.f25896k = g1Var11;
        this.f25898m = il;
        this.f25899n = xa;
        this.f25897l = j;
        this.f25900o = j2;
        this.f25901p = xiVar;
    }
}

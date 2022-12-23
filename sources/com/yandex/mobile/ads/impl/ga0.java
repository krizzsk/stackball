package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

public final class ga0 implements fa0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Provider<da0> f33918a;

    /* renamed from: b */
    private final x90 f33919b;

    /* renamed from: c */
    private final ca0 f33920c;

    /* renamed from: d */
    private final Provider<yc1> f33921d;

    /* renamed from: com.yandex.mobile.ads.impl.ga0$a */
    static final class C13187a extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ ga0 f33922b;

        /* renamed from: c */
        final /* synthetic */ String f33923c;

        /* renamed from: d */
        final /* synthetic */ String f33924d;

        /* renamed from: e */
        final /* synthetic */ long f33925e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13187a(ga0 ga0, String str, String str2, long j) {
            super(0);
            this.f33922b = ga0;
            this.f33923c = str;
            this.f33924d = str2;
            this.f33925e = j;
        }

        public Object invoke() {
            ((da0) this.f33922b.f33918a.get()).mo66539a(this.f33923c + '.' + this.f33924d, RangesKt.coerceAtLeast(this.f33925e, 1), TimeUnit.MILLISECONDS);
            return Unit.INSTANCE;
        }
    }

    public ga0(Provider<da0> provider, x90 x90, ca0 ca0, Provider<yc1> provider2) {
        Intrinsics.checkNotNullParameter(provider, "histogramRecorder");
        Intrinsics.checkNotNullParameter(x90, "histogramCallTypeProvider");
        Intrinsics.checkNotNullParameter(ca0, "histogramRecordConfig");
        Intrinsics.checkNotNullParameter(provider2, "taskExecutor");
        this.f33918a = provider;
        this.f33919b = x90;
        this.f33920c = ca0;
        this.f33921d = provider2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66947a(java.lang.String r8, long r9, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "histogramName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.yandex.mobile.ads.impl.x90 r0 = r7.f33919b
            java.lang.String r0 = r0.mo70849b(r8)
            if (r11 != 0) goto L_0x000f
            r4 = r0
            goto L_0x0010
        L_0x000f:
            r4 = r11
        L_0x0010:
            com.yandex.mobile.ads.impl.ca0 r11 = r7.f33920c
            java.lang.String r0 = "callType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r4.hashCode()
            r1 = 2106116(0x202304, float:2.951297E-39)
            if (r0 == r1) goto L_0x004c
            r1 = 2106217(0x202369, float:2.951439E-39)
            if (r0 == r1) goto L_0x003e
            r1 = 2688677(0x2906a5, float:3.767639E-39)
            if (r0 == r1) goto L_0x0030
            goto L_0x0054
        L_0x0030:
            java.lang.String r0 = "Warm"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x0054
        L_0x0039:
            boolean r11 = r11.mo65708h()
            goto L_0x005a
        L_0x003e:
            java.lang.String r0 = "Cool"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x0054
        L_0x0047:
            boolean r11 = r11.mo65705e()
            goto L_0x005a
        L_0x004c:
            java.lang.String r0 = "Cold"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0056
        L_0x0054:
            r11 = 0
            goto L_0x005a
        L_0x0056:
            boolean r11 = r11.mo65704a()
        L_0x005a:
            if (r11 != 0) goto L_0x005d
            return
        L_0x005d:
            javax.inject.Provider<com.yandex.mobile.ads.impl.yc1> r11 = r7.f33921d
            java.lang.Object r11 = r11.get()
            com.yandex.mobile.ads.impl.yc1 r11 = (com.yandex.mobile.ads.impl.yc1) r11
            com.yandex.mobile.ads.impl.ga0$a r0 = new com.yandex.mobile.ads.impl.ga0$a
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            r11.mo70190a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ga0.mo66947a(java.lang.String, long, java.lang.String):void");
    }
}

package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.C12390ak;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.a40;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.ak */
public final class C12390ak implements C12579bb, af1 {

    /* renamed from: n */
    public static final Map<String, int[]> f30563n = m33760b();

    /* renamed from: o */
    public static final long[] f30564o = {5800000, 3500000, 1900000, 1000000, 520000};

    /* renamed from: p */
    public static final long[] f30565p = {204000, 154000, 139000, 122000, 102000};

    /* renamed from: q */
    public static final long[] f30566q = {2200000, 1150000, 810000, 640000, 450000};

    /* renamed from: r */
    public static final long[] f30567r = {4900000, 2300000, 1500000, 970000, 540000};

    /* renamed from: s */
    private static C12390ak f30568s;

    /* renamed from: a */
    private final Context f30569a;

    /* renamed from: b */
    private final SparseArray<Long> f30570b;

    /* renamed from: c */
    private final a40<C12579bb.C12580a> f30571c;

    /* renamed from: d */
    private final r91 f30572d;

    /* renamed from: e */
    private final C13493jf f30573e;

    /* renamed from: f */
    private int f30574f;

    /* renamed from: g */
    private long f30575g;

    /* renamed from: h */
    private long f30576h;

    /* renamed from: i */
    private int f30577i;

    /* renamed from: j */
    private long f30578j;

    /* renamed from: k */
    private long f30579k;

    /* renamed from: l */
    private long f30580l;

    /* renamed from: m */
    private long f30581m;

    /* renamed from: com.yandex.mobile.ads.impl.ak$b */
    public static final class C12392b {

        /* renamed from: a */
        private final Context f30582a;

        /* renamed from: b */
        private SparseArray<Long> f30583b;

        /* renamed from: c */
        private int f30584c;

        /* renamed from: d */
        private C13493jf f30585d;

        /* renamed from: e */
        private boolean f30586e;

        public C12392b(Context context) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f30582a = context2;
            this.f30583b = m33768a(ih1.m37373a(context));
            this.f30584c = 2000;
            this.f30585d = C13493jf.f35273a;
            this.f30586e = true;
        }

        /* renamed from: a */
        public C12390ak mo65791a() {
            return new C12390ak(this.f30582a, this.f30583b, this.f30584c, this.f30585d, this.f30586e);
        }

        /* renamed from: a */
        private static SparseArray<Long> m33768a(String str) {
            int[] iArr = C12390ak.f30563n.get(str);
            if (iArr == null) {
                iArr = new int[]{2, 2, 2, 2};
            }
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            long[] jArr = C12390ak.f30564o;
            sparseArray.append(2, Long.valueOf(jArr[iArr[0]]));
            sparseArray.append(3, Long.valueOf(C12390ak.f30565p[iArr[1]]));
            sparseArray.append(4, Long.valueOf(C12390ak.f30566q[iArr[2]]));
            long[] jArr2 = C12390ak.f30567r;
            sparseArray.append(5, Long.valueOf(jArr2[iArr[3]]));
            sparseArray.append(7, Long.valueOf(jArr[iArr[0]]));
            sparseArray.append(9, Long.valueOf(jArr2[iArr[3]]));
            return sparseArray;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m33759a(com.yandex.mobile.ads.impl.C12390ak r10) {
        /*
            monitor-enter(r10)
            android.content.Context r0 = r10.f30569a     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            r0 = 0
            goto L_0x000c
        L_0x0008:
            int r0 = com.yandex.mobile.ads.impl.ih1.m37392c((android.content.Context) r0)     // Catch:{ all -> 0x0050 }
        L_0x000c:
            int r2 = r10.f30577i     // Catch:{ all -> 0x0050 }
            if (r2 != r0) goto L_0x0011
            goto L_0x004e
        L_0x0011:
            r10.f30577i = r0     // Catch:{ all -> 0x0050 }
            r2 = 1
            if (r0 == r2) goto L_0x004e
            if (r0 == 0) goto L_0x004e
            r2 = 8
            if (r0 != r2) goto L_0x001d
            goto L_0x004e
        L_0x001d:
            long r2 = r10.m33755a((int) r0)     // Catch:{ all -> 0x0050 }
            r10.f30580l = r2     // Catch:{ all -> 0x0050 }
            com.yandex.mobile.ads.impl.jf r0 = r10.f30573e     // Catch:{ all -> 0x0050 }
            long r2 = r0.mo67515b()     // Catch:{ all -> 0x0050 }
            int r0 = r10.f30574f     // Catch:{ all -> 0x0050 }
            if (r0 <= 0) goto L_0x0034
            long r0 = r10.f30575g     // Catch:{ all -> 0x0050 }
            long r0 = r2 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x0050 }
            r5 = r1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            long r6 = r10.f30576h     // Catch:{ all -> 0x0050 }
            long r8 = r10.f30580l     // Catch:{ all -> 0x0050 }
            r4 = r10
            r4.m33757a((int) r5, (long) r6, (long) r8)     // Catch:{ all -> 0x0050 }
            r10.f30575g = r2     // Catch:{ all -> 0x0050 }
            r0 = 0
            r10.f30576h = r0     // Catch:{ all -> 0x0050 }
            r10.f30579k = r0     // Catch:{ all -> 0x0050 }
            r10.f30578j = r0     // Catch:{ all -> 0x0050 }
            com.yandex.mobile.ads.impl.r91 r0 = r10.f30572d     // Catch:{ all -> 0x0050 }
            r0.mo69708a()     // Catch:{ all -> 0x0050 }
            monitor-exit(r10)
            goto L_0x004f
        L_0x004e:
            monitor-exit(r10)
        L_0x004f:
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12390ak.m33759a(com.yandex.mobile.ads.impl.ak):void");
    }

    /* renamed from: a */
    public af1 mo65788a() {
        return this;
    }

    /* renamed from: b */
    public synchronized void mo65749b(C13325hj hjVar, C13504jj jjVar, boolean z) {
        if (z) {
            if (this.f30574f == 0) {
                this.f30575g = this.f30573e.mo67515b();
            }
            this.f30574f++;
        }
    }

    /* renamed from: c */
    public void mo65750c(C13325hj hjVar, C13504jj jjVar, boolean z) {
    }

    @Deprecated
    public C12390ak() {
        this((Context) null, new SparseArray(), 2000, C13493jf.f35273a, false);
    }

    private C12390ak(Context context, SparseArray<Long> sparseArray, int i, C13493jf jfVar, boolean z) {
        Context context2;
        int i2;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f30569a = context2;
        this.f30570b = sparseArray;
        this.f30571c = new a40<>();
        this.f30572d = new r91(i);
        this.f30573e = jfVar;
        if (context == null) {
            i2 = 0;
        } else {
            i2 = ih1.m37392c(context);
        }
        this.f30577i = i2;
        this.f30580l = m33755a(i2);
        if (context != null && z) {
            C12393c.m33770a(context).mo65792b(this);
        }
    }

    /* renamed from: b */
    private static Map<String, int[]> m33760b() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{0, 2, 0, 0});
        hashMap.put("AE", new int[]{2, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{4, 2, 2, 3});
        hashMap.put("AI", new int[]{0, 3, 2, 4});
        hashMap.put("AL", new int[]{1, 2, 0, 1});
        hashMap.put("AM", new int[]{2, 2, 1, 2});
        hashMap.put("AO", new int[]{3, 4, 3, 1});
        hashMap.put("AQ", new int[]{4, 2, 2, 2});
        hashMap.put("AR", new int[]{2, 3, 1, 2});
        hashMap.put("AS", new int[]{2, 2, 4, 2});
        hashMap.put("AT", new int[]{0, 3, 0, 0});
        hashMap.put("AU", new int[]{0, 2, 0, 1});
        hashMap.put("AW", new int[]{1, 1, 2, 4});
        hashMap.put("AX", new int[]{0, 1, 0, 0});
        hashMap.put("AZ", new int[]{3, 3, 3, 3});
        hashMap.put("BA", new int[]{1, 1, 0, 1});
        hashMap.put("BB", new int[]{0, 3, 0, 0});
        hashMap.put("BD", new int[]{2, 0, 4, 3});
        hashMap.put("BE", new int[]{0, 1, 2, 3});
        hashMap.put("BF", new int[]{4, 4, 4, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{1, 0, 3, 4});
        hashMap.put("BI", new int[]{4, 4, 4, 4});
        hashMap.put("BJ", new int[]{4, 4, 3, 4});
        hashMap.put("BL", new int[]{1, 0, 4, 3});
        hashMap.put("BM", new int[]{0, 1, 0, 0});
        hashMap.put("BN", new int[]{4, 0, 2, 4});
        hashMap.put("BO", new int[]{1, 3, 3, 3});
        hashMap.put("BQ", new int[]{1, 0, 1, 0});
        hashMap.put("BR", new int[]{2, 4, 3, 1});
        hashMap.put("BS", new int[]{3, 1, 1, 3});
        hashMap.put("BT", new int[]{3, 0, 3, 1});
        hashMap.put("BW", new int[]{3, 4, 3, 3});
        hashMap.put("BY", new int[]{0, 1, 1, 1});
        hashMap.put("BZ", new int[]{1, 3, 2, 1});
        hashMap.put("CA", new int[]{0, 3, 2, 2});
        hashMap.put("CD", new int[]{3, 4, 2, 2});
        hashMap.put("CF", new int[]{4, 3, 2, 2});
        hashMap.put("CG", new int[]{3, 4, 1, 1});
        hashMap.put("CH", new int[]{0, 0, 0, 0});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 0, 1, 0});
        hashMap.put("CL", new int[]{1, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 3, 2});
        hashMap.put("CN", new int[]{1, 0, 1, 1});
        hashMap.put("CO", new int[]{2, 3, 3, 2});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 2, 1});
        hashMap.put("CV", new int[]{2, 3, 3, 2});
        hashMap.put("CW", new int[]{1, 1, 0, 0});
        hashMap.put("CY", new int[]{1, 1, 0, 0});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 1, 2, 3});
        hashMap.put("DJ", new int[]{4, 2, 4, 4});
        hashMap.put("DK", new int[]{0, 0, 1, 0});
        hashMap.put("DM", new int[]{1, 1, 0, 2});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 3, 4, 2});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 1});
        hashMap.put("EH", new int[]{2, 0, 3, 1});
        hashMap.put("ER", new int[]{4, 2, 4, 4});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 1});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 0, 4, 4});
        hashMap.put("FK", new int[]{2, 2, 2, 1});
        hashMap.put("FM", new int[]{3, 2, 4, 1});
        hashMap.put("FO", new int[]{1, 1, 0, 0});
        hashMap.put("FR", new int[]{1, 1, 1, 1});
        hashMap.put("GA", new int[]{3, 2, 2, 2});
        hashMap.put("GB", new int[]{0, 1, 1, 1});
        hashMap.put("GD", new int[]{1, 1, 3, 1});
        hashMap.put("GE", new int[]{1, 0, 1, 4});
        hashMap.put("GF", new int[]{2, 0, 1, 3});
        hashMap.put("GG", new int[]{1, 0, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 3, 3});
        hashMap.put("GI", new int[]{4, 4, 0, 0});
        hashMap.put("GL", new int[]{2, 1, 1, 2});
        hashMap.put("GM", new int[]{4, 3, 2, 4});
        hashMap.put("GN", new int[]{3, 4, 4, 2});
        hashMap.put("GP", new int[]{2, 1, 3, 4});
        hashMap.put("GQ", new int[]{4, 4, 4, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 2, 2, 2});
        hashMap.put("GU", new int[]{1, 0, 2, 2});
        hashMap.put("GW", new int[]{3, 4, 4, 3});
        hashMap.put("GY", new int[]{3, 2, 1, 1});
        hashMap.put("HK", new int[]{0, 2, 3, 4});
        hashMap.put("HN", new int[]{3, 1, 3, 3});
        hashMap.put("HR", new int[]{1, 1, 0, 1});
        hashMap.put("HT", new int[]{4, 4, 4, 4});
        hashMap.put("HU", new int[]{0, 1, 0, 0});
        hashMap.put("ID", new int[]{2, 2, 2, 3});
        hashMap.put("IE", new int[]{1, 0, 1, 1});
        hashMap.put("IL", new int[]{1, 0, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 3});
        hashMap.put("IO", new int[]{4, 4, 2, 3});
        hashMap.put("IQ", new int[]{3, 3, 4, 2});
        hashMap.put("IR", new int[]{3, 0, 2, 1});
        hashMap.put(IronSourceConstants.INTERSTITIAL_EVENT_TYPE, new int[]{0, 1, 0, 0});
        hashMap.put("IT", new int[]{1, 1, 1, 2});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 3, 3, 4});
        hashMap.put("JO", new int[]{1, 2, 1, 1});
        hashMap.put("JP", new int[]{0, 2, 0, 0});
        hashMap.put("KE", new int[]{3, 4, 3, 3});
        hashMap.put(ExpandedProductParsedResult.KILOGRAM, new int[]{2, 0, 2, 2});
        hashMap.put("KH", new int[]{1, 0, 4, 3});
        hashMap.put("KI", new int[]{4, 4, 4, 0});
        hashMap.put("KM", new int[]{4, 3, 2, 4});
        hashMap.put("KN", new int[]{1, 0, 2, 4});
        hashMap.put("KP", new int[]{4, 2, 0, 2});
        hashMap.put("KR", new int[]{0, 1, 0, 1});
        hashMap.put("KW", new int[]{2, 3, 1, 2});
        hashMap.put("KY", new int[]{3, 1, 2, 3});
        hashMap.put("KZ", new int[]{1, 2, 2, 2});
        hashMap.put("LA", new int[]{2, 2, 1, 1});
        hashMap.put(ExpandedProductParsedResult.POUND, new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{1, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 1, 1});
        hashMap.put("LK", new int[]{2, 0, 2, 3});
        hashMap.put("LR", new int[]{3, 4, 4, 2});
        hashMap.put("LS", new int[]{3, 3, 2, 2});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 0, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{3, 3, 4, 3});
        hashMap.put("MA", new int[]{3, 2, 3, 2});
        hashMap.put("MC", new int[]{0, 4, 0, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 3, 1, 2});
        hashMap.put("MF", new int[]{2, 3, 1, 1});
        hashMap.put("MG", new int[]{3, 4, 2, 3});
        hashMap.put("MH", new int[]{4, 0, 2, 4});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 2, 0});
        hashMap.put("MM", new int[]{3, 3, 2, 2});
        hashMap.put("MN", new int[]{2, 3, 1, 1});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 1, 2});
        hashMap.put("MQ", new int[]{2, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 2, 4, 4});
        hashMap.put("MS", new int[]{1, 4, 3, 4});
        hashMap.put("MT", new int[]{0, 0, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 4, 4});
        hashMap.put("MV", new int[]{4, 3, 2, 4});
        hashMap.put("MW", new int[]{3, 1, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 3});
        hashMap.put("MY", new int[]{2, 1, 3, 3});
        hashMap.put("MZ", new int[]{3, 3, 3, 3});
        hashMap.put("NA", new int[]{4, 3, 3, 3});
        hashMap.put("NC", new int[]{2, 0, 4, 4});
        hashMap.put("NE", new int[]{4, 4, 4, 4});
        hashMap.put("NF", new int[]{1, 2, 2, 0});
        hashMap.put("NG", new int[]{3, 3, 2, 2});
        hashMap.put("NI", new int[]{3, 2, 4, 3});
        hashMap.put("NL", new int[]{0, 2, 3, 2});
        hashMap.put("NO", new int[]{0, 2, 1, 0});
        hashMap.put("NP", new int[]{2, 2, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 3, 2});
        hashMap.put("NZ", new int[]{0, 0, 1, 2});
        hashMap.put("OM", new int[]{2, 3, 0, 2});
        hashMap.put("PA", new int[]{1, 3, 3, 3});
        hashMap.put("PE", new int[]{2, 4, 4, 4});
        hashMap.put("PF", new int[]{2, 1, 1, 1});
        hashMap.put("PG", new int[]{4, 3, 3, 2});
        hashMap.put("PH", new int[]{3, 0, 3, 4});
        hashMap.put("PK", new int[]{3, 2, 3, 2});
        hashMap.put("PL", new int[]{1, 0, 1, 2});
        hashMap.put("PM", new int[]{0, 2, 2, 0});
        hashMap.put("PR", new int[]{2, 2, 2, 2});
        hashMap.put("PS", new int[]{3, 3, 1, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 0});
        hashMap.put("PW", new int[]{1, 1, 3, 0});
        hashMap.put("PY", new int[]{2, 0, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 1, 1});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 0, 1});
        hashMap.put("RW", new int[]{4, 4, 4, 4});
        hashMap.put("SA", new int[]{2, 2, 2, 1});
        hashMap.put("SB", new int[]{4, 4, 4, 1});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 4});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{1, 0, 3, 3});
        hashMap.put("SH", new int[]{4, 2, 2, 2});
        hashMap.put("SI", new int[]{0, 1, 0, 0});
        hashMap.put("SJ", new int[]{2, 2, 2, 4});
        hashMap.put("SK", new int[]{0, 1, 0, 0});
        hashMap.put("SL", new int[]{4, 3, 3, 1});
        hashMap.put("SM", new int[]{0, 0, 1, 2});
        hashMap.put("SN", new int[]{4, 4, 4, 3});
        hashMap.put("SO", new int[]{3, 4, 3, 4});
        hashMap.put("SR", new int[]{2, 2, 2, 1});
        hashMap.put("SS", new int[]{4, 4, 4, 4});
        hashMap.put("ST", new int[]{2, 3, 1, 2});
        hashMap.put("SV", new int[]{2, 2, 4, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 3, 1, 1});
        hashMap.put("SZ", new int[]{4, 4, 3, 4});
        hashMap.put("TC", new int[]{1, 2, 1, 0});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 2, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 3, 3});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 2, 2, 2});
        hashMap.put("TN", new int[]{2, 1, 1, 1});
        hashMap.put("TO", new int[]{4, 3, 4, 4});
        hashMap.put("TR", new int[]{1, 2, 1, 1});
        hashMap.put("TT", new int[]{1, 3, 2, 4});
        hashMap.put("TV", new int[]{4, 2, 3, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 0});
        hashMap.put("TZ", new int[]{3, 4, 3, 3});
        hashMap.put("UA", new int[]{0, 3, 1, 1});
        hashMap.put("UG", new int[]{3, 2, 2, 3});
        hashMap.put("US", new int[]{0, 1, 2, 2});
        hashMap.put("UY", new int[]{2, 1, 2, 2});
        hashMap.put("UZ", new int[]{2, 2, 3, 2});
        hashMap.put("VA", new int[]{0, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 3, 0, 2});
        hashMap.put("VE", new int[]{4, 4, 4, 4});
        hashMap.put("VG", new int[]{3, 1, 2, 4});
        hashMap.put("VI", new int[]{1, 4, 4, 3});
        hashMap.put("VN", new int[]{0, 1, 3, 4});
        hashMap.put("VU", new int[]{4, 0, 3, 3});
        hashMap.put("WS", new int[]{3, 2, 4, 3});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 3});
        hashMap.put("YT", new int[]{2, 2, 2, 3});
        hashMap.put("ZA", new int[]{2, 3, 2, 2});
        hashMap.put("ZM", new int[]{3, 2, 3, 3});
        hashMap.put("ZW", new int[]{3, 3, 2, 3});
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ak$c */
    private static class C12393c extends BroadcastReceiver {

        /* renamed from: c */
        private static C12393c f30587c;

        /* renamed from: a */
        private final Handler f30588a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final ArrayList<WeakReference<C12390ak>> f30589b = new ArrayList<>();

        private C12393c() {
        }

        /* renamed from: a */
        public static synchronized C12393c m33770a(Context context) {
            C12393c cVar;
            synchronized (C12393c.class) {
                if (f30587c == null) {
                    f30587c = new C12393c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f30587c, intentFilter);
                }
                cVar = f30587c;
            }
            return cVar;
        }

        /* renamed from: b */
        public synchronized void mo65792b(C12390ak akVar) {
            m33771a();
            this.f30589b.add(new WeakReference(akVar));
            this.f30588a.post(new Runnable(akVar) {
                public final /* synthetic */ C12390ak f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C12390ak.C12393c.this.m33772a(this.f$1);
                }
            });
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                m33771a();
                for (int i = 0; i < this.f30589b.size(); i++) {
                    C12390ak akVar = (C12390ak) this.f30589b.get(i).get();
                    if (akVar != null) {
                        C12390ak.m33759a(akVar);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m33772a(C12390ak akVar) {
            C12390ak.m33759a(akVar);
        }

        /* renamed from: a */
        private void m33771a() {
            for (int size = this.f30589b.size() - 1; size >= 0; size--) {
                if (((C12390ak) this.f30589b.get(size).get()) == null) {
                    this.f30589b.remove(size);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized C12390ak m33756a(Context context) {
        C12390ak akVar;
        synchronized (C12390ak.class) {
            if (f30568s == null) {
                f30568s = new C12392b(context).mo65791a();
            }
            akVar = f30568s;
        }
        return akVar;
    }

    /* renamed from: a */
    public void mo65789a(Handler handler, C12579bb.C12580a aVar) {
        this.f30571c.mo65668a(handler, aVar);
    }

    /* renamed from: a */
    public void mo65790a(C12579bb.C12580a aVar) {
        this.f30571c.mo65670a(aVar);
    }

    /* renamed from: a */
    public synchronized void mo65748a(C13325hj hjVar, C13504jj jjVar, boolean z, int i) {
        if (z) {
            this.f30576h += (long) i;
        }
    }

    /* renamed from: a */
    public synchronized void mo65747a(C13325hj hjVar, C13504jj jjVar, boolean z) {
        if (z) {
            C13479j9.m37708b(this.f30574f > 0);
            long b = this.f30573e.mo67515b();
            int i = (int) (b - this.f30575g);
            this.f30578j += (long) i;
            long j = this.f30579k;
            long j2 = this.f30576h;
            this.f30579k = j + j2;
            if (i > 0) {
                this.f30572d.mo69709a((int) Math.sqrt((double) j2), (((float) j2) * 8000.0f) / ((float) i));
                if (this.f30578j >= 2000 || this.f30579k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.f30580l = (long) this.f30572d.mo69707a(0.5f);
                }
                m33757a(i, this.f30576h, this.f30580l);
                this.f30575g = b;
                this.f30576h = 0;
            }
            this.f30574f--;
        }
    }

    /* renamed from: a */
    private void m33757a(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f30581m) {
            this.f30581m = j2;
            this.f30571c.mo65669a(new a40.C12354a(i, j, j2) {
                public final /* synthetic */ int f$0;
                public final /* synthetic */ long f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r4;
                }

                /* renamed from: a */
                public final void mo64831a(Object obj) {
                    ((C13957m7) ((C12579bb.C12580a) obj)).mo68590b(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    private long m33755a(int i) {
        Long l = this.f30570b.get(i);
        if (l == null) {
            l = this.f30570b.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }
}

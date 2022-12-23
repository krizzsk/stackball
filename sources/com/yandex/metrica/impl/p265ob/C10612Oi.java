package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.IParamsCallback;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;

/* renamed from: com.yandex.metrica.impl.ob.Oi */
public final class C10612Oi {

    /* renamed from: a */
    private static final Set<String> f25353a = SetsKt.setOf(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid");

    /* renamed from: b */
    private static C10616Om f25354b = new C10580Nm();

    /* renamed from: c */
    private static C11719ri f25355c = new C11719ri();

    @JvmStatic
    /* renamed from: a */
    public static final boolean m27145a(long j) {
        return f25354b.mo61841b() > j;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m27149b(C10675Qi qi) {
        if (!qi.mo61989D()) {
            if (f25354b.mo61841b() > qi.mo61988C() + ((long) qi.mo62000O().mo62303a())) {
                return true;
            }
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m27146a(C10675Qi qi) {
        return m27148a(qi.mo62007V()) && m27148a(qi.mo62017i()) && m27148a(qi.mo62019k());
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m27148a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m27147a(com.yandex.metrica.impl.p265ob.C10675Qi r4, java.util.Collection<java.lang.String> r5, java.util.Map<java.lang.String, java.lang.String> r6, kotlin.jvm.functions.Function0<com.yandex.metrica.impl.p265ob.C10651Q> r7) {
        /*
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x000d
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            if (r2 == 0) goto L_0x0011
            return r1
        L_0x0011:
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L_0x001d
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x001d
            goto L_0x00a7
        L_0x001d:
            java.util.Iterator r5 = r5.iterator()
        L_0x0021:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            switch(r3) {
                case -220514361: goto L_0x008e;
                case 299713912: goto L_0x007d;
                case 530390881: goto L_0x006c;
                case 538565458: goto L_0x0057;
                case 1541938616: goto L_0x0046;
                case 1630523545: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009f
        L_0x0035:
            java.lang.String r3 = "yandex_mobile_metrica_get_ad_url"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r4.mo62025q()
            boolean r2 = m27148a((java.lang.String) r2)
            goto L_0x00a4
        L_0x0046:
            java.lang.String r3 = "yandex_mobile_metrica_uuid"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r4.mo62007V()
            boolean r2 = m27148a((java.lang.String) r2)
            goto L_0x00a4
        L_0x0057:
            java.lang.String r3 = "yandex_mobile_metrica_clids"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009f
            com.yandex.metrica.impl.ob.ri r2 = f25355c
            java.lang.Object r3 = r7.invoke()
            com.yandex.metrica.impl.ob.Q r3 = (com.yandex.metrica.impl.p265ob.C10651Q) r3
            boolean r2 = r2.mo63604a(r6, r4, r3)
            goto L_0x00a4
        L_0x006c:
            java.lang.String r3 = "yandex_mobile_metrica_report_ad_url"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r4.mo61992G()
            boolean r2 = m27148a((java.lang.String) r2)
            goto L_0x00a4
        L_0x007d:
            java.lang.String r3 = "appmetrica_device_id_hash"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r4.mo62019k()
            boolean r2 = m27148a((java.lang.String) r2)
            goto L_0x00a4
        L_0x008e:
            java.lang.String r3 = "yandex_mobile_metrica_device_id"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r4.mo62017i()
            boolean r2 = m27148a((java.lang.String) r2)
            goto L_0x00a4
        L_0x009f:
            boolean r2 = m27149b(r4)
            r2 = r2 ^ r1
        L_0x00a4:
            if (r2 != 0) goto L_0x0021
            goto L_0x00a8
        L_0x00a7:
            r0 = 1
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10612Oi.m27147a(com.yandex.metrica.impl.ob.Qi, java.util.Collection, java.util.Map, kotlin.jvm.functions.Function0):boolean");
    }

    @JvmStatic
    /* renamed from: a */
    public static final Collection<String> m27144a(Collection<String> collection) {
        return CollectionsKt.intersect(collection, f25353a);
    }
}

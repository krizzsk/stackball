package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.yandex.mobile.ads.impl.lz0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;

public final class yb0 {

    /* renamed from: a */
    private static final ByteString f42802a = ByteString.Companion.encodeUtf8("\"\\");

    /* renamed from: b */
    private static final ByteString f42803b = ByteString.Companion.encodeUtf8("\t ,=");

    /* renamed from: a */
    public static final List<C14753ue> m44240a(q90 q90, String str) {
        Intrinsics.checkNotNullParameter(q90, "<this>");
        Intrinsics.checkNotNullParameter(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = q90.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (StringsKt.equals(str, q90.mo69509a(i), true)) {
                    try {
                        m44242a(new Buffer().writeUtf8(q90.mo69511b(i)), (List<C14753ue>) arrayList);
                    } catch (EOFException e) {
                        lz0.C13944a aVar = lz0.f37135a;
                        lz0.f37136b.mo68534a("Unable to parse challenge", 5, (Throwable) e);
                    }
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static final boolean m44244b(Buffer buffer) {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte b = buffer.getByte(0);
            if (b != 44) {
                if (!(b == 32 || b == 9)) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
        r8 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m44242a(okio.Buffer r19, java.util.List<com.yandex.mobile.ads.impl.C14753ue> r20) throws java.io.EOFException {
        /*
            r0 = r19
            r1 = r20
            r2 = 0
        L_0x0005:
            r3 = r2
        L_0x0006:
            if (r3 != 0) goto L_0x0012
            m44244b(r19)
            java.lang.String r3 = m44239a((okio.Buffer) r19)
            if (r3 != 0) goto L_0x0012
            return
        L_0x0012:
            boolean r4 = m44244b(r19)
            java.lang.String r5 = m44239a((okio.Buffer) r19)
            if (r5 != 0) goto L_0x0030
            boolean r0 = r19.exhausted()
            if (r0 != 0) goto L_0x0023
            return
        L_0x0023:
            com.yandex.mobile.ads.impl.ue r0 = new com.yandex.mobile.ads.impl.ue
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            r0.<init>(r3, r2)
            r1.add(r0)
            return
        L_0x0030:
            r6 = 61
            int r7 = com.yandex.mobile.ads.impl.jh1.m37813a((okio.Buffer) r0, (byte) r6)
            boolean r8 = m44244b(r19)
            if (r4 != 0) goto L_0x0060
            if (r8 != 0) goto L_0x0044
            boolean r4 = r19.exhausted()
            if (r4 == 0) goto L_0x0060
        L_0x0044:
            com.yandex.mobile.ads.impl.ue r4 = new com.yandex.mobile.ads.impl.ue
            java.lang.String r6 = "="
            java.lang.String r6 = kotlin.text.StringsKt.repeat(r6, r7)
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r6)
            java.util.Map r5 = java.util.Collections.singletonMap(r2, r5)
            java.lang.String r6 = "singletonMap<String, String>(null, peek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r4.<init>(r3, r5)
            r1.add(r4)
            goto L_0x0005
        L_0x0060:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            int r8 = com.yandex.mobile.ads.impl.jh1.m37813a((okio.Buffer) r0, (byte) r6)
            int r7 = r7 + r8
        L_0x006a:
            if (r5 != 0) goto L_0x007b
            java.lang.String r5 = m44239a((okio.Buffer) r19)
            boolean r7 = m44244b(r19)
            if (r7 == 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            int r7 = com.yandex.mobile.ads.impl.jh1.m37813a((okio.Buffer) r0, (byte) r6)
        L_0x007b:
            if (r7 != 0) goto L_0x0088
        L_0x007d:
            com.yandex.mobile.ads.impl.ue r6 = new com.yandex.mobile.ads.impl.ue
            r6.<init>(r3, r4)
            r1.add(r6)
            r3 = r5
            goto L_0x0006
        L_0x0088:
            r8 = 1
            if (r7 <= r8) goto L_0x008c
            return
        L_0x008c:
            boolean r9 = m44244b(r19)
            if (r9 == 0) goto L_0x0093
            return
        L_0x0093:
            boolean r9 = r19.exhausted()
            r10 = 0
            r11 = 34
            if (r9 != 0) goto L_0x00a6
            r12 = 0
            byte r9 = r0.getByte(r12)
            if (r9 != r11) goto L_0x00a6
            r9 = 1
            goto L_0x00a7
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            if (r9 == 0) goto L_0x00fa
            byte r9 = r19.readByte()
            if (r9 != r11) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00ee
            okio.Buffer r8 = new okio.Buffer
            r8.<init>()
        L_0x00b8:
            okio.ByteString r9 = f42802a
            long r9 = r0.indexOfElement(r9)
            r12 = -1
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00c5
            goto L_0x00e2
        L_0x00c5:
            byte r12 = r0.getByte(r9)
            if (r12 != r11) goto L_0x00d6
            r8.write((okio.Buffer) r0, (long) r9)
            r19.readByte()
            java.lang.String r8 = r8.readUtf8()
            goto L_0x00fe
        L_0x00d6:
            long r12 = r19.size()
            r14 = 1
            long r16 = r9 + r14
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x00e4
        L_0x00e2:
            r8 = r2
            goto L_0x00fe
        L_0x00e4:
            r8.write((okio.Buffer) r0, (long) r9)
            r19.readByte()
            r8.write((okio.Buffer) r0, (long) r14)
            goto L_0x00b8
        L_0x00ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.String r8 = m44239a((okio.Buffer) r19)
        L_0x00fe:
            if (r8 != 0) goto L_0x0101
            return
        L_0x0101:
            java.lang.Object r5 = r4.put(r5, r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x010a
            return
        L_0x010a:
            boolean r5 = m44244b(r19)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r19.exhausted()
            if (r5 != 0) goto L_0x0117
            return
        L_0x0117:
            r5 = r2
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yb0.m44242a(okio.Buffer, java.util.List):void");
    }

    /* renamed from: a */
    private static final String m44239a(Buffer buffer) {
        long indexOfElement = buffer.indexOfElement(f42803b);
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        if (indexOfElement != 0) {
            return buffer.readUtf8(indexOfElement);
        }
        return null;
    }

    /* renamed from: a */
    public static final void m44241a(C12979ei eiVar, fc0 fc0, q90 q90) {
        Intrinsics.checkNotNullParameter(eiVar, "<this>");
        Intrinsics.checkNotNullParameter(fc0, "url");
        Intrinsics.checkNotNullParameter(q90, "headers");
        if (eiVar != C12979ei.f32984a) {
            List<C12739ci> a = C12739ci.f31927j.mo66307a(fc0, q90);
            if (!a.isEmpty()) {
                eiVar.mo66588a(fc0, a);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m44243a(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, "<this>");
        if (Intrinsics.areEqual((Object) b51.mo65988o().mo68567f(), (Object) VersionInfo.GIT_BRANCH)) {
            return false;
        }
        int f = b51.mo65979f();
        if (((f >= 100 && f < 200) || f == 204 || f == 304) && jh1.m37815a(b51) == -1 && !StringsKt.equals("chunked", b51.m34138a(b51, HttpHeaders.TRANSFER_ENCODING, (String) null, 2), true)) {
            return false;
        }
        return true;
    }
}

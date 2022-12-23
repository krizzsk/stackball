package com.yandex.mobile.ads.impl;

import com.google.common.base.Ascii;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

public final class gc0 {

    /* renamed from: a */
    public static final gc0 f33930a = new gc0();

    /* renamed from: b */
    private static final int[] f33931b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c */
    private static final byte[] f33932c = {Ascii.f10100CR, Ascii.ETB, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.CAN, Ascii.f10108RS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10108RS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10108RS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, Ascii.f10103FS, 6, 10, 10, Ascii.f10102FF, Ascii.f10100CR, 6, 8, Ascii.f10113VT, 10, 10, 8, Ascii.f10113VT, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, Ascii.f10109SI, 6, Ascii.f10102FF, 10, Ascii.f10100CR, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, Ascii.f10100CR, 19, Ascii.f10100CR, Ascii.f10110SO, 6, Ascii.f10109SI, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, Ascii.f10109SI, Ascii.f10113VT, Ascii.f10110SO, Ascii.f10100CR, Ascii.f10103FS, Ascii.DC4, Ascii.SYN, Ascii.DC4, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.SYN, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.SUB, Ascii.DC4, 19, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.f10101EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.CAN, Ascii.f10101EM, 19, Ascii.NAK, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.NAK, Ascii.NAK, Ascii.SUB, Ascii.SUB, Ascii.f10103FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.DC4, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.f10101EM, Ascii.f10101EM, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.ESC, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.f10103FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.SUB};

    /* renamed from: d */
    private static final C13190a f33933d = new C13190a();

    static {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            f33930a.m36526a(i, f33931b[i], (int) f33932c[i]);
            if (i2 <= 255) {
                i = i2;
            } else {
                return;
            }
        }
    }

    private gc0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67232a(okio.ByteString r9, okio.BufferedSink r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x003e
            r3 = r2
            r2 = 0
        L_0x0015:
            int r5 = r2 + 1
            byte r2 = r9.getByte(r2)
            byte[] r6 = com.yandex.mobile.ads.impl.jh1.f35305a
            r2 = r2 & 255(0xff, float:3.57E-43)
            int[] r6 = f33931b
            r6 = r6[r2]
            byte[] r7 = f33932c
            byte r2 = r7[r2]
            long r3 = r3 << r2
            long r6 = (long) r6
            long r3 = r3 | r6
            int r1 = r1 + r2
        L_0x002b:
            r2 = 8
            if (r1 < r2) goto L_0x0038
            int r1 = r1 + -8
            long r6 = r3 >> r1
            int r2 = (int) r6
            r10.writeByte(r2)
            goto L_0x002b
        L_0x0038:
            if (r5 < r0) goto L_0x003c
            r2 = r3
            goto L_0x003e
        L_0x003c:
            r2 = r5
            goto L_0x0015
        L_0x003e:
            if (r1 <= 0) goto L_0x004c
            int r9 = 8 - r1
            long r2 = r2 << r9
            r4 = 255(0xff, double:1.26E-321)
            long r0 = r4 >>> r1
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.writeByte(r9)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gc0.mo67232a(okio.ByteString, okio.BufferedSink):void");
    }

    /* renamed from: com.yandex.mobile.ads.impl.gc0$a */
    private static final class C13190a {

        /* renamed from: a */
        private final C13190a[] f33934a;

        /* renamed from: b */
        private final int f33935b;

        /* renamed from: c */
        private final int f33936c;

        public C13190a() {
            this.f33934a = new C13190a[256];
            this.f33935b = 0;
            this.f33936c = 0;
        }

        /* renamed from: a */
        public final C13190a[] mo67233a() {
            return this.f33934a;
        }

        /* renamed from: b */
        public final int mo67234b() {
            return this.f33935b;
        }

        /* renamed from: c */
        public final int mo67235c() {
            return this.f33936c;
        }

        public C13190a(int i, int i2) {
            this.f33934a = null;
            this.f33935b = i;
            int i3 = i2 & 7;
            this.f33936c = i3 == 0 ? 8 : i3;
        }
    }

    /* renamed from: a */
    public final int mo67230a(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        int size = byteString.size();
        long j = 0;
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                byte b = byteString.getByte(i);
                byte[] bArr = jh1.f35305a;
                j += (long) f33932c[b & 255];
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return (int) ((j + ((long) 7)) >> 3);
    }

    /* renamed from: a */
    public final void mo67231a(BufferedSource bufferedSource, long j, BufferedSink bufferedSink) {
        int i;
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        Intrinsics.checkNotNullParameter(bufferedSink, "sink");
        C13190a aVar = f33933d;
        byte b = 0;
        if (0 < j) {
            long j2 = 0;
            int i2 = 0;
            do {
                j2++;
                byte readByte = bufferedSource.readByte();
                byte[] bArr = jh1.f35305a;
                b = (b << 8) | (readByte & 255);
                i2 += 8;
                while (i2 >= 8) {
                    C13190a[] a = aVar.mo67233a();
                    Intrinsics.checkNotNull(a);
                    aVar = a[(b >>> (i2 - 8)) & 255];
                    Intrinsics.checkNotNull(aVar);
                    if (aVar.mo67233a() == null) {
                        bufferedSink.writeByte(aVar.mo67234b());
                        i2 -= aVar.mo67235c();
                        aVar = f33933d;
                    } else {
                        i2 -= 8;
                    }
                }
            } while (j2 < j);
            i = b;
            b = i2;
        } else {
            i = 0;
        }
        while (b > 0) {
            C13190a[] a2 = aVar.mo67233a();
            Intrinsics.checkNotNull(a2);
            C13190a aVar2 = a2[(i << (8 - b)) & 255];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.mo67233a() == null && aVar2.mo67235c() <= b) {
                bufferedSink.writeByte(aVar2.mo67234b());
                b -= aVar2.mo67235c();
                aVar = f33933d;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m36526a(int i, int i2, int i3) {
        C13190a aVar = new C13190a(i, i3);
        C13190a aVar2 = f33933d;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            C13190a[] a = aVar2.mo67233a();
            Intrinsics.checkNotNull(a);
            C13190a aVar3 = a[i4];
            if (aVar3 == null) {
                aVar3 = new C13190a();
                a[i4] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        C13190a[] a2 = aVar2.mo67233a();
        Intrinsics.checkNotNull(a2);
        ArraysKt.fill((T[]) a2, aVar, i6, (1 << i5) + i6);
    }
}

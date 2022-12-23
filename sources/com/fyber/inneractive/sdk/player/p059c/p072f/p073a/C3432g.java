package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.android.exoplayer2.C3716C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.g */
public final class C3432g {

    /* renamed from: a */
    public static final int f9275a = C3560t.m8893e("ID3");

    /* renamed from: b */
    public final C3433a f9276b;

    /* renamed from: com.fyber.inneractive.sdk.player.c.f.a.g$a */
    public interface C3433a {
        /* renamed from: a */
        boolean mo19061a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: a */
    private static String m8537a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C3716C.ISO88591_NAME : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: b */
    private static int m8540b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public C3432g() {
        this((C3433a) null);
    }

    public C3432g(C3433a aVar) {
        this.f9276b = aVar;
    }

    /* renamed from: a */
    public static C3434b m8535a(C3548k kVar) {
        if (kVar.mo19383b() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int g = kVar.mo19393g();
        if (g != f9275a) {
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + g);
            return null;
        }
        int d = kVar.mo19387d();
        boolean z = true;
        kVar.mo19388d(1);
        int d2 = kVar.mo19387d();
        int m = kVar.mo19399m();
        if (d == 2) {
            if ((d2 & 64) != 0) {
                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (d == 3) {
            if ((d2 & 64) != 0) {
                int j = kVar.mo19396j();
                kVar.mo19388d(j);
                m -= j + 4;
            }
        } else if (d == 4) {
            if ((d2 & 64) != 0) {
                int m2 = kVar.mo19399m();
                kVar.mo19388d(m2 - 4);
                m -= m2;
            }
            if ((d2 & 16) != 0) {
                m -= 10;
            }
        } else {
            Log.w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + d);
            return null;
        }
        if (d >= 4 || (d2 & 128) == 0) {
            z = false;
        }
        return new C3434b(d, z, m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x028f, code lost:
        if (r13 == 67) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03da, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03ba A[Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03da A[ExcHandler: all (th java.lang.Throwable), PHI: r7 r19 
      PHI: (r7v5 com.fyber.inneractive.sdk.player.c.k.k) = (r7v6 com.fyber.inneractive.sdk.player.c.k.k), (r7v6 com.fyber.inneractive.sdk.player.c.k.k), (r7v14 com.fyber.inneractive.sdk.player.c.k.k), (r7v16 com.fyber.inneractive.sdk.player.c.k.k), (r7v16 com.fyber.inneractive.sdk.player.c.k.k) binds: [B:216:0x03d6, B:217:?, B:193:0x033f, B:172:0x02e0, B:162:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v2 int) = (r19v3 int), (r19v3 int), (r19v8 int), (r19v8 int), (r19v8 int) binds: [B:216:0x03d6, B:217:?, B:193:0x033f, B:172:0x02e0, B:162:0x02a5] A[DONT_GENERATE, DONT_INLINE], Splitter:B:162:0x02a5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3435h m8536a(int r20, com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r21, boolean r22, int r23, com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.C3433a r24) {
        /*
            r0 = r20
            r7 = r21
            int r8 = r21.mo19387d()
            int r9 = r21.mo19387d()
            int r10 = r21.mo19387d()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r21.mo19387d()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r21.mo19400n()
            if (r22 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r21.mo19400n()
            goto L_0x003a
        L_0x0043:
            int r1 = r21.mo19393g()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r21.mo19389e()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r5 = 0
            if (r8 != 0) goto L_0x0064
            if (r9 != 0) goto L_0x0064
            if (r10 != 0) goto L_0x0064
            if (r13 != 0) goto L_0x0064
            if (r15 != 0) goto L_0x0064
            if (r6 != 0) goto L_0x0064
            int r0 = r7.f9627c
            r7.mo19386c(r0)
            return r5
        L_0x0064:
            int r1 = r7.f9626b
            int r4 = r1 + r15
            int r1 = r7.f9627c
            java.lang.String r3 = "Id3Decoder"
            if (r4 <= r1) goto L_0x0079
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r3, r0)
            int r0 = r7.f9627c
            r7.mo19386c(r0)
            return r5
        L_0x0079:
            if (r24 == 0) goto L_0x0093
            r1 = r24
            r2 = r20
            r16 = r3
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r17 = r6
            r6 = r13
            boolean r1 = r1.mo19061a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0099
            r7.mo19386c(r12)
            return r14
        L_0x0093:
            r16 = r3
            r12 = r4
            r14 = r5
            r17 = r6
        L_0x0099:
            r1 = 1
            if (r0 != r11) goto L_0x00b7
            r2 = r17
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a4
            r3 = 1
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00ab
            r4 = 1
            goto L_0x00ac
        L_0x00ab:
            r4 = 0
        L_0x00ac:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b2
            r2 = 1
            goto L_0x00b3
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            r5 = r4
            r6 = 0
            r4 = r3
            goto L_0x00e6
        L_0x00b7:
            r2 = r17
            r3 = 4
            if (r0 != r3) goto L_0x00e1
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c2
            r3 = 1
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x00c9:
            r4 = 0
        L_0x00ca:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d0
            r5 = 1
            goto L_0x00d1
        L_0x00d0:
            r5 = 0
        L_0x00d1:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00d7
            r6 = 1
            goto L_0x00d8
        L_0x00d7:
            r6 = 0
        L_0x00d8:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00de
            r2 = r3
            r3 = 1
            goto L_0x00e6
        L_0x00de:
            r2 = r3
            r3 = 0
            goto L_0x00e6
        L_0x00e1:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x00e6:
            if (r4 != 0) goto L_0x03f8
            if (r5 == 0) goto L_0x00ec
            goto L_0x03f8
        L_0x00ec:
            if (r2 == 0) goto L_0x00f3
            int r15 = r15 + -1
            r7.mo19388d(r1)
        L_0x00f3:
            if (r3 == 0) goto L_0x00fb
            int r15 = r15 + -4
            r2 = 4
            r7.mo19388d(r2)
        L_0x00fb:
            if (r6 == 0) goto L_0x0101
            int r15 = m8531a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r7, (int) r15)
        L_0x0101:
            java.lang.String r2 = ""
            r3 = 84
            r4 = 88
            r5 = 2
            if (r8 != r3) goto L_0x0148
            if (r9 != r4) goto L_0x0148
            if (r10 != r4) goto L_0x0148
            if (r0 == r5) goto L_0x0112
            if (r13 != r4) goto L_0x0148
        L_0x0112:
            if (r15 > 0) goto L_0x0116
            r5 = r14
            goto L_0x0171
        L_0x0116:
            int r1 = r21.mo19387d()     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r3 = m8537a((int) r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r4 = r15 + -1
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r6 = 0
            r7.mo19382a(r5, r6, r4)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r11 = m8533a(r5, r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r14.<init>(r5, r6, r11, r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r6 = m8540b(r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r11 = r11 + r6
            if (r11 >= r4) goto L_0x0140
            int r1 = m8533a(r5, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r1 = r1 - r11
            r2.<init>(r5, r11, r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
        L_0x0140:
            com.fyber.inneractive.sdk.player.c.f.a.j r5 = new com.fyber.inneractive.sdk.player.c.f.a.j     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r1 = "TXXX"
            r5.<init>(r1, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            goto L_0x0171
        L_0x0148:
            if (r8 != r3) goto L_0x017e
            java.lang.String r1 = m8538a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            if (r15 > 0) goto L_0x0152
        L_0x0150:
            r5 = 0
            goto L_0x0171
        L_0x0152:
            int r2 = r21.mo19387d()     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r3 = m8537a((int) r2)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r4 = r15 + -1
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r6 = 0
            r7.mo19382a(r5, r6, r4)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r2 = m8533a(r5, r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r4 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r4.<init>(r5, r6, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            com.fyber.inneractive.sdk.player.c.f.a.j r5 = new com.fyber.inneractive.sdk.player.c.f.a.j     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r2 = 0
            r5.<init>(r1, r2, r4)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
        L_0x0171:
            r19 = r12
            goto L_0x03b8
        L_0x0175:
            r0 = move-exception
        L_0x0176:
            r2 = r12
            goto L_0x03f4
        L_0x0179:
            r2 = r12
            r1 = r16
            goto L_0x03e9
        L_0x017e:
            r6 = 87
            java.lang.String r14 = "ISO-8859-1"
            if (r8 != r6) goto L_0x01c6
            if (r9 != r4) goto L_0x01c6
            if (r10 != r4) goto L_0x01c6
            if (r0 == r5) goto L_0x018c
            if (r13 != r4) goto L_0x01c6
        L_0x018c:
            if (r15 > 0) goto L_0x018f
            goto L_0x0150
        L_0x018f:
            int r1 = r21.mo19387d()     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r3 = m8537a((int) r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r4 = r15 + -1
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r6 = 0
            r7.mo19382a(r5, r6, r4)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r11 = m8533a(r5, r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r18 = r2
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r2.<init>(r5, r6, r11, r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r1 = m8540b(r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r11 = r11 + r1
            if (r11 >= r4) goto L_0x01bc
            int r1 = m8532a((byte[]) r5, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r1 = r1 - r11
            r3.<init>(r5, r11, r1, r14)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            goto L_0x01be
        L_0x01bc:
            r3 = r18
        L_0x01be:
            com.fyber.inneractive.sdk.player.c.f.a.k r5 = new com.fyber.inneractive.sdk.player.c.f.a.k     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r1 = "WXXX"
            r5.<init>(r1, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            goto L_0x0171
        L_0x01c6:
            r18 = r2
            if (r8 != r6) goto L_0x01e5
            java.lang.String r1 = m8538a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r3 = 0
            r7.mo19382a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r4 = m8532a((byte[]) r2, (int) r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r5.<init>(r2, r3, r4, r14)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            com.fyber.inneractive.sdk.player.c.f.a.k r2 = new com.fyber.inneractive.sdk.player.c.f.a.k     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r3 = 0
            r2.<init>(r1, r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
        L_0x01e3:
            r5 = r2
            goto L_0x0171
        L_0x01e5:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0215
            r6 = 82
            if (r9 != r6) goto L_0x0215
            if (r10 != r2) goto L_0x0215
            r6 = 86
            if (r13 != r6) goto L_0x0215
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r3 = 0
            r7.mo19382a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r4 = m8532a((byte[]) r2, (int) r3)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r5.<init>(r2, r3, r4, r14)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            int r4 = r4 + r1
            if (r4 >= r15) goto L_0x020c
            byte[] r1 = java.util.Arrays.copyOfRange(r2, r4, r15)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            goto L_0x020f
        L_0x020c:
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
        L_0x020f:
            com.fyber.inneractive.sdk.player.c.f.a.i r2 = new com.fyber.inneractive.sdk.player.c.f.a.i     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            r2.<init>(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0179, all -> 0x0175 }
            goto L_0x01e3
        L_0x0215:
            r6 = 71
            r3 = 79
            if (r8 != r6) goto L_0x027a
            r6 = 69
            if (r9 != r6) goto L_0x027a
            if (r10 != r3) goto L_0x027a
            r6 = 66
            if (r13 == r6) goto L_0x0227
            if (r0 != r5) goto L_0x027a
        L_0x0227:
            int r2 = r21.mo19387d()     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            java.lang.String r3 = m8537a((int) r2)     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            int r4 = r15 + -1
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            r6 = 0
            r7.mo19382a(r5, r6, r4)     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            int r11 = m8532a((byte[]) r5, (int) r6)     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            r1.<init>(r5, r6, r11, r14)     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            r6 = 1
            int r11 = r11 + r6
            int r6 = m8533a(r5, r11, r2)     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0276, all -> 0x0271 }
            r19 = r12
            int r12 = r6 - r11
            r14.<init>(r5, r11, r12, r3)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r11 = m8540b(r2)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r6 = r6 + r11
            int r11 = m8533a(r5, r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r7 = r11 - r6
            r12.<init>(r5, r6, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r2 = m8540b(r2)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r11 = r11 + r2
            byte[] r2 = java.util.Arrays.copyOfRange(r5, r11, r4)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            com.fyber.inneractive.sdk.player.c.f.a.f r5 = new com.fyber.inneractive.sdk.player.c.f.a.f     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r5.<init>(r1, r14, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r7 = r21
            goto L_0x03b8
        L_0x0271:
            r0 = move-exception
            r7 = r21
            goto L_0x0176
        L_0x0276:
            r7 = r21
            goto L_0x0179
        L_0x027a:
            r19 = r12
            r1 = 65
            r6 = 67
            if (r0 != r5) goto L_0x0289
            if (r8 != r4) goto L_0x031d
            if (r9 != r2) goto L_0x031d
            if (r10 != r6) goto L_0x031d
            goto L_0x0291
        L_0x0289:
            if (r8 != r1) goto L_0x031d
            if (r9 != r4) goto L_0x031d
            if (r10 != r2) goto L_0x031d
            if (r13 != r6) goto L_0x031d
        L_0x0291:
            int r1 = r21.mo19387d()     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            java.lang.String r2 = m8537a((int) r1)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r3 = r15 + -1
            byte[] r4 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r7 = r21
            r6 = 0
            r7.mo19382a(r4, r6, r3)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            if (r0 != r5) goto L_0x02c9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r12 = "image/"
            r6.<init>(r12)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r5 = 0
            r12.<init>(r4, r5, r11, r14)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8892d(r12)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r6.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r5 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r6 = "image/jpg"
            boolean r6 = r5.equals(r6)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            if (r6 == 0) goto L_0x02c7
            java.lang.String r5 = "image/jpeg"
        L_0x02c7:
            r6 = 2
            goto L_0x02ee
        L_0x02c9:
            r5 = 0
            int r6 = m8532a((byte[]) r4, (int) r5)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r11.<init>(r4, r5, r6, r14)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            java.lang.String r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8892d(r11)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r11 = 47
            int r11 = r5.indexOf(r11)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r12 = -1
            if (r11 != r12) goto L_0x02ee
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r12 = "image/"
            r11.<init>(r12)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r11.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r5 = r11.toString()     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
        L_0x02ee:
            int r11 = r6 + 1
            byte r11 = r4[r11]     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 2
            int r6 = r6 + r12
            int r12 = m8533a(r4, r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r7 = r12 - r6
            r14.<init>(r4, r6, r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r1 = m8540b(r1)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            int r12 = r12 + r1
            byte[] r1 = java.util.Arrays.copyOfRange(r4, r12, r3)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            com.fyber.inneractive.sdk.player.c.f.a.a r2 = new com.fyber.inneractive.sdk.player.c.f.a.a     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r2.<init>(r5, r14, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r7 = r21
            r5 = r2
            goto L_0x03b8
        L_0x0314:
            r0 = move-exception
            r7 = r21
            goto L_0x03db
        L_0x0319:
            r7 = r21
            goto L_0x03de
        L_0x031d:
            if (r8 != r6) goto L_0x0373
            if (r9 != r3) goto L_0x0373
            r2 = 77
            if (r10 != r2) goto L_0x0373
            if (r13 == r2) goto L_0x032a
            r2 = 2
            if (r0 != r2) goto L_0x0373
        L_0x032a:
            r1 = 4
            if (r15 >= r1) goto L_0x0332
            r7 = r21
            r5 = 0
            goto L_0x03b8
        L_0x0332:
            int r1 = r21.mo19387d()     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            java.lang.String r2 = m8537a((int) r1)     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0319, all -> 0x0314 }
            r7 = r21
            r4 = 0
            r7.mo19382a(r3, r4, r11)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r5.<init>(r3, r4, r11)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            int r3 = r15 + -4
            byte[] r6 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r7.mo19382a(r6, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            int r11 = m8533a(r6, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r12.<init>(r6, r4, r11, r2)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            int r4 = m8540b(r1)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            int r11 = r11 + r4
            if (r11 >= r3) goto L_0x036a
            int r1 = m8533a(r6, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            int r1 = r1 - r11
            r3.<init>(r6, r11, r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r2 = r3
            goto L_0x036c
        L_0x036a:
            r2 = r18
        L_0x036c:
            com.fyber.inneractive.sdk.player.c.f.a.e r1 = new com.fyber.inneractive.sdk.player.c.f.a.e     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r1.<init>(r5, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r5 = r1
            goto L_0x03b8
        L_0x0373:
            r7 = r21
            if (r8 != r6) goto L_0x038f
            r2 = 72
            if (r9 != r2) goto L_0x038f
            if (r10 != r1) goto L_0x038f
            if (r13 != r4) goto L_0x038f
            r1 = r21
            r2 = r15
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            com.fyber.inneractive.sdk.player.c.f.a.c r5 = m8534a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            goto L_0x03b8
        L_0x038f:
            if (r8 != r6) goto L_0x03a9
            r1 = 84
            if (r9 != r1) goto L_0x03a9
            if (r10 != r3) goto L_0x03a9
            if (r13 != r6) goto L_0x03a9
            r1 = r21
            r2 = r15
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            com.fyber.inneractive.sdk.player.c.f.a.d r5 = m8541b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            goto L_0x03b8
        L_0x03a9:
            java.lang.String r1 = m8538a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r3 = 0
            r7.mo19382a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            com.fyber.inneractive.sdk.player.c.f.a.b r5 = new com.fyber.inneractive.sdk.player.c.f.a.b     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r5.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
        L_0x03b8:
            if (r5 != 0) goto L_0x03e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r2 = "Failed to decode frame: id="
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r0 = m8538a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r0 = ", frameSize="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r1.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x03de, all -> 0x03da }
            r1 = r16
            android.util.Log.w(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x03e0, all -> 0x03da }
            goto L_0x03e3
        L_0x03da:
            r0 = move-exception
        L_0x03db:
            r2 = r19
            goto L_0x03f4
        L_0x03de:
            r1 = r16
        L_0x03e0:
            r2 = r19
            goto L_0x03e9
        L_0x03e3:
            r2 = r19
            r7.mo19386c(r2)
            return r5
        L_0x03e9:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x03f3 }
            r7.mo19386c(r2)
            r0 = 0
            return r0
        L_0x03f3:
            r0 = move-exception
        L_0x03f4:
            r7.mo19386c(r2)
            throw r0
        L_0x03f8:
            r2 = r12
            r0 = r14
            r1 = r16
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r1, r3)
            r7.mo19386c(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8536a(int, com.fyber.inneractive.sdk.player.c.k.k, boolean, int, com.fyber.inneractive.sdk.player.c.f.a.g$a):com.fyber.inneractive.sdk.player.c.f.a.h");
    }

    /* renamed from: a */
    public static int m8531a(C3548k kVar, int i) {
        byte[] bArr = kVar.f9625a;
        int i2 = kVar.f9626b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    private static String m8538a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    private static int m8533a(byte[] bArr, int i, int i2) {
        int a = m8532a(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return a;
        }
        while (a < bArr.length - 1) {
            if (a % 2 == 0 && bArr[a + 1] == 0) {
                return a;
            }
            a = m8532a(bArr, a + 1);
        }
        return bArr.length;
    }

    /* renamed from: a */
    private static int m8532a(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.f.a.g$b */
    private static final class C3434b {

        /* renamed from: a */
        public final int f9277a;

        /* renamed from: b */
        public final boolean f9278b;

        /* renamed from: c */
        public final int f9279c;

        public C3434b(int i, boolean z, int i2) {
            this.f9277a = i;
            this.f9278b = z;
            this.f9279c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((r10 & 1) != 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if ((r10 & 128) != 0) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC, Splitter:B:49:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0095 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8539a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f9626b
        L_0x0006:
            int r3 = r18.mo19383b()     // Catch:{ all -> 0x00b0 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0020
            int r7 = r18.mo19396j()     // Catch:{ all -> 0x00b0 }
            long r8 = r18.mo19394h()     // Catch:{ all -> 0x00b0 }
            int r10 = r18.mo19389e()     // Catch:{ all -> 0x00b0 }
            goto L_0x002a
        L_0x0020:
            int r7 = r18.mo19393g()     // Catch:{ all -> 0x00b0 }
            int r8 = r18.mo19393g()     // Catch:{ all -> 0x00b0 }
            long r8 = (long) r8
            r10 = 0
        L_0x002a:
            r11 = 0
            if (r7 != 0) goto L_0x0038
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            r1.mo19386c(r2)
            return r4
        L_0x0038:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            if (r21 != 0) goto L_0x0069
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0049
            r1.mo19386c(r2)
            return r6
        L_0x0049:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x0069:
            if (r0 != r7) goto L_0x0078
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0087
        L_0x0076:
            r7 = 1
            goto L_0x0088
        L_0x0078:
            if (r0 != r3) goto L_0x0086
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0087
            goto L_0x0076
        L_0x0086:
            r3 = 0
        L_0x0087:
            r7 = 0
        L_0x0088:
            if (r3 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r7 == 0) goto L_0x0090
            int r4 = r4 + 4
        L_0x0090:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0099
            r1.mo19386c(r2)
            return r6
        L_0x0099:
            int r3 = r18.mo19383b()     // Catch:{ all -> 0x00b0 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a6
            r1.mo19386c(r2)
            return r6
        L_0x00a6:
            int r3 = (int) r8
            r1.mo19388d(r3)     // Catch:{ all -> 0x00b0 }
            goto L_0x0006
        L_0x00ac:
            r1.mo19386c(r2)
            return r4
        L_0x00b0:
            r0 = move-exception
            r1.mo19386c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8539a(com.fyber.inneractive.sdk.player.c.k.k, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private static C3424c m8534a(C3548k kVar, int i, int i2, boolean z, int i3, C3433a aVar) throws UnsupportedEncodingException {
        C3548k kVar2 = kVar;
        int i4 = kVar2.f9626b;
        int a = m8532a(kVar2.f9625a, i4);
        String str = new String(kVar2.f9625a, i4, a - i4, C3716C.ISO88591_NAME);
        kVar.mo19386c(a + 1);
        int j = kVar.mo19396j();
        int j2 = kVar.mo19396j();
        long h = kVar.mo19394h();
        long j3 = h == 4294967295L ? -1 : h;
        long h2 = kVar.mo19394h();
        long j4 = h2 == 4294967295L ? -1 : h2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kVar2.f9626b < i5) {
            C3435h a2 = m8536a(i2, kVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        C3435h[] hVarArr = new C3435h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C3424c(str, j, j2, j3, j4, hVarArr);
    }

    /* renamed from: b */
    private static C3426d m8541b(C3548k kVar, int i, int i2, boolean z, int i3, C3433a aVar) throws UnsupportedEncodingException {
        C3548k kVar2 = kVar;
        int i4 = kVar2.f9626b;
        int a = m8532a(kVar2.f9625a, i4);
        String str = new String(kVar2.f9625a, i4, a - i4, C3716C.ISO88591_NAME);
        kVar.mo19386c(a + 1);
        int d = kVar.mo19387d();
        boolean z2 = (d & 2) != 0;
        boolean z3 = (d & 1) != 0;
        int d2 = kVar.mo19387d();
        String[] strArr = new String[d2];
        for (int i5 = 0; i5 < d2; i5++) {
            int i6 = kVar2.f9626b;
            int a2 = m8532a(kVar2.f9625a, i6);
            strArr[i5] = new String(kVar2.f9625a, i6, a2 - i6, C3716C.ISO88591_NAME);
            kVar.mo19386c(a2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kVar2.f9626b < i7) {
            C3435h a3 = m8536a(i2, kVar, z, i3, aVar);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        C3435h[] hVarArr = new C3435h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C3426d(str, z2, z3, strArr, hVarArr);
    }
}

package com.yandex.mobile.ads.exo.metadata.id3;

import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ey0;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.nn0;
import com.yandex.mobile.ads.impl.pn0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.exo.metadata.id3.a */
public final class C12248a implements nn0 {

    /* renamed from: b */
    public static final C12249a f29939b = $$Lambda$a$P2FrUV3eT5wwdwFX2RVsgzRK5Q.INSTANCE;

    /* renamed from: a */
    private final C12249a f29940a;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.a$a */
    public interface C12249a {
        /* renamed from: a */
        boolean mo65045a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.a$b */
    private static final class C12250b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f29941a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f29942b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f29943c;

        public C12250b(int i, boolean z, int i2) {
            this.f29941a = i;
            this.f29942b = z;
            this.f29943c = i2;
        }
    }

    public C12248a(C12249a aVar) {
        this.f29940a = aVar;
    }

    /* renamed from: a */
    private static int m32061a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static UrlLinkFrame m32075b(fy0 fy0, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        fy0.mo67104a(bArr, 0, i);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, m32071b(bArr, 0), C3716C.ISO88591_NAME));
    }

    /* renamed from: b */
    private static String m32076b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C3716C.ISO88591_NAME : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m32077b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: c */
    private static MlltFrame m32078c(fy0 fy0, int i) {
        int x = fy0.mo67132x();
        int u = fy0.mo67129u();
        int u2 = fy0.mo67129u();
        int r = fy0.mo67126r();
        int r2 = fy0.mo67126r();
        ey0 ey0 = new ey0();
        ey0.mo66889a(fy0.f33778a, fy0.mo67107c());
        ey0.mo66895c(fy0.mo67105b() * 8);
        int i2 = ((i - 10) * 8) / (r + r2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a = ey0.mo66886a(r);
            int a2 = ey0.mo66886a(r2);
            iArr[i3] = a;
            iArr2[i3] = a2;
        }
        return new MlltFrame(x, u, u2, iArr, iArr2);
    }

    /* renamed from: d */
    private static PrivFrame m32079d(fy0 fy0, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        fy0.mo67104a(bArr, 0, i);
        int b = m32071b(bArr, 0);
        return new PrivFrame(new String(bArr, 0, b, C3716C.ISO88591_NAME), m32070a(bArr, b + 1, i));
    }

    /* renamed from: e */
    private static TextInformationFrame m32080e(fy0 fy0, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int r = fy0.mo67126r();
        String b = m32076b(r);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fy0.mo67104a(bArr, 0, i2);
        int b2 = m32072b(bArr, 0, r);
        String str = new String(bArr, 0, b2, b);
        int a = b2 + m32061a(r);
        return new TextInformationFrame("TXXX", str, m32068a(bArr, a, m32072b(bArr, a, r), b));
    }

    /* renamed from: f */
    private static UrlLinkFrame m32081f(fy0 fy0, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int r = fy0.mo67126r();
        String b = m32076b(r);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fy0.mo67104a(bArr, 0, i2);
        int b2 = m32072b(bArr, 0, r);
        String str = new String(bArr, 0, b2, b);
        int a = b2 + m32061a(r);
        return new UrlLinkFrame("WXXX", str, m32068a(bArr, a, m32071b(bArr, a), C3716C.ISO88591_NAME));
    }

    /* renamed from: g */
    private static int m32082g(fy0 fy0, int i) {
        byte[] bArr = fy0.f33778a;
        int b = fy0.mo67105b();
        int i2 = b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= b + i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - (i2 - b)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    public Metadata mo65103a(pn0 pn0) {
        ByteBuffer byteBuffer = pn0.f39147d;
        byteBuffer.getClass();
        return mo65104a(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.exo.metadata.Metadata mo65104a(byte[] r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.yandex.mobile.ads.impl.fy0 r1 = new com.yandex.mobile.ads.impl.fy0
            r1.<init>(r13, r14)
            int r13 = r1.mo67098a()
            r14 = 2
            r2 = 10
            java.lang.String r3 = "Id3Decoder"
            r4 = 4
            r5 = 0
            r6 = 0
            r7 = 1
            if (r13 >= r2) goto L_0x0021
            java.lang.String r13 = "Data too short to be an ID3 tag"
            android.util.Log.w(r3, r13)
        L_0x001e:
            r10 = r5
            goto L_0x00c8
        L_0x0021:
            int r13 = r1.mo67129u()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L_0x004d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unexpected first three bytes of ID3 tag header: 0x"
            r8.append(r9)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r6] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r3, r13)
            goto L_0x001e
        L_0x004d:
            int r13 = r1.mo67126r()
            r1.mo67114f(r7)
            int r8 = r1.mo67126r()
            int r9 = r1.mo67125q()
            if (r13 != r14) goto L_0x006d
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0064
            r10 = 1
            goto L_0x0065
        L_0x0064:
            r10 = 0
        L_0x0065:
            if (r10 == 0) goto L_0x00a3
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            android.util.Log.w(r3, r13)
            goto L_0x001e
        L_0x006d:
            r10 = 3
            if (r13 != r10) goto L_0x0083
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0076
            r10 = 1
            goto L_0x0077
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 == 0) goto L_0x00a3
            int r10 = r1.mo67113f()
            r1.mo67114f(r10)
            int r10 = r10 + r4
            int r9 = r9 - r10
            goto L_0x00a3
        L_0x0083:
            if (r13 != r4) goto L_0x00b2
            r10 = r8 & 64
            if (r10 == 0) goto L_0x008b
            r10 = 1
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            if (r10 == 0) goto L_0x0098
            int r10 = r1.mo67125q()
            int r11 = r10 + -4
            r1.mo67114f(r11)
            int r9 = r9 - r10
        L_0x0098:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x009e
            r10 = 1
            goto L_0x009f
        L_0x009e:
            r10 = 0
        L_0x009f:
            if (r10 == 0) goto L_0x00a3
            int r9 = r9 + -10
        L_0x00a3:
            if (r13 >= r4) goto L_0x00ab
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00ab
            r8 = 1
            goto L_0x00ac
        L_0x00ab:
            r8 = 0
        L_0x00ac:
            com.yandex.mobile.ads.exo.metadata.id3.a$b r10 = new com.yandex.mobile.ads.exo.metadata.id3.a$b
            r10.<init>(r13, r8, r9)
            goto L_0x00c8
        L_0x00b2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r3, r13)
            goto L_0x001e
        L_0x00c8:
            if (r10 != 0) goto L_0x00cb
            return r5
        L_0x00cb:
            int r13 = r1.mo67105b()
            int r8 = r10.f29941a
            if (r8 != r14) goto L_0x00d6
            r2 = 6
        L_0x00d6:
            int r14 = r10.f29943c
            boolean r8 = r10.f29942b
            if (r8 == 0) goto L_0x00e8
            int r14 = r10.f29943c
            int r14 = m32082g(r1, r14)
        L_0x00e8:
            int r13 = r13 + r14
            r1.mo67110d(r13)
            int r13 = r10.f29941a
            boolean r13 = m32069a((com.yandex.mobile.ads.impl.fy0) r1, (int) r13, (int) r2, (boolean) r6)
            if (r13 != 0) goto L_0x011d
            int r13 = r10.f29941a
            if (r13 != r4) goto L_0x0104
            boolean r13 = m32069a((com.yandex.mobile.ads.impl.fy0) r1, (int) r4, (int) r2, (boolean) r7)
            if (r13 == 0) goto L_0x0104
            r6 = 1
            goto L_0x011d
        L_0x0104:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Failed to validate ID3 tag with majorVersion="
            r13.append(r14)
            int r14 = r10.f29941a
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r3, r13)
            return r5
        L_0x011d:
            int r13 = r1.mo67098a()
            if (r13 < r2) goto L_0x0133
            int r13 = r10.f29941a
            com.yandex.mobile.ads.exo.metadata.id3.a$a r14 = r12.f29940a
            com.yandex.mobile.ads.exo.metadata.id3.Id3Frame r13 = m32065a((int) r13, (com.yandex.mobile.ads.impl.fy0) r1, (boolean) r6, (int) r2, (com.yandex.mobile.ads.exo.metadata.id3.C12248a.C12249a) r14)
            if (r13 == 0) goto L_0x011d
            r0.add(r13)
            goto L_0x011d
        L_0x0133:
            com.yandex.mobile.ads.exo.metadata.Metadata r13 = new com.yandex.mobile.ads.exo.metadata.Metadata
            r13.<init>((java.util.List<? extends com.yandex.mobile.ads.exo.metadata.Metadata.Entry>) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.id3.C12248a.mo65104a(byte[], int):com.yandex.mobile.ads.exo.metadata.Metadata");
    }

    /* renamed from: b */
    private static GeobFrame m32074b(fy0 fy0, int i) throws UnsupportedEncodingException {
        int r = fy0.mo67126r();
        String b = m32076b(r);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fy0.mo67104a(bArr, 0, i2);
        int b2 = m32071b(bArr, 0);
        String str = new String(bArr, 0, b2, C3716C.ISO88591_NAME);
        int i3 = b2 + 1;
        int b3 = m32072b(bArr, i3, r);
        String a = m32068a(bArr, i3, b3, b);
        int a2 = b3 + m32061a(r);
        int b4 = m32072b(bArr, a2, r);
        return new GeobFrame(str, a, m32068a(bArr, a2, b4, b), m32070a(bArr, b4 + m32061a(r), i2));
    }

    /* renamed from: b */
    private static ChapterTocFrame m32073b(fy0 fy0, int i, int i2, boolean z, int i3, C12249a aVar) throws UnsupportedEncodingException {
        fy0 fy02 = fy0;
        int b = fy0.mo67105b();
        int b2 = m32071b(fy02.f33778a, b);
        String str = new String(fy02.f33778a, b, b2 - b, C3716C.ISO88591_NAME);
        fy0.mo67112e(b2 + 1);
        int r = fy0.mo67126r();
        boolean z2 = (r & 2) != 0;
        boolean z3 = (r & 1) != 0;
        int r2 = fy0.mo67126r();
        String[] strArr = new String[r2];
        for (int i4 = 0; i4 < r2; i4++) {
            int b3 = fy0.mo67105b();
            int b4 = m32071b(fy02.f33778a, b3);
            strArr[i4] = new String(fy02.f33778a, b3, b4 - b3, C3716C.ISO88591_NAME);
            fy0.mo67112e(b4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = b + i;
        while (fy0.mo67105b() < i5) {
            Id3Frame a = m32065a(i2, fy0, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if ((r10 & 128) != 0) goto L_0x0089;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m32069a(com.yandex.mobile.ads.impl.fy0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo67105b()
        L_0x0008:
            int r3 = r18.mo67098a()     // Catch:{ all -> 0x00ad }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo67113f()     // Catch:{ all -> 0x00ad }
            long r8 = r18.mo67128t()     // Catch:{ all -> 0x00ad }
            int r10 = r18.mo67132x()     // Catch:{ all -> 0x00ad }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo67129u()     // Catch:{ all -> 0x00ad }
            int r8 = r18.mo67129u()     // Catch:{ all -> 0x00ad }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo67112e(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo67112e(r2)
            return r6
        L_0x004b:
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
        L_0x006b:
            if (r0 != r7) goto L_0x0079
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0079:
            if (r0 != r3) goto L_0x0087
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0081
            r3 = 1
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0087:
            r3 = 0
        L_0x0088:
            r4 = 0
        L_0x0089:
            if (r4 == 0) goto L_0x008d
            int r3 = r3 + 4
        L_0x008d:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0096
            r1.mo67112e(r2)
            return r6
        L_0x0096:
            int r3 = r18.mo67098a()     // Catch:{ all -> 0x00ad }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a3
            r1.mo67112e(r2)
            return r6
        L_0x00a3:
            int r3 = (int) r8
            r1.mo67114f(r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0008
        L_0x00a9:
            r1.mo67112e(r2)
            return r4
        L_0x00ad:
            r0 = move-exception
            r1.mo67112e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.id3.C12248a.m32069a(com.yandex.mobile.ads.impl.fy0, int, int, boolean):boolean");
    }

    /* renamed from: b */
    private static int m32072b(byte[] bArr, int i, int i2) {
        int b = m32071b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (b < bArr.length - 1) {
            if (b % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = m32071b(bArr, b + 1);
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static int m32071b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x018f, code lost:
        if (r13 == 67) goto L_0x0191;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.yandex.mobile.ads.exo.metadata.id3.Id3Frame m32065a(int r18, com.yandex.mobile.ads.impl.fy0 r19, boolean r20, int r21, com.yandex.mobile.ads.exo.metadata.id3.C12248a.C12249a r22) {
        /*
            r0 = r18
            r7 = r19
            int r8 = r19.mo67126r()
            int r9 = r19.mo67126r()
            int r10 = r19.mo67126r()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r19.mo67126r()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r19.mo67130v()
            if (r20 != 0) goto L_0x003a
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
            int r1 = r19.mo67130v()
            goto L_0x003a
        L_0x0043:
            int r1 = r19.mo67129u()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r19.mo67132x()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r19.mo67107c()
            r7.mo67112e(r0)
            return r16
        L_0x0067:
            int r1 = r19.mo67105b()
            int r5 = r1 + r15
            int r1 = r19.mo67107c()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r4, r0)
            int r0 = r19.mo67107c()
            r7.mo67112e(r0)
            return r16
        L_0x0082:
            if (r22 == 0) goto L_0x009a
            r1 = r22
            r2 = r18
            r3 = r8
            r17 = r4
            r4 = r9
            r12 = r5
            r5 = r10
            r14 = r6
            r6 = r13
            boolean r1 = r1.mo65045a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo67112e(r12)
            return r16
        L_0x009a:
            r17 = r4
            r12 = r5
            r14 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bb
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x00ae
            r3 = 1
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00b5
            r4 = 1
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            r5 = r4
            r6 = 0
            r4 = r3
            r3 = r2
            goto L_0x00ed
        L_0x00bb:
            r2 = 4
            if (r0 != r2) goto L_0x00e8
            r2 = r14 & 64
            if (r2 == 0) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x00cb
            r2 = 1
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x00d2
            r3 = 1
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x00d9
            r5 = 1
            goto L_0x00da
        L_0x00d9:
            r5 = 0
        L_0x00da:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x00e3
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = 1
            goto L_0x00ed
        L_0x00e3:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = 0
            goto L_0x00ed
        L_0x00e8:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x00ed:
            if (r2 != 0) goto L_0x022e
            if (r4 == 0) goto L_0x00f3
            goto L_0x022e
        L_0x00f3:
            if (r5 == 0) goto L_0x00fa
            int r15 = r15 + -1
            r7.mo67114f(r1)
        L_0x00fa:
            if (r3 == 0) goto L_0x0102
            int r15 = r15 + -4
            r1 = 4
            r7.mo67114f(r1)
        L_0x0102:
            if (r6 == 0) goto L_0x0108
            int r15 = m32082g(r7, r15)
        L_0x0108:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x011d
            if (r9 != r3) goto L_0x011d
            if (r10 != r3) goto L_0x011d
            if (r0 == r2) goto L_0x0117
            if (r13 != r3) goto L_0x011d
        L_0x0117:
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m32080e(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x011d:
            if (r8 != r1) goto L_0x0130
            java.lang.String r1 = m32067a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m32066a((com.yandex.mobile.ads.impl.fy0) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x0129:
            r0 = move-exception
            goto L_0x022a
        L_0x012c:
            r2 = r17
            goto L_0x0221
        L_0x0130:
            r4 = 87
            if (r8 != r4) goto L_0x0142
            if (r9 != r3) goto L_0x0142
            if (r10 != r3) goto L_0x0142
            if (r0 == r2) goto L_0x013c
            if (r13 != r3) goto L_0x0142
        L_0x013c:
            com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame r1 = m32081f(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x0142:
            if (r8 != r4) goto L_0x014e
            java.lang.String r1 = m32067a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame r1 = m32075b((com.yandex.mobile.ads.impl.fy0) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x014e:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0164
            r5 = 82
            if (r9 != r5) goto L_0x0164
            if (r10 != r3) goto L_0x0164
            r5 = 86
            if (r13 != r5) goto L_0x0164
            com.yandex.mobile.ads.exo.metadata.id3.PrivFrame r1 = m32079d(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x0164:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017c
            r5 = 69
            if (r9 != r5) goto L_0x017c
            if (r10 != r6) goto L_0x017c
            r5 = 66
            if (r13 == r5) goto L_0x0176
            if (r0 != r2) goto L_0x017c
        L_0x0176:
            com.yandex.mobile.ads.exo.metadata.id3.GeobFrame r1 = m32074b((com.yandex.mobile.ads.impl.fy0) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x017c:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x0189
            if (r8 != r4) goto L_0x0197
            if (r9 != r3) goto L_0x0197
            if (r10 != r11) goto L_0x0197
            goto L_0x0191
        L_0x0189:
            if (r8 != r5) goto L_0x0197
            if (r9 != r4) goto L_0x0197
            if (r10 != r3) goto L_0x0197
            if (r13 != r11) goto L_0x0197
        L_0x0191:
            com.yandex.mobile.ads.exo.metadata.id3.ApicFrame r1 = m32062a((com.yandex.mobile.ads.impl.fy0) r7, (int) r15, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x0197:
            r3 = 77
            if (r8 != r11) goto L_0x01a8
            if (r9 != r6) goto L_0x01a8
            if (r10 != r3) goto L_0x01a8
            if (r13 == r3) goto L_0x01a3
            if (r0 != r2) goto L_0x01a8
        L_0x01a3:
            com.yandex.mobile.ads.exo.metadata.id3.CommentFrame r1 = m32064a((com.yandex.mobile.ads.impl.fy0) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x01a8:
            if (r8 != r11) goto L_0x01c2
            r2 = 72
            if (r9 != r2) goto L_0x01c2
            if (r10 != r5) goto L_0x01c2
            if (r13 != r4) goto L_0x01c2
            r1 = r19
            r2 = r15
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            com.yandex.mobile.ads.exo.metadata.id3.ChapterFrame r1 = m32063a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x01c2:
            if (r8 != r11) goto L_0x01da
            if (r9 != r1) goto L_0x01da
            if (r10 != r6) goto L_0x01da
            if (r13 != r11) goto L_0x01da
            r1 = r19
            r2 = r15
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            com.yandex.mobile.ads.exo.metadata.id3.ChapterTocFrame r1 = m32073b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x01da:
            if (r8 != r3) goto L_0x01e9
            r2 = 76
            if (r9 != r2) goto L_0x01e9
            if (r10 != r2) goto L_0x01e9
            if (r13 != r1) goto L_0x01e9
            com.yandex.mobile.ads.exo.metadata.id3.MlltFrame r1 = m32078c(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x01f9
        L_0x01e9:
            java.lang.String r1 = m32067a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r3 = 0
            r7.mo67104a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            com.yandex.mobile.ads.exo.metadata.id3.BinaryFrame r3 = new com.yandex.mobile.ads.exo.metadata.id3.BinaryFrame     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r3.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r1 = r3
        L_0x01f9:
            if (r1 != 0) goto L_0x021d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x012c }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            java.lang.String r0 = m32067a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x012c }
            r2 = r17
            android.util.Log.w(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0221 }
        L_0x021d:
            r7.mo67112e(r12)
            return r1
        L_0x0221:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0129 }
            r7.mo67112e(r12)
            return r16
        L_0x022a:
            r7.mo67112e(r12)
            throw r0
        L_0x022e:
            r2 = r17
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r2, r0)
            r7.mo67112e(r12)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.id3.C12248a.m32065a(int, com.yandex.mobile.ads.impl.fy0, boolean, int, com.yandex.mobile.ads.exo.metadata.id3.a$a):com.yandex.mobile.ads.exo.metadata.id3.Id3Frame");
    }

    /* renamed from: a */
    private static TextInformationFrame m32066a(fy0 fy0, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int r = fy0.mo67126r();
        String b = m32076b(r);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        fy0.mo67104a(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, m32072b(bArr, 0, r), b));
    }

    /* renamed from: a */
    private static ApicFrame m32062a(fy0 fy0, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int r = fy0.mo67126r();
        String b = m32076b(r);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        fy0.mo67104a(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + ih1.m37399e(new String(bArr, 0, 3, C3716C.ISO88591_NAME));
            if ("image/jpg".equals(str)) {
                str = MimeTypes.IMAGE_JPEG;
            }
            i3 = 2;
        } else {
            i3 = m32071b(bArr, 0);
            String e = ih1.m37399e(new String(bArr, 0, i3, C3716C.ISO88591_NAME));
            if (e.indexOf(47) == -1) {
                str = "image/" + e;
            } else {
                str = e;
            }
        }
        int i5 = i3 + 2;
        int b2 = m32072b(bArr, i5, r);
        return new ApicFrame(str, new String(bArr, i5, b2 - i5, b), bArr[i3 + 1] & 255, m32070a(bArr, b2 + m32061a(r), i4));
    }

    /* renamed from: a */
    private static CommentFrame m32064a(fy0 fy0, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int r = fy0.mo67126r();
        String b = m32076b(r);
        byte[] bArr = new byte[3];
        fy0.mo67104a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        fy0.mo67104a(bArr2, 0, i2);
        int b2 = m32072b(bArr2, 0, r);
        String str2 = new String(bArr2, 0, b2, b);
        int a = b2 + m32061a(r);
        return new CommentFrame(str, str2, m32068a(bArr2, a, m32072b(bArr2, a, r), b));
    }

    /* renamed from: a */
    private static ChapterFrame m32063a(fy0 fy0, int i, int i2, boolean z, int i3, C12249a aVar) throws UnsupportedEncodingException {
        fy0 fy02 = fy0;
        int b = fy0.mo67105b();
        int b2 = m32071b(fy02.f33778a, b);
        String str = new String(fy02.f33778a, b, b2 - b, C3716C.ISO88591_NAME);
        fy0.mo67112e(b2 + 1);
        int f = fy0.mo67113f();
        int f2 = fy0.mo67113f();
        long t = fy0.mo67128t();
        long j = t == 4294967295L ? -1 : t;
        long t2 = fy0.mo67128t();
        long j2 = t2 == 4294967295L ? -1 : t2;
        ArrayList arrayList = new ArrayList();
        int i4 = b + i;
        while (fy0.mo67105b() < i4) {
            Id3Frame a = m32065a(i2, fy0, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, f, f2, j, j2, id3FrameArr);
    }

    /* renamed from: a */
    private static String m32067a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    private static byte[] m32070a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return ih1.f34863f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: a */
    private static String m32068a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }
}

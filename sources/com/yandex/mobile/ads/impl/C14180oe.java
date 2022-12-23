package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;

/* renamed from: com.yandex.mobile.ads.impl.oe */
public final class C14180oe extends C14272pe {

    /* renamed from: g */
    private final fy0 f38168g = new fy0();

    /* renamed from: h */
    private final ey0 f38169h = new ey0();

    /* renamed from: i */
    private final int f38170i;

    /* renamed from: j */
    private final C14181a[] f38171j;

    /* renamed from: k */
    private C14181a f38172k;

    /* renamed from: l */
    private List<C14683ti> f38173l;

    /* renamed from: m */
    private List<C14683ti> f38174m;

    /* renamed from: n */
    private C14182b f38175n;

    /* renamed from: o */
    private int f38176o;

    /* renamed from: com.yandex.mobile.ads.impl.oe$a */
    private static final class C14181a {

        /* renamed from: A */
        private static final int[] f38177A = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: B */
        private static final boolean[] f38178B = {false, false, false, true, true, true, false};

        /* renamed from: C */
        private static final int[] f38179C;

        /* renamed from: D */
        private static final int[] f38180D = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: E */
        private static final int[] f38181E = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: F */
        private static final int[] f38182F;

        /* renamed from: w */
        public static final int f38183w = m40381a(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f38184x;

        /* renamed from: y */
        private static final int[] f38185y = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: z */
        private static final int[] f38186z = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: a */
        private final List<SpannableString> f38187a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f38188b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f38189c;

        /* renamed from: d */
        private boolean f38190d;

        /* renamed from: e */
        private int f38191e;

        /* renamed from: f */
        private boolean f38192f;

        /* renamed from: g */
        private int f38193g;

        /* renamed from: h */
        private int f38194h;

        /* renamed from: i */
        private int f38195i;

        /* renamed from: j */
        private int f38196j;

        /* renamed from: k */
        private boolean f38197k;

        /* renamed from: l */
        private int f38198l;

        /* renamed from: m */
        private int f38199m;

        /* renamed from: n */
        private int f38200n;

        /* renamed from: o */
        private int f38201o;

        /* renamed from: p */
        private int f38202p;

        /* renamed from: q */
        private int f38203q;

        /* renamed from: r */
        private int f38204r;

        /* renamed from: s */
        private int f38205s;

        /* renamed from: t */
        private int f38206t;

        /* renamed from: u */
        private int f38207u;

        /* renamed from: v */
        private int f38208v;

        static {
            int a = m40381a(0, 0, 0, 0);
            f38184x = a;
            int a2 = m40381a(0, 0, 0, 3);
            f38179C = new int[]{a, a2, a, a, a2, a, a};
            f38182F = new int[]{a, a, a, a, a, a2, a2};
        }

        public C14181a() {
            mo69151h();
        }

        /* renamed from: a */
        public void mo69141a(boolean z) {
            this.f38190d = z;
        }

        /* renamed from: b */
        public void mo69145b(int i, int i2) {
            this.f38201o = i;
            this.f38198l = i2;
        }

        /* renamed from: c */
        public SpannableString mo69146c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f38188b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f38202p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f38202p, length, 33);
                }
                if (this.f38203q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f38203q, length, 33);
                }
                if (this.f38204r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f38205s), this.f38204r, length, 33);
                }
                if (this.f38206t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f38207u), this.f38206t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public void mo69147d() {
            this.f38187a.clear();
            this.f38188b.clear();
            this.f38202p = -1;
            this.f38203q = -1;
            this.f38204r = -1;
            this.f38206t = -1;
            this.f38208v = 0;
        }

        /* renamed from: e */
        public boolean mo69148e() {
            return this.f38189c;
        }

        /* renamed from: f */
        public boolean mo69149f() {
            return !this.f38189c || (this.f38187a.isEmpty() && this.f38188b.length() == 0);
        }

        /* renamed from: g */
        public boolean mo69150g() {
            return this.f38190d;
        }

        /* renamed from: h */
        public void mo69151h() {
            mo69147d();
            this.f38189c = false;
            this.f38190d = false;
            this.f38191e = 4;
            this.f38192f = false;
            this.f38193g = 0;
            this.f38194h = 0;
            this.f38195i = 0;
            this.f38196j = 15;
            this.f38197k = true;
            this.f38198l = 0;
            this.f38199m = 0;
            this.f38200n = 0;
            int i = f38184x;
            this.f38201o = i;
            this.f38205s = f38183w;
            this.f38207u = i;
        }

        /* renamed from: a */
        public void mo69143a(boolean z, boolean z2, int i, boolean z3, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f38189c = true;
            this.f38190d = z;
            this.f38197k = z2;
            this.f38191e = i;
            this.f38192f = z3;
            this.f38193g = i2;
            this.f38194h = i3;
            this.f38195i = i5;
            int i8 = i4 + 1;
            if (this.f38196j != i8) {
                this.f38196j = i8;
                while (true) {
                    if ((!z2 || this.f38187a.size() < this.f38196j) && this.f38187a.size() < 15) {
                        break;
                    }
                    this.f38187a.remove(0);
                }
            }
            if (!(i6 == 0 || this.f38199m == i6)) {
                this.f38199m = i6;
                int i9 = i6 - 1;
                int i10 = f38179C[i9];
                boolean z4 = f38178B[i9];
                int i11 = f38186z[i9];
                int i12 = f38177A[i9];
                int i13 = f38185y[i9];
                this.f38201o = i10;
                this.f38198l = i13;
            }
            if (i7 != 0 && this.f38200n != i7) {
                this.f38200n = i7;
                int i14 = i7 - 1;
                int i15 = f38181E[i14];
                int i16 = f38180D[i14];
                mo69142a(false, false);
                mo69140a(f38183w, f38182F[i14]);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.yandex.mobile.ads.impl.C14095ne mo69144b() {
            /*
                r15 = this;
                boolean r0 = r15.mo69149f()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f38187a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f38187a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo69146c()
                r2.append(r1)
                int r1 = r15.f38198l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r4) goto L_0x0058
                if (r1 != r3) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f38198l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f38192f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f38194h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f38193g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f38194h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f38193g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f38195i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x0098
            L_0x0093:
                if (r8 != r5) goto L_0x0097
                r8 = 1
                goto L_0x0098
            L_0x0097:
                r8 = 2
            L_0x0098:
                int r1 = r1 / r3
                if (r1 != 0) goto L_0x009d
                r9 = 0
                goto L_0x00a2
            L_0x009d:
                if (r1 != r5) goto L_0x00a1
                r9 = 1
                goto L_0x00a2
            L_0x00a1:
                r9 = 2
            L_0x00a2:
                int r11 = r15.f38201o
                int r1 = f38184x
                if (r11 == r1) goto L_0x00a9
                r0 = 1
            L_0x00a9:
                com.yandex.mobile.ads.impl.ne r13 = new com.yandex.mobile.ads.impl.ne
                int r12 = r15.f38191e
                r5 = 0
                r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r14
                r10 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14180oe.C14181a.mo69144b():com.yandex.mobile.ads.impl.ne");
        }

        /* renamed from: a */
        public void mo69142a(boolean z, boolean z2) {
            if (this.f38202p != -1) {
                if (!z) {
                    this.f38188b.setSpan(new StyleSpan(2), this.f38202p, this.f38188b.length(), 33);
                    this.f38202p = -1;
                }
            } else if (z) {
                this.f38202p = this.f38188b.length();
            }
            if (this.f38203q != -1) {
                if (!z2) {
                    this.f38188b.setSpan(new UnderlineSpan(), this.f38203q, this.f38188b.length(), 33);
                    this.f38203q = -1;
                }
            } else if (z2) {
                this.f38203q = this.f38188b.length();
            }
        }

        /* renamed from: a */
        public void mo69140a(int i, int i2) {
            if (!(this.f38204r == -1 || this.f38205s == i)) {
                this.f38188b.setSpan(new ForegroundColorSpan(this.f38205s), this.f38204r, this.f38188b.length(), 33);
            }
            if (i != f38183w) {
                this.f38204r = this.f38188b.length();
                this.f38205s = i;
            }
            if (!(this.f38206t == -1 || this.f38207u == i2)) {
                this.f38188b.setSpan(new BackgroundColorSpan(this.f38207u), this.f38206t, this.f38188b.length(), 33);
            }
            if (i2 != f38184x) {
                this.f38206t = this.f38188b.length();
                this.f38207u = i2;
            }
        }

        /* renamed from: a */
        public void mo69139a(int i) {
            if (this.f38208v != i) {
                mo69138a(10);
            }
            this.f38208v = i;
        }

        /* renamed from: a */
        public void mo69137a() {
            int length = this.f38188b.length();
            if (length > 0) {
                this.f38188b.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public void mo69138a(char c) {
            if (c == 10) {
                this.f38187a.add(mo69146c());
                this.f38188b.clear();
                if (this.f38202p != -1) {
                    this.f38202p = 0;
                }
                if (this.f38203q != -1) {
                    this.f38203q = 0;
                }
                if (this.f38204r != -1) {
                    this.f38204r = 0;
                }
                if (this.f38206t != -1) {
                    this.f38206t = 0;
                }
                while (true) {
                    if ((this.f38197k && this.f38187a.size() >= this.f38196j) || this.f38187a.size() >= 15) {
                        this.f38187a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f38188b.append(c);
            }
        }

        /* renamed from: a */
        public static int m40381a(int i, int i2, int i3, int i4) {
            int i5 = 0;
            C13479j9.m37702a(i, 0, 4);
            C13479j9.m37702a(i2, 0, 4);
            C13479j9.m37702a(i3, 0, 4);
            C13479j9.m37702a(i4, 0, 4);
            int i6 = i4 != 2 ? i4 != 3 ? 255 : 0 : 127;
            int i7 = i > 1 ? 255 : 0;
            int i8 = i2 > 1 ? 255 : 0;
            if (i3 > 1) {
                i5 = 255;
            }
            return Color.argb(i6, i7, i8, i5);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oe$b */
    private static final class C14182b {

        /* renamed from: a */
        public final int f38209a;

        /* renamed from: b */
        public final int f38210b;

        /* renamed from: c */
        public final byte[] f38211c;

        /* renamed from: d */
        int f38212d = 0;

        public C14182b(int i, int i2) {
            this.f38209a = i;
            this.f38210b = i2;
            this.f38211c = new byte[((i2 * 2) - 1)];
        }
    }

    public C14180oe(int i) {
        this.f38170i = i == -1 ? 1 : i;
        this.f38171j = new C14181a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f38171j[i2] = new C14181a();
        }
        this.f38172k = this.f38171j[0];
        m40377i();
    }

    /* renamed from: g */
    private void m40375g() {
        C14182b bVar = this.f38175n;
        if (bVar != null) {
            int i = bVar.f38212d;
            if (i != (bVar.f38210b * 2) - 1) {
                Log.w("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f38175n.f38210b * 2) - 1) + ", but current index is " + this.f38175n.f38212d + " (sequence number " + this.f38175n.f38209a + "); ignoring packet");
            } else {
                this.f38169h.mo66889a(bVar.f38211c, i);
                int i2 = 3;
                int a = this.f38169h.mo66886a(3);
                int a2 = this.f38169h.mo66886a(5);
                if (a == 7) {
                    this.f38169h.mo66897d(2);
                    a = this.f38169h.mo66886a(6);
                    if (a < 7) {
                        Log.w("Cea708Decoder", "Invalid extended service number: " + a);
                    }
                }
                if (a2 == 0) {
                    if (a != 0) {
                        Log.w("Cea708Decoder", "serviceNumber is non-zero (" + a + ") when blockSize is 0");
                    }
                } else if (a == this.f38170i) {
                    boolean z = false;
                    while (this.f38169h.mo66891b() > 0) {
                        int a3 = this.f38169h.mo66886a(8);
                        if (a3 != 16) {
                            if (a3 <= 31) {
                                if (a3 != 0) {
                                    if (a3 == i2) {
                                        this.f38173l = m40376h();
                                    } else if (a3 != 8) {
                                        switch (a3) {
                                            case 12:
                                                m40377i();
                                                break;
                                            case 13:
                                                this.f38172k.mo69138a(10);
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (a3 < 17 || a3 > 23) {
                                                    if (a3 >= 24 && a3 <= 31) {
                                                        Log.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + a3);
                                                        this.f38169h.mo66897d(16);
                                                        break;
                                                    } else {
                                                        Log.w("Cea708Decoder", "Invalid C0 command: " + a3);
                                                        break;
                                                    }
                                                } else {
                                                    Log.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + a3);
                                                    this.f38169h.mo66897d(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        this.f38172k.mo69137a();
                                    }
                                }
                            } else if (a3 <= 127) {
                                if (a3 == 127) {
                                    this.f38172k.mo69138a(9835);
                                } else {
                                    this.f38172k.mo69138a((char) (a3 & 255));
                                }
                            } else if (a3 <= 159) {
                                switch (a3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i3 = a3 - 128;
                                        if (this.f38176o != i3) {
                                            this.f38176o = i3;
                                            this.f38172k = this.f38171j[i3];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        for (int i4 = 1; i4 <= 8; i4++) {
                                            if (this.f38169h.mo66900f()) {
                                                this.f38171j[8 - i4].mo69147d();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (this.f38169h.mo66900f()) {
                                                this.f38171j[8 - i5].mo69141a(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (this.f38169h.mo66900f()) {
                                                this.f38171j[8 - i6].mo69141a(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (this.f38169h.mo66900f()) {
                                                C14181a aVar = this.f38171j[8 - i7];
                                                aVar.mo69141a(!aVar.mo69150g());
                                            }
                                        }
                                        break;
                                    case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (this.f38169h.mo66900f()) {
                                                this.f38171j[8 - i8].mo69151h();
                                            }
                                        }
                                        break;
                                    case 141:
                                        this.f38169h.mo66897d(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        m40377i();
                                        break;
                                    case 144:
                                        if (this.f38172k.mo69148e()) {
                                            this.f38169h.mo66886a(4);
                                            this.f38169h.mo66886a(2);
                                            this.f38169h.mo66886a(2);
                                            boolean f = this.f38169h.mo66900f();
                                            boolean f2 = this.f38169h.mo66900f();
                                            this.f38169h.mo66886a(i2);
                                            this.f38169h.mo66886a(i2);
                                            this.f38172k.mo69142a(f, f2);
                                            break;
                                        } else {
                                            this.f38169h.mo66897d(16);
                                            break;
                                        }
                                    case 145:
                                        if (this.f38172k.mo69148e()) {
                                            int a4 = C14181a.m40381a(this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2));
                                            int a5 = C14181a.m40381a(this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2));
                                            this.f38169h.mo66897d(2);
                                            C14181a.m40381a(this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), 0);
                                            this.f38172k.mo69140a(a4, a5);
                                            break;
                                        } else {
                                            this.f38169h.mo66897d(24);
                                            break;
                                        }
                                    case 146:
                                        if (this.f38172k.mo69148e()) {
                                            this.f38169h.mo66897d(4);
                                            int a6 = this.f38169h.mo66886a(4);
                                            this.f38169h.mo66897d(2);
                                            this.f38169h.mo66886a(6);
                                            this.f38172k.mo69139a(a6);
                                            break;
                                        } else {
                                            this.f38169h.mo66897d(16);
                                            break;
                                        }
                                    case 151:
                                        if (this.f38172k.mo69148e()) {
                                            int a7 = C14181a.m40381a(this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2));
                                            this.f38169h.mo66886a(2);
                                            C14181a.m40381a(this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), this.f38169h.mo66886a(2), 0);
                                            this.f38169h.mo66900f();
                                            this.f38169h.mo66900f();
                                            this.f38169h.mo66886a(2);
                                            this.f38169h.mo66886a(2);
                                            int a8 = this.f38169h.mo66886a(2);
                                            this.f38169h.mo66897d(8);
                                            this.f38172k.mo69145b(a7, a8);
                                            break;
                                        } else {
                                            this.f38169h.mo66897d(32);
                                            break;
                                        }
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i9 = a3 - 152;
                                        C14181a aVar2 = this.f38171j[i9];
                                        this.f38169h.mo66897d(2);
                                        boolean f3 = this.f38169h.mo66900f();
                                        boolean f4 = this.f38169h.mo66900f();
                                        this.f38169h.mo66900f();
                                        int a9 = this.f38169h.mo66886a(i2);
                                        boolean f5 = this.f38169h.mo66900f();
                                        int a10 = this.f38169h.mo66886a(7);
                                        int a11 = this.f38169h.mo66886a(8);
                                        int a12 = this.f38169h.mo66886a(4);
                                        int a13 = this.f38169h.mo66886a(4);
                                        this.f38169h.mo66897d(2);
                                        this.f38169h.mo66886a(6);
                                        this.f38169h.mo66897d(2);
                                        aVar2.mo69143a(f3, f4, a9, f5, a10, a11, a13, a12, this.f38169h.mo66886a(i2), this.f38169h.mo66886a(i2));
                                        if (this.f38176o != i9) {
                                            this.f38176o = i9;
                                            this.f38172k = this.f38171j[i9];
                                            break;
                                        }
                                        break;
                                    default:
                                        Log.w("Cea708Decoder", "Invalid C1 command: " + a3);
                                        break;
                                }
                            } else if (a3 <= 255) {
                                this.f38172k.mo69138a((char) (a3 & 255));
                            } else {
                                Log.w("Cea708Decoder", "Invalid base command: " + a3);
                            }
                            i2 = 3;
                        } else {
                            int a14 = this.f38169h.mo66886a(8);
                            if (a14 <= 31) {
                                if (a14 > 7) {
                                    if (a14 <= 15) {
                                        this.f38169h.mo66897d(8);
                                    } else if (a14 <= 23) {
                                        this.f38169h.mo66897d(16);
                                    } else if (a14 <= 31) {
                                        this.f38169h.mo66897d(24);
                                    }
                                }
                            } else if (a14 <= 127) {
                                if (a14 == 32) {
                                    this.f38172k.mo69138a(' ');
                                } else if (a14 == 33) {
                                    this.f38172k.mo69138a((char) Typography.nbsp);
                                } else if (a14 == 37) {
                                    this.f38172k.mo69138a((char) Typography.ellipsis);
                                } else if (a14 == 42) {
                                    this.f38172k.mo69138a(352);
                                } else if (a14 == 44) {
                                    this.f38172k.mo69138a(338);
                                } else if (a14 == 63) {
                                    this.f38172k.mo69138a(376);
                                } else if (a14 == 57) {
                                    this.f38172k.mo69138a((char) Typography.f44214tm);
                                } else if (a14 == 58) {
                                    this.f38172k.mo69138a(353);
                                } else if (a14 == 60) {
                                    this.f38172k.mo69138a(339);
                                } else if (a14 != 61) {
                                    switch (a14) {
                                        case 48:
                                            this.f38172k.mo69138a(9608);
                                            break;
                                        case 49:
                                            this.f38172k.mo69138a((char) Typography.leftSingleQuote);
                                            break;
                                        case 50:
                                            this.f38172k.mo69138a((char) Typography.rightSingleQuote);
                                            break;
                                        case 51:
                                            this.f38172k.mo69138a((char) Typography.leftDoubleQuote);
                                            break;
                                        case 52:
                                            this.f38172k.mo69138a((char) Typography.rightDoubleQuote);
                                            break;
                                        case 53:
                                            this.f38172k.mo69138a((char) Typography.bullet);
                                            break;
                                        default:
                                            switch (a14) {
                                                case 118:
                                                    this.f38172k.mo69138a(8539);
                                                    break;
                                                case 119:
                                                    this.f38172k.mo69138a(8540);
                                                    break;
                                                case 120:
                                                    this.f38172k.mo69138a(8541);
                                                    break;
                                                case 121:
                                                    this.f38172k.mo69138a(8542);
                                                    break;
                                                case 122:
                                                    this.f38172k.mo69138a(9474);
                                                    break;
                                                case 123:
                                                    this.f38172k.mo69138a(9488);
                                                    break;
                                                case 124:
                                                    this.f38172k.mo69138a(9492);
                                                    break;
                                                case 125:
                                                    this.f38172k.mo69138a(9472);
                                                    break;
                                                case 126:
                                                    this.f38172k.mo69138a(9496);
                                                    break;
                                                case 127:
                                                    this.f38172k.mo69138a(9484);
                                                    break;
                                                default:
                                                    Log.w("Cea708Decoder", "Invalid G2 character: " + a14);
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f38172k.mo69138a(8480);
                                }
                            } else if (a14 <= 159) {
                                if (a14 <= 135) {
                                    this.f38169h.mo66897d(32);
                                } else if (a14 <= 143) {
                                    this.f38169h.mo66897d(40);
                                } else if (a14 <= 159) {
                                    this.f38169h.mo66897d(2);
                                    this.f38169h.mo66897d(this.f38169h.mo66886a(6) * 8);
                                }
                            } else if (a14 > 255) {
                                Log.w("Cea708Decoder", "Invalid extended command: " + a14);
                            } else if (a14 == 160) {
                                this.f38172k.mo69138a(13252);
                            } else {
                                Log.w("Cea708Decoder", "Invalid G3 character: " + a14);
                                this.f38172k.mo69138a('_');
                            }
                            i2 = 3;
                        }
                        i2 = 3;
                        z = true;
                    }
                    if (z) {
                        this.f38173l = m40376h();
                    }
                }
            }
            this.f38175n = null;
        }
    }

    /* renamed from: h */
    private List<C14683ti> m40376h() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f38171j[i].mo69149f() && this.f38171j[i].mo69150g()) {
                arrayList.add(this.f38171j[i].mo69144b());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: i */
    private void m40377i() {
        for (int i = 0; i < 8; i++) {
            this.f38171j[i].mo69151h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68658a(cc1 cc1) {
        this.f38168g.mo67103a(cc1.f39147d.array(), cc1.f39147d.limit());
        while (this.f38168g.mo67098a() >= 3) {
            int r = this.f38168g.mo67126r() & 7;
            int i = r & 3;
            boolean z = false;
            boolean z2 = (r & 4) == 4;
            byte r2 = (byte) this.f38168g.mo67126r();
            byte r3 = (byte) this.f38168g.mo67126r();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    m40375g();
                    int i2 = (r2 & 192) >> 6;
                    byte b = r2 & 63;
                    if (b == 0) {
                        b = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    C14182b bVar = new C14182b(i2, b);
                    this.f38175n = bVar;
                    byte[] bArr = bVar.f38211c;
                    int i3 = bVar.f38212d;
                    bVar.f38212d = i3 + 1;
                    bArr[i3] = r3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    C13479j9.m37705a(z);
                    C14182b bVar2 = this.f38175n;
                    if (bVar2 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.f38211c;
                        int i4 = bVar2.f38212d;
                        int i5 = i4 + 1;
                        bVar2.f38212d = i5;
                        bArr2[i4] = r2;
                        bVar2.f38212d = i5 + 1;
                        bArr2[i5] = r3;
                    }
                }
                C14182b bVar3 = this.f38175n;
                if (bVar3.f38212d == (bVar3.f38210b * 2) - 1) {
                    m40375g();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public yb1 mo68659c() {
        List<C14683ti> list = this.f38173l;
        this.f38174m = list;
        return new C14380qe(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo68660f() {
        return this.f38173l != this.f38174m;
    }

    public void flush() {
        super.flush();
        this.f38173l = null;
        this.f38174m = null;
        this.f38176o = 0;
        this.f38172k = this.f38171j[0];
        m40377i();
        this.f38175n = null;
    }

    public /* bridge */ /* synthetic */ void release() {
    }
}

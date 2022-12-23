package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.me */
public final class C13972me extends C14272pe {

    /* renamed from: A */
    private static final int[] f37317A = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: B */
    private static final int[] f37318B = {193, ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR, ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: C */
    private static final int[] f37319C = {195, 227, ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: D */
    private static final boolean[] f37320D = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: w */
    private static final int[] f37321w = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: x */
    private static final int[] f37322x = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final int[] f37323y = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};

    /* renamed from: z */
    private static final int[] f37324z = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: g */
    private final fy0 f37325g = new fy0();

    /* renamed from: h */
    private final int f37326h;

    /* renamed from: i */
    private final int f37327i;

    /* renamed from: j */
    private final int f37328j;

    /* renamed from: k */
    private final ArrayList<C13973a> f37329k = new ArrayList<>();

    /* renamed from: l */
    private C13973a f37330l = new C13973a(0, 4);

    /* renamed from: m */
    private List<C14683ti> f37331m;

    /* renamed from: n */
    private List<C14683ti> f37332n;

    /* renamed from: o */
    private int f37333o;

    /* renamed from: p */
    private int f37334p;

    /* renamed from: q */
    private boolean f37335q;

    /* renamed from: r */
    private boolean f37336r;

    /* renamed from: s */
    private byte f37337s;

    /* renamed from: t */
    private byte f37338t;

    /* renamed from: u */
    private int f37339u = 0;

    /* renamed from: v */
    private boolean f37340v;

    /* renamed from: com.yandex.mobile.ads.impl.me$a */
    private static class C13973a {

        /* renamed from: a */
        private final List<C13974a> f37341a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f37342b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f37343c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f37344d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f37345e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f37346f;

        /* renamed from: g */
        private int f37347g;

        /* renamed from: h */
        private int f37348h;

        /* renamed from: com.yandex.mobile.ads.impl.me$a$a */
        private static class C13974a {

            /* renamed from: a */
            public final int f37349a;

            /* renamed from: b */
            public final boolean f37350b;

            /* renamed from: c */
            public int f37351c;

            public C13974a(int i, boolean z, int i2) {
                this.f37349a = i;
                this.f37350b = z;
                this.f37351c = i2;
            }
        }

        public C13973a(int i, int i2) {
            mo68667b(i);
            mo68671d(i2);
        }

        /* renamed from: d */
        public void mo68671d(int i) {
            this.f37348h = i;
        }

        /* renamed from: b */
        public void mo68667b(int i) {
            this.f37347g = i;
            this.f37341a.clear();
            this.f37342b.clear();
            this.f37343c.setLength(0);
            this.f37344d = 15;
            this.f37345e = 0;
            this.f37346f = 0;
        }

        /* renamed from: c */
        public boolean mo68669c() {
            return this.f37341a.isEmpty() && this.f37342b.isEmpty() && this.f37343c.length() == 0;
        }

        /* renamed from: d */
        public void mo68670d() {
            this.f37342b.add(m39413b());
            this.f37343c.setLength(0);
            this.f37341a.clear();
            int min = Math.min(this.f37348h, this.f37344d);
            while (this.f37342b.size() >= min) {
                this.f37342b.remove(0);
            }
        }

        /* renamed from: a */
        public void mo68666a(int i, boolean z) {
            this.f37341a.add(new C13974a(i, z, this.f37343c.length()));
        }

        /* renamed from: a */
        public void mo68664a() {
            int length = this.f37343c.length();
            if (length > 0) {
                this.f37343c.delete(length - 1, length);
                int size = this.f37341a.size() - 1;
                while (size >= 0) {
                    C13974a aVar = this.f37341a.get(size);
                    int i = aVar.f37351c;
                    if (i == length) {
                        aVar.f37351c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo68668c(int i) {
            this.f37347g = i;
        }

        /* renamed from: b */
        private SpannableString m39413b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37343c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            boolean z = false;
            int i6 = -1;
            while (i < this.f37341a.size()) {
                C13974a aVar = this.f37341a.get(i);
                boolean z2 = aVar.f37350b;
                int i7 = aVar.f37349a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C13972me.f37323y[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f37351c;
                i++;
                if (i8 != (i < this.f37341a.size() ? this.f37341a.get(i).f37351c : length)) {
                    if (i2 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        if (i5 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                        }
                        i4 = i8;
                        i5 = i6;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (!(i3 == -1 || i3 == length)) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
            }
            if (!(i4 == length || i5 == -1)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: a */
        public void mo68665a(char c) {
            this.f37343c.append(c);
        }

        /* renamed from: a */
        public C14683ti mo68663a(int i) {
            float f;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f37342b.size(); i4++) {
                spannableStringBuilder.append(this.f37342b.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(m39413b());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f37345e + this.f37346f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f37347g != 2 || (Math.abs(i6) >= 3 && length >= 0)) {
                    i = (this.f37347g != 2 || i6 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            if (this.f37347g == 1 || (i3 = this.f37344d) > 7) {
                i3 = (this.f37344d - 15) - 2;
                i2 = 2;
            } else {
                i2 = 0;
            }
            return new C14683ti((CharSequence) spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f, i, -3.4028235E38f, false, (int) ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public C13972me(String str, int i) {
        this.f37326h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f37328j = 0;
            this.f37327i = 0;
        } else if (i == 2) {
            this.f37328j = 1;
            this.f37327i = 0;
        } else if (i == 3) {
            this.f37328j = 0;
            this.f37327i = 1;
        } else if (i != 4) {
            bk0.m34270b("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f37328j = 0;
            this.f37327i = 0;
        } else {
            this.f37328j = 1;
            this.f37327i = 1;
        }
        m39402a(0);
        m39406i();
        this.f37340v = true;
    }

    /* renamed from: b */
    private void m39403b(int i) {
        this.f37334p = i;
        this.f37330l.mo68671d(i);
    }

    /* renamed from: h */
    private List<C14683ti> m39405h() {
        int size = this.f37329k.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C14683ti a = this.f37329k.get(i2).mo68663a(Integer.MIN_VALUE);
            arrayList.add(a);
            if (a != null) {
                i = Math.min(i, a.f40340e);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C14683ti tiVar = (C14683ti) arrayList.get(i3);
            if (tiVar != null) {
                if (tiVar.f40340e != i) {
                    tiVar = this.f37329k.get(i3).mo68663a(i);
                }
                arrayList2.add(tiVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: i */
    private void m39406i() {
        this.f37330l.mo68667b(this.f37333o);
        this.f37329k.clear();
        this.f37329k.add(this.f37330l);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0014 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68658a(com.yandex.mobile.ads.impl.cc1 r14) {
        /*
            r13 = this;
            com.yandex.mobile.ads.impl.fy0 r0 = r13.f37325g
            java.nio.ByteBuffer r1 = r14.f39147d
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r14 = r14.f39147d
            int r14 = r14.limit()
            r0.mo67103a((byte[]) r1, (int) r14)
            r14 = 0
            r0 = 1
            r1 = 0
        L_0x0014:
            com.yandex.mobile.ads.impl.fy0 r2 = r13.f37325g
            int r2 = r2.mo67098a()
            int r3 = r13.f37326h
            r4 = 3
            if (r2 < r3) goto L_0x0281
            r2 = 2
            if (r3 != r2) goto L_0x0024
            r3 = -4
            goto L_0x002b
        L_0x0024:
            com.yandex.mobile.ads.impl.fy0 r3 = r13.f37325g
            int r3 = r3.mo67126r()
            byte r3 = (byte) r3
        L_0x002b:
            com.yandex.mobile.ads.impl.fy0 r5 = r13.f37325g
            int r5 = r5.mo67126r()
            com.yandex.mobile.ads.impl.fy0 r6 = r13.f37325g
            int r6 = r6.mo67126r()
            r7 = r3 & 2
            if (r7 == 0) goto L_0x003c
            goto L_0x0014
        L_0x003c:
            r7 = r3 & 1
            int r8 = r13.f37327i
            if (r7 == r8) goto L_0x0043
            goto L_0x0014
        L_0x0043:
            r7 = r5 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            if (r7 != 0) goto L_0x004e
            if (r8 != 0) goto L_0x004e
            goto L_0x0014
        L_0x004e:
            boolean r9 = r13.f37335q
            r3 = r3 & 4
            r10 = 4
            if (r3 != r10) goto L_0x0061
            boolean[] r3 = f37320D
            boolean r5 = r3[r5]
            if (r5 == 0) goto L_0x0061
            boolean r3 = r3[r6]
            if (r3 == 0) goto L_0x0061
            r3 = 1
            goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            r13.f37335q = r3
            r5 = 16
            if (r3 == 0) goto L_0x0088
            r6 = r7 & 240(0xf0, float:3.36E-43)
            if (r6 != r5) goto L_0x006e
            r6 = 1
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 == 0) goto L_0x0088
            boolean r6 = r13.f37336r
            if (r6 == 0) goto L_0x0081
            byte r6 = r13.f37337s
            if (r6 != r7) goto L_0x0081
            byte r6 = r13.f37338t
            if (r6 != r8) goto L_0x0081
            r13.f37336r = r14
            r6 = 1
            goto L_0x008b
        L_0x0081:
            r13.f37336r = r0
            r13.f37337s = r7
            r13.f37338t = r8
            goto L_0x008a
        L_0x0088:
            r13.f37336r = r14
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r6 == 0) goto L_0x008e
            goto L_0x0014
        L_0x008e:
            if (r3 != 0) goto L_0x0098
            if (r9 == 0) goto L_0x0014
            r13.m39406i()
        L_0x0095:
            r1 = 1
            goto L_0x0014
        L_0x0098:
            if (r0 > r7) goto L_0x00a0
            r3 = 15
            if (r7 > r3) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r6 = 20
            r9 = 32
            if (r3 == 0) goto L_0x00aa
            r13.f37340v = r14
            goto L_0x00c5
        L_0x00aa:
            r3 = r7 & 247(0xf7, float:3.46E-43)
            if (r3 != r6) goto L_0x00b0
            r3 = 1
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            if (r3 == 0) goto L_0x00c5
            if (r8 == r9) goto L_0x00c3
            r3 = 47
            if (r8 == r3) goto L_0x00c3
            switch(r8) {
                case 37: goto L_0x00c3;
                case 38: goto L_0x00c3;
                case 39: goto L_0x00c3;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            switch(r8) {
                case 41: goto L_0x00c3;
                case 42: goto L_0x00c0;
                case 43: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x00c5
        L_0x00c0:
            r13.f37340v = r14
            goto L_0x00c5
        L_0x00c3:
            r13.f37340v = r0
        L_0x00c5:
            boolean r3 = r13.f37340v
            if (r3 != 0) goto L_0x00cb
            goto L_0x0014
        L_0x00cb:
            r3 = r7 & 224(0xe0, float:3.14E-43)
            if (r3 != 0) goto L_0x00d1
            r11 = 1
            goto L_0x00d2
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            if (r11 == 0) goto L_0x00d9
            int r11 = r7 >> 3
            r11 = r11 & r0
            r13.f37339u = r11
        L_0x00d9:
            int r11 = r13.f37339u
            int r12 = r13.f37328j
            if (r11 != r12) goto L_0x00e1
            r11 = 1
            goto L_0x00e2
        L_0x00e1:
            r11 = 0
        L_0x00e2:
            if (r11 != 0) goto L_0x00e6
            goto L_0x0014
        L_0x00e6:
            if (r3 != 0) goto L_0x00ea
            r1 = 1
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            if (r1 == 0) goto L_0x0263
            r1 = r7 & 247(0xf7, float:3.46E-43)
            r3 = 17
            if (r1 != r3) goto L_0x00fb
            r11 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r11 != r12) goto L_0x00fb
            r11 = 1
            goto L_0x00fc
        L_0x00fb:
            r11 = 0
        L_0x00fc:
            if (r11 == 0) goto L_0x010b
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r2 = r8 & 15
            int[] r3 = f37317A
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo68665a((char) r2)
            goto L_0x0095
        L_0x010b:
            r11 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r11 != r12) goto L_0x0117
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L_0x0117
            r12 = 1
            goto L_0x0118
        L_0x0117:
            r12 = 0
        L_0x0118:
            if (r12 == 0) goto L_0x0138
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r1.mo68664a()
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r2 = r7 & 1
            if (r2 != 0) goto L_0x012c
            r2 = r8 & 31
            int[] r3 = f37318B
            r2 = r3[r2]
            goto L_0x0132
        L_0x012c:
            r2 = r8 & 31
            int[] r3 = f37319C
            r2 = r3[r2]
        L_0x0132:
            char r2 = (char) r2
            r1.mo68665a((char) r2)
            goto L_0x0095
        L_0x0138:
            if (r1 != r3) goto L_0x0140
            r3 = r8 & 240(0xf0, float:3.36E-43)
            if (r3 != r9) goto L_0x0140
            r3 = 1
            goto L_0x0141
        L_0x0140:
            r3 = 0
        L_0x0141:
            if (r3 == 0) goto L_0x015a
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r1.mo68665a((char) r9)
            r1 = r8 & 1
            if (r1 != r0) goto L_0x014e
            r1 = 1
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            int r2 = r8 >> 1
            r2 = r2 & 7
            com.yandex.mobile.ads.impl.me$a r3 = r13.f37330l
            r3.mo68666a((int) r2, (boolean) r1)
            goto L_0x0095
        L_0x015a:
            r3 = r7 & 240(0xf0, float:3.36E-43)
            if (r3 != r5) goto L_0x0166
            r3 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r3 != r12) goto L_0x0166
            r3 = 1
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            if (r3 == 0) goto L_0x01cd
            int[] r1 = f37321w
            r2 = r7 & 7
            r1 = r1[r2]
            r2 = r8 & 32
            if (r2 == 0) goto L_0x0175
            r2 = 1
            goto L_0x0176
        L_0x0175:
            r2 = 0
        L_0x0176:
            if (r2 == 0) goto L_0x017a
            int r1 = r1 + 1
        L_0x017a:
            com.yandex.mobile.ads.impl.me$a r2 = r13.f37330l
            int r2 = r2.f37344d
            if (r1 == r2) goto L_0x01a3
            int r2 = r13.f37333o
            if (r2 == r0) goto L_0x019e
            com.yandex.mobile.ads.impl.me$a r2 = r13.f37330l
            boolean r2 = r2.mo68669c()
            if (r2 != 0) goto L_0x019e
            com.yandex.mobile.ads.impl.me$a r2 = new com.yandex.mobile.ads.impl.me$a
            int r3 = r13.f37333o
            int r4 = r13.f37334p
            r2.<init>(r3, r4)
            r13.f37330l = r2
            java.util.ArrayList<com.yandex.mobile.ads.impl.me$a> r3 = r13.f37329k
            r3.add(r2)
        L_0x019e:
            com.yandex.mobile.ads.impl.me$a r2 = r13.f37330l
            int unused = r2.f37344d = r1
        L_0x01a3:
            r1 = r8 & 16
            if (r1 != r5) goto L_0x01a9
            r1 = 1
            goto L_0x01aa
        L_0x01a9:
            r1 = 0
        L_0x01aa:
            r2 = r8 & 1
            if (r2 != r0) goto L_0x01b0
            r2 = 1
            goto L_0x01b1
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            int r3 = r8 >> 1
            r3 = r3 & 7
            com.yandex.mobile.ads.impl.me$a r4 = r13.f37330l
            if (r1 == 0) goto L_0x01bc
            r5 = 8
            goto L_0x01bd
        L_0x01bc:
            r5 = r3
        L_0x01bd:
            r4.mo68666a((int) r5, (boolean) r2)
            if (r1 == 0) goto L_0x0095
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            int[] r2 = f37322x
            r2 = r2[r3]
            int unused = r1.f37345e = r2
            goto L_0x0095
        L_0x01cd:
            r3 = 23
            r5 = 33
            if (r1 != r3) goto L_0x01db
            if (r8 < r5) goto L_0x01db
            r1 = 35
            if (r8 > r1) goto L_0x01db
            r1 = 1
            goto L_0x01dc
        L_0x01db:
            r1 = 0
        L_0x01dc:
            if (r1 == 0) goto L_0x01e7
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            int r8 = r8 + -32
            int unused = r1.f37346f = r8
            goto L_0x0095
        L_0x01e7:
            if (r11 != r6) goto L_0x01ef
            r1 = r8 & 240(0xf0, float:3.36E-43)
            if (r1 != r9) goto L_0x01ef
            r1 = 1
            goto L_0x01f0
        L_0x01ef:
            r1 = 0
        L_0x01f0:
            if (r1 == 0) goto L_0x0095
            if (r8 == r9) goto L_0x025e
            r1 = 41
            if (r8 == r1) goto L_0x0259
            switch(r8) {
                case 37: goto L_0x0211;
                case 38: goto L_0x0209;
                case 39: goto L_0x0201;
                default: goto L_0x01fb;
            }
        L_0x01fb:
            int r1 = r13.f37333o
            if (r1 != 0) goto L_0x0219
            goto L_0x0095
        L_0x0201:
            r13.m39402a((int) r0)
            r13.m39403b(r10)
            goto L_0x0095
        L_0x0209:
            r13.m39402a((int) r0)
            r13.m39403b(r4)
            goto L_0x0095
        L_0x0211:
            r13.m39402a((int) r0)
            r13.m39403b(r2)
            goto L_0x0095
        L_0x0219:
            if (r8 == r5) goto L_0x0252
            switch(r8) {
                case 44: goto L_0x0241;
                case 45: goto L_0x0230;
                case 46: goto L_0x022b;
                case 47: goto L_0x0220;
                default: goto L_0x021e;
            }
        L_0x021e:
            goto L_0x0095
        L_0x0220:
            java.util.List r1 = r13.m39405h()
            r13.f37331m = r1
            r13.m39406i()
            goto L_0x0095
        L_0x022b:
            r13.m39406i()
            goto L_0x0095
        L_0x0230:
            if (r1 != r0) goto L_0x0095
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            boolean r1 = r1.mo68669c()
            if (r1 != 0) goto L_0x0095
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r1.mo68670d()
            goto L_0x0095
        L_0x0241:
            java.util.List r1 = java.util.Collections.emptyList()
            r13.f37331m = r1
            int r1 = r13.f37333o
            if (r1 == r0) goto L_0x024d
            if (r1 != r4) goto L_0x0095
        L_0x024d:
            r13.m39406i()
            goto L_0x0095
        L_0x0252:
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r1.mo68664a()
            goto L_0x0095
        L_0x0259:
            r13.m39402a((int) r4)
            goto L_0x0095
        L_0x025e:
            r13.m39402a((int) r2)
            goto L_0x0095
        L_0x0263:
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r2 = r7 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r9
            int[] r3 = f37324z
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo68665a((char) r2)
            r1 = r8 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0095
            com.yandex.mobile.ads.impl.me$a r1 = r13.f37330l
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r9
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo68665a((char) r2)
            goto L_0x0095
        L_0x0281:
            if (r1 == 0) goto L_0x028f
            int r14 = r13.f37333o
            if (r14 == r0) goto L_0x0289
            if (r14 != r4) goto L_0x028f
        L_0x0289:
            java.util.List r14 = r13.m39405h()
            r13.f37331m = r14
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13972me.mo68658a(com.yandex.mobile.ads.impl.cc1):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public yb1 mo68659c() {
        List<C14683ti> list = this.f37331m;
        this.f37332n = list;
        return new C14380qe(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo68660f() {
        return this.f37331m != this.f37332n;
    }

    public void flush() {
        super.flush();
        this.f37331m = null;
        this.f37332n = null;
        m39402a(0);
        m39403b(4);
        m39406i();
        this.f37335q = false;
        this.f37336r = false;
        this.f37337s = 0;
        this.f37338t = 0;
        this.f37339u = 0;
        this.f37340v = true;
    }

    public void release() {
    }

    /* renamed from: a */
    private void m39402a(int i) {
        int i2 = this.f37333o;
        if (i2 != i) {
            this.f37333o = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f37329k.size(); i3++) {
                    this.f37329k.get(i3).mo68668c(i);
                }
                return;
            }
            m39406i();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f37331m = Collections.emptyList();
            }
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.List;

public final class ag1 extends s81 {

    /* renamed from: n */
    private final fy0 f30530n = new fy0();

    /* renamed from: o */
    private boolean f30531o;

    /* renamed from: p */
    private int f30532p;

    /* renamed from: q */
    private int f30533q;

    /* renamed from: r */
    private String f30534r;

    /* renamed from: s */
    private float f30535s;

    /* renamed from: t */
    private int f30536t;

    public ag1(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f30532p = bArr[24];
            this.f30533q = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f30534r = "Serif".equals(ih1.m37376a(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * Ascii.DC4;
            this.f30536t = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f30531o = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i);
                this.f30535s = f;
                this.f30535s = ih1.m37364a(f, 0.0f, 0.95f);
                return;
            }
            this.f30535s = 0.85f;
            return;
        }
        this.f30532p = 0;
        this.f30533q = -1;
        this.f30534r = str;
        this.f30531o = false;
        this.f30535s = 0.85f;
    }

    /* renamed from: b */
    private static void m33713b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yb1 mo65718a(byte[] bArr, int i, boolean z) throws ac1 {
        String str;
        char d;
        this.f30530n.mo67103a(bArr, i);
        fy0 fy0 = this.f30530n;
        m33712a(fy0.mo67098a() >= 2);
        int x = fy0.mo67132x();
        if (x == 0) {
            str = "";
        } else if (fy0.mo67098a() < 2 || !((d = fy0.mo67109d()) == 65279 || d == 65534)) {
            str = fy0.mo67100a(x, Charset.forName("UTF-8"));
        } else {
            str = fy0.mo67100a(x, Charset.forName("UTF-16"));
        }
        if (str.isEmpty()) {
            return bg1.f31323c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m33713b(spannableStringBuilder2, this.f30532p, 0, 0, spannableStringBuilder.length(), 16711680);
        m33711a(spannableStringBuilder2, this.f30533q, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.f30534r;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.f30535s;
        while (this.f30530n.mo67098a() >= 8) {
            int b = this.f30530n.mo67105b();
            int f2 = this.f30530n.mo67113f();
            int f3 = this.f30530n.mo67113f();
            if (f3 == 1937013100) {
                m33712a(this.f30530n.mo67098a() >= 2);
                int x2 = this.f30530n.mo67132x();
                for (int i2 = 0; i2 < x2; i2++) {
                    fy0 fy02 = this.f30530n;
                    m33712a(fy02.mo67098a() >= 12);
                    int x3 = fy02.mo67132x();
                    int x4 = fy02.mo67132x();
                    fy02.mo67114f(2);
                    int r = fy02.mo67126r();
                    fy02.mo67114f(1);
                    int f4 = fy02.mo67113f();
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    int i3 = x3;
                    int i4 = x4;
                    m33713b(spannableStringBuilder3, r, this.f30532p, i3, i4, 0);
                    m33711a(spannableStringBuilder3, f4, this.f30533q, i3, i4, 0);
                }
            } else if (f3 == 1952608120 && this.f30531o) {
                m33712a(this.f30530n.mo67098a() >= 2);
                int i5 = ih1.f34858a;
                f = Math.max(0.0f, Math.min(((float) this.f30530n.mo67132x()) / ((float) this.f30536t), 0.95f));
            }
            this.f30530n.mo67112e(b + f2);
        }
        return new bg1(new C14683ti((CharSequence) spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, false, (int) ViewCompat.MEASURED_STATE_MASK));
    }

    /* renamed from: a */
    private static void m33711a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m33712a(boolean z) throws ac1 {
        if (!z) {
            throw new ac1("Unexpected subtitle format.");
        }
    }
}

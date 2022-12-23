package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mobile.ads.C12066R;
import kotlin.jvm.internal.Intrinsics;

public class b30 extends AppCompatTextView {

    /* renamed from: a */
    private CharSequence f31205a;

    /* renamed from: b */
    private boolean f31206b;

    /* renamed from: c */
    private CharSequence f31207c;

    /* renamed from: d */
    private boolean f31208d;

    /* renamed from: e */
    private int f31209e;

    /* renamed from: f */
    private int f31210f;

    /* renamed from: g */
    private CharSequence f31211g;

    /* renamed from: h */
    private float f31212h;

    /* renamed from: i */
    private boolean f31213i;

    /* renamed from: j */
    private final C14267pa f31214j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b30(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b30(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b30(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: f */
    private final boolean m34120f() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65949a(int i) {
        this.f31210f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo65950d() {
        return this.f31210f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo65951e() {
        return this.f31208d;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.f31211g;
        return charSequence == null ? "" : charSequence;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31214j.mo69345b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31214j.mo69346c();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            super.onMeasure(r18, r19)
            int r1 = r17.getMeasuredWidth()
            int r2 = r17.getMeasuredHeight()
            int r3 = r0.f31209e
            int r4 = r0.f31210f
            r5 = 1
            if (r1 != r3) goto L_0x0016
            if (r2 == r4) goto L_0x0018
        L_0x0016:
            r0.f31213i = r5
        L_0x0018:
            boolean r1 = r0.f31213i
            if (r1 == 0) goto L_0x0154
            java.lang.CharSequence r1 = r0.f31207c
            boolean r2 = r17.m34120f()
            r3 = 0
            if (r2 != 0) goto L_0x0032
            java.lang.CharSequence r2 = r0.f31205a
            java.lang.String r4 = "…"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 0
            goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            java.lang.CharSequence r4 = r0.f31207c
            if (r4 != 0) goto L_0x003b
            if (r2 == 0) goto L_0x003b
            goto L_0x0140
        L_0x003b:
            if (r2 == 0) goto L_0x005d
            java.lang.CharSequence r2 = r0.f31211g
            if (r2 != 0) goto L_0x0043
            r2 = 0
            goto L_0x004a
        L_0x0043:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            r1 = r1 ^ r5
            r0.f31206b = r1
        L_0x004a:
            java.lang.CharSequence r1 = r0.f31207c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 != 0) goto L_0x0140
            r0.f31207c = r2
            r0.f31208d = r5
            super.setText(r2)
            r0.f31208d = r3
            goto L_0x0140
        L_0x005d:
            java.lang.CharSequence r1 = r0.f31211g
            if (r1 == 0) goto L_0x006a
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r2 = 0
            goto L_0x006b
        L_0x006a:
            r2 = 1
        L_0x006b:
            if (r2 == 0) goto L_0x006f
            goto L_0x011d
        L_0x006f:
            java.lang.CharSequence r2 = r0.f31205a
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r4 != 0) goto L_0x011a
            int r4 = r17.getMaxLines()
            if (r4 != 0) goto L_0x0084
            goto L_0x011a
        L_0x0084:
            int r4 = r17.getMeasuredWidth()
            int r7 = r17.getCompoundPaddingLeft()
            int r4 = r4 - r7
            int r7 = r17.getCompoundPaddingRight()
            int r4 = r4 - r7
            if (r4 > 0) goto L_0x0096
            goto L_0x011a
        L_0x0096:
            android.text.StaticLayout r15 = new android.text.StaticLayout
            android.text.TextPaint r9 = r17.getPaint()
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r12 = r17.getLineSpacingMultiplier()
            float r13 = r17.getLineSpacingExtra()
            r14 = 1
            r7 = r15
            r8 = r1
            r10 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            int r7 = r15.getLineCount()
            int r8 = r7 + -1
            float r8 = r15.getLineWidth(r8)
            int r9 = r17.getMaxLines()
            if (r7 < r9) goto L_0x0113
            int r9 = r17.getMaxLines()
            if (r7 != r9) goto L_0x00c9
            float r7 = (float) r4
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x00c9
            goto L_0x0113
        L_0x00c9:
            float r7 = r0.f31212h
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00d3
            r7 = 1
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            if (r7 == 0) goto L_0x00f9
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.text.TextPaint r9 = r17.getPaint()
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r12 = r17.getLineSpacingMultiplier()
            float r13 = r17.getLineSpacingExtra()
            r10 = 2147483647(0x7fffffff, float:NaN)
            r16 = 1
            r7 = r14
            r8 = r2
            r6 = r14
            r14 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            float r6 = r6.getLineWidth(r3)
            r0.f31212h = r6
        L_0x00f9:
            r0.f31206b = r5
            float r4 = (float) r4
            float r6 = r0.f31212h
            float r4 = r4 - r6
            int r6 = r17.getMaxLines()
            int r6 = r6 - r5
            int r6 = r15.getOffsetForHorizontal(r6, r4)
            float r7 = r15.getPrimaryHorizontal(r6)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x011b
            int r6 = r6 + -1
            goto L_0x011b
        L_0x0113:
            r0.f31206b = r5
            int r6 = r1.length()
            goto L_0x011b
        L_0x011a:
            r6 = 0
        L_0x011b:
            if (r6 > 0) goto L_0x011f
        L_0x011d:
            r1 = 0
            goto L_0x012f
        L_0x011f:
            int r4 = r1.length()
            if (r6 != r4) goto L_0x0126
            goto L_0x012f
        L_0x0126:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r1, r3, r6)
            r4.append(r2)
            r1 = r4
        L_0x012f:
            java.lang.CharSequence r2 = r0.f31207c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x0140
            r0.f31207c = r1
            r0.f31208d = r5
            super.setText(r1)
            r0.f31208d = r3
        L_0x0140:
            r0.f31213i = r3
            java.lang.CharSequence r1 = r0.f31207c
            if (r1 != 0) goto L_0x0147
            goto L_0x0154
        L_0x0147:
            boolean r2 = r0.f31206b
            if (r2 == 0) goto L_0x014d
            r6 = r1
            goto L_0x014e
        L_0x014d:
            r6 = 0
        L_0x014e:
            if (r6 != 0) goto L_0x0151
            goto L_0x0154
        L_0x0151:
            super.onMeasure(r18, r19)
        L_0x0154:
            int r1 = r17.getMeasuredWidth()
            r0.f31209e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b30.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f31213i = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f31208d) {
            this.f31211g = charSequence;
            requestLayout();
            this.f31213i = true;
        }
    }

    public final void setAutoEllipsize(boolean z) {
        this.f31214j.mo69344a(z && m34120f());
    }

    public final void setEllipsis(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "value");
        if (!Intrinsics.areEqual((Object) this.f31205a, (Object) charSequence)) {
            this.f31205a = charSequence;
            m34119a(charSequence);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        m34119a(this.f31205a);
        this.f31213i = true;
        this.f31212h = -1.0f;
        this.f31206b = false;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b30(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = "…";
        this.f31205a = charSequence;
        this.f31209e = -1;
        this.f31210f = -1;
        this.f31212h = -1.0f;
        this.f31214j = new C14267pa(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.EllipsizedTextView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
            try {
                CharSequence text = obtainStyledAttributes.getText(C12066R.styleable.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        m34119a(this.f31205a);
    }

    /* renamed from: a */
    private final void m34119a(CharSequence charSequence) {
        if (m34120f()) {
            super.setEllipsize((TextUtils.TruncateAt) null);
        } else if (Intrinsics.areEqual((Object) charSequence, (Object) "…")) {
            super.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            super.setEllipsize((TextUtils.TruncateAt) null);
            this.f31213i = true;
            this.f31212h = -1.0f;
            this.f31206b = false;
        }
        requestLayout();
    }
}

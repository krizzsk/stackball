package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.impl.vr1;

public final class tc1 extends AppCompatTextView {

    /* renamed from: a */
    private eg1 f40274a;

    /* renamed from: b */
    private int f40275b;

    /* renamed from: c */
    private boolean f40276c;

    /* renamed from: d */
    private boolean f40277d;

    /* renamed from: e */
    private C14665a f40278e;

    /* renamed from: f */
    private C14666b f40279f;

    /* renamed from: g */
    private vr1.C14921e f40280g;

    /* renamed from: h */
    private gg1 f40281h;

    /* renamed from: com.yandex.mobile.ads.impl.tc1$a */
    interface C14665a {
        /* renamed from: a */
        int mo65594a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.tc1$b */
    interface C14666b {
        /* renamed from: a */
        void mo65481a(tc1 tc1);
    }

    public tc1(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m42294a() {
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m42295a(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70141a(eg1 eg1, int i) {
        this.f40274a = eg1;
        this.f40275b = i;
        if (!isSelected()) {
            setTextAppearance(getContext(), this.f40275b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70146b(boolean z) {
        this.f40277d = z;
        setEllipsize(z ? TextUtils.TruncateAt.END : null);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
    }

    public void onMeasure(int i, int i2) {
        vr1.C14921e eVar;
        CharSequence c;
        TextPaint paint;
        Typeface typeface;
        gg1 gg1;
        TextPaint paint2 = getPaint();
        if (paint2 != null) {
            eg1 eg1 = this.f40274a;
            if (eg1 == null || (gg1 = this.f40281h) == null) {
                typeface = eg1 != null ? eg1.mo66829c() : null;
            } else {
                int ordinal = gg1.ordinal();
                if (ordinal == 1) {
                    typeface = eg1.mo66829c();
                } else if (ordinal == 2) {
                    typeface = eg1.mo66828b();
                } else if (ordinal != 3) {
                    typeface = eg1.mo66830d();
                } else {
                    typeface = eg1.mo66827a();
                }
            }
            if (typeface != null) {
                paint2.setTypeface(typeface);
            }
        }
        if (!this.f40277d) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int a = this.f40278e.mo65594a();
        if (a > 0 && (mode == 0 || size > a)) {
            i = View.MeasureSpec.makeMeasureSpec(a, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && layout.getEllipsisCount(0) > 0 && (eVar = this.f40280g) != null && (c = eVar.mo70563c()) != null && (paint = layout.getPaint()) != null) {
            TransformationMethod transformationMethod = getTransformationMethod();
            if (transformationMethod != null) {
                c = transformationMethod.getTransformation(c, this);
            }
            if (c != null) {
                setText(TextUtils.ellipsize(c, paint, ((float) ((int) layout.getLineMax(0))) - paint.measureText("..."), TextUtils.TruncateAt.END));
                super.onMeasure(i, i2);
            }
        }
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        vr1.C14921e eVar = this.f40280g;
        if (eVar == null) {
            return performClick;
        }
        eVar.mo70564d();
        return true;
    }

    public void setDefaultTypefaceType(gg1 gg1) {
        this.f40281h = gg1;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.2f);
    }

    public void setMaxWidthProvider(C14665a aVar) {
        this.f40278e = aVar;
    }

    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (this.f40276c && z2 && !isSelected()) {
            setTextAppearance(getContext(), this.f40275b);
        }
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }

    public void setTabPadding(int i, int i2, int i3, int i4) {
        ViewCompat.setPaddingRelative(this, i, i2, i3, i4);
    }

    public tc1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tc1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40278e = $$Lambda$tc1$ifPBMyOiBZPbkPKtizFoYWWe2_k.INSTANCE;
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener($$Lambda$tc1$OLRpLudOinvtr6MmbVNEonLXSpM.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70145b() {
        vr1.C14921e eVar = this.f40280g;
        setText(eVar == null ? null : eVar.mo70563c());
        C14666b bVar = this.f40279f;
        if (bVar != null) {
            bVar.mo65481a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70144a(boolean z) {
        this.f40276c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70142a(C14666b bVar) {
        this.f40279f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70143a(vr1.C14921e eVar) {
        CharSequence charSequence;
        if (eVar != this.f40280g) {
            this.f40280g = eVar;
            if (eVar == null) {
                charSequence = null;
            } else {
                charSequence = eVar.mo70563c();
            }
            setText(charSequence);
            C14666b bVar = this.f40279f;
            if (bVar != null) {
                bVar.mo65481a(this);
            }
        }
    }
}

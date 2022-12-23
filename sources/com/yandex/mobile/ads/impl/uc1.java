package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class uc1 extends LinearLayout implements C15334zo, l50 {

    /* renamed from: a */
    private final sc1<?> f40620a;

    /* renamed from: b */
    private final View f40621b;

    /* renamed from: c */
    private final do1 f40622c;

    /* renamed from: d */
    private final c71 f40623d;

    /* renamed from: e */
    private C12843cz f40624e;

    /* renamed from: f */
    private C12667bz f40625f;

    /* renamed from: g */
    private C15196xo f40626g;

    /* renamed from: h */
    private final List<C15055wl> f40627h;

    /* renamed from: i */
    private boolean f40628i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public uc1(Context context) {
        this(context, (AttributeSet) null, 2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ uc1(Context context, AttributeSet attributeSet, int i) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private LinearLayout.LayoutParams m42654c() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C12066R.dimen.div_separator_delimiter_height));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C12066R.dimen.div_horizontal_padding);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.topMargin = getResources().getDimensionPixelSize(C12066R.dimen.title_tab_title_separator_margin_top);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(C12066R.dimen.title_tab_title_margin_vertical);
        return layoutParams;
    }

    /* renamed from: d */
    private LinearLayout.LayoutParams m42655d() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C12066R.dimen.title_tab_title_height));
        layoutParams.gravity = GravityCompat.START;
        return layoutParams;
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f40627h;
    }

    /* renamed from: a */
    public /* synthetic */ void mo65870a(C15055wl wlVar) {
        l50.CC.$default$a(this, wlVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo65871b() {
        l50.CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f40628i) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f40626g;
        if (xoVar != null) {
            int save = canvas.save();
            try {
                xoVar.mo70928a(canvas);
                super.dispatchDraw(canvas);
                xoVar.mo70929b(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f40628i = true;
        C15196xo xoVar = this.f40626g;
        if (xoVar != null) {
            int save = canvas.save();
            try {
                xoVar.mo70928a(canvas);
                super.draw(canvas);
                xoVar.mo70929b(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.draw(canvas);
        }
        this.f40628i = false;
    }

    /* renamed from: e */
    public C12667bz mo70323e() {
        return this.f40625f;
    }

    /* renamed from: f */
    public C12843cz mo70324f() {
        return this.f40624e;
    }

    /* renamed from: g */
    public View mo70325g() {
        return this.f40621b;
    }

    /* renamed from: h */
    public do1 mo70326h() {
        return this.f40622c;
    }

    /* renamed from: i */
    public sc1<?> mo70327i() {
        return this.f40620a;
    }

    /* renamed from: j */
    public c71 mo70328j() {
        return this.f40623d;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15196xo xoVar = this.f40626g;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f40626g;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f40626g;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f40626g;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f40626g = xoVar2;
            invalidate();
        }
    }

    public void setDiv(C12667bz bzVar) {
        this.f40625f = bzVar;
    }

    public void setDivTabsAdapter(C12843cz czVar) {
        this.f40624e = czVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40627h = new ArrayList();
        setId(C12066R.C12068id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        sc1<?> sc1 = new sc1<>(context, (AttributeSet) null, C12066R.attr.divTabIndicatorLayoutStyle);
        sc1.setId(C12066R.C12068id.base_tabbed_title_container_scroller);
        sc1.setLayoutParams(m42655d());
        int dimensionPixelSize = sc1.getResources().getDimensionPixelSize(C12066R.dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = sc1.getResources().getDimensionPixelSize(C12066R.dimen.title_tab_title_margin_horizontal);
        sc1.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        sc1.setClipToPadding(false);
        this.f40620a = sc1;
        View view = new View(context);
        view.setId(C12066R.C12068id.div_tabs_divider);
        view.setLayoutParams(m42654c());
        view.setBackgroundResource(C12066R.color.div_separator_color);
        this.f40621b = view;
        c71 c71 = new c71(context);
        c71.setId(C12066R.C12068id.div_tabs_pager_container);
        c71.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c71.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(c71, true);
        this.f40623d = c71;
        do1 do1 = new do1(context);
        do1.setId(C12066R.C12068id.div_tabs_container_helper);
        do1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        do1.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        do1.addView(mo70328j());
        do1.addView(frameLayout);
        this.f40622c = do1;
        addView(mo70327i());
        addView(mo70325g());
        addView(mo70326h());
    }
}

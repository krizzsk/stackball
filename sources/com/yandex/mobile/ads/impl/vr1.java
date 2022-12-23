package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.tc1;
import com.yandex.mobile.ads.impl.vr1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class vr1 extends HorizontalScrollView {

    /* renamed from: D */
    private static final Pools.Pool<C14921e> f41404D = new Pools.SynchronizedPool(16);

    /* renamed from: A */
    private DataSetObserver f41405A;

    /* renamed from: B */
    private C14922f f41406B;

    /* renamed from: C */
    private final Pools.Pool<tc1> f41407C;

    /* renamed from: a */
    private final ArrayList<C14921e> f41408a;

    /* renamed from: b */
    private C14921e f41409b;

    /* renamed from: c */
    private final C14919d f41410c;

    /* renamed from: d */
    private int f41411d;

    /* renamed from: e */
    private int f41412e;

    /* renamed from: f */
    private int f41413f;

    /* renamed from: g */
    private int f41414g;

    /* renamed from: h */
    private int f41415h;

    /* renamed from: i */
    private eg1 f41416i;

    /* renamed from: j */
    private ColorStateList f41417j;

    /* renamed from: k */
    private boolean f41418k;

    /* renamed from: l */
    private int f41419l;

    /* renamed from: m */
    private final int f41420m;

    /* renamed from: n */
    private final int f41421n;

    /* renamed from: o */
    private final int f41422o;

    /* renamed from: p */
    private final boolean f41423p;

    /* renamed from: q */
    private final boolean f41424q;

    /* renamed from: r */
    private final int f41425r;

    /* renamed from: s */
    private final bv0 f41426s;

    /* renamed from: t */
    private int f41427t;

    /* renamed from: u */
    private int f41428u;

    /* renamed from: v */
    private int f41429v;

    /* renamed from: w */
    private C14917b f41430w;

    /* renamed from: x */
    private ValueAnimator f41431x;

    /* renamed from: y */
    private ViewPager f41432y;

    /* renamed from: z */
    private PagerAdapter f41433z;

    /* renamed from: com.yandex.mobile.ads.impl.vr1$b */
    public interface C14917b {
        /* renamed from: a */
        void mo69947a(C14921e eVar);

        /* renamed from: b */
        void mo69948b(C14921e eVar);

        /* renamed from: c */
        void mo69949c(C14921e eVar);
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr1$c */
    private class C14918c extends DataSetObserver {
        private C14918c() {
        }

        public void onChanged() {
            vr1.this.m43224g();
        }

        public void onInvalidated() {
            vr1.this.m43224g();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr1$e */
    public static final class C14921e {

        /* renamed from: a */
        private CharSequence f41448a;

        /* renamed from: b */
        private int f41449b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public vr1 f41450c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public tc1 f41451d;

        /* renamed from: c */
        public CharSequence mo70563c() {
            return this.f41448a;
        }

        /* renamed from: d */
        public void mo70564d() {
            vr1 vr1 = this.f41450c;
            if (vr1 != null) {
                vr1.mo70527b(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        private C14921e() {
            this.f41449b = -1;
        }

        /* renamed from: c */
        static void m43249c(C14921e eVar) {
            eVar.f41450c = null;
            eVar.f41451d = null;
            eVar.f41448a = null;
            eVar.f41449b = -1;
        }

        /* renamed from: b */
        public tc1 mo70562b() {
            return this.f41451d;
        }

        /* renamed from: a */
        public int mo70559a() {
            return this.f41449b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70561a(int i) {
            this.f41449b = i;
        }

        /* renamed from: a */
        public C14921e mo70560a(CharSequence charSequence) {
            this.f41448a = charSequence;
            tc1 tc1 = this.f41451d;
            if (tc1 != null) {
                tc1.mo70145b();
            }
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr1$f */
    public static class C14922f implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        private final WeakReference<vr1> f41452a;

        /* renamed from: b */
        private int f41453b;

        /* renamed from: c */
        private int f41454c;

        C14922f(vr1 vr1) {
            this.f41452a = new WeakReference<>(vr1);
        }

        /* renamed from: a */
        public void mo70565a() {
            this.f41454c = 0;
            this.f41453b = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f41453b = this.f41454c;
            this.f41454c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            vr1 vr1 = (vr1) this.f41452a.get();
            if (vr1 != null) {
                if (this.f41454c != 2 || this.f41453b == 1) {
                    vr1.m43213a(i, f, true, true);
                }
            }
        }

        public void onPageSelected(int i) {
            vr1 vr1 = (vr1) this.f41452a.get();
            if (vr1 != null && vr1.mo70529d() != i) {
                int i2 = this.f41454c;
                vr1.mo70527b(vr1.mo70530d(i), i2 == 0 || (i2 == 2 && this.f41453b == 0));
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr1$g */
    public static class C14923g implements C14917b {

        /* renamed from: a */
        private final ViewPager f41455a;

        C14923g(ViewPager viewPager) {
            this.f41455a = viewPager;
        }

        /* renamed from: a */
        public void mo69947a(C14921e eVar) {
        }

        /* renamed from: b */
        public void mo69948b(C14921e eVar) {
        }

        /* renamed from: c */
        public void mo69949c(C14921e eVar) {
            this.f41455a.setCurrentItem(eVar.mo70559a());
        }
    }

    public vr1(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m43224g() {
        int currentItem;
        mo70534h();
        PagerAdapter pagerAdapter = this.f41433z;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                mo70522a(mo70532f().mo70560a(this.f41433z.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f41432y;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != mo70529d() && currentItem < this.f41408a.size()) {
                mo70527b(mo70530d(currentItem), true);
                return;
            }
            return;
        }
        mo70534h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70520a(TextView textView) {
    }

    public void addView(View view) {
        m43215a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70527b(C14921e eVar, boolean z) {
        C14917b bVar;
        C14917b bVar2;
        C14921e eVar2 = this.f41409b;
        if (eVar2 != eVar) {
            if (z) {
                int a = eVar != null ? eVar.mo70559a() : -1;
                if (a != -1) {
                    m43223f(a);
                }
                C14921e eVar3 = this.f41409b;
                if ((eVar3 == null || eVar3.mo70559a() == -1) && a != -1) {
                    setScrollPosition(a, 0.0f, true);
                } else {
                    m43221c(a);
                }
            }
            C14921e eVar4 = this.f41409b;
            if (!(eVar4 == null || (bVar2 = this.f41430w) == null)) {
                bVar2.mo69947a(eVar4);
            }
            this.f41409b = eVar;
            if (eVar != null && (bVar = this.f41430w) != null) {
                bVar.mo69949c(eVar);
            }
        } else if (eVar2 != null) {
            C14917b bVar3 = this.f41430w;
            if (bVar3 != null) {
                bVar3.mo69948b(eVar2);
            }
            m43221c(eVar.mo70559a());
        }
    }

    /* renamed from: c */
    public C14922f mo70528c() {
        if (this.f41406B == null) {
            this.f41406B = new C14922f(this);
        }
        return this.f41406B;
    }

    /* renamed from: d */
    public C14921e mo70530d(int i) {
        return this.f41408a.get(i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f41426s.mo66128a(motionEvent);
        return dispatchTouchEvent;
    }

    /* renamed from: e */
    public void mo70531e(int i) {
        C14921e eVar;
        if (mo70529d() != i && (eVar = this.f41408a.get(i)) != null) {
            eVar.mo70564d();
        }
    }

    /* renamed from: f */
    public C14921e mo70532f() {
        C14921e eVar = (C14921e) ((Pools.SynchronizedPool) f41404D).acquire();
        if (eVar == null) {
            eVar = new C14921e();
        }
        vr1 unused = eVar.f41450c = this;
        tc1 acquire = this.f41407C.acquire();
        if (acquire == null) {
            acquire = mo69941a(getContext());
            m43217a(acquire);
        }
        acquire.mo70143a(eVar);
        acquire.setFocusable(true);
        int i = this.f41420m;
        if (i == -1) {
            i = this.f41429v == 0 ? this.f41422o : 0;
        }
        acquire.setMinimumWidth(i);
        tc1 unused2 = eVar.f41451d = acquire;
        return eVar;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: h */
    public void mo70534h() {
        int childCount = this.f41410c.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            tc1 tc1 = (tc1) this.f41410c.getChildAt(childCount);
            this.f41410c.removeViewAt(childCount);
            if (tc1 != null) {
                tc1.mo70143a((C14921e) null);
                tc1.setSelected(false);
                this.f41407C.release(tc1);
            }
            requestLayout();
        }
        Iterator<C14921e> it = this.f41408a.iterator();
        while (it.hasNext()) {
            C14921e next = it.next();
            it.remove();
            C14921e.m43249c(next);
            ((Pools.SynchronizedPool) f41404D).release(next);
        }
        this.f41409b = null;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = a91.m33643a(44) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(a, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f41421n;
            if (i3 <= 0) {
                i3 = size - a91.m33643a(56);
            }
            this.f41419l = i3;
        }
        super.onMeasure(i, i2);
        boolean z = true;
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.f41429v == 1 ? childAt.getMeasuredWidth() == getMeasuredWidth() : childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                z = false;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        this.f41426s.mo66129a(z);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f41426s.mo66127a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C14921e eVar;
        int a;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0 && i3 != i && (eVar = this.f41409b) != null && (a = eVar.mo70559a()) != -1) {
            setScrollPosition(a, 0.0f, true);
        }
    }

    public void setOnTabSelectedListener(C14917b bVar) {
        this.f41430w = bVar;
    }

    public void setScrollPosition(int i, float f, boolean z) {
        m43213a(i, f, z, true);
    }

    public void setSelectedTabIndicatorColor(int i) {
        C14919d dVar = this.f41410c;
        if (dVar.f41436b.getColor() != i) {
            dVar.f41436b.setColor(i);
            ViewCompat.postInvalidateOnAnimation(dVar);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C14919d dVar = this.f41410c;
        if (dVar.f41435a != i) {
            dVar.f41435a = i;
            ViewCompat.postInvalidateOnAnimation(dVar);
        }
    }

    public void setTabMode(int i) {
        if (i != this.f41429v) {
            this.f41429v = i;
            m43220b();
        }
    }

    public void setTabPaddings(int i, int i2, int i3, int i4) {
        this.f41411d = i;
        this.f41412e = i2;
        this.f41413f = i3;
        this.f41414g = i4;
        requestLayout();
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f41417j != colorStateList) {
            this.f41417j = colorStateList;
            int size = this.f41408a.size();
            for (int i = 0; i < size; i++) {
                tc1 b = this.f41408a.get(i).mo70562b();
                if (!(b == null || (colorStateList2 = this.f41417j) == null)) {
                    b.setTextColor(colorStateList2);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        for (int i = 0; i < this.f41408a.size(); i++) {
            this.f41408a.get(i).f41451d.setEnabled(z);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        C14922f fVar;
        ViewPager viewPager2 = this.f41432y;
        if (!(viewPager2 == null || (fVar = this.f41406B) == null)) {
            viewPager2.removeOnPageChangeListener(fVar);
        }
        if (viewPager != null) {
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                this.f41432y = viewPager;
                if (this.f41406B == null) {
                    this.f41406B = new C14922f(this);
                }
                this.f41406B.mo70565a();
                viewPager.addOnPageChangeListener(this.f41406B);
                setOnTabSelectedListener(new C14923g(viewPager));
                m43216a(adapter, true);
                return;
            }
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f41432y = null;
        setOnTabSelectedListener((C14917b) null);
        m43216a((PagerAdapter) null, true);
    }

    public boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.f41410c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }

    public vr1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, int i) {
        m43215a(view);
    }

    /* renamed from: d */
    public int mo70529d() {
        C14921e eVar = this.f41409b;
        if (eVar != null) {
            return eVar.mo70559a();
        }
        return -1;
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams m45939generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: finally extract failed */
    public vr1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41408a = new ArrayList<>();
        this.f41416i = eg1.f32973a;
        this.f41419l = Integer.MAX_VALUE;
        this.f41426s = new bv0((View) this);
        this.f41407C = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.TabLayout, i, C12066R.style.Widget_Design_YandexCoreIndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C12066R.styleable.IndicatorTabLayout, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(C12066R.styleable.IndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(C12066R.styleable.IndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.f41418k = obtainStyledAttributes2.getBoolean(C12066R.styleable.IndicatorTabLayout_tabTextBoldOnSelection, false);
        this.f41428u = obtainStyledAttributes2.getDimensionPixelSize(C12066R.styleable.IndicatorTabLayout_tabContentEnd, 0);
        this.f41423p = obtainStyledAttributes2.getBoolean(C12066R.styleable.IndicatorTabLayout_tabEllipsizeEnabled, true);
        this.f41424q = obtainStyledAttributes2.getBoolean(C12066R.styleable.IndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.f41425r = obtainStyledAttributes2.getDimensionPixelSize(C12066R.styleable.IndicatorTabLayout_tabScrollPadding, 0);
        obtainStyledAttributes2.recycle();
        C14919d dVar = new C14919d(context, dimensionPixelSize, dimensionPixelSize2);
        this.f41410c = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        dVar.mo70555b(obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabIndicatorHeight, 0));
        dVar.mo70552a(obtainStyledAttributes.getColor(C12066R.styleable.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabPadding, 0);
        this.f41414g = dimensionPixelSize3;
        this.f41413f = dimensionPixelSize3;
        this.f41412e = dimensionPixelSize3;
        this.f41411d = dimensionPixelSize3;
        this.f41411d = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.f41412e = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabPaddingTop, this.f41412e);
        this.f41413f = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabPaddingEnd, this.f41413f);
        this.f41414g = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabPaddingBottom, this.f41414g);
        int resourceId = obtainStyledAttributes.getResourceId(C12066R.styleable.TabLayout_tabTextAppearance, C12066R.style.TextAppearance_Design_Yandex_Tab);
        this.f41415h = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, C12066R.styleable.TextAppearance);
        try {
            this.f41417j = obtainStyledAttributes3.getColorStateList(C12066R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(C12066R.styleable.TabLayout_tabTextColor)) {
                this.f41417j = obtainStyledAttributes.getColorStateList(C12066R.styleable.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(C12066R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f41417j = m43212a(this.f41417j.getDefaultColor(), obtainStyledAttributes.getColor(C12066R.styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.f41420m = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabMinWidth, -1);
            this.f41421n = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabMaxWidth, -1);
            this.f41427t = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.TabLayout_tabContentStart, 0);
            this.f41429v = obtainStyledAttributes.getInt(C12066R.styleable.TabLayout_tabMode, 1);
            obtainStyledAttributes.recycle();
            this.f41422o = getResources().getDimensionPixelSize(C12066R.dimen.design_base_tab_scrollable_min_width);
            m43220b();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m43213a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f41410c.getChildCount()) {
            if (z2) {
                C14919d dVar = this.f41410c;
                ValueAnimator valueAnimator = dVar.f41441g;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    dVar.f41441g.cancel();
                }
                dVar.f41437c = i;
                dVar.f41438d = f;
                dVar.mo70551a();
            }
            ValueAnimator valueAnimator2 = this.f41431x;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f41431x.cancel();
            }
            scrollTo(m43211a(i, f), 0);
            if (z) {
                m43223f(round);
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m43215a(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public int m43222e() {
        return this.f41419l;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m43215a(view);
    }

    /* renamed from: c */
    private void m43221c(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
                C14919d dVar = this.f41410c;
                int childCount = dVar.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else if (dVar.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int a = m43211a(i, 0.0f);
                    if (scrollX != a) {
                        if (this.f41431x == null) {
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                            this.f41431x = ofInt;
                            ofInt.setInterpolator(C15154x7.f42465a);
                            this.f41431x.setDuration(300);
                            this.f41431x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    vr1.this.m43214a(valueAnimator);
                                }
                            });
                        }
                        this.f41431x.setIntValues(new int[]{scrollX, a});
                        this.f41431x.start();
                    }
                    this.f41410c.mo70553a(i, ErrorCode.GENERAL_WRAPPER_ERROR);
                    return;
                }
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m43212a(i, i2));
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr1$d */
    private static class C14919d extends LinearLayout {

        /* renamed from: a */
        protected int f41435a;

        /* renamed from: b */
        protected final Paint f41436b;

        /* renamed from: c */
        protected int f41437c = -1;

        /* renamed from: d */
        protected float f41438d;

        /* renamed from: e */
        protected int f41439e = -1;

        /* renamed from: f */
        protected int f41440f = -1;

        /* renamed from: g */
        protected ValueAnimator f41441g;

        /* renamed from: h */
        private final RectF f41442h;

        /* renamed from: i */
        private final int f41443i;

        /* renamed from: j */
        private final int f41444j;

        /* renamed from: k */
        private final int f41445k;

        /* renamed from: com.yandex.mobile.ads.impl.vr1$d$a */
        class C14920a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f41446a;

            C14920a(int i) {
                this.f41446a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C14919d dVar = C14919d.this;
                dVar.f41437c = this.f41446a;
                dVar.f41438d = 0.0f;
            }
        }

        C14919d(Context context, int i, int i2) {
            super(context);
            setId(C12066R.C12068id.sliding_oval_indicator);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f41436b = paint;
            paint.setAntiAlias(true);
            this.f41442h = new RectF();
            this.f41443i = i;
            this.f41444j = i2;
            this.f41445k = 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70553a(int i, int i2) {
            ValueAnimator valueAnimator = this.f41441g;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41441g.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                mo70551a();
                return;
            }
            mo70554a(i, i2, this.f41439e, this.f41440f, childAt.getLeft(), childAt.getRight());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo70555b(int i) {
            if (this.f41435a != i) {
                this.f41435a = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void draw(Canvas canvas) {
            int i = this.f41439e;
            if (i >= 0 && this.f41440f > i) {
                float height = (float) getHeight();
                float f = 0.0f;
                if (height > 0.0f) {
                    f = height / ((float) this.f41445k);
                }
                this.f41442h.set((float) this.f41439e, (float) this.f41443i, (float) this.f41440f, height - ((float) this.f41444j));
                canvas.drawRoundRect(this.f41442h, f, f, this.f41436b);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f41441g;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo70551a();
                return;
            }
            this.f41441g.cancel();
            mo70553a(this.f41437c, Math.round((1.0f - this.f41441g.getAnimatedFraction()) * ((float) this.f41441g.getDuration())));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70552a(int i) {
            if (this.f41436b.getColor() != i) {
                this.f41436b.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo70551a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f41437c);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f41438d > 0.0f && this.f41437c < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f41437c + 1);
                    float left = this.f41438d * ((float) childAt2.getLeft());
                    float f = this.f41438d;
                    i = (int) (left + ((1.0f - f) * ((float) i)));
                    i2 = (int) ((f * ((float) childAt2.getRight())) + ((1.0f - this.f41438d) * ((float) i2)));
                }
            }
            if (i != this.f41439e || i2 != this.f41440f) {
                this.f41439e = i;
                this.f41440f = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo70554a(int i, int i2, int i3, int i4, int i5, int i6) {
            if (i3 != i5 || i4 != i6) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.f41441g = ofFloat;
                ofFloat.setInterpolator(C15154x7.f42465a);
                ofFloat.setDuration((long) i2);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(i3, i5, i4, i6) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ int f$3;
                    public final /* synthetic */ int f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        vr1.C14919d.this.m43239a(this.f$1, this.f$2, this.f$3, this.f$4, valueAnimator);
                    }
                });
                ofFloat.addListener(new C14920a(i));
                ofFloat.start();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m43239a(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int round = i + Math.round(((float) (i2 - i)) * animatedFraction);
            int round2 = i3 + Math.round(animatedFraction * ((float) (i4 - i3)));
            if (round != this.f41439e || round2 != this.f41440f) {
                this.f41439e = round;
                this.f41440f = round2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    /* renamed from: f */
    private void m43223f(int i) {
        int childCount = this.f41410c.getChildCount();
        if (i < childCount && !this.f41410c.getChildAt(i).isSelected()) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f41410c.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* renamed from: a */
    public void mo70522a(C14921e eVar, boolean z) {
        if (eVar.f41450c == this) {
            tc1 b = eVar.f41451d;
            C14919d dVar = this.f41410c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            dVar.addView(b, layoutParams);
            if (z) {
                b.setSelected(true);
            }
            int size = this.f41408a.size();
            eVar.mo70561a(size);
            this.f41408a.add(size, eVar);
            int size2 = this.f41408a.size();
            for (int i = size + 1; i < size2; i++) {
                this.f41408a.get(i).mo70561a(i);
            }
            if (z) {
                eVar.mo70564d();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: b */
    private void m43220b() {
        int i;
        int i2;
        if (this.f41429v == 0) {
            i2 = Math.max(0, this.f41427t - this.f41411d);
            i = Math.max(0, this.f41428u - this.f41413f);
        } else {
            i2 = 0;
            i = 0;
        }
        ViewCompat.setPaddingRelative(this.f41410c, i2, 0, i, 0);
        if (this.f41429v != 1) {
            this.f41410c.setGravity(GravityCompat.START);
        } else {
            this.f41410c.setGravity(1);
        }
        for (int i3 = 0; i3 < this.f41410c.getChildCount(); i3++) {
            View childAt = this.f41410c.getChildAt(i3);
            int i4 = this.f41420m;
            if (i4 == -1) {
                i4 = this.f41429v == 0 ? this.f41422o : 0;
            }
            childAt.setMinimumWidth(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            childAt.requestLayout();
        }
    }

    /* renamed from: a */
    private void m43216a(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f41433z;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f41405A) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f41433z = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f41405A == null) {
                this.f41405A = new C14918c();
            }
            pagerAdapter.registerDataSetObserver(this.f41405A);
        }
        m43224g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public tc1 mo69941a(Context context) {
        return new tc1(context);
    }

    /* renamed from: a */
    private void m43217a(tc1 tc1) {
        tc1.setTabPadding(this.f41411d, this.f41412e, this.f41413f, this.f41414g);
        tc1.mo70141a(this.f41416i, this.f41415h);
        ColorStateList colorStateList = this.f41417j;
        if (colorStateList != null) {
            tc1.setTextColor(colorStateList);
        }
        tc1.mo70144a(this.f41418k);
        tc1.mo70146b(this.f41423p);
        tc1.setMaxWidthProvider(new tc1.C14665a() {
            /* renamed from: a */
            public final int mo65594a() {
                return vr1.this.m43222e();
            }
        });
        tc1.mo70142a((tc1.C14666b) new tc1.C14666b() {
            /* renamed from: a */
            public final void mo65481a(tc1 tc1) {
                vr1.this.mo70520a((TextView) tc1);
            }
        });
    }

    /* renamed from: a */
    private void m43215a(View view) {
        if (view instanceof nc1) {
            C14921e f = mo70532f();
            CharSequence charSequence = ((nc1) view).f37794a;
            if (charSequence != null) {
                f.mo70560a(charSequence);
            }
            mo70522a(f, this.f41408a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m43214a(ValueAnimator valueAnimator) {
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    /* renamed from: a */
    private int m43211a(int i, float f) {
        View childAt;
        int left;
        int width;
        int i2 = 0;
        if (this.f41429v != 0 || (childAt = this.f41410c.getChildAt(i)) == null) {
            return 0;
        }
        int width2 = childAt.getWidth();
        if (this.f41424q) {
            left = childAt.getLeft();
            width = this.f41425r;
        } else {
            int i3 = i + 1;
            View childAt2 = i3 < this.f41410c.getChildCount() ? this.f41410c.getChildAt(i3) : null;
            if (childAt2 != null) {
                i2 = childAt2.getWidth();
            }
            left = childAt.getLeft() + ((int) (((float) (width2 + i2)) * f * 0.5f)) + (childAt.getWidth() / 2);
            width = getWidth() / 2;
        }
        return left - width;
    }

    /* renamed from: a */
    public void mo70521a(eg1 eg1) {
        this.f41416i = eg1;
    }

    /* renamed from: a */
    private static ColorStateList m43212a(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }
}

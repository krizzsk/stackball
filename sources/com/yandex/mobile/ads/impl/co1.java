package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public class co1 extends FrameLayout {

    /* renamed from: a */
    private final ViewPager2 f31987a;

    /* renamed from: com.yandex.mobile.ads.impl.co1$a */
    static final class C12747a extends Lambda implements Function1<RecyclerView, Unit> {

        /* renamed from: b */
        public static final C12747a f31988b = new C12747a();

        C12747a() {
            super(1);
        }

        public Object invoke(Object obj) {
            RecyclerView recyclerView = (RecyclerView) obj;
            Intrinsics.checkNotNullParameter(recyclerView, "$this$withRecyclerView");
            recyclerView.getRecycledViewPool().clear();
            for (View next : ViewGroupKt.getChildren(recyclerView)) {
                next.setTranslationX(0.0f);
                next.setTranslationY(0.0f);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.co1$b */
    static final class C12748b extends Lambda implements Function1<RecyclerView, Unit> {

        /* renamed from: b */
        final /* synthetic */ RecyclerView.RecycledViewPool f31989b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12748b(RecyclerView.RecycledViewPool recycledViewPool) {
            super(1);
            this.f31989b = recycledViewPool;
        }

        public Object invoke(Object obj) {
            RecyclerView recyclerView = (RecyclerView) obj;
            Intrinsics.checkNotNullParameter(recyclerView, "$this$withRecyclerView");
            recyclerView.setRecycledViewPool(this.f31989b);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public co1(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public co1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final void m34787a(Function1<? super RecyclerView, Unit> function1) {
        View childAt = this.f31987a.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            function1.invoke(recyclerView);
        }
    }

    public final void addView(View view) {
        super.addView(view);
    }

    /* renamed from: d */
    public ViewPager2 mo66339d() {
        return this.f31987a;
    }

    public final void setOrientation(int i) {
        if (this.f31987a.getOrientation() != i) {
            this.f31987a.setOrientation(i);
            m34787a(C12747a.f31988b);
        }
    }

    public final void setRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "viewPool");
        m34787a(new C12748b(recycledViewPool));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setDescendantFocusability(393216);
        this.f31987a = viewPager2;
        addView(mo66339d());
    }
}

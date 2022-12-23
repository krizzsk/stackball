package com.yandex.mobile.ads.nativeads.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.k30;
import com.yandex.mobile.ads.impl.l71;
import com.yandex.mobile.ads.impl.q61;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0010B+\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0013"}, mo72093d2 = {"Lcom/yandex/mobile/ads/nativeads/view/pager/MultiBannerControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "listener", "", "setOnClickLeftButtonListener", "setOnClickRightButtonListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mobileads_externalRelease"}, mo72094k = 1, mo72095mv = {1, 5, 1})
public final class MultiBannerControlsContainer extends FrameLayout {

    /* renamed from: a */
    private final c20 f44090a = new c20();

    /* renamed from: b */
    private final q61 f44091b = new q61();

    /* renamed from: c */
    private final Lazy f44092c = LazyKt.lazy(new C15552a(this));

    /* renamed from: d */
    private final k30 f44093d = new k30();

    /* renamed from: e */
    private boolean f44094e = true;

    /* renamed from: com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer$a */
    static final class C15552a extends Lambda implements Function0<Boolean> {

        /* renamed from: b */
        final /* synthetic */ MultiBannerControlsContainer f44095b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15552a(MultiBannerControlsContainer multiBannerControlsContainer) {
            super(0);
            this.f44095b = multiBannerControlsContainer;
        }

        public Object invoke() {
            Boolean bool;
            d71 a = l71.m38631c().mo68362a(this.f44095b.getContext());
            if (a == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(a.mo66440E());
            }
            return Boolean.valueOf(Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer$b */
    public static final class C15553b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        final /* synthetic */ ViewPager2 f44096a;

        /* renamed from: b */
        final /* synthetic */ MultiBannerControlsContainer f44097b;

        C15553b(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f44096a = viewPager2;
            this.f44097b = multiBannerControlsContainer;
        }

        public void onPageSelected(int i) {
            RecyclerView.Adapter adapter = this.f44096a.getAdapter();
            this.f44097b.m45385a(i, adapter == null ? 0 : adapter.getItemCount());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: b */
    private final ImageView m45388b() {
        return (ImageView) this.f44091b.mo69499a(ImageView.class, findViewById(C12066R.C12068id.right_scroll_control_button));
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ImageView a = m45384a();
        if (a != null) {
            a.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ImageView b = m45388b();
        if (b != null) {
            b.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo71934a(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        viewPager2.registerOnPageChangeCallback(new C15553b(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MultiBannerControlsContainer.m45387a(MultiBannerControlsContainer.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m45387a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(multiBannerControlsContainer, "this$0");
        if (view instanceof ViewPager2) {
            boolean z = multiBannerControlsContainer.f44094e;
            boolean a = multiBannerControlsContainer.f44093d.mo68122a(view, i, i2, i3, i4);
            multiBannerControlsContainer.f44094e = a;
            if (a != z) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.m45385a(currentItem, adapter == null ? 0 : adapter.getItemCount());
            }
        }
    }

    /* renamed from: a */
    private final ImageView m45384a() {
        return (ImageView) this.f44091b.mo69499a(ImageView.class, findViewById(C12066R.C12068id.left_scroll_control_button));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m45385a(int i, int i2) {
        ImageView a = m45384a();
        ImageView b = m45388b();
        ImageView imageView = (ImageView) this.f44091b.mo69499a(ImageView.class, findViewById(C12066R.C12068id.dot_indicator));
        if (this.f44094e) {
            ImageView imageView2 = (ImageView) this.f44091b.mo69499a(ImageView.class, findViewById(C12066R.C12068id.dot_indicator));
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                c20 c20 = this.f44090a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                imageView2.setImageDrawable(c20.mo66189a(context, i, i2));
            }
            ImageView a2 = m45384a();
            ImageView b2 = m45388b();
            if (!((Boolean) this.f44092c.getValue()).booleanValue() || a2 == null || b2 == null) {
                if (a2 != null) {
                    a2.setVisibility(8);
                }
                if (b2 != null) {
                    b2.setVisibility(8);
                }
            } else if (i == 0) {
                a2.setVisibility(8);
                b2.setVisibility(0);
            } else if (i == i2 - 1) {
                a2.setVisibility(0);
                b2.setVisibility(8);
            } else {
                a2.setVisibility(0);
                b2.setVisibility(0);
            }
        } else {
            if (a != null) {
                a.setVisibility(8);
            }
            if (b != null) {
                b.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

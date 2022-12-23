package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class j10 {

    /* renamed from: com.yandex.mobile.ads.impl.j10$a */
    public static final class C13466a extends j10 {

        /* renamed from: a */
        private final C14325pw f35100a;

        /* renamed from: b */
        private final C14468rl f35101b;

        /* renamed from: com.yandex.mobile.ads.impl.j10$a$a */
        public static final class C13467a extends LinearSmoothScroller {
            C13467a(Context context) {
                super(context);
            }

            /* access modifiers changed from: protected */
            public int getHorizontalSnapPreference() {
                return -1;
            }

            /* access modifiers changed from: protected */
            public int getVerticalSnapPreference() {
                return -1;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13466a(C14325pw pwVar, C14468rl rlVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(pwVar, "view");
            Intrinsics.checkNotNullParameter(rlVar, "direction");
            this.f35100a = pwVar;
            this.f35101b = rlVar;
        }

        /* renamed from: a */
        public int mo67913a() {
            return k10.m38145a(this.f35100a, this.f35101b);
        }

        /* renamed from: b */
        public int mo67915b() {
            RecyclerView.LayoutManager layoutManager = this.f35100a.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.getItemCount();
        }

        /* renamed from: a */
        public void mo67914a(int i) {
            int b = mo67915b();
            if (i >= 0 && i < b) {
                C13467a aVar = new C13467a(this.f35100a.getContext());
                aVar.setTargetPosition(i);
                RecyclerView.LayoutManager layoutManager = this.f35100a.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(aVar);
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.j10$b */
    public static final class C13468b extends j10 {

        /* renamed from: a */
        private final C15118wv f35102a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13468b(C15118wv wvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(wvVar, "view");
            this.f35102a = wvVar;
        }

        /* renamed from: a */
        public int mo67913a() {
            return this.f35102a.mo66339d().getCurrentItem();
        }

        /* renamed from: b */
        public int mo67915b() {
            RecyclerView.Adapter adapter = this.f35102a.mo66339d().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        /* renamed from: a */
        public void mo67914a(int i) {
            int b = mo67915b();
            if (i >= 0 && i < b) {
                this.f35102a.mo66339d().setCurrentItem(i, true);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.j10$c */
    public static final class C13469c extends j10 {

        /* renamed from: a */
        private final C13016ey f35103a;

        /* renamed from: b */
        private final C14468rl f35104b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13469c(C13016ey eyVar, C14468rl rlVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(eyVar, "view");
            Intrinsics.checkNotNullParameter(rlVar, "direction");
            this.f35103a = eyVar;
            this.f35104b = rlVar;
        }

        /* renamed from: a */
        public int mo67913a() {
            return k10.m38145a(this.f35103a, this.f35104b);
        }

        /* renamed from: b */
        public int mo67915b() {
            RecyclerView.LayoutManager layoutManager = this.f35103a.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.getItemCount();
        }

        /* renamed from: a */
        public void mo67914a(int i) {
            int b = mo67915b();
            if (i >= 0 && i < b) {
                this.f35103a.smoothScrollToPosition(i);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.j10$d */
    public static final class C13470d extends j10 {

        /* renamed from: a */
        private final uc1 f35105a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13470d(uc1 uc1) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(uc1, "view");
            this.f35105a = uc1;
        }

        /* renamed from: a */
        public int mo67913a() {
            return this.f35105a.mo70328j().getCurrentItem();
        }

        /* renamed from: b */
        public int mo67915b() {
            PagerAdapter adapter = this.f35105a.mo70328j().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.getCount();
        }

        /* renamed from: a */
        public void mo67914a(int i) {
            int b = mo67915b();
            if (i >= 0 && i < b) {
                this.f35105a.mo70328j().setCurrentItem(i, true);
            }
        }
    }

    private j10() {
    }

    public /* synthetic */ j10(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo67913a();

    /* renamed from: a */
    public abstract void mo67914a(int i);

    /* renamed from: b */
    public abstract int mo67915b();
}

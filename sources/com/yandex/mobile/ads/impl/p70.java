package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class p70 {

    /* renamed from: f */
    public static final C14260a f38534f = new C14260a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final ViewGroup.LayoutParams f38535a;

    /* renamed from: b */
    private Integer f38536b;

    /* renamed from: c */
    private Integer f38537c;

    /* renamed from: d */
    private Integer f38538d;

    /* renamed from: e */
    private Integer f38539e;

    /* renamed from: com.yandex.mobile.ads.impl.p70$a */
    public static final class C14260a {
        private C14260a() {
        }

        public /* synthetic */ C14260a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static void m40687a(C14260a aVar, View view, Integer num, Integer num2, int i) {
            p70 p70 = null;
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C14262c) {
                p70 = ((C14262c) layoutParams).mo69326a();
            } else if (layoutParams instanceof C14261b) {
                p70 = ((C14261b) layoutParams).mo69325a();
            }
            if (p70 != null) {
                p70.m40685a(p70, num, num2);
                return;
            }
            if (num != null) {
                view.getLayoutParams().width = num.intValue();
            }
            if (num2 != null) {
                view.getLayoutParams().height = num2.intValue();
            }
            view.requestLayout();
        }

        /* renamed from: b */
        public static void m40688b(C14260a aVar, View view, Integer num, Integer num2, int i) {
            p70 p70 = null;
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C14262c) {
                p70 = ((C14262c) layoutParams).mo69326a();
            } else if (layoutParams instanceof C14261b) {
                p70 = ((C14261b) layoutParams).mo69325a();
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                C14262c cVar = new C14262c((LinearLayout.LayoutParams) layoutParams);
                view.setLayoutParams(cVar);
                p70 = cVar.mo69326a();
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                C14261b bVar = new C14261b((FrameLayout.LayoutParams) layoutParams);
                view.setLayoutParams(bVar);
                p70 = bVar.mo69325a();
            }
            if (p70 != null) {
                p70.m40686b(p70, num, num2);
            } else {
                if (num != null) {
                    view.getLayoutParams().width = num.intValue();
                }
                if (num2 != null) {
                    view.getLayoutParams().height = num2.intValue();
                }
            }
            view.requestLayout();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p70$b */
    public static final class C14261b extends FrameLayout.LayoutParams {

        /* renamed from: a */
        private final p70 f38540a = new p70(this);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14261b(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            Intrinsics.checkNotNullParameter(layoutParams, "source");
        }

        /* renamed from: a */
        public final p70 mo69325a() {
            return this.f38540a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p70$c */
    public static final class C14262c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        private final p70 f38541a = new p70(this);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14262c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            Intrinsics.checkNotNullParameter(layoutParams, "source");
        }

        /* renamed from: a */
        public final p70 mo69326a() {
            return this.f38541a;
        }
    }

    public p70(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "wrappedParams");
        this.f38535a = layoutParams;
    }

    /* renamed from: a */
    public static final void m40685a(p70 p70, Integer num, Integer num2) {
        p70.f38537c = num;
        p70.f38539e = num2;
        if (p70.f38536b == null && num != null) {
            p70.f38535a.width = num.intValue();
        }
        if (p70.f38538d == null && num2 != null) {
            p70.f38535a.height = num2.intValue();
        }
    }

    /* renamed from: b */
    public static final void m40686b(p70 p70, Integer num, Integer num2) {
        p70.f38536b = num;
        p70.f38538d = num2;
        if (num == null) {
            num = p70.f38537c;
        }
        if (num != null) {
            p70.f38535a.width = num.intValue();
        }
        if (num2 == null) {
            num2 = p70.f38539e;
        }
        if (num2 != null) {
            p70.f38535a.height = num2.intValue();
        }
    }
}

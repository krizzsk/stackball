package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.mobile.ads.impl.C13091fq;
import com.yandex.mobile.ads.impl.C13111fs;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.jvm.internal.Intrinsics;

public class a10 extends w10<View> {

    /* renamed from: a */
    private final Context f30407a;

    /* renamed from: b */
    private final eo1 f30408b;

    /* renamed from: c */
    private final u00 f30409c;

    @Inject
    public a10(@Named("themed_context") Context context, eo1 eo1, u00 u00) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eo1, "viewPool");
        Intrinsics.checkNotNullParameter(u00, "validator");
        this.f30407a = context;
        this.f30408b = eo1;
        this.f30409c = u00;
        eo1.mo65947a("DIV2.TEXT_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33553a(a10.this);
            }
        }, 20);
        eo1.mo65947a("DIV2.IMAGE_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33554b(a10.this);
            }
        }, 20);
        eo1.mo65947a("DIV2.IMAGE_GIF_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33559g(a10.this);
            }
        }, 3);
        eo1.mo65947a("DIV2.OVERLAP_CONTAINER_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33560h(a10.this);
            }
        }, 8);
        eo1.mo65947a("DIV2.LINEAR_CONTAINER_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33561i(a10.this);
            }
        }, 12);
        eo1.mo65947a("DIV2.GRID_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33562j(a10.this);
            }
        }, 4);
        eo1.mo65947a("DIV2.GALLERY_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33563k(a10.this);
            }
        }, 4);
        eo1.mo65947a("DIV2.SNAPPY_GALLERY_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33564l(a10.this);
            }
        }, 2);
        eo1.mo65947a("DIV2.PAGER_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33565m(a10.this);
            }
        }, 2);
        eo1.mo65947a("DIV2.TAB_VIEW", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33566n(a10.this);
            }
        }, 2);
        eo1.mo65947a("DIV2.STATE", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33555c(a10.this);
            }
        }, 4);
        eo1.mo65947a("DIV2.CUSTOM", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33556d(a10.this);
            }
        }, 2);
        eo1.mo65947a("DIV2.INDICATOR", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33557e(a10.this);
            }
        }, 2);
        eo1.mo65947a("DIV2.SLIDER", new ao1() {
            /* renamed from: a */
            public final View mo65489a() {
                return a10.m33558f(a10.this);
            }
        }, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14933vt m33554b(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C14933vt(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C14429qy m33555c(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C14429qy(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C15316zi m33556d(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C15316zi(a10.f30407a);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C14633sv m33557e(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C14633sv(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C12931dy m33558f(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C12931dy(a10.f30407a, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C14628ss m33559g(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C14628ss(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C12996es m33560h(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C12996es(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C13140fv m33561i(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C13140fv(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C12417at m33562j(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C12417at(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C14325pw m33563k(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C14325pw(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C13016ey m33564l(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C13016ey(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C15118wv m33565m(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C15118wv(a10.f30407a, (AttributeSet) null, 0, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final uc1 m33566n(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new uc1(a10.f30407a, (AttributeSet) null);
    }

    /* renamed from: a */
    public Object mo65638a(C13091fq fqVar, j50 j50) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(fqVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        if (C13091fq.C13100i.OVERLAP == fqVar.f33550v.mo66924a(j50)) {
            View a = this.f30408b.mo65946a("DIV2.OVERLAP_CONTAINER_VIEW");
            Intrinsics.checkNotNullExpressionValue(a, "{\n            viewPool.o…RLAP_CONTAINER)\n        }");
            viewGroup = (ViewGroup) a;
        } else {
            View a2 = this.f30408b.mo65946a("DIV2.LINEAR_CONTAINER_VIEW");
            Intrinsics.checkNotNullExpressionValue(a2, "{\n            viewPool.o…NEAR_CONTAINER)\n        }");
            viewGroup = (ViewGroup) a2;
        }
        for (C15177xl b : fqVar.f33547s) {
            viewGroup.addView(mo65649b(b, j50));
        }
        return viewGroup;
    }

    /* renamed from: b */
    public View mo65649b(C15177xl xlVar, j50 j50) {
        Intrinsics.checkNotNullParameter(xlVar, "div");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        u00 u00 = this.f30409c;
        u00.getClass();
        Intrinsics.checkNotNullParameter(xlVar, "div");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        if (((Boolean) u00.mo70622a(xlVar, j50)).booleanValue()) {
            return (View) mo70622a(xlVar, j50);
        }
        return new Space(this.f30407a);
    }

    /* renamed from: a */
    public Object mo65645a(C14406qq qqVar, j50 j50) {
        Intrinsics.checkNotNullParameter(qqVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.CUSTOM");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_CUSTOM)");
        return a;
    }

    /* renamed from: a */
    public Object mo65639a(C13111fs fsVar, j50 j50) {
        Intrinsics.checkNotNullParameter(fsVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        if (C13111fs.C13130m.PAGING == fsVar.f33667x.mo66924a(j50)) {
            View a = this.f30408b.mo65946a("DIV2.SNAPPY_GALLERY_VIEW");
            Intrinsics.checkNotNullExpressionValue(a, "{\n            viewPool.o…SNAPPY_GALLERY)\n        }");
            return a;
        }
        View a2 = this.f30408b.mo65946a("DIV2.GALLERY_VIEW");
        Intrinsics.checkNotNullExpressionValue(a2, "{\n            viewPool.o…in(TAG_GALLERY)\n        }");
        return a2;
    }

    /* renamed from: a */
    public Object mo65641a(C13885ls lsVar, j50 j50) {
        Intrinsics.checkNotNullParameter(lsVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.IMAGE_GIF_VIEW");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_GIF_IMAGE)");
        return a;
    }

    /* renamed from: a */
    public Object mo65647a(C14924vs vsVar, j50 j50) {
        Intrinsics.checkNotNullParameter(vsVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.GRID_VIEW");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_GRID)");
        C12417at atVar = (C12417at) a;
        for (C15177xl b : vsVar.f41511s) {
            atVar.addView(mo65649b(b, j50));
        }
        return atVar;
    }

    /* renamed from: a */
    public Object mo65637a(C12997et etVar, j50 j50) {
        Intrinsics.checkNotNullParameter(etVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.IMAGE_VIEW");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_IMAGE)");
        return a;
    }

    /* renamed from: a */
    public Object mo65648a(C15107wt wtVar, j50 j50) {
        Intrinsics.checkNotNullParameter(wtVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.INDICATOR");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_INDICATOR)");
        return a;
    }

    /* renamed from: a */
    public Object mo65644a(C14215ov ovVar, j50 j50) {
        Intrinsics.checkNotNullParameter(ovVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.PAGER_VIEW");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_PAGER)");
        return a;
    }

    /* renamed from: a */
    public Object mo65646a(C14841uw uwVar, j50 j50) {
        Intrinsics.checkNotNullParameter(uwVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return new C12458ax(this.f30407a, (AttributeSet) null, 0, 6);
    }

    /* renamed from: a */
    public Object mo65643a(C14141nx nxVar, j50 j50) {
        Intrinsics.checkNotNullParameter(nxVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.SLIDER");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_SLIDER)");
        return a;
    }

    /* renamed from: a */
    public Object mo65640a(C13358hy hyVar, j50 j50) {
        Intrinsics.checkNotNullParameter(hyVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.STATE");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_STATE)");
        return a;
    }

    /* renamed from: a */
    public Object mo65636a(C12667bz bzVar, j50 j50) {
        Intrinsics.checkNotNullParameter(bzVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.TAB_VIEW");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_TABS)");
        return a;
    }

    /* renamed from: a */
    public Object mo65642a(C13915lz lzVar, j50 j50) {
        Intrinsics.checkNotNullParameter(lzVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        View a = this.f30408b.mo65946a("DIV2.TEXT_VIEW");
        Intrinsics.checkNotNullExpressionValue(a, "viewPool.obtain(TAG_TEXT)");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final C12925dv m33553a(a10 a10) {
        Intrinsics.checkNotNullParameter(a10, "this$0");
        return new C12925dv(a10.f30407a, (AttributeSet) null, 0, 6);
    }
}

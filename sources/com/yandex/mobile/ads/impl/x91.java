package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

public final class x91 implements View.OnLayoutChangeListener {

    /* renamed from: b */
    private final C15157xa f42477b;

    /* renamed from: c */
    private final C15240yb f42478c;

    /* renamed from: d */
    private final y91 f42479d;

    /* renamed from: e */
    private final hd0 f42480e;

    /* renamed from: f */
    private final Bitmap f42481f;

    public x91(C15157xa xaVar, C15240yb ybVar, y91 y91, hd0 hd0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(xaVar, "axisBackgroundColorProvider");
        Intrinsics.checkNotNullParameter(ybVar, "bestSmartCenterProvider");
        Intrinsics.checkNotNullParameter(y91, "smartCenterMatrixScaler");
        Intrinsics.checkNotNullParameter(hd0, "imageValue");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f42477b = xaVar;
        this.f42478c = ybVar;
        this.f42479d = y91;
        this.f42480e = hd0;
        this.f42481f = bitmap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r0 == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43988a(com.yandex.mobile.ads.impl.x91 r6, android.graphics.RectF r7, android.widget.ImageView r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "$viewRect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "$view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.yandex.mobile.ads.impl.xa r0 = r6.f42477b
            com.yandex.mobile.ads.impl.hd0 r1 = r6.f42480e
            r0.getClass()
            java.lang.String r0 = "imageValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.yandex.mobile.ads.impl.aa1 r0 = r1.mo67523c()
            r1 = 0
            if (r0 != 0) goto L_0x0024
            r0 = r1
            goto L_0x0028
        L_0x0024:
            com.yandex.mobile.ads.impl.za r0 = r0.mo65709a()
        L_0x0028:
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x002d
            goto L_0x006c
        L_0x002d:
            java.lang.String r4 = r0.mo71184a()
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = r0.mo71187d()
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = r0.mo71184a()
            java.lang.String r5 = r0.mo71187d()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            java.lang.String r5 = r0.mo71185b()
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r0.mo71186c()
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r0.mo71185b()
            java.lang.String r0 = r0.mo71186c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r4 != 0) goto L_0x006d
            if (r0 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0099
            com.yandex.mobile.ads.impl.xa r0 = r6.f42477b
            com.yandex.mobile.ads.impl.hd0 r2 = r6.f42480e
            java.lang.String r7 = r0.mo70851a(r7, r2)
            com.yandex.mobile.ads.impl.hd0 r0 = r6.f42480e
            com.yandex.mobile.ads.impl.aa1 r0 = r0.mo67523c()
            if (r0 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            com.yandex.mobile.ads.impl.s91 r1 = r0.mo65710b()
        L_0x0084:
            if (r1 != 0) goto L_0x0087
            goto L_0x00ab
        L_0x0087:
            if (r7 == 0) goto L_0x0091
            com.yandex.mobile.ads.impl.y91 r0 = r6.f42479d
            android.graphics.Bitmap r6 = r6.f42481f
            r0.mo71013a((android.widget.ImageView) r8, (android.graphics.Bitmap) r6, (com.yandex.mobile.ads.impl.s91) r1, (java.lang.String) r7)
            goto L_0x00ab
        L_0x0091:
            com.yandex.mobile.ads.impl.y91 r7 = r6.f42479d
            android.graphics.Bitmap r6 = r6.f42481f
            r7.mo71012a(r8, r6, r1)
            goto L_0x00ab
        L_0x0099:
            com.yandex.mobile.ads.impl.yb r0 = r6.f42478c
            com.yandex.mobile.ads.impl.hd0 r1 = r6.f42480e
            com.yandex.mobile.ads.impl.s91 r7 = r0.mo71014a(r7, r1)
            if (r7 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            com.yandex.mobile.ads.impl.y91 r0 = r6.f42479d
            android.graphics.Bitmap r6 = r6.f42481f
            r0.mo71012a(r8, r6, r7)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x91.m43988a(com.yandex.mobile.ads.impl.x91, android.graphics.RectF, android.widget.ImageView):void");
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView != null) {
            int i9 = i7 - i5;
            boolean z = false;
            boolean z2 = (i3 - i == i9 && i4 - i2 == i8 - i6) ? false : true;
            if (!(i4 == i2 || i == i3)) {
                z = true;
            }
            if (z2 && z) {
                imageView.post(new Runnable(new RectF(0.0f, 0.0f, (float) imageView.getWidth(), (float) imageView.getHeight()), imageView) {
                    public final /* synthetic */ RectF f$1;
                    public final /* synthetic */ ImageView f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        x91.m43988a(x91.this, this.f$1, this.f$2);
                    }
                });
            }
        }
    }
}

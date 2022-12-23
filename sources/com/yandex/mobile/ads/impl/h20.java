package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

class h20 implements C13698kc<Drawable> {

    /* renamed from: a */
    private final w61 f34206a = new w61();

    /* renamed from: b */
    private final C14093nc f34207b = new C14093nc();

    /* renamed from: com.yandex.mobile.ads.impl.h20$a */
    private static class C13272a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f34208a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f34209b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f34210c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f34211d;

        C13272a(int i) {
            this.f34208a = Color.alpha(i);
            this.f34209b = Color.red(i);
            this.f34210c = Color.green(i);
            this.f34211d = Color.blue(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13272a.class != obj.getClass()) {
                return false;
            }
            C13272a aVar = (C13272a) obj;
            if (this.f34208a == aVar.f34208a && this.f34209b == aVar.f34209b && this.f34210c == aVar.f34210c && this.f34211d == aVar.f34211d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f34208a * 31) + this.f34209b) * 31) + this.f34210c) * 31) + this.f34211d;
        }
    }

    h20() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67392a(android.graphics.drawable.Drawable r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0012
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r1 = r0.getBitmap()
            if (r1 == 0) goto L_0x0012
            android.graphics.Bitmap r6 = r0.getBitmap()
            goto L_0x0018
        L_0x0012:
            com.yandex.mobile.ads.impl.w61 r0 = r5.f34206a
            android.graphics.Bitmap r6 = r0.mo70654a(r6)
        L_0x0018:
            com.yandex.mobile.ads.impl.nc r0 = r5.f34207b
            r0.getClass()
            r0 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r0, r0)
            com.yandex.mobile.ads.impl.nc r1 = r5.f34207b
            r1.getClass()
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r7, r0, r0, r0)
            com.yandex.mobile.ads.impl.h20$a r1 = new com.yandex.mobile.ads.impl.h20$a
            r2 = 0
            int r6 = r6.getPixel(r2, r2)
            r1.<init>(r6)
            com.yandex.mobile.ads.impl.h20$a r6 = new com.yandex.mobile.ads.impl.h20$a
            int r7 = r7.getPixel(r2, r2)
            r6.<init>(r7)
            int r7 = r1.f34208a
            int r3 = r6.f34208a
            int r7 = r7 - r3
            int r7 = java.lang.Math.abs(r7)
            r3 = 20
            if (r7 <= r3) goto L_0x0050
            goto L_0x0080
        L_0x0050:
            int r7 = r1.f34209b
            int r4 = r6.f34209b
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r3) goto L_0x0060
            goto L_0x0080
        L_0x0060:
            int r7 = r1.f34210c
            int r4 = r6.f34210c
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r3) goto L_0x0070
            goto L_0x0080
        L_0x0070:
            int r7 = r1.f34211d
            int r6 = r6.f34211d
            int r7 = r7 - r6
            int r6 = java.lang.Math.abs(r7)
            if (r6 > r3) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.h20.mo67392a(android.graphics.drawable.Drawable, android.graphics.Bitmap):boolean");
    }
}

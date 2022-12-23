package com.tapjoy.internal;

import android.view.animation.Animation;

/* renamed from: com.tapjoy.internal.ad */
public class C9057ad {

    /* renamed from: a */
    protected final Animation f22319a;

    /* renamed from: com.tapjoy.internal.ad$a */
    public enum C9059a {
        ;
        

        /* renamed from: a */
        public static final int f22321a = 1;

        /* renamed from: b */
        public static final int f22322b = 2;

        /* renamed from: c */
        public static final int f22323c = 3;

        /* renamed from: d */
        public static final int f22324d = 4;

        static {
            f22325e = new int[]{1, 2, 3, 4};
        }

        /* renamed from: a */
        public static int[] m24290a() {
            return (int[]) f22325e.clone();
        }
    }

    /* renamed from: com.tapjoy.internal.ad$1 */
    public static /* synthetic */ class C90581 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22320a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                int[] r0 = com.tapjoy.internal.C9057ad.C9059a.m24290a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22320a = r0
                r1 = 1
                int r2 = com.tapjoy.internal.C9057ad.C9059a.f22321a     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f22320a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.tapjoy.internal.C9057ad.C9059a.f22322b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f22320a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.tapjoy.internal.C9057ad.C9059a.f22323c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f22320a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.tapjoy.internal.C9057ad.C9059a.f22324d     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r1 = 4
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9057ad.C90581.<clinit>():void");
        }
    }

    public C9057ad(Animation animation) {
        this.f22319a = animation;
        animation.setDuration(400);
    }

    /* renamed from: a */
    public Animation mo57751a() {
        return this.f22319a;
    }

    /* renamed from: b */
    public final C9057ad mo57752b() {
        this.f22319a.setDuration(600);
        return this;
    }
}

package com.flurry.sdk;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.flurry.sdk.cn */
public final class C2497cn extends C2509cu {

    /* renamed from: a */
    public WeakReference<Activity> f5842a = new WeakReference<>((Object) null);

    /* renamed from: b */
    public int f5843b;

    C2497cn() {
        super("com.flurry.android.sdk.ActivityLifecycleEvent");
    }

    /* renamed from: com.flurry.sdk.cn$a */
    public enum C2498a {
        ;
        

        /* renamed from: a */
        public static final int f5844a = 1;

        /* renamed from: b */
        public static final int f5845b = 2;

        /* renamed from: c */
        public static final int f5846c = 3;

        /* renamed from: d */
        public static final int f5847d = 4;

        /* renamed from: e */
        public static final int f5848e = 5;

        /* renamed from: f */
        public static final int f5849f = 6;

        /* renamed from: g */
        public static final int f5850g = 7;

        static {
            f5851h = new int[]{1, 2, 3, 4, 5, 6, 7};
        }

        /* renamed from: a */
        public static int[] m5388a() {
            return (int[]) f5851h.clone();
        }
    }
}

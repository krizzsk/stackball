package com.flurry.sdk;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.flurry.sdk.ec */
public final class C2597ec extends C2509cu {

    /* renamed from: a */
    public WeakReference<Context> f6083a;

    /* renamed from: b */
    public C2595eb f6084b;

    /* renamed from: d */
    public int f6085d;

    /* renamed from: e */
    public long f6086e;

    public C2597ec() {
        super("com.flurry.android.sdk.FlurrySessionEvent");
    }

    /* renamed from: com.flurry.sdk.ec$a */
    public enum C2598a {
        ;
        

        /* renamed from: a */
        public static final int f6087a = 1;

        /* renamed from: b */
        public static final int f6088b = 2;

        /* renamed from: c */
        public static final int f6089c = 3;

        /* renamed from: d */
        public static final int f6090d = 4;

        /* renamed from: e */
        public static final int f6091e = 5;

        static {
            f6092f = new int[]{1, 2, 3, 4, 5};
        }

        /* renamed from: a */
        public static int[] m5641a() {
            return (int[]) f6092f.clone();
        }
    }
}

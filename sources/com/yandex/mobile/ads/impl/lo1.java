package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;

public final class lo1 {

    /* renamed from: a */
    private static final cp1 f36768a = new cp1();

    /* renamed from: b */
    public static final /* synthetic */ int f36769b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.lo1$a */
    class C13871a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver.OnPreDrawListener f36770a;

        /* renamed from: b */
        final /* synthetic */ View f36771b;

        C13871a(ViewTreeObserver.OnPreDrawListener onPreDrawListener, View view) {
            this.f36770a = onPreDrawListener;
            this.f36771b = view;
        }

        public boolean onPreDraw() {
            this.f36770a.onPreDraw();
            this.f36771b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static int m38864a(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: b */
    public static int m38869b(Context context) {
        return (int) (((((float) context.getResources().getDisplayMetrics().heightPixels) + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m38871c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: d */
    public static int m38873d(Context context) {
        return (int) (((((float) context.getResources().getDisplayMetrics().widthPixels) + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: e */
    public static int m38875e(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(1:4)|5|6|(2:8|10)(1:13)) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017 A[Catch:{ Exception -> 0x001c }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m38877f(android.view.View r1) {
        /*
            if (r1 == 0) goto L_0x001c
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ Exception -> 0x0013 }
            boolean r0 = r0 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ Exception -> 0x0013 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0013 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            boolean r0 = r1 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x001c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ Exception -> 0x001c }
            r1.removeAllViews()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lo1.m38877f(android.view.View):void");
    }

    /* renamed from: e */
    public static boolean m38876e(View view) {
        Drawable background = view.getBackground();
        return background != null && (Build.VERSION.SDK_INT < 19 || ((float) background.getAlpha()) != 0.0f);
    }

    @Deprecated
    /* renamed from: a */
    public static int m38865a(Context context, int i) {
        return Math.round(((float) i) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public static int m38870b(View view) {
        if (view.isShown()) {
            return f36768a.mo66343a(view);
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m38872c(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        boolean z2 = rect.bottom <= rect2.top || rect.top >= rect2.bottom;
        boolean z3 = rect.right <= rect2.left || rect.left >= rect2.right;
        if (z2 || z3) {
            z = true;
        }
        return !z;
    }

    /* renamed from: d */
    public static boolean m38874d(View view) {
        if (view.isShown()) {
            if (!(Build.VERSION.SDK_INT < 11 || view.getAlpha() != 0.0f)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static float m38862a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static int m38863a(int i, float f) {
        return Color.argb(Math.max(0, Math.min(255, (int) (((100.0f - f) * 255.0f) / 100.0f))), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public static void m38867a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().addOnPreDrawListener(new C13871a(onPreDrawListener, view));
    }

    /* renamed from: a */
    public static boolean m38868a(View view, int i) {
        return m38866a(view) >= i;
    }

    /* renamed from: a */
    public static int m38866a(View view) {
        int i;
        int i2;
        if (view != null && view.isShown()) {
            int a = view.isShown() ? f36768a.mo66343a(view) : 0;
            if (a > 0) {
                if (view.getLayoutParams().width > 0) {
                    i = view.getLayoutParams().width;
                } else {
                    i = view.getWidth();
                }
                if (view.getLayoutParams().height > 0) {
                    i2 = view.getLayoutParams().height;
                } else {
                    i2 = view.getHeight();
                }
                if (i2 > 0 && i > 0) {
                    return (a * 100) / (i2 * i);
                }
            }
        }
        return 0;
    }
}

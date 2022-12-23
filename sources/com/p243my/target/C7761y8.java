package com.p243my.target;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.my.target.y8 */
public class C7761y8 {

    /* renamed from: a */
    public static final AtomicInteger f19719a = new AtomicInteger(1);

    /* renamed from: b */
    public final Context f19720b;

    /* renamed from: com.my.target.y8$a */
    public static class C7762a {

        /* renamed from: a */
        public static final DisplayMetrics f19721a;

        /* renamed from: b */
        public static final float f19722b;

        /* renamed from: c */
        public static final int f19723c;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            f19721a = displayMetrics;
            f19722b = displayMetrics.density;
            f19723c = displayMetrics.densityDpi;
        }
    }

    /* renamed from: com.my.target.y8$b */
    public static class C7763b extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final String f19724a;

        public C7763b(String str) {
            this.f19724a = str;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.f19724a);
        }
    }

    public C7761y8(Context context) {
        this.f19720b = context;
    }

    /* renamed from: a */
    public static float m20928a() {
        return C7762a.f19722b;
    }

    /* renamed from: a */
    public static int m20929a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: a */
    public static int m20930a(int i, int i2, int i3) {
        return i3 <= i ? i : i3 > i2 ? i2 : i3;
    }

    /* renamed from: a */
    public static int m20931a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m20932a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        if (1 == i) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        C7374e0.m18989a("Unknown screen orientation. Defaulting to portrait.");
        return 9;
    }

    /* renamed from: a */
    public static int m20933a(int... iArr) {
        int i = 0;
        for (int max : iArr) {
            i = Math.max(max, i);
        }
        return i;
    }

    /* renamed from: a */
    public static DisplayMetrics m20934a(Context context) {
        Display defaultDisplay;
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return displayMetrics;
            }
            display.getRealMetrics(displayMetrics);
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                return displayMetrics;
            }
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static void m20935a(int i, int i2, int i3, int i4, View... viewArr) {
        int i5 = i3 - i;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                m20951c(view, ((i5 - view.getMeasuredHeight()) / 2) + i, i2);
                if (view.getMeasuredWidth() > 0) {
                    i2 += view.getMeasuredWidth() + i4;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m20936a(View view, int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, colorDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, colorDrawable);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{m20929a(i2), m20929a(i)}), stateListDrawable, (Drawable) null));
        } else if (i3 >= 18) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* renamed from: a */
    public static void m20937a(View view, int i, int i2, int i3) {
        if (view != null && view.getVisibility() != 8) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i3));
        }
    }

    /* renamed from: a */
    public static void m20938a(View view, int i, int i2, int i3, int i4) {
        if (view != null && view.getVisibility() != 8) {
            int measuredWidth = i + (((i3 - i) - view.getMeasuredWidth()) / 2);
            int measuredHeight = i2 + (((i4 - i2) - view.getMeasuredHeight()) / 2);
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
        }
    }

    /* renamed from: a */
    public static void m20939a(View view, int i, int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i});
        float f = (float) i5;
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(f);
        if (i3 != 0) {
            gradientDrawable.setStroke(i4, i3);
            gradientDrawable2.setStroke(i4, i3);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{m20929a(i2), m20929a(i)}), stateListDrawable, (Drawable) null));
        } else if (i6 >= 16) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* renamed from: a */
    public static void m20940a(View view, String str) {
        view.setContentDescription(str);
        m20947b(view, str);
    }

    /* renamed from: a */
    public static boolean m20941a(Activity activity, View view) {
        while (view.isHardwareAccelerated() && (view.getLayerType() & 1) == 0) {
            if (!(view.getParent() instanceof View)) {
                Window window = activity.getWindow();
                return (window == null || (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
            view = (View) view.getParent();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r4 = ((android.app.Activity) r4).getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20942a(android.view.View r4) {
        /*
            r0 = r4
        L_0x0001:
            boolean r1 = r0.isHardwareAccelerated()
            r2 = 0
            if (r1 == 0) goto L_0x003e
            int r1 = r0.getLayerType()
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0011
            goto L_0x003e
        L_0x0011:
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 != 0) goto L_0x0037
            android.content.Context r4 = r4.getContext()
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0036
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L_0x0036
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r4 = r4.flags
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0035
            r2 = 1
        L_0x0035:
            return r2
        L_0x0036:
            return r3
        L_0x0037:
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L_0x0001
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7761y8.m20942a(android.view.View):boolean");
    }

    /* renamed from: b */
    public static int m20943b() {
        return C7762a.f19723c;
    }

    /* renamed from: b */
    public static Point m20944b(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return point;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = currentWindowMetrics.getBounds();
            point.y = bounds.height() - i2;
            point.x = bounds.width() - i;
            return point;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    /* renamed from: b */
    public static void m20945b(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.layout(i2 - view.getMeasuredWidth(), i, i2, view.getMeasuredHeight() + i);
        }
    }

    /* renamed from: b */
    public static void m20946b(View view, int i, int i2, int i3) {
        m20939a(view, i, i2, 0, 0, i3);
    }

    /* renamed from: b */
    public static void m20947b(View view, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setAccessibilityDelegate(new C7763b(str));
        }
    }

    /* renamed from: c */
    public static int m20948c() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f19719a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: c */
    public static int m20949c(int i) {
        return Math.round(((float) i) / (((float) m20943b()) / 160.0f));
    }

    /* renamed from: c */
    public static C7761y8 m20950c(Context context) {
        return new C7761y8(context);
    }

    /* renamed from: c */
    public static void m20951c(View view, int i, int i2) {
        if (view != null && view.getVisibility() != 8) {
            view.layout(i2, i, view.getMeasuredWidth() + i2, view.getMeasuredHeight() + i);
        }
    }

    /* renamed from: d */
    public static void m20952d(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.layout(i2 - view.getMeasuredWidth(), i - view.getMeasuredHeight(), i2, i);
        }
    }

    /* renamed from: d */
    public static boolean m20953d() {
        try {
            Class.forName(RecyclerView.class.getName());
            return true;
        } catch (Throwable unused) {
            C7374e0.m18989a("RecyclerView doesn't exist, add RecyclerView dependency to show cards");
            return false;
        }
    }

    /* renamed from: e */
    public static void m20954e(View view, int i, int i2) {
        if (view != null && view.getVisibility() != 8) {
            view.layout(i2, i - view.getMeasuredHeight(), view.getMeasuredWidth() + i2, i);
        }
    }

    /* renamed from: a */
    public int mo51901a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f19720b.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public int mo51902b(int i) {
        return mo51901a((float) i);
    }

    /* renamed from: d */
    public int mo51903d(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, this.f19720b.getResources().getDisplayMetrics());
    }
}

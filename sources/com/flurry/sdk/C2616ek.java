package com.flurry.sdk;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

/* renamed from: com.flurry.sdk.ek */
public final class C2616ek {
    /* renamed from: a */
    public static int m5685a() {
        Point b = m5686b();
        if (b.x == b.y) {
            return 3;
        }
        return b.x < b.y ? 1 : 2;
    }

    /* renamed from: b */
    private static Point m5686b() {
        Display defaultDisplay = ((WindowManager) C2494ck.m5371a().f5832a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                point.x = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                point.y = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Throwable unused) {
                defaultDisplay.getSize(point);
            }
        }
        return point;
    }
}

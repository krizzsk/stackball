package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.tapjoy.internal.aa */
public enum C9052aa {
    UNSPECIFIED,
    PORTRAIT,
    LANDSCAPE,
    SQUARE,
    NATURAL_PORTRAIT(PORTRAIT),
    RIGHT_LANDSCAPE(LANDSCAPE, NATURAL_PORTRAIT),
    REVERSE_PORTRAIT(PORTRAIT, NATURAL_PORTRAIT),
    LEFT_LANDSCAPE(LANDSCAPE, NATURAL_PORTRAIT),
    NATURAL_LANDSCAPE(LANDSCAPE),
    RIGHT_PORTRAIT(PORTRAIT, NATURAL_LANDSCAPE),
    REVERSE_LANDSCAPE(LANDSCAPE, NATURAL_LANDSCAPE),
    LEFT_PORTRAIT(PORTRAIT, NATURAL_LANDSCAPE),
    NATURAL_SQUARE(SQUARE),
    RIGHT_SQUARE(SQUARE, NATURAL_SQUARE),
    REVERSE_SQUARE(SQUARE, NATURAL_SQUARE),
    LEFT_SQUARE(SQUARE, NATURAL_SQUARE);
    

    /* renamed from: q */
    private final C9052aa f22313q;

    /* renamed from: r */
    private final C9052aa f22314r;

    private C9052aa(C9052aa aaVar) {
        this.f22313q = aaVar;
        this.f22314r = this;
    }

    private C9052aa(C9052aa aaVar, C9052aa aaVar2) {
        this.f22313q = aaVar;
        this.f22314r = aaVar2;
    }

    /* renamed from: a */
    public final boolean mo57744a() {
        C9052aa aaVar = PORTRAIT;
        return this == aaVar || this.f22313q == aaVar;
    }

    /* renamed from: b */
    public final boolean mo57745b() {
        C9052aa aaVar = LANDSCAPE;
        return this == aaVar || this.f22313q == aaVar;
    }

    /* renamed from: c */
    public final int mo57746c() {
        if (this.f22314r != null) {
            return ordinal() - this.f22314r.ordinal();
        }
        return 0;
    }

    /* renamed from: a */
    public static C9052aa m24281a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
        }
        if (point.x < point.y) {
            int i = rotation & 3;
            if (i == 1) {
                return RIGHT_PORTRAIT;
            }
            if (i == 2) {
                return REVERSE_PORTRAIT;
            }
            if (i != 3) {
                return NATURAL_PORTRAIT;
            }
            return LEFT_PORTRAIT;
        } else if (point.x > point.y) {
            int i2 = rotation & 3;
            if (i2 == 1) {
                return RIGHT_LANDSCAPE;
            }
            if (i2 == 2) {
                return REVERSE_LANDSCAPE;
            }
            if (i2 != 3) {
                return NATURAL_LANDSCAPE;
            }
            return LEFT_LANDSCAPE;
        } else {
            int i3 = rotation & 3;
            if (i3 == 1) {
                return RIGHT_SQUARE;
            }
            if (i3 == 2) {
                return REVERSE_SQUARE;
            }
            if (i3 != 3) {
                return NATURAL_SQUARE;
            }
            return LEFT_SQUARE;
        }
    }

    /* renamed from: b */
    public static C9052aa m24282b(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return PORTRAIT;
        }
        if (i != 2) {
            return UNSPECIFIED;
        }
        return LANDSCAPE;
    }
}

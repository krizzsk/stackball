package com.ogury.p245ed.internal;

import android.graphics.Rect;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ay */
public final class C8051ay {
    /* renamed from: a */
    public static final int m22422a(Rect rect) {
        C8467mq.m23881b(rect, "<this>");
        return rect.width() * rect.height();
    }

    /* renamed from: a */
    public static final void m22424a(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "<this>");
        C8467mq.m23881b(rect2, "screenRect");
        rect.offset(-rect2.left, -rect2.top);
    }

    /* renamed from: a */
    public static final void m22425a(List<Rect> list, Rect rect) {
        C8467mq.m23881b(list, "<this>");
        C8467mq.m23881b(rect, "containerRect");
        for (Rect a : list) {
            m22424a(a, rect);
        }
    }

    /* renamed from: a */
    public static final boolean m22426a(Rect rect, List<Rect> list) {
        C8467mq.m23881b(rect, "<this>");
        C8467mq.m23881b(list, "rectangles");
        return list.contains(rect);
    }

    /* renamed from: b */
    public static final int m22428b(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "<this>");
        C8467mq.m23881b(rect2, "rect2");
        if (rect.left >= rect2.right || rect2.left >= rect.right || rect.top >= rect2.bottom || rect2.top >= rect.bottom) {
            return 0;
        }
        int max = Math.max(rect.left, rect2.left);
        int max2 = Math.max(rect.top, rect2.top);
        return (Math.min(rect.right, rect2.right) - max) * (Math.min(rect.bottom, rect2.bottom) - max2);
    }

    /* renamed from: a */
    public static final boolean m22427a(List<Rect> list, int i, int i2) {
        C8467mq.m23881b(list, "<this>");
        for (Rect contains : list) {
            if (contains.contains(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final Rect m22429c(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "<this>");
        C8467mq.m23881b(rect2, "rect2");
        Rect rect3 = new Rect(rect);
        if (!rect3.intersect(rect2)) {
            return null;
        }
        return rect3;
    }

    /* renamed from: a */
    public static final void m22423a(Rect rect, float f) {
        C8467mq.m23881b(rect, "<this>");
        rect.bottom = rect.top + ((int) (((float) rect.height()) / f));
        rect.right = rect.left + ((int) (((float) rect.width()) / f));
    }
}

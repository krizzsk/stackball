package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bb */
public final class C8055bb {

    /* renamed from: a */
    private final C8056bc f20928a;

    public C8055bb(C8056bc bcVar) {
        C8467mq.m23881b(bcVar, "rectHelper");
        this.f20928a = bcVar;
    }

    /* renamed from: a */
    public static List<Rect> m22436a(List<? extends View> list, Rect rect) {
        C8467mq.m23881b(list, "viewsAfterOverlay");
        C8467mq.m23881b(rect, "webViewOnScreenRect");
        List<Rect> arrayList = new ArrayList<>();
        for (View view : list) {
            if (view.getVisibility() == 0) {
                Rect a = C8056bc.m22438a(view);
                Rect rect2 = new Rect(rect);
                if (rect2.intersect(a)) {
                    arrayList.add(rect2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m22434a(Rect rect, List<Rect> list) {
        C8467mq.m23881b(rect, "webViewRect");
        C8467mq.m23881b(list, "overlappingRects");
        if (list.isEmpty()) {
            return 0;
        }
        if (C8051ay.m22426a(rect, list)) {
            return C8051ay.m22422a(rect);
        }
        if (list.size() <= 2) {
            return m22435a(list);
        }
        return m22437b(rect, list);
    }

    /* renamed from: b */
    private static int m22437b(Rect rect, List<Rect> list) {
        int i = rect.left;
        int i2 = rect.right;
        int i3 = 0;
        if (i < i2) {
            while (true) {
                int i4 = i + 1;
                int i5 = rect.top;
                int i6 = rect.bottom;
                if (i5 < i6) {
                    while (true) {
                        int i7 = i5 + 1;
                        if (C8051ay.m22427a(list, i, i5)) {
                            i3++;
                        }
                        if (i7 >= i6) {
                            break;
                        }
                        i5 = i7;
                    }
                }
                if (i4 >= i2) {
                    break;
                }
                i = i4;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static int m22435a(List<Rect> list) {
        int i = 0;
        int i2 = 0;
        for (Rect a : list) {
            i2 += C8051ay.m22422a(a);
        }
        int size = list.size() - 2;
        if (size >= 0) {
            while (true) {
                int i3 = i + 1;
                int size2 = list.size();
                if (i3 < size2) {
                    int i4 = i3;
                    while (true) {
                        int i5 = i4 + 1;
                        i2 -= C8051ay.m22428b(list.get(i), list.get(i4));
                        if (i5 >= size2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i == size) {
                    break;
                }
                i = i3;
            }
        }
        return i2;
    }
}

package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.bc */
public final class C8056bc {
    /* renamed from: a */
    public static Rect m22438a(View view) {
        C8467mq.m23881b(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: b */
    public static Rect m22439b(View view) {
        C8467mq.m23881b(view, "view");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: c */
    public static Rect m22440c(View view) {
        C8467mq.m23881b(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() != view.getWidth()) {
            rect.right = rect.left + view.getWidth();
        }
        if (rect.height() != view.getHeight()) {
            rect.bottom = rect.top + view.getHeight();
        }
        return rect;
    }
}

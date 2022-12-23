package com.smaato.sdk.richmedia.util;

import android.content.Context;
import android.graphics.Rect;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.richmedia.mraid.MraidUtils;

public final class RectUtils {
    private RectUtils() {
    }

    public static Rect adjust(Rect rect, Rect rect2) {
        if (rect2.contains(rect)) {
            return rect;
        }
        Rect rect3 = new Rect(rect);
        if (rect3.left < rect2.left) {
            rect3.left = rect2.left;
            rect3.right = rect3.left + rect.width();
        }
        if (rect3.right > rect2.right) {
            rect3.left = Math.max(rect2.left, rect2.right - rect.width());
            rect3.right = rect3.left + Math.min(rect.width(), rect2.width());
        }
        if (rect3.top < rect2.top) {
            rect3.top = rect2.top;
            rect3.bottom = rect3.top + rect.height();
        }
        if (rect3.bottom > rect2.bottom) {
            rect3.top = Math.max(rect2.top, rect2.bottom - rect.height());
            rect3.bottom = rect3.top + Math.min(rect.height(), rect2.height());
        }
        return rect3;
    }

    public static String rectToString(Rect rect) {
        if (rect.isEmpty()) {
            return "null";
        }
        return MraidUtils.format("{ \"x\":%d, \"y\":%d, \"width\":%d, \"height\":%d }", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static Rect mapToDp(Context context, Rect rect) {
        return new Rect(UIUtils.pxToDp(context, (float) rect.left), UIUtils.pxToDp(context, (float) rect.top), UIUtils.pxToDp(context, (float) rect.right), UIUtils.pxToDp(context, (float) rect.bottom));
    }

    public static Rect mapToPx(Context context, Rect rect) {
        return new Rect(UIUtils.dpToPx(context, (float) rect.left), UIUtils.dpToPx(context, (float) rect.top), UIUtils.dpToPx(context, (float) rect.right), UIUtils.dpToPx(context, (float) rect.bottom));
    }
}

package com.smaato.sdk.richmedia.mraid;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

public final class Views {
    public static boolean isViewable(float f) {
        return f > 0.0f;
    }

    private Views() {
    }

    public static Rect positionOnScreenOf(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    private static boolean isViewVisible(View view) {
        if (view.hasWindowFocus() && view.getWidth() > 0 && view.getHeight() > 0) {
            return view.isShown();
        }
        return false;
    }

    public static void addOnPreDrawListener(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public final boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                runnable.run();
                return true;
            }
        });
    }

    public static final class ViewVisibilityContext {
        public final float visibilityPercent;
        public final Rect visibleRect;

        /* synthetic */ ViewVisibilityContext(float f, Rect rect, byte b) {
            this(f, rect);
        }

        private ViewVisibilityContext(float f, Rect rect) {
            this.visibilityPercent = f;
            this.visibleRect = rect;
        }
    }

    public static ViewVisibilityContext visibilityContextRelativeToView(View view) {
        Rect rect;
        float f;
        Rect positionOnScreenOf = positionOnScreenOf(view);
        if (!isViewVisible(view)) {
            rect = new Rect();
        } else {
            rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                rect = new Rect();
            }
        }
        if (rect.isEmpty()) {
            rect = new Rect();
        } else {
            rect.offset(-positionOnScreenOf.left, -positionOnScreenOf.top);
        }
        float width = (float) (rect.width() * rect.height());
        if (!isViewVisible(view)) {
            f = 0.0f;
        } else {
            f = 100.0f * (width / ((float) (view.getWidth() * view.getHeight())));
        }
        return new ViewVisibilityContext(f, rect, (byte) 0);
    }
}

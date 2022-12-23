package com.smaato.sdk.core.tracker;

import android.graphics.Rect;
import android.view.View;
import com.smaato.sdk.core.util.Threads;

final class VisibilityTrackerUtils {
    private VisibilityTrackerUtils() {
    }

    static boolean checkVisibility(View view, double d) {
        Threads.ensureMainThread();
        $$Lambda$PzjyZN0vWTQvhPzfQ0m_4MkcEw r0 = $$Lambda$PzjyZN0vWTQvhPzfQ0m_4MkcEw.INSTANCE;
        if (view.hasWindowFocus() && view.getWidth() > 0 && view.getHeight() > 0 && view.isShown()) {
            Rect rect = (Rect) r0.get();
            if (!view.getGlobalVisibleRect(rect) || ((double) (rect.width() * rect.height())) < ((double) (view.getHeight() * view.getWidth())) * d) {
                return false;
            }
            return true;
        }
        return false;
    }
}

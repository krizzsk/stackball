package com.smaato.sdk.core.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

public final class ViewUtils {
    private ViewUtils() {
    }

    public static View getRootView(View view) {
        View view2;
        boolean z;
        Window window;
        Context context = view.getContext();
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            view2 = window.getDecorView().findViewById(16908290);
        } else {
            view2 = null;
        }
        if (view2 == null) {
            if (Build.VERSION.SDK_INT >= 19) {
                z = view.isAttachedToWindow();
            } else {
                z = view.getWindowToken() != null;
            }
            if (!z) {
                Log.d("SmaatoSDK", "Attempting to call View#getRootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            view2 = rootView.findViewById(16908290);
            if (view2 == null) {
                return rootView;
            }
        }
        return view2;
    }

    public static ViewGroup getParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static void removeFromParent(View view) {
        ViewGroup parent = getParent(view);
        if (parent != null) {
            parent.removeView(view);
        }
    }
}

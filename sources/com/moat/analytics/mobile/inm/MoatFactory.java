package com.moat.analytics.mobile.inm;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.inm.C7270v;
import java.util.Map;

public abstract class MoatFactory {
    public static MoatFactory create() {
        try {
            return new C7253n();
        } catch (Exception e) {
            C7252m.m18508a(e);
            return new C7270v.C7272b();
        }
    }

    public abstract <T> T createCustomTracker(MoatPlugin<T> moatPlugin);

    public abstract NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map);

    public abstract NativeVideoTracker createNativeVideoTracker(String str);

    public abstract WebAdTracker createWebAdTracker(ViewGroup viewGroup);

    public abstract WebAdTracker createWebAdTracker(WebView webView);
}

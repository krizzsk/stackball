package com.p243my.target;

import android.view.View;
import com.p243my.target.nativeads.INativeAd;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.my.target.q8 */
public class C7629q8 {

    /* renamed from: a */
    public static final WeakHashMap<View, WeakReference<INativeAd>> f19275a = new WeakHashMap<>();

    /* renamed from: a */
    public static void m20222a(View view, INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        m20223a(iNativeAd);
        WeakHashMap<View, WeakReference<INativeAd>> weakHashMap = f19275a;
        WeakReference weakReference = weakHashMap.get(view);
        if (!(weakReference == null || (iNativeAd2 = (INativeAd) weakReference.get()) == null)) {
            iNativeAd2.unregisterView();
        }
        weakHashMap.put(view, new WeakReference(iNativeAd));
    }

    /* renamed from: a */
    public static void m20223a(INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        for (Map.Entry next : f19275a.entrySet()) {
            View view = (View) next.getKey();
            WeakReference weakReference = (WeakReference) next.getValue();
            if (weakReference != null && ((iNativeAd2 = (INativeAd) weakReference.get()) == null || iNativeAd2 == iNativeAd)) {
                f19275a.remove(view);
                return;
            }
        }
    }
}

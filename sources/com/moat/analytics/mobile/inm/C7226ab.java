package com.moat.analytics.mobile.inm;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.inm.p240a.p242b.C7224a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/* renamed from: com.moat.analytics.mobile.inm.ab */
class C7226ab {

    /* renamed from: a */
    private static final LinkedHashSet<String> f18101a = new LinkedHashSet<>();

    C7226ab() {
    }

    /* renamed from: a */
    static C7224a<WebView> m18391a(ViewGroup viewGroup, boolean z) {
        if (viewGroup == null) {
            try {
                return C7224a.m18384a();
            } catch (Exception unused) {
                return C7224a.m18384a();
            }
        } else if (viewGroup instanceof WebView) {
            return C7224a.m18385a((WebView) viewGroup);
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(viewGroup);
            WebView webView = null;
            int i = 0;
            while (!linkedList.isEmpty() && i < 100) {
                i++;
                ViewGroup viewGroup2 = (ViewGroup) linkedList.poll();
                int childCount = viewGroup2.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof WebView) {
                        C7261p.m18544a(3, "WebViewHound", (Object) childAt, "Found WebView");
                        if (z || m18392a(String.valueOf(childAt.hashCode()))) {
                            if (webView != null) {
                                C7261p.m18544a(3, "WebViewHound", (Object) childAt, "Ambiguous ad container: multiple WebViews reside within it.");
                                C7261p.m18547a("[ERROR] ", "WebAdTracker not created, ambiguous ad container: multiple WebViews reside within it");
                                webView = null;
                                break;
                            }
                            webView = (WebView) childAt;
                        }
                    }
                    if (childAt instanceof ViewGroup) {
                        linkedList.add((ViewGroup) childAt);
                    }
                    i2++;
                }
            }
            return C7224a.m18386b(webView);
        }
    }

    /* renamed from: a */
    private static boolean m18392a(String str) {
        try {
            boolean add = f18101a.add(str);
            if (f18101a.size() > 50) {
                Iterator it = f18101a.iterator();
                for (int i = 0; i < 25 && it.hasNext(); i++) {
                    it.next();
                    it.remove();
                }
            }
            C7261p.m18544a(3, "WebViewHound", (Object) null, add ? "Newly Found WebView" : "Already Found WebView");
            return add;
        } catch (Exception e) {
            C7252m.m18508a(e);
            return false;
        }
    }
}

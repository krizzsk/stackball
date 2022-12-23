package com.ogury.p245ed.internal;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.az */
public final class C8052az {
    /* renamed from: a */
    public final List<View> mo53202a(ViewGroup viewGroup, WebView webView) {
        C8467mq.m23881b(viewGroup, "root");
        C8467mq.m23881b(webView, "webView");
        List arrayList = new ArrayList();
        m22430a(viewGroup, (List<View>) arrayList);
        return arrayList.subList(arrayList.indexOf(webView) + 1, arrayList.size());
    }

    /* renamed from: a */
    private final void m22430a(ViewGroup viewGroup, List<View> list) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof C8248g)) {
                    C8467mq.m23878a((Object) childAt, "child");
                    list.add(childAt);
                }
                if (childAt instanceof ViewGroup) {
                    m22430a((ViewGroup) childAt, list);
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}

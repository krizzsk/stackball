package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class rx0 {
    rx0() {
    }

    /* renamed from: b */
    private List<View> m41744b(View view) {
        ArrayList arrayList = new ArrayList();
        if (!lo1.m38874d(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (lo1.m38876e((View) viewGroup)) {
                    arrayList.add(viewGroup);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayList2.addAll(m41744b(viewGroup.getChildAt(i)));
                    }
                    arrayList.addAll(arrayList2);
                }
            } else {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023  */
    /* renamed from: a */
    java.util.List<android.view.View> mo69832a(android.view.View r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = com.yandex.mobile.ads.impl.lo1.f36769b
            android.view.ViewParent r1 = r7.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0017
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = r6
            r2 = r0
            r0 = r7
            r7 = r1
            r1 = r0
            goto L_0x0021
        L_0x0017:
            r2 = r6
            r1 = r0
            r0 = r7
        L_0x001a:
            r3 = 0
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r2
            r2 = r1
            r1 = r5
        L_0x0021:
            if (r7 == 0) goto L_0x004d
            int r0 = r7.indexOfChild(r0)
        L_0x0027:
            int r0 = r0 + 1
            int r4 = r7.getChildCount()
            if (r0 >= r4) goto L_0x003b
            android.view.View r4 = r7.getChildAt(r0)
            java.util.List r4 = r3.m41744b(r4)
            r2.addAll(r4)
            goto L_0x0027
        L_0x003b:
            android.view.ViewParent r0 = r7.getParent()
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0049
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x0021
        L_0x0049:
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x001a
        L_0x004d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r7 < r0) goto L_0x0079
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            float r0 = r1.getZ()
            java.util.Iterator r1 = r2.iterator()
        L_0x0060:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r1.next()
            android.view.View r2 = (android.view.View) r2
            float r3 = r2.getZ()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0060
            r7.add(r2)
            goto L_0x0060
        L_0x0078:
            r2 = r7
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rx0.mo69832a(android.view.View):java.util.List");
    }
}

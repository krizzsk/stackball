package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.yb */
public final class C15240yb {

    /* renamed from: a */
    private final t91 f42801a = new t91();

    /* renamed from: a */
    public final s91 mo71014a(RectF rectF, hd0 hd0) {
        List<s91> c;
        Intrinsics.checkNotNullParameter(rectF, "viewSize");
        Intrinsics.checkNotNullParameter(hd0, "imageValue");
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) hd0.mo67525e(), (float) hd0.mo67516a());
        aa1 c2 = hd0.mo67523c();
        if (c2 == null || (c = c2.mo65711c()) == null) {
            return null;
        }
        Iterator<T> it = c.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T t = (s91) it.next();
                next = (s91) next;
                this.f42801a.getClass();
                Intrinsics.checkNotNullParameter(next, "first");
                Intrinsics.checkNotNullParameter(t, "second");
                Intrinsics.checkNotNullParameter(rectF2, "imageSize");
                Intrinsics.checkNotNullParameter(rectF, "viewSize");
                float a = w91.m43565a(next, rectF, rectF2);
                float a2 = w91.m43565a(t, rectF, rectF2);
                boolean z = true;
                if (!(a == Float.MAX_VALUE)) {
                    if (a != a2) {
                        z = false;
                    }
                    if (!z) {
                        if (a <= a2) {
                        }
                    } else if (next.mo69905a() > t.mo69905a()) {
                    }
                }
                next = t;
            }
            return (s91) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}

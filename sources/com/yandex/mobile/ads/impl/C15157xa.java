package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.xa */
public class C15157xa {
    /* renamed from: a */
    public final String mo70851a(RectF rectF, hd0 hd0) {
        float f;
        int i;
        Intrinsics.checkNotNullParameter(rectF, "view");
        Intrinsics.checkNotNullParameter(hd0, "imageValue");
        aa1 c = hd0.mo67523c();
        C15300za a = c == null ? null : c.mo65709a();
        if (a == null) {
            return null;
        }
        aa1 c2 = hd0.mo67523c();
        s91 b = c2 == null ? null : c2.mo65710b();
        if (b == null) {
            return null;
        }
        float width = rectF.width();
        float height = rectF.height();
        float e = (float) hd0.mo67525e();
        float a2 = (float) hd0.mo67516a();
        float c3 = (float) b.mo69907c();
        float b2 = (float) b.mo69906b();
        if (rectF.width() / rectF.height() > ((float) (b.mo69907c() / b.mo69906b()))) {
            f = rectF.height();
            i = b.mo69906b();
        } else {
            f = rectF.width();
            i = b.mo69907c();
        }
        if (f / ((float) i) <= 1.0f) {
            return m43989a(width, height, c3, b2, a);
        }
        return m43989a(width, height, e, a2, a);
    }

    /* renamed from: a */
    private final String m43989a(float f, float f2, float f3, float f4, C15300za zaVar) {
        if (f / f2 > f3 / f4) {
            if (Intrinsics.areEqual((Object) zaVar.mo71186c(), (Object) zaVar.mo71185b())) {
                return zaVar.mo71186c();
            }
        } else if (Intrinsics.areEqual((Object) zaVar.mo71187d(), (Object) zaVar.mo71184a())) {
            return zaVar.mo71187d();
        }
        return null;
    }
}

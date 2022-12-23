package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;

public class an1 {

    /* renamed from: a */
    private final y81 f30606a;

    /* renamed from: b */
    private final y81 f30607b;

    /* renamed from: com.yandex.mobile.ads.impl.an1$a */
    private enum C12400a {
        LEFT_TOP,
        CENTER
    }

    public an1(y81 y81, y81 y812) {
        this.f30606a = y81;
        this.f30607b = y812;
    }

    /* renamed from: a */
    public Matrix mo65828a(bn1 bn1) {
        y81 y81 = this.f30607b;
        boolean z = false;
        if (!(y81.mo71008b() > 0 && y81.mo71007a() > 0)) {
            return null;
        }
        y81 y812 = this.f30606a;
        if (y812.mo71008b() > 0 && y812.mo71007a() > 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        int ordinal = bn1.ordinal();
        if (ordinal == 0) {
            return m33814a(1.0f, 1.0f, C12400a.LEFT_TOP);
        }
        if (ordinal == 1) {
            float b = ((float) this.f30606a.mo71008b()) / ((float) this.f30607b.mo71008b());
            float a = ((float) this.f30606a.mo71007a()) / ((float) this.f30607b.mo71007a());
            float min = Math.min(b, a);
            return m33814a(min / b, min / a, C12400a.CENTER);
        } else if (ordinal != 2) {
            return null;
        } else {
            float b2 = ((float) this.f30606a.mo71008b()) / ((float) this.f30607b.mo71008b());
            float a2 = ((float) this.f30606a.mo71007a()) / ((float) this.f30607b.mo71007a());
            float max = Math.max(b2, a2);
            return m33814a(max / b2, max / a2, C12400a.CENTER);
        }
    }

    /* renamed from: a */
    private Matrix m33814a(float f, float f2, C12400a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f2, 0.0f, 0.0f);
            return matrix;
        } else if (ordinal != 1) {
            return null;
        } else {
            Matrix matrix2 = new Matrix();
            matrix2.setScale(f, f2, ((float) this.f30606a.mo71008b()) / 2.0f, ((float) this.f30606a.mo71007a()) / 2.0f);
            return matrix2;
        }
    }
}

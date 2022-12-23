package com.fyber.inneractive.sdk.player.p083e;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3630ak;

/* renamed from: com.fyber.inneractive.sdk.player.e.b */
public final class C3597b extends C3602g {
    public C3597b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19485a(C3630ak akVar, int i, int i2) {
        if (this.f9792d == UnitDisplayType.DEFAULT && this.f9813r) {
            mo19500a(akVar, this.f9811p, this.f9812q, i, i2);
        }
        akVar.f9896a = 0;
        akVar.f9897b = 0;
    }

    /* renamed from: d */
    public final void mo19494d() {
        this.f9798A = new C3630ak(0, 0);
        if (this.f9792d == UnitDisplayType.SQUARE) {
            int min = Math.min(this.f9821z.f9896a, this.f9790b);
            if (this.f9805j != null) {
                this.f9805j.getLayoutParams().width = min;
                this.f9805j.getLayoutParams().height = min;
            }
            if (this.f9804i != null) {
                this.f9804i.getLayoutParams().width = min;
                this.f9804i.getLayoutParams().height = min;
            }
            mo19500a(this.f9798A, this.f9811p, this.f9812q, min, min);
            return;
        }
        mo19500a(this.f9798A, this.f9811p, this.f9812q, this.f9821z.f9896a, this.f9821z.f9897b);
        if (this.f9804i != null) {
            this.f9804i.getLayoutParams().width = this.f9798A.f9896a;
            this.f9804i.getLayoutParams().height = this.f9798A.f9897b;
        }
    }
}

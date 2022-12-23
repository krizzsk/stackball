package com.fyber.inneractive.sdk.player.p083e;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3630ak;
import com.fyber.inneractive.sdk.util.C3657l;
import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.fyber.inneractive.sdk.player.e.d */
public final class C3599d extends C3602g {
    public C3599d(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19485a(C3630ak akVar, int i, int i2) {
        if (akVar != null) {
            if (this.f9792d == UnitDisplayType.SQUARE) {
                akVar.f9896a = Math.min(i, this.f9790b) - C3657l.m9119b(this.f9791c.mo18070g().mo18077e().intValue() * 2);
                akVar.f9897b = akVar.f9896a;
            } else if (this.f9792d == UnitDisplayType.LANDSCAPE) {
                akVar.f9896a = Math.min(i, this.f9790b) - C3657l.m9119b(this.f9791c.mo18070g().mo18077e().intValue() * 2);
                akVar.f9897b = (akVar.f9896a * 9) / 16;
            } else if (this.f9792d == UnitDisplayType.MRECT) {
                akVar.f9896a = C3657l.m9119b((int) ErrorCode.GENERAL_WRAPPER_ERROR);
                akVar.f9897b = C3657l.m9119b(250);
            } else if (this.f9792d != UnitDisplayType.DEFAULT || !this.f9813r) {
                akVar.f9896a = 0;
                akVar.f9897b = 0;
            } else {
                mo19500a(akVar, this.f9811p, this.f9812q, i, i2);
            }
        }
    }

    /* renamed from: d */
    public final void mo19494d() {
        this.f9798A = new C3630ak(0, 0);
        if (this.f9792d == UnitDisplayType.SQUARE) {
            if (this.f9804i != null) {
                this.f9804i.getLayoutParams().width = this.f9821z.f9896a;
                this.f9804i.getLayoutParams().height = this.f9821z.f9896a;
            }
            mo19500a(this.f9798A, this.f9811p, this.f9812q, this.f9821z.f9896a, this.f9821z.f9896a);
            return;
        }
        mo19500a(this.f9798A, this.f9811p, this.f9812q, this.f9821z.f9896a, this.f9821z.f9897b);
        if (this.f9804i != null) {
            this.f9804i.getLayoutParams().width = this.f9798A.f9896a;
            this.f9804i.getLayoutParams().height = this.f9798A.f9897b;
        }
    }
}

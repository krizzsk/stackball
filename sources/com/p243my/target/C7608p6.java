package com.p243my.target;

import android.content.Context;
import android.view.View;

/* renamed from: com.my.target.p6 */
public class C7608p6 extends View {

    /* renamed from: a */
    public C7609a f19192a;

    /* renamed from: b */
    public final C7610b f19193b = new C7610b();

    /* renamed from: com.my.target.p6$a */
    public interface C7609a {
        /* renamed from: a */
        void mo49442a(boolean z);
    }

    /* renamed from: com.my.target.p6$b */
    public static class C7610b {

        /* renamed from: a */
        public boolean f19194a;

        /* renamed from: b */
        public boolean f19195b;

        /* renamed from: a */
        public void mo51344a(boolean z) {
            this.f19194a = z;
        }

        /* renamed from: a */
        public boolean mo51345a() {
            return this.f19194a && this.f19195b;
        }

        /* renamed from: b */
        public void mo51346b(boolean z) {
            this.f19195b = z;
        }
    }

    public C7608p6(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo51336a(boolean z) {
        C7609a aVar;
        boolean z2;
        this.f19193b.mo51344a(z);
        this.f19193b.mo51346b(hasWindowFocus());
        if (this.f19193b.mo51345a()) {
            aVar = this.f19192a;
            if (aVar != null) {
                z2 = true;
            } else {
                return;
            }
        } else if (!z && (aVar = this.f19192a) != null) {
            z2 = false;
        } else {
            return;
        }
        aVar.mo49442a(z2);
    }

    /* renamed from: a */
    public boolean mo51337a() {
        return this.f19193b.mo51345a();
    }

    public C7610b getViewabilityState() {
        return this.f19193b;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo51336a(true);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo51336a(false);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    public void onWindowFocusChanged(boolean z) {
        C7609a aVar;
        boolean z2;
        super.onWindowFocusChanged(z);
        this.f19193b.mo51346b(z);
        if (this.f19193b.mo51345a()) {
            aVar = this.f19192a;
            if (aVar != null) {
                z2 = true;
            } else {
                return;
            }
        } else if (!z && (aVar = this.f19192a) != null) {
            z2 = false;
        } else {
            return;
        }
        aVar.mo49442a(z2);
    }

    public void setViewabilityListener(C7609a aVar) {
        this.f19192a = aVar;
    }
}

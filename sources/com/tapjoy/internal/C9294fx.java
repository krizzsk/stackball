package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.internal.C9297fz;
import com.tapjoy.internal.C9369hk;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.fx */
public final class C9294fx extends C9369hk {

    /* renamed from: b */
    private final C9297fz f22977b = new C9297fz() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo58145a() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo58143a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            C9369hk.C9370a aVar = (C9369hk.C9370a) obj;
            TJPlacement createPlacement = TJPlacementManager.createPlacement(TapjoyConnectCore.getContext(), aVar.f23227b, false, tJPlacementListener);
            createPlacement.pushId = aVar.f23226a;
            return createPlacement;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo58144a(Object obj) {
            C9369hk.C9370a aVar = (C9369hk.C9370a) obj;
            if (aVar != null) {
                return aVar.f23227b;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final /* synthetic */ C9297fz.C9298a mo58158b(Object obj) {
            C9369hk.C9370a aVar = (C9369hk.C9370a) obj;
            return new C9297fz.C9298a(aVar, aVar.f23229d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo58157a(Observer observer) {
            if (TapjoyConnectCore.isViewOpen()) {
                TJPlacementManager.dismissContentShowing(true);
            }
            return super.mo58157a(observer);
        }
    };

    /* renamed from: a */
    public static void m24907a() {
    }

    static {
        C9369hk.m25182a((C9369hk) new C9294fx());
    }

    private C9294fx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo58156b() {
        return this.f22977b.f22985b != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58155a(C9369hk.C9370a aVar) {
        this.f22977b.mo58161c(aVar);
    }
}

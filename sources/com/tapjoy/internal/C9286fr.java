package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;

/* renamed from: com.tapjoy.internal.fr */
public final class C9286fr {

    /* renamed from: a */
    private static final C9297fz f22964a = new C9297fz() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo58144a(Object obj) {
            return "InsufficientCurrency";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo58143a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "InsufficientCurrency", true, tJPlacementListener);
        }
    };

    /* renamed from: a */
    public static void m24902a() {
        f22964a.mo58161c((Object) null);
    }
}

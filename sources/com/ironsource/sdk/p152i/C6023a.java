package com.ironsource.sdk.p152i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.C5923w;
import com.ironsource.sdk.p146d.C5980b;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.utils.C6059b;

/* renamed from: com.ironsource.sdk.i.a */
public final class C6023a {

    /* renamed from: com.ironsource.sdk.i.a$1 */
    static /* synthetic */ class C60241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14789a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.p150g.C6008d.C6009a.m14847a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14789a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.p150g.C6008d.C6009a.f14751a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f14789a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.p150g.C6008d.C6009a.f14752b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f14789a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.p150g.C6008d.C6009a.f14753c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p152i.C6023a.C60241.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m14869a(Activity activity) {
        int parseInt = Integer.parseInt(C6059b.m14967a().f14852a.getString("back_button_state", "2"));
        if (C60241.f14789a[(parseInt == 0 ? C6008d.C6009a.f14751a : parseInt == 1 ? C6008d.C6009a.f14752b : C6008d.C6009a.f14753c) - 1] != 3) {
            return false;
        }
        try {
            C5923w wVar = (C5923w) C5980b.m14743a((Context) activity).f14640a.f14320a;
            if (wVar != null) {
                wVar.mo42342b(C5923w.m14639b("nativeNavigationPressed", C5923w.m14625a("action", "back", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

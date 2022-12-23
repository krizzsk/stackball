package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C14435r1;
import com.yandex.mobile.ads.impl.d81;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.lr0;
import com.yandex.mobile.ads.impl.o70;
import com.yandex.mobile.ads.impl.x71;

/* renamed from: com.yandex.mobile.ads.nativeads.c */
public abstract class C15476c {

    /* renamed from: a */
    static final C15476c f43821a = new C15477a();

    /* renamed from: b */
    static final C15476c f43822b = new C15478b();

    /* renamed from: com.yandex.mobile.ads.nativeads.c$a */
    class C15477a extends C15476c {
        C15477a() {
        }

        /* renamed from: a */
        public View.OnClickListener mo71654a(C13690k9 k9Var, ej0 ej0, C14435r1 r1Var, C15550v vVar, o70 o70) {
            return new lr0(k9Var, r1Var, vVar, ej0, o70);
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.c$b */
    class C15478b extends C15476c {
        C15478b() {
        }

        /* renamed from: a */
        public View.OnClickListener mo71654a(C13690k9 k9Var, ej0 ej0, C14435r1 r1Var, C15550v vVar, o70 o70) {
            if ("call_to_action".equals(k9Var.mo68167b()) || "feedback".equals(k9Var.mo68167b())) {
                return new lr0(k9Var, r1Var, vVar, ej0, o70);
            }
            return new x71(vVar.mo71929h().mo71622c());
        }
    }

    /* renamed from: a */
    static C15476c m45115a(d81 d81) {
        if (d81 == null || !"button_click_only".equals(d81.mo66530b())) {
            return f43821a;
        }
        return f43822b;
    }

    /* renamed from: a */
    public abstract View.OnClickListener mo71654a(C13690k9 k9Var, ej0 ej0, C14435r1 r1Var, C15550v vVar, o70 o70);
}

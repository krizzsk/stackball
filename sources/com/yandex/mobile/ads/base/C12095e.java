package com.yandex.mobile.ads.base;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.C12348a0;
import com.yandex.mobile.ads.impl.C12468b0;
import com.yandex.mobile.ads.impl.C12947e0;
import com.yandex.mobile.ads.impl.C13371i0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.base.e */
public final class C12095e {

    /* renamed from: b */
    private static final Object f29156b = new Object();

    /* renamed from: c */
    private static volatile C12095e f29157c;

    /* renamed from: a */
    private final Map<String, C12468b0> f29158a = new HashMap();

    private C12095e() {
        mo64517a("window_type_browser", new C12094d());
    }

    /* renamed from: a */
    public static C12095e m31385a() {
        if (f29157c == null) {
            synchronized (f29156b) {
                if (f29157c == null) {
                    f29157c = new C12095e();
                }
            }
        }
        return f29157c;
    }

    /* renamed from: a */
    public synchronized void mo64517a(String str, C12468b0 b0Var) {
        if (!this.f29158a.containsKey(str)) {
            this.f29158a.put(str, b0Var);
        }
    }

    /* renamed from: a */
    public synchronized C12348a0 mo64516a(Context context, RelativeLayout relativeLayout, ResultReceiver resultReceiver, C13371i0 i0Var, C12947e0 e0Var, Intent intent, Window window) {
        C12468b0 b0Var;
        synchronized (this) {
            String stringExtra = intent.getStringExtra("window_type");
            if (stringExtra == null || (b0Var = this.f29158a.get(stringExtra)) == null) {
                return null;
            }
            C12348a0 a = b0Var.mo64515a(context, relativeLayout, resultReceiver, i0Var, e0Var, intent, window);
            return a;
        }
    }
}

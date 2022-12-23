package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tapjoy.internal.hj */
public final class C9368hj {

    /* renamed from: A */
    public final C9494o f23194A = new C9494o(this.f23199b, "idfa");

    /* renamed from: B */
    public final C9346h f23195B = new C9346h(this.f23199b, "idfa.optout");

    /* renamed from: C */
    final C9346h f23196C = new C9346h(this.f23199b, "push.optout");

    /* renamed from: D */
    final C9494o f23197D = new C9494o(this.f23199b, "appId");

    /* renamed from: a */
    final Context f23198a;

    /* renamed from: b */
    final SharedPreferences f23199b;

    /* renamed from: c */
    final C9494o f23200c;

    /* renamed from: d */
    final C9494o f23201d = new C9494o(this.f23199b, "ir");

    /* renamed from: e */
    final C9477k f23202e = new C9477k(this.f23199b, "fql", 0);

    /* renamed from: f */
    final C9477k f23203f = new C9477k(this.f23199b, "fq", 0);

    /* renamed from: g */
    final C9494o f23204g = new C9494o(this.f23199b, "push");

    /* renamed from: h */
    final C9477k f23205h = new C9477k(this.f23199b, "ss", 0);

    /* renamed from: i */
    final C9491l f23206i = new C9491l(this.f23199b, "std");

    /* renamed from: j */
    final C9491l f23207j = new C9491l(this.f23199b, "slt");

    /* renamed from: k */
    final C9491l f23208k = new C9491l(this.f23199b, "sld");

    /* renamed from: l */
    final C9494o f23209l = new C9494o(this.f23199b, "ptc");

    /* renamed from: m */
    final C9477k f23210m = new C9477k(this.f23199b, "pc", 0);

    /* renamed from: n */
    final C9402i f23211n = new C9402i(this.f23199b, "ptp");

    /* renamed from: o */
    final C9491l f23212o = new C9491l(this.f23199b, "lpt");

    /* renamed from: p */
    final C9402i f23213p = new C9402i(this.f23199b, "plp");

    /* renamed from: q */
    final C9494o f23214q = new C9494o(this.f23199b, "adv");

    /* renamed from: r */
    final C9494o f23215r = new C9494o(this.f23199b, "ui");

    /* renamed from: s */
    final C9477k f23216s = new C9477k(this.f23199b, "ul", -1);

    /* renamed from: t */
    final C9477k f23217t = new C9477k(this.f23199b, "uf", -1);

    /* renamed from: u */
    final C9494o f23218u = new C9494o(this.f23199b, TapjoyConstants.TJC_USER_VARIABLE_1);

    /* renamed from: v */
    final C9494o f23219v = new C9494o(this.f23199b, TapjoyConstants.TJC_USER_VARIABLE_2);

    /* renamed from: w */
    final C9494o f23220w = new C9494o(this.f23199b, TapjoyConstants.TJC_USER_VARIABLE_3);

    /* renamed from: x */
    final C9494o f23221x = new C9494o(this.f23199b, TapjoyConstants.TJC_USER_VARIABLE_4);

    /* renamed from: y */
    final C9494o f23222y = new C9494o(this.f23199b, TapjoyConstants.TJC_USER_VARIABLE_5);

    /* renamed from: z */
    final C9494o f23223z = new C9494o(this.f23199b, "utags");

    /* renamed from: a */
    public static C9368hj m25178a(Context context) {
        return new C9368hj(context);
    }

    private C9368hj(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23198a = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("fiverocks", 0);
        this.f23199b = sharedPreferences;
        this.f23200c = new C9494o(sharedPreferences, "sdk");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences.Editor mo58306a() {
        return this.f23199b.edit();
    }

    /* renamed from: b */
    public final String mo58308b() {
        String string = this.f23199b.getString("ir", (String) null);
        if (string == null) {
            File file = new File(C9344gz.m25065c(this.f23198a), "referrer");
            if (file.exists()) {
                try {
                    string = C9091bg.m24334a(file, C9066ak.f22357c);
                } catch (IOException unused) {
                }
            }
            this.f23199b.edit().putString("ir", string != null ? string : "").apply();
            if (string == null || string.length() <= 0) {
                return null;
            }
            return string;
        } else if (string.length() > 0) {
            return string;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58307a(boolean z) {
        C9493n.m25500a(this.f23199b, "gcm.onServer", z);
    }
}

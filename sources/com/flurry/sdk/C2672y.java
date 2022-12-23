package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.y */
public class C2672y {

    /* renamed from: b */
    private static final String f6301b = C2672y.class.getSimpleName();

    /* renamed from: a */
    boolean f6302a;

    /* renamed from: c */
    private final C2673z f6303c;

    /* renamed from: d */
    private final File f6304d;

    /* renamed from: e */
    private String f6305e;

    public C2672y() {
        this(C2494ck.m5371a().f5832a);
    }

    public C2672y(Context context) {
        this.f6303c = new C2673z();
        this.f6304d = context.getFileStreamPath(".flurryinstallreceiver.");
        String str = f6301b;
        C2530db.m5474a(3, str, "Referrer file name if it exists:  " + this.f6304d);
    }

    /* renamed from: a */
    public final synchronized Map<String, List<String>> mo17880a() {
        m5834c();
        return C2673z.m5838a(this.f6305e);
    }

    /* renamed from: c */
    private void m5834c() {
        if (!this.f6302a) {
            this.f6302a = true;
            String str = f6301b;
            C2530db.m5474a(4, str, "Loading referrer info from file: " + this.f6304d.getAbsolutePath());
            String c = C2617el.m5692c(this.f6304d);
            C2530db.m5476a(f6301b, "Referrer file contents: ".concat(String.valueOf(c)));
            m5833b(c);
        }
    }

    /* renamed from: b */
    private void m5833b(String str) {
        if (str != null) {
            this.f6305e = str;
        }
    }

    /* renamed from: b */
    public final synchronized String mo17882b() {
        m5834c();
        return this.f6305e;
    }

    /* renamed from: a */
    public final synchronized void mo17881a(String str) {
        this.f6302a = true;
        m5833b(str);
        C2617el.m5688a(this.f6304d, this.f6305e);
    }
}

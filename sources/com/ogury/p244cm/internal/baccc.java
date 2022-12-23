package com.ogury.p244cm.internal;

import android.content.Context;
import java.io.Closeable;

/* renamed from: com.ogury.cm.internal.baccc */
public final class baccc {

    /* renamed from: a */
    private boolean f20615a;

    /* renamed from: a */
    public static final void m22038a(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            bbabc.m22051b(th, "receiver$0");
            bbabc.m22051b(th2, "exception");
            bacca.f20614a.mo52834a(th, th2);
        }
    }

    /* renamed from: a */
    public final void mo52835a(Context context) {
        bbabc.m22051b(context, "context");
        boolean z = false;
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0) {
            z = true;
        }
        this.f20615a = z;
    }
}

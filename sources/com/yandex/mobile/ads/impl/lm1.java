package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class lm1 {

    /* renamed from: c */
    public static final C13865a f36753c = new C13865a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile lm1 f36754d;

    /* renamed from: a */
    private final Context f36755a;

    /* renamed from: b */
    private final u41 f36756b;

    /* renamed from: com.yandex.mobile.ads.impl.lm1$a */
    public static final class C13865a {
        private C13865a() {
        }

        public /* synthetic */ C13865a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private lm1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36755a = applicationContext;
        this.f36756b = kr1.m38478a(applicationContext, 4);
    }

    public /* synthetic */ lm1(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final lm1 m38835a(Context context) {
        C13865a aVar = f36753c;
        Intrinsics.checkNotNullParameter(context, "context");
        lm1 a = f36754d;
        if (a == null) {
            synchronized (aVar) {
                a = f36754d;
                if (a == null) {
                    a = new lm1(context, (DefaultConstructorMarker) null);
                    f36754d = a;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo68491a(String str, r41<fv0> r41) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f36756b.mo70284a(new iz0(this.f36755a, str, new qp1((r41<fv0>) null)));
    }
}

package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.core.internal.network.HeadersLoader;

/* renamed from: com.ogury.ed.internal.ds */
public final class C8167ds {

    /* renamed from: a */
    public static final C8168a f21142a = new C8168a((byte) 0);

    /* renamed from: b */
    private final C8180dy f21143b;

    /* renamed from: c */
    private final C8162dn f21144c;

    /* renamed from: d */
    private final C8170du f21145d;

    /* renamed from: e */
    private final C8181dz f21146e;

    public C8167ds(Context context, C8165dq dqVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(dqVar, "configurableRequestFieldPermission");
        this.f21143b = new C8180dy(context);
        this.f21144c = new C8162dn(context, dqVar);
        this.f21145d = new C8170du(context, dqVar);
        this.f21146e = new C8181dz(context, dqVar);
    }

    /* renamed from: com.ogury.ed.internal.ds$a */
    public static final class C8168a {
        public /* synthetic */ C8168a(byte b) {
            this();
        }

        private C8168a() {
        }

        /* renamed from: a */
        public static C8167ds m22760a(Context context, C8165dq dqVar) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(dqVar, "configurableRequestFieldPermission");
            Context applicationContext = context.getApplicationContext();
            C8467mq.m23878a((Object) applicationContext, "context.applicationContext");
            return new C8167ds(applicationContext, dqVar);
        }
    }

    /* renamed from: a */
    public final HeadersLoader mo53316a() {
        return this.f21143b;
    }

    /* renamed from: b */
    public final HeadersLoader mo53317b() {
        return this.f21144c;
    }

    /* renamed from: c */
    public final HeadersLoader mo53318c() {
        return this.f21145d;
    }

    /* renamed from: d */
    public final HeadersLoader mo53319d() {
        return this.f21146e;
    }
}

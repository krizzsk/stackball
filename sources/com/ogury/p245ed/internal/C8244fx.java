package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.aaid.OguryAaid;

/* renamed from: com.ogury.ed.internal.fx */
public final class C8244fx {

    /* renamed from: a */
    public static final C8245a f21351a = new C8245a((byte) 0);

    /* renamed from: b */
    private final Context f21352b;

    public C8244fx(Context context) {
        C8467mq.m23881b(context, "context");
        this.f21352b = context;
    }

    /* renamed from: com.ogury.ed.internal.fx$a */
    public static final class C8245a {
        public /* synthetic */ C8245a(byte b) {
            this();
        }

        private C8245a() {
        }
    }

    /* renamed from: a */
    public final OguryAaid mo53566a() {
        OguryAaid aaid = InternalCore.getAaid(this.f21352b);
        C8467mq.m23878a((Object) aaid, "getAaid(context)");
        return aaid;
    }

    /* renamed from: b */
    public final int mo53567b() {
        return InternalCore.getSdkType(this.f21352b);
    }

    /* renamed from: c */
    public final String mo53568c() {
        String token = InternalCore.getToken(this.f21352b, "consent_token");
        C8467mq.m23878a((Object) token, "getToken(context, \"consent_token\")");
        return token;
    }

    /* renamed from: d */
    public final String mo53569d() {
        String token = InternalCore.getToken(this.f21352b, "instance_token");
        C8467mq.m23878a((Object) token, "getToken(context, \"instance_token\")");
        return token;
    }
}

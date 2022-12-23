package com.ogury.core.internal;

import android.content.Context;
import com.ogury.core.internal.C7974d;
import com.ogury.core.internal.aaid.C7912e;
import com.ogury.core.internal.aaid.OguryAaid;

/* compiled from: InternalCore.kt */
public final class InternalCore {
    public static final InternalCore INSTANCE = new InternalCore();

    public static final String getVersion() {
        return "1.1.0";
    }

    private InternalCore() {
    }

    public static final void setSdkType(Context context, int i) {
        C7921ai.m22144b(context, "context");
        C7974d.C7975a aVar = C7974d.f20766a;
        C7974d.C7975a.m22231a(context).mo52962a(i);
    }

    public static final int getSdkType(Context context) {
        C7921ai.m22144b(context, "context");
        C7974d.C7975a aVar = C7974d.f20766a;
        return C7974d.C7975a.m22231a(context).mo52961a();
    }

    public static final OguryAaid getAaid(Context context) {
        C7921ai.m22144b(context, "context");
        return C7912e.f20686a.mo52892a(context);
    }

    public static final int getFrameworkValue() {
        return new C7943c((C7978f) null, 1).mo52909a();
    }

    public static final String getFrameworkName() {
        return new C7943c((C7978f) null, 1).mo52910b();
    }

    public static final String getToken(Context context, String str) {
        C7921ai.m22144b(context, "context");
        C7921ai.m22144b(str, "keyName");
        return new C7976e(context).mo52963a(str);
    }
}

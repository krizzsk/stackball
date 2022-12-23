package com.ogury.p244cm.internal;

import android.content.Context;
import com.ogury.p244cm.internal.acbac;

/* renamed from: com.ogury.cm.internal.acacc */
public final class acacc {

    /* renamed from: a */
    private acbaa[] f20538a;

    public acacc() {
        this((acbac) null, (acbab) null, 3, (bbabb) null);
    }

    private acacc(acbac acbac, acbab acbab) {
        bbabc.m22051b(acbac, "outsideShareTcf");
        bbabc.m22051b(acbab, "outsideShareCcpaf");
        this.f20538a = new acbaa[]{acbac, acbab};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acacc(acbac acbac, acbab acbab, int i, bbabb bbabb) {
        this(abbba.m21818a() != 2 ? new acbba() : new acbba(), new acbab());
        acbac.aaaaa aaaaa = acbac.f20540a;
        abbba abbba = abbba.f20411a;
    }

    /* renamed from: a */
    public final void mo52745a(Context context) {
        bbabc.m22051b(context, "context");
        for (acbaa a : this.f20538a) {
            a.mo52746a(context);
        }
    }
}

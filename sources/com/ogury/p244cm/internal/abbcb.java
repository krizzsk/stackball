package com.ogury.p244cm.internal;

import com.ogury.p244cm.OguryChoiceManager;

/* renamed from: com.ogury.cm.internal.abbcb */
public final class abbcb {

    /* renamed from: a */
    private OguryChoiceManager.Answer f20433a;

    /* renamed from: b */
    private boolean f20434b;

    /* renamed from: c */
    private abcab f20435c;

    /* renamed from: d */
    private abcaa f20436d;

    public abbcb() {
        this((abcab) null, (abcaa) null, 3, (bbabb) null);
    }

    public abbcb(abcab abcab, abcaa abcaa) {
        bbabc.m22051b(abcab, "consentResultTcf");
        bbabc.m22051b(abcaa, "consentResultCcpaf");
        this.f20435c = abcab;
        this.f20436d = abcaa;
        this.f20433a = OguryChoiceManager.Answer.NO_ANSWER;
    }

    public /* synthetic */ abbcb(abcab abcab, abcaa abcaa, int i, bbabb bbabb) {
        this(new abcac(), new abcaa());
    }

    /* renamed from: a */
    public final OguryChoiceManager.Answer mo52676a() {
        return this.f20433a;
    }

    /* renamed from: a */
    public final void mo52677a(OguryChoiceManager.Answer answer) {
        bbabc.m22051b(answer, "<set-?>");
        this.f20433a = answer;
    }

    /* renamed from: a */
    public final void mo52678a(boolean z) {
        this.f20434b = z;
    }

    /* renamed from: b */
    public final boolean mo52679b() {
        return this.f20434b;
    }

    /* renamed from: c */
    public final abcab mo52680c() {
        return this.f20435c;
    }

    /* renamed from: d */
    public final abcaa mo52681d() {
        return this.f20436d;
    }
}

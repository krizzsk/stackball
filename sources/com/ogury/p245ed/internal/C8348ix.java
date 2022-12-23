package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.ix */
public final class C8348ix {

    /* renamed from: a */
    private final String f21566a;

    /* renamed from: b */
    private final String f21567b;

    /* renamed from: c */
    private final String f21568c;

    /* renamed from: d */
    private final String f21569d;

    public C8348ix(String str, String str2, String str3, String str4) {
        C8467mq.m23881b(str, "identifier");
        C8467mq.m23881b(str2, "name");
        C8467mq.m23881b(str3, "iconUrl");
        C8467mq.m23881b(str4, "argsJson");
        this.f21566a = str;
        this.f21567b = str2;
        this.f21568c = str3;
        this.f21569d = str4;
    }

    /* renamed from: a */
    public final String mo53774a() {
        return this.f21566a;
    }

    /* renamed from: b */
    public final String mo53775b() {
        return this.f21567b;
    }

    /* renamed from: c */
    public final String mo53776c() {
        return this.f21568c;
    }

    /* renamed from: d */
    public final String mo53777d() {
        return this.f21569d;
    }

    /* renamed from: e */
    public final boolean mo53778e() {
        if (!(this.f21569d.length() == 0)) {
            if (!(this.f21566a.length() == 0)) {
                return this.f21568c.length() == 0;
            }
        }
    }
}

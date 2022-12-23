package com.ogury.p245ed.internal;

import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ih */
public class C8325ih extends C8363ji {

    /* renamed from: a */
    private final Pattern f21514a;

    /* renamed from: b */
    private final String f21515b;

    public C8325ih(Pattern pattern) {
        C8467mq.m23881b(pattern, "whitelistPattern");
        this.f21514a = pattern;
        this.f21515b = pattern.pattern();
    }

    /* renamed from: a */
    public final boolean mo53739a(String str) {
        C8467mq.m23881b(str, "url");
        String str2 = this.f21515b;
        C8467mq.m23878a((Object) str2, "stringPattern");
        return (str2.length() > 0) && !this.f21514a.matcher(str).find();
    }
}

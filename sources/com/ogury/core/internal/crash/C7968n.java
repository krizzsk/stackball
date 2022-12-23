package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7936av;
import java.util.Set;

/* renamed from: com.ogury.core.internal.crash.n */
/* compiled from: OguryPackageExtractor.kt */
public final class C7968n {

    /* renamed from: a */
    private final C7954f f20755a;

    public C7968n(C7954f fVar) {
        C7921ai.m22144b(fVar, "crashReportDao");
        this.f20755a = fVar;
    }

    /* renamed from: a */
    public final String mo52953a(String str) {
        C7921ai.m22144b(str, "stackTrace");
        Set<String> a = this.f20755a.mo52935a();
        if (a == null) {
            return null;
        }
        for (String next : a) {
            if (C7936av.m22161a((CharSequence) str, (CharSequence) next, false, 2)) {
                return next;
            }
        }
        return null;
    }
}

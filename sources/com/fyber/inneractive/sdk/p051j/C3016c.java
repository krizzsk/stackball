package com.fyber.inneractive.sdk.p051j;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3697x;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.j.c */
public final class C3016c extends C3015b {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo18251b() {
        return true;
    }

    /* renamed from: a */
    public final void mo18250a(String str, C2808t tVar) throws IOException {
        String str2;
        C3019f fVar = (C3019f) this.f7385a;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C3697x.f10003e.mo19601a(str);
        }
        String f = C2788f.m6078f();
        if (!TextUtils.isEmpty(f)) {
            String e = C3657l.m9124e(f);
            if (!TextUtils.isEmpty(e)) {
                str2 = e;
            }
        }
        fVar.f7424a = str2;
    }

    /* renamed from: a */
    public final C3018e mo18249a() {
        this.f7385a = new C3019f();
        return this.f7385a;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.impl.fh0;

public class jj0 {

    /* renamed from: a */
    private final Context f35331a;

    /* renamed from: b */
    private final C14645t1 f35332b;

    public jj0(Context context, C14645t1 t1Var) {
        this.f35331a = context;
        this.f35332b = t1Var;
    }

    /* renamed from: a */
    public C12350a2 mo68009a() {
        C12350a2 b = mo68010b();
        if (b == null) {
            b = this.f35332b.mo70108n() == null ? C14559s3.f39823p : null;
        }
        if (b != null) {
            return b;
        }
        if (!C13278h5.m36801a(this.f35331a)) {
            return C14559s3.f39809b;
        }
        return null;
    }

    /* renamed from: b */
    public C12350a2 mo68010b() {
        boolean z;
        C12350a2 a2Var;
        int i = fh0.f33365f;
        try {
            YandexMetrica.getLibraryVersion();
            z = true;
        } catch (NoClassDefFoundError unused) {
            z = false;
        }
        if (!z) {
            a2Var = C14559s3.f39825r;
        } else {
            a2Var = !C12862d9.m35154a() ? C14559s3.f39824q : null;
        }
        if (a2Var == null) {
            try {
                fh0.m36017a().mo67016a(this.f35331a);
                a2Var = null;
            } catch (fh0.C13054c e) {
                String message = e.getMessage();
                C12350a2 a2Var2 = C14559s3.f39808a;
                a2Var = new C12350a2(1, message);
            }
        }
        if (a2Var == null) {
            a2Var = !this.f35332b.mo70112r() ? C14559s3.f39822o : null;
        }
        if (a2Var != null) {
            return a2Var;
        }
        if (this.f35332b.mo70080a() == null) {
            return C14559s3.f39820m;
        }
        return null;
    }
}

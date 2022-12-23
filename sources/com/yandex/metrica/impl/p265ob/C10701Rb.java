package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10664Qb;
import java.io.Closeable;
import java.io.InputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.p271io.ByteStreamsKt;

/* renamed from: com.yandex.metrica.impl.ob.Rb */
public final class C10701Rb {

    /* renamed from: a */
    private final C10601Ob f25593a;

    /* renamed from: b */
    private final C10664Qb f25594b;

    public C10701Rb(C10601Ob ob, C10664Qb qb) {
        this.f25593a = ob;
        this.f25594b = qb;
    }

    /* renamed from: a */
    public final void mo62126a() {
        int i;
        Throwable th;
        HttpsURLConnection a = this.f25593a.mo61858a();
        if (a == null) {
            this.f25594b.mo61973a();
            return;
        }
        InputStream inputStream = null;
        try {
            a.connect();
            i = a.getResponseCode();
            try {
                inputStream = a.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                int length = ByteStreamsKt.readBytes(inputStream).length;
                a.disconnect();
                C10796U2.m27888a((Closeable) inputStream);
                this.f25594b.mo61974a(new C10664Qb.C10665a(i == 200, i, length, (String) null, 8));
            } catch (Throwable th2) {
                th = th2;
                try {
                    C10664Qb qb = this.f25594b;
                    qb.mo61974a(new C10664Qb.C10665a(false, i, 0, Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName() + ": " + th.getLocalizedMessage(), 5));
                } finally {
                    a.disconnect();
                    C10796U2.m27888a((Closeable) inputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
            C10664Qb qb2 = this.f25594b;
            qb2.mo61974a(new C10664Qb.C10665a(false, i, 0, Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName() + ": " + th.getLocalizedMessage(), 5));
        }
    }
}

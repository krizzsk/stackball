package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import com.yandex.metrica.impl.p265ob.C11156dh;

/* renamed from: com.yandex.metrica.impl.ob.ph */
public abstract class C11658ph<T extends C11156dh> implements C11565nh<T> {

    /* renamed from: a */
    private C11325hn f27980a;

    /* renamed from: a */
    public void mo63513a(Uri.Builder builder) {
        C11325hn hnVar = this.f27980a;
        if (hnVar != null) {
            hnVar.getClass();
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }

    /* renamed from: a */
    public void mo63514a(C11325hn hnVar) {
        this.f27980a = hnVar;
    }
}

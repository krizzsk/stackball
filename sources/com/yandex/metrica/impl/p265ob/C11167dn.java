package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.dn */
public class C11167dn {

    /* renamed from: a */
    private final Context f26752a;

    public C11167dn(Context context) {
        this.f26752a = context;
    }

    /* renamed from: a */
    public byte[] mo62799a() {
        try {
            return C11993ym.m30983b(new StringBuilder(this.f26752a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public byte[] mo62800b() {
        try {
            return C11993ym.m30983b(this.f26752a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}

package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hg */
public abstract class C9365hg {

    /* renamed from: c */
    long f23182c;

    /* renamed from: d */
    boolean f23183d;

    /* renamed from: e */
    public C9333gs f23184e;

    /* renamed from: f */
    public String f23185f;

    /* renamed from: g */
    C9285fq f23186g;

    /* renamed from: a */
    public abstract void mo58223a(C9347ha haVar, C9293fw fwVar);

    /* renamed from: b */
    public abstract void mo58224b();

    /* renamed from: c */
    public boolean mo58225c() {
        return true;
    }

    /* renamed from: a */
    static void m25169a(Context context, @Nullable String str) {
        if (!C9465jq.m25449c(str)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
            }
        }
    }
}

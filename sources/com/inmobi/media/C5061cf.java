package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.cf */
/* compiled from: MraidJsFetcher */
public class C5061cf {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f11579c = C5061cf.class.getSimpleName();

    /* renamed from: a */
    public String f11580a;

    /* renamed from: b */
    public C5299gc f11581b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11582d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11583e;

    /* renamed from: f */
    private long f11584f;

    public C5061cf(String str, int i, int i2, long j) {
        this.f11580a = str;
        this.f11582d = i;
        this.f11583e = i2;
        this.f11584f = j;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m11487a(C5061cf cfVar) {
        Context c = C5314go.m12203c();
        if (c != null) {
            if ((System.currentTimeMillis() / 1000) - new C5330gz(c, "mraid_js_store").mo40671a() > cfVar.f11584f) {
                return true;
            }
        }
        return false;
    }
}

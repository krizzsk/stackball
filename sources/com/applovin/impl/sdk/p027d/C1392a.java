package com.applovin.impl.sdk.p027d;

import android.content.Context;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;

/* renamed from: com.applovin.impl.sdk.d.a */
public abstract class C1392a implements Runnable {

    /* renamed from: a */
    private final String f3278a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C1469j f3279b;

    /* renamed from: c */
    private final C1505q f3280c;

    /* renamed from: d */
    private final Context f3281d;

    /* renamed from: e */
    private final boolean f3282e;

    public C1392a(String str, C1469j jVar) {
        this(str, jVar, false);
    }

    public C1392a(String str, C1469j jVar, boolean z) {
        this.f3278a = str;
        this.f3279b = jVar;
        this.f3280c = jVar.mo13139v();
        this.f3281d = jVar.mo13065D();
        this.f3282e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12944a(String str) {
        this.f3280c.mo13277b(this.f3278a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12945a(String str, Throwable th) {
        this.f3280c.mo13278b(this.f3278a, str, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12946b(String str) {
        this.f3280c.mo13279c(this.f3278a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12947c(String str) {
        this.f3280c.mo13280d(this.f3278a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1469j mo12948d() {
        return this.f3279b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo12949d(String str) {
        this.f3280c.mo13281e(this.f3278a, str);
    }

    /* renamed from: e */
    public String mo12950e() {
        return this.f3278a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Context mo12951f() {
        return this.f3281d;
    }

    /* renamed from: g */
    public boolean mo12952g() {
        return this.f3282e;
    }
}

package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public abstract class xc1 {

    /* renamed from: a */
    private final String f42510a;

    /* renamed from: b */
    private final boolean f42511b;

    /* renamed from: c */
    private bd1 f42512c;

    /* renamed from: d */
    private long f42513d;

    public xc1(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f42510a = str;
        this.f42511b = z;
        this.f42513d = -1;
    }

    /* renamed from: a */
    public final boolean mo70878a() {
        return this.f42511b;
    }

    /* renamed from: b */
    public final String mo70879b() {
        return this.f42510a;
    }

    /* renamed from: c */
    public final long mo70880c() {
        return this.f42513d;
    }

    /* renamed from: d */
    public final bd1 mo70881d() {
        return this.f42512c;
    }

    /* renamed from: e */
    public abstract long mo65736e();

    public String toString() {
        return this.f42510a;
    }

    /* renamed from: a */
    public final void mo70876a(long j) {
        this.f42513d = j;
    }

    /* renamed from: a */
    public final void mo70877a(bd1 bd1) {
        Intrinsics.checkNotNullParameter(bd1, "queue");
        bd1 bd12 = this.f42512c;
        if (bd12 != bd1) {
            if (bd12 == null) {
                this.f42512c = bd1;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc1(String str, boolean z, int i) {
        this(str, (i & 2) != 0 ? true : z);
    }
}

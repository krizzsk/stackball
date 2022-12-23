package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.g */
public class C3490g implements Comparable<C3490g> {

    /* renamed from: a */
    public final String f9452a;

    /* renamed from: b */
    public final long f9453b;

    /* renamed from: c */
    public final long f9454c;

    /* renamed from: d */
    public final boolean f9455d;

    /* renamed from: e */
    public final File f9456e;

    /* renamed from: f */
    public final long f9457f;

    public C3490g(String str, long j, long j2, long j3, File file) {
        this.f9452a = str;
        this.f9453b = j;
        this.f9454c = j2;
        this.f9455d = file != null;
        this.f9456e = file;
        this.f9457f = j3;
    }

    /* renamed from: a */
    public final int compareTo(C3490g gVar) {
        if (!this.f9452a.equals(gVar.f9452a)) {
            return this.f9452a.compareTo(gVar.f9452a);
        }
        int i = ((this.f9453b - gVar.f9453b) > 0 ? 1 : ((this.f9453b - gVar.f9453b) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}

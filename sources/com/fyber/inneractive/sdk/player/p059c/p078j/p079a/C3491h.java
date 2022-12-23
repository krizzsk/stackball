package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.h */
final class C3491h {

    /* renamed from: a */
    public final int f9458a;

    /* renamed from: b */
    public final String f9459b;

    /* renamed from: c */
    final TreeSet<C3496l> f9460c;

    /* renamed from: d */
    long f9461d;

    public C3491h(DataInputStream dataInputStream) throws IOException {
        this(dataInputStream.readInt(), dataInputStream.readUTF(), dataInputStream.readLong());
    }

    public C3491h(int i, String str, long j) {
        this.f9458a = i;
        this.f9459b = str;
        this.f9461d = j;
        this.f9460c = new TreeSet<>();
    }

    /* renamed from: a */
    public final int mo19328a() {
        long j = this.f9461d;
        return (((this.f9458a * 31) + this.f9459b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}

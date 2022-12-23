package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.gi */
public final class C9320gi {

    /* renamed from: a */
    public static final C9320gi f23058a = new C9320gi(0, 0, 0, 0.0d);

    /* renamed from: b */
    public final long f23059b;

    /* renamed from: c */
    public final long f23060c;

    /* renamed from: d */
    public final double f23061d;

    /* renamed from: e */
    public long f23062e;

    /* renamed from: f */
    private final long f23063f;

    public C9320gi(long j, long j2, long j3, double d) {
        this.f23063f = j;
        this.f23059b = j2;
        this.f23060c = j3;
        this.f23061d = d;
        this.f23062e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C9320gi giVar = (C9320gi) obj;
            return this.f23063f == giVar.f23063f && this.f23059b == giVar.f23059b && this.f23060c == giVar.f23060c && this.f23061d == giVar.f23061d && this.f23062e == giVar.f23062e;
        }
    }
}

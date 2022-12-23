package com.fyber.inneractive.sdk.mraid;

/* renamed from: com.fyber.inneractive.sdk.mraid.u */
public final class C3095u extends C3094t {

    /* renamed from: a */
    private final int f7606a;

    /* renamed from: b */
    private final int f7607b;

    /* renamed from: c */
    private final int f7608c = 0;

    /* renamed from: d */
    private final int f7609d = 0;

    private C3095u(int i, int i2) {
        this.f7606a = i;
        this.f7607b = i2;
    }

    /* renamed from: a */
    public static C3095u m7309a(int i, int i2) {
        return new C3095u(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo18660a() {
        return "currentPosition: { x: " + this.f7608c + ", y: " + this.f7609d + ", width: " + this.f7606a + ", height: " + this.f7607b + " }";
    }
}

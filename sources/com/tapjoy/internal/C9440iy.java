package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.iy */
final class C9440iy {

    /* renamed from: a */
    final byte[] f23464a;

    /* renamed from: b */
    int f23465b;

    /* renamed from: c */
    int f23466c;

    /* renamed from: d */
    boolean f23467d;

    /* renamed from: e */
    boolean f23468e;

    /* renamed from: f */
    C9440iy f23469f;

    /* renamed from: g */
    C9440iy f23470g;

    C9440iy() {
        this.f23464a = new byte[8192];
        this.f23468e = true;
        this.f23467d = false;
    }

    C9440iy(C9440iy iyVar) {
        this(iyVar.f23464a, iyVar.f23465b, iyVar.f23466c);
        iyVar.f23467d = true;
    }

    C9440iy(byte[] bArr, int i, int i2) {
        this.f23464a = bArr;
        this.f23465b = i;
        this.f23466c = i2;
        this.f23468e = false;
        this.f23467d = true;
    }

    /* renamed from: a */
    public final C9440iy mo58423a() {
        C9440iy iyVar = this.f23469f;
        if (iyVar == this) {
            iyVar = null;
        }
        C9440iy iyVar2 = this.f23470g;
        iyVar2.f23469f = this.f23469f;
        this.f23469f.f23470g = iyVar2;
        this.f23469f = null;
        this.f23470g = null;
        return iyVar;
    }

    /* renamed from: a */
    public final C9440iy mo58424a(C9440iy iyVar) {
        iyVar.f23470g = this;
        iyVar.f23469f = this.f23469f;
        this.f23469f.f23470g = iyVar;
        this.f23469f = iyVar;
        return iyVar;
    }

    /* renamed from: a */
    public final void mo58425a(C9440iy iyVar, int i) {
        if (iyVar.f23468e) {
            int i2 = iyVar.f23466c;
            if (i2 + i > 8192) {
                if (!iyVar.f23467d) {
                    int i3 = iyVar.f23465b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = iyVar.f23464a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        iyVar.f23466c -= iyVar.f23465b;
                        iyVar.f23465b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f23464a, this.f23465b, iyVar.f23464a, iyVar.f23466c, i);
            iyVar.f23466c += i;
            this.f23465b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}

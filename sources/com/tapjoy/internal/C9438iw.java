package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.iw */
final class C9438iw implements C9432is {

    /* renamed from: a */
    public final C9431ir f23458a = new C9431ir();

    /* renamed from: b */
    public final C9444jb f23459b;

    /* renamed from: c */
    boolean f23460c;

    C9438iw(C9444jb jbVar) {
        if (jbVar != null) {
            this.f23459b = jbVar;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public final void mo58381a(C9431ir irVar, long j) {
        if (!this.f23460c) {
            this.f23458a.mo58381a(irVar, j);
            m25365b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final C9432is mo58384b(C9434iu iuVar) {
        if (!this.f23460c) {
            this.f23458a.mo58384b(iuVar);
            return m25365b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final C9432is mo58385b(String str) {
        if (!this.f23460c) {
            this.f23458a.mo58385b(str);
            return m25365b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: e */
    public final C9432is mo58398e(int i) {
        if (!this.f23460c) {
            this.f23458a.mo58398e(i);
            return m25365b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public final C9432is mo58394d(int i) {
        if (!this.f23460c) {
            this.f23458a.mo58394d(i);
            return m25365b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final C9432is mo58401f(long j) {
        if (!this.f23460c) {
            this.f23458a.mo58401f(j);
            return m25365b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    private C9432is m25365b() {
        if (!this.f23460c) {
            C9431ir irVar = this.f23458a;
            long j = irVar.f23447b;
            if (j == 0) {
                j = 0;
            } else {
                C9440iy iyVar = irVar.f23446a.f23470g;
                if (iyVar.f23466c < 8192 && iyVar.f23468e) {
                    j -= (long) (iyVar.f23466c - iyVar.f23465b);
                }
            }
            if (j > 0) {
                this.f23459b.mo58381a(this.f23458a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public final C9432is mo58379a() {
        if (!this.f23460c) {
            long j = this.f23458a.f23447b;
            if (j > 0) {
                this.f23459b.mo58381a(this.f23458a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f23460c) {
            if (this.f23458a.f23447b > 0) {
                C9444jb jbVar = this.f23459b;
                C9431ir irVar = this.f23458a;
                jbVar.mo58381a(irVar, irVar.f23447b);
            }
            this.f23459b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f23460c) {
            Throwable th = null;
            try {
                if (this.f23458a.f23447b > 0) {
                    this.f23459b.mo58381a(this.f23458a, this.f23458a.f23447b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f23459b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f23460c = true;
            if (th != null) {
                C9448je.m25405a(th);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f23459b + ")";
    }
}

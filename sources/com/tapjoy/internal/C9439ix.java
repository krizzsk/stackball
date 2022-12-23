package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.EOFException;

/* renamed from: com.tapjoy.internal.ix */
final class C9439ix implements C9433it {

    /* renamed from: a */
    public final C9431ir f23461a = new C9431ir();

    /* renamed from: b */
    public final C9445jc f23462b;

    /* renamed from: c */
    boolean f23463c;

    C9439ix(C9445jc jcVar) {
        if (jcVar != null) {
            this.f23462b = jcVar;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public final long mo58382b(C9431ir irVar, long j) {
        if (irVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f23463c) {
            throw new IllegalStateException("closed");
        } else if (this.f23461a.f23447b == 0 && this.f23462b.mo58382b(this.f23461a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        } else {
            return this.f23461a.mo58382b(irVar, Math.min(j, this.f23461a.f23447b));
        }
    }

    /* renamed from: b */
    public final boolean mo58387b() {
        if (!this.f23463c) {
            return this.f23461a.mo58387b() && this.f23462b.mo58382b(this.f23461a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public final byte mo58388c() {
        mo58380a(1);
        return this.f23461a.mo58388c();
    }

    /* renamed from: b */
    public final C9434iu mo58386b(long j) {
        mo58380a(j);
        return this.f23461a.mo58386b(j);
    }

    /* renamed from: c */
    public final String mo58390c(long j) {
        mo58380a(j);
        return this.f23461a.mo58390c(j);
    }

    /* renamed from: e */
    public final int mo58396e() {
        mo58380a(4);
        return C9448je.m25402a(this.f23461a.mo58393d());
    }

    /* renamed from: f */
    public final long mo58400f() {
        mo58380a(8);
        return this.f23461a.mo58400f();
    }

    /* renamed from: d */
    public final void mo58395d(long j) {
        if (!this.f23463c) {
            while (j > 0) {
                if (this.f23461a.f23447b == 0 && this.f23462b.mo58382b(this.f23461a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f23461a.f23447b);
                this.f23461a.mo58395d(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f23463c) {
            this.f23463c = true;
            this.f23462b.close();
            C9431ir irVar = this.f23461a;
            try {
                irVar.mo58395d(irVar.f23447b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f23462b + ")";
    }

    /* renamed from: a */
    public final void mo58380a(long j) {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f23463c) {
            while (true) {
                if (this.f23461a.f23447b < j) {
                    if (this.f23462b.mo58382b(this.f23461a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                throw new EOFException();
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }
}

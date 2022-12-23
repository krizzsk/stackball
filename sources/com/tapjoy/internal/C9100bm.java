package com.tapjoy.internal;

import java.io.Writer;

/* renamed from: com.tapjoy.internal.bm */
public final class C9100bm implements C9099bl {

    /* renamed from: a */
    public final String f22387a;

    public C9100bm(String str) {
        this.f22387a = str;
    }

    /* renamed from: a */
    public final void mo57841a(Writer writer) {
        writer.write(this.f22387a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9100bm) {
            return this.f22387a.equals(((C9100bm) obj).f22387a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22387a.hashCode();
    }

    public final String toString() {
        return this.f22387a;
    }
}

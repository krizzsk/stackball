package com.inmobi.media;

import com.google.common.base.Ascii;

/* renamed from: com.inmobi.media.ba */
/* compiled from: RawAsset */
public final class C5005ba {

    /* renamed from: a */
    final byte f11355a;

    /* renamed from: b */
    final String f11356b;

    public C5005ba(byte b, String str) {
        this.f11355a = b;
        this.f11356b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5005ba)) {
            return false;
        }
        C5005ba baVar = (C5005ba) obj;
        return this.f11355a == baVar.f11355a && this.f11356b.equals(baVar.f11356b);
    }

    public final int hashCode() {
        return (this.f11355a * Ascii.f10112US) + this.f11356b.hashCode();
    }
}

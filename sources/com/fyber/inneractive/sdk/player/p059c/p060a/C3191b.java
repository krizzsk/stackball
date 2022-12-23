package com.fyber.inneractive.sdk.player.p059c.p060a;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.b */
public final class C3191b {

    /* renamed from: a */
    public static final C3191b f7939a = new C3191b(new int[]{2});

    /* renamed from: b */
    final int[] f7940b;

    /* renamed from: c */
    private final int f7941c = 2;

    private C3191b(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.f7940b = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3191b)) {
            return false;
        }
        C3191b bVar = (C3191b) obj;
        return Arrays.equals(this.f7940b, bVar.f7940b) && this.f7941c == bVar.f7941c;
    }

    public final int hashCode() {
        return this.f7941c + (Arrays.hashCode(this.f7940b) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7941c + ", supportedEncodings=" + Arrays.toString(this.f7940b) + "]";
    }
}

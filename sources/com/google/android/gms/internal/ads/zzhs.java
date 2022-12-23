package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzhs {
    private static final zzhs zzahx = new zzhs(new int[]{2}, 2);
    private final int[] zzahy;
    private final int zzahz = 2;

    private zzhs(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzahy = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean zzs(int i) {
        return Arrays.binarySearch(this.zzahy, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhs)) {
            return false;
        }
        zzhs zzhs = (zzhs) obj;
        return Arrays.equals(this.zzahy, zzhs.zzahy) && this.zzahz == zzhs.zzahz;
    }

    public final int hashCode() {
        return this.zzahz + (Arrays.hashCode(this.zzahy) * 31);
    }

    public final String toString() {
        int i = this.zzahz;
        String arrays = Arrays.toString(this.zzahy);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}

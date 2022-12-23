package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzegu {
    public static final zzegu zziix = new zzegu(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzegu zziiy = new zzegu(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzegu zziiz = new zzegu(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzegu zzija = new zzegu(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    private final double f10082a;

    /* renamed from: b */
    private final double f10083b;

    /* renamed from: c */
    private final double f10084c;

    /* renamed from: d */
    private final double f10085d;

    /* renamed from: w */
    private final double f10086w;
    private final double zziit;
    private final double zziiu;
    private final double zziiv;
    private final double zziiw;

    private zzegu(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zziit = d5;
        this.zziiu = d6;
        this.f10086w = d7;
        this.f10082a = d;
        this.f10083b = d2;
        this.f10084c = d3;
        this.f10085d = d4;
        this.zziiv = d8;
        this.zziiw = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzegu zzegu = (zzegu) obj;
        return Double.compare(zzegu.f10082a, this.f10082a) == 0 && Double.compare(zzegu.f10083b, this.f10083b) == 0 && Double.compare(zzegu.f10084c, this.f10084c) == 0 && Double.compare(zzegu.f10085d, this.f10085d) == 0 && Double.compare(zzegu.zziiv, this.zziiv) == 0 && Double.compare(zzegu.zziiw, this.zziiw) == 0 && Double.compare(zzegu.zziit, this.zziit) == 0 && Double.compare(zzegu.zziiu, this.zziiu) == 0 && Double.compare(zzegu.f10086w, this.f10086w) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zziit);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zziiu);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f10086w);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f10082a);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f10083b);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f10084c);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f10085d);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zziiv);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zziiw);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zziix)) {
            return "Rotate 0°";
        }
        if (equals(zziiy)) {
            return "Rotate 90°";
        }
        if (equals(zziiz)) {
            return "Rotate 180°";
        }
        if (equals(zzija)) {
            return "Rotate 270°";
        }
        double d = this.zziit;
        double d2 = this.zziiu;
        double d3 = this.f10086w;
        double d4 = this.f10082a;
        double d5 = this.f10083b;
        double d6 = this.f10084c;
        double d7 = this.f10085d;
        double d8 = this.zziiv;
        double d9 = this.zziiw;
        double d10 = d7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d10);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    public static zzegu zzn(ByteBuffer byteBuffer) {
        double zzd = zzbg.zzd(byteBuffer);
        double zzd2 = zzbg.zzd(byteBuffer);
        double zze = zzbg.zze(byteBuffer);
        return new zzegu(zzd, zzd2, zzbg.zzd(byteBuffer), zzbg.zzd(byteBuffer), zze, zzbg.zze(byteBuffer), zzbg.zze(byteBuffer), zzbg.zzd(byteBuffer), zzbg.zzd(byteBuffer));
    }
}

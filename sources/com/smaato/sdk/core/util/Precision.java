package com.smaato.sdk.core.util;

public final class Precision {
    public static final double EPSILON = Double.longBitsToDouble(4368491638549381120L);
    private static final long NEGATIVE_ZERO_DOUBLE_BITS = Double.doubleToRawLongBits(-0.0d);
    private static final int NEGATIVE_ZERO_FLOAT_BITS = Float.floatToRawIntBits(-0.0f);
    private static final long POSITIVE_ZERO_DOUBLE_BITS = Double.doubleToRawLongBits(0.0d);
    private static final int POSITIVE_ZERO_FLOAT_BITS = Float.floatToRawIntBits(0.0f);
    public static final double SAFE_MIN = Double.longBitsToDouble(4503599627370496L);

    private Precision() {
    }

    public static int compareTo(double d, double d2, double d3) {
        if (equals(d, d2, d3)) {
            return 0;
        }
        return d < d2 ? -1 : 1;
    }

    public static int compareTo(double d, double d2, int i) {
        if (equals(d, d2, i)) {
            return 0;
        }
        return d < d2 ? -1 : 1;
    }

    public static boolean equals(float f, float f2) {
        return equals(f, f2, 1);
    }

    public static boolean equalsIncludingNaN(float f, float f2) {
        int i = (f > f ? 1 : (f == f ? 0 : -1));
        if (i == 0 && f2 == f2) {
            return equals(f, f2, 1);
        }
        return !(((f2 > f2 ? 1 : (f2 == f2 ? 0 : -1)) != 0) ^ (i != 0));
    }

    public static boolean equals(float f, float f2, float f3) {
        return equals(f, f2, 1) || Math.abs(f2 - f) <= f3;
    }

    public static boolean equalsIncludingNaN(float f, float f2, float f3) {
        return equalsIncludingNaN(f, f2) || Math.abs(f2 - f) <= f3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r0 <= (r8 - r1)) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (java.lang.Math.abs(r0 - r1) <= r8) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean equals(float r6, float r7, int r8) {
        /*
            int r0 = java.lang.Float.floatToRawIntBits(r6)
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            r2 = r0 ^ r1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001c
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            if (r0 > r8) goto L_0x001a
        L_0x0018:
            r8 = 1
            goto L_0x0034
        L_0x001a:
            r8 = 0
            goto L_0x0034
        L_0x001c:
            if (r0 >= r1) goto L_0x0025
            int r2 = POSITIVE_ZERO_FLOAT_BITS
            int r1 = r1 - r2
            int r2 = NEGATIVE_ZERO_FLOAT_BITS
            int r0 = r0 - r2
            goto L_0x002e
        L_0x0025:
            int r2 = POSITIVE_ZERO_FLOAT_BITS
            int r0 = r0 - r2
            int r2 = NEGATIVE_ZERO_FLOAT_BITS
            int r1 = r1 - r2
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002e:
            if (r1 > r8) goto L_0x001a
            int r8 = r8 - r1
            if (r0 > r8) goto L_0x001a
            goto L_0x0018
        L_0x0034:
            if (r8 == 0) goto L_0x0043
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0043
            boolean r6 = java.lang.Float.isNaN(r7)
            if (r6 != 0) goto L_0x0043
            return r3
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.util.Precision.equals(float, float, int):boolean");
    }

    public static boolean equalsIncludingNaN(float f, float f2, int i) {
        int i2 = (f > f ? 1 : (f == f ? 0 : -1));
        if (i2 == 0 && f2 == f2) {
            return equals(f, f2, i);
        }
        return !(((f2 > f2 ? 1 : (f2 == f2 ? 0 : -1)) != 0) ^ (i2 != 0));
    }

    public static boolean equals(double d, double d2) {
        return equals(d, d2, 1);
    }

    public static boolean equalsIncludingNaN(double d, double d2) {
        int i = (d > d ? 1 : (d == d ? 0 : -1));
        if (i == 0 && d2 == d2) {
            return equals(d, d2, 1);
        }
        return !((i != 0) ^ ((d2 > d2 ? 1 : (d2 == d2 ? 0 : -1)) != 0));
    }

    public static boolean equals(double d, double d2, double d3) {
        return equals(d, d2, 1) || Math.abs(d2 - d) <= d3;
    }

    public static boolean equalsIncludingNaN(double d, double d2, double d3) {
        return equalsIncludingNaN(d, d2) || Math.abs(d2 - d) <= d3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 <= (r5 - r3)) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (java.lang.Math.abs(r1 - r3) <= ((long) r0)) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean equals(double r14, double r16, int r18) {
        /*
            r0 = r18
            long r1 = java.lang.Double.doubleToRawLongBits(r14)
            long r3 = java.lang.Double.doubleToRawLongBits(r16)
            long r5 = r1 ^ r3
            r7 = -9223372036854775808
            long r5 = r5 & r7
            r7 = 1
            r8 = 0
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0025
            long r1 = r1 - r3
            long r1 = java.lang.Math.abs(r1)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0023
        L_0x0021:
            r0 = 1
            goto L_0x0044
        L_0x0023:
            r0 = 0
            goto L_0x0044
        L_0x0025:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0030
            long r5 = POSITIVE_ZERO_DOUBLE_BITS
            long r3 = r3 - r5
            long r5 = NEGATIVE_ZERO_DOUBLE_BITS
            long r1 = r1 - r5
            goto L_0x0039
        L_0x0030:
            long r5 = POSITIVE_ZERO_DOUBLE_BITS
            long r1 = r1 - r5
            long r5 = NEGATIVE_ZERO_DOUBLE_BITS
            long r3 = r3 - r5
            r12 = r1
            r1 = r3
            r3 = r12
        L_0x0039:
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0023
            long r5 = r5 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0023
            goto L_0x0021
        L_0x0044:
            if (r0 == 0) goto L_0x0053
            boolean r0 = java.lang.Double.isNaN(r14)
            if (r0 != 0) goto L_0x0053
            boolean r0 = java.lang.Double.isNaN(r16)
            if (r0 != 0) goto L_0x0053
            return r7
        L_0x0053:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.util.Precision.equals(double, double, int):boolean");
    }

    public static boolean equalsIncludingNaN(double d, double d2, int i) {
        int i2 = (d > d ? 1 : (d == d ? 0 : -1));
        if (i2 == 0 && d2 == d2) {
            return equals(d, d2, i);
        }
        return !(((d2 > d2 ? 1 : (d2 == d2 ? 0 : -1)) != 0) ^ (i2 != 0));
    }
}

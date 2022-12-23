package com.tapjoy.internal;

import java.math.BigInteger;

/* renamed from: com.tapjoy.internal.ci */
public final class C9128ci extends Number {

    /* renamed from: a */
    private final String f22445a;

    public C9128ci(String str) {
        this.f22445a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (number instanceof Integer) {
            return intValue() == number.intValue();
        }
        if (number instanceof Long) {
            return longValue() == number.longValue();
        }
        if (number instanceof Float) {
            return floatValue() == number.floatValue();
        }
        if (number instanceof Double) {
            return doubleValue() == number.doubleValue();
        }
        return this.f22445a.equals(number.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f22445a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigInteger(r2.f22445a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f22445a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f22445a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = r2.f22445a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9128ci.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f22445a);
        } catch (NumberFormatException unused) {
            return new BigInteger(this.f22445a).longValue();
        }
    }

    public final float floatValue() {
        return Float.parseFloat(this.f22445a);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f22445a);
    }

    public final String toString() {
        return this.f22445a;
    }
}

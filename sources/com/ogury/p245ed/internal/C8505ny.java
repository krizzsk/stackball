package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.ny */
class C8505ny extends C8504nx {
    /* renamed from: a */
    public static final boolean m23925a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}

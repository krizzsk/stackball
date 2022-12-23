package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.az */
/* compiled from: StringsJVM.kt */
class C7940az extends C7939ay {
    /* renamed from: a */
    public static /* synthetic */ boolean m22162a(String str, String str2, boolean z, int i) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public static int m22158a(CharSequence charSequence) {
        C7921ai.m22144b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    private static /* synthetic */ int m22160a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        boolean z3;
        boolean z4;
        C7927ao aqVar = new C7930aq(C7932ar.m22153a(i, 0), C7932ar.m22154b(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = aqVar.mo52897a();
            int b = aqVar.mo52898b();
            int c = aqVar.mo52899c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (true) {
                int length = charSequence2.length();
                C7921ai.m22144b(charSequence2, "$this$regionMatchesImpl");
                C7921ai.m22144b(charSequence, "other");
                if (a >= 0 && charSequence2.length() - length >= 0 && a <= charSequence.length() - length) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            z3 = true;
                            break;
                        } else if (!C7933as.m22157a(charSequence2.charAt(i4 + 0), charSequence.charAt(a + i4), z)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    return a;
                }
                if (a == b) {
                    return -1;
                }
                a += c;
            }
        } else {
            int a2 = aqVar.mo52897a();
            int b2 = aqVar.mo52898b();
            int c2 = aqVar.mo52899c();
            if (c2 >= 0) {
                if (a2 > b2) {
                    return -1;
                }
            } else if (a2 < b2) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                String str2 = (String) charSequence;
                int length2 = charSequence2.length();
                C7921ai.m22144b(str, "$this$regionMatches");
                C7921ai.m22144b(str2, "other");
                if (!z) {
                    z4 = str.regionMatches(0, str2, a2, length2);
                } else {
                    z4 = str.regionMatches(z, 0, str2, a2, length2);
                }
                if (z4) {
                    return a2;
                }
                if (a2 == b2) {
                    return -1;
                }
                a2 += c2;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m22159a(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C7921ai.m22144b(charSequence, "$this$indexOf");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(46, i);
        }
        char[] cArr = {'.'};
        C7921ai.m22144b(charSequence, "$this$indexOfAny");
        C7921ai.m22144b(cArr, "chars");
        if (charSequence instanceof String) {
            C7921ai.m22144b(cArr, "$this$single");
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        int a = C7932ar.m22153a(i, 0);
        int a2 = C7936av.m22158a(charSequence);
        if (a > a2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(a);
            int i3 = 0;
            while (true) {
                if (i3 > 0) {
                    z2 = false;
                    break;
                } else if (C7933as.m22157a(cArr[i3], charAt, false)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                return a;
            }
            if (a == a2) {
                return -1;
            }
            a++;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m22161a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        int i2;
        C7921ai.m22144b(charSequence, "$this$contains");
        C7921ai.m22144b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            String str = (String) charSequence2;
            C7921ai.m22144b(charSequence, "$this$indexOf");
            C7921ai.m22144b(str, "string");
            if (!(charSequence instanceof String)) {
                i2 = m22160a(charSequence, str, 0, charSequence.length(), false, false, 16);
            } else {
                i2 = ((String) charSequence).indexOf(str, 0);
            }
            return i2 >= 0;
        }
        return m22160a(charSequence, charSequence2, 0, charSequence.length(), false, false, 16) >= 0;
    }
}

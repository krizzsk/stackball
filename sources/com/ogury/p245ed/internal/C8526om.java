package com.ogury.p245ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.om */
class C8526om extends C8525ol {
    /* renamed from: a */
    public static final void m23962a(int i) {
    }

    /* renamed from: b */
    public static final C8486nh m23966b(CharSequence charSequence) {
        C8467mq.m23881b(charSequence, "$this$indices");
        return new C8486nh(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static final int m23970c(CharSequence charSequence) {
        C8467mq.m23881b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    public static final String m23959a(CharSequence charSequence, C8486nh nhVar) {
        C8467mq.m23881b(charSequence, "$this$substring");
        C8467mq.m23881b(nhVar, "range");
        return charSequence.subSequence(nhVar.mo53992e().intValue(), nhVar.mo53993f().intValue() + 1).toString();
    }

    /* renamed from: c */
    public static final String m23973c(String str, String str2) {
        C8467mq.m23881b(str, "$this$substringAfterLast");
        C8467mq.m23881b(str2, "missingDelimiterValue");
        int d = C8516oc.m23953a((CharSequence) str, C8516oc.m23970c(str));
        if (d == -1) {
            return str2;
        }
        String substring = str.substring(d + 1, str.length());
        C8467mq.m23878a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final CharSequence m23958a(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C8467mq.m23881b(charSequence, "$this$replaceRange");
        C8467mq.m23881b(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            C8467mq.m23878a((Object) sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            C8467mq.m23878a((Object) sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: a */
    public static final boolean m23964a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C8467mq.m23881b(charSequence, "$this$regionMatchesImpl");
        C8467mq.m23881b(charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C8503nw.m23925a(charSequence.charAt(i3 + 0), charSequence2.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final int m23957a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C8467mq.m23881b(charSequence, "$this$indexOfAny");
        C8467mq.m23881b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C8488ni.m23918a(i);
            int c = C8516oc.m23970c(charSequence);
            if (a > c) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C8503nw.m23925a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == c) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C8388kg.m23746a(cArr), i);
        }
    }

    /* renamed from: a */
    public static final int m23956a(CharSequence charSequence, char[] cArr, int i) {
        C8467mq.m23881b(charSequence, "$this$lastIndexOfAny");
        C8467mq.m23881b(cArr, "chars");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C8388kg.m23746a(cArr), i);
        }
        for (int b = C8488ni.m23920b(i, C8516oc.m23970c(charSequence)); b >= 0; b--) {
            char charAt = charSequence.charAt(b);
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    break;
                } else if (C8503nw.m23925a(cArr[i2], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return b;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m23965b(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C8483nf nhVar = new C8486nh(C8488ni.m23918a(i), C8488ni.m23920b(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = nhVar.mo53983a();
            int b = nhVar.mo53984b();
            int c = nhVar.mo53985c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (!C8516oc.m23964a(charSequence2, charSequence, a, charSequence2.length(), z)) {
                if (a == b) {
                    return -1;
                }
                a += c;
            }
            return a;
        }
        int a2 = nhVar.mo53983a();
        int b2 = nhVar.mo53984b();
        int c2 = nhVar.mo53985c();
        if (c2 >= 0) {
            if (a2 > b2) {
                return -1;
            }
        } else if (a2 < b2) {
            return -1;
        }
        while (!C8516oc.m23950a((String) charSequence2, (String) charSequence, a2, charSequence2.length(), z)) {
            if (a2 == b2) {
                return -1;
            }
            a2 += c2;
        }
        return a2;
    }

    /* renamed from: a */
    public static final int m23955a(CharSequence charSequence, String str, int i, boolean z) {
        C8467mq.m23881b(charSequence, "$this$indexOf");
        C8467mq.m23881b(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m23965b(charSequence, str, i, charSequence.length(), z);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: a */
    public static final int m23953a(CharSequence charSequence, int i) {
        C8467mq.m23881b(charSequence, "$this$lastIndexOf");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(46, i);
        }
        return C8516oc.m23956a(charSequence, new char[]{'.'}, i);
    }

    /* renamed from: a */
    public static final boolean m23963a(CharSequence charSequence, CharSequence charSequence2) {
        C8467mq.m23881b(charSequence, "$this$contains");
        C8467mq.m23881b(charSequence2, "other");
        return charSequence2 instanceof String ? C8516oc.m23955a(charSequence, (String) charSequence2, 0, false) >= 0 : m23965b(charSequence, charSequence2, 0, charSequence.length(), false) >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C8495np<C8486nh> m23972c(CharSequence charSequence, char[] cArr) {
        C8516oc.m23962a(0);
        return new C8510oa(charSequence, 0, new C8527a(cArr, false));
    }

    /* renamed from: com.ogury.ed.internal.om$a */
    static final class C8527a extends C8468mr implements C8443lv<CharSequence, Integer, C8380jz<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f21741a;

        /* renamed from: b */
        final /* synthetic */ boolean f21742b = false;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8527a(char[] cArr, boolean z) {
            super(2);
            this.f21741a = cArr;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53233a(Object obj, Object obj2) {
            return m23976a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        private C8380jz<Integer, Integer> m23976a(CharSequence charSequence, int i) {
            C8467mq.m23881b(charSequence, "$receiver");
            int a = C8516oc.m23957a(charSequence, this.f21741a, i, this.f21742b);
            if (a < 0) {
                return null;
            }
            return C8383kb.m23743a(Integer.valueOf(a), 1);
        }
    }

    /* renamed from: a */
    public static final List<String> m23961a(CharSequence charSequence, char[] cArr) {
        C8467mq.m23881b(charSequence, "$this$split");
        C8467mq.m23881b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m23967b(charSequence, String.valueOf(cArr[0]));
        }
        Iterable<C8486nh> a = C8496nq.m23923a(m23972c(charSequence, cArr));
        Collection arrayList = new ArrayList(C8394km.m23759a(a));
        for (C8486nh a2 : a) {
            arrayList.add(C8516oc.m23959a(charSequence, a2));
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private static final List<String> m23967b(CharSequence charSequence, String str) {
        C8516oc.m23962a(0);
        int a = C8516oc.m23955a(charSequence, str, 0, false);
        if (a == -1) {
            return C8394km.m23752a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, a).toString());
            i = str.length() + a;
            a = C8516oc.m23955a(charSequence, str, i, false);
        } while (a != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }
}

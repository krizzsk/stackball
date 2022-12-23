package com.ogury.p245ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.ol */
class C8525ol extends C8524ok {
    /* renamed from: a */
    public static final String m23947a(String str, String str2, String str3) {
        C8467mq.m23881b(str, "$this$replaceFirst");
        C8467mq.m23881b(str2, "oldValue");
        C8467mq.m23881b(str3, "newValue");
        CharSequence charSequence = str;
        int a = C8516oc.m23954a(charSequence, str2);
        if (a < 0) {
            return str;
        }
        return C8516oc.m23958a(charSequence, a, str2.length() + a, (CharSequence) str3).toString();
    }

    /* renamed from: a */
    public static final boolean m23949a(String str, String str2) {
        C8467mq.m23881b(str, "$this$startsWith");
        C8467mq.m23881b(str2, "prefix");
        return str.startsWith(str2);
    }

    /* renamed from: a */
    public static final boolean m23948a(CharSequence charSequence) {
        boolean z;
        C8467mq.m23881b(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            Iterator it = C8516oc.m23966b(charSequence).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C8503nw.m23924a(charSequence.charAt(((C8423lb) it).mo53956a()))) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m23950a(String str, String str2, int i, int i2, boolean z) {
        C8467mq.m23881b(str, "$this$regionMatches");
        C8467mq.m23881b(str2, "other");
        if (!z) {
            return str.regionMatches(0, str2, i, i2);
        }
        return str.regionMatches(z, 0, str2, i, i2);
    }
}

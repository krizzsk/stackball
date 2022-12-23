package com.ogury.p244cm.internal;

import com.ogury.p244cm.internal.bbcbc;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ogury.cm.internal.bbcbb */
public final class bbcbb implements Serializable {

    /* renamed from: a */
    public static final aaaaa f20663a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final Pattern f20664b;

    /* renamed from: com.ogury.cm.internal.bbcbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ String m22084a(String str, String str2, String str3, boolean z, int i, Object obj) {
            bbabc.m22051b(str, "receiver$0");
            bbabc.m22051b(str2, "oldValue");
            bbabc.m22051b(str3, "newValue");
            CharSequence charSequence = str;
            String[] strArr = {str2};
            bbabc.m22051b(charSequence, "receiver$0");
            bbabc.m22051b(strArr, "delimiters");
            return bbbbb.m22065a(bbbbb.m22063a(bbcbc.m22093a(charSequence, strArr, 0, false, 0, 2, (Object) null), new bbcbc.aaaab(charSequence)), str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bbaab) null, 62, (Object) null);
        }

        /* renamed from: a */
        public static <T> void m22085a(Appendable appendable, T t, bbaab<? super T, ? extends CharSequence> bbaab) {
            bbabc.m22051b(appendable, "receiver$0");
            if (bbaab != null) {
                appendable.append((CharSequence) bbaab.mo52626a(t));
                return;
            }
            if (t != null ? t instanceof CharSequence : true) {
                appendable.append((CharSequence) t);
            } else if (t instanceof Character) {
                appendable.append(((Character) t).charValue());
            } else {
                appendable.append(String.valueOf(t));
            }
        }

        /* renamed from: a */
        public static boolean m22086a(char c, char c2, boolean z) {
            if (c == c2) {
                return true;
            }
            if (!z) {
                return false;
            }
            return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
        }

        /* renamed from: a */
        public static boolean m22087a(CharSequence charSequence) {
            boolean z;
            boolean z2;
            bbabc.m22051b(charSequence, "receiver$0");
            if (charSequence.length() != 0) {
                bbabc.m22051b(charSequence, "receiver$0");
                Iterator it = new bbbac(0, charSequence.length() - 1).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    char charAt = charSequence.charAt(((bacba) it).mo52830a());
                    if (Character.isWhitespace(charAt) || Character.isSpaceChar(charAt)) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
                return z;
            }
        }

        /* renamed from: a */
        public static boolean m22088a(String str, int i, String str2, int i2, int i3, boolean z) {
            bbabc.m22051b(str, "receiver$0");
            bbabc.m22051b(str2, "other");
            return !z ? str.regionMatches(0, str2, i2, i3) : str.regionMatches(z, 0, str2, i2, i3);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m22089a(String str, String str2, boolean z, int i, Object obj) {
            bbabc.m22051b(str, "receiver$0");
            bbabc.m22051b(str2, "prefix");
            return str.startsWith(str2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bbcbb(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.ogury.p244cm.internal.bbabc.m22051b(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r2, (java.lang.String) r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p244cm.internal.bbcbb.<init>(java.lang.String):void");
    }

    private bbcbb(Pattern pattern) {
        bbabc.m22051b(pattern, "nativePattern");
        this.f20664b = pattern;
    }

    /* renamed from: a */
    public final boolean mo52861a(CharSequence charSequence) {
        bbabc.m22051b(charSequence, "input");
        return this.f20664b.matcher(charSequence).matches();
    }

    /* renamed from: b */
    public final bbcac mo52862b(CharSequence charSequence) {
        bbabc.m22051b(charSequence, "input");
        Matcher matcher = this.f20664b.matcher(charSequence);
        bbabc.m22048a((Object) matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new bbcba(matcher, charSequence);
    }

    public final String toString() {
        String pattern = this.f20664b.toString();
        bbabc.m22048a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }
}

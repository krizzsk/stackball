package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.j */
/* compiled from: _ArraysJvm.kt */
class C7982j extends C7981i {
    /* renamed from: a */
    public static <T, A extends Appendable> A m22235a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7918af<? super T, ? extends CharSequence> afVar) {
        C7921ai.m22144b(tArr, "$this$joinTo");
        C7921ai.m22144b(a, "buffer");
        C7921ai.m22144b(charSequence, "separator");
        C7921ai.m22144b(charSequence2, "prefix");
        C7921ai.m22144b(charSequence3, "postfix");
        C7921ai.m22144b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            boolean z = true;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7921ai.m22144b(a, "$this$appendElement");
            if (afVar != null) {
                a.append((CharSequence) afVar.mo52870a(t));
            } else {
                if (t != null) {
                    z = t instanceof CharSequence;
                }
                if (z) {
                    a.append((CharSequence) t);
                } else if (t instanceof Character) {
                    a.append(((Character) t).charValue());
                } else {
                    a.append(String.valueOf(t));
                }
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m22236a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7918af afVar, int i2) {
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = "...";
        C7921ai.m22144b(objArr, "$this$joinToString");
        C7921ai.m22144b(charSequence, "separator");
        C7921ai.m22144b(charSequence5, "prefix");
        C7921ai.m22144b(charSequence6, "postfix");
        C7921ai.m22144b(charSequence7, "truncated");
        String sb = ((StringBuilder) C7980h.m22235a((T[]) objArr, new StringBuilder(), charSequence, charSequence5, charSequence6, -1, charSequence7, (C7918af) null)).toString();
        C7921ai.m22142a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}

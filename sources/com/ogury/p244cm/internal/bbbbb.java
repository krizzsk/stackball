package com.ogury.p244cm.internal;

import android.content.Context;
import com.ogury.p244cm.ConsentActivity;
import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbbb */
public final class bbbbb {
    /* renamed from: a */
    public static <T, R> bbbba<R> m22063a(bbbba<? extends T> bbbba, bbaab<? super T, ? extends R> bbaab) {
        bbabc.m22051b(bbbba, "receiver$0");
        bbabc.m22051b(bbaab, "transform");
        return new bbbca<>(bbbba, bbaab);
    }

    /* renamed from: a */
    private static <T, A extends Appendable> A m22064a(bbbba<? extends T> bbbba, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab<? super T, ? extends CharSequence> bbaab) {
        bbabc.m22051b(bbbba, "receiver$0");
        bbabc.m22051b(a, "buffer");
        bbabc.m22051b(charSequence, "separator");
        bbabc.m22051b(charSequence2, "prefix");
        bbabc.m22051b(charSequence3, "postfix");
        bbabc.m22051b(charSequence4, "truncated");
        a.append(charSequence2);
        Iterator<? extends T> a2 = bbbba.mo52829a();
        int i2 = 0;
        while (a2.hasNext()) {
            Object next = a2.next();
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            bbcbc.m22085a((Appendable) a, next, (bbaab) null);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m22065a(bbbba bbbba, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab bbaab, int i2, Object obj) {
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = "...";
        bbabc.m22051b(bbbba, "receiver$0");
        bbabc.m22051b(charSequence, "separator");
        bbabc.m22051b(charSequence5, "prefix");
        bbabc.m22051b(charSequence6, "postfix");
        bbabc.m22051b(charSequence7, "truncated");
        String sb = ((StringBuilder) m22064a(bbbba, new StringBuilder(), charSequence, charSequence5, charSequence6, -1, charSequence7, (bbaab) null)).toString();
        bbabc.m22048a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static boolean m22066a(Context context) {
        bbabc.m22051b(context, "context");
        return ConsentActivity.aaaaa.m21630b(context);
    }
}

package com.smaato.sdk.core.util;

import java.util.Iterator;

public final class Joiner {
    private Joiner() {
    }

    public static String join(CharSequence charSequence, Iterable iterable) {
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(iterable);
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
            while (it.hasNext()) {
                sb.append(charSequence);
                sb.append(it.next());
            }
        }
        return sb.toString();
    }

    public static String join(CharSequence charSequence, Object... objArr) {
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(objArr);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (obj != null) {
                if (z) {
                    z = false;
                } else {
                    sb.append(charSequence);
                }
                sb.append(obj);
            }
        }
        return sb.toString();
    }
}

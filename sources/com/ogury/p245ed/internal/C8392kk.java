package com.ogury.p245ed.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kk */
class C8392kk extends C8391kj {
    /* renamed from: a */
    public static final <T> boolean m23747a(T[] tArr, T t) {
        C8467mq.m23881b(tArr, "$this$contains");
        return C8388kg.m23748b(tArr, t) >= 0;
    }

    /* renamed from: b */
    public static final <T> int m23748b(T[] tArr, T t) {
        C8467mq.m23881b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C8467mq.m23880a((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static final char m23746a(char[] cArr) {
        C8467mq.m23881b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m23749b(T[] tArr) {
        C8467mq.m23881b(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return C8394km.m23756a();
        }
        if (length != 1) {
            return C8388kg.m23750c(tArr);
        }
        return C8394km.m23752a(tArr[0]);
    }

    /* renamed from: c */
    public static final <T> List<T> m23750c(T[] tArr) {
        C8467mq.m23881b(tArr, "$this$toMutableList");
        return new ArrayList<>(C8394km.m23755a(tArr));
    }
}

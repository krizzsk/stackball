package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.aabcc */
public final class aabcc {

    /* renamed from: a */
    public static final aabcc f20363a = new aabcc();

    private aabcc() {
    }

    /* renamed from: a */
    public static boolean m21766a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static boolean m21767a(Integer[] numArr, int i) {
        int i2;
        bbabc.m22051b(numArr, TtmlNode.RUBY_CONTAINER);
        if (!(!(numArr.length == 0)) || numArr.length <= (i2 = i / 32)) {
            return false;
        }
        return m21766a(numArr[i2].intValue(), (int) Math.pow(2.0d, (double) (i - (i2 * 32))));
    }
}

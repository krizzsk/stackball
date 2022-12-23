package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.y */
public final class C9508y {
    /* renamed from: a */
    public static Object m25551a(C9086bb bbVar) {
        int i = 1;
        while (true) {
            try {
                return bbVar.call();
            } catch (OutOfMemoryError e) {
                if (i < 10) {
                    System.gc();
                    i++;
                } else {
                    throw e;
                }
            }
        }
    }
}

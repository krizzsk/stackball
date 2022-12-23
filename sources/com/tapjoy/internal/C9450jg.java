package com.tapjoy.internal;

import java.io.PrintStream;
import java.util.Map;

/* renamed from: com.tapjoy.internal.jg */
public final class C9450jg {
    /* renamed from: a */
    public static void m25407a(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
        } else if (!obj.getClass().isArray()) {
            try {
                stringBuffer.append(obj.toString());
            } catch (Throwable th) {
                PrintStream printStream = System.err;
                printStream.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]");
                th.printStackTrace();
                stringBuffer.append("[FAILED toString()]");
            }
        } else if (obj instanceof boolean[]) {
            m25416a(stringBuffer, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m25408a(stringBuffer, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m25409a(stringBuffer, (char[]) obj);
        } else if (obj instanceof short[]) {
            m25415a(stringBuffer, (short[]) obj);
        } else if (obj instanceof int[]) {
            m25412a(stringBuffer, (int[]) obj);
        } else if (obj instanceof long[]) {
            m25413a(stringBuffer, (long[]) obj);
        } else if (obj instanceof float[]) {
            m25411a(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            m25410a(stringBuffer, (double[]) obj);
        } else {
            m25414a(stringBuffer, (Object[]) obj, map);
        }
    }

    /* renamed from: a */
    private static void m25414a(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, (Object) null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m25407a(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25416a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25408a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25409a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25415a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25412a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25413a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25411a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m25410a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }
}

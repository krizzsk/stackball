package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.o7 */
public final class C11592o7 {

    /* renamed from: a */
    public static final C11592o7 f27839a = new C11592o7();

    private C11592o7() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final C11555n7 m29967a(Throwable th) {
        return f27839a.m29968a(th, 1, 0);
    }

    /* renamed from: a */
    private final C11555n7 m29968a(Throwable th, int i, int i2) {
        StackTraceElement[] stackTraceElementArr;
        C11555n7 n7Var;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        Intrinsics.checkNotNullExpressionValue(stackTraceElementArr, "Utils.getStackTraceSafely(throwable)");
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement l7Var : stackTraceElementArr) {
            arrayList2.add(new C11484l7(l7Var));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (!(i2 < i)) {
                cause = null;
            }
            if (cause != null) {
                n7Var = f27839a.m29968a(cause, 30, i2 + 1);
                if (C10796U2.m27890a(19) || i2 >= i) {
                    arrayList = null;
                } else {
                    Throwable[] suppressed = th.getSuppressed();
                    Intrinsics.checkNotNullExpressionValue(suppressed, "throwable.suppressed");
                    ArrayList arrayList3 = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        C11592o7 o7Var = f27839a;
                        Intrinsics.checkNotNullExpressionValue(th2, "it");
                        arrayList3.add(o7Var.m29968a(th2, 1, i2));
                    }
                    arrayList = arrayList3;
                }
                return new C11555n7(name, message, arrayList2, n7Var, arrayList);
            }
        }
        n7Var = null;
        if (C10796U2.m27890a(19)) {
        }
        arrayList = null;
        return new C11555n7(name, message, arrayList2, n7Var, arrayList);
    }
}

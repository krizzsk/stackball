package com.tapjoy.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tapjoy.internal.w */
public final class C9504w {

    /* renamed from: a */
    private static final ThreadLocal f23617a = new ThreadLocal() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        }
    };

    /* renamed from: b */
    private static final ThreadLocal f23618b = new ThreadLocal() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        }
    };

    /* renamed from: a */
    public static String m25547a(Date date) {
        return ((DateFormat) f23617a.get()).format(date);
    }
}

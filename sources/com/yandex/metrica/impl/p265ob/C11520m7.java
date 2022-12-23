package com.yandex.metrica.impl.p265ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.m7 */
public class C11520m7 {

    /* renamed from: a */
    public final String f27716a;

    /* renamed from: b */
    public final int f27717b;

    /* renamed from: c */
    public final long f27718c;

    /* renamed from: d */
    public final String f27719d;

    /* renamed from: e */
    public final Integer f27720e;

    /* renamed from: f */
    public final List<StackTraceElement> f27721f;

    public C11520m7(String str, int i, long j, String str2, Integer num, List<StackTraceElement> list) {
        this.f27716a = str;
        this.f27717b = i;
        this.f27718c = j;
        this.f27719d = str2;
        this.f27720e = num;
        this.f27721f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}

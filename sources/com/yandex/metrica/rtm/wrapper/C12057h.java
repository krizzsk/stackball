package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

/* renamed from: com.yandex.metrica.rtm.wrapper.h */
public class C12057h implements C12054e {

    /* renamed from: a */
    private final ExceptionProcessor f29005a;

    public C12057h(C12058i iVar, Context context) throws Throwable {
        this(new ExceptionProcessor(context, new C12050a(iVar)));
    }

    public void reportException(String str, Throwable th) {
        try {
            this.f29005a.onException(str, th);
        } catch (Throwable unused) {
        }
    }

    C12057h(ExceptionProcessor exceptionProcessor) throws Throwable {
        this.f29005a = exceptionProcessor;
    }
}

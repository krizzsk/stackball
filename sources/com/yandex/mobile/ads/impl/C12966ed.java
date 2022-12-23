package com.yandex.mobile.ads.impl;

import java.io.File;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.ed */
public interface C12966ed {

    /* renamed from: com.yandex.mobile.ads.impl.ed$a */
    public static class C12967a extends IOException {
        public C12967a(String str) {
            super(str);
        }

        public C12967a(Throwable th) {
            super(th);
        }

        public C12967a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ed$b */
    public interface C12968b {
        /* renamed from: a */
        void mo66814a(C12966ed edVar, C14752ud udVar);

        /* renamed from: a */
        void mo66815a(C12966ed edVar, C14752ud udVar, C14752ud udVar2);

        /* renamed from: b */
        void mo66816b(C12966ed edVar, C14752ud udVar);
    }

    /* renamed from: a */
    long mo66804a();

    /* renamed from: a */
    C14593sh mo66805a(String str);

    /* renamed from: a */
    C14752ud mo66806a(String str, long j) throws InterruptedException, C12967a;

    /* renamed from: a */
    File mo66807a(String str, long j, long j2) throws C12967a;

    /* renamed from: a */
    void mo66808a(C14752ud udVar) throws C12967a;

    /* renamed from: a */
    void mo66809a(File file, long j) throws C12967a;

    /* renamed from: a */
    void mo66810a(String str, C14680th thVar) throws C12967a;

    /* renamed from: b */
    long mo66811b(String str, long j, long j2);

    /* renamed from: b */
    C14752ud mo66812b(String str, long j) throws C12967a;

    /* renamed from: b */
    void mo66813b(C14752ud udVar);
}

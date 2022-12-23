package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ia */
public interface C13397ia {

    /* renamed from: com.yandex.mobile.ads.impl.ia$a */
    public static final class C13398a extends Exception {
        public C13398a(Throwable th) {
            super(th);
        }

        public C13398a(String str) {
            super(str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ia$b */
    public static final class C13399b extends Exception {
        public C13399b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ia$c */
    public interface C13400c {
    }

    /* renamed from: com.yandex.mobile.ads.impl.ia$d */
    public static final class C13401d extends Exception {
        public C13401d(int i) {
            super("AudioTrack write failed: " + i);
        }
    }
}

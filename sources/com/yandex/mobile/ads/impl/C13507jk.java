package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.extractor.mp4.C12204d;
import com.yandex.mobile.ads.exo.extractor.mp4.C12208f;
import java.lang.reflect.Constructor;

/* renamed from: com.yandex.mobile.ads.impl.jk */
public final class C13507jk implements z50 {

    /* renamed from: a */
    private static final Constructor<? extends w50> f35338a;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.yandex.mobile.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.yandex.mobile.ads.exo.ext.flac.FlacExtractor").asSubclass(w50.class).getConstructor(new Class[0]);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f35338a = constructor;
    }

    /* renamed from: a */
    public synchronized w50[] mo64871a() {
        w50[] w50Arr;
        w50Arr = new w50[14];
        w50Arr[0] = new uk0(0);
        w50Arr[1] = new C12204d(0, (de1) null);
        w50Arr[2] = new C12208f(0);
        w50Arr[3] = new po0(0, -9223372036854775807L);
        w50Arr[4] = new C15032w5(0);
        w50Arr[5] = new C12685c();
        w50Arr[6] = new sf1(1, new de1(0), new C14762uk(0));
        w50Arr[7] = new m70();
        w50Arr[8] = new cw0();
        w50Arr[9] = new a21(new de1(0));
        w50Arr[10] = new zp1();
        w50Arr[11] = new C13687k7(0);
        w50Arr[12] = new C13018f();
        Constructor<? extends w50> constructor = f35338a;
        if (constructor != null) {
            try {
                w50Arr[13] = (w50) constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        } else {
            w50Arr[13] = new f70(0);
        }
        return w50Arr;
    }
}

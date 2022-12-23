package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ci0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public interface gd1<T extends ci0<?>> {

    /* renamed from: a */
    public static final C13194a f33955a = C13194a.f33956a;

    /* renamed from: com.yandex.mobile.ads.impl.gd1$a */
    public static final class C13194a {

        /* renamed from: a */
        static final /* synthetic */ C13194a f33956a = new C13194a();

        /* renamed from: com.yandex.mobile.ads.impl.gd1$a$a */
        public static final class C13195a implements gd1<T> {
            C13195a() {
            }

            /* renamed from: a */
            public T mo66059a(String str) {
                Intrinsics.checkNotNullParameter(str, "templateId");
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.gd1$a$b */
        public static final class C13196b implements gd1<T> {

            /* renamed from: b */
            final /* synthetic */ Map<String, T> f33957b;

            C13196b(Map<String, ? extends T> map) {
                this.f33957b = map;
            }

            /* renamed from: a */
            public T mo66059a(String str) {
                Intrinsics.checkNotNullParameter(str, "templateId");
                return (ci0) this.f33957b.get(str);
            }
        }

        private C13194a() {
        }

        /* renamed from: a */
        public final <T extends ci0<?>> gd1<T> mo67252a() {
            return new C13195a();
        }

        /* renamed from: a */
        public final <T extends ci0<?>> gd1<T> mo67253a(Map<String, ? extends T> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new C13196b(map);
        }
    }

    /* renamed from: a */
    T mo66059a(String str);
}

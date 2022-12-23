package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ch */
public interface C12735ch {

    /* renamed from: a */
    public static final /* synthetic */ int f31922a = 0;

    /* renamed from: com.yandex.mobile.ads.impl.ch$a */
    public static final class C12736a {

        /* renamed from: a */
        static final /* synthetic */ C12736a f31923a = new C12736a();

        private C12736a() {
        }

        /* renamed from: a */
        public final List<C12735ch> mo66294a(String str) {
            Intrinsics.checkNotNullParameter(str, "condition");
            return new k51(str).mo68134c();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ch$b */
    public static final class C12737b implements C12735ch {

        /* renamed from: b */
        private final String f31924b;

        public C12737b(String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            this.f31924b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12737b) && Intrinsics.areEqual((Object) this.f31924b, (Object) ((C12737b) obj).f31924b);
        }

        public int hashCode() {
            return this.f31924b.hashCode();
        }

        public String toString() {
            return "RawString(value=" + this.f31924b + ')';
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ch$c */
    public static final class C12738c implements C12735ch {

        /* renamed from: b */
        private final String f31925b;

        public C12738c(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.f31925b = str;
        }

        /* renamed from: a */
        public final String mo66298a() {
            return this.f31925b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12738c) && Intrinsics.areEqual((Object) this.f31925b, (Object) ((C12738c) obj).f31925b);
        }

        public int hashCode() {
            return this.f31925b.hashCode();
        }

        public String toString() {
            return "Variable(name=" + this.f31925b + ')';
        }
    }
}

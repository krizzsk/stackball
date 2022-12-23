package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

interface hb1 {

    /* renamed from: com.yandex.mobile.ads.impl.hb1$a */
    public static final class C13299a {

        /* renamed from: a */
        static final /* synthetic */ C13299a f34344a = new C13299a();

        private C13299a() {
        }

        /* renamed from: a */
        public static final hb1 m36901a(C13299a aVar, C13303e eVar) {
            switch (eVar.ordinal()) {
                case 0:
                    return C13308j.f34360a;
                case 1:
                case 2:
                case 3:
                case 5:
                    return C13306h.f34358a;
                case 4:
                    return C13304f.f34356a;
                case 6:
                    return C13300b.f34345a;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$b */
    public static final class C13300b implements hb1 {

        /* renamed from: a */
        public static final C13300b f34345a = new C13300b();

        private C13300b() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$c */
    public static final class C13301c implements hb1 {

        /* renamed from: a */
        public static final C13301c f34346a = new C13301c();

        private C13301c() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            k51.mo68132a();
            return C13299a.m36901a(C13299a.f34344a, eVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$d */
    public static final class C13302d implements hb1 {

        /* renamed from: a */
        public static final C13302d f34347a = new C13302d();

        private C13302d() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            k51.mo68132a();
            return C13299a.m36901a(C13299a.f34344a, eVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$e */
    public enum C13303e {
        Letter,
        VarSpecial,
        OpeningBracket,
        Other,
        SingleQuote,
        EscapeCharacter,
        EndOfLine
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$f */
    public static final class C13304f implements hb1 {

        /* renamed from: a */
        public static final C13304f f34356a = new C13304f();

        private C13304f() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            switch (eVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return f34356a;
                case 4:
                    return C13301c.f34346a;
                case 5:
                    return C13305g.f34357a;
                case 6:
                    k51.mo68131a("Invalid quoted string");
                    throw null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$g */
    public static final class C13305g implements hb1 {

        /* renamed from: a */
        public static final C13305g f34357a = new C13305g();

        private C13305g() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            switch (eVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return C13304f.f34356a;
                case 6:
                    k51.mo68131a("Invalid escape sequence");
                    throw null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$h */
    public static final class C13306h implements hb1 {

        /* renamed from: a */
        public static final C13306h f34358a = new C13306h();

        private C13306h() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            switch (eVar.ordinal()) {
                case 0:
                    k51.mo68132a();
                    return C13308j.f34360a;
                case 1:
                case 2:
                case 3:
                case 5:
                    return f34358a;
                case 4:
                    k51.mo68132a();
                    return C13304f.f34356a;
                case 6:
                    k51.mo68132a();
                    return C13300b.f34345a;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$i */
    public static final class C13307i implements hb1 {

        /* renamed from: a */
        public static final C13307i f34359a = new C13307i();

        private C13307i() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            return C13299a.m36901a(C13299a.f34344a, eVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hb1$j */
    public static final class C13308j implements hb1 {

        /* renamed from: a */
        public static final C13308j f34360a = new C13308j();

        private C13308j() {
        }

        /* renamed from: a */
        public hb1 mo67508a(C13303e eVar, k51 k51) {
            Intrinsics.checkNotNullParameter(eVar, "input");
            Intrinsics.checkNotNullParameter(k51, IronSourceConstants.EVENTS_RESULT);
            switch (eVar.ordinal()) {
                case 0:
                case 1:
                    return f34360a;
                case 2:
                    return C13302d.f34347a;
                case 3:
                case 5:
                    k51.mo68133b();
                    return C13306h.f34358a;
                case 4:
                    k51.mo68133b();
                    return C13304f.f34356a;
                case 6:
                    k51.mo68133b();
                    return C13300b.f34345a;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: a */
    hb1 mo67508a(C13303e eVar, k51 k51);
}

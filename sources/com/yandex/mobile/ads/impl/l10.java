package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public enum l10 {
    VISIBLE(TJAdUnitConstants.String.VISIBLE),
    INVISIBLE("invisible"),
    GONE("gone");
    

    /* renamed from: c */
    public static final C13827b f36487c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, l10> f36488d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f36493b;

    /* renamed from: com.yandex.mobile.ads.impl.l10$a */
    static final class C13826a extends Lambda implements Function1<String, l10> {

        /* renamed from: b */
        public static final C13826a f36494b = null;

        static {
            f36494b = new C13826a();
        }

        C13826a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            l10 l10 = l10.VISIBLE;
            if (Intrinsics.areEqual((Object) str, (Object) l10.f36493b)) {
                return l10;
            }
            l10 l102 = l10.INVISIBLE;
            if (Intrinsics.areEqual((Object) str, (Object) l102.f36493b)) {
                return l102;
            }
            l10 l103 = l10.GONE;
            if (Intrinsics.areEqual((Object) str, (Object) l103.f36493b)) {
                return l103;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.l10$b */
    public static final class C13827b {
        private C13827b() {
        }

        public /* synthetic */ C13827b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, l10> mo68307a() {
            return l10.f36488d;
        }
    }

    static {
        f36487c = new C13827b((DefaultConstructorMarker) null);
        f36488d = C13826a.f36494b;
    }

    private l10(String str) {
        this.f36493b = str;
    }
}

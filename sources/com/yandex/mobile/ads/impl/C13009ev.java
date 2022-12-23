package com.yandex.mobile.ads.impl;

import com.adcolony.sdk.AdColonyUserMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ev */
public enum C13009ev {
    NONE("none"),
    SINGLE(AdColonyUserMetadata.USER_SINGLE);
    

    /* renamed from: c */
    public static final C13011b f33158c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C13009ev> f33159d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f33163b;

    /* renamed from: com.yandex.mobile.ads.impl.ev$a */
    static final class C13010a extends Lambda implements Function1<String, C13009ev> {

        /* renamed from: b */
        public static final C13010a f33164b = null;

        static {
            f33164b = new C13010a();
        }

        C13010a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C13009ev evVar = C13009ev.NONE;
            if (Intrinsics.areEqual((Object) str, (Object) evVar.f33163b)) {
                return evVar;
            }
            C13009ev evVar2 = C13009ev.SINGLE;
            if (Intrinsics.areEqual((Object) str, (Object) evVar2.f33163b)) {
                return evVar2;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ev$b */
    public static final class C13011b {
        private C13011b() {
        }

        public /* synthetic */ C13011b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C13009ev> mo66877a() {
            return C13009ev.f33159d;
        }
    }

    static {
        f33158c = new C13011b((DefaultConstructorMarker) null);
        f33159d = C13010a.f33164b;
    }

    private C13009ev(String str) {
        this.f33163b = str;
    }
}

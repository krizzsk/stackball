package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.hn */
public enum C13332hn {
    TOP("top"),
    CENTER("center"),
    BOTTOM(TJAdUnitConstants.String.BOTTOM);
    

    /* renamed from: c */
    public static final C13334b f34465c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C13332hn> f34466d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f34471b;

    /* renamed from: com.yandex.mobile.ads.impl.hn$a */
    static final class C13333a extends Lambda implements Function1<String, C13332hn> {

        /* renamed from: b */
        public static final C13333a f34472b = null;

        static {
            f34472b = new C13333a();
        }

        C13333a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C13332hn hnVar = C13332hn.TOP;
            if (Intrinsics.areEqual((Object) str, (Object) hnVar.f34471b)) {
                return hnVar;
            }
            C13332hn hnVar2 = C13332hn.CENTER;
            if (Intrinsics.areEqual((Object) str, (Object) hnVar2.f34471b)) {
                return hnVar2;
            }
            C13332hn hnVar3 = C13332hn.BOTTOM;
            if (Intrinsics.areEqual((Object) str, (Object) hnVar3.f34471b)) {
                return hnVar3;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hn$b */
    public static final class C13334b {
        private C13334b() {
        }

        public /* synthetic */ C13334b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C13332hn> mo67568a() {
            return C13332hn.f34466d;
        }
    }

    static {
        f34465c = new C13334b((DefaultConstructorMarker) null);
        f34466d = C13333a.f34472b;
    }

    private C13332hn(String str) {
        this.f34471b = str;
    }
}

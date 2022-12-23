package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.tt */
public enum C14709tt {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit");
    

    /* renamed from: c */
    public static final C14711b f40453c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C14709tt> f40454d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f40459b;

    /* renamed from: com.yandex.mobile.ads.impl.tt$a */
    static final class C14710a extends Lambda implements Function1<String, C14709tt> {

        /* renamed from: b */
        public static final C14710a f40460b = null;

        static {
            f40460b = new C14710a();
        }

        C14710a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C14709tt ttVar = C14709tt.FILL;
            if (Intrinsics.areEqual((Object) str, (Object) ttVar.f40459b)) {
                return ttVar;
            }
            C14709tt ttVar2 = C14709tt.NO_SCALE;
            if (Intrinsics.areEqual((Object) str, (Object) ttVar2.f40459b)) {
                return ttVar2;
            }
            C14709tt ttVar3 = C14709tt.FIT;
            if (Intrinsics.areEqual((Object) str, (Object) ttVar3.f40459b)) {
                return ttVar3;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tt$b */
    public static final class C14711b {
        private C14711b() {
        }

        public /* synthetic */ C14711b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C14709tt> mo70232a() {
            return C14709tt.f40454d;
        }
    }

    static {
        f40453c = new C14711b((DefaultConstructorMarker) null);
        f40454d = C14710a.f40460b;
    }

    private C14709tt(String str) {
        this.f40459b = str;
    }
}

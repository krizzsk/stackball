package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ds */
public enum C12915ds {
    LIGHT("light"),
    MEDIUM(FirebaseAnalytics.Param.MEDIUM),
    REGULAR("regular"),
    BOLD("bold");
    

    /* renamed from: c */
    public static final C12917b f32749c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C12915ds> f32750d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f32756b;

    /* renamed from: com.yandex.mobile.ads.impl.ds$a */
    static final class C12916a extends Lambda implements Function1<String, C12915ds> {

        /* renamed from: b */
        public static final C12916a f32757b = null;

        static {
            f32757b = new C12916a();
        }

        C12916a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C12915ds dsVar = C12915ds.LIGHT;
            if (Intrinsics.areEqual((Object) str, (Object) dsVar.f32756b)) {
                return dsVar;
            }
            C12915ds dsVar2 = C12915ds.MEDIUM;
            if (Intrinsics.areEqual((Object) str, (Object) dsVar2.f32756b)) {
                return dsVar2;
            }
            C12915ds dsVar3 = C12915ds.REGULAR;
            if (Intrinsics.areEqual((Object) str, (Object) dsVar3.f32756b)) {
                return dsVar3;
            }
            C12915ds dsVar4 = C12915ds.BOLD;
            if (Intrinsics.areEqual((Object) str, (Object) dsVar4.f32756b)) {
                return dsVar4;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ds$b */
    public static final class C12917b {
        private C12917b() {
        }

        public /* synthetic */ C12917b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C12915ds> mo66664a() {
            return C12915ds.f32750d;
        }
    }

    static {
        f32749c = new C12917b((DefaultConstructorMarker) null);
        f32750d = C12916a.f32757b;
    }

    private C12915ds(String str) {
        this.f32756b = str;
    }
}

package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public enum o00 {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");
    

    /* renamed from: c */
    public static final C14159b f38039c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, o00> f38040d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f38046b;

    /* renamed from: com.yandex.mobile.ads.impl.o00$a */
    static final class C14158a extends Lambda implements Function1<String, o00> {

        /* renamed from: b */
        public static final C14158a f38047b = null;

        static {
            f38047b = new C14158a();
        }

        C14158a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            o00 o00 = o00.NONE;
            if (Intrinsics.areEqual((Object) str, (Object) o00.f38046b)) {
                return o00;
            }
            o00 o002 = o00.DATA_CHANGE;
            if (Intrinsics.areEqual((Object) str, (Object) o002.f38046b)) {
                return o002;
            }
            o00 o003 = o00.STATE_CHANGE;
            if (Intrinsics.areEqual((Object) str, (Object) o003.f38046b)) {
                return o003;
            }
            o00 o004 = o00.ANY_CHANGE;
            if (Intrinsics.areEqual((Object) str, (Object) o004.f38046b)) {
                return o004;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o00$b */
    public static final class C14159b {
        private C14159b() {
        }

        public /* synthetic */ C14159b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, o00> mo69093a() {
            return o00.f38040d;
        }
    }

    static {
        f38039c = new C14159b((DefaultConstructorMarker) null);
        f38040d = C14158a.f38047b;
    }

    private o00(String str) {
        this.f38046b = str;
    }
}

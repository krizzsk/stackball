package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.gn */
public enum C13215gn {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");
    

    /* renamed from: c */
    public static final C13217b f34045c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function1<String, C13215gn> f34046d = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f34051b;

    /* renamed from: com.yandex.mobile.ads.impl.gn$a */
    static final class C13216a extends Lambda implements Function1<String, C13215gn> {

        /* renamed from: b */
        public static final C13216a f34052b = null;

        static {
            f34052b = new C13216a();
        }

        C13216a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "string");
            C13215gn gnVar = C13215gn.LEFT;
            if (Intrinsics.areEqual((Object) str, (Object) gnVar.f34051b)) {
                return gnVar;
            }
            C13215gn gnVar2 = C13215gn.CENTER;
            if (Intrinsics.areEqual((Object) str, (Object) gnVar2.f34051b)) {
                return gnVar2;
            }
            C13215gn gnVar3 = C13215gn.RIGHT;
            if (Intrinsics.areEqual((Object) str, (Object) gnVar3.f34051b)) {
                return gnVar3;
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gn$b */
    public static final class C13217b {
        private C13217b() {
        }

        public /* synthetic */ C13217b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<String, C13215gn> mo67332a() {
            return C13215gn.f34046d;
        }
    }

    static {
        f34045c = new C13217b((DefaultConstructorMarker) null);
        f34046d = C13216a.f34052b;
    }

    private C13215gn(String str) {
        this.f34051b = str;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C13782ku;
import com.yandex.mobile.ads.impl.C13897lu;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.hu */
public final class C13345hu {

    /* renamed from: b */
    public static final C13346a f34556b = new C13346a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C13897lu f34557c = new C13897lu.C13898a().mo68518a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile C13345hu f34558d;

    /* renamed from: a */
    private final C13782ku f34559a;

    /* renamed from: com.yandex.mobile.ads.impl.hu$a */
    public static final class C13346a {
        private C13346a() {
        }

        public /* synthetic */ C13346a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13345hu mo67633a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C13345hu b = C13345hu.f34558d;
            if (b != null) {
                return b;
            }
            synchronized (this) {
                C13345hu b2 = C13345hu.f34558d;
                if (b2 != null) {
                    return b2;
                }
                C13346a aVar = C13345hu.f34556b;
                C13345hu huVar = new C13345hu(context, C13345hu.f34557c, (DefaultConstructorMarker) null);
                C13346a aVar2 = C13345hu.f34556b;
                C13345hu.f34558d = huVar;
                return huVar;
            }
        }
    }

    private C13345hu(Context context, C13897lu luVar) {
        C13782ku.C13783a a = C12893dj.m35305a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f34559a = a.mo66593a(applicationContext).mo66594a(luVar).mo66595a();
    }

    public /* synthetic */ C13345hu(Context context, C13897lu luVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, luVar);
    }

    /* renamed from: c */
    public final C13782ku mo67632c() {
        return this.f34559a;
    }
}

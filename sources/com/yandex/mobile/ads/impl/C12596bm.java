package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.bm */
public class C12596bm extends C15253yi {

    /* renamed from: b */
    private final C12397am f31367b;

    /* renamed from: com.yandex.mobile.ads.impl.bm$a */
    private static final class C12597a implements LayoutInflater.Factory2 {

        /* renamed from: a */
        private final C12596bm f31368a;

        public C12597a(C12596bm bmVar) {
            Intrinsics.checkNotNullParameter(bmVar, "div2Context");
            this.f31368a = bmVar;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attributeSet, "attrs");
            return onCreateView(str, context, attributeSet);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attributeSet, "attrs");
            if (Intrinsics.areEqual((Object) "com.yandex.div.core.view2.Div2View", (Object) str) || Intrinsics.areEqual((Object) "Div2View", (Object) str)) {
                return new C13513jm(this.f31368a, attributeSet, 0);
            }
            return null;
        }
    }

    private C12596bm(ContextThemeWrapper contextThemeWrapper, C12397am amVar) {
        super(contextThemeWrapper);
        this.f31367b = amVar;
        mo66094b().mo65805c().mo69397c();
    }

    /* renamed from: a */
    public LayoutInflater.Factory2 mo66093a() {
        return new C12597a(this);
    }

    /* renamed from: b */
    public C12397am mo66094b() {
        return this.f31367b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12596bm(android.view.ContextThemeWrapper r4, com.yandex.mobile.ads.impl.C13429ip r5) {
        /*
            r3 = this;
            java.lang.String r0 = "baseContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.yandex.mobile.ads.impl.hu$a r0 = com.yandex.mobile.ads.impl.C13345hu.f34556b
            com.yandex.mobile.ads.impl.hu r0 = r0.mo67633a(r4)
            com.yandex.mobile.ads.impl.ku r0 = r0.mo67632c()
            com.yandex.mobile.ads.impl.dj r0 = (com.yandex.mobile.ads.impl.C12893dj) r0
            com.yandex.mobile.ads.impl.am$a r0 = r0.mo66591b()
            com.yandex.mobile.ads.impl.am$a r0 = r0.mo65818a((android.view.ContextThemeWrapper) r4)
            com.yandex.mobile.ads.impl.am$a r5 = r0.mo65819a((com.yandex.mobile.ads.impl.C13429ip) r5)
            com.yandex.mobile.ads.impl.pq r0 = new com.yandex.mobile.ads.impl.pq
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.<init>(r1)
            com.yandex.mobile.ads.impl.am$a r5 = r5.mo65820a((com.yandex.mobile.ads.impl.C14305pq) r0)
            com.yandex.mobile.ads.impl.am r5 = r5.mo65821a()
            java.lang.String r0 = "DivKit.getInstance(baseC…()))\n            .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r3.<init>((android.view.ContextThemeWrapper) r4, (com.yandex.mobile.ads.impl.C12397am) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12596bm.<init>(android.view.ContextThemeWrapper, com.yandex.mobile.ads.impl.ip):void");
    }
}
